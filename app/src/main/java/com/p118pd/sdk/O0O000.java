package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O000 */
public final class O0O000<T> implements Iterator<T>, O0OO0o {
    @NotNull
    public final T[] OooO00o;
    public int o00oO0O;

    public O0O000(@NotNull T[] tArr) {
        o0O0OO00.OooO0o(tArr, "array");
        this.OooO00o = tArr;
    }

    @NotNull
    public final T[] OooO00o() {
        return this.OooO00o;
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
