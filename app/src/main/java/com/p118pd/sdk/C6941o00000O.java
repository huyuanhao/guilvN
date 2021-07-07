package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o00000O  reason: case insensitive filesystem */
public class C6941o00000O {
    public static final int OooO0oO = Integer.MIN_VALUE;
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f19094OooO00o = false;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f19095OooO0O0 = false;
    public int OooO0OO = Integer.MIN_VALUE;
    public int OooO0Oo = Integer.MIN_VALUE;
    public int OooO0o = 0;
    public int OooO0o0 = 0;

    public int OooO00o() {
        return this.f19094OooO00o ? this.OooO00o : this.OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public int OooO0OO() {
        return this.OooO0O0;
    }

    public int OooO0Oo() {
        return this.f19094OooO00o ? this.OooO0O0 : this.OooO00o;
    }

    public void OooO00o(int i, int i2) {
        this.f19095OooO0O0 = false;
        if (i != Integer.MIN_VALUE) {
            this.OooO0o0 = i;
            this.OooO00o = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.OooO0o = i2;
            this.OooO0O0 = i2;
        }
    }

    public void OooO0O0(int i, int i2) {
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        this.f19095OooO0O0 = true;
        if (this.f19094OooO00o) {
            if (i2 != Integer.MIN_VALUE) {
                this.OooO00o = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.OooO0O0 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.OooO00o = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.OooO0O0 = i2;
        }
    }

    public void OooO00o(boolean z) {
        if (z != this.f19094OooO00o) {
            this.f19094OooO00o = z;
            if (!this.f19095OooO0O0) {
                this.OooO00o = this.OooO0o0;
                this.OooO0O0 = this.OooO0o;
            } else if (z) {
                int i = this.OooO0Oo;
                if (i == Integer.MIN_VALUE) {
                    i = this.OooO0o0;
                }
                this.OooO00o = i;
                int i2 = this.OooO0OO;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.OooO0o;
                }
                this.OooO0O0 = i2;
            } else {
                int i3 = this.OooO0OO;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.OooO0o0;
                }
                this.OooO00o = i3;
                int i4 = this.OooO0Oo;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.OooO0o;
                }
                this.OooO0O0 = i4;
            }
        }
    }
}
