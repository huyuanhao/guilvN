package com.facebook.react.bridge;

import com.facebook.infer.annotation.Assertions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSIModuleRegistry {
    public final Map<Class, JSIModuleHolder> mModules = new HashMap();

    public <T extends JSIModule> T getModule(Class<T> cls) {
        JSIModuleHolder jSIModuleHolder = this.mModules.get(cls);
        if (jSIModuleHolder != null) {
            return (T) ((JSIModule) Assertions.assertNotNull(jSIModuleHolder.getJSIModule()));
        }
        throw new IllegalArgumentException("Unable to find JSIModule for class " + cls);
    }

    public void notifyJSInstanceDestroy() {
        for (JSIModuleHolder jSIModuleHolder : this.mModules.values()) {
            jSIModuleHolder.notifyJSInstanceDestroy();
        }
    }

    public void registerModules(List<JSIModuleSpec> list) {
        for (JSIModuleSpec jSIModuleSpec : list) {
            this.mModules.put(jSIModuleSpec.getJSIModuleClass(), new JSIModuleHolder(jSIModuleSpec));
        }
    }
}
