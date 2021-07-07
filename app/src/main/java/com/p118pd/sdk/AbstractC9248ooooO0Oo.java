package com.p118pd.sdk;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.ooooO0Oo  reason: case insensitive filesystem */
public abstract class AbstractC9248ooooO0Oo implements Iterator<UShort>, O0OO0o {
    @NotNull
    /* renamed from: OooO00o */
    public final UShort next() {
        return UShort.OooO00o(m21148OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract short m21148OooO00o();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
