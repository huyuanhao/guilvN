package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.iI丨Li  reason: invalid class name and case insensitive filesystem */
public final class C6138iILi implements AbstractC9486LL1iI1L {
    public static final Map<String, C6138iILi> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f17642OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f17643OooO00o;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m17041OooO00o(LL1i.OooO0Oo, 32, 16, 67, 10), new C6138iILi(16777217, "XMSS_SHA2-256_W16_H10"));
        hashMap.put(m17041OooO00o(LL1i.OooO0Oo, 32, 16, 67, 16), new C6138iILi(33554434, "XMSS_SHA2-256_W16_H16"));
        hashMap.put(m17041OooO00o(LL1i.OooO0Oo, 32, 16, 67, 20), new C6138iILi(50331651, "XMSS_SHA2-256_W16_H20"));
        hashMap.put(m17041OooO00o(LL1i.f16408OooO0o, 64, 16, 131, 10), new C6138iILi(67108868, "XMSS_SHA2-512_W16_H10"));
        hashMap.put(m17041OooO00o(LL1i.f16408OooO0o, 64, 16, 131, 16), new C6138iILi(83886085, "XMSS_SHA2-512_W16_H16"));
        hashMap.put(m17041OooO00o(LL1i.f16408OooO0o, 64, 16, 131, 20), new C6138iILi(100663302, "XMSS_SHA2-512_W16_H20"));
        hashMap.put(m17041OooO00o("SHAKE128", 32, 16, 67, 10), new C6138iILi(117440519, "XMSS_SHAKE128_W16_H10"));
        hashMap.put(m17041OooO00o("SHAKE128", 32, 16, 67, 16), new C6138iILi(134217736, "XMSS_SHAKE128_W16_H16"));
        hashMap.put(m17041OooO00o("SHAKE128", 32, 16, 67, 20), new C6138iILi(150994953, "XMSS_SHAKE128_W16_H20"));
        hashMap.put(m17041OooO00o("SHAKE256", 64, 16, 131, 10), new C6138iILi(167772170, "XMSS_SHAKE256_W16_H10"));
        hashMap.put(m17041OooO00o("SHAKE256", 64, 16, 131, 16), new C6138iILi(184549387, "XMSS_SHAKE256_W16_H16"));
        hashMap.put(m17041OooO00o("SHAKE256", 64, 16, 131, 20), new C6138iILi(201326604, "XMSS_SHAKE256_W16_H20"));
        OooO00o = Collections.unmodifiableMap(hashMap);
    }

    public C6138iILi(int i, String str) {
        this.f17642OooO00o = i;
        this.f17643OooO00o = str;
    }

    public static C6138iILi OooO00o(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return OooO00o.get(m17041OooO00o(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m17041OooO00o(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i3 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i4;
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // com.p118pd.sdk.AbstractC9486LL1iI1L
    public int OooO00o() {
        return this.f17642OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9486LL1iI1L
    public String toString() {
        return this.f17643OooO00o;
    }
}
