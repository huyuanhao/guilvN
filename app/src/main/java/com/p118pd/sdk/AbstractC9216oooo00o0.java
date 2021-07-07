package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo00o0  reason: case insensitive filesystem */
public abstract class AbstractC9216oooo00o0 implements Iterator<Double>, O0OO0o {
    public abstract double OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Double next() {
        return Double.valueOf(OooO00o());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
