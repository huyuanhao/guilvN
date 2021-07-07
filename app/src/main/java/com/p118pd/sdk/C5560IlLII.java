package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.cms.ImprintDigestInvalidException;

/* renamed from: com.pd.sdk.I丨lL丨I丨I  reason: invalid class name and case insensitive filesystem */
public class C5560IlLII extends C6097iILii {
    public C5329IL1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6128iIlI f16086OooO00o;

    public C5560IlLII(InputStream inputStream) throws CMSException {
        super(inputStream);
        OooO00o(((C6097iILii) this).OooO00o);
    }

    public C5560IlLII(byte[] bArr) throws CMSException {
        this(new ByteArrayInputStream(bArr));
    }

    private void OooO00o(I1Iili1 i1Iili1) throws CMSException {
        try {
            if (AbstractC6252iiLl.OooOO0.equals(i1Iili1.OooO00o())) {
                this.f16086OooO00o = C6128iIlI.OooO00o(i1Iili1.OooO00o(16));
                return;
            }
            throw new IllegalArgumentException("Malformed content - type must be " + AbstractC6252iiLl.OooOO0.m16387OooO0O0());
        } catch (IOException e) {
            throw new CMSException("parsing exception: " + e.getMessage(), e);
        }
    }

    private void OooO0O0() throws CMSException {
        try {
            if (this.OooO00o == null) {
                InputStream OooO00o2 = m15860OooO00o();
                if (OooO00o2 != null) {
                    C6304ilIi1.OooO00o(OooO00o2);
                }
                this.OooO00o = new C5329IL1LL(this.f16086OooO00o);
            }
        } catch (IOException e) {
            throw new CMSException("unable to parse evidence block: " + e.getMessage(), e);
        }
    }

    public I111LIL OooO00o(AbstractC6290ii r4) throws OperatorCreationException {
        try {
            OooO0O0();
            return this.OooO00o.OooO00o(r4);
        } catch (CMSException e) {
            throw new OperatorCreationException("unable to extract algorithm ID: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.C6097iILii
    public C9731lL1 OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m15860OooO00o() {
        if (this.f16086OooO00o.m17030OooO00o() != null) {
            return this.f16086OooO00o.m17030OooO00o().OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15861OooO00o() {
        return this.OooO00o.m15531OooO00o();
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public URI m15862OooO00o() throws URISyntaxException {
        L1iI1 OooO00o2 = this.f16086OooO00o.m17029OooO00o();
        if (OooO00o2 != null) {
            return new URI(OooO00o2.OooO00o());
        }
        return null;
    }

    public void OooO00o(AbstractC6290ii r2, byte[] bArr) throws ImprintDigestInvalidException, CMSException {
        OooO0O0();
        this.OooO00o.OooO00o(r2, bArr);
    }

    public void OooO00o(AbstractC6290ii r2, byte[] bArr, C9448Il r4) throws ImprintDigestInvalidException, CMSException {
        OooO0O0();
        this.OooO00o.OooO00o(r2, bArr, r4);
    }

    public void OooO00o(I111LIL r2) throws CMSException {
        this.OooO00o.OooO00o(r2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15863OooO00o(I111LIL r2) throws CMSException {
        return this.OooO00o.m15532OooO00o(r2);
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9448Il[] m15864OooO00o() throws CMSException {
        OooO0O0();
        return this.OooO00o.m15534OooO00o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m15865OooO0O0() {
        return this.OooO00o.OooO0O0();
    }
}
