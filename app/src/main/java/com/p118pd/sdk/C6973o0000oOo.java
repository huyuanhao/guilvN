package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0000oOo  reason: case insensitive filesystem */
public final class C6973o0000oOo<E> {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public E[] f19180OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    public C6973o0000oOo() {
        this(8);
    }

    private void OooO0O0() {
        E[] eArr = this.f19180OooO00o;
        int length = eArr.length;
        int i = this.OooO00o;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = (E[]) new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.f19180OooO00o, 0, eArr2, i2, this.OooO00o);
            this.f19180OooO00o = eArr2;
            this.OooO00o = 0;
            this.OooO0O0 = length;
            this.OooO0OO = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void OooO00o(E e) {
        int i = (this.OooO00o - 1) & this.OooO0OO;
        this.OooO00o = i;
        this.f19180OooO00o[i] = e;
        if (i == this.OooO0O0) {
            OooO0O0();
        }
    }

    public E OooO0OO() {
        int i = this.OooO00o;
        if (i != this.OooO0O0) {
            E[] eArr = this.f19180OooO00o;
            E e = eArr[i];
            eArr[i] = null;
            this.OooO00o = (i + 1) & this.OooO0OO;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E OooO0Oo() {
        int i = this.OooO00o;
        int i2 = this.OooO0O0;
        if (i != i2) {
            int i3 = this.OooO0OO & (i2 - 1);
            E[] eArr = this.f19180OooO00o;
            E e = eArr[i3];
            eArr[i3] = null;
            this.OooO0O0 = i3;
            return e;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public C6973o0000oOo(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.OooO0OO = i - 1;
            this.f19180OooO00o = (E[]) new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18181OooO00o() {
        OooO0O0(OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18182OooO00o(int i) {
        int i2;
        if (i > 0) {
            if (i <= OooO00o()) {
                int i3 = 0;
                int i4 = this.OooO0O0;
                if (i < i4) {
                    i3 = i4 - i;
                }
                int i5 = i3;
                while (true) {
                    i2 = this.OooO0O0;
                    if (i5 >= i2) {
                        break;
                    }
                    this.f19180OooO00o[i5] = null;
                    i5++;
                }
                int i6 = i2 - i3;
                int i7 = i - i6;
                this.OooO0O0 = i2 - i6;
                if (i7 > 0) {
                    int length = this.f19180OooO00o.length;
                    this.OooO0O0 = length;
                    int i8 = length - i7;
                    for (int i9 = i8; i9 < this.OooO0O0; i9++) {
                        this.f19180OooO00o[i9] = null;
                    }
                    this.OooO0O0 = i8;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void OooO0O0(E e) {
        E[] eArr = this.f19180OooO00o;
        int i = this.OooO0O0;
        eArr[i] = e;
        int i2 = this.OooO0OO & (i + 1);
        this.OooO0O0 = i2;
        if (i2 == this.OooO00o) {
            OooO0O0();
        }
    }

    public void OooO0O0(int i) {
        if (i > 0) {
            if (i <= OooO00o()) {
                int length = this.f19180OooO00o.length;
                int i2 = this.OooO00o;
                if (i < length - i2) {
                    length = i2 + i;
                }
                for (int i3 = this.OooO00o; i3 < length; i3++) {
                    this.f19180OooO00o[i3] = null;
                }
                int i4 = this.OooO00o;
                int i5 = length - i4;
                int i6 = i - i5;
                this.OooO00o = this.OooO0OO & (i4 + i5);
                if (i6 > 0) {
                    for (int i7 = 0; i7 < i6; i7++) {
                        this.f19180OooO00o[i7] = null;
                    }
                    this.OooO00o = i6;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public E m18180OooO00o() {
        int i = this.OooO00o;
        if (i != this.OooO0O0) {
            return this.f19180OooO00o[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E OooO00o(int i) {
        if (i < 0 || i >= OooO00o()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f19180OooO00o[this.OooO0OO & (this.OooO00o + i)];
    }

    public int OooO00o() {
        return (this.OooO0O0 - this.OooO00o) & this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18183OooO00o() {
        return this.OooO00o == this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public E m18184OooO0O0() {
        int i = this.OooO00o;
        int i2 = this.OooO0O0;
        if (i != i2) {
            return this.f19180OooO00o[(i2 - 1) & this.OooO0OO];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
