package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.iLi丨  reason: invalid class name and case insensitive filesystem */
public class C6184iLi {
    public static final Map OooO00o;

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5711LiLli.Oooooo, I11I.OooO00o(20));
        OooO00o.put(AbstractC5711LiLli.Ooooooo, I11I.OooO00o(32));
        OooO00o.put(AbstractC5711LiLli.ooOO, I11I.OooO00o(64));
        OooO00o.put(AbstractC5711LiLli.OoooooO, I11I.OooO00o(28));
        OooO00o.put(AbstractC5711LiLli.o0OoOo0, I11I.OooO00o(48));
        OooO00o.put(AbstractC5905LllI.OooOOOO, I11I.OooO00o(28));
        OooO00o.put(AbstractC5905LllI.OooOOOo, I11I.OooO00o(32));
        OooO00o.put(AbstractC5905LllI.OooOOo0, I11I.OooO00o(48));
        OooO00o.put(AbstractC5905LllI.OooOOo, I11I.OooO00o(64));
        OooO00o.put(AbstractC5331ILi.OooO0OO, I11I.OooO00o(32));
    }

    public static int OooO00o(LlLI1 llLI1) {
        if (OooO00o.containsKey(llLI1)) {
            return ((Integer) OooO00o.get(llLI1)).intValue();
        }
        throw new IllegalStateException("no salt size for algorithm: " + llLI1);
    }
}
