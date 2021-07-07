package com.facebook.react.bridge;

import com.facebook.common.logging.FLog;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nullable;
import javax.inject.Provider;

public class ModuleSpec {
    public static final String TAG = "ModuleSpec";
    public final String mName;
    public final Provider<? extends NativeModule> mProvider;
    @Nullable
    public final Class<? extends NativeModule> mType = null;

    public ModuleSpec(Provider<? extends NativeModule> provider) {
        this.mProvider = provider;
        this.mName = null;
    }

    public static ModuleSpec nativeModuleSpec(Class<? extends NativeModule> cls, Provider<? extends NativeModule> provider) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            return new ModuleSpec(provider, reactModule.name());
        }
        FLog.m913w(TAG, "Could not find @ReactModule annotation on " + cls.getName() + ". So creating the module eagerly to get the name. Consider adding an annotation to make this Lazy");
        return new ModuleSpec(provider, ((NativeModule) provider.get()).getName());
    }

    public static ModuleSpec viewManagerSpec(Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider);
    }

    public String getName() {
        return this.mName;
    }

    public Provider<? extends NativeModule> getProvider() {
        return this.mProvider;
    }

    @Nullable
    public Class<? extends NativeModule> getType() {
        return this.mType;
    }

    public ModuleSpec(Provider<? extends NativeModule> provider, String str) {
        this.mProvider = provider;
        this.mName = str;
    }

    public static ModuleSpec nativeModuleSpec(String str, Provider<? extends NativeModule> provider) {
        return new ModuleSpec(provider, str);
    }
}
