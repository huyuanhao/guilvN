package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.cms.ImprintDigestInvalidException;

/* renamed from: com.pd.sdk.IilliL丨  reason: invalid class name and case insensitive filesystem */
public class C5385IilliL {
    public C5329IL1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f15745OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6393iiIiiL f15746OooO00o;

    public C5385IilliL(C5753LiI1 r1) {
        OooO00o(r1);
    }

    public C5385IilliL(InputStream inputStream) throws IOException {
        try {
            OooO00o(C5753LiI1.OooO00o(new C5805Ll1(inputStream).OooO00o()));
        } catch (ClassCastException e) {
            throw new IOException("Malformed content: " + e);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Malformed content: " + e2);
        }
    }

    public C5385IilliL(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }

    private void OooO00o(C5753LiI1 r3) {
        this.f15745OooO00o = r3;
        if (AbstractC6252iiLl.OooOO0.equals(r3.OooO00o())) {
            C6393iiIiiL OooO00o2 = C6393iiIiiL.OooO00o(r3.m16341OooO0O0());
            this.f15746OooO00o = OooO00o2;
            this.OooO00o = new C5329IL1LL(OooO00o2);
            return;
        }
        throw new IllegalArgumentException("Malformed content - type must be " + AbstractC6252iiLl.OooOO0.m16387OooO0O0());
    }

    public C5385IilliL OooO00o(C9448Il r10) throws CMSException {
        C5497I1L[] OooO00o2 = this.OooO00o.m15533OooO00o();
        C5497I1L[] r1 = new C5497I1L[(OooO00o2.length + 1)];
        System.arraycopy(OooO00o2, 0, r1, 0, OooO00o2.length);
        r1[OooO00o2.length] = new C5497I1L(r10.m21487OooO00o().m17281OooO00o());
        return new C5385IilliL(new C5753LiI1(AbstractC6252iiLl.OooOO0, new C6393iiIiiL(this.f15746OooO00o.m17513OooO00o(), this.f15746OooO00o.OooO00o(), this.f15746OooO00o.m17514OooO00o(), new C5507IILLI(new III(r1)))));
    }

    public I111LIL OooO00o(AbstractC6290ii r2) throws OperatorCreationException {
        return this.OooO00o.OooO00o(r2);
    }

    public C9731lL1 OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15628OooO00o() {
        return this.OooO00o.m15531OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public URI m15629OooO00o() throws URISyntaxException {
        L1iI1 OooO00o2 = this.f15746OooO00o.m17513OooO00o();
        if (OooO00o2 != null) {
            return new URI(OooO00o2.OooO00o());
        }
        return null;
    }

    public void OooO00o(AbstractC6290ii r2, byte[] bArr) throws ImprintDigestInvalidException, CMSException {
        this.OooO00o.OooO00o(r2, bArr);
    }

    public void OooO00o(AbstractC6290ii r2, byte[] bArr, C9448Il r4) throws ImprintDigestInvalidException, CMSException {
        this.OooO00o.OooO00o(r2, bArr, r4);
    }

    public void OooO00o(I111LIL r2) throws CMSException {
        this.OooO00o.OooO00o(r2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15630OooO00o() {
        if (this.f15746OooO00o.m17514OooO00o() != null) {
            return this.f15746OooO00o.m17514OooO00o().m17938OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15631OooO00o(I111LIL r2) throws CMSException {
        return this.OooO00o.m15532OooO00o(r2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9448Il[] m15632OooO00o() throws CMSException {
        return this.OooO00o.m15534OooO00o();
    }

    public String OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15633OooO0O0() throws IOException {
        return this.f15745OooO00o.getEncoded();
    }
}
