package com.p118pd.sdk;

import android.content.Context;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOO0oo  reason: case insensitive filesystem */
public class C8919ooOO0oo {
    public static String OooO0Oo = "LogCollectorManager";
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8918ooOO0oOo f22155OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22156OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    /* renamed from: com.pd.sdk.ooOO0oo$OooO0O0 */
    public static class OooO0O0 {
        public static final C8919ooOO0oo OooO00o = new C8919ooOO0oo();
    }

    public static C8919ooOO0oo OooO00o() {
        return OooO0O0.OooO00o;
    }

    public void OooO0O0(Context context, String str) {
        this.f22155OooO00o.OooO00o(context, str);
    }

    public String OooO0OO() {
        return this.OooO0OO;
    }

    public C8919ooOO0oo() {
    }

    public C8919ooOO0oo OooO00o(Context context, String str, String str2, String str3) {
        OooO00o(context, str, str2, str3, null);
        return this;
    }

    public void OooO0O0(Context context, String str, Map<String, String> map) {
        this.f22155OooO00o.OooO0O0(context, str, map);
    }

    public C8919ooOO0oo OooO00o(Context context, String str, String str2, String str3, String str4) {
        if (context != null) {
            this.OooO00o = context;
            if (str3 != null && !str3.equals("")) {
                this.OooO0OO = str3;
            }
            if (str != null && !str.equals("")) {
                this.f22156OooO00o = str;
            }
            if (str2 != null && !str2.equals("")) {
                this.OooO0O0 = str2;
            }
            if (str4 == null) {
                this.f22155OooO00o = new C8920ooOO0oo0();
            } else {
                try {
                    this.f22155OooO00o = (C8920ooOO0oo0) Class.forName(str4).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                    LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
                    sharedInstance.recordError(C8919ooOO0oo.class.getName() + ":==listenerClassName.newInstance erro:" + e.getMessage());
                }
            }
            return this;
        }
        throw new IllegalArgumentException("valid context is required");
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO00o(Context context, String str) {
        this.f22155OooO00o.OooO0O0(context, str);
    }

    public void OooO00o(Context context, String str, Map<String, String> map) {
        this.f22155OooO00o.OooO00o(context, str, map);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20570OooO00o() {
        return this.f22156OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m20569OooO00o() {
        return this.OooO00o;
    }
}
