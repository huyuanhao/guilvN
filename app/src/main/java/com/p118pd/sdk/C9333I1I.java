package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨I1I  reason: invalid class name and case insensitive filesystem */
public class C9333I1I implements i11ILLIi {
    public C1676Ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f22864OooO00o;

    public C9333I1I(C5753LiI1 r3) throws CMSException {
        this.f22864OooO00o = r3;
        try {
            this.OooO00o = C1676Ii.OooO00o(r3.m16341OooO0O0());
        } catch (ClassCastException e) {
            throw new CMSException("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new CMSException("Malformed content.", e2);
        }
    }

    public C9333I1I(InputStream inputStream) throws CMSException {
        this(C5799LllI.OooO00o(inputStream));
    }

    public C9333I1I(byte[] bArr) throws CMSException {
        this(C5799LllI.OooO00o(bArr));
    }

    public C5753LiI1 OooO00o() {
        return this.f22864OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m21380OooO00o() {
        return this.f22864OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5808Ll1I m21381OooO00o() throws CMSException {
        C5753LiI1 OooO00o2 = this.OooO00o.OooO00o();
        try {
            return new C6438l11L1(OooO00o2.OooO00o(), ((AbstractC6804llL1ii) OooO00o2.m16341OooO0O0()).m17938OooO00o());
        } catch (Exception e) {
            throw new CMSException("exception reading digested stream.", e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21382OooO00o() {
        return this.OooO00o.m15543OooO00o();
    }

    public boolean OooO00o(AbstractC6290ii r4) throws CMSException {
        try {
            C5753LiI1 OooO00o2 = this.OooO00o.OooO00o();
            I111LIL OooO00o3 = r4.OooO00o(this.OooO00o.m15543OooO00o());
            OooO00o3.m21370OooO00o().write(((AbstractC6804llL1ii) OooO00o2.m16341OooO0O0()).m17938OooO00o());
            return C9586iIILl.m21627OooO00o(this.OooO00o.m15545OooO00o(), OooO00o3.m21371OooO00o());
        } catch (OperatorCreationException e) {
            throw new CMSException("unable to create digest calculator: " + e.getMessage(), e);
        } catch (IOException e2) {
            throw new CMSException("unable process content: " + e2.getMessage(), e2);
        }
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.f22864OooO00o.getEncoded();
    }
}
