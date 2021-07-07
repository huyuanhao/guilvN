package com.p118pd.sdk;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0O0O  reason: case insensitive filesystem */
public final class C9221oooo0O0O<T> implements Iterable<C9219oooo0O0<? extends T>>, O0OO0o {
    public final O00O0000<Iterator<T>> OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.O00O0000<? extends java.util.Iterator<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9221oooo0O0O(@NotNull O00O0000<? extends Iterator<? extends T>> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "iteratorFactory");
        this.OooO00o = o00o0000;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<C9219oooo0O0<T>> iterator() {
        return new C9222oooo0O0o(this.OooO00o.invoke());
    }
}
