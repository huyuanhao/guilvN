package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o000  reason: case insensitive filesystem */
public class C6930o000<E> implements Cloneable {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[] f19061OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object[] f19062OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;

    public C6930o000() {
        this(10);
    }

    private void OooO0OO() {
        int i = this.o00oO0O;
        long[] jArr = this.f19061OooO00o;
        Object[] objArr = this.f19062OooO00o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != OooO00o) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.OooO0O0 = false;
        this.o00oO0O = i2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6930o000<E> clone() {
        try {
            C6930o000<E> o000 = (C6930o000) super.clone();
            o000.f19061OooO00o = (long[]) this.f19061OooO00o.clone();
            o000.f19062OooO00o = (Object[]) this.f19062OooO00o.clone();
            return o000;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void OooO0O0(long j) {
        m18086OooO00o(j);
    }

    public String toString() {
        if (OooO00o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o00oO0O * 28);
        sb.append('{');
        for (int i = 0; i < this.o00oO0O; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(OooO00o(i));
            sb.append(C7490o0OoOO0o.OooO00o);
            E OooO00o2 = m18083OooO00o(i);
            if (OooO00o2 != this) {
                sb.append((Object) OooO00o2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C6930o000(int i) {
        this.OooO0O0 = false;
        if (i == 0) {
            this.f19061OooO00o = C6976o0000ooO.f19182OooO00o;
            this.f19062OooO00o = C6976o0000ooO.f19183OooO00o;
        } else {
            int OooO0OO = C6976o0000ooO.OooO0OO(i);
            this.f19061OooO00o = new long[OooO0OO];
            this.f19062OooO00o = new Object[OooO0OO];
        }
        this.o00oO0O = 0;
    }

    public void OooO0O0(long j, E e) {
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19061OooO00o, this.o00oO0O, j);
        if (OooO00o2 >= 0) {
            this.f19062OooO00o[OooO00o2] = e;
            return;
        }
        int i = OooO00o2 ^ -1;
        if (i < this.o00oO0O) {
            Object[] objArr = this.f19062OooO00o;
            if (objArr[i] == OooO00o) {
                this.f19061OooO00o[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.OooO0O0 && this.o00oO0O >= this.f19061OooO00o.length) {
            OooO0OO();
            i = C6976o0000ooO.OooO00o(this.f19061OooO00o, this.o00oO0O, j) ^ -1;
        }
        int i2 = this.o00oO0O;
        if (i2 >= this.f19061OooO00o.length) {
            int OooO0OO = C6976o0000ooO.OooO0OO(i2 + 1);
            long[] jArr = new long[OooO0OO];
            Object[] objArr2 = new Object[OooO0OO];
            long[] jArr2 = this.f19061OooO00o;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f19062OooO00o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19061OooO00o = jArr;
            this.f19062OooO00o = objArr2;
        }
        int i3 = this.o00oO0O;
        if (i3 - i != 0) {
            long[] jArr3 = this.f19061OooO00o;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f19062OooO00o;
            System.arraycopy(objArr4, i, objArr4, i4, this.o00oO0O - i);
        }
        this.f19061OooO00o[i] = j;
        this.f19062OooO00o[i] = e;
        this.o00oO0O++;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public E m18084OooO00o(long j) {
        return OooO00o(j, (Object) null);
    }

    public E OooO00o(long j, E e) {
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19061OooO00o, this.o00oO0O, j);
        if (OooO00o2 >= 0) {
            Object[] objArr = this.f19062OooO00o;
            if (objArr[OooO00o2] != OooO00o) {
                return (E) objArr[OooO00o2];
            }
        }
        return e;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18086OooO00o(long j) {
        Object[] objArr;
        Object obj;
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19061OooO00o, this.o00oO0O, j);
        if (OooO00o2 >= 0 && (objArr = this.f19062OooO00o)[OooO00o2] != (obj = OooO00o)) {
            objArr[OooO00o2] = obj;
            this.OooO0O0 = true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18085OooO00o(int i) {
        Object[] objArr = this.f19062OooO00o;
        Object obj = objArr[i];
        Object obj2 = OooO00o;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.OooO0O0 = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.pd.sdk.o000<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public void OooO00o(@NonNull C6930o000<? extends E> o000) {
        int OooO00o2 = o000.OooO00o();
        for (int i = 0; i < OooO00o2; i++) {
            OooO0O0(o000.OooO00o(i), o000.m18083OooO00o(i));
        }
    }

    public int OooO00o() {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18088OooO00o() {
        return OooO00o() == 0;
    }

    public long OooO00o(int i) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return this.f19061OooO00o[i];
    }

    public boolean OooO0O0(E e) {
        return OooO00o(e) >= 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public E m18083OooO00o(int i) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return (E) this.f19062OooO00o[i];
    }

    public void OooO0O0() {
        int i = this.o00oO0O;
        Object[] objArr = this.f19062OooO00o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.o00oO0O = 0;
        this.OooO0O0 = false;
    }

    public void OooO00o(int i, E e) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        this.f19062OooO00o[i] = e;
    }

    public int OooO00o(long j) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return C6976o0000ooO.OooO00o(this.f19061OooO00o, this.o00oO0O, j);
    }

    public int OooO00o(E e) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        for (int i = 0; i < this.o00oO0O; i++) {
            if (this.f19062OooO00o[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18089OooO00o(long j) {
        return OooO00o(j) >= 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18087OooO00o(long j, E e) {
        int i = this.o00oO0O;
        if (i == 0 || j > this.f19061OooO00o[i - 1]) {
            if (this.OooO0O0 && this.o00oO0O >= this.f19061OooO00o.length) {
                OooO0OO();
            }
            int i2 = this.o00oO0O;
            if (i2 >= this.f19061OooO00o.length) {
                int OooO0OO = C6976o0000ooO.OooO0OO(i2 + 1);
                long[] jArr = new long[OooO0OO];
                Object[] objArr = new Object[OooO0OO];
                long[] jArr2 = this.f19061OooO00o;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f19062OooO00o;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19061OooO00o = jArr;
                this.f19062OooO00o = objArr;
            }
            this.f19061OooO00o[i2] = j;
            this.f19062OooO00o[i2] = e;
            this.o00oO0O = i2 + 1;
            return;
        }
        OooO0O0(j, e);
    }
}
