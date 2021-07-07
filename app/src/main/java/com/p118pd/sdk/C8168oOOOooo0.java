package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: com.pd.sdk.oOOOooo0  reason: case insensitive filesystem */
public class C8168oOOOooo0 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Bitmap f21224OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF f21225OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21226OooO00o;
    public int OooO0O0;

    public C8168oOOOooo0(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.OooO00o = i;
        this.f21224OooO00o = bitmap;
        this.f21225OooO00o = rectF;
        this.f21226OooO00o = z;
        this.OooO0O0 = i2;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8168oOOOooo0)) {
            return false;
        }
        C8168oOOOooo0 ooooooo0 = (C8168oOOOooo0) obj;
        if (ooooooo0.OooO0O0() == this.OooO00o && ooooooo0.m19819OooO00o().left == this.f21225OooO00o.left && ooooooo0.m19819OooO00o().right == this.f21225OooO00o.right && ooooooo0.m19819OooO00o().top == this.f21225OooO00o.top && ooooooo0.m19819OooO00o().bottom == this.f21225OooO00o.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bitmap m19818OooO00o() {
        return this.f21224OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public RectF m19819OooO00o() {
        return this.f21225OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19820OooO00o() {
        return this.f21226OooO00o;
    }

    public void OooO00o(int i) {
        this.OooO0O0 = i;
    }
}
