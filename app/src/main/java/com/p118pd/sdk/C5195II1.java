package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.jce.provider.X509CertificateObject;
import org.bouncycastle.x509.util.StreamParsingException;

/* renamed from: com.pd.sdk.II1丨  reason: invalid class name and case insensitive filesystem */
public class C5195II1 extends AbstractC9481LIl {
    public static final C5795LliiiLi OooO00o = new C5795LliiiLi("CERTIFICATE");

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15454OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I11L f15455OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f15456OooO00o = null;

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    private Certificate OooO00o() throws CertificateParsingException {
        if (this.f15455OooO00o == null) {
            return null;
        }
        while (this.f15454OooO00o < this.f15455OooO00o.size()) {
            I11L i11l = this.f15455OooO00o;
            int i = this.f15454OooO00o;
            this.f15454OooO00o = i + 1;
            AbstractC6854lLi1LL OooO00o2 = i11l.OooO00o(i);
            if (OooO00o2 instanceof I11li1) {
                return new X509CertificateObject(LilIiIl.OooO00o(OooO00o2));
            }
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl
    private Certificate OooO00o(InputStream inputStream) throws IOException, CertificateParsingException {
        I11li1 i11li1 = (I11li1) new C5805Ll1(inputStream).OooO00o();
        if (i11li1.size() <= 1 || !(i11li1.OooO00o(0) instanceof LlLI1) || !i11li1.OooO00o(0).equals(AbstractC5711LiLli.o00Ooo)) {
            return new X509CertificateObject(LilIiIl.OooO00o(i11li1));
        }
        this.f15455OooO00o = new C6307ilI1(I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true)).OooO0O0();
        return OooO00o();
    }

    private Certificate OooO0O0(InputStream inputStream) throws IOException, CertificateParsingException {
        I11li1 OooO00o2 = OooO00o.m16398OooO00o(inputStream);
        if (OooO00o2 != null) {
            return new X509CertificateObject(LilIiIl.OooO00o(OooO00o2));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m15361OooO00o() throws StreamParsingException {
        try {
            if (this.f15455OooO00o == null) {
                this.f15456OooO00o.mark(10);
                int read = this.f15456OooO00o.read();
                if (read == -1) {
                    return null;
                }
                if (read != 48) {
                    this.f15456OooO00o.reset();
                    return OooO0O0(this.f15456OooO00o);
                }
                this.f15456OooO00o.reset();
                return OooO00o(this.f15456OooO00o);
            } else if (this.f15454OooO00o != this.f15455OooO00o.size()) {
                return OooO00o();
            } else {
                this.f15455OooO00o = null;
                this.f15454OooO00o = 0;
                return null;
            }
        } catch (Exception e) {
            throw new StreamParsingException(e.toString(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m15362OooO00o() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificate = (Certificate) m15361OooO00o();
            if (certificate == null) {
                return arrayList;
            }
            arrayList.add(certificate);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15363OooO00o(InputStream inputStream) {
        this.f15456OooO00o = inputStream;
        this.f15455OooO00o = null;
        this.f15454OooO00o = 0;
        if (!inputStream.markSupported()) {
            this.f15456OooO00o = new BufferedInputStream(this.f15456OooO00o);
        }
    }
}
