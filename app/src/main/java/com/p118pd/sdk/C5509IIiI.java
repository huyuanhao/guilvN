package com.p118pd.sdk;

import java.util.Date;

/* renamed from: com.pd.sdk.I丨Ii丨I  reason: invalid class name and case insensitive filesystem */
public class C5509IIiI extends AbstractC5738Lil implements AbstractC5462Ilil {
    public final C5753LiI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9623il f15977OooO00o;

    public C5509IIiI(C5753LiI1 r2) {
        this.f15977OooO00o = null;
        this.OooO00o = r2;
    }

    public C5509IIiI(C9623il r1) {
        this.f15977OooO00o = r1;
        this.OooO00o = null;
    }

    public C5509IIiI(Date date) {
        this(new C9623il(date));
    }

    public static C5509IIiI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static C5509IIiI OooO00o(Object obj) {
        if (obj instanceof C5509IIiI) {
            return (C5509IIiI) obj;
        }
        if (obj instanceof C9623il) {
            return new C5509IIiI(C9623il.OooO00o(obj));
        }
        if (obj != null) {
            return new C5509IIiI(C5753LiI1.OooO00o(obj));
        }
        return null;
    }

    public C5753LiI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m15760OooO00o() {
        return this.f15977OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        C9623il r0 = this.f15977OooO00o;
        return r0 != null ? r0 : this.OooO00o.OooO0O0();
    }

    public String toString() {
        C9623il r0 = this.f15977OooO00o;
        return r0 != null ? r0.toString() : this.OooO00o.toString();
    }
}
