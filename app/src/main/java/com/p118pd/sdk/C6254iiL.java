package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiL丨  reason: invalid class name and case insensitive filesystem */
public class C6254iiL {
    public static AbstractC6436l11LI OooO00o(C6456l1ilL r3) {
        if (r3.OooO00o().equals(AbstractC9733l.OooO)) {
            return C5427IlI1.OooO0O0();
        }
        if (r3.OooO00o().equals(AbstractC5905LllI.OooO0o)) {
            return C5427IlI1.OooO0OO();
        }
        if (r3.OooO00o().equals(AbstractC5905LllI.OooO0OO)) {
            return C5427IlI1.OooO0Oo();
        }
        if (r3.OooO00o().equals(AbstractC5905LllI.OooO0Oo)) {
            return C5427IlI1.OooO0o0();
        }
        if (r3.OooO00o().equals(AbstractC5905LllI.OooO0o0)) {
            return C5427IlI1.OooOO0();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + r3.OooO00o());
    }

    public static C6456l1ilL OooO00o(String str) {
        if (str.equals(LL1i.OooO0O0)) {
            return new C6456l1ilL(AbstractC9733l.OooO, C6452l1Lll.OooO00o);
        }
        if (str.equals(LL1i.OooO0OO)) {
            return new C6456l1ilL(AbstractC5905LllI.OooO0o, C6452l1Lll.OooO00o);
        }
        if (str.equals(LL1i.OooO0Oo)) {
            return new C6456l1ilL(AbstractC5905LllI.OooO0OO, C6452l1Lll.OooO00o);
        }
        if (str.equals(LL1i.f16409OooO0o0)) {
            return new C6456l1ilL(AbstractC5905LllI.OooO0Oo, C6452l1Lll.OooO00o);
        }
        if (str.equals(LL1i.f16408OooO0o)) {
            return new C6456l1ilL(AbstractC5905LllI.OooO0o0, C6452l1Lll.OooO00o);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }
}
