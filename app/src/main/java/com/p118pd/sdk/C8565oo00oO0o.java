package com.p118pd.sdk;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo00oO0o  reason: case insensitive filesystem */
public class C8565oo00oO0o {
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f21672OooO00o = new HashMap();
    public String OooO0O0;
    public String OooO0OO;

    public C8565oo00oO0o() {
    }

    public C8565oo00oO0o(String str, String str2, String str3) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Map<String, String> m20217OooO00o() {
        return this.f21672OooO00o;
    }

    public void OooO00o(String str, String str2) {
        if (str != null && !TextUtils.isEmpty(str)) {
            this.f21672OooO00o.put(str, str2);
        }
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public String OooO0OO() {
        return this.OooO0OO;
    }
}
