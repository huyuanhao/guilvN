package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.l1丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6465l1 implements AbstractC5760Lil {
    public final II1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ilLiI1Ii f18307OooO00o;

    public AbstractC6465l1(II1 ii1, ilLiI1Ii illii1ii) {
        this.OooO00o = ii1;
        this.f18307OooO00o = illii1ii;
    }

    @Override // com.p118pd.sdk.AbstractC5760Lil
    public final C1lIii OooO00o(LIiI11 r5) throws CMSException {
        try {
            return new C1lIii(new C6265iiilI(this.OooO00o, this.f18307OooO00o.OooO00o(), new C6487lIIiIlL(this.f18307OooO00o.OooO00o(r5))));
        } catch (OperatorException e) {
            throw new CMSException("exception wrapping content key: " + e.getMessage(), e);
        }
    }
}
