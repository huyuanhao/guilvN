package com.facebook.react.modules.debug;

import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = SourceCodeModule.NAME)
public class SourceCodeModule extends BaseJavaModule {
    public static final String NAME = "SourceCode";
    public final ReactContext mReactContext;

    public SourceCodeModule(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("scriptURL", (String) Assertions.assertNotNull(this.mReactContext.getCatalystInstance().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }
}
