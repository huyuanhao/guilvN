package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.IlLiI  reason: case insensitive filesystem */
public class C5453IlLiI {
    public static final Map OooO00o;

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5711LiLli.Oooooo, "PBKDF2withHMACSHA1");
        OooO00o.put(AbstractC5711LiLli.Ooooooo, "PBKDF2withHMACSHA256");
        OooO00o.put(AbstractC5711LiLli.ooOO, "PBKDF2withHMACSHA512");
        OooO00o.put(AbstractC5711LiLli.OoooooO, "PBKDF2withHMACSHA224");
        OooO00o.put(AbstractC5711LiLli.o0OoOo0, "PBKDF2withHMACSHA384");
        OooO00o.put(AbstractC5905LllI.OooOOOO, "PBKDF2withHMACSHA3-224");
        OooO00o.put(AbstractC5905LllI.OooOOOo, "PBKDF2withHMACSHA3-256");
        OooO00o.put(AbstractC5905LllI.OooOOo0, "PBKDF2withHMACSHA3-384");
        OooO00o.put(AbstractC5905LllI.OooOOo, "PBKDF2withHMACSHA3-512");
        OooO00o.put(AbstractC5331ILi.OooO0OO, "PBKDF2withHMACGOST3411");
    }

    public static String OooO00o(LlLI1 llLI1) {
        if (OooO00o.containsKey(llLI1)) {
            return (String) OooO00o.get(llLI1);
        }
        throw new IllegalStateException("no prf for algorithm: " + llLI1);
    }
}
