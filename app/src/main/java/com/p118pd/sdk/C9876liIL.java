package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.丨丨丨li丨IL  reason: invalid class name and case insensitive filesystem */
public class C9876liIL extends Ll1L1i {
    public SecretKey OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OperatorHelper f23488OooO00o = new OperatorHelper(new ILLli());

    public C9876liIL(C6456l1ilL r2, SecretKey secretKey) {
        super(r2);
        this.OooO00o = secretKey;
    }

    @Override // com.p118pd.sdk.AbstractC5773LlIII
    public LIiI11 OooO00o(C6456l1ilL r5, byte[] bArr) throws OperatorException {
        try {
            Cipher OooO0O0 = this.f23488OooO00o.m22983OooO0O0(OooO00o().OooO00o());
            OooO0O0.init(4, this.OooO00o);
            return new C92991ILi(r5, OooO0O0.unwrap(bArr, this.f23488OooO00o.m22976OooO00o(r5.OooO00o()), 3));
        } catch (InvalidKeyException e) {
            throw new OperatorException("key invalid in message.", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new OperatorException("can't find algorithm.", e2);
        }
    }

    public C9876liIL OooO00o(String str) {
        this.f23488OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public C9876liIL OooO00o(Provider provider) {
        this.f23488OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }
}
