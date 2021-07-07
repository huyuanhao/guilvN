package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;

public class DebugCorePackage extends LazyReactPackage {
    @Override // com.facebook.react.LazyReactPackage
    public List<ModuleSpec> getNativeModules(final ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCHeapCapture.class, new Provider<NativeModule>() {
            /* class com.facebook.react.DebugCorePackage.C05801 */

            @Override // javax.inject.Provider
            public NativeModule get() {
                return new JSCHeapCapture(reactApplicationContext);
            }
        }));
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCSamplingProfiler.class, new Provider<NativeModule>() {
            /* class com.facebook.react.DebugCorePackage.C05812 */

            @Override // javax.inject.Provider
            public NativeModule get() {
                return new JSCSamplingProfiler(reactApplicationContext);
            }
        }));
        return arrayList;
    }

    @Override // com.facebook.react.LazyReactPackage
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return LazyReactPackage.getReactModuleInfoProviderViaReflection(this);
    }
}
