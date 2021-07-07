package com.p118pd.sdk;

import com.p118pd.sdk.C8348oOoOOo0.OooO00o;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOo0  reason: case insensitive filesystem */
public class C8348oOoOOo0<T extends OooO00o> {
    public static int OooO0Oo;
    public float OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21452OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f21453OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object[] f21454OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    /* renamed from: com.pd.sdk.oOoOOo0$OooO00o */
    public static abstract class OooO00o {
        public static int o0ooOO0 = -1;
        public int o00oO0O = o0ooOO0;

        public abstract OooO00o OooO00o();
    }

    public C8348oOoOOo0(int i, T t) {
        if (i > 0) {
            this.OooO0O0 = i;
            this.f21454OooO00o = new Object[i];
            this.OooO0OO = 0;
            this.f21453OooO00o = t;
            this.OooO00o = 1.0f;
            OooO00o();
            return;
        }
        throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
    }

    public static synchronized C8348oOoOOo0 OooO00o(int i, OooO00o oooO00o) {
        C8348oOoOOo0 oooooo0;
        synchronized (C8348oOoOOo0.class) {
            oooooo0 = new C8348oOoOOo0(i, oooO00o);
            oooooo0.f21452OooO00o = OooO0Oo;
            OooO0Oo++;
        }
        return oooooo0;
    }

    private void OooO0O0(float f) {
        int i = this.OooO0O0;
        int i2 = (int) (((float) i) * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f21454OooO00o[i3] = this.f21453OooO00o.OooO00o();
        }
        this.OooO0OO = i - 1;
    }

    public int OooO0OO() {
        return this.f21452OooO00o;
    }

    private void OooO0O0() {
        int i = this.OooO0O0;
        int i2 = i * 2;
        this.OooO0O0 = i2;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = this.f21454OooO00o[i3];
        }
        this.f21454OooO00o = objArr;
    }

    public void OooO00o(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.OooO00o = f;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m20012OooO00o() {
        return this.OooO00o;
    }

    private void OooO00o() {
        OooO0O0(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized T m20014OooO00o() {
        T t;
        if (this.OooO0OO == -1 && this.OooO00o > 0.0f) {
            OooO00o();
        }
        t = (T) ((OooO00o) this.f21454OooO00o[this.OooO0OO]);
        t.o00oO0O = OooO00o.o0ooOO0;
        this.OooO0OO--;
        return t;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m20015OooO0O0() {
        return this.OooO0OO + 1;
    }

    public synchronized void OooO00o(T t) {
        if (t.o00oO0O == OooO00o.o0ooOO0) {
            int i = this.OooO0OO + 1;
            this.OooO0OO = i;
            if (i >= this.f21454OooO00o.length) {
                OooO0O0();
            }
            t.o00oO0O = this.f21452OooO00o;
            this.f21454OooO00o[this.OooO0OO] = t;
        } else if (t.o00oO0O == this.f21452OooO00o) {
            throw new IllegalArgumentException("The object passed is already stored in this pool!");
        } else {
            throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.o00oO0O + ".  Object cannot belong to two different pool instances simultaneously!");
        }
    }

    public synchronized void OooO00o(List<T> list) {
        while (list.size() + this.OooO0OO + 1 > this.OooO0O0) {
            OooO0O0();
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (t.o00oO0O == OooO00o.o0ooOO0) {
                t.o00oO0O = this.f21452OooO00o;
                this.f21454OooO00o[this.OooO0OO + 1 + i] = t;
            } else if (t.o00oO0O == this.f21452OooO00o) {
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            } else {
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + t.o00oO0O + ".  Object cannot belong to two different pool instances simultaneously!");
            }
        }
        this.OooO0OO += size;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20013OooO00o() {
        return this.f21454OooO00o.length;
    }
}
