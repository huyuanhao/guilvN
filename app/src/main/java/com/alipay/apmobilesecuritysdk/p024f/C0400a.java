package com.alipay.apmobilesecuritysdk.p024f;

import android.content.Context;
import android.os.Environment;
import com.p118pd.sdk.C7558o0o00OOO;
import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7564o0o00o;
import com.p118pd.sdk.C7567o0o00o0O;
import com.p118pd.sdk.C7568o0o00oO;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.f.a */
public class C0400a {
    /* renamed from: a */
    public static String m822a(Context context, String str, String str2) {
        if (context == null || C7559o0o00OOo.m19210OooO00o(str) || C7559o0o00OOo.m19210OooO00o(str2)) {
            return null;
        }
        try {
            String OooO00o = C7568o0o00oO.OooO00o(context, str, str2, "");
            if (C7559o0o00OOo.m19210OooO00o(OooO00o)) {
                return null;
            }
            return C7558o0o00OOO.OooO0O0(C7558o0o00OOO.OooO00o(), OooO00o);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m823a(String str, String str2) {
        synchronized (C0400a.class) {
            if (C7559o0o00OOo.m19210OooO00o(str) || C7559o0o00OOo.m19210OooO00o(str2)) {
                return null;
            }
            try {
                String OooO00o = C7567o0o00o0O.OooO00o(str);
                if (C7559o0o00OOo.m19210OooO00o(OooO00o)) {
                    return null;
                }
                String string = new JSONObject(OooO00o).getString(str2);
                if (C7559o0o00OOo.m19210OooO00o(string)) {
                    return null;
                }
                return C7558o0o00OOO.OooO0O0(C7558o0o00OOO.OooO00o(), string);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static void m824a(Context context, String str, String str2, String str3) {
        if (!C7559o0o00OOo.m19210OooO00o(str) && !C7559o0o00OOo.m19210OooO00o(str2) && context != null) {
            try {
                String OooO00o = C7558o0o00OOO.OooO00o(C7558o0o00OOO.OooO00o(), str3);
                HashMap hashMap = new HashMap();
                hashMap.put(str2, OooO00o);
                C7568o0o00oO.OooO00o(context, str, hashMap);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m825a(String str, String str2, String str3) {
        synchronized (C0400a.class) {
            if (!C7559o0o00OOo.m19210OooO00o(str) && !C7559o0o00OOo.m19210OooO00o(str2)) {
                String OooO00o = C7567o0o00o0O.OooO00o(str);
                JSONObject jSONObject = new JSONObject();
                if (C7559o0o00OOo.m19212OooO0O0(OooO00o)) {
                    try {
                        jSONObject = new JSONObject(OooO00o);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, C7558o0o00OOO.OooO00o(C7558o0o00OOO.OooO00o(), str3));
                jSONObject.toString();
                try {
                    System.clearProperty(str);
                } catch (Throwable unused2) {
                }
                if (C7564o0o00o.OooO00o()) {
                    String str4 = ".SystemConfig" + File.separator + str;
                    try {
                        if (C7564o0o00o.OooO00o()) {
                            File file = new File(Environment.getExternalStorageDirectory(), str4);
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }
}
