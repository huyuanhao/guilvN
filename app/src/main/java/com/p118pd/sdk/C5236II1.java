package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.II丨1  reason: invalid class name and case insensitive filesystem */
public class C5236II1 implements LiliILiI {
    public final AbstractC6047i1lLI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9760IiI f15519OooO00o;

    public C5236II1(AbstractC6047i1lLI i1lli, AbstractC9760IiI r2) {
        this.OooO00o = i1lli;
        this.f15519OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC6047i1lLI, com.p118pd.sdk.LiliILiI, com.p118pd.sdk.AbstractC6885lllLii, com.p118pd.sdk.AbstractC6885lllLii
    public int OooO00o() {
        return this.f15519OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6047i1lLI, com.p118pd.sdk.LiliILiI, com.p118pd.sdk.AbstractC6885lllLii, com.p118pd.sdk.AbstractC6885lllLii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6047i1lLI m15430OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6047i1lLI, com.p118pd.sdk.LiliILiI, com.p118pd.sdk.AbstractC6885lllLii, com.p118pd.sdk.AbstractC6885lllLii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9760IiI m15431OooO00o() {
        return this.f15519OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6047i1lLI, com.p118pd.sdk.LiliILiI, com.p118pd.sdk.AbstractC6885lllLii, com.p118pd.sdk.AbstractC6885lllLii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15432OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6047i1lLI
    public int OooO0O0() {
        return this.OooO00o.OooO0O0() * this.f15519OooO00o.OooO00o();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5236II1)) {
            return false;
        }
        C5236II1 r5 = (C5236II1) obj;
        return this.OooO00o.equals(r5.OooO00o) && this.f15519OooO00o.equals(r5.f15519OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode() ^ I11I.OooO00o(this.f15519OooO00o.hashCode(), 16);
    }
}
