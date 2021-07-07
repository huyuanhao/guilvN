package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.丨I */
public class C1703I extends AbstractC5738Lil {
    public static int o0ooOO0 = 1;
    public static int o0ooOOo = 2;
    public I1I1LL1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f22831OooO00o;
    public int o00oO0O;

    public C1703I(I1I1LL1 i1i1ll1, byte[] bArr) throws IOException {
        this.OooO00o = i1i1ll1;
        this.f22831OooO00o = C9586iIILl.m21630OooO00o(bArr);
        int i = this.o00oO0O | o0ooOO0;
        this.o00oO0O = i;
        this.o00oO0O = i | o0ooOOo;
    }

    public C1703I(C5805Ll1 r1) throws IOException {
        OooO00o(r1);
    }

    public C1703I(AbstractC8947ooOOOOo0 ooooooo0) throws IOException {
        OooO00o(ooooooo0);
    }

    public static C1703I OooO00o(Object obj) {
        if (obj instanceof C1703I) {
            return (C1703I) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new C1703I(AbstractC8947ooOOOOo0.OooO00o(obj));
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to parse data: " + e.getMessage(), e);
        }
    }

    private void OooO00o(C5805Ll1 r3) throws IOException {
        while (true) {
            AbstractC6122iIlLiL OooO00o2 = r3.OooO00o();
            if (OooO00o2 == null) {
                return;
            }
            if (OooO00o2 instanceof ILLIi) {
                OooO00o((AbstractC8947ooOOOOo0) ((ILLIi) OooO00o2));
            } else {
                throw new IOException("Invalid Input Stream for creating an Iso7816CertificateStructure");
            }
        }
    }

    private void OooO00o(AbstractC8947ooOOOOo0 ooooooo0) throws IOException {
        int i;
        int i2;
        this.o00oO0O = 0;
        if (ooooooo0.OooO0OO() == 33) {
            C5805Ll1 r0 = new C5805Ll1(ooooooo0.m20621OooO00o());
            while (true) {
                AbstractC6122iIlLiL OooO00o2 = r0.OooO00o();
                if (OooO00o2 == null) {
                    r0.close();
                    if (this.o00oO0O != (o0ooOOo | o0ooOO0)) {
                        throw new IOException("invalid CARDHOLDER_CERTIFICATE :" + ooooooo0.OooO0OO());
                    }
                    return;
                } else if (OooO00o2 instanceof ILLIi) {
                    ILLIi r1 = (ILLIi) OooO00o2;
                    int OooO0OO = r1.OooO0OO();
                    if (OooO0OO == 55) {
                        this.f22831OooO00o = r1.m20621OooO00o();
                        i2 = this.o00oO0O;
                        i = o0ooOOo;
                    } else if (OooO0OO == 78) {
                        this.OooO00o = I1I1LL1.OooO00o((Object) r1);
                        i2 = this.o00oO0O;
                        i = o0ooOO0;
                    } else {
                        throw new IOException("Invalid tag, not an Iso7816CertificateStructure :" + r1.OooO0OO());
                    }
                    this.o00oO0O = i2 | i;
                } else {
                    throw new IOException("Invalid Object, not an Iso7816CertificateStructure");
                }
            }
        } else {
            throw new IOException("not a CARDHOLDER_CERTIFICATE :" + ooooooo0.OooO0OO());
        }
    }

    public I1I1LL1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5238IIL m21361OooO00o() throws IOException {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LIIL m21362OooO00o() throws IOException {
        return new LIIL(this.OooO00o.m15250OooO00o().OooO0O0() & 31);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LLil1iI m21363OooO00o() throws IOException {
        return this.OooO00o.m15251OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m21364OooO00o() throws IOException {
        return this.OooO00o.m15250OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9758ILI m21365OooO00o() throws IOException {
        return this.OooO00o.m15253OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21366OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f22831OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public LLil1iI m21367OooO0O0() throws IOException {
        return this.OooO00o.m15254OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21368OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        try {
            r0.OooO00o(new ILLIi(false, 55, (AbstractC6854lLi1LL) new C6487lIIiIlL(this.f22831OooO00o)));
            return new ILLIi(33, r0);
        } catch (IOException unused) {
            throw new IllegalStateException("unable to convert signature!");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() throws IOException {
        return this.OooO00o.m15250OooO00o().OooO0O0() & 192;
    }

    public int OooO0Oo() throws IOException {
        return this.OooO00o.m15250OooO00o().OooO0O0();
    }
}
