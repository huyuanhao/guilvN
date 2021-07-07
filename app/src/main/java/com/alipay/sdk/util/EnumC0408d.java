package com.alipay.sdk.util;

/* renamed from: com.alipay.sdk.util.d */
public enum EnumC0408d {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NONE(-1, "none");
    

    /* renamed from: p */
    public int f939p;

    /* renamed from: q */
    public String f940q;

    /* access modifiers changed from: public */
    EnumC0408d(int i, String str) {
        this.f939p = i;
        this.f940q = str;
    }

    /* renamed from: a */
    public final int mo4244a() {
        return this.f939p;
    }

    /* renamed from: b */
    public final String mo4245b() {
        return this.f940q;
    }

    /* renamed from: a */
    public static EnumC0408d m838a(int i) {
        EnumC0408d[] values = values();
        for (EnumC0408d dVar : values) {
            if (dVar.mo4244a() == i) {
                return dVar;
            }
        }
        return NONE;
    }
}
