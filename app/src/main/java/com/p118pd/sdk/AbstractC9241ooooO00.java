package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.ooooO00  reason: case insensitive filesystem */
public abstract class AbstractC9241ooooO00 implements Iterator<Short>, O0OO0o {
    @NotNull
    /* renamed from: OooO00o */
    public final Short next() {
        return Short.valueOf(m21129OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract short m21129OooO00o();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
