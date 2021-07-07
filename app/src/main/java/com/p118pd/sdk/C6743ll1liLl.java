package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;

/* renamed from: com.pd.sdk.ll1丨liLl  reason: invalid class name and case insensitive filesystem */
public class C6743ll1liLl extends AbstractC9481LIl {
    public InputStream OooO00o = null;

    @Override // com.p118pd.sdk.AbstractC9481LIl
    private il1l1l OooO00o(InputStream inputStream) throws IOException, CertificateParsingException {
        return new il1l1l(C5336Ii1.OooO00o((I11li1) new C5805Ll1(inputStream).OooO00o()));
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    public Object OooO00o() throws StreamParsingException {
        try {
            this.OooO00o.mark(10);
            if (this.OooO00o.read() == -1) {
                return null;
            }
            this.OooO00o.reset();
            return OooO00o(this.OooO00o);
        } catch (Exception e) {
            throw new StreamParsingException(e.toString(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m17840OooO00o() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            il1l1l r1 = (il1l1l) OooO00o();
            if (r1 == null) {
                return arrayList;
            }
            arrayList.add(r1);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17841OooO00o(InputStream inputStream) {
        this.OooO00o = inputStream;
        if (!inputStream.markSupported()) {
            this.OooO00o = new BufferedInputStream(this.OooO00o);
        }
    }
}
