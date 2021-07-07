package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzjz<T> implements Iterator<T> {
    public int zzaat = zzkb.zzaax;
    @NullableDecl
    public T zzaau;

    public final boolean hasNext() {
        zzks.checkState(this.zzaat != zzkb.zzaaz);
        int i = zzka.zzaav[this.zzaat - 1];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            this.zzaat = zzkb.zzaaz;
            this.zzaau = zzid();
            if (this.zzaat != zzkb.zzaay) {
                this.zzaat = zzkb.zzaaw;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.zzaat = zzkb.zzaax;
            T t = this.zzaau;
            this.zzaau = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zzid();

    @NullableDecl
    public final T zzie() {
        this.zzaat = zzkb.zzaay;
        return null;
    }
}
