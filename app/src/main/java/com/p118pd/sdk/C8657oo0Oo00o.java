package com.p118pd.sdk;

import android.os.Bundle;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewManager;
import com.rxhui.android_log_sdk.p253rn.LogModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oo0Oo00o  reason: case insensitive filesystem */
public class C8657oo0Oo00o implements ReactPackage {
    public C5310ILil OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIiLLL1 f21803OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LLIiiiL f21804OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Li1LLiil f21805OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Lii11lli f21806OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LogModule f21807OooO00o;

    public void OooO00o(String str, WritableMap writableMap) {
        Lii11lli lii11lli = this.f21806OooO00o;
        if (lii11lli != null) {
            lii11lli.sendEvent(str, writableMap);
        }
    }

    public void OooO0O0(Bundle bundle) {
        LIiLLL1 lIiLLL1 = this.f21803OooO00o;
        if (lIiLLL1 != null) {
            lIiLLL1.sendRouterEvent(bundle);
        }
    }

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        Lii11lli lii11lli = new Lii11lli(reactApplicationContext);
        this.f21806OooO00o = lii11lli;
        arrayList.add(lii11lli);
        Li1LLiil li1LLiil = new Li1LLiil(reactApplicationContext);
        this.f21805OooO00o = li1LLiil;
        arrayList.add(li1LLiil);
        LIiLLL1 lIiLLL1 = new LIiLLL1(reactApplicationContext);
        this.f21803OooO00o = lIiLLL1;
        arrayList.add(lIiLLL1);
        C5310ILil iLil = new C5310ILil(reactApplicationContext);
        this.OooO00o = iLil;
        arrayList.add(iLil);
        LogModule logModule = new LogModule(reactApplicationContext);
        this.f21807OooO00o = logModule;
        arrayList.add(logModule);
        LLIiiiL lLIiiiL = new LLIiiiL(reactApplicationContext);
        this.f21804OooO00o = lLIiiiL;
        arrayList.add(lLIiiiL);
        return arrayList;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public void OooO00o(WritableMap writableMap) {
        Lii11lli lii11lli = this.f21806OooO00o;
        if (lii11lli != null) {
            lii11lli.sendAppFABEvent(writableMap);
        }
    }

    public void OooO0O0(WritableMap writableMap) {
        LogModule logModule = this.f21807OooO00o;
        if (logModule != null) {
            logModule.sendLogEvent(writableMap);
        }
    }

    public void OooO00o(Bundle bundle) {
        Lii11lli lii11lli = this.f21806OooO00o;
        if (lii11lli != null) {
            lii11lli.sendRNFABEvent(bundle);
        }
    }
}
