package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.llI1  reason: case insensitive filesystem */
public class C6746llI1 {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f18720OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18721OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameterSpec f18722OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OperatorHelper f18723OooO00o = new OperatorHelper(new ILLli());

    /* renamed from: com.pd.sdk.llI1$OooO00o */
    public class OooO00o implements Lii1ii1 {
        public final /* synthetic */ C6456l1ilL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0O0 f18724OooO00o = new OooO0O0(this.f18726OooO00o);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Signature f18726OooO00o;

        public OooO00o(Signature signature, C6456l1ilL r3) {
            this.f18726OooO00o = signature;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.Lii1ii1, com.p118pd.sdk.Lii1ii1
        public C6456l1ilL OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.Lii1ii1, com.p118pd.sdk.Lii1ii1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17845OooO00o() {
            return this.f18724OooO00o;
        }

        @Override // com.p118pd.sdk.Lii1ii1
        public byte[] getSignature() {
            try {
                return this.f18724OooO00o.OooO0O0();
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.llI1$OooO0O0 */
    public class OooO0O0 extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public Signature f18727OooO00o;

        public OooO0O0(Signature signature) {
            this.f18727OooO00o = signature;
        }

        public byte[] OooO0O0() throws SignatureException {
            return this.f18727OooO00o.sign();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            try {
                this.f18727OooO00o.update((byte) i);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            try {
                this.f18727OooO00o.update(bArr);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f18727OooO00o.update(bArr, i, i2);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }
    }

    public C6746llI1(String str) {
        this.f18720OooO00o = str;
        this.OooO00o = new C5380Iil().OooO00o(str);
        this.f18722OooO00o = null;
    }

    public C6746llI1(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        this.f18720OooO00o = str;
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
            this.f18722OooO00o = pSSParameterSpec;
            this.OooO00o = new C6456l1ilL(AbstractC5711LiLli.Oooo00o, OooO00o(pSSParameterSpec));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown sigParamSpec: ");
        sb.append(algorithmParameterSpec == null ? "null" : algorithmParameterSpec.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static C6692lii OooO00o(PSSParameterSpec pSSParameterSpec) {
        C6056i1I r0 = new C6056i1I();
        return new C6692lii(r0.OooO00o(pSSParameterSpec.getDigestAlgorithm()), new C6456l1ilL(AbstractC5711LiLli.Oooo000, r0.OooO00o(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm())), new C6513lIiI((long) pSSParameterSpec.getSaltLength()), new C6513lIiI((long) pSSParameterSpec.getTrailerField()));
    }

    public Lii1ii1 OooO00o(PrivateKey privateKey) throws OperatorCreationException {
        try {
            Signature OooO0O02 = this.f18723OooO00o.OooO0O0(this.OooO00o);
            C6456l1ilL r1 = this.OooO00o;
            if (this.f18721OooO00o != null) {
                OooO0O02.initSign(privateKey, this.f18721OooO00o);
            } else {
                OooO0O02.initSign(privateKey);
            }
            return new OooO00o(OooO0O02, r1);
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException("cannot create signer: " + e.getMessage(), e);
        }
    }

    public C6746llI1 OooO00o(String str) {
        this.f18723OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public C6746llI1 OooO00o(Provider provider) {
        this.f18723OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }

    public C6746llI1 OooO00o(SecureRandom secureRandom) {
        this.f18721OooO00o = secureRandom;
        return this;
    }
}
