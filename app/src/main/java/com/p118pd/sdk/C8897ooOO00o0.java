package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooOO00o0  reason: case insensitive filesystem */
public class C8897ooOO00o0 {
    public static C8897ooOO00o0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22096OooO00o = 20;
    public int OooO0O0 = 999;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20536OooO00o() {
        return this.f22096OooO00o;
    }

    public int OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO00o(int i) {
        this.f22096OooO00o = i;
    }

    public void OooO0O0(int i) {
        this.OooO0O0 = i;
    }

    public static C8897ooOO00o0 OooO00o() {
        if (OooO00o == null) {
            synchronized (C8897ooOO00o0.class) {
                if (OooO00o == null) {
                    OooO00o = new C8897ooOO00o0();
                }
            }
        }
        return OooO00o;
    }
}
