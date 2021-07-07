package com.google.android.gms.internal.firebase_ml;

import java.util.NoSuchElementException;

public abstract class zzlc<E> extends zzlu<E> {
    public int position;
    public final int size;

    public zzlc(int i, int i2) {
        zzks.zzc(i2, i);
        this.size = i;
        this.position = i2;
    }

    public abstract E get(int i);

    public final boolean hasNext() {
        return this.position < this.size;
    }

    public final boolean hasPrevious() {
        return this.position > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.position;
            this.position = i + 1;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.position;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.position - 1;
            this.position = i;
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.position - 1;
    }
}
