package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.丨i丨丨II  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9652iII extends AbstractC9728l1 {
    public C6213iL11I OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23248OooO00o;

    public AbstractC9652iII(C6456l1ilL r1, C6213iL11I r2) {
        super(r1);
        this.OooO00o = r2;
    }

    public abstract Ii1IliL OooO00o(LlLI1 llLI1);

    public AbstractC9652iII OooO00o(SecureRandom secureRandom) {
        this.f23248OooO00o = secureRandom;
        return this;
    }

    @Override // com.p118pd.sdk.lI111ll
    public byte[] OooO00o(LIiI11 r5) throws OperatorException {
        Ii1IliL OooO00o2 = OooO00o(OooO00o().OooO00o());
        AbstractC6370iIIIl r1 = this.OooO00o;
        SecureRandom secureRandom = this.f23248OooO00o;
        if (secureRandom != null) {
            r1 = new liLL1l(r1, secureRandom);
        }
        try {
            byte[] OooO00o3 = C6210iLiI.OooO00o(r5);
            OooO00o2.OooO00o(true, r1);
            return OooO00o2.OooO00o(OooO00o3, 0, OooO00o3.length);
        } catch (InvalidCipherTextException e) {
            throw new OperatorException("unable to encrypt contents key", e);
        }
    }
}
