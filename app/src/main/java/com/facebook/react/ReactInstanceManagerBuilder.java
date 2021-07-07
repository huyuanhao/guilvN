package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.jscexecutor.JSCExecutorFactory;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.UIImplementationProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class ReactInstanceManagerBuilder {
    @Nullable
    public Application mApplication;
    @Nullable
    public NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    @Nullable
    public Activity mCurrentActivity;
    @Nullable
    public Map<String, RequestHandler> mCustomPackagerCommandHandlers;
    @Nullable
    public DefaultHardwareBackBtnHandler mDefaultHardwareBackBtnHandler;
    @Nullable
    public DevBundleDownloadListener mDevBundleDownloadListener;
    @Nullable
    public LifecycleState mInitialLifecycleState;
    @Nullable
    public String mJSBundleAssetUrl;
    @Nullable
    public JSBundleLoader mJSBundleLoader;
    @Nullable
    public JSIModulePackage mJSIModulesPackage;
    @Nullable
    public String mJSMainModulePath;
    @Nullable
    public JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    public boolean mLazyViewManagersEnabled;
    public int mMinNumShakes = 1;
    public int mMinTimeLeftInFrameForNonBatchedOperationMs = -1;
    @Nullable
    public NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public final List<ReactPackage> mPackages = new ArrayList();
    @Nullable
    public RedBoxHandler mRedBoxHandler;
    @Nullable
    public UIImplementationProvider mUIImplementationProvider;
    public boolean mUseDeveloperSupport;

    public ReactInstanceManagerBuilder addPackage(ReactPackage reactPackage) {
        this.mPackages.add(reactPackage);
        return this;
    }

    public ReactInstanceManagerBuilder addPackages(List<ReactPackage> list) {
        this.mPackages.addAll(list);
        return this;
    }

    public ReactInstanceManager build() {
        String str;
        Assertions.assertNotNull(this.mApplication, "Application property has not been set with this builder");
        boolean z = true;
        Assertions.assertCondition((!this.mUseDeveloperSupport && this.mJSBundleAssetUrl == null && this.mJSBundleLoader == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.mJSMainModulePath == null && this.mJSBundleAssetUrl == null && this.mJSBundleLoader == null) {
            z = false;
        }
        Assertions.assertCondition(z, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.mUIImplementationProvider == null) {
            this.mUIImplementationProvider = new UIImplementationProvider();
        }
        String packageName = this.mApplication.getPackageName();
        String friendlyDeviceName = AndroidInfoHelpers.getFriendlyDeviceName();
        Application application = this.mApplication;
        Activity activity = this.mCurrentActivity;
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.mDefaultHardwareBackBtnHandler;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.mJavaScriptExecutorFactory;
        if (javaScriptExecutorFactory == null) {
            javaScriptExecutorFactory = new JSCExecutorFactory(packageName, friendlyDeviceName);
        }
        return new ReactInstanceManager(application, activity, defaultHardwareBackBtnHandler, javaScriptExecutorFactory, (this.mJSBundleLoader != null || (str = this.mJSBundleAssetUrl) == null) ? this.mJSBundleLoader : JSBundleLoader.createAssetLoader(this.mApplication, str, false), this.mJSMainModulePath, this.mPackages, this.mUseDeveloperSupport, this.mBridgeIdleDebugListener, (LifecycleState) Assertions.assertNotNull(this.mInitialLifecycleState, "Initial lifecycle state was not set"), this.mUIImplementationProvider, this.mNativeModuleCallExceptionHandler, this.mRedBoxHandler, this.mLazyViewManagersEnabled, this.mDevBundleDownloadListener, this.mMinNumShakes, this.mMinTimeLeftInFrameForNonBatchedOperationMs, this.mJSIModulesPackage, this.mCustomPackagerCommandHandlers);
    }

    public ReactInstanceManagerBuilder setApplication(Application application) {
        this.mApplication = application;
        return this;
    }

    public ReactInstanceManagerBuilder setBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleDebugListener = notThreadSafeBridgeIdleDebugListener;
        return this;
    }

    public ReactInstanceManagerBuilder setBundleAssetName(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.mJSBundleAssetUrl = str2;
        this.mJSBundleLoader = null;
        return this;
    }

    public ReactInstanceManagerBuilder setCurrentActivity(Activity activity) {
        this.mCurrentActivity = activity;
        return this;
    }

    public ReactInstanceManagerBuilder setCustomPackagerCommandHandlers(Map<String, RequestHandler> map) {
        this.mCustomPackagerCommandHandlers = map;
        return this;
    }

    public ReactInstanceManagerBuilder setDefaultHardwareBackBtnHandler(DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        this.mDefaultHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setDevBundleDownloadListener(@Nullable DevBundleDownloadListener devBundleDownloadListener) {
        this.mDevBundleDownloadListener = devBundleDownloadListener;
        return this;
    }

    public ReactInstanceManagerBuilder setInitialLifecycleState(LifecycleState lifecycleState) {
        this.mInitialLifecycleState = lifecycleState;
        return this;
    }

    public ReactInstanceManagerBuilder setJSBundleFile(String str) {
        if (!str.startsWith("assets://")) {
            return setJSBundleLoader(JSBundleLoader.createFileLoader(str));
        }
        this.mJSBundleAssetUrl = str;
        this.mJSBundleLoader = null;
        return this;
    }

    public ReactInstanceManagerBuilder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
        this.mJSBundleLoader = jSBundleLoader;
        this.mJSBundleAssetUrl = null;
        return this;
    }

    public ReactInstanceManagerBuilder setJSIModulesPackage(@Nullable JSIModulePackage jSIModulePackage) {
        this.mJSIModulesPackage = jSIModulePackage;
        return this;
    }

    public ReactInstanceManagerBuilder setJSMainModulePath(String str) {
        this.mJSMainModulePath = str;
        return this;
    }

    public ReactInstanceManagerBuilder setJavaScriptExecutorFactory(@Nullable JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        return this;
    }

    public ReactInstanceManagerBuilder setLazyViewManagersEnabled(boolean z) {
        this.mLazyViewManagersEnabled = z;
        return this;
    }

    public ReactInstanceManagerBuilder setMinNumShakes(int i) {
        this.mMinNumShakes = i;
        return this;
    }

    public ReactInstanceManagerBuilder setMinTimeLeftInFrameForNonBatchedOperationMs(int i) {
        this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
        return this;
    }

    public ReactInstanceManagerBuilder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setRedBoxHandler(@Nullable RedBoxHandler redBoxHandler) {
        this.mRedBoxHandler = redBoxHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setUIImplementationProvider(@Nullable UIImplementationProvider uIImplementationProvider) {
        this.mUIImplementationProvider = uIImplementationProvider;
        return this;
    }

    public ReactInstanceManagerBuilder setUseDeveloperSupport(boolean z) {
        this.mUseDeveloperSupport = z;
        return this;
    }
}
