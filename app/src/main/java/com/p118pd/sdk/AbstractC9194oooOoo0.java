package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooOoo0  reason: case insensitive filesystem */
public abstract class AbstractC9194oooOoo0 implements Iterator<Boolean>, O0OO0o {
    @NotNull
    /* renamed from: OooO00o */
    public final Boolean next() {
        return Boolean.valueOf(m21068OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m21068OooO00o();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
