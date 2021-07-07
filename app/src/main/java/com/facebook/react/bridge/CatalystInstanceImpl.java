package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceListener;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.message.proguard.C3848l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

@DoNotStrip
public class CatalystInstanceImpl implements CatalystInstance {
    public static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
    public volatile boolean mAcceptCalls;
    public final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    public volatile boolean mDestroyed;
    public final HybridData mHybridData;
    public boolean mInitialized;
    public boolean mJSBundleHasLoaded;
    public final JSBundleLoader mJSBundleLoader;
    public final ArrayList<PendingJSCall> mJSCallsPendingInit;
    public final Object mJSCallsPendingInitLock;
    public final JSIModuleRegistry mJSIModuleRegistry;
    public final JavaScriptModuleRegistry mJSModuleRegistry;
    public JavaScriptContextHolder mJavaScriptContextHolder;
    public final String mJsPendingCallsTitleForTrace;
    public final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public final NativeModuleRegistry mNativeModuleRegistry;
    public final MessageQueueThread mNativeModulesQueueThread;
    public final AtomicInteger mPendingJSCalls;
    public final ReactQueueConfigurationImpl mReactQueueConfiguration;
    @Nullable
    public String mSourceURL;
    public final TraceListener mTraceListener;

    public static class BridgeCallback implements ReactCallback {
        public final WeakReference<CatalystInstanceImpl> mOuter;

        public BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }
    }

    public static class Builder {
        @Nullable
        public JSBundleLoader mJSBundleLoader;
        @Nullable
        public JavaScriptExecutor mJSExecutor;
        @Nullable
        public NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        @Nullable
        public ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        @Nullable
        public NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            return new CatalystInstanceImpl((ReactQueueConfigurationSpec) Assertions.assertNotNull(this.mReactQueueConfigurationSpec), (JavaScriptExecutor) Assertions.assertNotNull(this.mJSExecutor), (NativeModuleRegistry) Assertions.assertNotNull(this.mRegistry), (JSBundleLoader) Assertions.assertNotNull(this.mJSBundleLoader), (NativeModuleCallExceptionHandler) Assertions.assertNotNull(this.mNativeModuleCallExceptionHandler));
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
            return this;
        }

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    public static class JSProfilerTraceListener implements TraceListener {
        public final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        @Override // com.facebook.systrace.TraceListener
        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        @Override // com.facebook.systrace.TraceListener
        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    public class NativeExceptionHandler implements QueueThreadExceptionHandler {
        public NativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    public static class PendingJSCall {
        @Nullable
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, @Nullable NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                nativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, nativeArray);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(C9058ooOoOoOO.OooOO0);
            sb.append(this.mMethod);
            sb.append(C3848l.f10401s);
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                str = "";
            } else {
                str = nativeArray.toString();
            }
            sb.append(str);
            sb.append(C3848l.f10402t);
            return sb.toString();
        }
    }

    static {
        ReactBridge.staticInit();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void decrementPendingJSCalls() {
        int decrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z = decrementAndGet == 0;
        Systrace.traceCounter(0, this.mJsPendingCallsTitleForTrace, decrementAndGet);
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC06384 */

                public void run() {
                    Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeIdle();
                    }
                }
            });
        }
    }

    private native long getJavaScriptContext();

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return reactModule.name();
        }
        throw new IllegalArgumentException("Could not find @ReactModule annotation in " + cls.getCanonicalName());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void incrementPendingJSCalls() {
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        boolean z = andIncrement == 0;
        Systrace.traceCounter(0, this.mJsPendingCallsTitleForTrace, andIncrement + 1);
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC06373 */

                public void run() {
                    Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeBusy();
                    }
                }
            });
        }
    }

    public static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onNativeException(Exception exc) {
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() {
            /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC06395 */

            public void run() {
                CatalystInstanceImpl.this.destroy();
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addJSIModules(List<JSIModuleSpec> list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        if (!this.mDestroyed) {
            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC06341 */

                public void run() {
                    CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
                    CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
                    boolean z = false;
                    if (CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0) {
                        z = true;
                    }
                    if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                        Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                        while (it.hasNext()) {
                            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = (NotThreadSafeBridgeIdleDebugListener) it.next();
                            if (!z) {
                                notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                            }
                            notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                        }
                    }
                    AsyncTask.execute(new Runnable() {
                        /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC06341.RunnableC06351 */

                        public void run() {
                            CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                            CatalystInstanceImpl.this.mHybridData.resetNative();
                            CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                        }
                    });
                }
            });
            Systrace.unregisterListener(this.mTraceListener);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JSIModule> T getJSIModule(Class<T> cls) {
        return (T) this.mJSIModuleRegistry.getModule(cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) this.mNativeModuleRegistry.getModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        return this.mNativeModuleRegistry.getAllModules();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @Nullable
    public String getSourceURL() {
        return this.mSourceURL;
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return this.mNativeModuleRegistry.hasModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            z = this.mJSBundleHasLoaded && this.mAcceptCalls;
        }
        return z;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    @VisibleForTesting
    public void initialize() {
        Assertions.assertCondition(!this.mInitialized, "This catalyst instance has already been initialized");
        Assertions.assertCondition(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
            /* class com.facebook.react.bridge.CatalystInstanceImpl.RunnableC06362 */

            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
            }
        });
    }

    @Override // com.facebook.react.bridge.JSInstance, com.facebook.react.bridge.CatalystInstance
    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            FLog.m913w(ReactConstants.TAG, "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromDeltaBundle(str, nativeDeltaClient, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        Assertions.assertCondition(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
            while (it.hasNext()) {
                it.next().call(this);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
        Systrace.registerListener(this.mTraceListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    public CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        Systrace.beginSection(0, "createCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler());
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
        this.mTraceListener = new JSProfilerTraceListener(this);
        Systrace.endSection(0);
        Systrace.beginSection(0, "initializeCxxBridge");
        initializeBridge(new BridgeCallback(this), javaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), this.mNativeModulesQueueThread, this.mNativeModuleRegistry.getJavaModules(this), this.mNativeModuleRegistry.getCxxModules());
        Systrace.endSection(0);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            String pendingJSCall2 = pendingJSCall.toString();
            FLog.m913w(ReactConstants.TAG, "Calling JS function after bridge has been destroyed: " + pendingJSCall2);
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(pendingJSCall);
                    return;
                }
            }
        }
        pendingJSCall.call(this);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        return this.mNativeModuleRegistry.getModule(str);
    }
}
