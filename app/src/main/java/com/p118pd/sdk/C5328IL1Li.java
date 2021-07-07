package com.p118pd.sdk;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParsingException;

/* renamed from: com.pd.sdk.IL丨1Li  reason: invalid class name and case insensitive filesystem */
public class C5328IL1Li extends AbstractC9481LIl {
    public static final C5795LliiiLi OooO00o = new C5795LliiiLi("ATTRIBUTE CERTIFICATE");

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15644OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I11L f15645OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f15646OooO00o = null;

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    private AbstractC9605iL11 OooO00o() throws IOException {
        if (this.f15645OooO00o == null) {
            return null;
        }
        while (this.f15644OooO00o < this.f15645OooO00o.size()) {
            I11L i11l = this.f15645OooO00o;
            int i = this.f15644OooO00o;
            this.f15644OooO00o = i + 1;
            AbstractC6854lLi1LL OooO00o2 = i11l.OooO00o(i);
            if (OooO00o2 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2;
                if (r0.OooO00o() == 2) {
                    return new C5511IIlI1(I11li1.OooO00o(r0, false).getEncoded());
                }
            }
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl
    private AbstractC9605iL11 OooO00o(InputStream inputStream) throws IOException {
        I11li1 i11li1 = (I11li1) new C5805Ll1(inputStream).OooO00o();
        if (i11li1.size() <= 1 || !(i11li1.OooO00o(0) instanceof LlLI1) || !i11li1.OooO00o(0).equals(AbstractC5711LiLli.o00Ooo)) {
            return new C5511IIlI1(i11li1.getEncoded());
        }
        this.f15645OooO00o = new C6307ilI1(I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true)).OooO0O0();
        return OooO00o();
    }

    private AbstractC9605iL11 OooO0O0(InputStream inputStream) throws IOException {
        I11li1 OooO00o2 = OooO00o.m16398OooO00o(inputStream);
        if (OooO00o2 != null) {
            return new C5511IIlI1(OooO00o2.getEncoded());
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m15528OooO00o() throws StreamParsingException {
        try {
            if (this.f15645OooO00o == null) {
                this.f15646OooO00o.mark(10);
                int read = this.f15646OooO00o.read();
                if (read == -1) {
                    return null;
                }
                if (read != 48) {
                    this.f15646OooO00o.reset();
                    return OooO0O0(this.f15646OooO00o);
                }
                this.f15646OooO00o.reset();
                return OooO00o(this.f15646OooO00o);
            } else if (this.f15644OooO00o != this.f15645OooO00o.size()) {
                return OooO00o();
            } else {
                this.f15645OooO00o = null;
                this.f15644OooO00o = 0;
                return null;
            }
        } catch (Exception e) {
            throw new StreamParsingException(e.toString(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl, com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m15529OooO00o() throws StreamParsingException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC9605iL11 r1 = (AbstractC9605iL11) m15528OooO00o();
            if (r1 == null) {
                return arrayList;
            }
            arrayList.add(r1);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9481LIl
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15530OooO00o(InputStream inputStream) {
        this.f15646OooO00o = inputStream;
        this.f15645OooO00o = null;
        this.f15644OooO00o = 0;
        if (!inputStream.markSupported()) {
            this.f15646OooO00o = new BufferedInputStream(this.f15646OooO00o);
        }
    }
}
