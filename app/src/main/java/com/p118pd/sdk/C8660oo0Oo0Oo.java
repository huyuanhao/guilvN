package com.p118pd.sdk;

import android.app.Activity;
import com.p118pd.sdk.C7047o00O00Oo;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oo0Oo0Oo  reason: case insensitive filesystem */
public class C8660oo0Oo0Oo {
    public static C8660oo0Oo0Oo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8667oo0OoO00 f21819OooO00o;

    public static C8660oo0Oo0Oo OooO00o() {
        if (OooO00o == null) {
            synchronized (C8660oo0Oo0Oo.class) {
                if (OooO00o == null) {
                    OooO00o = new C8660oo0Oo0Oo();
                }
            }
        }
        return OooO00o;
    }

    public HashMap<String, String> OooO00o(Activity activity) {
        HashMap<String, String> hashMap = new HashMap<>();
        String OooO00o2 = C8667oo0OoO00.m20292OooO00o(activity);
        if ("IS_SUPPORTED".equals(OooO00o2)) {
            hashMap.put("code", "SUCCESS");
            hashMap.put("biometryType", "TouchID");
        } else {
            hashMap.put("biometryType", "TouchID");
            hashMap.put("code", OooO00o2);
        }
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "BiologicalUnlock:BiologicalManager:getBiologicalInfo", hashMap);
        return hashMap;
    }

    public void OooO00o(Activity activity, HashMap<String, Object> hashMap, AbstractC8666oo0OoO0 oo0ooo0) {
        C8667oo0OoO00 oo0ooo00 = new C8667oo0OoO00(activity, oo0ooo0);
        this.f21819OooO00o = oo0ooo00;
        oo0ooo00.OooO00o((C7047o00O00Oo.C7048OooO0Oo) null);
    }

    public void OooO00o(HashMap<String, Object> hashMap) {
        C8667oo0OoO00 oo0ooo00 = this.f21819OooO00o;
        if (oo0ooo00 != null) {
            oo0ooo00.OooO0O0();
        } else {
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "BiologicalUnlock:BiologicalManager:cancelAuthenticateBiological mFingerprintHandler null");
        }
    }
}
