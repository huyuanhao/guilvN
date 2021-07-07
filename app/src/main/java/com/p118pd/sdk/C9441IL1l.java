package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨I丨L1l  reason: invalid class name and case insensitive filesystem */
public class C9441IL1l implements IL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f22985OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f22986OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f22987OooO00o;
    public int OooO0O0;

    /* renamed from: com.pd.sdk.丨I丨L1l$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Mac f22988OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ SecretKey f22989OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ byte[] f22990OooO00o;

        public OooO00o(byte[] bArr, Mac mac, SecretKey secretKey) {
            this.f22990OooO00o = bArr;
            this.f22988OooO00o = mac;
            this.f22989OooO00o = secretKey;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new LIiI11(m21481OooO00o(), this.f22989OooO00o.getEncoded());
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m21481OooO00o() {
            return new C6456l1ilL(C9441IL1l.this.f22985OooO00o, new C6263iiiL(this.f22990OooO00o, C9441IL1l.this.OooO0O0));
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m21482OooO00o() {
            return new C9615iiL(this.f22988OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m21483OooO00o() {
            return this.f22988OooO00o.doFinal();
        }
    }

    public C9441IL1l() {
        this(AbstractC9733l.OooO);
    }

    public C9441IL1l(LlLI1 llLI1) {
        this.f22986OooO00o = new ILLli();
        this.OooO0O0 = 1024;
        this.f22985OooO00o = llLI1;
    }

    @Override // com.p118pd.sdk.IL
    public AbstractC6296il1il1 OooO00o(char[] cArr) throws OperatorCreationException {
        if (this.f22987OooO00o == null) {
            this.f22987OooO00o = new SecureRandom();
        }
        try {
            Mac OooO00o2 = this.f22986OooO00o.m17227OooO00o(this.f22985OooO00o.m16387OooO0O0());
            int macLength = OooO00o2.getMacLength();
            this.OooO00o = macLength;
            byte[] bArr = new byte[macLength];
            this.f22987OooO00o.nextBytes(bArr);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, this.OooO0O0);
            PKCS12Key pKCS12Key = new PKCS12Key(cArr);
            OooO00o2.init(pKCS12Key, pBEParameterSpec);
            return new OooO00o(bArr, OooO00o2, pKCS12Key);
        } catch (Exception e) {
            throw new OperatorCreationException("unable to create MAC calculator: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.IL
    public C6456l1ilL OooO00o() {
        return new C6456l1ilL(this.f22985OooO00o, C6452l1Lll.OooO00o);
    }

    public C9441IL1l OooO00o(int i) {
        this.OooO0O0 = i;
        return this;
    }

    public C9441IL1l OooO00o(String str) {
        this.f22986OooO00o = new C9588iIi(str);
        return this;
    }

    public C9441IL1l OooO00o(Provider provider) {
        this.f22986OooO00o = new LLIlii(provider);
        return this;
    }
}
