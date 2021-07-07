package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.iII丨l1  reason: invalid class name */
public class iIIl1 extends Ll1L1i {
    public C6642li1LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9875iiI f17502OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17503OooO00o;

    public iIIl1(C6456l1ilL r1, AbstractC9875iiI r2, C6642li1LI r3) {
        super(r1);
        this.f17502OooO00o = r2;
        this.OooO00o = r3;
    }

    @Override // com.p118pd.sdk.AbstractC5773LlIII
    public LIiI11 OooO00o(C6456l1ilL r5, byte[] bArr) throws OperatorException {
        this.f17502OooO00o.OooO00o(false, this.OooO00o);
        try {
            return new LIiI11(r5, this.f17502OooO00o.OooO0O0(bArr, 0, bArr.length));
        } catch (InvalidCipherTextException e) {
            throw new OperatorException("unable to unwrap key: " + e.getMessage(), e);
        }
    }

    public iIIl1 OooO00o(SecureRandom secureRandom) {
        this.f17503OooO00o = secureRandom;
        return this;
    }
}
