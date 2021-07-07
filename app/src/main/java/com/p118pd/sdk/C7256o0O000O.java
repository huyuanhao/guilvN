package com.p118pd.sdk;

import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o0O000O  reason: case insensitive filesystem */
public class C7256o0O000O implements o0O00OOO {
    public static final int o0OO00O = 3;
    public static final int o0OOO0o = 1;
    public static final int o0Oo0oo = 2;
    public static final int o0ooOoO = 0;
    public final o0O00OOO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f19841OooO00o = null;
    public int o00oO0O = 0;
    public int o0ooOO0 = -1;
    public int o0ooOOo = -1;

    public C7256o0O000O(@NonNull o0O00OOO o0o00ooo) {
        this.OooO00o = o0o00ooo;
    }

    public void OooO00o() {
        int i = this.o00oO0O;
        if (i != 0) {
            if (i == 1) {
                this.OooO00o.OooO0OO(this.o0ooOO0, this.o0ooOOo);
            } else if (i == 2) {
                this.OooO00o.OooO00o(this.o0ooOO0, this.o0ooOOo);
            } else if (i == 3) {
                this.OooO00o.OooO00o(this.o0ooOO0, this.o0ooOOo, this.f19841OooO00o);
            }
            this.f19841OooO00o = null;
            this.o00oO0O = 0;
        }
    }

    @Override // com.p118pd.sdk.o0O00OOO
    public void OooO0O0(int i, int i2) {
        OooO00o();
        this.OooO00o.OooO0O0(i, i2);
    }

    @Override // com.p118pd.sdk.o0O00OOO
    public void OooO0OO(int i, int i2) {
        int i3;
        if (this.o00oO0O == 1 && i >= (i3 = this.o0ooOO0)) {
            int i4 = this.o0ooOOo;
            if (i <= i3 + i4) {
                this.o0ooOOo = i4 + i2;
                this.o0ooOO0 = Math.min(i, i3);
                return;
            }
        }
        OooO00o();
        this.o0ooOO0 = i;
        this.o0ooOOo = i2;
        this.o00oO0O = 1;
    }

    @Override // com.p118pd.sdk.o0O00OOO
    public void OooO00o(int i, int i2) {
        int i3;
        if (this.o00oO0O != 2 || (i3 = this.o0ooOO0) < i || i3 > i + i2) {
            OooO00o();
            this.o0ooOO0 = i;
            this.o0ooOOo = i2;
            this.o00oO0O = 2;
            return;
        }
        this.o0ooOOo += i2;
        this.o0ooOO0 = i;
    }

    @Override // com.p118pd.sdk.o0O00OOO
    public void OooO00o(int i, int i2, Object obj) {
        int i3;
        if (this.o00oO0O == 3) {
            int i4 = this.o0ooOO0;
            int i5 = this.o0ooOOo;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f19841OooO00o == obj) {
                this.o0ooOO0 = Math.min(i, i4);
                this.o0ooOOo = Math.max(i5 + i4, i3) - this.o0ooOO0;
                return;
            }
        }
        OooO00o();
        this.o0ooOO0 = i;
        this.o0ooOOo = i2;
        this.f19841OooO00o = obj;
        this.o00oO0O = 3;
    }
}
