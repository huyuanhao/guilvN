package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import com.p118pd.sdk.C7559o0o00OOo;
import com.p118pd.sdk.C7569o0o00oO0;
import com.p118pd.sdk.C8932ooOOO0o;

public class UmidSdkWrapper {
    public static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    public static final String UMIDTOKEN_KEY_NAME = "umidtk";
    public static volatile String cachedUmidToken = "";
    public static volatile boolean initUmidFinished;

    public static String compatUmidBug(Context context, String str) {
        if (!C7559o0o00OOo.m19210OooO00o(str) && !C7559o0o00OOo.m19211OooO00o(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains(C8932ooOOO0o.f22176OooO00o)) {
            utdid = "";
        }
        return C7559o0o00OOo.m19210OooO00o(utdid) ? "" : utdid;
    }

    public static synchronized String getSecurityToken(Context context) {
        String str;
        synchronized (UmidSdkWrapper.class) {
            str = cachedUmidToken;
        }
        return str;
    }

    public static String startUmidTaskSync(Context context, int i) {
        return "";
    }

    public static synchronized void updateLocalUmidToken(Context context, String str) {
        synchronized (UmidSdkWrapper.class) {
            if (C7559o0o00OOo.m19212OooO0O0(str)) {
                C7569o0o00oO0.OooO00o(context, UMIDTOKEN_FILE_NAME, UMIDTOKEN_KEY_NAME, str);
                cachedUmidToken = str;
            }
        }
    }
}
