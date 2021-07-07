package com.p118pd.sdk;

import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.SecretKey;

/* renamed from: com.pd.sdk.lIiLil  reason: case insensitive filesystem */
public class C6510lIiLil extends AbstractC6465l1 {
    public C6510lIiLil(II1 ii1, SecretKey secretKey) {
        super(ii1, new Iiiii(secretKey));
    }

    public C6510lIiLil(byte[] bArr, SecretKey secretKey) {
        this(new II1(bArr, null, null), secretKey);
    }

    public C6510lIiLil OooO00o(String str) {
        ((Iiiii) ((AbstractC6465l1) this).f18307OooO00o).OooO00o(str);
        return this;
    }

    public C6510lIiLil OooO00o(Provider provider) {
        ((Iiiii) ((AbstractC6465l1) this).f18307OooO00o).OooO00o(provider);
        return this;
    }

    public C6510lIiLil OooO00o(SecureRandom secureRandom) {
        ((Iiiii) ((AbstractC6465l1) this).f18307OooO00o).OooO00o(secureRandom);
        return this;
    }
}
