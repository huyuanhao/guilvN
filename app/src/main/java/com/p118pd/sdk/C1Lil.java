package com.p118pd.sdk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.丨1Lil  reason: invalid class name */
public final class C1Lil {
    public static final Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set f22785OooO00o = new HashSet();
    public static final Set OooO0O0 = new HashSet();

    static {
        f22785OooO00o.add(AbstractC5711LiLli.OoooO0);
        f22785OooO00o.add(AbstractC5711LiLli.OoooO0O);
        f22785OooO00o.add(AbstractC5711LiLli.OoooO);
        f22785OooO00o.add(AbstractC5711LiLli.OoooOO0);
        f22785OooO00o.add(AbstractC5711LiLli.o000oOoO);
        f22785OooO00o.add(AbstractC5711LiLli.OoooOOO);
        OooO0O0.add(AbstractC5711LiLli.OoooOOo);
        OooO0O0.add(AbstractC5711LiLli.OoooOoo);
        OooO0O0.add(AbstractC5905LllI.OooOo0);
        OooO0O0.add(AbstractC5905LllI.OooOoo);
        OooO0O0.add(AbstractC5905LllI.Oooo0OO);
        OooO00o.put(AbstractC5711LiLli.OoooOoo.m16387OooO0O0(), I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.OooOo0.m16387OooO0O0(), I11I.OooO00o(128));
        OooO00o.put(AbstractC5905LllI.OooOoo.m16387OooO0O0(), I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.Oooo0OO.m16387OooO0O0(), I11I.OooO00o(256));
    }

    public static int OooO00o(String str) {
        if (OooO00o.containsKey(str)) {
            return ((Integer) OooO00o.get(str)).intValue();
        }
        throw new IllegalStateException("no key size for algorithm: " + str);
    }

    public static boolean OooO00o(LlLI1 llLI1) {
        return llLI1.m16387OooO0O0().startsWith(AbstractC5711LiLli.o000o0O.m16387OooO0O0());
    }

    public static boolean OooO0O0(LlLI1 llLI1) {
        return f22785OooO00o.contains(llLI1);
    }

    public static boolean OooO0OO(LlLI1 llLI1) {
        return OooO0O0.contains(llLI1);
    }
}
