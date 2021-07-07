package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0000oo0  reason: case insensitive filesystem */
public final class C6975o0000oo0 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19181OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    public C6975o0000oo0() {
        this(8);
    }

    private void OooO0O0() {
        int[] iArr = this.f19181OooO00o;
        int length = iArr.length;
        int i = this.OooO00o;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f19181OooO00o, 0, iArr2, i2, this.OooO00o);
            this.f19181OooO00o = iArr2;
            this.OooO00o = 0;
            this.OooO0O0 = length;
            this.OooO0OO = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18186OooO00o(int i) {
        int i2 = (this.OooO00o - 1) & this.OooO0OO;
        this.OooO00o = i2;
        this.f19181OooO00o[i2] = i;
        if (i2 == this.OooO0O0) {
            OooO0O0();
        }
    }

    public int OooO0OO() {
        int i = this.OooO00o;
        if (i != this.OooO0O0) {
            int i2 = this.f19181OooO00o[i];
            this.OooO00o = (i + 1) & this.OooO0OO;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int OooO0Oo() {
        int i = this.OooO00o;
        int i2 = this.OooO0O0;
        if (i != i2) {
            int i3 = this.OooO0OO & (i2 - 1);
            int i4 = this.f19181OooO00o[i3];
            this.OooO0O0 = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int OooO0o0() {
        return (this.OooO0O0 - this.OooO00o) & this.OooO0OO;
    }

    public C6975o0000oo0(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.OooO0OO = i - 1;
            this.f19181OooO00o = new int[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18185OooO00o() {
        this.OooO0O0 = this.OooO00o;
    }

    public void OooO0OO(int i) {
        if (i > 0) {
            if (i <= OooO0o0()) {
                this.OooO0O0 = this.OooO0OO & (this.OooO0O0 - i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int OooO00o() {
        int i = this.OooO00o;
        if (i != this.OooO0O0) {
            return this.f19181OooO00o[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void OooO0Oo(int i) {
        if (i > 0) {
            if (i <= OooO0o0()) {
                this.OooO00o = this.OooO0OO & (this.OooO00o + i);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int OooO00o(int i) {
        if (i < 0 || i >= OooO0o0()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f19181OooO00o[this.OooO0OO & (this.OooO00o + i)];
    }

    public void OooO0O0(int i) {
        int[] iArr = this.f19181OooO00o;
        int i2 = this.OooO0O0;
        iArr[i2] = i;
        int i3 = this.OooO0OO & (i2 + 1);
        this.OooO0O0 = i3;
        if (i3 == this.OooO00o) {
            OooO0O0();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18187OooO00o() {
        return this.OooO00o == this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m18188OooO0O0() {
        int i = this.OooO00o;
        int i2 = this.OooO0O0;
        if (i != i2) {
            return this.f19181OooO00o[(i2 - 1) & this.OooO0OO];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
