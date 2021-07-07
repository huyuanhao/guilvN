package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1iI丨1  reason: invalid class name */
public class I1iI1 {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public I1iI1(int i, int i2) {
        this(i, i2, 0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15294OooO00o() {
        return this.OooO0Oo % 180 == 90;
    }

    public int OooO0O0() {
        if (m15294OooO00o()) {
            return this.OooO00o;
        }
        return this.OooO0O0;
    }

    public int OooO0OO() {
        return this.OooO0Oo;
    }

    public int OooO0Oo() {
        if (m15294OooO00o()) {
            return this.OooO0O0;
        }
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof I1iI1)) {
            return super.equals(obj);
        }
        I1iI1 r3 = (I1iI1) obj;
        return r3.OooO0Oo() == OooO0Oo() && r3.OooO0O0() == OooO0O0() && r3.OooO00o() == OooO00o() && r3.OooO0OO() == OooO0OO();
    }

    public I1iI1(int i, int i2, int i3) {
        this(i, i2, i3, -1);
    }

    public int OooO00o() {
        return this.OooO0OO;
    }

    public I1iI1(int i, int i2, int i3, int i4) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i4;
        this.OooO0Oo = i3;
    }
}
