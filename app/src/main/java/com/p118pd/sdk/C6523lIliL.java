package com.p118pd.sdk;

import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.lIl丨丨iL  reason: invalid class name and case insensitive filesystem */
public class C6523lIliL {
    public ILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5562Ill f18407OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f18408OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9730lILiL f18409OooO00o;

    public C6523lIliL(C6888ll r1) {
        this.f18408OooO00o = r1;
    }

    public C6523lIliL(C9730lILiL r1) {
        this.f18409OooO00o = r1;
    }

    public C6435l11IL OooO00o(Lii1ii1 r5) {
        C9509Lii r1;
        if (this.OooO00o == null || this.f18407OooO00o == null) {
            C9730lILiL r0 = this.f18409OooO00o;
            if (r0 != null) {
                r1 = null;
                C5353IiIl1i.OooO00o(r0, r5.m16310OooO00o());
            } else {
                if (this.OooO00o != null) {
                    C6888ll r2 = this.f18408OooO00o;
                } else {
                    r1 = new C9509Lii(this.f18407OooO00o, this.f18408OooO00o);
                }
                C5353IiIl1i.OooO00o(r1, r5.m16310OooO00o());
            }
            return new C6435l11IL(r1, r5.OooO00o(), new iIilII1(r5.getSignature()));
        }
        throw new IllegalStateException("name and publicKeyMAC cannot both be set.");
    }

    public C6523lIliL OooO00o(ILI ili) {
        this.OooO00o = ili;
        return this;
    }

    public C6523lIliL OooO00o(C9488LLIIL r2, char[] cArr) throws CRMFException {
        this.f18407OooO00o = r2.OooO00o(cArr, this.f18408OooO00o);
        return this;
    }
}
