package com.facebook.react.fabric.mounting;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.jsi.EventEmitterWrapper;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.yoga.YogaMeasureMode;
import java.util.concurrent.ConcurrentHashMap;

public class MountingManager {
    public final RootViewManager mRootViewManager = new RootViewManager();
    public final ConcurrentHashMap<Integer, ViewState> mTagToViewState = new ConcurrentHashMap<>();
    public final ViewManagerRegistry mViewManagerRegistry;
    public final ContextBasedViewPool mViewPool;

    public MountingManager(ViewManagerRegistry viewManagerRegistry) {
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mViewPool = new ContextBasedViewPool(viewManagerRegistry);
    }

    @UiThread
    private void dropView(View view) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        ViewState viewState = getViewState(id);
        ViewManager viewManager = viewState.mViewManager;
        if (!viewState.mIsRoot && viewManager != null) {
            viewManager.onDropViewInstance(view);
        }
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager<ViewGroup> viewGroupManager = getViewGroupManager(viewState);
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (this.mTagToViewState.get(Integer.valueOf(childAt.getId())) != null) {
                    dropView(childAt);
                }
                viewGroupManager.removeViewAt(viewGroup, childCount);
            }
        }
        this.mTagToViewState.remove(Integer.valueOf(id));
        this.mViewPool.returnToPool((ThemedReactContext) view.getContext(), ((ViewManager) Assertions.assertNotNull(viewManager)).getName(), view);
    }

    public static ViewGroupManager<ViewGroup> getViewGroupManager(ViewState viewState) {
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            return (ViewGroupManager) viewManager;
        }
        throw new IllegalStateException("Unable to find ViewManager");
    }

    private ViewState getViewState(int i) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i));
        if (viewState != null) {
            return viewState;
        }
        throw new IllegalStateException("Unable to find viewState for tag " + i);
    }

    @UiThread
    public void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout) {
        if (sizeMonitoringFrameLayout.getId() == -1) {
            this.mTagToViewState.put(Integer.valueOf(i), new ViewState(i, sizeMonitoringFrameLayout, this.mRootViewManager, true));
            sizeMonitoringFrameLayout.setId(i);
            return;
        }
        throw new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
    }

    @UiThread
    public void addViewAt(int i, int i2, int i3) {
        UiThreadUtil.assertOnUiThread();
        ViewState viewState = getViewState(i);
        ViewGroup viewGroup = (ViewGroup) viewState.mView;
        View view = getViewState(i2).mView;
        if (view != null) {
            getViewGroupManager(viewState).addView(viewGroup, view, i3);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag " + i2);
    }

    @UiThread
    public void createView(ThemedReactContext themedReactContext, String str, int i, boolean z) {
        ViewManager viewManager;
        View view;
        UiThreadUtil.assertOnUiThread();
        if (!z) {
            viewManager = this.mViewManagerRegistry.get(str);
            view = this.mViewPool.getOrCreateView(str, themedReactContext);
            view.setId(i);
        } else {
            view = null;
            viewManager = null;
        }
        this.mTagToViewState.put(Integer.valueOf(i), new ViewState(i, view, viewManager));
    }

    @UiThread
    public void deleteView(int i) {
        UiThreadUtil.assertOnUiThread();
        View view = getViewState(i).mView;
        if (view != null) {
            dropView(view);
        } else {
            this.mTagToViewState.remove(Integer.valueOf(i));
        }
    }

    @Nullable
    @AnyThread
    public EventEmitterWrapper getEventEmitter(int i) {
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i));
        if (viewState == null) {
            return null;
        }
        return viewState.mEventEmitter;
    }

    @AnyThread
    public long measure(ReactContext reactContext, String str, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return this.mViewManagerRegistry.get(str).measure(reactContext, readableNativeMap, readableNativeMap2, f, yogaMeasureMode, f2, yogaMeasureMode2);
    }

    @UiThread
    public void preallocateView(ThemedReactContext themedReactContext, String str) {
        this.mViewPool.createView(themedReactContext, str);
    }

    public void receiveCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        ViewState viewState = getViewState(i);
        ViewManager viewManager = viewState.mViewManager;
        if (viewManager != null) {
            View view = viewState.mView;
            if (view != null) {
                viewManager.receiveCommand(view, i2, readableArray);
                return;
            }
            throw new IllegalStateException("Unable to find viewState view for tag " + i);
        }
        throw new IllegalStateException("Unable to find viewState manager for tag " + i);
    }

    @UiThread
    public void removeRootView(int i) {
        UiThreadUtil.assertOnUiThread();
        ViewState viewState = this.mTagToViewState.get(Integer.valueOf(i));
        if (viewState == null || !viewState.mIsRoot) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
        }
        View view = viewState.mView;
        if (view != null) {
            dropView(view);
        }
    }

    @UiThread
    public void removeViewAt(int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        ViewState viewState = getViewState(i);
        ViewGroup viewGroup = (ViewGroup) viewState.mView;
        if (viewGroup != null) {
            getViewGroupManager(viewState).removeViewAt(viewGroup, i2);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag " + i);
    }

    @UiThread
    public void updateEventEmitter(int i, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        getViewState(i).mEventEmitter = eventEmitterWrapper;
    }

    @UiThread
    public void updateLayout(int i, int i2, int i3, int i4, int i5) {
        UiThreadUtil.assertOnUiThread();
        ViewState viewState = getViewState(i);
        if (!viewState.mIsRoot) {
            View view = viewState.mView;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                ViewParent parent = view.getParent();
                if (parent instanceof RootView) {
                    parent.requestLayout();
                }
                view.layout(i2, i3, i4 + i2, i5 + i3);
                return;
            }
            throw new IllegalStateException("Unable to find View for tag: " + i);
        }
    }

    @UiThread
    public void updateLocalData(int i, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        ViewState viewState = getViewState(i);
        if (viewState.mCurrentProps == null) {
            throw new IllegalStateException("Can not update local data to view without props: " + i);
        } else if (viewState.mCurrentLocalData == null || !readableMap.hasKey("hash") || viewState.mCurrentLocalData.getDouble("hash") != readableMap.getDouble("hash") || !viewState.mCurrentLocalData.toString().equals(readableMap.toString())) {
            viewState.mCurrentLocalData = readableMap;
            ViewManager viewManager = viewState.mViewManager;
            if (viewManager != null) {
                Object updateLocalData = viewManager.updateLocalData(viewState.mView, viewState.mCurrentProps, new ReactStylesDiffMap(readableMap));
                if (updateLocalData != null) {
                    viewManager.updateExtraData(viewState.mView, updateLocalData);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i);
        }
    }

    @UiThread
    public void updateProps(int i, ReadableMap readableMap) {
        if (readableMap != null) {
            UiThreadUtil.assertOnUiThread();
            ViewState viewState = getViewState(i);
            viewState.mCurrentProps = new ReactStylesDiffMap(readableMap);
            View view = viewState.mView;
            if (view != null) {
                ((ViewManager) Assertions.assertNotNull(viewState.mViewManager)).updateProperties(view, viewState.mCurrentProps);
                return;
            }
            throw new IllegalStateException("Unable to find view for tag " + i);
        }
    }

    public static class ViewState {
        public ReadableMap mCurrentLocalData;
        public ReactStylesDiffMap mCurrentProps;
        public EventEmitterWrapper mEventEmitter;
        public final boolean mIsRoot;
        public final int mReactTag;
        @Nullable
        public final View mView;
        @Nullable
        public final ViewManager mViewManager;

        public ViewState(int i, @Nullable View view, @Nullable ViewManager viewManager) {
            this(i, view, viewManager, false);
        }

        public ViewState(int i, @Nullable View view, ViewManager viewManager, boolean z) {
            this.mReactTag = i;
            this.mView = view;
            this.mIsRoot = z;
            this.mViewManager = viewManager;
        }
    }
}
