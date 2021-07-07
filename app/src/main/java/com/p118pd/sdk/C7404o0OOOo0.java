package com.p118pd.sdk;

import com.RNFetchBlob.C0242RNFetchBlob;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.o0OOOo0  reason: case insensitive filesystem */
public class C7404o0OOOo0 implements ReactPackage {
    public List<Class<? extends JavaScriptModule>> OooO00o() {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0242RNFetchBlob(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
