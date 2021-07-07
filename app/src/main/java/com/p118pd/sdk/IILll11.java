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
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.I丨ILll11  reason: invalid class name */
public class IILll11 {
    public static final Illiiil OooO00o = C9702liIIL.OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f15969OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIlL f15970OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlLI1 f15971OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f15972OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15973OooO00o;

    /* renamed from: com.pd.sdk.I丨ILll11$OooO00o */
    public class OooO00o implements AbstractC5650LIL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6456l1ilL f15974OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Cipher f15975OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SecretKey f15976OooO00o;

        public OooO00o(LlLI1 llLI1, int i, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws CMSException {
            KeyGenerator OooO00o2 = IILll11.this.f15970OooO00o.m16124OooO00o(llLI1);
            secureRandom = secureRandom == null ? new SecureRandom() : secureRandom;
            if (i < 0) {
                OooO00o2.init(secureRandom);
            } else {
                OooO00o2.init(i, secureRandom);
            }
            this.f15975OooO00o = IILll11.this.f15970OooO00o.m16122OooO00o(llLI1);
            this.f15976OooO00o = OooO00o2.generateKey();
            algorithmParameters = algorithmParameters == null ? IILll11.this.f15970OooO00o.OooO00o(llLI1, this.f15976OooO00o, secureRandom) : algorithmParameters;
            try {
                this.f15975OooO00o.init(1, this.f15976OooO00o, algorithmParameters, secureRandom);
                this.f15974OooO00o = IILll11.this.f15970OooO00o.OooO00o(llLI1, algorithmParameters == null ? this.f15975OooO00o.getParameters() : algorithmParameters);
            } catch (GeneralSecurityException e) {
                throw new CMSException("unable to initialize cipher: " + e.getMessage(), e);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        public LIiI11 OooO00o() {
            return new C92991ILi(this.f15974OooO00o, this.f15976OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m15758OooO00o() {
            return this.f15974OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL
        public OutputStream OooO00o(OutputStream outputStream) {
            return new CipherOutputStream(outputStream, this.f15975OooO00o);
        }
    }

    public IILll11(LlLI1 llLI1) {
        this(llLI1, OooO00o.OooO00o(llLI1));
    }

    public IILll11(LlLI1 llLI1, int i) {
        int i2;
        this.f15970OooO00o = new LIlL(new C6858liI());
        this.f15971OooO00o = llLI1;
        int OooO00o2 = OooO00o.OooO00o(llLI1);
        if (llLI1.equals(AbstractC5711LiLli.OoooOoo)) {
            i2 = 168;
            if (!(i == 168 || i == OooO00o2)) {
                throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
        } else if (llLI1.equals(AbstractC9733l.OooO0o0)) {
            i2 = 56;
            if (!(i == 56 || i == OooO00o2)) {
                throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
        } else if (OooO00o2 <= 0 || OooO00o2 == i) {
            this.f15969OooO00o = i;
            return;
        } else {
            throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
        }
        this.f15969OooO00o = i2;
    }

    public IILll11 OooO00o(String str) {
        this.f15970OooO00o = new LIlL(new C6224ii11l(str));
        return this;
    }

    public IILll11 OooO00o(AlgorithmParameters algorithmParameters) {
        this.f15972OooO00o = algorithmParameters;
        return this;
    }

    public IILll11 OooO00o(Provider provider) {
        this.f15970OooO00o = new LIlL(new C9443ILiII(provider));
        return this;
    }

    public IILll11 OooO00o(SecureRandom secureRandom) {
        this.f15973OooO00o = secureRandom;
        return this;
    }

    public AbstractC5650LIL OooO00o() throws CMSException {
        return new OooO00o(this.f15971OooO00o, this.f15969OooO00o, this.f15972OooO00o, this.f15973OooO00o);
    }
}
