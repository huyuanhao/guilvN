package com.alipay.apmobilesecuritysdk.p021c;

import android.content.Context;
import android.os.Build;
import com.p118pd.sdk.C7571o0o00oOo;
import com.p118pd.sdk.C7574o0o00ooO;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.alipay.apmobilesecuritysdk.c.a */
public final class C0383a {
    /* renamed from: a */
    public static synchronized void m742a(Context context, String str, String str2, String str3) {
        synchronized (C0383a.class) {
            C7571o0o00oOo b = m745b(context, str, str2, str3);
            C7574o0o00ooO.OooO00o(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", b.toString());
        }
    }

    /* renamed from: a */
    public static synchronized void m743a(String str) {
        synchronized (C0383a.class) {
            C7574o0o00ooO.OooO00o(str);
        }
    }

    /* renamed from: a */
    public static synchronized void m744a(Throwable th) {
        synchronized (C0383a.class) {
            C7574o0o00ooO.OooO00o(th);
        }
    }

    /* renamed from: b */
    public static C7571o0o00oOo m745b(Context context, String str, String str2, String str3) {
        String str4;
        try {
            str4 = context.getPackageName();
        } catch (Throwable unused) {
            str4 = "";
        }
        return new C7571o0o00oOo(Build.MODEL, str4, "APPSecuritySDK-ALIPAYSDK", "3.4.0.201910161639", str, str2, str3);
    }
}
