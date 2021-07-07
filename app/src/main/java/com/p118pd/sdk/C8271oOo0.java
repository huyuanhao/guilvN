package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOo0  reason: case insensitive filesystem */
public final class C8271oOo0 {
    public static final C8271oOo0 OooO00o = new C8271oOo0(0.0f, 0.0f, 0.0f);
    public static final C8271oOo0 OooO0O0 = new C8271oOo0(1.0f, 0.0f, 0.0f);
    public static final C8271oOo0 OooO0OO = new C8271oOo0(0.0f, 1.0f, 0.0f);
    public static final C8271oOo0 OooO0Oo = new C8271oOo0(0.0f, 0.0f, 1.0f);

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f21361OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float f21362OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public float f21363OooO0OO;

    public C8271oOo0() {
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m19972OooO00o(C8271oOo0 ooo0) {
        this.f21361OooO00o += ooo0.f21361OooO00o;
        this.f21362OooO0O0 += ooo0.f21362OooO0O0;
        this.f21363OooO0OO += ooo0.f21363OooO0OO;
    }

    public final void OooO0O0(float f) {
        this.f21361OooO00o *= f;
        this.f21362OooO0O0 *= f;
        this.f21363OooO0OO *= f;
    }

    public final void OooO0OO(C8271oOo0 ooo0) {
        this.f21361OooO00o = ooo0.f21361OooO00o;
        this.f21362OooO0O0 = ooo0.f21362OooO0O0;
        this.f21363OooO0OO = ooo0.f21363OooO0OO;
    }

    public final void OooO0Oo(C8271oOo0 ooo0) {
        this.f21361OooO00o -= ooo0.f21361OooO00o;
        this.f21362OooO0O0 -= ooo0.f21362OooO0O0;
        this.f21363OooO0OO -= ooo0.f21363OooO0OO;
    }

    public C8271oOo0(float[] fArr) {
        OooO0O0(fArr[0], fArr[1], fArr[2]);
    }

    public C8271oOo0(float f, float f2, float f3) {
        OooO0O0(f, f2, f3);
    }

    public final void OooO00o(float f, float f2, float f3) {
        this.f21361OooO00o += f;
        this.f21362OooO0O0 += f2;
        this.f21363OooO0OO += f3;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final void m19974OooO0O0(C8271oOo0 ooo0) {
        this.f21361OooO00o *= ooo0.f21361OooO00o;
        this.f21362OooO0O0 *= ooo0.f21362OooO0O0;
        this.f21363OooO0OO *= ooo0.f21363OooO0OO;
    }

    public final float OooO0OO() {
        float OooO00o2 = OooO00o();
        if (OooO00o2 != 0.0f) {
            this.f21361OooO00o /= OooO00o2;
            this.f21362OooO0O0 /= OooO00o2;
            this.f21363OooO0OO /= OooO00o2;
        }
        return OooO00o2;
    }

    public C8271oOo0(C8271oOo0 ooo0) {
        OooO0OO(ooo0);
    }

    public final void OooO00o(C8271oOo0 ooo0, float f) {
        this.f21361OooO00o -= ooo0.f21361OooO00o * f;
        this.f21362OooO0O0 -= ooo0.f21362OooO0O0 * f;
        this.f21363OooO0OO -= ooo0.f21363OooO0OO * f;
    }

    public final void OooO0O0(float f, float f2, float f3) {
        this.f21361OooO00o = f;
        this.f21362OooO0O0 = f2;
        this.f21363OooO0OO = f3;
    }

    public final void OooO00o(float f) {
        if (f != 0.0f) {
            this.f21361OooO00o /= f;
            this.f21362OooO0O0 /= f;
            this.f21363OooO0OO /= f;
        }
    }

    public final float OooO0O0(C8271oOo0 ooo0) {
        return (this.f21361OooO00o * ooo0.f21361OooO00o) + (this.f21362OooO0O0 * ooo0.f21362OooO0O0) + (this.f21363OooO0OO * ooo0.f21363OooO0OO);
    }

    public final float OooO0O0() {
        float f = this.f21361OooO00o;
        float f2 = this.f21362OooO0O0;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.f21363OooO0OO;
        return f3 + (f4 * f4);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C8271oOo0 m19970OooO00o(C8271oOo0 ooo0) {
        float f = this.f21362OooO0O0;
        float f2 = ooo0.f21363OooO0OO;
        float f3 = this.f21363OooO0OO;
        float f4 = ooo0.f21362OooO0O0;
        float f5 = (f * f2) - (f3 * f4);
        float f6 = ooo0.f21361OooO00o;
        float f7 = this.f21361OooO00o;
        return new C8271oOo0(f5, (f3 * f6) - (f2 * f7), (f7 * f4) - (f * f6));
    }

    public final float OooO00o() {
        return (float) Math.sqrt((double) OooO0O0());
    }

    public final float OooO00o(C8271oOo0 ooo0) {
        float f = this.f21361OooO00o - ooo0.f21361OooO00o;
        float f2 = this.f21362OooO0O0 - ooo0.f21362OooO0O0;
        float f3 = this.f21363OooO0OO - ooo0.f21363OooO0OO;
        return (f * f) + (f2 * f2) + (f3 * f3);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m19971OooO00o() {
        OooO0O0(0.0f, 0.0f, 0.0f);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m19973OooO00o(C8271oOo0 ooo0) {
        return OooO0O0(ooo0) > 0.0f;
    }
}
