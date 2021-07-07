package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ii丨  reason: invalid class name and case insensitive filesystem */
public class C5387Ii extends AbstractC5738Lil {
    public static final int o00oO0O = 128;
    public static final int o0O0O00 = 32768;
    public static final int o0OO00O = 2;
    public static final int o0OOO0o = 8;
    public static final int o0Oo0oo = 4;
    public static final int o0ooOO0 = 64;
    public static final int o0ooOOo = 32;
    public static final int o0ooOoO = 16;
    public static final int oo0o0Oo = 1;
    public iIilII1 OooO00o;

    public C5387Ii(int i) {
        this.OooO00o = new iIilII1(i);
    }

    public C5387Ii(iIilII1 iiilii1) {
        this.OooO00o = iiilii1;
    }

    public static C5387Ii OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.o00OoOoo));
    }

    public static C5387Ii OooO00o(Object obj) {
        if (obj instanceof C5387Ii) {
            return (C5387Ii) obj;
        }
        if (obj != null) {
            return new C5387Ii(iIilII1.OooO00o(obj));
        }
        return null;
    }

    public boolean OooO00o(int i) {
        return (this.OooO00o.OooO0Oo() & i) == i;
    }

    public byte[] OooO00o() {
        return this.OooO00o.m15475OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.OooO00o.OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15634OooO0O0() {
        return this.OooO00o;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        byte[] OooO00o2 = this.OooO00o.m15475OooO00o();
        if (OooO00o2.length == 1) {
            sb = new StringBuilder();
            sb.append("KeyUsage: 0x");
            i = OooO00o2[0] & 255;
        } else {
            sb = new StringBuilder();
            sb.append("KeyUsage: 0x");
            i = (OooO00o2[0] & 255) | ((OooO00o2[1] & 255) << 8);
        }
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }
}
