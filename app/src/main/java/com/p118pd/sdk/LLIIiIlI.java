package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.pd.sdk.LLIIiIlI */
public class LLIIiIlI extends C9489LLIL {
    public ii1I11l OooO00o = new ILLli();

    public LLIIiIlI(C1II1L r1, ii1I11l ii1i11l) {
        super(r1);
        this.OooO00o = ii1i11l;
    }

    public LLIIiIlI(byte[] bArr) {
        super(bArr);
    }

    @Override // com.p118pd.sdk.C9489LLIL, com.p118pd.sdk.C9489LLIL
    public LLIIiIlI OooO00o(String str) {
        return new LLIIiIlI(super.OooO00o, new C9588iIi(str));
    }

    public LLIIiIlI OooO00o(Provider provider) {
        return new LLIIiIlI(super.OooO00o, new LLIlii(provider));
    }

    @Override // com.p118pd.sdk.C9489LLIL, com.p118pd.sdk.C9489LLIL, com.p118pd.sdk.C9489LLIL, com.p118pd.sdk.C9489LLIL, com.p118pd.sdk.C9489LLIL, com.p118pd.sdk.C9489LLIL
    public PublicKey OooO00o() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        try {
            C6888ll OooO00o2 = super.OooO00o.m21265OooO00o().m21727OooO00o();
            return this.OooO00o.m17218OooO00o(OooO00o2.m18041OooO00o().OooO00o().m16387OooO0O0()).generatePublic(new X509EncodedKeySpec(OooO00o2.getEncoded()));
        } catch (Exception unused) {
            throw new InvalidKeyException("error encoding public key");
        }
    }
}
