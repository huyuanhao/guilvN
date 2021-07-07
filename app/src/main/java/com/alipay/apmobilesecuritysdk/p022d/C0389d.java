package com.alipay.apmobilesecuritysdk.p022d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p021c.C0384b;
import com.p118pd.sdk.C7562o0o00OoO;
import com.p118pd.sdk.C7566o0o00o00;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.d */
public final class C0389d {
    /* renamed from: a */
    public static synchronized Map<String, String> m751a() {
        HashMap hashMap;
        synchronized (C0389d.class) {
            hashMap = new HashMap();
            try {
                new C0384b();
                hashMap.put("AE16", "");
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m752a(Context context) {
        HashMap hashMap;
        synchronized (C0389d.class) {
            C7566o0o00o00.OooO00o();
            C7562o0o00OoO.OooO00o();
            hashMap = new HashMap();
            hashMap.put("AE1", C7566o0o00o00.m19215OooO00o());
            StringBuilder sb = new StringBuilder();
            sb.append(C7566o0o00o00.m19216OooO00o() ? "1" : "0");
            hashMap.put("AE2", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C7566o0o00o00.OooO00o(context) ? "1" : "0");
            hashMap.put("AE3", sb2.toString());
            hashMap.put("AE4", C7566o0o00o00.OooO0O0());
            hashMap.put("AE5", C7566o0o00o00.OooO0OO());
            hashMap.put("AE6", C7566o0o00o00.OooO0Oo());
            hashMap.put("AE7", C7566o0o00o00.OooO0o0());
            hashMap.put("AE8", C7566o0o00o00.OooO0o());
            hashMap.put("AE9", C7566o0o00o00.OooO0oO());
            hashMap.put("AE10", C7566o0o00o00.OooO0oo());
            hashMap.put("AE11", C7566o0o00o00.OooO());
            hashMap.put("AE12", C7566o0o00o00.OooOO0());
            hashMap.put("AE13", C7566o0o00o00.OooOO0O());
            hashMap.put("AE14", C7566o0o00o00.OooOO0o());
            hashMap.put("AE15", C7566o0o00o00.OooOOO0());
            hashMap.put("AE21", C7562o0o00OoO.OooO0o());
        }
        return hashMap;
    }
}
