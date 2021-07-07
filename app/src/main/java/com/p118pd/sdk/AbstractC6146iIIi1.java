package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iI丨丨丨Ii1  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6146iIIi1 extends II1ii1 {
    public void OooO00o(l1I1L r3, String str, LlLI1 llLI1) {
        String str2 = "HMAC" + str;
        r3.addAlgorithm("Alg.Alias.Mac." + llLI1, str2);
        r3.addAlgorithm("Alg.Alias.KeyGenerator." + llLI1, str2);
    }

    public void OooO00o(l1I1L r4, String str, String str2, String str3) {
        String str4 = "HMAC" + str;
        r4.addAlgorithm("Mac." + str4, str2);
        r4.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, str4);
        r4.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, str4);
        r4.addAlgorithm("KeyGenerator." + str4, str3);
        r4.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, str4);
        r4.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, str4);
    }
}
