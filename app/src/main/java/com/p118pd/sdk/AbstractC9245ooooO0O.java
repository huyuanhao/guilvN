package com.p118pd.sdk;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.ooooO0O  reason: case insensitive filesystem */
public abstract class AbstractC9245ooooO0O implements Iterator<UInt>, O0OO0o {
    public abstract int OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final UInt next() {
        return UInt.OooO00o(OooO00o());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
