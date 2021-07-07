package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iLlil  reason: case insensitive filesystem */
public class C6194iLlil {
    public static int OooO00o(AbstractC6436l11LI r1) {
        boolean z = r1 instanceof AbstractC6534lIL1;
        int OooO0O0 = r1.OooO0O0();
        return z ? OooO0O0 * 2 : OooO0O0;
    }

    public static AbstractC6436l11LI OooO00o(LlLI1 llLI1) {
        if (llLI1.equals(AbstractC5905LllI.OooO0OO)) {
            return new I1li1Ll();
        }
        if (llLI1.equals(AbstractC5905LllI.OooO0o0)) {
            return new C5622LILlL();
        }
        if (llLI1.equals(AbstractC5905LllI.OooOOO0)) {
            return new C6423iIii(128);
        }
        if (llLI1.equals(AbstractC5905LllI.OooOOO)) {
            return new C6423iIii(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + llLI1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m17163OooO00o(LlLI1 llLI1) {
        if (llLI1.equals(AbstractC5905LllI.OooO0OO)) {
            return "SHA256";
        }
        if (llLI1.equals(AbstractC5905LllI.OooO0o0)) {
            return "SHA512";
        }
        if (llLI1.equals(AbstractC5905LllI.OooOOO0)) {
            return "SHAKE128";
        }
        if (llLI1.equals(AbstractC5905LllI.OooOOO)) {
            return "SHAKE256";
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + llLI1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17164OooO00o(AbstractC6436l11LI r4) {
        int OooO00o = OooO00o(r4);
        byte[] bArr = new byte[OooO00o];
        if (r4 instanceof AbstractC6534lIL1) {
            ((AbstractC6534lIL1) r4).OooO0O0(bArr, 0, OooO00o);
        } else {
            r4.OooO00o(bArr, 0);
        }
        return bArr;
    }
}
