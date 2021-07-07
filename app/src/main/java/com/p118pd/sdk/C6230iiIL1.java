package com.p118pd.sdk;

import com.p118pd.sdk.C6561lL1lL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iiIL1  reason: case insensitive filesystem */
public class C6230iiIL1 extends C6097iILii {
    public IiLl11i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6065i1lL f17844OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6247iiLIL f17845OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17846OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9731lL1 f17847OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17848OooO00o;

    public C6230iiIL1(InputStream inputStream) throws CMSException, IOException {
        super(inputStream);
        this.f17848OooO00o = true;
        C6247iiLIL iilil = new C6247iiLIL((AbstractC9685lL) ((C6097iILii) this).OooO00o.OooO00o(16));
        this.f17845OooO00o = iilil;
        C1ILLL1 OooO00o2 = iilil.m17253OooO00o();
        if (OooO00o2 != null) {
            this.f17844OooO00o = new C6065i1lL(OooO00o2);
        }
        I11L OooO00o3 = I11L.OooO00o((Object) this.f17845OooO00o.m17252OooO00o().OooO0O0());
        Ii11i OooO00o4 = this.f17845OooO00o.OooO00o();
        this.f17846OooO00o = OooO00o4.m15547OooO00o();
        this.OooO00o = C6561lL1lL.OooO00o(OooO00o3, this.f17846OooO00o, new C6561lL1lL.OooO0OO(this.f17846OooO00o, new L11LI(((AbstractC6541lIlii) OooO00o4.OooO00o(4)).OooO00o())));
    }

    public C6230iiIL1(byte[] bArr) throws CMSException, IOException {
        this(new ByteArrayInputStream(bArr));
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r1) throws IOException {
        if (r1 != null) {
            return r1.OooO0O0().getEncoded();
        }
        return null;
    }

    @Override // com.p118pd.sdk.C6097iILii
    public IiLl11i OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6065i1lL m17233OooO00o() {
        return this.f17844OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17234OooO00o() {
        return this.f17846OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9731lL1 m17235OooO00o() throws IOException {
        if (this.f17847OooO00o == null && this.f17848OooO00o) {
            AbstractC6796llliI OooO0O0 = this.f17845OooO00o.OooO0O0();
            this.f17848OooO00o = false;
            if (OooO0O0 != null) {
                iILLL1 r1 = new iILLL1();
                while (true) {
                    AbstractC6854lLi1LL OooO00o2 = OooO0O0.OooO00o();
                    if (OooO00o2 == null) {
                        break;
                    }
                    r1.OooO00o(((AbstractC9685lL) OooO00o2).OooO0O0());
                }
                this.f17847OooO00o = new C9731lL1(new i1I1I1l(r1));
            }
        }
        return this.f17847OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17236OooO00o() {
        return this.f17846OooO00o.OooO00o().toString();
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17237OooO00o() {
        try {
            return OooO00o(this.f17846OooO00o.m17587OooO0O0());
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }
}
