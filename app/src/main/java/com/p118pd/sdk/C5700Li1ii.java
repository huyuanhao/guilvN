package com.p118pd.sdk;

import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.Li1ii丨  reason: invalid class name and case insensitive filesystem */
public class C5700Li1ii implements AbstractC6806llL {
    public static final byte[] OooO00o = Strings.m22985OooO00o("password");
    public static final byte[] OooO0O0 = Strings.m22985OooO00o("salt");

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6057i1L f16576OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6515lIl f16577OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6769llL1L f16578OooO00o;

    public C5700Li1ii(C6057i1L r1, C6515lIl lil, AbstractC6769llL1L lll1l) {
        this.f16576OooO00o = r1;
        this.f16577OooO00o = lil;
        this.f16578OooO00o = lll1l;
    }

    public static C5700Li1ii OooO00o(C6057i1L r3, byte[] bArr) {
        C6515lIl lil = new C6515lIl();
        lil.OooO00o(r3, L1LL1Ii.m15920OooO00o((short) 2));
        C6383iLl1 r2 = new C6383iLl1(L1LL1Ii.m15920OooO00o((short) 2));
        r2.OooO00o(new C6642li1LI(bArr));
        return new C5700Li1ii(r3, lil, r2);
    }

    @Override // com.p118pd.sdk.AbstractC6806llL
    public C6142iIlI OooO00o(byte[] bArr) {
        AbstractC6769llL1L lll1l = this.f16578OooO00o;
        byte[] bArr2 = OooO0O0;
        lll1l.update(bArr2, 0, bArr2.length);
        this.f16578OooO00o.update(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[this.f16578OooO00o.OooO00o()];
        this.f16578OooO00o.OooO00o(bArr3, 0);
        AbstractC6769llL1L lll1l2 = this.f16578OooO00o;
        byte[] bArr4 = OooO00o;
        lll1l2.update(bArr4, 0, bArr4.length);
        this.f16578OooO00o.update(bArr, 0, bArr.length);
        byte[] bArr5 = new byte[this.f16578OooO00o.OooO00o()];
        this.f16578OooO00o.OooO00o(bArr5, 0);
        return new C6142iIlI(this.f16576OooO00o, this.f16577OooO00o.OooO00o(bArr3, bArr, bArr5), bArr3);
    }
}
