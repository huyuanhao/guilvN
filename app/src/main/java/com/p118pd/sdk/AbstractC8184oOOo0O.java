package com.p118pd.sdk;

/* renamed from: com.pd.sdk.oOOo0O  reason: case insensitive filesystem */
public abstract class AbstractC8184oOOo0O<T> {
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21241OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final float[] f21242OooO00o;
    public float OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f21243OooO0O0;
    public int OooO0OO;

    public AbstractC8184oOOo0O(int i) {
        this.f21241OooO00o = 0;
        this.OooO00o = 1.0f;
        this.OooO0O0 = 1.0f;
        this.f21243OooO0O0 = 0;
        this.OooO0OO = 0;
        this.f21241OooO00o = 0;
        this.f21242OooO00o = new float[i];
    }

    public void OooO00o(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f21243OooO0O0 = i;
    }

    public abstract void OooO00o(T t);

    public void OooO0O0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.OooO0OO = i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19826OooO00o() {
        this.f21241OooO00o = 0;
    }

    public int OooO00o() {
        return this.f21242OooO00o.length;
    }

    public void OooO00o(float f, float f2) {
        this.OooO00o = f;
        this.OooO0O0 = f2;
    }
}
