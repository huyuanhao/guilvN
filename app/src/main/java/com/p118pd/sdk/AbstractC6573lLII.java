package com.p118pd.sdk;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.lLII  reason: case insensitive filesystem */
public abstract class AbstractC6573lLII implements AbstractC6520lIlLi {
    public static final byte[] OooO0O0 = C6472l1l1l.OooO00o("0c14416e6f6e796d6f75732053656e64657220202020");
    public LIlL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PrivateKey f18474OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f18475OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18476OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18477OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public LIlL f18478OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18479OooO0O0;

    public AbstractC6573lLII(PrivateKey privateKey, byte[] bArr) {
        LIlL lIlL = new LIlL(new C6858liI());
        this.OooO00o = lIlL;
        this.f18478OooO0O0 = lIlL;
        this.f18474OooO00o = privateKey;
        this.f18477OooO00o = bArr;
    }

    public static byte[] OooO00o(C9610iLl1 r2) throws IOException {
        return r2.m21667OooO00o() != null ? new IIllLll1(r2.OooO00o(), r2.m21667OooO00o()).OooO00o(AbstractC5533IiL.OooO00o) : new C6487lIIiIlL(r2.m21668OooO00o()).getEncoded();
    }

    public AbstractC6573lLII OooO00o(LlLI1 llLI1, String str) {
        this.f18475OooO00o.put(llLI1, str);
        return this;
    }

    public AbstractC6573lLII OooO00o(String str) {
        this.f18478OooO0O0 = C5334IL1.OooO00o(str);
        return this;
    }

    public AbstractC6573lLII OooO00o(Provider provider) {
        this.f18478OooO0O0 = C5334IL1.OooO00o(provider);
        return this;
    }

    public AbstractC6573lLII OooO00o(boolean z) {
        this.f18476OooO00o = z;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6520lIlLi
    public Key OooO00o(C6456l1ilL r5, C6456l1ilL r6, byte[] bArr) throws CMSException {
        try {
            Key OooO00o2 = this.OooO00o.OooO00o(r6.OooO00o(), this.OooO00o.OooO00o(r5, this.f18474OooO00o, OooO0O0, this.f18477OooO00o).OooO00o(r6, bArr));
            if (this.f18476OooO00o) {
                this.OooO00o.OooO00o(r6, OooO00o2);
            }
            return OooO00o2;
        } catch (OperatorException e) {
            throw new CMSException("exception unwrapping key: " + e.getMessage(), e);
        }
    }

    public AbstractC6573lLII OooO0O0(String str) {
        LIlL lIlL = new LIlL(new C6224ii11l(str));
        this.OooO00o = lIlL;
        this.f18478OooO0O0 = lIlL;
        return this;
    }

    public AbstractC6573lLII OooO0O0(Provider provider) {
        LIlL lIlL = new LIlL(new C9443ILiII(provider));
        this.OooO00o = lIlL;
        this.f18478OooO0O0 = lIlL;
        return this;
    }
}
