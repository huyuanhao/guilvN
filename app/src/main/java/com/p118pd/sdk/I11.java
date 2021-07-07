package com.p118pd.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.I11 */
public class I11 {
    public static final int OooO = 14540;
    public static final int OooO00o = 188;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, Integer> f15269OooO00o;
    public static final int OooO0O0 = 12748;
    public static final int OooO0OO = 13004;
    public static final int OooO0Oo = 13260;
    public static final int OooO0o = 13772;
    public static final int OooO0o0 = 13516;
    public static final int OooO0oO = 14028;
    public static final int OooO0oo = 14284;
    public static final int OooOO0 = 14796;
    public static final int OooOO0O = 15052;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("RIPEMD128", I11I.OooO00o(13004));
        hashMap.put("RIPEMD160", I11I.OooO00o(12748));
        hashMap.put(LL1i.OooO0O0, I11I.OooO00o(13260));
        hashMap.put(LL1i.OooO0OO, I11I.OooO00o(14540));
        hashMap.put(LL1i.OooO0Oo, I11I.OooO00o(13516));
        hashMap.put(LL1i.f16409OooO0o0, I11I.OooO00o(14028));
        hashMap.put(LL1i.f16408OooO0o, I11I.OooO00o(13772));
        hashMap.put("SHA-512/224", I11I.OooO00o(OooOO0));
        hashMap.put("SHA-512/256", I11I.OooO00o(OooOO0O));
        hashMap.put("Whirlpool", I11I.OooO00o(14284));
        f15269OooO00o = Collections.unmodifiableMap(hashMap);
    }

    public static Integer OooO00o(AbstractC6436l11LI r1) {
        return f15269OooO00o.get(r1.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15211OooO00o(AbstractC6436l11LI r1) {
        return !f15269OooO00o.containsKey(r1.OooO00o());
    }
}
