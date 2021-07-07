package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOoo0O  reason: case insensitive filesystem */
public abstract class AbstractC9196oooOoo0O implements Iterator<Byte>, O0OO0o {
    @NotNull
    /* renamed from: OooO00o */
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }

    public abstract byte nextByte();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
