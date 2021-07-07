package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: com.pd.sdk.o0O00oO0  reason: case insensitive filesystem */
public class C7285o0O00oO0<T> {
    public static final int OooO = 2;
    public static final int OooO0o = 10;
    public static final int OooO0o0 = -1;
    public static final int OooO0oO = 10;
    public static final int OooO0oo = 1;
    public static final int OooOO0 = 4;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f19953OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0 f19954OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Class<T> f19955OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T[] f19956OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public T[] f19957OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    /* renamed from: com.pd.sdk.o0O00oO0$OooO00o */
    public static class OooO00o<T2> extends OooO0O0<T2> {
        public final C7256o0O000O OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0<T2> f19958OooO00o;

        public OooO00o(OooO0O0<T2> oooO0O0) {
            this.f19958OooO00o = oooO0O0;
            this.OooO00o = new C7256o0O000O(oooO0O0);
        }

        @Override // com.p118pd.sdk.o0O00OOO
        public void OooO00o(int i, int i2) {
            this.OooO00o.OooO00o(i, i2);
        }

        @Override // com.p118pd.sdk.o0O00OOO
        public void OooO0O0(int i, int i2) {
            this.OooO00o.OooO0O0(i, i2);
        }

        @Override // com.p118pd.sdk.o0O00OOO
        public void OooO0OO(int i, int i2) {
            this.OooO00o.OooO0OO(i, i2);
        }

        @Override // com.p118pd.sdk.C7285o0O00oO0.OooO0O0
        public void OooO0Oo(int i, int i2) {
            this.OooO00o.OooO00o(i, i2, null);
        }

        @Override // com.p118pd.sdk.C7285o0O00oO0.OooO0O0, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.f19958OooO00o.compare(t2, t22);
        }

        @Override // com.p118pd.sdk.o0O00OOO, com.p118pd.sdk.C7285o0O00oO0.OooO0O0
        public void OooO00o(int i, int i2, Object obj) {
            this.OooO00o.OooO00o(i, i2, obj);
        }

        @Override // com.p118pd.sdk.C7285o0O00oO0.OooO0O0
        public boolean OooO0O0(T2 t2, T2 t22) {
            return this.f19958OooO00o.OooO0O0(t2, t22);
        }

        @Override // com.p118pd.sdk.C7285o0O00oO0.OooO0O0, com.p118pd.sdk.C7285o0O00oO0.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18788OooO00o(T2 t2, T2 t22) {
            return this.f19958OooO00o.m18789OooO00o((Object) t2, (Object) t22);
        }

        @Override // com.p118pd.sdk.C7285o0O00oO0.OooO0O0, com.p118pd.sdk.C7285o0O00oO0.OooO0O0
        @Nullable
        public Object OooO00o(T2 t2, T2 t22) {
            return this.f19958OooO00o.OooO00o((Object) t2, (Object) t22);
        }

        public void OooO00o() {
            this.OooO00o.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.o0O00oO0$OooO0O0 */
    public static abstract class OooO0O0<T2> implements Comparator<T2>, o0O00OOO {
        @Nullable
        public Object OooO00o(T2 t2, T2 t22) {
            return null;
        }

        @Override // com.p118pd.sdk.o0O00OOO
        public void OooO00o(int i, int i2, Object obj) {
            OooO0Oo(i, i2);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract boolean m18789OooO00o(T2 t2, T2 t22);

        public abstract boolean OooO0O0(T2 t2, T2 t22);

        public abstract void OooO0Oo(int i, int i2);

        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);
    }

    public C7285o0O00oO0(@NonNull Class<T> cls, @NonNull OooO0O0<T> oooO0O0) {
        this(cls, oooO0O0, 10);
    }

    private void OooO0OO(T[] tArr) {
        if (tArr.length >= 1) {
            int OooO00o2 = OooO00o((Object[]) tArr);
            if (this.OooO0Oo == 0) {
                this.f19956OooO00o = tArr;
                this.OooO0Oo = OooO00o2;
                this.f19954OooO00o.OooO0OO(0, OooO00o2);
                return;
            }
            OooO00o(tArr, OooO00o2);
        }
    }

    private void OooO0Oo(@NonNull T[] tArr) {
        boolean z = !(this.f19954OooO00o instanceof OooO00o);
        if (z) {
            m18784OooO00o();
        }
        this.OooO00o = 0;
        this.OooO0O0 = this.OooO0Oo;
        this.f19957OooO0O0 = this.f19956OooO00o;
        this.OooO0OO = 0;
        int OooO00o2 = OooO00o((Object[]) tArr);
        this.f19956OooO00o = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f19955OooO00o, OooO00o2));
        while (true) {
            if (this.OooO0OO >= OooO00o2 && this.OooO00o >= this.OooO0O0) {
                break;
            }
            int i = this.OooO00o;
            int i2 = this.OooO0O0;
            if (i >= i2) {
                int i3 = this.OooO0OO;
                int i4 = OooO00o2 - i3;
                System.arraycopy(tArr, i3, this.f19956OooO00o, i3, i4);
                this.OooO0OO += i4;
                this.OooO0Oo += i4;
                this.f19954OooO00o.OooO0OO(i3, i4);
                break;
            }
            int i5 = this.OooO0OO;
            if (i5 >= OooO00o2) {
                int i6 = i2 - i;
                this.OooO0Oo -= i6;
                this.f19954OooO00o.OooO00o(i5, i6);
                break;
            }
            T t = this.f19957OooO0O0[i];
            T t2 = tArr[i5];
            int compare = this.f19954OooO00o.compare(t, t2);
            if (compare < 0) {
                OooO0Oo();
            } else if (compare > 0) {
                OooO00o((Object) t2);
            } else if (!this.f19954OooO00o.OooO0O0(t, t2)) {
                OooO0Oo();
                OooO00o((Object) t2);
            } else {
                T[] tArr2 = this.f19956OooO00o;
                int i7 = this.OooO0OO;
                tArr2[i7] = t2;
                this.OooO00o++;
                this.OooO0OO = i7 + 1;
                if (!this.f19954OooO00o.m18789OooO00o((Object) t, (Object) t2)) {
                    OooO0O0 oooO0O0 = this.f19954OooO00o;
                    oooO0O0.OooO00o(this.OooO0OO - 1, 1, oooO0O0.OooO00o((Object) t, (Object) t2));
                }
            }
        }
        this.f19957OooO0O0 = null;
        if (z) {
            OooO0OO();
        }
    }

    private void OooO0o0() {
        if (this.f19957OooO0O0 != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int OooO00o() {
        return this.OooO0Oo;
    }

    public void OooO0O0(@NonNull T[] tArr, boolean z) {
        OooO0o0();
        if (z) {
            OooO0Oo(tArr);
        } else {
            OooO0Oo(m18782OooO00o((Object[]) tArr));
        }
    }

    public C7285o0O00oO0(@NonNull Class<T> cls, @NonNull OooO0O0<T> oooO0O0, int i) {
        this.f19955OooO00o = cls;
        this.f19956OooO00o = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        this.f19954OooO00o = oooO0O0;
        this.OooO0Oo = 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18783OooO00o(T t) {
        OooO0o0();
        return OooO00o((Object) t, true);
    }

    public void OooO00o(@NonNull T[] tArr, boolean z) {
        OooO0o0();
        if (tArr.length != 0) {
            if (z) {
                OooO0OO(tArr);
            } else {
                OooO0OO(m18782OooO00o((Object[]) tArr));
            }
        }
    }

    public void OooO0O0(@NonNull T... tArr) {
        OooO0O0((Object[]) tArr, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.o0O00oO0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void OooO0O0(@NonNull Collection<T> collection) {
        OooO0O0(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f19955OooO00o, collection.size())), true);
    }

    public T OooO0O0(int i) {
        OooO0o0();
        T OooO00o2 = OooO00o(i);
        OooO00o(i, true);
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18786OooO00o(@NonNull T... tArr) {
        OooO00o((Object[]) tArr, false);
    }

    public void OooO0OO() {
        OooO0o0();
        OooO0O0 oooO0O0 = this.f19954OooO00o;
        if (oooO0O0 instanceof OooO00o) {
            ((OooO00o) oooO0O0).OooO00o();
        }
        OooO0O0 oooO0O02 = this.f19954OooO00o;
        OooO00o oooO00o = this.f19953OooO00o;
        if (oooO0O02 == oooO00o) {
            this.f19954OooO00o = oooO00o.f19958OooO00o;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.o0O00oO0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void OooO00o(@NonNull Collection<T> collection) {
        OooO00o(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f19955OooO00o, collection.size())), true);
    }

    public int OooO0O0(T t) {
        if (this.f19957OooO0O0 == null) {
            return OooO00o(t, this.f19956OooO00o, 0, this.OooO0Oo, 4);
        }
        int OooO00o2 = OooO00o(t, this.f19956OooO00o, 0, this.OooO0OO, 4);
        if (OooO00o2 != -1) {
            return OooO00o2;
        }
        int OooO00o3 = OooO00o(t, this.f19957OooO0O0, this.OooO00o, this.OooO0O0, 4);
        if (OooO00o3 != -1) {
            return (OooO00o3 - this.OooO00o) + this.OooO0OO;
        }
        return -1;
    }

    private void OooO00o(T t) {
        T[] tArr = this.f19956OooO00o;
        int i = this.OooO0OO;
        tArr[i] = t;
        int i2 = i + 1;
        this.OooO0OO = i2;
        this.OooO0Oo++;
        this.f19954OooO00o.OooO0OO(i2 - 1, 1);
    }

    private int OooO00o(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f19954OooO00o);
        int i = 1;
        int i2 = 0;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.f19954OooO00o.compare(tArr[i2], t) == 0) {
                int OooO00o2 = OooO00o(t, tArr, i2, i);
                if (OooO00o2 != -1) {
                    tArr[OooO00o2] = t;
                } else {
                    if (i != i3) {
                        tArr[i] = t;
                    }
                    i++;
                }
            } else {
                if (i != i3) {
                    tArr[i] = t;
                }
                i2 = i;
                i++;
            }
        }
        return i;
    }

    private void OooO0O0(int i, T t) {
        int i2 = this.OooO0Oo;
        if (i <= i2) {
            T[] tArr = this.f19956OooO00o;
            if (i2 == tArr.length) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f19955OooO00o, tArr.length + 10));
                System.arraycopy(this.f19956OooO00o, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.f19956OooO00o, i, tArr2, i + 1, this.OooO0Oo - i);
                this.f19956OooO00o = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.f19956OooO00o[i] = t;
            }
            this.OooO0Oo++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.OooO0Oo);
    }

    private int OooO00o(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.f19954OooO00o.OooO0O0(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void OooO00o(T[] tArr, int i) {
        boolean z = !(this.f19954OooO00o instanceof OooO00o);
        if (z) {
            m18784OooO00o();
        }
        this.f19957OooO0O0 = this.f19956OooO00o;
        int i2 = 0;
        this.OooO00o = 0;
        int i3 = this.OooO0Oo;
        this.OooO0O0 = i3;
        this.f19956OooO00o = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f19955OooO00o, i3 + i + 10));
        this.OooO0OO = 0;
        while (true) {
            if (this.OooO00o >= this.OooO0O0 && i2 >= i) {
                break;
            }
            int i4 = this.OooO00o;
            int i5 = this.OooO0O0;
            if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.f19956OooO00o, this.OooO0OO, i6);
                int i7 = this.OooO0OO + i6;
                this.OooO0OO = i7;
                this.OooO0Oo += i6;
                this.f19954OooO00o.OooO0OO(i7 - i6, i6);
                break;
            } else if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.f19957OooO0O0, i4, this.f19956OooO00o, this.OooO0OO, i8);
                this.OooO0OO += i8;
                break;
            } else {
                T t = this.f19957OooO0O0[i4];
                T t2 = tArr[i2];
                int compare = this.f19954OooO00o.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.f19956OooO00o;
                    int i9 = this.OooO0OO;
                    int i10 = i9 + 1;
                    this.OooO0OO = i10;
                    tArr2[i9] = t2;
                    this.OooO0Oo++;
                    i2++;
                    this.f19954OooO00o.OooO0OO(i10 - 1, 1);
                } else if (compare != 0 || !this.f19954OooO00o.OooO0O0(t, t2)) {
                    T[] tArr3 = this.f19956OooO00o;
                    int i11 = this.OooO0OO;
                    this.OooO0OO = i11 + 1;
                    tArr3[i11] = t;
                    this.OooO00o++;
                } else {
                    T[] tArr4 = this.f19956OooO00o;
                    int i12 = this.OooO0OO;
                    this.OooO0OO = i12 + 1;
                    tArr4[i12] = t2;
                    i2++;
                    this.OooO00o++;
                    if (!this.f19954OooO00o.m18789OooO00o((Object) t, (Object) t2)) {
                        OooO0O0 oooO0O0 = this.f19954OooO00o;
                        oooO0O0.OooO00o(this.OooO0OO - 1, 1, oooO0O0.OooO00o((Object) t, (Object) t2));
                    }
                }
            }
        }
        this.f19957OooO0O0 = null;
        if (z) {
            OooO0OO();
        }
    }

    public void OooO0O0() {
        OooO0o0();
        int i = this.OooO0Oo;
        if (i != 0) {
            Arrays.fill(this.f19956OooO00o, 0, i, (Object) null);
            this.OooO0Oo = 0;
            this.f19954OooO00o.OooO00o(0, i);
        }
    }

    private void OooO0Oo() {
        this.OooO0Oo--;
        this.OooO00o++;
        this.f19954OooO00o.OooO00o(this.OooO0OO, 1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18784OooO00o() {
        OooO0o0();
        OooO0O0 oooO0O0 = this.f19954OooO00o;
        if (!(oooO0O0 instanceof OooO00o)) {
            if (this.f19953OooO00o == null) {
                this.f19953OooO00o = new OooO00o(oooO0O0);
            }
            this.f19954OooO00o = this.f19953OooO00o;
        }
    }

    private int OooO00o(T t, boolean z) {
        int OooO00o2 = OooO00o(t, this.f19956OooO00o, 0, this.OooO0Oo, 1);
        if (OooO00o2 == -1) {
            OooO00o2 = 0;
        } else if (OooO00o2 < this.OooO0Oo) {
            T t2 = this.f19956OooO00o[OooO00o2];
            if (this.f19954OooO00o.OooO0O0(t2, t)) {
                if (this.f19954OooO00o.m18789OooO00o((Object) t2, (Object) t)) {
                    this.f19956OooO00o[OooO00o2] = t;
                    return OooO00o2;
                }
                this.f19956OooO00o[OooO00o2] = t;
                OooO0O0 oooO0O0 = this.f19954OooO00o;
                oooO0O0.OooO00o(OooO00o2, 1, oooO0O0.OooO00o((Object) t2, (Object) t));
                return OooO00o2;
            }
        }
        OooO0O0(OooO00o2, t);
        if (z) {
            this.f19954OooO00o.OooO0OO(OooO00o2, 1);
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18787OooO00o(T t) {
        OooO0o0();
        return m18781OooO00o((Object) t, true);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18781OooO00o(T t, boolean z) {
        int OooO00o2 = OooO00o(t, this.f19956OooO00o, 0, this.OooO0Oo, 2);
        if (OooO00o2 == -1) {
            return false;
        }
        OooO00o(OooO00o2, z);
        return true;
    }

    private void OooO00o(int i, boolean z) {
        T[] tArr = this.f19956OooO00o;
        System.arraycopy(tArr, i + 1, tArr, i, (this.OooO0Oo - i) - 1);
        int i2 = this.OooO0Oo - 1;
        this.OooO0Oo = i2;
        this.f19956OooO00o[i2] = null;
        if (z) {
            this.f19954OooO00o.OooO00o(i, 1);
        }
    }

    public void OooO00o(int i, T t) {
        OooO0o0();
        T OooO00o2 = OooO00o(i);
        boolean z = OooO00o2 == t || !this.f19954OooO00o.m18789OooO00o(OooO00o2, t);
        if (OooO00o2 == t || this.f19954OooO00o.compare(OooO00o2, t) != 0) {
            if (z) {
                OooO0O0 oooO0O0 = this.f19954OooO00o;
                oooO0O0.OooO00o(i, 1, oooO0O0.OooO00o((Object) OooO00o2, (Object) t));
            }
            OooO00o(i, false);
            int OooO00o3 = OooO00o((Object) t, false);
            if (i != OooO00o3) {
                this.f19954OooO00o.OooO0O0(i, OooO00o3);
                return;
            }
            return;
        }
        this.f19956OooO00o[i] = t;
        if (z) {
            OooO0O0 oooO0O02 = this.f19954OooO00o;
            oooO0O02.OooO00o(i, 1, oooO0O02.OooO00o((Object) OooO00o2, (Object) t));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18785OooO00o(int i) {
        OooO0o0();
        T OooO00o2 = OooO00o(i);
        OooO00o(i, false);
        int OooO00o3 = OooO00o((Object) OooO00o2, false);
        if (i != OooO00o3) {
            this.f19954OooO00o.OooO0O0(i, OooO00o3);
        }
    }

    public T OooO00o(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i >= this.OooO0Oo || i < 0) {
            throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.OooO0Oo);
        }
        T[] tArr = this.f19957OooO0O0;
        if (tArr == null || i < (i2 = this.OooO0OO)) {
            return this.f19956OooO00o[i];
        }
        return tArr[(i - i2) + this.OooO00o];
    }

    private int OooO00o(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.f19954OooO00o.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare != 0) {
                i2 = i4;
            } else if (this.f19954OooO00o.OooO0O0(t2, t)) {
                return i4;
            } else {
                int OooO00o2 = OooO00o(t, i4, i, i2);
                if (i3 == 1) {
                    return OooO00o2 == -1 ? i4 : OooO00o2;
                }
                return OooO00o2;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    private int OooO00o(T t, int i, int i2, int i3) {
        T t2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            T t3 = this.f19956OooO00o[i4];
            if (this.f19954OooO00o.compare(t3, t) != 0) {
                break;
            } else if (this.f19954OooO00o.OooO0O0(t3, t)) {
                return i4;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -1;
            }
            t2 = this.f19956OooO00o[i];
            if (this.f19954OooO00o.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.f19954OooO00o.OooO0O0(t2, t));
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private T[] m18782OooO00o(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f19955OooO00o, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }
}
