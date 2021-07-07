package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* renamed from: com.pd.sdk.I丨I丨丨丨  reason: invalid class name and case insensitive filesystem */
public class C5513II {
    public AbstractC6617lLlIII OooO00o = new iIlLLIiL();

    /* renamed from: com.pd.sdk.I丨I丨丨丨$OooO00o */
    public class OooO00o implements LLII1 {
        public final /* synthetic */ OooO0O0 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LlLI1 f16014OooO00o;

        public OooO00o(LlLI1 llLI1, OooO0O0 oooO0O0) {
            this.f16014OooO00o = llLI1;
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.LLII1, com.p118pd.sdk.LLII1
        public LlLI1 OooO00o() {
            return this.f16014OooO00o;
        }

        @Override // com.p118pd.sdk.LLII1, com.p118pd.sdk.LLII1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m15791OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.LLII1
        public boolean verify(byte[] bArr) {
            try {
                if (!this.f16014OooO00o.OooO00o(AbstractC9525LlI1.OooOOo)) {
                    return this.OooO00o.OooO00o(bArr);
                }
                try {
                    return this.OooO00o.OooO00o(C5513II.OooO0O0(bArr));
                } catch (Exception unused) {
                    return false;
                }
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.I丨I丨丨丨$OooO0O0 */
    public class OooO0O0 extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public Signature f16015OooO00o;

        public OooO0O0(Signature signature) {
            this.f16015OooO00o = signature;
        }

        public boolean OooO00o(byte[] bArr) throws SignatureException {
            return this.f16015OooO00o.verify(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            try {
                this.f16015OooO00o.update((byte) i);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            try {
                this.f16015OooO00o.update(bArr);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f16015OooO00o.update(bArr, i, i2);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }
    }

    public static byte[] OooO0O0(byte[] bArr) throws IOException {
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, length, bArr3, 0, length);
        iILLL1 r5 = new iILLL1();
        r5.OooO00o(new C6513lIiI(new BigInteger(1, bArr2)));
        r5.OooO00o(new C6513lIiI(new BigInteger(1, bArr3)));
        return new C5707LiL1(r5).getEncoded();
    }

    public C5513II OooO00o(String str) {
        this.OooO00o = new I(str);
        return this;
    }

    public C5513II OooO00o(Provider provider) {
        this.OooO00o = new C5572Ilili(provider);
        return this;
    }

    public LLII1 OooO00o(LlLI1 llLI1, PublicKey publicKey) throws OperatorCreationException {
        try {
            Signature OooO00o2 = this.OooO00o.OooO00o(llLI1);
            OooO00o2.initVerify(publicKey);
            return new OooO00o(llLI1, new OooO0O0(OooO00o2));
        } catch (NoSuchAlgorithmException e) {
            throw new OperatorCreationException("unable to find algorithm: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new OperatorCreationException("unable to find provider: " + e2.getMessage(), e2);
        } catch (InvalidKeyException e3) {
            throw new OperatorCreationException("invalid key: " + e3.getMessage(), e3);
        }
    }
}
