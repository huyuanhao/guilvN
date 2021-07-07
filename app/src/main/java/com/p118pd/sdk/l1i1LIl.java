package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.cmp.CMPException;

/* renamed from: com.pd.sdk.l1i1LIl */
public class l1i1LIl {
    public C5176I1i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C97411 f18285OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f18286OooO00o;
    public List OooO0O0;

    public l1i1LIl(int i, ILI ili, ILI ili2) {
        this.f18286OooO00o = new ArrayList();
        this.OooO0O0 = new ArrayList();
        this.OooO00o = new C5176I1i(i, ili, ili2);
    }

    public l1i1LIl(ILI ili, ILI ili2) {
        this(2, ili, ili2);
    }

    private C6152iL1i1 OooO00o(C5646LII1 r6, iIilII1 iiilii1) {
        if (this.OooO0O0.isEmpty()) {
            return new C6152iL1i1(new C6777llL1(r6, this.f18285OooO00o, iiilii1));
        }
        int size = this.OooO0O0.size();
        C9826LllL[] r1 = new C9826LllL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = new C9826LllL(((X509CertificateHolder) this.OooO0O0.get(i)).toASN1Structure());
        }
        return new C6152iL1i1(new C6777llL1(r6, this.f18285OooO00o, iiilii1, r1));
    }

    private void OooO00o(C6456l1ilL r3) {
        this.OooO00o.OooO00o(r3);
        if (!this.f18286OooO00o.isEmpty()) {
            this.OooO00o.m15286OooO00o((LLI[]) this.f18286OooO00o.toArray(new LLI[this.f18286OooO00o.size()]));
        }
    }

    private byte[] OooO00o(Lii1ii1 r2, C5646LII1 r3, C97411 r4) throws IOException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(r3);
        r0.OooO00o(r4);
        OutputStream OooO00o2 = r2.m16310OooO00o();
        OooO00o2.write(new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o));
        OooO00o2.close();
        return r2.getSignature();
    }

    private byte[] OooO00o(AbstractC6296il1il1 il1il1, C5646LII1 r3, C97411 r4) throws IOException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(r3);
        r0.OooO00o(r4);
        OutputStream OooO00o2 = il1il1.m17322OooO00o();
        OooO00o2.write(new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o));
        OooO00o2.close();
        return il1il1.m17323OooO00o();
    }

    public C6152iL1i1 OooO00o(Lii1ii1 r4) throws CMPException {
        OooO00o(r4.OooO00o());
        C5646LII1 OooO00o2 = this.OooO00o.OooO00o();
        try {
            return OooO00o(OooO00o2, new iIilII1(OooO00o(r4, OooO00o2, this.f18285OooO00o)));
        } catch (IOException e) {
            throw new CMPException("unable to encode signature input: " + e.getMessage(), e);
        }
    }

    public C6152iL1i1 OooO00o(AbstractC6296il1il1 il1il1) throws CMPException {
        OooO00o(il1il1.m17321OooO00o());
        C5646LII1 OooO00o2 = this.OooO00o.OooO00o();
        try {
            return OooO00o(OooO00o2, new iIilII1(OooO00o(il1il1, OooO00o2, this.f18285OooO00o)));
        } catch (IOException e) {
            throw new CMPException("unable to encode MAC input: " + e.getMessage(), e);
        }
    }

    public l1i1LIl OooO00o(LLI lli) {
        this.f18286OooO00o.add(lli);
        return this;
    }

    public l1i1LIl OooO00o(C97411 r1) {
        this.f18285OooO00o = r1;
        return this;
    }

    public l1i1LIl OooO00o(C9752I11 r2) {
        this.OooO00o.OooO00o(r2);
        return this;
    }

    public l1i1LIl OooO00o(Date date) {
        this.OooO00o.OooO00o(new C9623il(date));
        return this;
    }

    public l1i1LIl OooO00o(X509CertificateHolder x509CertificateHolder) {
        this.OooO0O0.add(x509CertificateHolder);
        return this;
    }

    public l1i1LIl OooO00o(byte[] bArr) {
        this.OooO00o.OooO00o(bArr);
        return this;
    }

    public l1i1LIl OooO0O0(byte[] bArr) {
        this.OooO00o.OooO0O0(bArr);
        return this;
    }

    public l1i1LIl OooO0OO(byte[] bArr) {
        this.OooO00o.OooO0OO(bArr);
        return this;
    }

    public l1i1LIl OooO0Oo(byte[] bArr) {
        this.OooO00o.OooO0Oo(bArr);
        return this;
    }

    public l1i1LIl OooO0o0(byte[] bArr) {
        this.OooO00o.OooO0o0(bArr);
        return this;
    }
}
