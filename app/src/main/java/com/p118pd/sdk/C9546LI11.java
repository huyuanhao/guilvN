package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.丨L丨I11  reason: invalid class name and case insensitive filesystem */
public final class C9546LI11 implements AbstractC9486LL1iI1L {
    public static final Map<String, C9546LI11> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f23115OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f23116OooO00o;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m21605OooO00o(LL1i.OooO0Oo, 32, 16, 67), new C9546LI11(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(m21605OooO00o(LL1i.f16408OooO0o, 64, 16, 131), new C9546LI11(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(m21605OooO00o("SHAKE128", 32, 16, 67), new C9546LI11(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(m21605OooO00o("SHAKE256", 64, 16, 131), new C9546LI11(67108868, "WOTSP_SHAKE256_W16"));
        OooO00o = Collections.unmodifiableMap(hashMap);
    }

    public C9546LI11(int i, String str) {
        this.f23115OooO00o = i;
        this.f23116OooO00o = str;
    }

    public static C9546LI11 OooO00o(String str, int i, int i2, int i3) {
        if (str != null) {
            return OooO00o.get(m21605OooO00o(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m21605OooO00o(String str, int i, int i2, int i3) {
        if (str != null) {
            return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i3;
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // com.p118pd.sdk.AbstractC9486LL1iI1L
    public int OooO00o() {
        return this.f23115OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9486LL1iI1L
    public String toString() {
        return this.f23116OooO00o;
    }
}
