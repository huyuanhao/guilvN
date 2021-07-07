package com.p118pd.sdk;

import android.graphics.drawable.Drawable;

/* renamed from: com.pd.sdk.oOOoOO0o  reason: case insensitive filesystem */
public abstract class AbstractC8215oOOoOO0o {
    public Drawable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f21337OooO00o;
    public float OooO0Oo;

    public AbstractC8215oOOoOO0o() {
        this.OooO0Oo = 0.0f;
        this.f21337OooO00o = null;
        this.OooO00o = null;
    }

    public float OooO00o() {
        return this.OooO0Oo;
    }

    public void OooO00o(Drawable drawable) {
        this.OooO00o = drawable;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Drawable m19898OooO00o() {
        return this.OooO00o;
    }

    public void OooO00o(float f) {
        this.OooO0Oo = f;
    }

    public AbstractC8215oOOoOO0o(float f) {
        this.OooO0Oo = 0.0f;
        this.f21337OooO00o = null;
        this.OooO00o = null;
        this.OooO0Oo = f;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m19899OooO00o() {
        return this.f21337OooO00o;
    }

    public void OooO00o(Object obj) {
        this.f21337OooO00o = obj;
    }

    public AbstractC8215oOOoOO0o(float f, Object obj) {
        this(f);
        this.f21337OooO00o = obj;
    }

    public AbstractC8215oOOoOO0o(float f, Drawable drawable) {
        this(f);
        this.OooO00o = drawable;
    }

    public AbstractC8215oOOoOO0o(float f, Drawable drawable, Object obj) {
        this(f);
        this.OooO00o = drawable;
        this.f21337OooO00o = obj;
    }
}
