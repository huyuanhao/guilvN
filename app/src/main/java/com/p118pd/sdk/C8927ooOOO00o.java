package com.p118pd.sdk;

import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOOO00o  reason: case insensitive filesystem */
public final class C8927ooOOO00o {
    public static final int OooO0OO = 8192;
    public static final int OooO0Oo = 1024;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8927ooOOO00o f22168OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22169OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f22170OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C8927ooOOO00o f22171OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22172OooO0O0;

    public C8927ooOOO00o() {
        this.f22170OooO00o = new byte[8192];
        this.f22172OooO0O0 = true;
        this.f22169OooO00o = false;
    }

    @Nullable
    public final C8927ooOOO00o OooO00o() {
        C8927ooOOO00o ooooo00o = this.f22168OooO00o;
        if (ooooo00o == this) {
            ooooo00o = null;
        }
        C8927ooOOO00o ooooo00o2 = this.f22171OooO0O0;
        ooooo00o2.f22168OooO00o = this.f22168OooO00o;
        this.f22168OooO00o.f22171OooO0O0 = ooooo00o2;
        this.f22168OooO00o = null;
        this.f22171OooO0O0 = null;
        return ooooo00o;
    }

    public final C8927ooOOO00o OooO0O0() {
        this.f22169OooO00o = true;
        return new C8927ooOOO00o(this.f22170OooO00o, this.OooO00o, this.OooO0O0, true, false);
    }

    public final C8927ooOOO00o OooO0OO() {
        return new C8927ooOOO00o((byte[]) this.f22170OooO00o.clone(), this.OooO00o, this.OooO0O0, false, true);
    }

    public C8927ooOOO00o(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f22170OooO00o = bArr;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f22169OooO00o = z;
        this.f22172OooO0O0 = z2;
    }

    public final C8927ooOOO00o OooO00o(C8927ooOOO00o ooooo00o) {
        ooooo00o.f22171OooO0O0 = this;
        ooooo00o.f22168OooO00o = this.f22168OooO00o;
        this.f22168OooO00o.f22171OooO0O0 = ooooo00o;
        this.f22168OooO00o = ooooo00o;
        return ooooo00o;
    }

    public final C8927ooOOO00o OooO00o(int i) {
        C8927ooOOO00o ooooo00o;
        if (i <= 0 || i > this.OooO0O0 - this.OooO00o) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            ooooo00o = OooO0O0();
        } else {
            ooooo00o = OOOOO0O.OooO00o();
            System.arraycopy(this.f22170OooO00o, this.OooO00o, ooooo00o.f22170OooO00o, 0, i);
        }
        ooooo00o.OooO0O0 = ooooo00o.OooO00o + i;
        this.OooO00o += i;
        this.f22171OooO0O0.OooO00o(ooooo00o);
        return ooooo00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m20591OooO00o() {
        C8927ooOOO00o ooooo00o = this.f22171OooO0O0;
        if (ooooo00o == this) {
            throw new IllegalStateException();
        } else if (ooooo00o.f22172OooO0O0) {
            int i = this.OooO0O0 - this.OooO00o;
            if (i <= (8192 - ooooo00o.OooO0O0) + (ooooo00o.f22169OooO00o ? 0 : ooooo00o.OooO00o)) {
                OooO00o(this.f22171OooO0O0, i);
                OooO00o();
                OOOOO0O.OooO00o(this);
            }
        }
    }

    public final void OooO00o(C8927ooOOO00o ooooo00o, int i) {
        if (ooooo00o.f22172OooO0O0) {
            int i2 = ooooo00o.OooO0O0;
            if (i2 + i > 8192) {
                if (!ooooo00o.f22169OooO00o) {
                    int i3 = ooooo00o.OooO00o;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = ooooo00o.f22170OooO00o;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        ooooo00o.OooO0O0 -= ooooo00o.OooO00o;
                        ooooo00o.OooO00o = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f22170OooO00o, this.OooO00o, ooooo00o.f22170OooO00o, ooooo00o.OooO0O0, i);
            ooooo00o.OooO0O0 += i;
            this.OooO00o += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
