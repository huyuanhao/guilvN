package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ab */
public class C4244ab {

    /* renamed from: a */
    public static int f11340a;

    /* renamed from: a */
    public static final String f11341a;

    /* renamed from: a */
    public static final boolean f11342a;

    /* renamed from: b */
    public static final boolean f11343b;

    /* renamed from: c */
    public static final boolean f11344c = "LOGABLE".equalsIgnoreCase(f11341a);

    /* renamed from: d */
    public static final boolean f11345d = f11341a.contains("YY");

    /* renamed from: e */
    public static boolean f11346e = f11341a.equalsIgnoreCase("TEST");

    /* renamed from: f */
    public static final boolean f11347f = "BETA".equalsIgnoreCase(f11341a);

    /* renamed from: g */
    public static final boolean f11348g;

    static {
        int i;
        String str = C4247ae.f11350a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f11341a = str;
        boolean contains = str.contains("2A2FE0D7");
        f11342a = contains;
        boolean z = false;
        f11343b = contains || "DEBUG".equalsIgnoreCase(f11341a);
        String str2 = f11341a;
        if (str2 != null && str2.startsWith("RC")) {
            z = true;
        }
        f11348g = z;
        f11340a = 1;
        if (f11341a.equalsIgnoreCase("SANDBOX")) {
            i = 2;
        } else if (f11341a.equalsIgnoreCase("ONEBOX")) {
            i = 3;
        } else {
            f11340a = 1;
            return;
        }
        f11340a = i;
    }

    /* renamed from: a */
    public static int m11626a() {
        return f11340a;
    }

    /* renamed from: a */
    public static void m11627a(int i) {
        f11340a = i;
    }

    /* renamed from: a */
    public static boolean m11628a() {
        return f11340a == 2;
    }

    /* renamed from: b */
    public static boolean m11629b() {
        return f11340a == 3;
    }
}
