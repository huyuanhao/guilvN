package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IlLL1丨  reason: invalid class name */
public class IlLL1 {
    public static C6680liLl1i OooO00o(C6744ll1L r11, byte[] bArr) {
        if (r11 == null) {
            return new C6680liLl1i(null, null, 128);
        }
        li1l11I1 OooO00o = r11.m17842OooO00o();
        return (OooO00o.m17732OooO00o().equals("DES") || OooO00o.m17732OooO00o().equals("RC2") || OooO00o.m17732OooO00o().equals("RC5-32") || OooO00o.m17732OooO00o().equals("RC5-64")) ? new C6680liLl1i(null, null, 64, 64, bArr) : OooO00o.m17732OooO00o().equals("SKIPJACK") ? new C6680liLl1i(null, null, 80, 80, bArr) : OooO00o.m17732OooO00o().equals("GOST28147") ? new C6680liLl1i(null, null, 256, 256, bArr) : new C6680liLl1i(null, null, 128, 128, bArr);
    }
}
