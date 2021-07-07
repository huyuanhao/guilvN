package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ILiI  reason: case insensitive filesystem */
public abstract class AbstractC5307ILiI extends II1ii1 {
    public void OooO00o(l1I1L r4, String str, String str2, String str3) {
        r4.addAlgorithm("Mac." + str + "-CMAC", str2);
        r4.addAlgorithm("Alg.Alias.Mac." + str + "CMAC", str + "-CMAC");
        r4.addAlgorithm("KeyGenerator." + str + "-CMAC", str3);
        r4.addAlgorithm("Alg.Alias.KeyGenerator." + str + "CMAC", str + "-CMAC");
    }

    public void OooO0O0(l1I1L r4, String str, String str2, String str3) {
        r4.addAlgorithm("Mac." + str + "-GMAC", str2);
        r4.addAlgorithm("Alg.Alias.Mac." + str + "GMAC", str + "-GMAC");
        r4.addAlgorithm("KeyGenerator." + str + "-GMAC", str3);
        r4.addAlgorithm("Alg.Alias.KeyGenerator." + str + "GMAC", str + "-GMAC");
    }

    public void OooO0OO(l1I1L r3, String str, String str2, String str3) {
        r3.addAlgorithm("Mac.POLY1305-" + str, str2);
        r3.addAlgorithm("Alg.Alias.Mac.POLY1305" + str, "POLY1305-" + str);
        r3.addAlgorithm("KeyGenerator.POLY1305-" + str, str3);
        r3.addAlgorithm("Alg.Alias.KeyGenerator.POLY1305" + str, "POLY1305-" + str);
    }
}
