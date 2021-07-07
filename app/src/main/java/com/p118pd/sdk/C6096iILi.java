package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.iILi  reason: case insensitive filesystem */
public class C6096iILi {
    public static final Illiiil OooO00o = C9702liIIL.OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f17522OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlLI1 f17523OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5863LL1LI f17524OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17525OooO00o;

    /* renamed from: com.pd.sdk.iILi$OooO00o */
    public class OooO00o implements AbstractC5650LIL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f17526OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Cipher f17527OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SecretKey f17528OooO00o;

        public OooO00o(LlLI1 llLI1, int i, SecureRandom secureRandom) throws CRMFException {
            KeyGenerator OooO00o2 = C6096iILi.this.f17524OooO00o.m16443OooO00o(llLI1);
            secureRandom = secureRandom == null ? new SecureRandom() : secureRandom;
            i = i < 0 ? C6096iILi.OooO00o.OooO00o(llLI1) : i;
            if (i < 0) {
                OooO00o2.init(secureRandom);
            } else {
                OooO00o2.init(i, secureRandom);
            }
            this.f17527OooO00o = C6096iILi.this.f17524OooO00o.m16442OooO00o(llLI1);
            this.f17528OooO00o = OooO00o2.generateKey();
            AlgorithmParameters OooO00o3 = C6096iILi.this.f17524OooO00o.OooO00o(llLI1, this.f17528OooO00o, secureRandom);
            try {
                this.f17527OooO00o.init(1, this.f17528OooO00o, OooO00o3, secureRandom);
                this.f17526OooO00o = C6096iILi.this.f17524OooO00o.OooO00o(llLI1, OooO00o3 == null ? this.f17527OooO00o.getParameters() : OooO00o3);
            } catch (GeneralSecurityException e) {
                throw new CRMFException("unable to initialize cipher: " + e.getMessage(), e);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        public LIiI11 OooO00o() {
            return new C92991ILi(this.f17526OooO00o, this.f17528OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m16963OooO00o() {
            return this.f17526OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL
        public OutputStream OooO00o(OutputStream outputStream) {
            return new CipherOutputStream(outputStream, this.f17527OooO00o);
        }
    }

    public C6096iILi(LlLI1 llLI1) {
        this(llLI1, -1);
    }

    public C6096iILi(LlLI1 llLI1, int i) {
        this.f17524OooO00o = new C5863LL1LI(new ILLli());
        this.f17523OooO00o = llLI1;
        this.f17522OooO00o = i;
    }

    public AbstractC5650LIL OooO00o() throws CRMFException {
        return new OooO00o(this.f17523OooO00o, this.f17522OooO00o, this.f17525OooO00o);
    }

    public C6096iILi OooO00o(String str) {
        this.f17524OooO00o = new C5863LL1LI(new C9588iIi(str));
        return this;
    }

    public C6096iILi OooO00o(Provider provider) {
        this.f17524OooO00o = new C5863LL1LI(new LLIlii(provider));
        return this;
    }

    public C6096iILi OooO00o(SecureRandom secureRandom) {
        this.f17525OooO00o = secureRandom;
        return this;
    }
}
