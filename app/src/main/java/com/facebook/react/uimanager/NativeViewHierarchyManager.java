package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.C0587R;
import com.facebook.react.animation.Animation;
import com.facebook.react.animation.AnimationListener;
import com.facebook.react.animation.AnimationRegistry;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationController;
import com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.learnium.RNDeviceInfo.SystemBarTintManager;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.vivo.push.PushClientConstants;
import com.xiaomi.mipush.sdk.Constants;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class NativeViewHierarchyManager {
    public static final String TAG = "NativeViewHierarchyManager";
    public final AnimationRegistry mAnimationRegistry;
    public final JSResponderHandler mJSResponderHandler;
    public boolean mLayoutAnimationEnabled;
    public final LayoutAnimationController mLayoutAnimator;
    public PopupMenu mPopupMenu;
    public final SparseBooleanArray mRootTags;
    public final RootViewManager mRootViewManager;
    public final SparseArray<ViewManager> mTagsToViewManagers;
    public final SparseArray<View> mTagsToViews;
    public final ViewManagerRegistry mViewManagers;

    public static class PopupMenuCallbackHandler implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {
        public boolean mConsumed;
        public final Callback mSuccess;

        public void onDismiss(PopupMenu popupMenu) {
            if (!this.mConsumed) {
                this.mSuccess.invoke("dismissed");
                this.mConsumed = true;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.mConsumed) {
                return false;
            }
            this.mSuccess.invoke(UIManagerModuleConstants.ACTION_ITEM_SELECTED, Integer.valueOf(menuItem.getOrder()));
            this.mConsumed = true;
            return true;
        }

        public PopupMenuCallbackHandler(Callback callback) {
            this.mConsumed = false;
            this.mSuccess = callback;
        }
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry) {
        this(viewManagerRegistry, new RootViewManager());
    }

    private boolean arrayContains(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 >= viewGroupManager.getChildCount(viewGroup) || i2 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + Constants.ACCEPT_TIME_SEPARATOR_SP);
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(iArr[i6] + Constants.ACCEPT_TIME_SEPARATOR_SP);
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (viewAtIndexArr != null) {
            sb.append("  viewsToAdd(" + viewAtIndexArr.length + "): [\n");
            for (int i7 = 0; i7 < viewAtIndexArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= viewAtIndexArr.length || i8 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append("[" + viewAtIndexArr[i9].mIndex + Constants.ACCEPT_TIME_SEPARATOR_SP + viewAtIndexArr[i9].mTag + "],");
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        sb.append("\n");
                    } else {
                        sb.append(iArr2[i12] + Constants.ACCEPT_TIME_SEPARATOR_SP);
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    public static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        ViewAtIndex[] viewAtIndexArr = new ViewAtIndex[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            viewAtIndexArr[i] = new ViewAtIndex(readableArray.getInt(i), i);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, viewAtIndexArr, null);
    }

    private ThemedReactContext getReactContextForView(int i) {
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            return (ThemedReactContext) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public synchronized void addRootView(int i, SizeMonitoringFrameLayout sizeMonitoringFrameLayout, ThemedReactContext themedReactContext) {
        addRootViewGroup(i, sizeMonitoringFrameLayout, themedReactContext);
    }

    public final synchronized void addRootViewGroup(int i, ViewGroup viewGroup, ThemedReactContext themedReactContext) {
        if (viewGroup.getId() != -1) {
            String str = TAG;
            FLog.m873e(str, "Trying to add a root view with an explicit id (" + viewGroup.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.mTagsToViews.put(i, viewGroup);
        this.mTagsToViewManagers.put(i, this.mRootViewManager);
        this.mRootTags.put(i, true);
        viewGroup.setId(i);
    }

    public void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    public void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    public void configureLayoutAnimation(ReadableMap readableMap) {
        this.mLayoutAnimator.initializeFromConfig(readableMap);
    }

    public synchronized void createView(ThemedReactContext themedReactContext, int i, String str, @Nullable ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        SystraceMessage.beginSection(0, "NativeViewHierarchyManager_createView").arg(CommonNetImpl.TAG, i).arg(PushClientConstants.TAG_CLASS_NAME, str).flush();
        try {
            ViewManager viewManager = this.mViewManagers.get(str);
            View createView = viewManager.createView(themedReactContext, this.mJSResponderHandler);
            this.mTagsToViews.put(i, createView);
            this.mTagsToViewManagers.put(i, viewManager);
            createView.setId(i);
            if (reactStylesDiffMap != null) {
                viewManager.updateProperties(createView, reactStylesDiffMap);
            }
        } finally {
            Systrace.endSection(0);
        }
    }

    public void dismissPopupMenu() {
        PopupMenu popupMenu = this.mPopupMenu;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    public synchronized void dispatchCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            resolveViewManager(i).receiveCommand(view, i2, readableArray);
        } else {
            throw new IllegalViewOperationException("Trying to send command to a non-existing view with tag " + i);
        }
    }

    public synchronized void dropView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (this.mTagsToViewManagers.get(view.getId()) != null) {
            if (!this.mRootTags.get(view.getId())) {
                resolveViewManager(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        FLog.m873e(TAG, "Unable to drop null child view");
                    } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                        dropView(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.mTagsToViews.remove(view.getId());
            this.mTagsToViewManagers.remove(view.getId());
        }
    }

    public synchronized int findTargetTagForTouch(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.mTagsToViews.get(i);
        if (view != null) {
        } else {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return TouchTargetHelper.findTargetTagForTouch(f, f2, (ViewGroup) view);
    }

    public AnimationRegistry getAnimationRegistry() {
        return this.mAnimationRegistry;
    }

    @Nullable
    public long getInstanceHandle(int i) {
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            Long l = (Long) view.getTag(C0587R.C0590id.view_tag_instance_handle);
            if (l != null) {
                return l.longValue();
            }
            throw new IllegalViewOperationException("Unable to find instanceHandle for tag: " + i);
        }
        throw new IllegalViewOperationException("Unable to find view for tag: " + i);
    }

    public synchronized void manageChildren(int i, @Nullable int[] iArr, @Nullable ViewAtIndex[] viewAtIndexArr, @Nullable int[] iArr2) {
        UiThreadUtil.assertOnUiThread();
        final ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
        final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        if (viewGroup != null) {
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr != null) {
                int length = iArr.length - 1;
                while (length >= 0) {
                    int i2 = iArr[length];
                    if (i2 < 0) {
                        throw new IllegalViewOperationException("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    } else if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                        if (!this.mRootTags.get(i) || viewGroupManager.getChildCount(viewGroup) != 0) {
                            throw new IllegalViewOperationException("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                        }
                        return;
                    } else if (i2 < childCount) {
                        View childAt = viewGroupManager.getChildAt(viewGroup, i2);
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt(viewGroup, i2);
                        }
                        length--;
                        childCount = i2;
                    } else {
                        throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                }
            }
            if (viewAtIndexArr != null) {
                for (ViewAtIndex viewAtIndex : viewAtIndexArr) {
                    View view = this.mTagsToViews.get(viewAtIndex.mTag);
                    if (view != null) {
                        viewGroupManager.addView(viewGroup, view, viewAtIndex.mIndex);
                    } else {
                        throw new IllegalViewOperationException("Trying to add unknown view tag: " + viewAtIndex.mTag + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                }
            }
            if (iArr2 != null) {
                for (int i3 : iArr2) {
                    final View view2 = this.mTagsToViews.get(i3);
                    if (view2 != null) {
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(view2)) {
                            dropView(view2);
                        } else {
                            this.mLayoutAnimator.deleteView(view2, new LayoutAnimationListener() {
                                /* class com.facebook.react.uimanager.NativeViewHierarchyManager.C08391 */

                                @Override // com.facebook.react.uimanager.layoutanimation.LayoutAnimationListener
                                public void onAnimationEnd() {
                                    viewGroupManager.removeView(viewGroup, view2);
                                    NativeViewHierarchyManager.this.dropView(view2);
                                }
                            });
                        }
                    } else {
                        throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i3 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
                    }
                }
            }
            return;
        }
        throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, viewAtIndexArr, iArr2));
    }

    public synchronized void measure(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            View view2 = (View) RootViewUtil.getRootView(view);
            if (view2 != null) {
                view2.getLocationInWindow(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                view.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i2;
                iArr[1] = iArr[1] - i3;
                iArr[2] = view.getWidth();
                iArr[3] = view.getHeight();
            } else {
                throw new NoSuchNativeViewException("Native view " + i + " is no longer on screen");
            }
        } else {
            throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
        }
    }

    public synchronized void measureInWindow(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Resources resources = view.getContext().getResources();
            int identifier = resources.getIdentifier(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME, "dimen", "android");
            if (identifier > 0) {
                iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
            }
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            throw new NoSuchNativeViewException("No native view for " + i + " currently exists");
        }
    }

    public synchronized void removeRootView(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(i)) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
        }
        dropView(this.mTagsToViews.get(i));
        this.mRootTags.delete(i);
    }

    public final synchronized View resolveView(int i) {
        View view;
        view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i + " could not be found");
        }
        return viewManager;
    }

    public void sendAccessibilityEvent(int i, int i2) {
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            AccessibilityHelper.sendAccessibilityEvent(view, i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public synchronized void setChildren(int i, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
        ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            View view = this.mTagsToViews.get(readableArray.getInt(i2));
            if (view != null) {
                viewGroupManager.addView(viewGroup, view, i2);
            } else {
                throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i2) + "\n detail: " + constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
            }
        }
    }

    public synchronized void setJSResponder(int i, int i2, boolean z) {
        if (!z) {
            this.mJSResponderHandler.setJSResponder(i2, null);
            return;
        }
        View view = this.mTagsToViews.get(i);
        if (i2 == i || !(view instanceof ViewParent)) {
            if (this.mRootTags.get(i)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
            }
            this.mJSResponderHandler.setJSResponder(i2, view.getParent());
            return;
        }
        this.mJSResponderHandler.setJSResponder(i2, (ViewParent) view);
    }

    public void setLayoutAnimationEnabled(boolean z) {
        this.mLayoutAnimationEnabled = z;
    }

    public synchronized void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        PopupMenu popupMenu = new PopupMenu(getReactContextForView(i), view);
        this.mPopupMenu = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        PopupMenuCallbackHandler popupMenuCallbackHandler = new PopupMenuCallbackHandler(callback);
        this.mPopupMenu.setOnMenuItemClickListener(popupMenuCallbackHandler);
        this.mPopupMenu.setOnDismissListener(popupMenuCallbackHandler);
        this.mPopupMenu.show();
    }

    public synchronized void startAnimationForNativeView(int i, Animation animation, @Nullable final Callback callback) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        final int animationID = animation.getAnimationID();
        if (view != null) {
            animation.setAnimationListener(new AnimationListener() {
                /* class com.facebook.react.uimanager.NativeViewHierarchyManager.C08402 */

                @Override // com.facebook.react.animation.AnimationListener
                public void onCancel() {
                    Assertions.assertNotNull(NativeViewHierarchyManager.this.mAnimationRegistry.removeAnimation(animationID), "Animation was already removed somehow!");
                    Callback callback = callback;
                    if (callback != null) {
                        callback.invoke(false);
                    }
                }

                @Override // com.facebook.react.animation.AnimationListener
                public void onFinished() {
                    Assertions.assertNotNull(NativeViewHierarchyManager.this.mAnimationRegistry.removeAnimation(animationID), "Animation was already removed somehow!");
                    Callback callback = callback;
                    if (callback != null) {
                        callback.invoke(true);
                    }
                }
            });
            animation.start(view);
        } else {
            throw new IllegalViewOperationException("View with tag " + i + " not found");
        }
    }

    public synchronized void updateInstanceHandle(int i, long j) {
        UiThreadUtil.assertOnUiThread();
        try {
            updateInstanceHandle(resolveView(i), j);
        } catch (IllegalViewOperationException e) {
            String str = TAG;
            FLog.m874e(str, "Unable to update properties for view tag " + i, e);
        }
    }

    public synchronized void updateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        UiThreadUtil.assertOnUiThread();
        SystraceMessage.beginSection(0, "NativeViewHierarchyManager_updateLayout").arg("parentTag", i).arg(CommonNetImpl.TAG, i2).flush();
        try {
            View resolveView = resolveView(i2);
            resolveView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            ViewParent parent = resolveView.getParent();
            if (parent instanceof RootView) {
                parent.requestLayout();
            }
            if (!this.mRootTags.get(i)) {
                ViewManager viewManager = this.mTagsToViewManagers.get(i);
                if (viewManager instanceof ViewGroupManager) {
                    ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                    if (viewGroupManager != null && !viewGroupManager.needsCustomLayoutForChildren()) {
                        updateLayout(resolveView, i3, i4, i5, i6);
                    }
                } else {
                    throw new IllegalViewOperationException("Trying to use view with tag " + i + " as a parent, but its Manager doesn't extends ViewGroupManager");
                }
            } else {
                updateLayout(resolveView, i3, i4, i5, i6);
            }
        } finally {
            Systrace.endSection(0);
        }
    }

    public synchronized void updateProperties(int i, ReactStylesDiffMap reactStylesDiffMap) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager resolveViewManager = resolveViewManager(i);
            View resolveView = resolveView(i);
            if (reactStylesDiffMap != null) {
                resolveViewManager.updateProperties(resolveView, reactStylesDiffMap);
            }
        } catch (IllegalViewOperationException e) {
            String str = TAG;
            FLog.m874e(str, "Unable to update properties for view tag " + i, e);
        }
    }

    public synchronized void updateViewExtraData(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        resolveViewManager(i).updateExtraData(resolveView(i), obj);
    }

    public NativeViewHierarchyManager(ViewManagerRegistry viewManagerRegistry, RootViewManager rootViewManager) {
        this.mJSResponderHandler = new JSResponderHandler();
        this.mLayoutAnimator = new LayoutAnimationController();
        this.mAnimationRegistry = new AnimationRegistry();
        this.mViewManagers = viewManagerRegistry;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    private void updateInstanceHandle(View view, long j) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(C0587R.C0590id.view_tag_instance_handle, Long.valueOf(j));
    }

    private void updateLayout(View view, int i, int i2, int i3, int i4) {
        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(view)) {
            view.layout(i, i2, i3 + i, i4 + i2);
        } else {
            this.mLayoutAnimator.applyLayoutUpdate(view, i, i2, i3, i4);
        }
    }
}
