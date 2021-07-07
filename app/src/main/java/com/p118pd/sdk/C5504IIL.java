package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.I丨IL  reason: invalid class name and case insensitive filesystem */
public class C5504IIL {
    public OperatorHelper OooO00o = new OperatorHelper(new ILLli());

    /* renamed from: com.pd.sdk.I丨IL$OooO00o */
    public class OooO00o implements AbstractC9449II {
        public C5506OooO0o0 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ X509Certificate f15963OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ X509CertificateHolder f15964OooO00o;

        public OooO00o(X509CertificateHolder x509CertificateHolder, X509Certificate x509Certificate) {
            this.f15964OooO00o = x509CertificateHolder;
            this.f15963OooO00o = x509Certificate;
        }

        @Override // com.p118pd.sdk.AbstractC9449II
        public lliLLL OooO00o(C6456l1ilL r5) throws OperatorCreationException {
            try {
                Signature OooO0O0 = C5504IIL.this.OooO00o.OooO0O0(r5);
                OooO0O0.initVerify(this.f15963OooO00o.getPublicKey());
                this.OooO00o = new C5506OooO0o0(OooO0O0);
                Signature OooO00o2 = C5504IIL.this.m15754OooO00o((C5504IIL) r5, (C6456l1ilL) this.f15963OooO00o.getPublicKey());
                return OooO00o2 != null ? new OooO0OO(r5, this.OooO00o, OooO00o2) : new C5505OooO0Oo(r5, this.OooO00o);
            } catch (GeneralSecurityException e) {
                throw new OperatorCreationException("exception on setup: " + e, e);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        public X509CertificateHolder OooO00o() {
            return this.f15964OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m15755OooO00o() {
            return true;
        }
    }

    /* renamed from: com.pd.sdk.I丨IL$OooO0O0 */
    public class OooO0O0 implements AbstractC9449II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ PublicKey f15965OooO00o;

        public OooO0O0(PublicKey publicKey) {
            this.f15965OooO00o = publicKey;
        }

        @Override // com.p118pd.sdk.AbstractC9449II
        public lliLLL OooO00o(C6456l1ilL r5) throws OperatorCreationException {
            C5506OooO0o0 OooO00o2 = C5504IIL.this.OooO00o((C5504IIL) r5, (C6456l1ilL) this.f15965OooO00o);
            Signature OooO00o3 = C5504IIL.this.m15754OooO00o((C5504IIL) r5, (C6456l1ilL) this.f15965OooO00o);
            return OooO00o3 != null ? new OooO0OO(r5, OooO00o2, OooO00o3) : new C5505OooO0Oo(r5, OooO00o2);
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        public X509CertificateHolder OooO00o() {
            return null;
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m15756OooO00o() {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.I丨IL$OooO0OO */
    public class OooO0OO extends C5505OooO0Oo implements AbstractC9463L1iiI {
        public Signature OooO00o;

        public OooO0OO(C6456l1ilL r2, C5506OooO0o0 oooO0o0, Signature signature) {
            super(r2, oooO0o0);
            this.OooO00o = signature;
        }

        @Override // com.p118pd.sdk.AbstractC9463L1iiI
        public boolean OooO00o(byte[] bArr, byte[] bArr2) {
            try {
                this.OooO00o.update(bArr);
                boolean verify = this.OooO00o.verify(bArr2);
                try {
                    ((C5505OooO0Oo) this).OooO00o.OooO00o(bArr2);
                } catch (Exception unused) {
                }
                return verify;
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining raw signature: " + e.getMessage(), e);
            } catch (Throwable th) {
                try {
                    ((C5505OooO0Oo) this).OooO00o.OooO00o(bArr2);
                } catch (Exception unused2) {
                }
                throw th;
            }
        }

        @Override // com.p118pd.sdk.C5504IIL.C5505OooO0Oo, com.p118pd.sdk.lliLLL
        public boolean verify(byte[] bArr) {
            try {
                return super.verify(bArr);
            } finally {
                try {
                    this.OooO00o.verify(bArr);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.I丨IL$OooO0Oo  reason: case insensitive filesystem */
    public class C5505OooO0Oo implements lliLLL {
        public C5506OooO0o0 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f15967OooO00o;

        public C5505OooO0Oo(C6456l1ilL r2, C5506OooO0o0 oooO0o0) {
            this.f15967OooO00o = r2;
            this.OooO00o = oooO0o0;
        }

        @Override // com.p118pd.sdk.lliLLL, com.p118pd.sdk.lliLLL
        public C6456l1ilL OooO00o() {
            return this.f15967OooO00o;
        }

        @Override // com.p118pd.sdk.lliLLL, com.p118pd.sdk.lliLLL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m15757OooO00o() {
            C5506OooO0o0 oooO0o0 = this.OooO00o;
            if (oooO0o0 != null) {
                return oooO0o0;
            }
            throw new IllegalStateException("verifier not initialised");
        }

        @Override // com.p118pd.sdk.lliLLL
        public boolean verify(byte[] bArr) {
            try {
                return this.OooO00o.OooO00o(bArr);
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.I丨IL$OooO0o0  reason: case insensitive filesystem */
    public class C5506OooO0o0 extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public Signature f15968OooO00o;

        public C5506OooO0o0(Signature signature) {
            this.f15968OooO00o = signature;
        }

        public boolean OooO00o(byte[] bArr) throws SignatureException {
            return this.f15968OooO00o.verify(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            try {
                this.f15968OooO00o.update((byte) i);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            try {
                this.f15968OooO00o.update(bArr);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f15968OooO00o.update(bArr, i, i2);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private C5506OooO0o0 OooO00o(C6456l1ilL r3, PublicKey publicKey) throws OperatorCreationException {
        try {
            Signature OooO0O02 = this.OooO00o.OooO0O0(r3);
            OooO0O02.initVerify(publicKey);
            return new C5506OooO0o0(OooO0O02);
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("exception on setup: " + e, e);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: OooO00o  reason: collision with other method in class */
    private Signature m15754OooO00o(C6456l1ilL r2, PublicKey publicKey) {
        try {
            Signature OooO00o2 = this.OooO00o.m22980OooO00o(r2);
            if (OooO00o2 == null) {
                return OooO00o2;
            }
            OooO00o2.initVerify(publicKey);
            return OooO00o2;
        } catch (Exception unused) {
            return null;
        }
    }

    public C5504IIL OooO00o(String str) {
        this.OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public C5504IIL OooO00o(Provider provider) {
        this.OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }

    public AbstractC9449II OooO00o(C6888ll r2) throws OperatorCreationException {
        return OooO00o(this.OooO00o.OooO00o(r2));
    }

    public AbstractC9449II OooO00o(PublicKey publicKey) throws OperatorCreationException {
        return new OooO0O0(publicKey);
    }

    public AbstractC9449II OooO00o(X509Certificate x509Certificate) throws OperatorCreationException {
        try {
            return new OooO00o(new JcaX509CertificateHolder(x509Certificate), x509Certificate);
        } catch (CertificateEncodingException e) {
            throw new OperatorCreationException("cannot process certificate: " + e.getMessage(), e);
        }
    }

    public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException, CertificateException {
        return OooO00o(this.OooO00o.OooO00o(x509CertificateHolder));
    }
}
