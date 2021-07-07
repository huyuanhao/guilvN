package com.p118pd.sdk;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.shell.MainReactPackage;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;

/* renamed from: com.pd.sdk.oo0OOoo0  reason: case insensitive filesystem */
public class C8650oo0OOoo0 extends MainReactPackage {

    /* renamed from: com.pd.sdk.oo0OOoo0$OooO00o */
    public class OooO00o implements Provider<NativeModule> {
        public final /* synthetic */ ReactApplicationContext OooO00o;

        public OooO00o(ReactApplicationContext reactApplicationContext) {
            this.OooO00o = reactApplicationContext;
        }

        /* renamed from: OooO00o */
        public NativeModule get() {
            return new I1I(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oo0OOoo0$OooO0O0 */
    public class OooO0O0 implements Provider<NativeModule> {
        public final /* synthetic */ ReactApplicationContext OooO00o;

        public OooO0O0(ReactApplicationContext reactApplicationContext) {
            this.OooO00o = reactApplicationContext;
        }

        /* renamed from: OooO00o */
        public NativeModule get() {
            return new BlobModule(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.oo0OOoo0$OooO0OO */
    public class OooO0OO implements Provider<NativeModule> {
        public final /* synthetic */ ReactApplicationContext OooO00o;

        public OooO0OO(ReactApplicationContext reactApplicationContext) {
            this.OooO00o = reactApplicationContext;
        }

        /* renamed from: OooO00o */
        public NativeModule get() {
            return new FileReaderModule(this.OooO00o);
        }
    }

    @Override // com.facebook.react.LazyReactPackage, com.facebook.react.shell.MainReactPackage
    public List<ModuleSpec> getNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : super.getNativeModules(reactApplicationContext)) {
            if (!(moduleSpec.getProvider().get() instanceof NetworkingModule) && !(moduleSpec.getProvider().get() instanceof BlobModule) && !(moduleSpec.getProvider().get() instanceof FileReaderModule)) {
                arrayList.add(moduleSpec);
            }
        }
        arrayList.add(ModuleSpec.nativeModuleSpec(I1I.class, new OooO00o(reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(BlobModule.class, new OooO0O0(reactApplicationContext)));
        arrayList.add(ModuleSpec.nativeModuleSpec(FileReaderModule.class, new OooO0OO(reactApplicationContext)));
        return arrayList;
    }
}
