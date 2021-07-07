package com.facebook.react;

import android.app.Application;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.uimanager.UIImplementationProvider;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ReactNativeHost {
    public final Application mApplication;
    @Nullable
    public ReactInstanceManager mReactInstanceManager;

    public ReactNativeHost(Application application) {
        this.mApplication = application;
    }

    public void clear() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null) {
            reactInstanceManager.destroy();
            this.mReactInstanceManager = null;
        }
    }

    public ReactInstanceManager createReactInstanceManager() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        ReactInstanceManagerBuilder initialLifecycleState = ReactInstanceManager.builder().setApplication(this.mApplication).setJSMainModulePath(getJSMainModuleName()).setUseDeveloperSupport(getUseDeveloperSupport()).setRedBoxHandler(getRedBoxHandler()).setJavaScriptExecutorFactory(getJavaScriptExecutorFactory()).setUIImplementationProvider(getUIImplementationProvider()).setJSIModulesPackage(getJSIModulePackage()).setInitialLifecycleState(LifecycleState.BEFORE_CREATE);
        for (ReactPackage reactPackage : getPackages()) {
            initialLifecycleState.addPackage(reactPackage);
        }
        String jSBundleFile = getJSBundleFile();
        if (jSBundleFile != null) {
            initialLifecycleState.setJSBundleFile(jSBundleFile);
        } else {
            initialLifecycleState.setBundleAssetName((String) Assertions.assertNotNull(getBundleAssetName()));
        }
        ReactInstanceManager build = initialLifecycleState.build();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return build;
    }

    public final Application getApplication() {
        return this.mApplication;
    }

    @Nullable
    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    @Nullable
    public String getJSBundleFile() {
        return null;
    }

    @Nullable
    public JSIModulePackage getJSIModulePackage() {
        return null;
    }

    public String getJSMainModuleName() {
        return "index.android";
    }

    @Nullable
    public JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        return null;
    }

    public abstract List<ReactPackage> getPackages();

    public ReactInstanceManager getReactInstanceManager() {
        if (this.mReactInstanceManager == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.mReactInstanceManager = createReactInstanceManager();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.mReactInstanceManager;
    }

    @Nullable
    public RedBoxHandler getRedBoxHandler() {
        return null;
    }

    public UIImplementationProvider getUIImplementationProvider() {
        return new UIImplementationProvider();
    }

    public abstract boolean getUseDeveloperSupport();

    public boolean hasInstance() {
        return this.mReactInstanceManager != null;
    }
}
