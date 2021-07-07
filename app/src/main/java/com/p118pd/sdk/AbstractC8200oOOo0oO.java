package com.p118pd.sdk;

import android.graphics.Typeface;

/* renamed from: com.pd.sdk.oOOo0oO  reason: case insensitive filesystem */
public abstract class AbstractC8200oOOo0oO {
    public float OooO00o = 5.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21293OooO00o = -16777216;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Typeface f21294OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21295OooO00o = true;
    public float OooO0O0 = 5.0f;
    public float OooO0OO = AbstractC8352oOoOOoO0.OooO00o(10.0f);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Typeface m19854OooO00o() {
        return this.f21294OooO00o;
    }

    public float OooO0O0() {
        return this.OooO00o;
    }

    public float OooO0OO() {
        return this.OooO0O0;
    }

    public void OooO00o(Typeface typeface) {
        this.f21294OooO00o = typeface;
    }

    public void OooO0O0(float f) {
        this.OooO00o = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void OooO0OO(float f) {
        this.OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void OooO00o(float f) {
        if (f > 24.0f) {
            f = 24.0f;
        }
        if (f < 6.0f) {
            f = 6.0f;
        }
        this.OooO0OO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public float OooO00o() {
        return this.OooO0OO;
    }

    public void OooO00o(int i) {
        this.f21293OooO00o = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19853OooO00o() {
        return this.f21293OooO00o;
    }

    public void OooO00o(boolean z) {
        this.f21295OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19855OooO00o() {
        return this.f21295OooO00o;
    }
}
