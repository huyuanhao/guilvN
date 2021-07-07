package com.p118pd.sdk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.Iil  reason: case insensitive filesystem */
public class C5380Iil implements AbstractC9554Li {
    public static final LlLI1 OooO00o = AbstractC5711LiLli.OooOoO0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map f15734OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Set f15735OooO00o = new HashSet();
    public static final LlLI1 OooO0O0 = AbstractC5420Il1iIL.o00OoOoO;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Map f15736OooO0O0 = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Set f15737OooO0O0 = new HashSet();
    public static final LlLI1 OooO0OO = AbstractC5420Il1iIL.o00O0o0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static Map f15738OooO0OO = new HashMap();
    public static final LlLI1 OooO0Oo = AbstractC5711LiLli.Oooo00o;
    public static final LlLI1 OooO0o = AbstractC5331ILi.OooOOO0;
    public static final LlLI1 OooO0o0 = AbstractC5331ILi.OooOO0o;
    public static final LlLI1 OooO0oO = LLiII.OooO0oO;
    public static final LlLI1 OooO0oo = LLiII.OooO0oo;

    static {
        f15734OooO00o.put("MD2WITHRSAENCRYPTION", AbstractC5711LiLli.OooOoO);
        f15734OooO00o.put("MD2WITHRSA", AbstractC5711LiLli.OooOoO);
        f15734OooO00o.put("MD5WITHRSAENCRYPTION", AbstractC5711LiLli.OooOoo0);
        f15734OooO00o.put("MD5WITHRSA", AbstractC5711LiLli.OooOoo0);
        f15734OooO00o.put("SHA1WITHRSAENCRYPTION", AbstractC5711LiLli.OooOoo);
        f15734OooO00o.put("SHA1WITHRSA", AbstractC5711LiLli.OooOoo);
        f15734OooO00o.put("SHA224WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0o0);
        f15734OooO00o.put("SHA224WITHRSA", AbstractC5711LiLli.Oooo0o0);
        f15734OooO00o.put("SHA256WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0);
        f15734OooO00o.put("SHA256WITHRSA", AbstractC5711LiLli.Oooo0);
        f15734OooO00o.put("SHA384WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0O0);
        f15734OooO00o.put("SHA384WITHRSA", AbstractC5711LiLli.Oooo0O0);
        f15734OooO00o.put("SHA512WITHRSAENCRYPTION", AbstractC5711LiLli.Oooo0OO);
        f15734OooO00o.put("SHA512WITHRSA", AbstractC5711LiLli.Oooo0OO);
        f15734OooO00o.put("SHA1WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA224WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA256WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA384WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA512WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA3-224WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA3-256WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA3-384WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("SHA3-512WITHRSAANDMGF1", AbstractC5711LiLli.Oooo00o);
        f15734OooO00o.put("RIPEMD160WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0o);
        f15734OooO00o.put("RIPEMD160WITHRSA", AbstractC9468L1lL.OooO0o);
        f15734OooO00o.put("RIPEMD128WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0oO);
        f15734OooO00o.put("RIPEMD128WITHRSA", AbstractC9468L1lL.OooO0oO);
        f15734OooO00o.put("RIPEMD256WITHRSAENCRYPTION", AbstractC9468L1lL.OooO0oo);
        f15734OooO00o.put("RIPEMD256WITHRSA", AbstractC9468L1lL.OooO0oo);
        f15734OooO00o.put("SHA1WITHDSA", AbstractC5420Il1iIL.o00OoOoO);
        f15734OooO00o.put("DSAWITHSHA1", AbstractC5420Il1iIL.o00OoOoO);
        f15734OooO00o.put("SHA224WITHDSA", AbstractC5905LllI.OoooO);
        f15734OooO00o.put("SHA256WITHDSA", AbstractC5905LllI.OoooOO0);
        f15734OooO00o.put("SHA384WITHDSA", AbstractC5905LllI.o000oOoO);
        f15734OooO00o.put("SHA512WITHDSA", AbstractC5905LllI.OoooOOO);
        f15734OooO00o.put("SHA3-224WITHDSA", AbstractC5905LllI.OoooOOo);
        f15734OooO00o.put("SHA3-256WITHDSA", AbstractC5905LllI.OoooOo0);
        f15734OooO00o.put("SHA3-384WITHDSA", AbstractC5905LllI.OoooOoO);
        f15734OooO00o.put("SHA3-512WITHDSA", AbstractC5905LllI.OoooOoo);
        f15734OooO00o.put("SHA3-224WITHECDSA", AbstractC5905LllI.Ooooo00);
        f15734OooO00o.put("SHA3-256WITHECDSA", AbstractC5905LllI.Ooooo0o);
        f15734OooO00o.put("SHA3-384WITHECDSA", AbstractC5905LllI.OooooO0);
        f15734OooO00o.put("SHA3-512WITHECDSA", AbstractC5905LllI.OooooOO);
        f15734OooO00o.put("SHA3-224WITHRSA", AbstractC5905LllI.OooooOo);
        f15734OooO00o.put("SHA3-256WITHRSA", AbstractC5905LllI.Oooooo0);
        f15734OooO00o.put("SHA3-384WITHRSA", AbstractC5905LllI.Oooooo);
        f15734OooO00o.put("SHA3-512WITHRSA", AbstractC5905LllI.OoooooO);
        f15734OooO00o.put("SHA3-224WITHRSAENCRYPTION", AbstractC5905LllI.OooooOo);
        f15734OooO00o.put("SHA3-256WITHRSAENCRYPTION", AbstractC5905LllI.Oooooo0);
        f15734OooO00o.put("SHA3-384WITHRSAENCRYPTION", AbstractC5905LllI.Oooooo);
        f15734OooO00o.put("SHA3-512WITHRSAENCRYPTION", AbstractC5905LllI.OoooooO);
        f15734OooO00o.put("SHA1WITHECDSA", AbstractC5420Il1iIL.o00O0o0);
        f15734OooO00o.put("ECDSAWITHSHA1", AbstractC5420Il1iIL.o00O0o0);
        f15734OooO00o.put("SHA224WITHECDSA", AbstractC5420Il1iIL.o00O0oO);
        f15734OooO00o.put("SHA256WITHECDSA", AbstractC5420Il1iIL.o00O0oOO);
        f15734OooO00o.put("SHA384WITHECDSA", AbstractC5420Il1iIL.o00O0oOo);
        f15734OooO00o.put("SHA512WITHECDSA", AbstractC5420Il1iIL.o00O0oo0);
        f15734OooO00o.put("GOST3411WITHGOST3410", AbstractC5331ILi.OooOOO);
        f15734OooO00o.put("GOST3411WITHGOST3410-94", AbstractC5331ILi.OooOOO);
        f15734OooO00o.put("GOST3411WITHECGOST3410", AbstractC5331ILi.OooOOOO);
        f15734OooO00o.put("GOST3411WITHECGOST3410-2001", AbstractC5331ILi.OooOOOO);
        f15734OooO00o.put("GOST3411WITHGOST3410-2001", AbstractC5331ILi.OooOOOO);
        f15734OooO00o.put("GOST3411WITHECGOST3410-2012-256", LLiII.OooO);
        f15734OooO00o.put("GOST3411WITHECGOST3410-2012-512", LLiII.OooOO0);
        f15734OooO00o.put("GOST3411WITHGOST3410-2012-256", LLiII.OooO);
        f15734OooO00o.put("GOST3411WITHGOST3410-2012-512", LLiII.OooOO0);
        f15734OooO00o.put("GOST3411-2012-256WITHECGOST3410-2012-256", LLiII.OooO);
        f15734OooO00o.put("GOST3411-2012-512WITHECGOST3410-2012-512", LLiII.OooOO0);
        f15734OooO00o.put("GOST3411-2012-256WITHGOST3410-2012-256", LLiII.OooO);
        f15734OooO00o.put("GOST3411-2012-512WITHGOST3410-2012-512", LLiII.OooOO0);
        f15734OooO00o.put("SHA1WITHPLAIN-ECDSA", LIiiILi.OooO0Oo);
        f15734OooO00o.put("SHA224WITHPLAIN-ECDSA", LIiiILi.OooO0o0);
        f15734OooO00o.put("SHA256WITHPLAIN-ECDSA", LIiiILi.OooO0o);
        f15734OooO00o.put("SHA384WITHPLAIN-ECDSA", LIiiILi.OooO0oO);
        f15734OooO00o.put("SHA512WITHPLAIN-ECDSA", LIiiILi.OooO0oo);
        f15734OooO00o.put("RIPEMD160WITHPLAIN-ECDSA", LIiiILi.OooO);
        f15734OooO00o.put("SHA1WITHCVC-ECDSA", AbstractC9525LlI1.OooOOoo);
        f15734OooO00o.put("SHA224WITHCVC-ECDSA", AbstractC9525LlI1.OooOo00);
        f15734OooO00o.put("SHA256WITHCVC-ECDSA", AbstractC9525LlI1.OooOo0);
        f15734OooO00o.put("SHA384WITHCVC-ECDSA", AbstractC9525LlI1.OooOo0O);
        f15734OooO00o.put("SHA512WITHCVC-ECDSA", AbstractC9525LlI1.OooOo0o);
        f15734OooO00o.put("SHA3-512WITHSPHINCS256", AbstractC5701Li1l.OooOo0O);
        f15734OooO00o.put("SHA512WITHSPHINCS256", AbstractC5701Li1l.OooOo0);
        f15734OooO00o.put("SM3WITHSM2", AbstractC6041i1l.OooooO0);
        f15734OooO00o.put("SHA256WITHXMSS", AbstractC5701Li1l.OooOo);
        f15734OooO00o.put("SHA512WITHXMSS", AbstractC5701Li1l.OooOoO0);
        f15734OooO00o.put("SHAKE128WITHXMSS", AbstractC5701Li1l.OooOoO);
        f15734OooO00o.put("SHAKE256WITHXMSS", AbstractC5701Li1l.OooOoOO);
        f15734OooO00o.put("SHA256WITHXMSSMT", AbstractC5701Li1l.OooOoo);
        f15734OooO00o.put("SHA512WITHXMSSMT", AbstractC5701Li1l.OooOooO);
        f15734OooO00o.put("SHAKE128WITHXMSSMT", AbstractC5701Li1l.OooOooo);
        f15734OooO00o.put("SHAKE256WITHXMSSMT", AbstractC5701Li1l.Oooo000);
        f15735OooO00o.add(AbstractC5420Il1iIL.o00O0o0);
        f15735OooO00o.add(AbstractC5420Il1iIL.o00O0oO);
        f15735OooO00o.add(AbstractC5420Il1iIL.o00O0oOO);
        f15735OooO00o.add(AbstractC5420Il1iIL.o00O0oOo);
        f15735OooO00o.add(AbstractC5420Il1iIL.o00O0oo0);
        f15735OooO00o.add(AbstractC5420Il1iIL.o00OoOoO);
        f15735OooO00o.add(AbstractC5905LllI.OoooO);
        f15735OooO00o.add(AbstractC5905LllI.OoooOO0);
        f15735OooO00o.add(AbstractC5905LllI.o000oOoO);
        f15735OooO00o.add(AbstractC5905LllI.OoooOOO);
        f15735OooO00o.add(AbstractC5905LllI.OoooOOo);
        f15735OooO00o.add(AbstractC5905LllI.OoooOo0);
        f15735OooO00o.add(AbstractC5905LllI.OoooOoO);
        f15735OooO00o.add(AbstractC5905LllI.OoooOoo);
        f15735OooO00o.add(AbstractC5905LllI.Ooooo00);
        f15735OooO00o.add(AbstractC5905LllI.Ooooo0o);
        f15735OooO00o.add(AbstractC5905LllI.OooooO0);
        f15735OooO00o.add(AbstractC5905LllI.OooooOO);
        f15735OooO00o.add(AbstractC5331ILi.OooOOO);
        f15735OooO00o.add(AbstractC5331ILi.OooOOOO);
        f15735OooO00o.add(LLiII.OooO);
        f15735OooO00o.add(LLiII.OooOO0);
        f15735OooO00o.add(AbstractC5701Li1l.OooOo0);
        f15735OooO00o.add(AbstractC5701Li1l.OooOo0O);
        f15735OooO00o.add(AbstractC5701Li1l.OooOo);
        f15735OooO00o.add(AbstractC5701Li1l.OooOoO0);
        f15735OooO00o.add(AbstractC5701Li1l.OooOoO);
        f15735OooO00o.add(AbstractC5701Li1l.OooOoOO);
        f15735OooO00o.add(AbstractC5701Li1l.OooOoo);
        f15735OooO00o.add(AbstractC5701Li1l.OooOooO);
        f15735OooO00o.add(AbstractC5701Li1l.OooOooo);
        f15735OooO00o.add(AbstractC5701Li1l.Oooo000);
        f15735OooO00o.add(AbstractC6041i1l.OooooO0);
        f15737OooO0O0.add(AbstractC5711LiLli.OooOoo);
        f15737OooO0O0.add(AbstractC5711LiLli.Oooo0o0);
        f15737OooO0O0.add(AbstractC5711LiLli.Oooo0);
        f15737OooO0O0.add(AbstractC5711LiLli.Oooo0O0);
        f15737OooO0O0.add(AbstractC5711LiLli.Oooo0OO);
        f15737OooO0O0.add(AbstractC9468L1lL.OooO0oO);
        f15737OooO0O0.add(AbstractC9468L1lL.OooO0o);
        f15737OooO0O0.add(AbstractC9468L1lL.OooO0oo);
        f15737OooO0O0.add(AbstractC5905LllI.OooooOo);
        f15737OooO0O0.add(AbstractC5905LllI.Oooooo0);
        f15737OooO0O0.add(AbstractC5905LllI.Oooooo);
        f15737OooO0O0.add(AbstractC5905LllI.OoooooO);
        f15736OooO0O0.put("SHA1WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o), 20));
        f15736OooO0O0.put("SHA224WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0o, C6452l1Lll.OooO00o), 28));
        f15736OooO0O0.put("SHA256WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0OO, C6452l1Lll.OooO00o), 32));
        f15736OooO0O0.put("SHA384WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0Oo, C6452l1Lll.OooO00o), 48));
        f15736OooO0O0.put("SHA512WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO0o0, C6452l1Lll.OooO00o), 64));
        f15736OooO0O0.put("SHA3-224WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooO, C6452l1Lll.OooO00o), 28));
        f15736OooO0O0.put("SHA3-256WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooOO0, C6452l1Lll.OooO00o), 32));
        f15736OooO0O0.put("SHA3-384WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooOO0O, C6452l1Lll.OooO00o), 48));
        f15736OooO0O0.put("SHA3-512WITHRSAANDMGF1", OooO00o(new C6456l1ilL(AbstractC5905LllI.OooOO0o, C6452l1Lll.OooO00o), 64));
        f15738OooO0OO.put(AbstractC5711LiLli.Oooo0o0, AbstractC5905LllI.OooO0o);
        f15738OooO0OO.put(AbstractC5711LiLli.Oooo0, AbstractC5905LllI.OooO0OO);
        f15738OooO0OO.put(AbstractC5711LiLli.Oooo0O0, AbstractC5905LllI.OooO0Oo);
        f15738OooO0OO.put(AbstractC5711LiLli.Oooo0OO, AbstractC5905LllI.OooO0o0);
        f15738OooO0OO.put(AbstractC5905LllI.OoooO, AbstractC5905LllI.OooO0o);
        f15738OooO0OO.put(AbstractC5905LllI.OoooO, AbstractC5905LllI.OooO0OO);
        f15738OooO0OO.put(AbstractC5905LllI.OoooO, AbstractC5905LllI.OooO0Oo);
        f15738OooO0OO.put(AbstractC5905LllI.OoooO, AbstractC5905LllI.OooO0o0);
        f15738OooO0OO.put(AbstractC5905LllI.OoooOOo, AbstractC5905LllI.OooO);
        f15738OooO0OO.put(AbstractC5905LllI.OoooOo0, AbstractC5905LllI.OooOO0);
        f15738OooO0OO.put(AbstractC5905LllI.OoooOoO, AbstractC5905LllI.OooOO0O);
        f15738OooO0OO.put(AbstractC5905LllI.OoooOoo, AbstractC5905LllI.OooOO0o);
        f15738OooO0OO.put(AbstractC5905LllI.Ooooo00, AbstractC5905LllI.OooO);
        f15738OooO0OO.put(AbstractC5905LllI.Ooooo0o, AbstractC5905LllI.OooOO0);
        f15738OooO0OO.put(AbstractC5905LllI.OooooO0, AbstractC5905LllI.OooOO0O);
        f15738OooO0OO.put(AbstractC5905LllI.OooooOO, AbstractC5905LllI.OooOO0o);
        f15738OooO0OO.put(AbstractC5905LllI.OooooOo, AbstractC5905LllI.OooO);
        f15738OooO0OO.put(AbstractC5905LllI.Oooooo0, AbstractC5905LllI.OooOO0);
        f15738OooO0OO.put(AbstractC5905LllI.Oooooo, AbstractC5905LllI.OooOO0O);
        f15738OooO0OO.put(AbstractC5905LllI.OoooooO, AbstractC5905LllI.OooOO0o);
        f15738OooO0OO.put(AbstractC5711LiLli.OooOoO, AbstractC5711LiLli.OooooOO);
        f15738OooO0OO.put(AbstractC5711LiLli.OooOoOO, AbstractC5711LiLli.OooooOo);
        f15738OooO0OO.put(AbstractC5711LiLli.OooOoo0, AbstractC5711LiLli.Oooooo0);
        f15738OooO0OO.put(AbstractC5711LiLli.OooOoo, AbstractC9733l.OooO);
        f15738OooO0OO.put(AbstractC9468L1lL.OooO0oO, AbstractC9468L1lL.OooO0OO);
        f15738OooO0OO.put(AbstractC9468L1lL.OooO0o, AbstractC9468L1lL.OooO0O0);
        f15738OooO0OO.put(AbstractC9468L1lL.OooO0oo, AbstractC9468L1lL.OooO0Oo);
        f15738OooO0OO.put(AbstractC5331ILi.OooOOO, AbstractC5331ILi.OooO0O0);
        f15738OooO0OO.put(AbstractC5331ILi.OooOOOO, AbstractC5331ILi.OooO0O0);
        f15738OooO0OO.put(LLiII.OooO, LLiII.OooO0OO);
        f15738OooO0OO.put(LLiII.OooOO0, LLiII.OooO0Oo);
        f15738OooO0OO.put(AbstractC6041i1l.OooooO0, AbstractC6041i1l.Ooooo00);
    }

    public static C6692lii OooO00o(C6456l1ilL r5, int i) {
        return new C6692lii(r5, new C6456l1ilL(AbstractC5711LiLli.Oooo000, r5), new C6513lIiI((long) i), new C6513lIiI(1));
    }

    public static C6456l1ilL OooO0O0(String str) {
        String OooO0O02 = Strings.OooO0O0(str);
        LlLI1 llLI1 = (LlLI1) f15734OooO00o.get(OooO0O02);
        if (llLI1 != null) {
            C6456l1ilL r4 = f15735OooO00o.contains(llLI1) ? new C6456l1ilL(llLI1) : f15736OooO0O0.containsKey(OooO0O02) ? new C6456l1ilL(llLI1, (AbstractC6854lLi1LL) f15736OooO0O0.get(OooO0O02)) : new C6456l1ilL(llLI1, C6452l1Lll.OooO00o);
            if (f15737OooO0O0.contains(llLI1)) {
                new C6456l1ilL(AbstractC5711LiLli.OooOoO0, C6452l1Lll.OooO00o);
            }
            if (r4.OooO00o().equals(AbstractC5711LiLli.Oooo00o)) {
                ((C6692lii) r4.m17587OooO0O0()).OooO00o();
            } else {
                new C6456l1ilL((LlLI1) f15738OooO0OO.get(llLI1), C6452l1Lll.OooO00o);
            }
            return r4;
        }
        throw new IllegalArgumentException("Unknown signature type requested: " + OooO0O02);
    }

    @Override // com.p118pd.sdk.AbstractC9554Li
    public C6456l1ilL OooO00o(String str) {
        return OooO0O0(str);
    }
}
