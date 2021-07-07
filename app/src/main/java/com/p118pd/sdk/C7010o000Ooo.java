package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o000Ooo  reason: case insensitive filesystem */
public class C7010o000Ooo<E> implements Cloneable {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19277OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object[] f19278OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;

    public C7010o000Ooo() {
        this(10);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7010o000Ooo<E> clone() {
        try {
            C7010o000Ooo<E> o000ooo = (C7010o000Ooo) super.clone();
            o000ooo.f19277OooO00o = (int[]) this.f19277OooO00o.clone();
            o000ooo.f19278OooO00o = (Object[]) this.f19278OooO00o.clone();
            return o000ooo;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18270OooO0O0(int i) {
        m18265OooO00o(i);
    }

    public void OooO0OO(int i) {
        Object[] objArr = this.f19278OooO00o;
        Object obj = objArr[i];
        Object obj2 = OooO00o;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.OooO0O0 = true;
        }
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
            sb.append(OooO0O0(i));
            sb.append(C7490o0OoOO0o.OooO00o);
            E OooO0O02 = m18269OooO0O0(i);
            if (OooO0O02 != this) {
                sb.append((Object) OooO0O02);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7010o000Ooo(int i) {
        this.OooO0O0 = false;
        if (i == 0) {
            this.f19277OooO00o = C6976o0000ooO.OooO00o;
            this.f19278OooO00o = C6976o0000ooO.f19183OooO00o;
        } else {
            int OooO0O02 = C6976o0000ooO.OooO0O0(i);
            this.f19277OooO00o = new int[OooO0O02];
            this.f19278OooO00o = new Object[OooO0O02];
        }
        this.o00oO0O = 0;
    }

    public void OooO0O0(int i, E e) {
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19277OooO00o, this.o00oO0O, i);
        if (OooO00o2 >= 0) {
            this.f19278OooO00o[OooO00o2] = e;
            return;
        }
        int i2 = OooO00o2 ^ -1;
        if (i2 < this.o00oO0O) {
            Object[] objArr = this.f19278OooO00o;
            if (objArr[i2] == OooO00o) {
                this.f19277OooO00o[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.OooO0O0 && this.o00oO0O >= this.f19277OooO00o.length) {
            OooO0OO();
            i2 = C6976o0000ooO.OooO00o(this.f19277OooO00o, this.o00oO0O, i) ^ -1;
        }
        int i3 = this.o00oO0O;
        if (i3 >= this.f19277OooO00o.length) {
            int OooO0O02 = C6976o0000ooO.OooO0O0(i3 + 1);
            int[] iArr = new int[OooO0O02];
            Object[] objArr2 = new Object[OooO0O02];
            int[] iArr2 = this.f19277OooO00o;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f19278OooO00o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f19277OooO00o = iArr;
            this.f19278OooO00o = objArr2;
        }
        int i4 = this.o00oO0O;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f19277OooO00o;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f19278OooO00o;
            System.arraycopy(objArr4, i2, objArr4, i5, this.o00oO0O - i2);
        }
        this.f19277OooO00o[i2] = i;
        this.f19278OooO00o[i2] = e;
        this.o00oO0O++;
    }

    private void OooO0OO() {
        int i = this.o00oO0O;
        int[] iArr = this.f19277OooO00o;
        Object[] objArr = this.f19278OooO00o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != OooO00o) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.OooO0O0 = false;
        this.o00oO0O = i2;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public E m18264OooO00o(int i) {
        return OooO00o(i, (Object) null);
    }

    public E OooO00o(int i, E e) {
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19277OooO00o, this.o00oO0O, i);
        if (OooO00o2 >= 0) {
            Object[] objArr = this.f19278OooO00o;
            if (objArr[OooO00o2] != OooO00o) {
                return (E) objArr[OooO00o2];
            }
        }
        return e;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18265OooO00o(int i) {
        Object[] objArr;
        Object obj;
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19277OooO00o, this.o00oO0O, i);
        if (OooO00o2 >= 0 && (objArr = this.f19278OooO00o)[OooO00o2] != (obj = OooO00o)) {
            objArr[OooO00o2] = obj;
            this.OooO0O0 = true;
        }
    }

    public void OooO00o(int i, int i2) {
        int min = Math.min(this.o00oO0O, i2 + i);
        while (i < min) {
            OooO0OO(i);
            i++;
        }
    }

    public void OooO0OO(int i, E e) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        this.f19278OooO00o[i] = e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.pd.sdk.o000Ooo<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public void OooO00o(@NonNull C7010o000Ooo<? extends E> o000ooo) {
        int OooO00o2 = o000ooo.OooO00o();
        for (int i = 0; i < OooO00o2; i++) {
            OooO0O0(o000ooo.OooO0O0(i), o000ooo.m18269OooO0O0(i));
        }
    }

    public int OooO00o() {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18267OooO00o() {
        return OooO00o() == 0;
    }

    public int OooO00o(int i) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return C6976o0000ooO.OooO00o(this.f19277OooO00o, this.o00oO0O, i);
    }

    public int OooO00o(E e) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        for (int i = 0; i < this.o00oO0O; i++) {
            if (this.f19278OooO00o[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int OooO0O0(int i) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return this.f19277OooO00o[i];
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public E m18269OooO0O0(int i) {
        if (this.OooO0O0) {
            OooO0OO();
        }
        return (E) this.f19278OooO00o[i];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18268OooO00o(int i) {
        return OooO00o(i) >= 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18266OooO00o(int i, E e) {
        int i2 = this.o00oO0O;
        if (i2 == 0 || i > this.f19277OooO00o[i2 - 1]) {
            if (this.OooO0O0 && this.o00oO0O >= this.f19277OooO00o.length) {
                OooO0OO();
            }
            int i3 = this.o00oO0O;
            if (i3 >= this.f19277OooO00o.length) {
                int OooO0O02 = C6976o0000ooO.OooO0O0(i3 + 1);
                int[] iArr = new int[OooO0O02];
                Object[] objArr = new Object[OooO0O02];
                int[] iArr2 = this.f19277OooO00o;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f19278OooO00o;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19277OooO00o = iArr;
                this.f19278OooO00o = objArr;
            }
            this.f19277OooO00o[i3] = i;
            this.f19278OooO00o[i3] = e;
            this.o00oO0O = i3 + 1;
            return;
        }
        OooO0O0(i, e);
    }

    public boolean OooO0O0(E e) {
        return OooO00o(e) >= 0;
    }

    public void OooO0O0() {
        int i = this.o00oO0O;
        Object[] objArr = this.f19278OooO00o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.o00oO0O = 0;
        this.OooO0O0 = false;
    }
}
