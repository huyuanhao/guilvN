package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.mipush.sdk.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzeo {
    public static final zzeo zzti = new zzeo();
    public final String zztj;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzeo() {
        /*
            r4 = this;
            java.lang.String r0 = "java.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "9"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "9.0.0"
            goto L_0x0015
        L_0x0011:
            java.lang.String r0 = zzq(r0)
        L_0x0015:
            com.google.android.gms.internal.firebase_ml.zzkz r1 = com.google.android.gms.internal.firebase_ml.zzkz.OS_NAME
            java.lang.String r1 = r1.value()
            com.google.android.gms.internal.firebase_ml.zzkz r2 = com.google.android.gms.internal.firebase_ml.zzkz.OS_VERSION
            java.lang.String r2 = r2.value()
            java.lang.String r3 = com.google.android.gms.internal.firebase_ml.zzeh.VERSION
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzeo.<init>():void");
    }

    public static zzeo zzeq() {
        return zzti;
    }

    public static String zzp(String str) {
        return str.toLowerCase().replaceAll("[^\\w\\d\\-]", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    public static String zzq(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
        return matcher.find() ? matcher.group(1) : str;
    }

    public final String zzo(String str) {
        return String.format(this.zztj, zzp(str));
    }

    public zzeo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("java/");
        sb.append(zzq(str));
        sb.append(" http-google-%s/");
        sb.append(zzq(str4));
        if (!(str2 == null || str3 == null)) {
            sb.append(" ");
            sb.append(zzp(str2));
            sb.append(C8932ooOOO0o.OooO0OO);
            sb.append(zzq(str3));
        }
        this.zztj = sb.toString();
    }
}
