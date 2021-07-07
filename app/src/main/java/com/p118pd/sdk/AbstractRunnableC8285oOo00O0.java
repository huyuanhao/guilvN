package com.p118pd.sdk;

import android.view.View;
import com.p118pd.sdk.C8348oOoOOo0;

/* renamed from: com.pd.sdk.oOo00O0  reason: case insensitive filesystem */
public abstract class AbstractRunnableC8285oOo00O0 extends C8348oOoOOo0.OooO00o implements Runnable {
    public View OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8351oOoOOo0o f21372OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8353oOoOOoOO f21373OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21374OooO00o = new float[2];
    public float OooO0Oo = 0.0f;
    public float OooO0o0 = 0.0f;

    public AbstractRunnableC8285oOo00O0(C8353oOoOOoOO oooooooo, float f, float f2, C8351oOoOOo0o oooooo0o, View view) {
        this.f21373OooO00o = oooooooo;
        this.OooO0Oo = f;
        this.OooO0o0 = f2;
        this.f21372OooO00o = oooooo0o;
        this.OooO00o = view;
    }

    @Override // com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public float OooO00o() {
        return this.OooO0Oo;
    }

    public float OooO0O0() {
        return this.OooO0o0;
    }
}
