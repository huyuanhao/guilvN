package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.o0000oOO  reason: case insensitive filesystem */
public final class C6972o0000oOO<E> implements Collection<E>, Set<E> {
    public static final boolean OooO0O0 = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f19175OooO0O0 = new int[0];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Object[] f19176OooO0O0 = new Object[0];
    @Nullable
    public static Object[] OooO0OO = null;
    @Nullable
    public static Object[] OooO0Oo = null;
    public static int o0OOO0o = 0;
    public static final int o0ooOO0 = 4;
    public static final int o0ooOOo = 10;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f19177o0ooOOo = "ArraySet";
    public static int o0ooOoO;
    public AbstractC7005o000OoO<E, E> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f19178OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object[] f19179OooO00o;
    public int o00oO0O;

    /* renamed from: com.pd.sdk.o0000oOO$OooO00o */
    public class OooO00o extends AbstractC7005o000OoO<E, E> {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        public int OooO00o() {
            return C6972o0000oOO.this.o00oO0O;
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public int OooO0O0(Object obj) {
            return C6972o0000oOO.this.indexOf(obj);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public Object OooO00o(int i, int i2) {
            return C6972o0000oOO.this.f19179OooO00o[i];
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public int OooO00o(Object obj) {
            return C6972o0000oOO.this.indexOf(obj);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Map<E, E> m18178OooO00o() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public void OooO00o(E e, E e2) {
            C6972o0000oOO.this.add(e);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO
        public E OooO00o(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        public void OooO00o(int i) {
            C6972o0000oOO.this.OooO00o(i);
        }

        @Override // com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO, com.p118pd.sdk.AbstractC7005o000OoO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m18179OooO00o() {
            C6972o0000oOO.this.clear();
        }
    }

    public C6972o0000oOO() {
        this(0);
    }

    private int OooO00o(Object obj, int i) {
        int i2 = this.o00oO0O;
        if (i2 == 0) {
            return -1;
        }
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19178OooO00o, i2, i);
        if (OooO00o2 < 0 || obj.equals(this.f19179OooO00o[OooO00o2])) {
            return OooO00o2;
        }
        int i3 = OooO00o2 + 1;
        while (i3 < i2 && this.f19178OooO00o[i3] == i) {
            if (obj.equals(this.f19179OooO00o[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = OooO00o2 - 1;
        while (i4 >= 0 && this.f19178OooO00o[i4] == i) {
            if (obj.equals(this.f19179OooO00o[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    private void OooO0O0(int i) {
        if (i == 8) {
            synchronized (C6972o0000oOO.class) {
                if (OooO0Oo != null) {
                    Object[] objArr = OooO0Oo;
                    this.f19179OooO00o = objArr;
                    OooO0Oo = (Object[]) objArr[0];
                    this.f19178OooO00o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    o0OOO0o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C6972o0000oOO.class) {
                if (OooO0OO != null) {
                    Object[] objArr2 = OooO0OO;
                    this.f19179OooO00o = objArr2;
                    OooO0OO = (Object[]) objArr2[0];
                    this.f19178OooO00o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    o0ooOoO--;
                    return;
                }
            }
        }
        this.f19178OooO00o = new int[i];
        this.f19179OooO00o = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = OooO00o();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = OooO00o(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.o00oO0O;
        if (i4 >= this.f19178OooO00o.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f19178OooO00o;
            Object[] objArr = this.f19179OooO00o;
            OooO0O0(i5);
            int[] iArr2 = this.f19178OooO00o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f19179OooO00o, 0, objArr.length);
            }
            OooO00o(iArr, objArr, this.o00oO0O);
        }
        int i6 = this.o00oO0O;
        if (i3 < i6) {
            int[] iArr3 = this.f19178OooO00o;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f19179OooO00o;
            System.arraycopy(objArr2, i3, objArr2, i7, this.o00oO0O - i3);
        }
        this.f19178OooO00o[i3] = i;
        this.f19179OooO00o[i3] = e;
        this.o00oO0O++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.o0000oOO<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        m18175OooO00o(this.o00oO0O + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public void clear() {
        int i = this.o00oO0O;
        if (i != 0) {
            OooO00o(this.f19178OooO00o, this.f19179OooO00o, i);
            this.f19178OooO00o = f19175OooO0O0;
            this.f19179OooO00o = f19176OooO0O0;
            this.o00oO0O = 0;
        }
    }

    public boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.o00oO0O; i++) {
                try {
                    if (!set.contains(m18177OooO0O0(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f19178OooO00o;
        int i = this.o00oO0O;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? OooO00o() : OooO00o(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.o00oO0O <= 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return m18174OooO00o().OooO0O0().iterator();
    }

    public boolean remove(@Nullable Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        OooO00o(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.o00oO0O - 1; i >= 0; i--) {
            if (!collection.contains(this.f19179OooO00o[i])) {
                OooO00o(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.o00oO0O;
    }

    @NonNull
    public Object[] toArray() {
        int i = this.o00oO0O;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f19179OooO00o, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o00oO0O * 14);
        sb.append('{');
        for (int i = 0; i < this.o00oO0O; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E OooO0O02 = m18177OooO0O0(i);
            if (OooO0O02 != this) {
                sb.append((Object) OooO0O02);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C6972o0000oOO(int i) {
        if (i == 0) {
            this.f19178OooO00o = f19175OooO0O0;
            this.f19179OooO00o = f19176OooO0O0;
        } else {
            OooO0O0(i);
        }
        this.o00oO0O = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.o00oO0O) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.o00oO0O));
        }
        System.arraycopy(this.f19179OooO00o, 0, tArr, 0, this.o00oO0O);
        int length = tArr.length;
        int i = this.o00oO0O;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public C6972o0000oOO(@Nullable C6972o0000oOO<E> o0000ooo) {
        this();
        if (o0000ooo != null) {
            OooO00o((C6972o0000oOO) o0000ooo);
        }
    }

    private int OooO00o() {
        int i = this.o00oO0O;
        if (i == 0) {
            return -1;
        }
        int OooO00o2 = C6976o0000ooO.OooO00o(this.f19178OooO00o, i, 0);
        if (OooO00o2 < 0 || this.f19179OooO00o[OooO00o2] == null) {
            return OooO00o2;
        }
        int i2 = OooO00o2 + 1;
        while (i2 < i && this.f19178OooO00o[i2] == 0) {
            if (this.f19179OooO00o[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = OooO00o2 - 1;
        while (i3 >= 0 && this.f19178OooO00o[i3] == 0) {
            if (this.f19179OooO00o[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public C6972o0000oOO(@Nullable Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    public static void OooO00o(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C6972o0000oOO.class) {
                if (o0OOO0o < 10) {
                    objArr[0] = OooO0Oo;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    OooO0Oo = objArr;
                    o0OOO0o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C6972o0000oOO.class) {
                if (o0ooOoO < 10) {
                    objArr[0] = OooO0OO;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    OooO0OO = objArr;
                    o0ooOoO++;
                }
            }
        }
    }

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public E m18177OooO0O0(int i) {
        return (E) this.f19179OooO00o[i];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18175OooO00o(int i) {
        int[] iArr = this.f19178OooO00o;
        if (iArr.length < i) {
            Object[] objArr = this.f19179OooO00o;
            OooO0O0(i);
            int i2 = this.o00oO0O;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f19178OooO00o, 0, i2);
                System.arraycopy(objArr, 0, this.f19179OooO00o, 0, this.o00oO0O);
            }
            OooO00o(iArr, objArr, this.o00oO0O);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(E e) {
        int i;
        int i2 = this.o00oO0O;
        if (e == null) {
            i = 0;
        } else {
            i = e.hashCode();
        }
        int[] iArr = this.f19178OooO00o;
        if (i2 >= iArr.length) {
            throw new IllegalStateException("Array is full");
        } else if (i2 <= 0 || iArr[i2 - 1] <= i) {
            this.o00oO0O = i2 + 1;
            this.f19178OooO00o[i2] = i;
            this.f19179OooO00o[i2] = e;
        } else {
            add(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.pd.sdk.o0000oOO<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public void OooO00o(@NonNull C6972o0000oOO<? extends E> o0000ooo) {
        int i = o0000ooo.o00oO0O;
        m18175OooO00o(this.o00oO0O + i);
        if (this.o00oO0O != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(o0000ooo.m18177OooO0O0(i2));
            }
        } else if (i > 0) {
            System.arraycopy(o0000ooo.f19178OooO00o, 0, this.f19178OooO00o, 0, i);
            System.arraycopy(o0000ooo.f19179OooO00o, 0, this.f19179OooO00o, 0, i);
            this.o00oO0O = i;
        }
    }

    public E OooO00o(int i) {
        Object[] objArr = this.f19179OooO00o;
        E e = (E) objArr[i];
        int i2 = this.o00oO0O;
        if (i2 <= 1) {
            OooO00o(this.f19178OooO00o, objArr, i2);
            this.f19178OooO00o = f19175OooO0O0;
            this.f19179OooO00o = f19176OooO0O0;
            this.o00oO0O = 0;
        } else {
            int[] iArr = this.f19178OooO00o;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = this.o00oO0O - 1;
                this.o00oO0O = i4;
                if (i < i4) {
                    int[] iArr2 = this.f19178OooO00o;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr2 = this.f19179OooO00o;
                    System.arraycopy(objArr2, i5, objArr2, i, this.o00oO0O - i);
                }
                this.f19179OooO00o[this.o00oO0O] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f19178OooO00o;
                Object[] objArr3 = this.f19179OooO00o;
                OooO0O0(i3);
                this.o00oO0O--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f19178OooO00o, 0, i);
                    System.arraycopy(objArr3, 0, this.f19179OooO00o, 0, i);
                }
                int i6 = this.o00oO0O;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f19178OooO00o, i, i6 - i);
                    System.arraycopy(objArr3, i7, this.f19179OooO00o, i, this.o00oO0O - i);
                }
            }
        }
        return e;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18176OooO00o(@NonNull C6972o0000oOO<? extends E> o0000ooo) {
        int i = o0000ooo.o00oO0O;
        int i2 = this.o00oO0O;
        for (int i3 = 0; i3 < i; i3++) {
            remove(o0000ooo.m18177OooO0O0(i3));
        }
        if (i2 != this.o00oO0O) {
            return true;
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private AbstractC7005o000OoO<E, E> m18174OooO00o() {
        if (this.OooO00o == null) {
            this.OooO00o = new OooO00o();
        }
        return this.OooO00o;
    }
}
