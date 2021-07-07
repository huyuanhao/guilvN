package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class zzwm implements Iterator<Object> {
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
