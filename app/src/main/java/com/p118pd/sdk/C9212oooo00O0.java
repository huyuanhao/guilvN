package com.p118pd.sdk;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo00O0  reason: case insensitive filesystem */
public final class C9212oooo00O0 implements ListIterator, O0OO0o {
    public static final C9212oooo00O0 OooO00o = new C9212oooo00O0();

    @NotNull
    /* renamed from: OooO00o */
    public Void next() {
        throw new NoSuchElementException();
    }

    public void OooO00o(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    /* renamed from: OooO0O0 */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public void OooO0O0(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
