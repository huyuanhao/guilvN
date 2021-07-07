package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL丨i  reason: invalid class name and case insensitive filesystem */
public class C6209iLi {
    public L1iI1 OooO00o;

    public C6209iLi(L1iI1 l1iI1) {
        this.OooO00o = l1iI1;
    }

    public static C6209iLi OooO00o(Object obj) {
        if (obj instanceof C6209iLi) {
            return (C6209iLi) obj;
        }
        if (obj instanceof L1iI1) {
            return new C6209iLi(L1iI1.OooO00o(obj));
        }
        return null;
    }

    public L1iI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17193OooO00o() {
        return this.OooO00o.m17017OooO0O0();
    }
}
