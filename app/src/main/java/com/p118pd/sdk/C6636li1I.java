package com.p118pd.sdk;

import com.p118pd.sdk.C6561lL1lL;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.li1I丨  reason: invalid class name and case insensitive filesystem */
public class C6636li1I implements i11ILLIi {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IiLl11i f18579OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f18580OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6065i1lL f18581OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18582OooO00o;

    public C6636li1I(C5753LiI1 r6) throws CMSException {
        this.f18580OooO00o = r6;
        try {
            Ii1I1LlI OooO00o2 = Ii1I1LlI.OooO00o(r6.m16341OooO0O0());
            if (OooO00o2.m15550OooO00o() != null) {
                this.f18581OooO00o = new C6065i1lL(OooO00o2.m15550OooO00o());
            }
            I11L OooO00o3 = OooO00o2.OooO00o();
            C1684L OooO00o4 = OooO00o2.m15548OooO00o();
            this.f18582OooO00o = OooO00o4.m16414OooO00o();
            this.f18579OooO00o = C6561lL1lL.OooO00o(OooO00o3, this.f18582OooO00o, new C6561lL1lL.OooO0OO(this.f18582OooO00o, new C6438l11L1(OooO00o4.m16415OooO00o().m17938OooO00o())));
            this.OooO00o = OooO00o2.OooO0O0();
        } catch (ClassCastException e) {
            throw new CMSException("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new CMSException("Malformed content.", e2);
        }
    }

    public C6636li1I(InputStream inputStream) throws CMSException {
        this(C5799LllI.OooO00o(inputStream));
    }

    public C6636li1I(byte[] bArr) throws CMSException {
        this(C5799LllI.OooO00o(bArr));
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r1) throws IOException {
        if (r1 != null) {
            return r1.OooO0O0().getEncoded();
        }
        return null;
    }

    public IiLl11i OooO00o() {
        return this.f18579OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m17725OooO00o() {
        return this.f18580OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6065i1lL m17726OooO00o() {
        return this.f18581OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17727OooO00o() {
        return this.f18582OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9731lL1 m17728OooO00o() {
        I11L i11l = this.OooO00o;
        if (i11l == null) {
            return null;
        }
        return new C9731lL1(i11l);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17729OooO00o() {
        return this.f18582OooO00o.OooO00o().m16387OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17730OooO00o() {
        try {
            return OooO00o(this.f18582OooO00o.m17587OooO0O0());
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.f18580OooO00o.getEncoded();
    }
}
