package com.p118pd.sdk;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.ii丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6280ii implements AbstractC9523Ll1LI {
    public LIlL OooO00o = new LIlL(new C6858liI());

    /* renamed from: OooO00o  reason: collision with other field name */
    public char[] f17960OooO00o;
    public int OooO0OO = 1;

    public AbstractC6280ii(char[] cArr) {
        this.f17960OooO00o = cArr;
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public int OooO00o() {
        return this.OooO0OO;
    }

    public AbstractC6280ii OooO00o(int i) {
        this.OooO0OO = i;
        return this;
    }

    public AbstractC6280ii OooO00o(String str) {
        this.OooO00o = new LIlL(new C6224ii11l(str));
        return this;
    }

    public AbstractC6280ii OooO00o(Provider provider) {
        this.OooO00o = new LIlL(new C9443ILiII(provider));
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public Key OooO00o(C6456l1ilL r5, C6456l1ilL r6, byte[] bArr, byte[] bArr2) throws CMSException {
        Cipher OooO0O0 = this.OooO00o.OooO0O0(r5.OooO00o());
        try {
            OooO0O0.init(4, new SecretKeySpec(bArr, OooO0O0.getAlgorithm()), new IvParameterSpec(AbstractC6804llL1ii.OooO00o(r5.m17587OooO0O0()).m17938OooO00o()));
            return OooO0O0.unwrap(bArr2, r6.OooO00o().m16387OooO0O0(), 3);
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot process content encryption key: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public byte[] OooO00o(int i, C6456l1ilL r4, int i2) throws CMSException {
        return this.OooO00o.OooO00o(i, this.f17960OooO00o, r4, i2);
    }

    @Override // com.p118pd.sdk.AbstractC9523Ll1LI
    public char[] getPassword() {
        return this.f17960OooO00o;
    }
}
