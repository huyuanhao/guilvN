package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.facebook.common.logging.FLog;
import com.facebook.debug.holder.PrinterHolder;
import com.facebook.debug.tags.ReactDebugOverlayTags;
import com.facebook.infer.annotation.Assertions;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.infer.annotation.ThreadSafe;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ProxyJavaScriptExecutor;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.devsupport.DevSupportManagerFactory;
import com.facebook.react.devsupport.ReactInstanceManagerDevHelper;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.UIImplementationProvider;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import com.vivo.push.PushClientConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@ThreadSafe
public class ReactInstanceManager {
    public static final String TAG = "ReactInstanceManager";
    public final Context mApplicationContext;
    public final Set<ReactRootView> mAttachedRootViews = Collections.synchronizedSet(new HashSet());
    @Nullable
    public final NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    @Nullable
    public final JSBundleLoader mBundleLoader;
    @Nullable
    public volatile Thread mCreateReactContextThread;
    @Nullable
    public Activity mCurrentActivity;
    @Nullable
    public volatile ReactContext mCurrentReactContext;
    @ThreadConfined(ThreadConfined.f969UI)
    @Nullable
    public DefaultHardwareBackBtnHandler mDefaultBackButtonImpl;
    public final DevSupportManager mDevSupportManager;
    public volatile boolean mHasStartedCreatingInitialContext = false;
    public volatile Boolean mHasStartedDestroying = false;
    @Nullable
    public final JSIModulePackage mJSIModulePackage;
    @Nullable
    public final String mJSMainModulePath;
    public final JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    public volatile LifecycleState mLifecycleState;
    public final MemoryPressureRouter mMemoryPressureRouter;
    @Nullable
    public final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public final List<ReactPackage> mPackages;
    @ThreadConfined(ThreadConfined.f969UI)
    @Nullable
    public ReactContextInitParams mPendingReactContextInitParams;
    public final Object mReactContextLock = new Object();
    public final Collection<ReactInstanceEventListener> mReactInstanceEventListeners = Collections.synchronizedSet(new HashSet());
    public final boolean mUseDeveloperSupport;
    public List<ViewManager> mViewManagers;

    public class ReactContextInitParams {
        public final JSBundleLoader mJsBundleLoader;
        public final JavaScriptExecutorFactory mJsExecutorFactory;

        public ReactContextInitParams(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            this.mJsExecutorFactory = (JavaScriptExecutorFactory) Assertions.assertNotNull(javaScriptExecutorFactory);
            this.mJsBundleLoader = (JSBundleLoader) Assertions.assertNotNull(jSBundleLoader);
        }

        public JSBundleLoader getJsBundleLoader() {
            return this.mJsBundleLoader;
        }

        public JavaScriptExecutorFactory getJsExecutorFactory() {
            return this.mJsExecutorFactory;
        }
    }

    public interface ReactInstanceEventListener {
        void onReactContextInitialized(ReactContext reactContext);
    }

    public ReactInstanceManager(Context context, @Nullable Activity activity, @Nullable DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, JavaScriptExecutorFactory javaScriptExecutorFactory, @Nullable JSBundleLoader jSBundleLoader, @Nullable String str, List<ReactPackage> list, boolean z, @Nullable NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, @Nullable UIImplementationProvider uIImplementationProvider, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, @Nullable RedBoxHandler redBoxHandler, boolean z2, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i, int i2, @Nullable JSIModulePackage jSIModulePackage, @Nullable Map<String, RequestHandler> map) {
        initializeSoLoaderIfNecessary(context);
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.mApplicationContext = context;
        this.mCurrentActivity = activity;
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        this.mBundleLoader = jSBundleLoader;
        this.mJSMainModulePath = str;
        this.mPackages = new ArrayList();
        this.mUseDeveloperSupport = z;
        Systrace.beginSection(0, "ReactInstanceManager.initDevSupportManager");
        this.mDevSupportManager = DevSupportManagerFactory.create(context, createDevHelperInterface(), this.mJSMainModulePath, z, redBoxHandler, devBundleDownloadListener, i, map);
        Systrace.endSection(0);
        this.mBridgeIdleDebugListener = notThreadSafeBridgeIdleDebugListener;
        this.mLifecycleState = lifecycleState;
        this.mMemoryPressureRouter = new MemoryPressureRouter(context);
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        synchronized (this.mPackages) {
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: Use Split Packages");
            this.mPackages.add(new CoreModulesPackage(this, new DefaultHardwareBackBtnHandler() {
                /* class com.facebook.react.ReactInstanceManager.C05921 */

                @Override // com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
                public void invokeDefaultOnBackPressed() {
                    ReactInstanceManager.this.invokeDefaultOnBackPressed();
                }
            }, uIImplementationProvider, z2, i2));
            if (this.mUseDeveloperSupport) {
                this.mPackages.add(new DebugCorePackage());
            }
            this.mPackages.addAll(list);
        }
        this.mJSIModulePackage = jSIModulePackage;
        ReactChoreographer.initialize();
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.startInspector();
        }
    }

    private void attachRootViewToInstance(final ReactRootView reactRootView) {
        WritableMap writableMap;
        Systrace.beginSection(0, "attachRootViewToInstance");
        UIManager uIManager = UIManagerHelper.getUIManager(this.mCurrentReactContext, reactRootView.getUIManagerType());
        Bundle appProperties = reactRootView.getAppProperties();
        if (appProperties == null) {
            writableMap = new WritableNativeMap();
        } else {
            writableMap = Arguments.fromBundle(appProperties);
        }
        final int addRootView = uIManager.addRootView(reactRootView, writableMap, reactRootView.getInitialUITemplate());
        reactRootView.setRootViewTag(addRootView);
        reactRootView.runApplication();
        Systrace.beginAsyncSection(0, "pre_rootView.onAttachedToReactInstance", addRootView);
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.ReactInstanceManager.RunnableC06039 */

            public void run() {
                Systrace.endAsyncSection(0, "pre_rootView.onAttachedToReactInstance", addRootView);
                reactRootView.onAttachedToReactInstance();
            }
        });
        Systrace.endSection(0);
    }

    public static ReactInstanceManagerBuilder builder() {
        return new ReactInstanceManagerBuilder();
    }

    private ReactInstanceManagerDevHelper createDevHelperInterface() {
        return new ReactInstanceManagerDevHelper() {
            /* class com.facebook.react.ReactInstanceManager.C05932 */

            @Override // com.facebook.react.devsupport.ReactInstanceManagerDevHelper
            @Nullable
            public Activity getCurrentActivity() {
                return ReactInstanceManager.this.mCurrentActivity;
            }

            @Override // com.facebook.react.devsupport.ReactInstanceManagerDevHelper
            public void onJSBundleLoadedFromServer(@Nullable NativeDeltaClient nativeDeltaClient) {
                ReactInstanceManager.this.onJSBundleLoadedFromServer(nativeDeltaClient);
            }

            @Override // com.facebook.react.devsupport.ReactInstanceManagerDevHelper
            public void onReloadWithJSDebugger(JavaJSExecutor.Factory factory) {
                ReactInstanceManager.this.onReloadWithJSDebugger(factory);
            }

            @Override // com.facebook.react.devsupport.ReactInstanceManagerDevHelper
            public void toggleElementInspector() {
                ReactInstanceManager.this.toggleElementInspector();
            }
        };
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private ReactApplicationContext createReactContext(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.mApplicationContext);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.mDevSupportManager;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(processPackages(reactApplicationContext, this.mPackages, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        Systrace.beginSection(0, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            Systrace.endSection(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            JSIModulePackage jSIModulePackage = this.mJSIModulePackage;
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.mBridgeIdleDebugListener;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (Systrace.isTracing(0)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            Systrace.beginSection(0, "runJSBundle");
            build.runJSBundle();
            Systrace.endSection(0);
            reactApplicationContext.initializeWithInstance(build);
            return reactApplicationContext;
        } catch (Throwable th) {
            Systrace.endSection(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    private void detachViewFromInstance(ReactRootView reactRootView, CatalystInstance catalystInstance) {
        UiThreadUtil.assertOnUiThread();
        if (reactRootView.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(reactRootView.getId());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(reactRootView.getId());
        }
    }

    public static void initializeSoLoaderIfNecessary(Context context) {
        SoLoader.init(context, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void invokeDefaultOnBackPressed() {
        UiThreadUtil.assertOnUiThread();
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.mDefaultBackButtonImpl;
        if (defaultHardwareBackBtnHandler != null) {
            defaultHardwareBackBtnHandler.invokeDefaultOnBackPressed();
        }
    }

    private synchronized void moveReactContextToCurrentLifecycleState() {
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            moveToResumedLifecycleState(true);
        }
    }

    private synchronized void moveToBeforeCreateLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.RESUMED) {
                currentReactContext.onHostPause();
                this.mLifecycleState = LifecycleState.BEFORE_RESUME;
            }
            if (this.mLifecycleState == LifecycleState.BEFORE_RESUME) {
                currentReactContext.onHostDestroy();
            }
        }
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void moveToBeforeResumeLifecycleState() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (this.mLifecycleState == LifecycleState.BEFORE_CREATE) {
                currentReactContext.onHostResume(this.mCurrentActivity);
                currentReactContext.onHostPause();
            } else if (this.mLifecycleState == LifecycleState.RESUMED) {
                currentReactContext.onHostPause();
            }
        }
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
    }

    private synchronized void moveToResumedLifecycleState(boolean z) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (z || this.mLifecycleState == LifecycleState.BEFORE_RESUME || this.mLifecycleState == LifecycleState.BEFORE_CREATE)) {
            currentReactContext.onHostResume(this.mCurrentActivity);
        }
        this.mLifecycleState = LifecycleState.RESUMED;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @ThreadConfined(ThreadConfined.f969UI)
    private void onJSBundleLoadedFromServer(@Nullable NativeDeltaClient nativeDeltaClient) {
        JSBundleLoader jSBundleLoader;
        if (nativeDeltaClient == null) {
            jSBundleLoader = JSBundleLoader.createCachedBundleFromNetworkLoader(this.mDevSupportManager.getSourceUrl(), this.mDevSupportManager.getDownloadedJSBundleFile());
        } else {
            jSBundleLoader = JSBundleLoader.createDeltaFromNetworkLoader(this.mDevSupportManager.getSourceUrl(), nativeDeltaClient);
        }
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, jSBundleLoader);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @ThreadConfined(ThreadConfined.f969UI)
    private void onReloadWithJSDebugger(JavaJSExecutor.Factory factory) {
        recreateReactContextInBackground(new ProxyJavaScriptExecutor.Factory(factory), JSBundleLoader.createRemoteDebuggerBundleLoader(this.mDevSupportManager.getJSBundleURLForRemoteDebugging(), this.mDevSupportManager.getSourceUrl()));
    }

    private void processPackage(ReactPackage reactPackage, NativeModuleRegistryBuilder nativeModuleRegistryBuilder) {
        SystraceMessage.beginSection(0, "processPackage").arg(PushClientConstants.TAG_CLASS_NAME, reactPackage.getClass().getSimpleName()).flush();
        boolean z = reactPackage instanceof ReactPackageLogger;
        if (z) {
            ((ReactPackageLogger) reactPackage).startProcessPackage();
        }
        nativeModuleRegistryBuilder.processPackage(reactPackage);
        if (z) {
            ((ReactPackageLogger) reactPackage).endProcessPackage();
        }
        SystraceMessage.endSection(0).flush();
    }

    private NativeModuleRegistry processPackages(ReactApplicationContext reactApplicationContext, List<ReactPackage> list, boolean z) {
        NativeModuleRegistryBuilder nativeModuleRegistryBuilder = new NativeModuleRegistryBuilder(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.mPackages) {
            for (ReactPackage reactPackage : list) {
                if (!z || !this.mPackages.contains(reactPackage)) {
                    Systrace.beginSection(0, "createAndProcessCustomReactPackage");
                    if (z) {
                        try {
                            this.mPackages.add(reactPackage);
                        } catch (Throwable th) {
                            Systrace.endSection(0);
                            throw th;
                        }
                    }
                    processPackage(reactPackage, nativeModuleRegistryBuilder);
                    Systrace.endSection(0);
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        Systrace.beginSection(0, "buildNativeModuleRegistry");
        try {
            return nativeModuleRegistryBuilder.build();
        } finally {
            Systrace.endSection(0);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @ThreadConfined(ThreadConfined.f969UI)
    private void recreateReactContextInBackgroundFromBundleLoader() {
        PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: load from BundleLoader");
        recreateReactContextInBackground(this.mJavaScriptExecutorFactory, this.mBundleLoader);
    }

    @ThreadConfined(ThreadConfined.f969UI)
    private void recreateReactContextInBackgroundInner() {
        PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.mUseDeveloperSupport && this.mJSMainModulePath != null) {
            final DeveloperSettings devSettings = this.mDevSupportManager.getDevSettings();
            if (this.mDevSupportManager.hasUpToDateJSBundleInCache() && !devSettings.isRemoteJSDebugEnabled()) {
                onJSBundleLoadedFromServer(null);
                return;
            } else if (!Systrace.isTracing(0)) {
                if (this.mBundleLoader == null) {
                    this.mDevSupportManager.handleReloadJS();
                    return;
                } else {
                    this.mDevSupportManager.isPackagerRunning(new PackagerStatusCallback() {
                        /* class com.facebook.react.ReactInstanceManager.C05943 */

                        @Override // com.facebook.react.devsupport.interfaces.PackagerStatusCallback
                        public void onPackagerStatusFetched(final boolean z) {
                            UiThreadUtil.runOnUiThread(new Runnable() {
                                /* class com.facebook.react.ReactInstanceManager.C05943.RunnableC05951 */

                                public void run() {
                                    if (z) {
                                        ReactInstanceManager.this.mDevSupportManager.handleReloadJS();
                                        return;
                                    }
                                    devSettings.setRemoteJSDebugEnabled(false);
                                    ReactInstanceManager.this.recreateReactContextInBackgroundFromBundleLoader();
                                }
                            });
                        }
                    });
                    return;
                }
            }
        }
        recreateReactContextInBackgroundFromBundleLoader();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @ThreadConfined(ThreadConfined.f969UI)
    private void runCreateReactContextOnNewThread(final ReactContextInitParams reactContextInitParams) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.mAttachedRootViews) {
            synchronized (this.mReactContextLock) {
                if (this.mCurrentReactContext != null) {
                    tearDownReactContext(this.mCurrentReactContext);
                    this.mCurrentReactContext = null;
                }
            }
        }
        this.mCreateReactContextThread = new Thread(null, new Runnable() {
            /* class com.facebook.react.ReactInstanceManager.RunnableC05975 */

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000c */
            /* JADX WARNING: Removed duplicated region for block: B:2:0x000c A[LOOP:0: B:2:0x000c->B:16:0x000c, LOOP_START, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                // Method dump skipped, instructions count: 116
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactInstanceManager.RunnableC05975.run():void");
            }
        }, "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.mCreateReactContextThread.start();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setupReactContext(final ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        Systrace.beginSection(0, "setupReactContext");
        synchronized (this.mAttachedRootViews) {
            synchronized (this.mReactContextLock) {
                this.mCurrentReactContext = (ReactContext) Assertions.assertNotNull(reactApplicationContext);
            }
            CatalystInstance catalystInstance = (CatalystInstance) Assertions.assertNotNull(reactApplicationContext.getCatalystInstance());
            catalystInstance.initialize();
            this.mDevSupportManager.onNewReactContextCreated(reactApplicationContext);
            this.mMemoryPressureRouter.addMemoryPressureListener(catalystInstance);
            moveReactContextToCurrentLifecycleState();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (ReactRootView reactRootView : this.mAttachedRootViews) {
                attachRootViewToInstance(reactRootView);
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        final ReactInstanceEventListener[] reactInstanceEventListenerArr = (ReactInstanceEventListener[]) this.mReactInstanceEventListeners.toArray(new ReactInstanceEventListener[this.mReactInstanceEventListeners.size()]);
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.ReactInstanceManager.RunnableC06006 */

            public void run() {
                for (ReactInstanceEventListener reactInstanceEventListener : reactInstanceEventListenerArr) {
                    reactInstanceEventListener.onReactContextInitialized(reactApplicationContext);
                }
            }
        });
        Systrace.endSection(0);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new Runnable() {
            /* class com.facebook.react.ReactInstanceManager.RunnableC06017 */

            public void run() {
                Process.setThreadPriority(0);
                ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
            }
        });
        reactApplicationContext.runOnNativeModulesQueueThread(new Runnable() {
            /* class com.facebook.react.ReactInstanceManager.RunnableC06028 */

            public void run() {
                Process.setThreadPriority(0);
            }
        });
    }

    private void tearDownReactContext(ReactContext reactContext) {
        UiThreadUtil.assertOnUiThread();
        if (this.mLifecycleState == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.mAttachedRootViews) {
            for (ReactRootView reactRootView : this.mAttachedRootViews) {
                reactRootView.removeAllViews();
                reactRootView.setId(-1);
            }
        }
        reactContext.destroy();
        this.mDevSupportManager.onReactInstanceDestroyed(reactContext);
        this.mMemoryPressureRouter.removeMemoryPressureListener(reactContext.getCatalystInstance());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void toggleElementInspector() {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("toggleElementInspector", null);
        }
    }

    public void addReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.add(reactInstanceEventListener);
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void attachRootView(ReactRootView reactRootView) {
        UiThreadUtil.assertOnUiThread();
        this.mAttachedRootViews.add(reactRootView);
        reactRootView.removeAllViews();
        reactRootView.setId(-1);
        ReactContext currentReactContext = getCurrentReactContext();
        if (this.mCreateReactContextThread == null && currentReactContext != null) {
            attachRootViewToInstance(reactRootView);
        }
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void createReactContextInBackground() {
        Assertions.assertCondition(!this.mHasStartedCreatingInitialContext, "createReactContextInBackground should only be called when creating the react application for the first time. When reloading JS, e.g. from a new file, explicitlyuse recreateReactContextInBackground");
        this.mHasStartedCreatingInitialContext = true;
        recreateReactContextInBackgroundInner();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r6.mPackages.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0.hasNext() == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r4 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if ((r4 instanceof com.facebook.react.ViewManagerOnDemandReactPackage) == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r4 = ((com.facebook.react.ViewManagerOnDemandReactPackage) r4).createViewManager(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r4 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r6.mPackages;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.uimanager.ViewManager createViewManager(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mReactContextLock
            monitor-enter(r0)
            com.facebook.react.bridge.ReactContext r1 = r6.getCurrentReactContext()     // Catch:{ all -> 0x003e }
            com.facebook.react.bridge.ReactApplicationContext r1 = (com.facebook.react.bridge.ReactApplicationContext) r1     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r1 == 0) goto L_0x003c
            boolean r3 = r1.hasActiveCatalystInstance()     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x0013
            goto L_0x003c
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            java.util.List<com.facebook.react.ReactPackage> r3 = r6.mPackages
            monitor-enter(r3)
            java.util.List<com.facebook.react.ReactPackage> r0 = r6.mPackages     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x001d:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0037
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0039 }
            com.facebook.react.ReactPackage r4 = (com.facebook.react.ReactPackage) r4     // Catch:{ all -> 0x0039 }
            boolean r5 = r4 instanceof com.facebook.react.ViewManagerOnDemandReactPackage     // Catch:{ all -> 0x0039 }
            if (r5 == 0) goto L_0x001d
            com.facebook.react.ViewManagerOnDemandReactPackage r4 = (com.facebook.react.ViewManagerOnDemandReactPackage) r4     // Catch:{ all -> 0x0039 }
            com.facebook.react.uimanager.ViewManager r4 = r4.createViewManager(r1, r7)     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r4
        L_0x0037:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r2
        L_0x0039:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r7
        L_0x003c:
            monitor-exit(r0)
            return r2
        L_0x003e:
            r7 = move-exception
            monitor-exit(r0)
            goto L_0x0042
        L_0x0041:
            throw r7
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactInstanceManager.createViewManager(java.lang.String):com.facebook.react.uimanager.ViewManager");
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: Destroy");
        this.mHasStartedDestroying = true;
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
            this.mDevSupportManager.stopInspector();
        }
        moveToBeforeCreateLifecycleState();
        if (this.mCreateReactContextThread != null) {
            this.mCreateReactContextThread = null;
        }
        this.mMemoryPressureRouter.destroy(this.mApplicationContext);
        synchronized (this.mReactContextLock) {
            if (this.mCurrentReactContext != null) {
                this.mCurrentReactContext.destroy();
                this.mCurrentReactContext = null;
            }
        }
        this.mHasStartedCreatingInitialContext = false;
        this.mCurrentActivity = null;
        ResourceDrawableIdHelper.getInstance().clear();
        this.mHasStartedDestroying = false;
        synchronized (this.mHasStartedDestroying) {
            this.mHasStartedDestroying.notifyAll();
        }
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void detachRootView(ReactRootView reactRootView) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.mAttachedRootViews) {
            if (this.mAttachedRootViews.contains(reactRootView)) {
                ReactContext currentReactContext = getCurrentReactContext();
                this.mAttachedRootViews.remove(reactRootView);
                if (currentReactContext != null && currentReactContext.hasActiveCatalystInstance()) {
                    detachViewFromInstance(reactRootView, currentReactContext.getCatalystInstance());
                }
            }
        }
    }

    @Nullable
    @VisibleForTesting
    public ReactContext getCurrentReactContext() {
        ReactContext reactContext;
        synchronized (this.mReactContextLock) {
            reactContext = this.mCurrentReactContext;
        }
        return reactContext;
    }

    public DevSupportManager getDevSupportManager() {
        return this.mDevSupportManager;
    }

    public String getJsExecutorName() {
        return this.mJavaScriptExecutorFactory.toString();
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public MemoryPressureRouter getMemoryPressureRouter() {
        return this.mMemoryPressureRouter;
    }

    public List<ViewManager> getOrCreateViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        Systrace.beginSection(0, "createAllViewManagers");
        try {
            if (this.mViewManagers == null) {
                synchronized (this.mPackages) {
                    if (this.mViewManagers == null) {
                        this.mViewManagers = new ArrayList();
                        for (ReactPackage reactPackage : this.mPackages) {
                            this.mViewManagers.addAll(reactPackage.createViewManagers(reactApplicationContext));
                        }
                        list = this.mViewManagers;
                    }
                }
                return list;
            }
            list = this.mViewManagers;
            return list;
        } finally {
            Systrace.endSection(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2 = new java.util.HashSet();
        r5 = r10.mPackages.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5.hasNext() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r6 = r5.next();
        com.facebook.systrace.SystraceMessage.beginSection(0, "ReactInstanceManager.getViewManagerName").arg("Package", r6.getClass().getSimpleName()).flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if ((r6 instanceof com.facebook.react.ViewManagerOnDemandReactPackage) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r6 = ((com.facebook.react.ViewManagerOnDemandReactPackage) r6).getViewManagerNames(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r6 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r2.addAll(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        com.facebook.systrace.SystraceMessage.endSection(0).flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        com.facebook.systrace.Systrace.endSection(0);
        r0 = new java.util.ArrayList(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r4 = r10.mPackages;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> getViewManagerNames() {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactInstanceManager.getViewManagerNames():java.util.List");
    }

    public boolean hasStartedCreatingInitialContext() {
        return this.mHasStartedCreatingInitialContext;
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, i, i2, intent);
        }
    }

    public void onBackPressed() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.mCurrentReactContext;
        if (reactContext == null) {
            FLog.m913w(ReactConstants.TAG, "Instance detached from instance manager");
            invokeDefaultOnBackPressed();
            return;
        }
        ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeCreateLifecycleState();
        this.mCurrentActivity = null;
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onHostPause() {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = null;
        if (this.mUseDeveloperSupport) {
            this.mDevSupportManager.setDevSupportEnabled(false);
        }
        moveToBeforeResumeLifecycleState();
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onHostResume(Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        UiThreadUtil.assertOnUiThread();
        this.mDefaultBackButtonImpl = defaultHardwareBackBtnHandler;
        onHostResume(activity);
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onNewIntent(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            FLog.m913w(ReactConstants.TAG, "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            ((DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(this.mCurrentActivity, intent);
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void recreateReactContextInBackground() {
        Assertions.assertCondition(this.mHasStartedCreatingInitialContext, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        recreateReactContextInBackgroundInner();
    }

    public void removeReactInstanceEventListener(ReactInstanceEventListener reactInstanceEventListener) {
        this.mReactInstanceEventListeners.remove(reactInstanceEventListener);
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void showDevOptionsDialog() {
        UiThreadUtil.assertOnUiThread();
        this.mDevSupportManager.showDevOptionsDialog();
    }

    @ThreadConfined(ThreadConfined.f969UI)
    private void recreateReactContextInBackground(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        UiThreadUtil.assertOnUiThread();
        ReactContextInitParams reactContextInitParams = new ReactContextInitParams(javaScriptExecutorFactory, jSBundleLoader);
        if (this.mCreateReactContextThread == null) {
            runCreateReactContextOnNewThread(reactContextInitParams);
        } else {
            this.mPendingReactContextInitParams = reactContextInitParams;
        }
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onHostResume(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = activity;
        if (this.mUseDeveloperSupport) {
            final View decorView = activity.getWindow().getDecorView();
            if (!ViewCompat.m14604OooO0oo(decorView)) {
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                    /* class com.facebook.react.ReactInstanceManager.View$OnAttachStateChangeListenerC05964 */

                    public void onViewAttachedToWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        ReactInstanceManager.this.mDevSupportManager.setDevSupportEnabled(true);
                    }

                    public void onViewDetachedFromWindow(View view) {
                    }
                });
            } else {
                this.mDevSupportManager.setDevSupportEnabled(true);
            }
        }
        moveToResumedLifecycleState(false);
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onHostDestroy(Activity activity) {
        if (activity == this.mCurrentActivity) {
            onHostDestroy();
        }
    }

    @ThreadConfined(ThreadConfined.f969UI)
    public void onHostPause(Activity activity) {
        Assertions.assertNotNull(this.mCurrentActivity);
        boolean z = activity == this.mCurrentActivity;
        Assertions.assertCondition(z, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.mCurrentActivity.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        onHostPause();
    }
}
