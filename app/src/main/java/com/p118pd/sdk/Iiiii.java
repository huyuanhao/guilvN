package com.p118pd.sdk;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.Iiii丨i  reason: invalid class name */
public class Iiiii extends ilLiI1Ii {
    public SecureRandom OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecretKey f15732OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OperatorHelper f15733OooO00o = new OperatorHelper(new ILLli());

    public Iiiii(SecretKey secretKey) {
        super(OooO00o(secretKey));
        this.f15732OooO00o = secretKey;
    }

    public static C6456l1ilL OooO00o(String str, int i) {
        LlLI1 llLI1;
        LlLI1 llLI12;
        if (str.startsWith("DES") || str.startsWith("TripleDES")) {
            return new C6456l1ilL(AbstractC5711LiLli.o000oo00, C6452l1Lll.OooO00o);
        }
        if (str.startsWith("RC2")) {
            return new C6456l1ilL(new LlLI1("1.2.840.113549.1.9.16.3.7"), new C6513lIiI(58));
        }
        if (str.startsWith("AES")) {
            if (i == 128) {
                llLI12 = AbstractC5905LllI.OooOo;
            } else if (i == 192) {
                llLI12 = AbstractC5905LllI.Oooo000;
            } else if (i == 256) {
                llLI12 = AbstractC5905LllI.Oooo0oO;
            } else {
                throw new IllegalArgumentException("illegal keysize in AES");
            }
            return new C6456l1ilL(llLI12);
        } else if (str.startsWith("SEED")) {
            return new C6456l1ilL(ll1IL1.OooO0Oo);
        } else {
            if (str.startsWith("Camellia")) {
                if (i == 128) {
                    llLI1 = lILIiLL.OooO0Oo;
                } else if (i == 192) {
                    llLI1 = lILIiLL.OooO0o0;
                } else if (i == 256) {
                    llLI1 = lILIiLL.OooO0o;
                } else {
                    throw new IllegalArgumentException("illegal keysize in Camellia");
                }
                return new C6456l1ilL(llLI1);
            }
            throw new IllegalArgumentException("unknown algorithm");
        }
    }

    public static C6456l1ilL OooO00o(SecretKey secretKey) {
        return OooO00o(secretKey.getAlgorithm(), secretKey.getEncoded().length * 8);
    }

    public Iiiii OooO00o(String str) {
        this.f15733OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public Iiiii OooO00o(Provider provider) {
        this.f15733OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }

    public Iiiii OooO00o(SecureRandom secureRandom) {
        this.OooO00o = secureRandom;
        return this;
    }

    @Override // com.p118pd.sdk.lI111ll
    public byte[] OooO00o(LIiI11 r5) throws OperatorException {
        Key OooO00o2 = C9799L1Il.OooO00o(r5);
        Cipher OooO0O0 = this.f15733OooO00o.m22983OooO0O0(OooO00o().OooO00o());
        try {
            OooO0O0.init(3, this.f15732OooO00o, this.OooO00o);
            return OooO0O0.wrap(OooO00o2);
        } catch (GeneralSecurityException e) {
            throw new OperatorException("cannot wrap key: " + e.getMessage(), e);
        }
    }
}
