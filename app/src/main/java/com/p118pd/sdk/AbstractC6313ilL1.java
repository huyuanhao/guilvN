package com.p118pd.sdk;

import java.security.Key;
import java.security.Provider;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.ilL1  reason: case insensitive filesystem */
public abstract class AbstractC6313ilL1 implements AbstractC6479lI1L {
    public LIlL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecretKey f18017OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18018OooO00o = false;
    public LIlL OooO0O0;

    public AbstractC6313ilL1(SecretKey secretKey) {
        LIlL lIlL = new LIlL(new C6858liI());
        this.OooO00o = lIlL;
        this.OooO0O0 = lIlL;
        this.f18017OooO00o = secretKey;
    }

    public AbstractC6313ilL1 OooO00o(String str) {
        this.OooO0O0 = new LIlL(new C6224ii11l(str));
        return this;
    }

    public AbstractC6313ilL1 OooO00o(Provider provider) {
        this.OooO0O0 = new LIlL(new C9443ILiII(provider));
        return this;
    }

    public AbstractC6313ilL1 OooO00o(boolean z) {
        this.f18018OooO00o = z;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6479lI1L
    public Key OooO00o(C6456l1ilL r3, C6456l1ilL r4, byte[] bArr) throws CMSException {
        try {
            Key OooO00o2 = this.OooO00o.OooO00o(r4.OooO00o(), this.OooO00o.OooO00o(r3, this.f18017OooO00o).OooO00o(r4, bArr));
            if (this.f18018OooO00o) {
                this.OooO00o.OooO00o(r4, OooO00o2);
            }
            return OooO00o2;
        } catch (OperatorException e) {
            throw new CMSException("exception unwrapping key: " + e.getMessage(), e);
        }
    }

    public AbstractC6313ilL1 OooO0O0(String str) {
        LIlL lIlL = new LIlL(new C6224ii11l(str));
        this.OooO00o = lIlL;
        this.OooO0O0 = lIlL;
        return this;
    }

    public AbstractC6313ilL1 OooO0O0(Provider provider) {
        LIlL lIlL = new LIlL(new C9443ILiII(provider));
        this.OooO00o = lIlL;
        this.OooO0O0 = lIlL;
        return this;
    }
}
