package com.p118pd.sdk;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.ooooO0OO  reason: case insensitive filesystem */
public abstract class AbstractC9247ooooO0OO implements Iterator<ULong>, O0OO0o {
    public abstract long OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final ULong next() {
        return ULong.OooO00o(OooO00o());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
