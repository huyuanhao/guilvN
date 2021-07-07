package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.lLI1il */
public class lLI1il {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIlL f18465OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlLI1 f18466OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f18467OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18468OooO00o;

    /* renamed from: com.pd.sdk.lLI1il$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {
        public C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Mac f18470OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SecretKey f18471OooO00o;

        public OooO00o(LlLI1 llLI1, int i, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws CMSException {
            KeyGenerator OooO00o2 = lLI1il.this.f18465OooO00o.m16124OooO00o(llLI1);
            secureRandom = secureRandom == null ? new SecureRandom() : secureRandom;
            if (i < 0) {
                OooO00o2.init(secureRandom);
            } else {
                OooO00o2.init(i, secureRandom);
            }
            this.f18471OooO00o = OooO00o2.generateKey();
            this.OooO00o = lLI1il.this.f18465OooO00o.OooO00o(llLI1, algorithmParameters == null ? lLI1il.this.f18465OooO00o.OooO00o(llLI1, this.f18471OooO00o, secureRandom) : algorithmParameters);
            this.f18470OooO00o = lLI1il.this.f18465OooO00o.m16126OooO00o((Key) this.f18471OooO00o, this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new C92991ILi(this.OooO00o, this.f18471OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m17666OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17667OooO00o() {
            return new C9615iiL(this.f18470OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m17668OooO00o() {
            return this.f18470OooO00o.doFinal();
        }
    }

    public lLI1il(LlLI1 llLI1) {
        this(llLI1, -1);
    }

    public lLI1il(LlLI1 llLI1, int i) {
        this.f18465OooO00o = new LIlL(new C6858liI());
        this.f18466OooO00o = llLI1;
        this.OooO00o = i;
    }

    public AbstractC6296il1il1 OooO00o() throws CMSException {
        return new OooO00o(this.f18466OooO00o, this.OooO00o, this.f18467OooO00o, this.f18468OooO00o);
    }

    public lLI1il OooO00o(String str) {
        this.f18465OooO00o = new LIlL(new C6224ii11l(str));
        return this;
    }

    public lLI1il OooO00o(AlgorithmParameters algorithmParameters) {
        this.f18467OooO00o = algorithmParameters;
        return this;
    }

    public lLI1il OooO00o(Provider provider) {
        this.f18465OooO00o = new LIlL(new C9443ILiII(provider));
        return this;
    }

    public lLI1il OooO00o(SecureRandom secureRandom) {
        this.f18468OooO00o = secureRandom;
        return this;
    }
}
