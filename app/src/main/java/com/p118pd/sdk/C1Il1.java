package com.p118pd.sdk;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.丨丨1Il1  reason: invalid class name */
public class C1Il1 implements AbstractC6594lLi1l1 {
    public C5863LL1LI OooO00o = new C5863LL1LI(new ILLli());

    /* renamed from: OooO00o  reason: collision with other field name */
    public MessageDigest f23375OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Mac f23376OooO00o;

    public C1Il1 OooO00o(String str) {
        this.OooO00o = new C5863LL1LI(new C9588iIi(str));
        return this;
    }

    public C1Il1 OooO00o(Provider provider) {
        this.OooO00o = new C5863LL1LI(new LLIlii(provider));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6594lLi1l1
    public void OooO00o(C6456l1ilL r2, C6456l1ilL r3) throws CRMFException {
        this.f23375OooO00o = this.OooO00o.m16441OooO00o(r2.OooO00o());
        this.f23376OooO00o = this.OooO00o.m16444OooO00o(r3.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC6594lLi1l1
    public byte[] OooO00o(byte[] bArr) {
        return this.f23375OooO00o.digest(bArr);
    }

    @Override // com.p118pd.sdk.AbstractC6594lLi1l1
    public byte[] OooO00o(byte[] bArr, byte[] bArr2) throws CRMFException {
        try {
            this.f23376OooO00o.init(new SecretKeySpec(bArr, this.f23376OooO00o.getAlgorithm()));
            return this.f23376OooO00o.doFinal(bArr2);
        } catch (GeneralSecurityException e) {
            throw new CRMFException("failure in setup: " + e.getMessage(), e);
        }
    }
}
