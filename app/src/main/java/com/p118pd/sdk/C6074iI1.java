package com.p118pd.sdk;

import com.p118pd.sdk.C6561lL1lL;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.iI1  reason: case insensitive filesystem */
public class C6074iI1 implements i11ILLIi {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IiLl11i f17471OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f17472OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6065i1lL f17473OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17474OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17475OooO00o;
    public I11L OooO0O0;

    /* renamed from: com.pd.sdk.iI1$OooO00o */
    public class OooO00o implements AbstractC6646liI11LlI {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC6646liI11LlI
        public I11L OooO00o() {
            return C6074iI1.this.OooO00o;
        }
    }

    public C6074iI1(C5753LiI1 r2) throws CMSException {
        this(r2, (AbstractC6290ii) null);
    }

    public C6074iI1(C5753LiI1 r7, AbstractC6290ii r8) throws CMSException {
        this.f17472OooO00o = r7;
        C9709lilI OooO00o2 = C9709lilI.OooO00o(r7.m16341OooO0O0());
        if (OooO00o2.m21745OooO00o() != null) {
            this.f17473OooO00o = new C6065i1lL(OooO00o2.m21745OooO00o());
        }
        I11L OooO0O02 = OooO00o2.OooO0O0();
        this.f17474OooO00o = OooO00o2.m21747OooO0O0();
        this.OooO00o = OooO00o2.OooO00o();
        this.f17475OooO00o = OooO00o2.m21744OooO00o().m17938OooO00o();
        this.OooO0O0 = OooO00o2.OooO0OO();
        C6438l11L1 r2 = new C6438l11L1(AbstractC6804llL1ii.OooO00o(OooO00o2.m21741OooO00o().m16341OooO0O0()).m17938OooO00o());
        I11L i11l = this.OooO00o;
        if (i11l == null) {
            this.f17471OooO00o = C6561lL1lL.OooO00o(OooO0O02, this.f17474OooO00o, new C6561lL1lL.OooO00o(this.f17474OooO00o, r2));
        } else if (r8 != null) {
            iILLL1 OooO00o3 = new C9731lL1(i11l).OooO00o(AbstractC6651liIi.OooO0o);
            if (OooO00o3.OooO00o() <= 1) {
                if (OooO00o3.OooO00o() > 0) {
                    C9476LIL1li OooO00o4 = C9476LIL1li.OooO00o(OooO00o3.OooO00o(0));
                    if (OooO00o4.OooO00o().size() == 1) {
                        C9515LillIL OooO00o5 = C9515LillIL.OooO00o(OooO00o4.m21531OooO00o()[0]);
                        if (!C5799LllI.OooO00o(OooO00o5.OooO00o(), OooO00o2.m21742OooO00o())) {
                            throw new CMSException("CMS Algorithm Identifier Protection check failed for digestAlgorithm");
                        } else if (!C5799LllI.OooO00o(OooO00o5.m21581OooO0O0(), this.f17474OooO00o)) {
                            throw new CMSException("CMS Algorithm Identifier Protection check failed for macAlgorithm");
                        }
                    } else {
                        throw new CMSException("A cmsAlgorithmProtect attribute MUST contain exactly one value");
                    }
                }
                try {
                    this.f17471OooO00o = C6561lL1lL.OooO00o(OooO0O02, this.f17474OooO00o, new C6561lL1lL.OooO0O0(r8.OooO00o(OooO00o2.m21742OooO00o()), r2), new OooO00o());
                } catch (OperatorCreationException e) {
                    throw new CMSException("unable to create digest calculator: " + e.getMessage(), e);
                }
            } else {
                throw new CMSException("Only one instance of a cmsAlgorithmProtect attribute can be present");
            }
        } else {
            throw new CMSException("a digest calculator provider is required if authenticated attributes are present");
        }
    }

    public C6074iI1(InputStream inputStream) throws CMSException {
        this(C5799LllI.OooO00o(inputStream));
    }

    public C6074iI1(InputStream inputStream, AbstractC6290ii r2) throws CMSException {
        this(C5799LllI.OooO00o(inputStream), r2);
    }

    public C6074iI1(byte[] bArr) throws CMSException {
        this(C5799LllI.OooO00o(bArr));
    }

    public C6074iI1(byte[] bArr, AbstractC6290ii r2) throws CMSException {
        this(C5799LllI.OooO00o(bArr), r2);
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r1) throws IOException {
        if (r1 != null) {
            return r1.OooO0O0().getEncoded();
        }
        return null;
    }

    public IiLl11i OooO00o() {
        return this.f17471OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m16930OooO00o() {
        return this.f17472OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6065i1lL m16931OooO00o() {
        return this.f17473OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16932OooO00o() {
        return this.f17474OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9731lL1 m16933OooO00o() {
        I11L i11l = this.OooO00o;
        if (i11l == null) {
            return null;
        }
        return new C9731lL1(i11l);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16934OooO00o() {
        return this.f17474OooO00o.OooO00o().m16387OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16935OooO00o() {
        if (this.OooO00o != null) {
            return AbstractC6804llL1ii.OooO00o(m16933OooO00o().m21787OooO00o(AbstractC6651liIi.OooO0O0).OooO00o().OooO00o(0)).m17938OooO00o();
        }
        return null;
    }

    public C5753LiI1 OooO0O0() {
        return this.f17472OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9731lL1 m16936OooO0O0() {
        I11L i11l = this.OooO0O0;
        if (i11l == null) {
            return null;
        }
        return new C9731lL1(i11l);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m16937OooO0O0() {
        return C9586iIILl.m21630OooO00o(this.f17475OooO00o);
    }

    public byte[] OooO0OO() {
        try {
            return OooO00o(this.f17474OooO00o.m17587OooO0O0());
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.f17472OooO00o.getEncoded();
    }
}
