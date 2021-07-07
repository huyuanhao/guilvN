package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.util.ArrayMap;
import com.facebook.common.logging.FLog;
import com.facebook.debug.holder.PrinterHolder;
import com.facebook.debug.tags.ReactDebugOverlayTags;
import com.facebook.react.animation.Animation;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.common.MeasureSpecProvider;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = UIManagerModule.NAME)
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    public static final boolean DEBUG = PrinterHolder.getPrinter().shouldDisplayLogMessage(ReactDebugOverlayTags.UI_MANAGER);
    public static final String NAME = "UIManager";
    public int mBatchId;
    public final Map<String, Object> mCustomDirectEvents;
    public final EventDispatcher mEventDispatcher;
    public final List<UIManagerModuleListener> mListeners;
    public final MemoryTrimCallback mMemoryTrimCallback;
    public final Map<String, Object> mModuleConstants;
    public final UIImplementation mUIImplementation;
    @Nullable
    public Map<String, WritableMap> mViewManagerConstantsCache;
    public volatile int mViewManagerConstantsCacheSize;
    public final ViewManagerRegistry mViewManagerRegistry;

    public interface CustomEventNamesResolver {
        @Nullable
        String resolveCustomEventName(String str);
    }

    public class MemoryTrimCallback implements ComponentCallbacks2 {
        public MemoryTrimCallback() {
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i >= 60) {
                YogaNodePool.get().clear();
            }
        }
    }

    public interface ViewManagerResolver {
        @Nullable
        ViewManager getViewManager(String str);

        List<String> getViewManagerNames();
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, int i) {
        this(reactApplicationContext, viewManagerResolver, new UIImplementationProvider(), i);
    }

    @Nullable
    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager resolveViewManager = str != null ? this.mUIImplementation.resolveViewManager(str) : null;
        if (resolveViewManager == null) {
            return null;
        }
        SystraceMessage.beginSection(0, "UIManagerModule.getConstantsForViewManager").arg("ViewManager", resolveViewManager.getName()).arg("Lazy", (Object) true).flush();
        try {
            Map<String, Object> createConstantsForViewManager = UIManagerModuleConstantsHelper.createConstantsForViewManager(resolveViewManager, null, null, null, this.mCustomDirectEvents);
            if (createConstantsForViewManager != null) {
                return Arguments.makeNativeMap(createConstantsForViewManager);
            }
            SystraceMessage.endSection(0).flush();
            return null;
        } finally {
            SystraceMessage.endSection(0).flush();
        }
    }

    public static Map<String, Object> createConstants(ViewManagerResolver viewManagerResolver) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        SystraceMessage.beginSection(0, "CreateUIManagerConstants").arg("Lazy", (Object) true).flush();
        try {
            return UIManagerModuleConstantsHelper.createConstants(viewManagerResolver);
        } finally {
            Systrace.endSection(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public void addAnimation(int i, int i2, Callback callback) {
        this.mUIImplementation.addAnimation(i, i2, callback);
    }

    public <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.addUIBlock(uIBlock);
    }

    public void addUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.add(uIManagerModuleListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.clearJSResponder();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.configureNextLayoutAnimation(readableMap, callback, callback2);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            FLog.m861d(ReactConstants.TAG, str2);
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.UI_MANAGER, str2);
        }
        this.mUIImplementation.createView(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.dismissPopupMenu();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, int i2, @Nullable ReadableArray readableArray) {
        UIManagerHelper.getUIManager(getReactApplicationContext(), ViewUtil.getUIManagerType(i)).dispatchCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.findSubviewIn(i, (float) Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), (float) Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @Nullable
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return writableMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    public CustomEventNamesResolver getDirectEventNamesResolver() {
        return new CustomEventNamesResolver() {
            /* class com.facebook.react.uimanager.UIManagerModule.C08431 */

            @Override // com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver
            @Nullable
            public String resolveCustomEventName(String str) {
                Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
                return map != null ? (String) map.get("registrationName") : str;
            }
        };
    }

    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.getProfiledBatchPerfCounters();
    }

    public UIImplementation getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public ViewManagerRegistry getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.bridge.JSIModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.registerEventEmitter(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        ReactShadowNode resolveShadowNode = this.mUIImplementation.resolveShadowNode(i);
        if (resolveShadowNode == null) {
            FLog.m913w(ReactConstants.TAG, "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
            return;
        }
        resolveShadowNode.dirty();
        this.mUIImplementation.dispatchViewUpdates(-1);
    }

    @ReactMethod
    public void manageChildren(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            FLog.m861d(ReactConstants.TAG, str);
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.UI_MANAGER, str);
        }
        this.mUIImplementation.manageChildren(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.measure(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.measureInWindow(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayout(i, i2, callback, callback2);
    }

    @ReactMethod
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayoutRelativeToParent(i, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        SystraceMessage.beginSection(0, "onBatchCompleteUI").arg("BatchId", i).flush();
        for (UIManagerModuleListener uIManagerModuleListener : this.mListeners) {
            uIManagerModuleListener.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.dispatchViewUpdates(i);
        } finally {
            Systrace.endSection(0);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.onCatalystInstanceDestroyed();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        YogaNodePool.get().clear();
        ViewManagerPropertyUpdater.clear();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.onHostDestroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.onHostResume();
    }

    @ReactMethod
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    @Deprecated
    public void preComputeConstantsForViewManager(List<String> list) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str);
            if (computeConstantsForViewManager != null) {
                arrayMap.put(str, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(arrayMap);
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.prependUIBlock(uIBlock);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.profileNextBatch();
    }

    public void registerAnimation(Animation animation) {
        this.mUIImplementation.registerAnimation(animation);
    }

    public void removeAnimation(int i, int i2) {
        this.mUIImplementation.removeAnimation(i, i2);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.removeRootView(i);
    }

    @ReactMethod
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.removeSubviewsFromContainerWithID(i);
    }

    public void removeUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.remove(uIManagerModuleListener);
    }

    @ReactMethod
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.replaceExistingNonRootView(i, i2);
    }

    public int resolveRootTagFromReactTag(int i) {
        return ViewUtil.isRootTag(i) ? i : this.mUIImplementation.resolveRootTagFromReactTag(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        this.mUIImplementation.sendAccessibilityEvent(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i + ", children: " + readableArray;
            FLog.m861d(ReactConstants.TAG, str);
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.UI_MANAGER, str);
        }
        this.mUIImplementation.setChildren(i, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.setJSResponder(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.setLayoutAnimationEnabledExperimental(z);
    }

    public void setViewHierarchyUpdateDebugListener(@Nullable NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mUIImplementation.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(final int i, final Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) {
            /* class com.facebook.react.uimanager.UIManagerModule.C08463 */

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.setViewLocalData(i, obj);
            }
        });
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.showPopupMenu(i, readableArray, callback, callback2);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateNodeSize(i, i2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(final int i, final int i2, final int i3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) {
            /* class com.facebook.react.uimanager.UIManagerModule.C08474 */

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.updateRootView(i, i2, i3);
                UIManagerModule.this.mUIImplementation.dispatchViewUpdates(-1);
            }
        });
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            FLog.m861d(ReactConstants.TAG, str2);
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.UI_MANAGER, str2);
        }
        this.mUIImplementation.updateView(i, str, readableMap);
    }

    @ReactMethod
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.viewIsDescendantOf(i, i2, callback);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new UIImplementationProvider(), i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T extends com.facebook.react.uimanager.common.SizeMonitoringFrameLayout & com.facebook.react.uimanager.common.MeasureSpecProvider */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends SizeMonitoringFrameLayout & MeasureSpecProvider> int addRootView(T t, WritableMap writableMap, @Nullable String str) {
        Systrace.beginSection(0, "UIManagerModule.addRootView");
        final int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        this.mUIImplementation.registerRootView(t, nextRootViewTag, new ThemedReactContext(reactApplicationContext, t.getContext()));
        t.setOnSizeChangedListener(new SizeMonitoringFrameLayout.OnSizeChangedListener() {
            /* class com.facebook.react.uimanager.UIManagerModule.C08442 */

            @Override // com.facebook.react.uimanager.common.SizeMonitoringFrameLayout.OnSizeChangedListener
            public void onSizeChanged(final int i, final int i2, int i3, int i4) {
                ReactApplicationContext reactApplicationContext = reactApplicationContext;
                reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) {
                    /* class com.facebook.react.uimanager.UIManagerModule.C08442.C08451 */

                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        C08442 r0 = C08442.this;
                        UIManagerModule.this.updateNodeSize(nextRootViewTag, i, i2);
                    }
                });
            }
        });
        Systrace.endSection(0);
        return nextRootViewTag;
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, UIImplementationProvider uIImplementationProvider, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback();
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mEventDispatcher = new EventDispatcher(reactApplicationContext);
        this.mModuleConstants = createConstants(viewManagerResolver);
        this.mCustomDirectEvents = UIManagerModuleConstants.getDirectEventTypeConstants();
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(viewManagerResolver);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = uIImplementationProvider.createUIImplementation(reactApplicationContext, viewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public static Map<String, Object> createConstants(List<ViewManager> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        SystraceMessage.beginSection(0, "CreateUIManagerConstants").arg("Lazy", (Object) false).flush();
        try {
            return UIManagerModuleConstantsHelper.createConstants(list, map, map2);
        } finally {
            Systrace.endSection(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, UIImplementationProvider uIImplementationProvider, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback();
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        this.mEventDispatcher = new EventDispatcher(reactApplicationContext);
        HashMap newHashMap = MapBuilder.newHashMap();
        this.mCustomDirectEvents = newHashMap;
        this.mModuleConstants = createConstants(list, null, newHashMap);
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(list);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = uIImplementationProvider.createUIImplementation(reactApplicationContext, viewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
