package com.p118pd.sdk;

import java.util.Arrays;

/* renamed from: com.pd.sdk.丨ill111  reason: invalid class name */
public final class ill111<T> {
    public static final int OooO0Oo = -1640531527;
    public final float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23222OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T[] f23223OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    public ill111() {
        this(16, 0.75f);
    }

    public static int OooO00o(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public boolean OooO00o(T t) {
        T t2;
        T[] tArr = this.f23223OooO00o;
        int i = this.f23222OooO00o;
        int OooO00o2 = OooO00o(t.hashCode()) & i;
        T t3 = tArr[OooO00o2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                OooO00o2 = (OooO00o2 + 1) & i;
                t2 = tArr[OooO00o2];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[OooO00o2] = t;
        int i2 = this.OooO0O0 + 1;
        this.OooO0O0 = i2;
        if (i2 >= this.OooO0OO) {
            OooO00o();
        }
        return true;
    }

    public boolean OooO0O0(T t) {
        T t2;
        T[] tArr = this.f23223OooO00o;
        int i = this.f23222OooO00o;
        int OooO00o2 = OooO00o(t.hashCode()) & i;
        T t3 = tArr[OooO00o2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return OooO00o(OooO00o2, tArr, i);
        }
        do {
            OooO00o2 = (OooO00o2 + 1) & i;
            t2 = tArr[OooO00o2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return OooO00o(OooO00o2, tArr, i);
    }

    public ill111(int i) {
        this(i, 0.75f);
    }

    public ill111(int i, float f) {
        this.OooO00o = f;
        int OooO00o2 = LLIIL1I.OooO00o(i);
        this.f23222OooO00o = OooO00o2 - 1;
        this.OooO0OO = (int) (f * ((float) OooO00o2));
        this.f23223OooO00o = (T[]) new Object[OooO00o2];
    }

    public void OooO0O0() {
        this.OooO0O0 = 0;
        this.f23223OooO00o = (T[]) new Object[0];
    }

    public boolean OooO00o(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.OooO0O0--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int OooO00o2 = OooO00o(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= OooO00o2 || OooO00o2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= OooO00o2 && OooO00o2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public void OooO00o(AbstractC6153iL1l<? super T> il1l) {
        if (this.OooO0O0 != 0) {
            T[] tArr = this.f23223OooO00o;
            for (T t : tArr) {
                if (t != null) {
                    il1l.call(t);
                }
            }
            Arrays.fill(tArr, (Object) null);
            this.OooO0O0 = 0;
        }
    }

    public void OooO00o() {
        T[] tArr = this.f23223OooO00o;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.OooO0O0;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int OooO00o2 = OooO00o(tArr[length].hashCode()) & i2;
                if (tArr2[OooO00o2] != null) {
                    do {
                        OooO00o2 = (OooO00o2 + 1) & i2;
                    } while (tArr2[OooO00o2] != null);
                }
                tArr2[OooO00o2] = tArr[length];
                i3 = i4;
            } else {
                this.f23222OooO00o = i2;
                this.OooO0OO = (int) (((float) i) * this.OooO00o);
                this.f23223OooO00o = tArr2;
                return;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21696OooO00o() {
        return this.OooO0O0 == 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T[] m21697OooO00o() {
        return this.f23223OooO00o;
    }
}
