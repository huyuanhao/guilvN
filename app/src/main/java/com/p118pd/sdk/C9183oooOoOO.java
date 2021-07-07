package com.p118pd.sdk;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOoOO  reason: case insensitive filesystem */
public final class C9183oooOoOO<T> implements Collection<T>, O0OO0o {
    @NotNull
    public final T[] OooO00o;
    public final boolean OooO0O0;

    public C9183oooOoOO(@NotNull T[] tArr, boolean z) {
        o0O0OO00.OooO0o(tArr, "values");
        this.OooO00o = tArr;
        this.OooO0O0 = z;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final T[] m20979OooO00o() {
        return this.OooO00o;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return ArraysKt___ArraysKt.m22311OooO00o((Object[]) this.OooO00o, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        o0O0OO00.OooO0o(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.OooO00o.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return O0O0000.OooO00o(this.OooO00o);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return OooO00o();
    }

    @NotNull
    public final Object[] toArray() {
        return C9201oooOooOo.OooO00o(this.OooO00o, this.OooO0O0);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C7275o0O00OOo.OooO00o(this, tArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m20978OooO00o() {
        return this.OooO0O0;
    }

    public int OooO00o() {
        return this.OooO00o.length;
    }
}
