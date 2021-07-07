package com.p118pd.sdk;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0O0o  reason: case insensitive filesystem */
public final class C9222oooo0O0o<T> implements Iterator<C9219oooo0O0<? extends T>>, O0OO0o {
    public final Iterator<T> OooO00o;
    public int o00oO0O;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9222oooo0O0o(@NotNull Iterator<? extends T> it) {
        o0O0OO00.OooO0o(it, "iterator");
        this.OooO00o = it;
    }

    @NotNull
    /* renamed from: OooO00o */
    public final C9219oooo0O0<T> next() {
        int i = this.o00oO0O;
        this.o00oO0O = i + 1;
        if (i < 0) {
            CollectionsKt__CollectionsKt.m22701OooO0O0();
        }
        return new C9219oooo0O0<>(i, this.OooO00o.next());
    }

    public final boolean hasNext() {
        return this.OooO00o.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
