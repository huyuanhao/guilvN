package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.lil1Il1 */
public class lil1Il1 {
    public static Map<LlLI1, String> OooO00o;

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5711LiLli.OooooOO, "MD2");
        OooO00o.put(AbstractC5711LiLli.OooooOo, "MD4");
        OooO00o.put(AbstractC5711LiLli.Oooooo0, "MD5");
        OooO00o.put(AbstractC9733l.OooO, LL1i.OooO0O0);
        OooO00o.put(AbstractC5905LllI.OooO0o, LL1i.OooO0OO);
        OooO00o.put(AbstractC5905LllI.OooO0OO, LL1i.OooO0Oo);
        OooO00o.put(AbstractC5905LllI.OooO0Oo, LL1i.f16409OooO0o0);
        OooO00o.put(AbstractC5905LllI.OooO0o0, LL1i.f16408OooO0o);
        OooO00o.put(AbstractC9468L1lL.OooO0OO, "RIPEMD-128");
        OooO00o.put(AbstractC9468L1lL.OooO0O0, "RIPEMD-160");
        OooO00o.put(AbstractC9468L1lL.OooO0Oo, "RIPEMD-128");
        OooO00o.put(AbstractC9849l1i1L.OooO0Oo, "RIPEMD-128");
        OooO00o.put(AbstractC9849l1i1L.OooO0OO, "RIPEMD-160");
        OooO00o.put(AbstractC5331ILi.OooO0O0, "GOST3411");
        OooO00o.put(iI1ILI.OooO0oO, "Tiger");
        OooO00o.put(AbstractC9849l1i1L.OooO0o0, "Whirlpool");
        OooO00o.put(AbstractC5905LllI.OooO, "SHA3-224");
        OooO00o.put(AbstractC5905LllI.OooOO0, C6229iiIL.OooO0OO);
        OooO00o.put(AbstractC5905LllI.OooOO0O, "SHA3-384");
        OooO00o.put(AbstractC5905LllI.OooOO0o, "SHA3-512");
        OooO00o.put(AbstractC6041i1l.Ooooo00, "SM3");
    }

    public static String OooO00o(LlLI1 llLI1) {
        String str = OooO00o.get(llLI1);
        return str != null ? str : llLI1.m16387OooO0O0();
    }
}
