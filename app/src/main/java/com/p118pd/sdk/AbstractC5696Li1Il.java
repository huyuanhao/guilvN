package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.Li1Il丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5696Li1Il {
    public AbstractC9677lI1li OooO00o = C5725Liill.OooO00o;

    /* renamed from: com.pd.sdk.Li1Il丨$OooO00o */
    public class OooO00o implements AbstractC9449II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ X509CertificateHolder f16557OooO00o;

        public OooO00o(X509CertificateHolder x509CertificateHolder) {
            this.f16557OooO00o = x509CertificateHolder;
        }

        @Override // com.p118pd.sdk.AbstractC9449II
        public lliLLL OooO00o(C6456l1ilL r4) throws OperatorCreationException {
            try {
                return new OooO0OO(r4, AbstractC5696Li1Il.this.OooO00o(r4, AbstractC5696Li1Il.this.OooO00o(this.f16557OooO00o.getSubjectPublicKeyInfo())));
            } catch (IOException e) {
                throw new OperatorCreationException("exception on setup: " + e, e);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        public X509CertificateHolder OooO00o() {
            return this.f16557OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16290OooO00o() {
            return true;
        }
    }

    /* renamed from: com.pd.sdk.Li1Il丨$OooO0O0 */
    public class OooO0O0 implements AbstractC9449II {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6213iL11I f16558OooO00o;

        public OooO0O0(C6213iL11I r2) {
            this.f16558OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC9449II
        public lliLLL OooO00o(C6456l1ilL r4) throws OperatorCreationException {
            return new OooO0OO(r4, AbstractC5696Li1Il.this.OooO00o(r4, this.f16558OooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        public X509CertificateHolder OooO00o() {
            return null;
        }

        @Override // com.p118pd.sdk.AbstractC9449II, com.p118pd.sdk.AbstractC9449II
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16291OooO00o() {
            return false;
        }
    }

    /* renamed from: com.pd.sdk.Li1Il丨$OooO0OO */
    public class OooO0OO implements lliLLL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f16559OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public li1l1iL f16560OooO00o;

        public OooO0OO(C6456l1ilL r2, li1l1iL li1l1il) {
            this.f16559OooO00o = r2;
            this.f16560OooO00o = li1l1il;
        }

        @Override // com.p118pd.sdk.lliLLL, com.p118pd.sdk.lliLLL
        public C6456l1ilL OooO00o() {
            return this.f16559OooO00o;
        }

        @Override // com.p118pd.sdk.lliLLL, com.p118pd.sdk.lliLLL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m16292OooO00o() {
            li1l1iL li1l1il = this.f16560OooO00o;
            if (li1l1il != null) {
                return li1l1il;
            }
            throw new IllegalStateException("verifier not initialised");
        }

        @Override // com.p118pd.sdk.lliLLL
        public boolean verify(byte[] bArr) {
            return this.f16560OooO00o.OooO00o(bArr);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private li1l1iL OooO00o(C6456l1ilL r2, C6213iL11I r3) throws OperatorCreationException {
        AbstractC93171I1 OooO00o2 = OooO00o(r2);
        OooO00o2.OooO00o(false, r3);
        return new li1l1iL(OooO00o2);
    }

    public abstract C6213iL11I OooO00o(C6888ll v) throws IOException;

    public abstract AbstractC93171I1 OooO00o(C6456l1ilL v) throws OperatorCreationException;

    public AbstractC9449II OooO00o(C6213iL11I r2) throws OperatorCreationException {
        return new OooO0O0(r2);
    }

    public AbstractC9449II OooO00o(X509CertificateHolder x509CertificateHolder) throws OperatorCreationException {
        return new OooO00o(x509CertificateHolder);
    }
}
