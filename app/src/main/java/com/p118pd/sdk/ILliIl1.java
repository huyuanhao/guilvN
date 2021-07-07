package com.p118pd.sdk;

import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.openssl.PEMException;

/* renamed from: com.pd.sdk.ILli丨Il1  reason: invalid class name */
public class ILliIl1 {
    public ii1I11l OooO00o = new ILLli();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f15633OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15634OooO00o;

    /* renamed from: com.pd.sdk.ILli丨Il1$OooO00o */
    public class OooO00o implements AbstractC93101ii {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ byte[] f15635OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ char[] f15636OooO00o;

        public OooO00o(byte[] bArr, char[] cArr) {
            this.f15635OooO00o = bArr;
            this.f15636OooO00o = cArr;
        }

        @Override // com.p118pd.sdk.AbstractC93101ii
        public byte[] OooO00o() {
            return this.f15635OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC93101ii
        public byte[] OooO00o(byte[] bArr) throws PEMException {
            return C6437l11.OooO00o(true, ILliIl1.this.OooO00o, bArr, this.f15636OooO00o, ILliIl1.this.f15633OooO00o, this.f15635OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC93101ii
        public String getAlgorithm() {
            return ILliIl1.this.f15633OooO00o;
        }
    }

    public ILliIl1(String str) {
        this.f15633OooO00o = str;
    }

    public ILliIl1 OooO00o(String str) {
        this.OooO00o = new C9588iIi(str);
        return this;
    }

    public ILliIl1 OooO00o(Provider provider) {
        this.OooO00o = new LLIlii(provider);
        return this;
    }

    public ILliIl1 OooO00o(SecureRandom secureRandom) {
        this.f15634OooO00o = secureRandom;
        return this;
    }

    public AbstractC93101ii OooO00o(char[] cArr) {
        if (this.f15634OooO00o == null) {
            this.f15634OooO00o = new SecureRandom();
        }
        byte[] bArr = new byte[(this.f15633OooO00o.startsWith("AES-") ? 16 : 8)];
        this.f15634OooO00o.nextBytes(bArr);
        return new OooO00o(bArr, cArr);
    }
}
