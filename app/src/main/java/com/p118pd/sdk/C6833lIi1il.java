package com.p118pd.sdk;

import java.util.Set;
import org.bouncycastle.est.ESTException;

/* renamed from: com.pd.sdk.l丨Ii1il丨  reason: invalid class name and case insensitive filesystem */
public class C6833lIi1il implements AbstractC9522Ll1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1iLii f18885OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9479LIiIL1i f18886OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9628ilI f18887OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Long f18888OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<String> f18889OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f18890OooO00o;

    public C6833lIi1il(AbstractC9479LIiIL1i r1, AbstractC9628ilI r2, int i, LL1iLii r4, Set<String> set, Long l, boolean z) {
        this.f18886OooO00o = r1;
        this.f18887OooO00o = r2;
        this.OooO00o = i;
        this.f18885OooO00o = r4;
        this.f18889OooO00o = set;
        this.f18888OooO00o = l;
        this.f18890OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9522Ll1, com.p118pd.sdk.AbstractC9522Ll1
    public iLL11Ll1 OooO00o() throws ESTException {
        try {
            return new C5810LlI1L(new C9653il(this.f18887OooO00o.OooO00o(), this.f18886OooO00o, this.OooO00o, this.f18885OooO00o, this.f18889OooO00o, this.f18888OooO00o, this.f18890OooO00o));
        } catch (Exception e) {
            throw new ESTException(e.getMessage(), e.getCause());
        }
    }

    @Override // com.p118pd.sdk.AbstractC9522Ll1, com.p118pd.sdk.AbstractC9522Ll1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17971OooO00o() {
        return this.f18887OooO00o.m21694OooO00o();
    }
}
