package com.p118pd.sdk;

import android.text.TextUtils;
import android.util.Log;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.pd.sdk.oo0ooooO  reason: case insensitive filesystem */
public class C8788oo0ooooO {
    public static long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21994OooO00o = "MM-dd HH:mm:ss.SSS";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final DateFormat f21995OooO00o = new SimpleDateFormat(f21994OooO00o, Locale.getDefault());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Date f21996OooO00o = new Date();
    public static String OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final DateFormat f21997OooO0O0 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    public static final String OooO0OO = ".log";
    public static final String OooO0Oo = "yyyyMMdd";

    public static String OooO00o(long j) {
        if (j == OooO00o) {
            return OooO0O0;
        }
        f21996OooO00o.setTime(j);
        OooO00o = j;
        String format = f21995OooO00o.format(f21996OooO00o);
        OooO0O0 = format;
        return format;
    }

    public static String OooO00o(String str, String str2, String str3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        sb.append(": ");
        sb.append(str3);
        sb.append("\r\n");
        if (th != null) {
            sb.append(Log.getStackTraceString(th));
            sb.append("\r\n");
        }
        return sb.toString();
    }

    public static String OooO00o(String str) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("_");
        }
        sb.append(f21997OooO0O0.format(new Date()));
        sb.append(".log");
        return sb.toString();
    }
}
