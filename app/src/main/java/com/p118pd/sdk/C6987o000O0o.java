package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: com.pd.sdk.o000O0o  reason: case insensitive filesystem */
public class C6987o000O0o<K, V> {
    public static final boolean OooO0O0 = false;
    @Nullable

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Object[] f19189OooO0O0 = null;
    public static final boolean OooO0OO = true;
    @Nullable

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static Object[] f19190OooO0OO = null;
    public static int o0OOO0o = 0;
    public static final int o0ooOO0 = 4;
    public static final int o0ooOOo = 10;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f19191o0ooOOo = "ArrayMap";
    public static int o0ooOoO;
    public int[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object[] f19192OooO00o;
    public int o00oO0O;

    public C6987o000O0o() {
        this.OooO00o = C6976o0000ooO.OooO00o;
        this.f19192OooO00o = C6976o0000ooO.f19183OooO00o;
        this.o00oO0O = 0;
    }

    public static int OooO00o(int[] iArr, int i, int i2) {
        try {
            return C6976o0000ooO.OooO00o(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private void OooO0O0(int i) {
        if (i == 8) {
            synchronized (C6971o0000oO0.class) {
                if (f19190OooO0OO != null) {
                    Object[] objArr = f19190OooO0OO;
                    this.f19192OooO00o = objArr;
                    f19190OooO0OO = (Object[]) objArr[0];
                    this.OooO00o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    o0OOO0o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C6971o0000oO0.class) {
                if (f19189OooO0O0 != null) {
                    Object[] objArr2 = f19189OooO0O0;
                    this.f19192OooO00o = objArr2;
                    f19189OooO0O0 = (Object[]) objArr2[0];
                    this.OooO00o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    o0ooOoO--;
                    return;
                }
            }
        }
        this.OooO00o = new int[i];
        this.f19192OooO00o = new Object[(i << 1)];
    }

    public V OooO0OO(int i) {
        return (V) this.f19192OooO00o[(i << 1) + 1];
    }

    public void clear() {
        int i = this.o00oO0O;
        if (i > 0) {
            int[] iArr = this.OooO00o;
            Object[] objArr = this.f19192OooO00o;
            this.OooO00o = C6976o0000ooO.OooO00o;
            this.f19192OooO00o = C6976o0000ooO.f19183OooO00o;
            this.o00oO0O = 0;
            OooO00o(iArr, objArr, i);
        }
        if (this.o00oO0O > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        return OooO00o(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return OooO0O0(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6987o000O0o) {
            C6987o000O0o o000o0o = (C6987o000O0o) obj;
            if (size() != o000o0o.size()) {
                return false;
            }
            for (int i = 0; i < this.o00oO0O; i++) {
                try {
                    K OooO00o2 = OooO00o(i);
                    V OooO0OO2 = OooO0OO(i);
                    Object obj2 = o000o0o.get(OooO00o2);
                    if (OooO0OO2 == null) {
                        if (obj2 != null || !o000o0o.containsKey(OooO00o2)) {
                            return false;
                        }
                    } else if (!OooO0OO2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.o00oO0O; i2++) {
                try {
                    K OooO00o3 = OooO00o(i2);
                    V OooO0OO3 = OooO0OO(i2);
                    Object obj3 = map.get(OooO00o3);
                    if (OooO0OO3 == null) {
                        if (obj3 != null || !map.containsKey(OooO00o3)) {
                            return false;
                        }
                    } else if (!OooO0OO3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @Nullable
    public V get(Object obj) {
        int OooO00o2 = OooO00o(obj);
        if (OooO00o2 >= 0) {
            return (V) this.f19192OooO00o[(OooO00o2 << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.OooO00o;
        Object[] objArr = this.f19192OooO00o;
        int i = this.o00oO0O;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.o00oO0O <= 0;
    }

    @Nullable
    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.o00oO0O;
        if (k == null) {
            i2 = OooO00o();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = OooO00o(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f19192OooO00o;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.OooO00o.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.OooO00o;
            Object[] objArr2 = this.f19192OooO00o;
            OooO0O0(i6);
            if (i3 == this.o00oO0O) {
                int[] iArr2 = this.OooO00o;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f19192OooO00o, 0, objArr2.length);
                }
                OooO00o(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.OooO00o;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f19192OooO00o;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.o00oO0O - i5) << 1);
        }
        int i8 = this.o00oO0O;
        if (i3 == i8) {
            int[] iArr4 = this.OooO00o;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f19192OooO00o;
                int i9 = i5 << 1;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.o00oO0O = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V remove(Object obj) {
        int OooO00o2 = OooO00o(obj);
        if (OooO00o2 >= 0) {
            return m18207OooO0O0(OooO00o2);
        }
        return null;
    }

    public int size() {
        return this.o00oO0O;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o00oO0O * 28);
        sb.append('{');
        for (int i = 0; i < this.o00oO0O; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K OooO00o2 = OooO00o(i);
            if (OooO00o2 != this) {
                sb.append((Object) OooO00o2);
            } else {
                sb.append("(this Map)");
            }
            sb.append(C7490o0OoOO0o.OooO00o);
            V OooO0OO2 = OooO0OO(i);
            if (OooO0OO2 != this) {
                sb.append((Object) OooO0OO2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public int OooO00o(Object obj, int i) {
        int i2 = this.o00oO0O;
        if (i2 == 0) {
            return -1;
        }
        int OooO00o2 = OooO00o(this.OooO00o, i2, i);
        if (OooO00o2 < 0 || obj.equals(this.f19192OooO00o[OooO00o2 << 1])) {
            return OooO00o2;
        }
        int i3 = OooO00o2 + 1;
        while (i3 < i2 && this.OooO00o[i3] == i) {
            if (obj.equals(this.f19192OooO00o[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = OooO00o2 - 1;
        while (i4 >= 0 && this.OooO00o[i4] == i) {
            if (obj.equals(this.f19192OooO00o[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public C6987o000O0o(int i) {
        if (i == 0) {
            this.OooO00o = C6976o0000ooO.OooO00o;
            this.f19192OooO00o = C6976o0000ooO.f19183OooO00o;
        } else {
            OooO0O0(i);
        }
        this.o00oO0O = 0;
    }

    public C6987o000O0o(C6987o000O0o<K, V> o000o0o) {
        this();
        if (o000o0o != null) {
            OooO00o((C6987o000O0o) o000o0o);
        }
    }

    public int OooO00o() {
        int i = this.o00oO0O;
        if (i == 0) {
            return -1;
        }
        int OooO00o2 = OooO00o(this.OooO00o, i, 0);
        if (OooO00o2 < 0 || this.f19192OooO00o[OooO00o2 << 1] == null) {
            return OooO00o2;
        }
        int i2 = OooO00o2 + 1;
        while (i2 < i && this.OooO00o[i2] == 0) {
            if (this.f19192OooO00o[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = OooO00o2 - 1;
        while (i3 >= 0 && this.OooO00o[i3] == 0) {
            if (this.f19192OooO00o[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public static void OooO00o(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C6971o0000oO0.class) {
                if (o0OOO0o < 10) {
                    objArr[0] = f19190OooO0OO;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f19190OooO0OO = objArr;
                    o0OOO0o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C6971o0000oO0.class) {
                if (o0ooOoO < 10) {
                    objArr[0] = f19189OooO0O0;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f19189OooO0O0 = objArr;
                    o0ooOoO++;
                }
            }
        }
    }

    public int OooO0O0(Object obj) {
        int i = this.o00oO0O * 2;
        Object[] objArr = this.f19192OooO00o;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public V m18207OooO0O0(int i) {
        Object[] objArr = this.f19192OooO00o;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.o00oO0O;
        int i4 = 0;
        if (i3 <= 1) {
            OooO00o(this.OooO00o, objArr, i3);
            this.OooO00o = C6976o0000ooO.OooO00o;
            this.f19192OooO00o = C6976o0000ooO.f19183OooO00o;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.OooO00o;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.OooO00o;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr2 = this.f19192OooO00o;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f19192OooO00o;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.OooO00o;
                Object[] objArr4 = this.f19192OooO00o;
                OooO0O0(i6);
                if (i3 == this.o00oO0O) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.OooO00o, 0, i);
                        System.arraycopy(objArr4, 0, this.f19192OooO00o, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.OooO00o, i, i11);
                        System.arraycopy(objArr4, i10 << 1, this.f19192OooO00o, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.o00oO0O) {
            this.o00oO0O = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18206OooO00o(int i) {
        int i2 = this.o00oO0O;
        int[] iArr = this.OooO00o;
        if (iArr.length < i) {
            Object[] objArr = this.f19192OooO00o;
            OooO0O0(i);
            if (this.o00oO0O > 0) {
                System.arraycopy(iArr, 0, this.OooO00o, 0, i2);
                System.arraycopy(objArr, 0, this.f19192OooO00o, 0, i2 << 1);
            }
            OooO00o(iArr, objArr, i2);
        }
        if (this.o00oO0O != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int OooO00o(@Nullable Object obj) {
        return obj == null ? OooO00o() : OooO00o(obj, obj.hashCode());
    }

    public K OooO00o(int i) {
        return (K) this.f19192OooO00o[i << 1];
    }

    public V OooO00o(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f19192OooO00o;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.pd.sdk.o000O0o<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public void OooO00o(@NonNull C6987o000O0o<? extends K, ? extends V> o000o0o) {
        int i = o000o0o.o00oO0O;
        m18206OooO00o(this.o00oO0O + i);
        if (this.o00oO0O != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(o000o0o.OooO00o(i2), o000o0o.OooO0OO(i2));
            }
        } else if (i > 0) {
            System.arraycopy(o000o0o.OooO00o, 0, this.OooO00o, 0, i);
            System.arraycopy(o000o0o.f19192OooO00o, 0, this.f19192OooO00o, 0, i << 1);
            this.o00oO0O = i;
        }
    }
}
