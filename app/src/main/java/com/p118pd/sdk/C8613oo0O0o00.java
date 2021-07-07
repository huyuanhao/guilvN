package com.p118pd.sdk;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.tencent.p272pd.sdk.Li11lli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oo0O0o00  reason: case insensitive filesystem */
public class C8613oo0O0o00 implements ReactPackage {
    public Li11lli OooO00o;

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        Li11lli li11lli = new Li11lli(reactApplicationContext);
        this.OooO00o = li11lli;
        arrayList.add(li11lli);
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
