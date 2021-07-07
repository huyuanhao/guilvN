package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo00OO  reason: case insensitive filesystem */
public abstract class AbstractC9213oooo00OO implements Iterator<Float>, O0OO0o {
    public abstract float OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Float next() {
        return Float.valueOf(OooO00o());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
