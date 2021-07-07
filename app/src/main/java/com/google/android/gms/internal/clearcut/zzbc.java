package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class zzbc implements Iterator {
    public final int limit = this.zzfl.size();
    public int position = 0;
    public final /* synthetic */ zzbb zzfl;

    public zzbc(zzbb zzbb) {
        this.zzfl = zzbb;
    }

    private final byte nextByte() {
        try {
            zzbb zzbb = this.zzfl;
            int i = this.position;
            this.position = i + 1;
            return zzbb.zzj(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
