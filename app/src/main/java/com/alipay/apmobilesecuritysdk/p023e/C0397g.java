package com.alipay.apmobilesecuritysdk.p023e;

import android.content.Context;
import android.content.SharedPreferences;
import com.p118pd.sdk.C7558o0o00OOO;
import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7568o0o00oO;

/* renamed from: com.alipay.apmobilesecuritysdk.e.g */
public final class C0397g {
    /* renamed from: a */
    public static synchronized String m783a(Context context, String str) {
        synchronized (C0397g.class) {
            String OooO00o = C7568o0o00oO.OooO00o(context, "openapi_file_pri", "openApi" + str, "");
            if (C7559o0o00OOo.m19210OooO00o(OooO00o)) {
                return "";
            }
            String OooO0O0 = C7558o0o00OOO.OooO0O0(C7558o0o00OOO.OooO00o(), OooO00o);
            return C7559o0o00OOo.m19210OooO00o(OooO0O0) ? "" : OooO0O0;
        }
    }

    /* renamed from: a */
    public static synchronized void m784a() {
        synchronized (C0397g.class) {
        }
    }

    /* renamed from: a */
    public static synchronized void m785a(Context context) {
        synchronized (C0397g.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (edit != null) {
                edit.clear();
                edit.commit();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m786a(Context context, String str, String str2) {
        synchronized (C0397g.class) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (edit != null) {
                    edit.putString("openApi" + str, C7558o0o00OOO.OooO00o(C7558o0o00OOO.OooO00o(), str2));
                    edit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
