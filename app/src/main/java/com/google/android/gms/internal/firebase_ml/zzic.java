package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class zzic implements Iterator<T> {
    public int index = 0;
    public final int length = Array.getLength(this.zzaag.zzaaf);
    public final /* synthetic */ zzib zzaag;

    public zzic(zzib zzib) {
        this.zzaag = zzib;
    }

    public final boolean hasNext() {
        return this.index < this.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            Object obj = this.zzaag.zzaaf;
            int i = this.index;
            this.index = i + 1;
            return (T) Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
