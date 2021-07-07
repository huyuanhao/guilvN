package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.State;

/* renamed from: com.pd.sdk.oooOo  reason: case insensitive filesystem */
public abstract class AbstractC9176oooOo<T> implements Iterator<T>, O0OO0o {
    public T OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public State f22631OooO00o = State.NotReady;

    private final boolean OooO00o() {
        this.f22631OooO00o = State.Failed;
        OooO0OO();
        return this.f22631OooO00o == State.Ready;
    }

    public abstract void OooO0OO();

    public final void OooO0Oo() {
        this.f22631OooO00o = State.Done;
    }

    public boolean hasNext() {
        if (this.f22631OooO00o != State.Failed) {
            int i = C9177oooOo00.OooO00o[this.f22631OooO00o.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return OooO00o();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f22631OooO00o = State.NotReady;
            return this.OooO00o;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void OooO00o(T t) {
        this.OooO00o = t;
        this.f22631OooO00o = State.Ready;
    }
}
