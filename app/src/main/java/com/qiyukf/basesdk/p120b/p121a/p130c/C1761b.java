package com.qiyukf.basesdk.p120b.p121a.p130c;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import anet.channel.util.HttpConstant;
import com.facebook.react.views.text.FontMetricsUtil;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.C1708a;

/* renamed from: com.qiyukf.basesdk.b.a.c.b */
public final class C1761b {

    /* renamed from: com.qiyukf.basesdk.b.a.c.b$1 */
    public static /* synthetic */ class C17621 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3247a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.qiyukf.basesdk.b.a.c.c[] r0 = com.qiyukf.basesdk.p120b.p121a.p130c.EnumC1763c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.basesdk.p120b.p121a.p130c.C1761b.C17621.f3247a = r0
                com.qiyukf.basesdk.b.a.c.c r1 = com.qiyukf.basesdk.p120b.p121a.p130c.EnumC1763c.Internal     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.qiyukf.basesdk.p120b.p121a.p130c.C1761b.C17621.f3247a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.qiyukf.basesdk.b.a.c.c r1 = com.qiyukf.basesdk.p120b.p121a.p130c.EnumC1763c.Crop     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.qiyukf.basesdk.p120b.p121a.p130c.C1761b.C17621.f3247a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.qiyukf.basesdk.b.a.c.c r1 = com.qiyukf.basesdk.p120b.p121a.p130c.EnumC1763c.External     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p130c.C1761b.C17621.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static String m3244a() {
        return "vframe=" + 1;
    }

    /* renamed from: a */
    public static final String m3245a(String str) {
        if (TextUtils.isEmpty(null) || C1708a.m3005d() == null || TextUtils.isEmpty(C1708a.m3005d().nosDownload)) {
            return str;
        }
        try {
            String substring = str.substring(0, str.indexOf(C8932ooOOO0o.OooO0OO, str.indexOf(HttpConstant.SCHEME_SPLIT) + 3));
            return substring.endsWith(C1708a.m3005d().nosDownload) ? str.replace(substring, (CharSequence) null) : str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static final String m3246a(String str, int i, int i2) {
        String str2;
        int i3;
        EnumC1763c cVar = EnumC1763c.Internal;
        if (i2 > 0 && i > 0) {
            cVar = (i > i2 ? i / i2 : i2 / i) > 4 ? EnumC1763c.External : EnumC1763c.Internal;
        }
        int c = C1708a.m3004c();
        if (c <= 0) {
            DisplayMetrics displayMetrics = C1708a.m3001a().getResources().getDisplayMetrics();
            c = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 2;
        }
        boolean z = false;
        if (c >= 0 && c >= 0 && ((i3 = C17621.f3247a[cVar.ordinal()]) == 1 ? c > 0 || c > 0 : (i3 == 2 || i3 == 3) && c > 0 && c > 0)) {
            z = true;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("thumbnail=");
            sb.append(c);
            int i4 = C17621.f3247a[cVar.ordinal()];
            if (i4 == 1) {
                str2 = FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT;
            } else if (i4 == 2) {
                str2 = "y";
            } else if (i4 == 3) {
                str2 = "z";
            } else {
                throw new IllegalArgumentException("thumb: " + cVar);
            }
            sb.append(str2);
            sb.append(c);
            sb.append("&imageView&type=jpg");
            if (str.contains(C8932ooOOO0o.f22176OooO00o)) {
                return str + "&" + sb.toString();
            }
            return str + C8932ooOOO0o.f22176OooO00o + sb.toString();
        }
        throw new IllegalArgumentException("width=" + c + ", height=" + c);
    }

    /* renamed from: b */
    public static final String m3247b(String str) {
        if (str.contains(C8932ooOOO0o.f22176OooO00o)) {
            return str + "&" + m3244a();
        }
        return str + C8932ooOOO0o.f22176OooO00o + m3244a();
    }
}
