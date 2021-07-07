package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooOO0OO0  reason: case insensitive filesystem */
public class C8904ooOO0OO0 {
    public float OooO00o = 0.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22107OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22108OooO00o = true;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20540OooO00o() {
        this.f22107OooO00o = 0;
        this.OooO00o = 0.0f;
        this.f22108OooO00o = true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20541OooO0O0() {
        this.f22107OooO00o = System.currentTimeMillis();
        this.f22108OooO00o = false;
    }

    public float OooO0O0() {
        if (!this.f22108OooO00o) {
            this.OooO00o += ((float) (System.currentTimeMillis() - this.f22107OooO00o)) / 1000.0f;
            this.f22108OooO00o = true;
        }
        return this.OooO00o;
    }

    public float OooO00o() {
        if (this.f22108OooO00o) {
            return this.OooO00o;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return (((float) (currentTimeMillis - this.f22107OooO00o)) / 1000.0f) + this.OooO00o;
    }
}
