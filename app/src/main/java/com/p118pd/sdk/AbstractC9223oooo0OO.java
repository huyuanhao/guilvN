package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0OO  reason: case insensitive filesystem */
public abstract class AbstractC9223oooo0OO implements Iterator<Long>, O0OO0o {
    public abstract long OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Long next() {
        return Long.valueOf(OooO00o());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
