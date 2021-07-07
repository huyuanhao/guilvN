package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.SecretKey;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.IiLi1 */
public class IiLi1 {
    public static final String OooO = AbstractC5711LiLli.o000o0oO.m16387OooO0O0();
    public static final String OooO00o = AbstractC5905LllI.OooOo0.m16387OooO0O0();
    public static final String OooO0O0 = AbstractC5905LllI.OooOoo.m16387OooO0O0();
    public static final String OooO0OO = AbstractC5905LllI.Oooo0OO.m16387OooO0O0();
    public static final String OooO0Oo = AbstractC5711LiLli.OoooOoo.m16387OooO0O0();
    public static final String OooO0o = AbstractC5711LiLli.o000o0Oo.m16387OooO0O0();
    public static final String OooO0o0 = AbstractC5711LiLli.o000o0OO.m16387OooO0O0();
    public static final String OooO0oO = AbstractC5711LiLli.o000o0o0.m16387OooO0O0();
    public static final String OooO0oo = AbstractC5711LiLli.o000o0o.m16387OooO0O0();
    public static final String OooOO0 = AbstractC5711LiLli.o000o0oo.m16387OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15708OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f15709OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f15710OooO00o = new ILLli();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15711OooO00o = new C6456l1ilL(AbstractC5711LiLli.Oooooo, C6452l1Lll.OooO00o);

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameterGenerator f15712OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f15713OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15714OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Cipher f15715OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecretKey f15716OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15717OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public char[] f15718OooO00o;

    /* renamed from: com.pd.sdk.IiLi1$OooO00o */
    public class OooO00o implements AbstractC5650LIL {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f15719OooO00o;

        public OooO00o(C6456l1ilL r2) {
            this.f15719OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        public LIiI11 OooO00o() {
            return new C92991ILi(this.f15719OooO00o, IiLi1.this.f15716OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL, com.p118pd.sdk.AbstractC5650LIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m15595OooO00o() {
            return this.f15719OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC5650LIL
        public OutputStream OooO00o(OutputStream outputStream) {
            return new CipherOutputStream(outputStream, IiLi1.this.f15715OooO00o);
        }
    }

    public IiLi1(LlLI1 llLI1) {
        this.f15709OooO00o = llLI1;
        this.f15708OooO00o = 2048;
    }

    public IiLi1 OooO00o(int i) {
        this.f15708OooO00o = i;
        return this;
    }

    public IiLi1 OooO00o(C6456l1ilL r1) {
        this.f15711OooO00o = r1;
        return this;
    }

    public IiLi1 OooO00o(String str) {
        this.f15710OooO00o = new C9588iIi(str);
        return this;
    }

    public IiLi1 OooO00o(Provider provider) {
        this.f15710OooO00o = new LLIlii(provider);
        return this;
    }

    public IiLi1 OooO00o(SecureRandom secureRandom) {
        this.f15714OooO00o = secureRandom;
        return this;
    }

    public IiLi1 OooO00o(char[] cArr) {
        this.f15718OooO00o = cArr;
        return this;
    }

    public AbstractC5650LIL OooO00o() throws OperatorCreationException {
        C6456l1ilL r0;
        if (this.f15714OooO00o == null) {
            this.f15714OooO00o = new SecureRandom();
        }
        try {
            this.f15715OooO00o = this.f15710OooO00o.m17224OooO00o(this.f15709OooO00o.m16387OooO0O0());
            if (C6437l11.OooO0OO(this.f15709OooO00o)) {
                this.f15712OooO00o = this.f15710OooO00o.OooO00o(this.f15709OooO00o.m16387OooO0O0());
            }
            if (C6437l11.OooO0OO(this.f15709OooO00o)) {
                byte[] bArr = new byte[C6437l11.OooO00o(this.f15711OooO00o.OooO00o())];
                this.f15717OooO00o = bArr;
                this.f15714OooO00o.nextBytes(bArr);
                AlgorithmParameters generateParameters = this.f15712OooO00o.generateParameters();
                this.f15713OooO00o = generateParameters;
                try {
                    C6579lLL lll = new C6579lLL(this.f15709OooO00o, AbstractC6122iIlLiL.OooO00o(generateParameters.getEncoded()));
                    Il1iLLi il1iLLi = new Il1iLLi(AbstractC5711LiLli.OoooOo0, new C5772LlIII(this.f15717OooO00o, this.f15708OooO00o, this.f15711OooO00o));
                    iILLL1 r3 = new iILLL1();
                    r3.OooO00o(il1iLLi);
                    r3.OooO00o(lll);
                    r0 = new C6456l1ilL(AbstractC5711LiLli.OoooOOo, C9545LI.OooO00o(new C5707LiL1(r3)));
                    try {
                        this.f15716OooO00o = C6437l11.OooO00o(this.f15711OooO00o) ? C6437l11.OooO00o(this.f15710OooO00o, this.f15709OooO00o.m16387OooO0O0(), this.f15718OooO00o, this.f15717OooO00o, this.f15708OooO00o) : C6437l11.OooO00o(this.f15710OooO00o, this.f15709OooO00o.m16387OooO0O0(), this.f15718OooO00o, this.f15717OooO00o, this.f15708OooO00o, this.f15711OooO00o);
                        this.f15715OooO00o.init(1, this.f15716OooO00o, this.f15713OooO00o);
                    } catch (GeneralSecurityException e) {
                        throw new OperatorCreationException(e.getMessage(), e);
                    }
                } catch (IOException e2) {
                    throw new OperatorCreationException(e2.getMessage(), e2);
                }
            } else if (C6437l11.m17554OooO00o(this.f15709OooO00o)) {
                iILLL1 r02 = new iILLL1();
                byte[] bArr2 = new byte[20];
                this.f15717OooO00o = bArr2;
                this.f15714OooO00o.nextBytes(bArr2);
                r02.OooO00o(new C6487lIIiIlL(this.f15717OooO00o));
                r02.OooO00o(new C6513lIiI((long) this.f15708OooO00o));
                C6456l1ilL r2 = new C6456l1ilL(this.f15709OooO00o, C6263iiiL.OooO00o(new C5707LiL1(r02)));
                try {
                    this.f15715OooO00o.init(1, new PKCS12KeyWithParameters(this.f15718OooO00o, this.f15717OooO00o, this.f15708OooO00o));
                    r0 = r2;
                } catch (GeneralSecurityException e3) {
                    throw new OperatorCreationException(e3.getMessage(), e3);
                }
            } else {
                throw new OperatorCreationException("unknown algorithm: " + this.f15709OooO00o, null);
            }
            return new OooO00o(r0);
        } catch (GeneralSecurityException e4) {
            throw new OperatorCreationException(this.f15709OooO00o + " not available: " + e4.getMessage(), e4);
        }
    }
}
