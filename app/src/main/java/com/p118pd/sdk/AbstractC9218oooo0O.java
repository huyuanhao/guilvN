package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0O  reason: case insensitive filesystem */
public abstract class AbstractC9218oooo0O implements Iterator<Integer>, O0OO0o {
    public abstract int OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Integer next() {
        return Integer.valueOf(OooO00o());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
