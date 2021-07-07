package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.IlLlL  reason: case insensitive filesystem */
public class C5454IlLlL extends AbstractC5738Lil {
    public static final int o00oO0O = 1;
    public static final int o0ooOO0 = 2;
    public I1I1LL1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC8947ooOOOOo0 f15843OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15844OooO00o = null;
    public byte[] OooO0O0 = null;

    public C5454IlLlL(AbstractC8947ooOOOOo0 ooooooo0) throws IOException {
        this.f15843OooO00o = ooooooo0;
        if (!ooooooo0.OooO00o() || ooooooo0.OooO0OO() != 7) {
            OooO00o(ooooooo0);
            return;
        }
        I11li1 OooO00o2 = I11li1.OooO00o((Object) ooooooo0.OooO00o(16));
        OooO00o(AbstractC8947ooOOOOo0.OooO00o(OooO00o2.OooO00o(0)));
        this.OooO0O0 = AbstractC8947ooOOOOo0.OooO00o(OooO00o2.OooO00o(OooO00o2.size() - 1)).m20621OooO00o();
    }

    public static C5454IlLlL OooO00o(Object obj) {
        if (obj instanceof C5454IlLlL) {
            return (C5454IlLlL) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new C5454IlLlL(AbstractC8947ooOOOOo0.OooO00o(obj));
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to parse data: " + e.getMessage(), e);
        }
    }

    private void OooO00o(AbstractC8947ooOOOOo0 ooooooo0) throws IOException {
        if (ooooooo0.OooO0OO() == 33) {
            boolean z = false;
            Enumeration OooO00o2 = I11li1.OooO00o((Object) ooooooo0.OooO00o(16)).m15236OooO00o();
            while (OooO00o2.hasMoreElements()) {
                AbstractC8947ooOOOOo0 OooO00o3 = AbstractC8947ooOOOOo0.OooO00o(OooO00o2.nextElement());
                int OooO0OO = OooO00o3.OooO0OO();
                if (OooO0OO == 55) {
                    this.f15844OooO00o = OooO00o3.m20621OooO00o();
                    z |= true;
                } else if (OooO0OO == 78) {
                    this.OooO00o = I1I1LL1.OooO00o((Object) OooO00o3);
                    z |= true;
                } else {
                    throw new IOException("Invalid tag, not an CV Certificate Request element:" + OooO00o3.OooO0OO());
                }
            }
            if (!z || !true) {
                throw new IOException("Invalid CARDHOLDER_CERTIFICATE in request:" + ooooooo0.OooO0OO());
            }
            return;
        }
        throw new IOException("not a CARDHOLDER_CERTIFICATE in request:" + ooooooo0.OooO0OO());
    }

    public I1I1LL1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9710lilli m15672OooO00o() {
        return this.OooO00o.m15252OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15673OooO00o() {
        return this.OooO0O0 != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15674OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f15844OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        AbstractC8947ooOOOOo0 ooooooo0 = this.f15843OooO00o;
        if (ooooooo0 != null) {
            return ooooooo0;
        }
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        try {
            r0.OooO00o(new ILLIi(false, 55, (AbstractC6854lLi1LL) new C6487lIIiIlL(this.f15844OooO00o)));
            return new ILLIi(33, r0);
        } catch (IOException unused) {
            throw new IllegalStateException("unable to convert signature!");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15675OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.OooO0O0);
    }
}
