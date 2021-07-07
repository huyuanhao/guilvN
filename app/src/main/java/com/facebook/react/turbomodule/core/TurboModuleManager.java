package com.facebook.react.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;

public class TurboModuleManager implements JSIModule {
    @DoNotStrip
    public final HybridData mHybridData;
    public final ModuleProvider mModuleProvider;
    public final ReactApplicationContext mReactApplicationContext;

    public interface ModuleProvider {
        TurboModule getModule(String str, ReactApplicationContext reactApplicationContext);
    }

    static {
        SoLoader.loadLibrary("turbomodulejsijni");
    }

    public TurboModuleManager(ReactApplicationContext reactApplicationContext, JavaScriptContextHolder javaScriptContextHolder, ModuleProvider moduleProvider) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mHybridData = initHybrid(javaScriptContextHolder.get(), reactApplicationContext.getCatalystInstance().getReactQueueConfiguration().getJSQueueThread());
        this.mModuleProvider = moduleProvider;
    }

    @DoNotStrip
    public TurboModule getJavaModule(String str) {
        return this.mModuleProvider.getModule(str, this.mReactApplicationContext);
    }

    public ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public native HybridData initHybrid(long j, MessageQueueThread messageQueueThread);

    @Override // com.facebook.react.bridge.JSIModule
    public void initialize() {
    }

    public void installBindings() {
        installJSIBindings();
    }

    public native void installJSIBindings();

    @Override // com.facebook.react.bridge.JSIModule
    public void onCatalystInstanceDestroy() {
    }
}
