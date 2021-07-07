package com.qiyukf.basesdk.p138c.p139a;

import java.util.Locale;

/* renamed from: com.qiyukf.basesdk.c.a.b */
public final class C1807b {

    /* renamed from: com.qiyukf.basesdk.c.a.b$1 */
    public static /* synthetic */ class C18081 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3333a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        static {
            /*
                int[] r0 = com.qiyukf.basesdk.p138c.p139a.C1807b.EnumC1809a.m3418a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.basesdk.p138c.p139a.C1807b.C18081.f3333a = r0
                r1 = 1
                int r2 = com.qiyukf.basesdk.p138c.p139a.C1807b.EnumC1809a.f3335b     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = com.qiyukf.basesdk.p138c.p139a.C1807b.C18081.f3333a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.qiyukf.basesdk.p138c.p139a.C1807b.EnumC1809a.f3336c     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = com.qiyukf.basesdk.p138c.p139a.C1807b.C18081.f3333a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.qiyukf.basesdk.p138c.p139a.C1807b.EnumC1809a.f3337d     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = com.qiyukf.basesdk.p138c.p139a.C1807b.C18081.f3333a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.qiyukf.basesdk.p138c.p139a.C1807b.EnumC1809a.f3338e     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r0 = com.qiyukf.basesdk.p138c.p139a.C1807b.C18081.f3333a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = com.qiyukf.basesdk.p138c.p139a.C1807b.EnumC1809a.f3334a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = r2 - r1
                r1 = 5
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p139a.C1807b.C18081.<clinit>():void");
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.qiyukf.basesdk.c.a.b$a */
    public static final class EnumC1809a extends Enum<EnumC1809a> {

        /* renamed from: a */
        public static final int f3334a = 1;

        /* renamed from: b */
        public static final int f3335b = 2;

        /* renamed from: c */
        public static final int f3336c = 3;

        /* renamed from: d */
        public static final int f3337d = 4;

        /* renamed from: e */
        public static final int f3338e = 5;

        /* renamed from: f */
        public static final int f3339f = 6;

        /* renamed from: g */
        public static final /* synthetic */ int[] f3340g = {1, 2, 3, 4, 5, 6};

        /* renamed from: a */
        public static int[] m3418a() {
            return (int[]) f3340g.clone();
        }
    }

    /* renamed from: a */
    public static String m3415a(long j) {
        int i = EnumC1809a.f3339f;
        if (i == i) {
            double d = (double) j;
            i = d < 1024.0d ? EnumC1809a.f3334a : d < 1048576.0d ? EnumC1809a.f3335b : d < 1.073741824E9d ? EnumC1809a.f3336c : d < 1.099511627776E12d ? EnumC1809a.f3337d : EnumC1809a.f3338e;
        }
        int i2 = C18081.f3333a[i - 1];
        if (i2 == 1) {
            Locale locale = Locale.US;
            double d2 = (double) j;
            Double.isNaN(d2);
            return String.format(locale, "%d KB", Integer.valueOf((int) (d2 / 1024.0d)));
        } else if (i2 == 2) {
            Locale locale2 = Locale.US;
            double d3 = (double) j;
            Double.isNaN(d3);
            return String.format(locale2, "%.1f MB", Double.valueOf(d3 / 1048576.0d));
        } else if (i2 == 3) {
            Locale locale3 = Locale.US;
            double d4 = (double) j;
            Double.isNaN(d4);
            return String.format(locale3, "%.1f GB", Double.valueOf(d4 / 1.073741824E9d));
        } else if (i2 != 4) {
            return j + " B";
        } else {
            Locale locale4 = Locale.US;
            double d5 = (double) j;
            Double.isNaN(d5);
            return String.format(locale4, "%.1f PB", Double.valueOf(d5 / 1.099511627776E12d));
        }
    }

    /* renamed from: a */
    public static String m3416a(String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf >= str.length() + -1) ? "" : str.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    public static String m3417b(String str) {
        int lastIndexOf;
        return (str == null || str.length() <= 0 || (lastIndexOf = str.lastIndexOf(47)) < 0 || lastIndexOf >= str.length() + -1) ? str : str.substring(lastIndexOf + 1);
    }
}
