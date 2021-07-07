package com.p118pd.sdk;

import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.pd.sdk.o000OoO  reason: case insensitive filesystem */
public abstract class AbstractC7005o000OoO<K, V> {
    @Nullable
    public AbstractC7005o000OoO<K, V>.OooO0O0 OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7005o000OoO<K, V>.OooO0OO f19273OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC7005o000OoO<K, V>.C7007OooO0o0 f19274OooO00o;

    /* renamed from: com.pd.sdk.o000OoO$OooO00o */
    public final class OooO00o<T> implements Iterator<T> {
        public boolean OooO0O0 = false;
        public final int o00oO0O;
        public int o0ooOO0;
        public int o0ooOOo;

        public OooO00o(int i) {
            this.o00oO0O = i;
            this.o0ooOO0 = AbstractC7005o000OoO.this.OooO00o();
        }

        public boolean hasNext() {
            return this.o0ooOOo < this.o0ooOO0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC7005o000OoO.this.OooO00o(this.o0ooOOo, this.o00oO0O);
                this.o0ooOOo++;
                this.OooO0O0 = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.OooO0O0) {
                int i = this.o0ooOOo - 1;
                this.o0ooOOo = i;
                this.o0ooOO0--;
                this.OooO0O0 = false;
                AbstractC7005o000OoO.this.OooO00o(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.pd.sdk.o000OoO$OooO0O0 */
    public final class OooO0O0 implements Set<Map.Entry<K, V>> {
        public OooO0O0() {
        }

        /* renamed from: OooO00o */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.o000OoO */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int OooO00o2 = AbstractC7005o000OoO.this.OooO00o();
            Iterator<? extends Map.Entry<K, V>> it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC7005o000OoO.this.OooO00o(entry.getKey(), entry.getValue());
            }
            return OooO00o2 != AbstractC7005o000OoO.this.OooO00o();
        }

        public void clear() {
            AbstractC7005o000OoO.this.m18253OooO00o();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int OooO00o2 = AbstractC7005o000OoO.this.OooO00o(entry.getKey());
            if (OooO00o2 < 0) {
                return false;
            }
            return C6976o0000ooO.OooO00o(AbstractC7005o000OoO.this.OooO00o(OooO00o2, 1), entry.getValue());
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return AbstractC7005o000OoO.OooO00o((Set) this, obj);
        }

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int OooO00o2 = AbstractC7005o000OoO.this.OooO00o() - 1; OooO00o2 >= 0; OooO00o2--) {
                Object OooO00o3 = AbstractC7005o000OoO.this.OooO00o(OooO00o2, 0);
                Object OooO00o4 = AbstractC7005o000OoO.this.OooO00o(OooO00o2, 1);
                if (OooO00o3 == null) {
                    i = 0;
                } else {
                    i = OooO00o3.hashCode();
                }
                if (OooO00o4 == null) {
                    i2 = 0;
                } else {
                    i2 = OooO00o4.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return AbstractC7005o000OoO.this.OooO00o() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7006OooO0Oo();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return AbstractC7005o000OoO.this.OooO00o();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.pd.sdk.o000OoO$OooO0OO */
    public final class OooO0OO implements Set<K> {
        public OooO0OO() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            AbstractC7005o000OoO.this.m18253OooO00o();
        }

        public boolean contains(Object obj) {
            return AbstractC7005o000OoO.this.OooO00o(obj) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return AbstractC7005o000OoO.OooO00o((Map) AbstractC7005o000OoO.this.m18251OooO00o(), collection);
        }

        public boolean equals(Object obj) {
            return AbstractC7005o000OoO.OooO00o((Set) this, obj);
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            for (int OooO00o2 = AbstractC7005o000OoO.this.OooO00o() - 1; OooO00o2 >= 0; OooO00o2--) {
                Object OooO00o3 = AbstractC7005o000OoO.this.OooO00o(OooO00o2, 0);
                if (OooO00o3 == null) {
                    i = 0;
                } else {
                    i = OooO00o3.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public boolean isEmpty() {
            return AbstractC7005o000OoO.this.OooO00o() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new OooO00o(0);
        }

        public boolean remove(Object obj) {
            int OooO00o2 = AbstractC7005o000OoO.this.OooO00o(obj);
            if (OooO00o2 < 0) {
                return false;
            }
            AbstractC7005o000OoO.this.OooO00o(OooO00o2);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return AbstractC7005o000OoO.OooO0O0(AbstractC7005o000OoO.this.m18251OooO00o(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return AbstractC7005o000OoO.OooO0OO(AbstractC7005o000OoO.this.m18251OooO00o(), collection);
        }

        public int size() {
            return AbstractC7005o000OoO.this.OooO00o();
        }

        public Object[] toArray() {
            return AbstractC7005o000OoO.this.m18254OooO00o(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC7005o000OoO.this.OooO00o(tArr, 0);
        }
    }

    /* renamed from: com.pd.sdk.o000OoO$OooO0Oo  reason: case insensitive filesystem */
    public final class C7006OooO0Oo implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public boolean OooO0O0 = false;
        public int o00oO0O;
        public int o0ooOO0;

        public C7006OooO0Oo() {
            this.o00oO0O = AbstractC7005o000OoO.this.OooO00o() - 1;
            this.o0ooOO0 = -1;
        }

        /* renamed from: OooO00o */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.o0ooOO0++;
                this.OooO0O0 = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.OooO0O0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C6976o0000ooO.OooO00o(entry.getKey(), AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0, 0)) || !C6976o0000ooO.OooO00o(entry.getValue(), AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0, 1))) {
                    return false;
                }
                return true;
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.OooO0O0) {
                return (K) AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.OooO0O0) {
                return (V) AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.o0ooOO0 < this.o00oO0O;
        }

        public int hashCode() {
            int i;
            if (this.OooO0O0) {
                int i2 = 0;
                Object OooO00o2 = AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0, 0);
                Object OooO00o3 = AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0, 1);
                if (OooO00o2 == null) {
                    i = 0;
                } else {
                    i = OooO00o2.hashCode();
                }
                if (OooO00o3 != null) {
                    i2 = OooO00o3.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.OooO0O0) {
                AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0);
                this.o0ooOO0--;
                this.o00oO0O--;
                this.OooO0O0 = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.OooO0O0) {
                return (V) AbstractC7005o000OoO.this.OooO00o(this.o0ooOO0, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + C8932ooOOO0o.OooO0Oo + getValue();
        }
    }

    /* renamed from: com.pd.sdk.o000OoO$OooO0o0  reason: case insensitive filesystem */
    public final class C7007OooO0o0 implements Collection<V> {
        public C7007OooO0o0() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            AbstractC7005o000OoO.this.m18253OooO00o();
        }

        public boolean contains(Object obj) {
            return AbstractC7005o000OoO.this.OooO0O0(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return AbstractC7005o000OoO.this.OooO00o() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new OooO00o(1);
        }

        public boolean remove(Object obj) {
            int OooO0O0 = AbstractC7005o000OoO.this.OooO0O0(obj);
            if (OooO0O0 < 0) {
                return false;
            }
            AbstractC7005o000OoO.this.OooO00o(OooO0O0);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int OooO00o2 = AbstractC7005o000OoO.this.OooO00o();
            int i = 0;
            boolean z = false;
            while (i < OooO00o2) {
                if (collection.contains(AbstractC7005o000OoO.this.OooO00o(i, 1))) {
                    AbstractC7005o000OoO.this.OooO00o(i);
                    i--;
                    OooO00o2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int OooO00o2 = AbstractC7005o000OoO.this.OooO00o();
            int i = 0;
            boolean z = false;
            while (i < OooO00o2) {
                if (!collection.contains(AbstractC7005o000OoO.this.OooO00o(i, 1))) {
                    AbstractC7005o000OoO.this.OooO00o(i);
                    i--;
                    OooO00o2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return AbstractC7005o000OoO.this.OooO00o();
        }

        public Object[] toArray() {
            return AbstractC7005o000OoO.this.m18254OooO00o(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC7005o000OoO.this.OooO00o(tArr, 1);
        }
    }

    public static <K, V> boolean OooO00o(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean OooO0O0(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean OooO0OO(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract int OooO00o();

    public abstract int OooO00o(Object obj);

    public abstract Object OooO00o(int i, int i2);

    public abstract V OooO00o(int i, V v);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract Map<K, V> m18251OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract void m18253OooO00o();

    public abstract void OooO00o(int i);

    public abstract void OooO00o(K k, V v);

    public abstract int OooO0O0(Object obj);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object[] m18254OooO00o(int i) {
        int OooO00o2 = OooO00o();
        Object[] objArr = new Object[OooO00o2];
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            objArr[i2] = OooO00o(i2, i);
        }
        return objArr;
    }

    public Set<K> OooO0O0() {
        if (this.f19273OooO00o == null) {
            this.f19273OooO00o = new OooO0OO();
        }
        return this.f19273OooO00o;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] OooO00o(T[] tArr, int i) {
        int OooO00o2 = OooO00o();
        if (tArr.length < OooO00o2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), OooO00o2));
        }
        for (int i2 = 0; i2 < OooO00o2; i2++) {
            tArr[i2] = OooO00o(i2, i);
        }
        if (tArr.length > OooO00o2) {
            tArr[OooO00o2] = null;
        }
        return tArr;
    }

    public static <T> boolean OooO00o(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<Map.Entry<K, V>> m18252OooO00o() {
        if (this.OooO00o == null) {
            this.OooO00o = new OooO0O0();
        }
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<V> m18250OooO00o() {
        if (this.f19274OooO00o == null) {
            this.f19274OooO00o = new C7007OooO0o0();
        }
        return this.f19274OooO00o;
    }
}
