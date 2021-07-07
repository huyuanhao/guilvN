package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.fabric.jsi.Binding;
import com.facebook.react.fabric.jsi.EventBeatManager;
import com.facebook.react.fabric.jsi.EventEmitterWrapper;
import com.facebook.react.fabric.jsi.FabricSoLoader;
import com.facebook.react.fabric.mounting.LayoutMetricsConversions;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.mountitems.BatchMountItem;
import com.facebook.react.fabric.mounting.mountitems.CreateMountItem;
import com.facebook.react.fabric.mounting.mountitems.DeleteMountItem;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.InsertMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.fabric.mounting.mountitems.PreAllocateViewMountItem;
import com.facebook.react.fabric.mounting.mountitems.RemoveMountItem;
import com.facebook.react.fabric.mounting.mountitems.UpdateEventEmitterMountItem;
import com.facebook.react.fabric.mounting.mountitems.UpdateLayoutMountItem;
import com.facebook.react.fabric.mounting.mountitems.UpdateLocalDataMountItem;
import com.facebook.react.fabric.mounting.mountitems.UpdatePropsMountItem;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ReactRootViewTagGenerator;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.systrace.Systrace;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressLint({"MissingNativeLoadLibrary"})
public class FabricUIManager implements UIManager, LifecycleEventListener {
    public static final String TAG = "FabricUIManager";
    public static final Map<String, String> sComponentNames = new HashMap();
    public long mBatchedExecutionTime = 0;
    public Binding mBinding;
    public long mCommitStartTime = 0;
    @ThreadConfined(ThreadConfined.f969UI)
    public final DispatchUIFrameCallback mDispatchUIFrameCallback;
    public long mDispatchViewUpdatesTime = 0;
    public final EventBeatManager mEventBeatManager;
    public final EventDispatcher mEventDispatcher;
    public long mFinishTransactionTime = 0;
    @ThreadConfined(ThreadConfined.f969UI)
    public boolean mIsMountingEnabled = true;
    public long mLayoutTime = 0;
    @GuardedBy("mMountItemsLock")
    public List<MountItem> mMountItems = new ArrayList();
    public final Object mMountItemsLock = new Object();
    public final MountingManager mMountingManager;
    public long mNonBatchedExecutionTime = 0;
    @GuardedBy("mPreMountItemsLock")
    public List<MountItem> mPreMountItems = new ArrayList();
    public final Object mPreMountItemsLock = new Object();
    public final ReactApplicationContext mReactApplicationContext;
    public final ConcurrentHashMap<Integer, ThemedReactContext> mReactContextForRootTag = new ConcurrentHashMap<>();
    public long mRunStartTime = 0;

    public class DispatchUIFrameCallback extends GuardedFrameCallback {
        @Override // com.facebook.react.fabric.GuardedFrameCallback
        public void doFrameGuarded(long j) {
            if (!FabricUIManager.this.mIsMountingEnabled) {
                FLog.m913w(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            try {
                FabricUIManager.this.flushMountItems();
                ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, FabricUIManager.this.mDispatchUIFrameCallback);
            } catch (Exception e) {
                FLog.m890i(ReactConstants.TAG, "Exception thrown when executing UIFrameGuarded", (Throwable) e);
                FabricUIManager.this.mIsMountingEnabled = false;
                throw e;
            } catch (Throwable th) {
                ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, FabricUIManager.this.mDispatchUIFrameCallback);
                throw th;
            }
        }

        public DispatchUIFrameCallback(ReactContext reactContext) {
            super(reactContext);
        }
    }

    static {
        FabricSoLoader.staticInit();
        sComponentNames.put("View", "RCTView");
        sComponentNames.put("Image", ReactImageManager.REACT_CLASS);
        sComponentNames.put("ScrollView", ReactScrollViewManager.REACT_CLASS);
        sComponentNames.put("ReactPerformanceLoggerFlag", "ReactPerformanceLoggerFlag");
        sComponentNames.put("Paragraph", ReactTextViewManager.REACT_CLASS);
        sComponentNames.put("Text", "RCText");
        sComponentNames.put("RawText", ReactRawTextManager.REACT_CLASS);
        sComponentNames.put("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS);
        sComponentNames.put("ShimmeringView", "RKShimmeringView");
        sComponentNames.put("TemplateView", "RCTTemplateView");
    }

    public FabricUIManager(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, EventBeatManager eventBeatManager) {
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        this.mMountingManager = new MountingManager(viewManagerRegistry);
        this.mEventDispatcher = eventDispatcher;
        this.mEventBeatManager = eventBeatManager;
        this.mReactApplicationContext.addLifecycleEventListener(this);
    }

    @DoNotStrip
    private MountItem createBatchMountItem(MountItem[] mountItemArr, int i) {
        return new BatchMountItem(mountItemArr, i);
    }

    @DoNotStrip
    private MountItem createMountItem(String str, int i, int i2, boolean z) {
        String str2 = sComponentNames.get(str);
        if (str2 != null) {
            ThemedReactContext themedReactContext = this.mReactContextForRootTag.get(Integer.valueOf(i));
            if (themedReactContext != null) {
                return new CreateMountItem(themedReactContext, str2, i2, z);
            }
            throw new IllegalArgumentException("Unable to find ReactContext for root: " + i);
        }
        throw new IllegalArgumentException("Unable to find component with name " + str);
    }

    @DoNotStrip
    private MountItem deleteMountItem(int i) {
        return new DeleteMountItem(i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @UiThread
    private void flushMountItems() {
        List<MountItem> list;
        List<MountItem> list2;
        if (!this.mIsMountingEnabled) {
            FLog.m913w(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        try {
            synchronized (this.mPreMountItemsLock) {
                list = this.mPreMountItems;
                this.mPreMountItems = new ArrayList();
            }
            this.mRunStartTime = SystemClock.uptimeMillis();
            synchronized (this.mMountItemsLock) {
                list2 = this.mMountItems;
                this.mMountItems = new ArrayList();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            Systrace.beginSection(0, "FabricUIManager::premountViews (" + list.size() + " batches)");
            for (MountItem mountItem : list) {
                mountItem.execute(this.mMountingManager);
            }
            this.mNonBatchedExecutionTime = SystemClock.uptimeMillis() - uptimeMillis;
            Systrace.endSection(0);
            Systrace.beginSection(0, "FabricUIManager::mountViews (" + list2.size() + " batches)");
            long uptimeMillis2 = SystemClock.uptimeMillis();
            for (MountItem mountItem2 : list2) {
                mountItem2.execute(this.mMountingManager);
            }
            this.mBatchedExecutionTime = SystemClock.uptimeMillis() - uptimeMillis2;
            Systrace.endSection(0);
        } catch (Exception e) {
            FLog.m874e(ReactConstants.TAG, "Exception thrown when executing UIFrameGuarded", e);
            this.mIsMountingEnabled = false;
            throw e;
        }
    }

    @DoNotStrip
    private MountItem insertMountItem(int i, int i2, int i3) {
        return new InsertMountItem(i, i2, i3);
    }

    @DoNotStrip
    private long measure(String str, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, int i, int i2, int i3, int i4) {
        MountingManager mountingManager = this.mMountingManager;
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        float f = (float) i;
        float f2 = (float) i2;
        float yogaSize = LayoutMetricsConversions.getYogaSize(f, f2);
        YogaMeasureMode yogaMeasureMode = LayoutMetricsConversions.getYogaMeasureMode(f, f2);
        float f3 = (float) i3;
        float f4 = (float) i4;
        return mountingManager.measure(reactApplicationContext, str, readableNativeMap, readableNativeMap2, yogaSize, yogaMeasureMode, LayoutMetricsConversions.getYogaSize(f3, f4), LayoutMetricsConversions.getYogaMeasureMode(f3, f4));
    }

    @DoNotStrip
    private void preallocateView(int i, String str) {
        if (!UiThreadUtil.isOnUiThread()) {
            synchronized (this.mPreMountItemsLock) {
                String str2 = sComponentNames.get(str);
                Assertions.assertNotNull(str2);
                this.mPreMountItems.add(new PreAllocateViewMountItem((ThemedReactContext) Assertions.assertNotNull(this.mReactContextForRootTag.get(Integer.valueOf(i))), i, str2));
            }
        }
    }

    @DoNotStrip
    private MountItem removeMountItem(int i, int i2, int i3) {
        return new RemoveMountItem(i, i2, i3);
    }

    @DoNotStrip
    private void scheduleMountItems(MountItem mountItem, long j, long j2, long j3) {
        this.mCommitStartTime = j;
        this.mLayoutTime = j2;
        this.mFinishTransactionTime = SystemClock.uptimeMillis() - j3;
        this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        synchronized (this.mMountItemsLock) {
            this.mMountItems.add(mountItem);
        }
        if (UiThreadUtil.isOnUiThread()) {
            flushMountItems();
        }
    }

    @DoNotStrip
    private MountItem updateEventEmitterMountItem(int i, Object obj) {
        return new UpdateEventEmitterMountItem(i, (EventEmitterWrapper) obj);
    }

    @DoNotStrip
    private MountItem updateLayoutMountItem(int i, int i2, int i3, int i4, int i5) {
        return new UpdateLayoutMountItem(i, i2, i3, i4, i5);
    }

    @DoNotStrip
    private MountItem updateLocalDataMountItem(int i, ReadableNativeMap readableNativeMap) {
        return new UpdateLocalDataMountItem(i, readableNativeMap);
    }

    @DoNotStrip
    private MountItem updatePropsMountItem(int i, ReadableNativeMap readableNativeMap) {
        return new UpdatePropsMountItem(i, readableNativeMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T extends com.facebook.react.uimanager.common.SizeMonitoringFrameLayout & com.facebook.react.uimanager.common.MeasureSpecProvider */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> int addRootView(T t, WritableMap writableMap, @Nullable String str) {
        int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        ThemedReactContext themedReactContext = new ThemedReactContext(this.mReactApplicationContext, t.getContext());
        this.mMountingManager.addRootView(nextRootViewTag, t);
        this.mReactContextForRootTag.put(Integer.valueOf(nextRootViewTag), themedReactContext);
        this.mBinding.startSurface(nextRootViewTag, (NativeMap) writableMap);
        T t2 = t;
        updateRootLayoutSpecs(nextRootViewTag, t2.getWidthMeasureSpec(), t2.getHeightMeasureSpec());
        if (str != null) {
            this.mBinding.renderTemplateToSurface(nextRootViewTag, str);
        }
        return nextRootViewTag;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void clearJSResponder() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        synchronized (this.mMountItemsLock) {
            this.mMountItems.add(new DispatchCommandMountItem(i, i2, readableArray));
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        hashMap.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        hashMap.put("RunStartTime", Long.valueOf(this.mRunStartTime));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.mBatchedExecutionTime));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.mNonBatchedExecutionTime));
        hashMap.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
        this.mEventDispatcher.registerEventEmitter(2, new FabricEventEmitter(this));
        this.mEventDispatcher.addBatchEventDispatchedListener(this.mEventBeatManager);
    }

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        this.mEventDispatcher.removeBatchEventDispatchedListener(this.mEventBeatManager);
        this.mEventDispatcher.unregisterEventEmitter(2);
        this.mBinding.unregister();
        ViewManagerPropertyUpdater.clear();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    @DoNotStrip
    public void onRequestEventBeat() {
        this.mEventDispatcher.dispatchAllEvents();
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    public void receiveEvent(int i, String str, @Nullable WritableMap writableMap) {
        EventEmitterWrapper eventEmitter = this.mMountingManager.getEventEmitter(i);
        if (eventEmitter == null) {
            String str2 = TAG;
            FLog.m861d(str2, "Unable to invoke event: " + str + " for reactTag: " + i);
            return;
        }
        eventEmitter.invoke(str, writableMap);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeRootView(int i) {
        this.mMountingManager.removeRootView(i);
        this.mReactContextForRootTag.remove(Integer.valueOf(i));
    }

    public void setBinding(Binding binding) {
        this.mBinding = binding;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void setJSResponder(int i, boolean z) {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(final int i, final int i2, final int i3) {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        reactApplicationContext.runOnJSQueueThread(new GuardedRunnable(reactApplicationContext) {
            /* class com.facebook.react.fabric.FabricUIManager.C07361 */

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                FabricUIManager.this.mBinding.setConstraints(i, LayoutMetricsConversions.getMinSize(i2), LayoutMetricsConversions.getMaxSize(i2), LayoutMetricsConversions.getMinSize(i3), LayoutMetricsConversions.getMaxSize(i3));
            }
        });
    }
}
