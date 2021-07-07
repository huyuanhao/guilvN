package com.qiyukf.basesdk.p120b.p121a.p123b.p127d;

import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p128e.C1754c;

/* renamed from: com.qiyukf.basesdk.b.a.b.d.b */
public class C1751b {

    /* renamed from: a */
    public static final String f3233a = C1754c.m3225a(C1751b.class);

    /* renamed from: a */
    public static String m3209a(String str) {
        String str2 = f3233a;
        C1709a.m3018d(str2, "query lbs url: " + str);
        return str + "?version=1.0";
    }

    /* renamed from: a */
    public static String m3210a(String str, String str2, String str3, String str4) {
        String str5;
        if (str4 != null) {
            str5 = str2 + C8932ooOOO0o.OooO0OO + str3 + "?uploadContext&version=1.0&context=" + str4;
        } else {
            str5 = str2 + C8932ooOOO0o.OooO0OO + str3 + "?uploadContext&version=1.0";
        }
        return str + C8932ooOOO0o.OooO0OO + str5;
    }

    /* renamed from: a */
    public static String m3211a(String str, String str2, String str3, String str4, long j, boolean z) {
        String str5;
        if (str4 != null) {
            str5 = str2 + C8932ooOOO0o.OooO0OO + str3 + "?version=1.0&context=" + str4 + "&offset=" + j + "&complete=" + z;
        } else {
            str5 = str2 + C8932ooOOO0o.OooO0OO + str3 + "?version=1.0&offset=" + j + "&complete=" + z;
        }
        C1709a.m3018d(f3233a, "post data url server: " + str + ", query string: " + str5);
        return str + C8932ooOOO0o.OooO0OO + str5;
    }
}
