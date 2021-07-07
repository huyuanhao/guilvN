package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;

/* renamed from: com.pd.sdk.丨i丨丨liI  reason: invalid class name and case insensitive filesystem */
public class C9654iliI extends AbstractC9481LIl {
    public static final C5795LliiiLi OooO00o = new C5795LliiiLi("CRL");

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23255OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I11L f23256OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f23257OooO00o = null;

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    private CRL OooO00o() throws CRLException {
        I11L i11l = this.f23256OooO00o;
        if (i11l == null || this.f23255OooO00o >= i11l.size()) {
            return null;
        }
        I11L i11l2 = this.f23256OooO00o;
        int i = this.f23255OooO00o;
        this.f23255OooO00o = i + 1;
        return new C6159iLII(C5190I1lIiL.OooO00o(i11l2.OooO00o(i)));
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl
    private CRL OooO00o(InputStream inputStream) throws IOException, CRLException {
        I11li1 i11li1 = (I11li1) new C5805Ll1(inputStream).OooO00o();
        if (i11li1.size() <= 1 || !(i11li1.OooO00o(0) instanceof LlLI1) || !i11li1.OooO00o(0).equals(AbstractC5711LiLli.o00Ooo)) {
            return new C6159iLII(C5190I1lIiL.OooO00o(i11li1));
        }
        this.f23256OooO00o = new C6307ilI1(I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true)).OooO00o();
        return OooO00o();
    }

    private CRL OooO0O0(InputStream inputStream) throws IOException, CRLException {
        I11li1 OooO00o2 = OooO00o.m16398OooO00o(inputStream);
        if (OooO00o2 != null) {
            return new C6159iLII(C5190I1lIiL.OooO00o(OooO00o2));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m21712OooO00o() throws StreamParsingException {
        try {
            if (this.f23256OooO00o == null) {
                this.f23257OooO00o.mark(10);
                int read = this.f23257OooO00o.read();
                if (read == -1) {
                    return null;
                }
                if (read != 48) {
                    this.f23257OooO00o.reset();
                    return OooO0O0(this.f23257OooO00o);
                }
                this.f23257OooO00o.reset();
                return OooO00o(this.f23257OooO00o);
            } else if (this.f23255OooO00o != this.f23256OooO00o.size()) {
                return OooO00o();
            } else {
                this.f23256OooO00o = null;
                this.f23255OooO00o = 0;
                return null;
            }
        } catch (Exception e) {
            throw new StreamParsingException(e.toString(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m21713OooO00o() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            CRL crl = (CRL) m21712OooO00o();
            if (crl == null) {
                return arrayList;
            }
            arrayList.add(crl);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21714OooO00o(InputStream inputStream) {
        this.f23257OooO00o = inputStream;
        this.f23256OooO00o = null;
        this.f23255OooO00o = 0;
        if (!inputStream.markSupported()) {
            this.f23257OooO00o = new BufferedInputStream(this.f23257OooO00o);
        }
    }
}
