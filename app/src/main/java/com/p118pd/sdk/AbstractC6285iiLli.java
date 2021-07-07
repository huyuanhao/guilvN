package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.ii丨Lli  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6285iiLli implements AbstractC5760Lil {
    public IIllLll1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9728l1 f17963OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17964OooO00o;

    public AbstractC6285iiLli(IIllLll1 iIllLll1, AbstractC9728l1 r2) {
        this.OooO00o = iIllLll1;
        this.f17963OooO00o = r2;
    }

    public AbstractC6285iiLli(byte[] bArr, AbstractC9728l1 r2) {
        this.f17964OooO00o = bArr;
        this.f17963OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC5760Lil
    public final C1lIii OooO00o(LIiI11 r6) throws CMSException {
        C5630LIii lIii;
        try {
            byte[] OooO00o2 = this.f17963OooO00o.OooO00o(r6);
            if (this.OooO00o == null) {
                lIii = new C5630LIii((AbstractC6804llL1ii) new C6487lIIiIlL(this.f17964OooO00o));
            }
            return new C1lIii(new C1l1(lIii, this.f17963OooO00o.OooO00o(), new C6487lIIiIlL(OooO00o2)));
        } catch (OperatorException e) {
            throw new CMSException("exception wrapping content key: " + e.getMessage(), e);
        }
    }
}
