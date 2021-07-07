package com.p118pd.sdk;

import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey;

/* renamed from: com.pd.sdk.Iil11  reason: case insensitive filesystem */
public final class C5382Iil11 {
    public static l11ILi OooO00o(C93221 r0, l11ILi l11ili, l11ILi l11ili2) {
        return (l11ILi) r0.m21358OooO00o().OooO0OO(l11ili).OooO00o(l11ili2);
    }

    public static l11ILi OooO00o(BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey, l11ILi l11ili, l11ILi l11ili2) {
        return (l11ILi) bCMcElieceCCA2PublicKey.getG().OooO0OO(l11ili).OooO00o(l11ili2);
    }

    public static l11ILi[] OooO00o(C9844iLi r6, l11ILi l11ili) {
        int OooO00o = r6.OooO00o();
        C6051i1lli OooO00o2 = r6.m21928OooO00o();
        Ll111 OooO00o3 = r6.m21927OooO00o();
        C5585L1L OooO00o4 = r6.m21926OooO00o();
        llILLI1 OooO00o5 = r6.m21929OooO00o();
        C5585L1L[] OooO00o6 = r6.m21930OooO00o();
        l11ILi l11ili2 = (l11ILi) l11ili.OooO00o(OooO00o2.OooO00o());
        l11ILi OooO00o7 = C5786LlL.OooO00o((l11ILi) OooO00o5.OooO0O0(l11ili2), OooO00o3, OooO00o4, OooO00o6);
        return new l11ILi[]{((l11ILi) ((l11ILi) l11ili2.OooO00o(OooO00o7)).OooO00o(OooO00o2)).OooO0O0(OooO00o), (l11ILi) OooO00o7.OooO00o(OooO00o2)};
    }

    public static l11ILi[] OooO00o(BCMcElieceCCA2PrivateKey bCMcElieceCCA2PrivateKey, l11ILi l11ili) {
        int k = bCMcElieceCCA2PrivateKey.getK();
        C6051i1lli p = bCMcElieceCCA2PrivateKey.getP();
        Ll111 field = bCMcElieceCCA2PrivateKey.getField();
        C5585L1L goppaPoly = bCMcElieceCCA2PrivateKey.getGoppaPoly();
        llILLI1 h = bCMcElieceCCA2PrivateKey.getH();
        C5585L1L[] qInv = bCMcElieceCCA2PrivateKey.getQInv();
        l11ILi l11ili2 = (l11ILi) l11ili.OooO00o(p.OooO00o());
        l11ILi OooO00o = C5786LlL.OooO00o((l11ILi) h.OooO0O0(l11ili2), field, goppaPoly, qInv);
        return new l11ILi[]{((l11ILi) ((l11ILi) l11ili2.OooO00o(OooO00o)).OooO00o(p)).OooO0O0(k), (l11ILi) OooO00o.OooO00o(p)};
    }
}
