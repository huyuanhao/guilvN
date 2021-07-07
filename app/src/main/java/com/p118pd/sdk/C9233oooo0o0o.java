package com.p118pd.sdk;

import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0o0o  reason: case insensitive filesystem */
public final class C9233oooo0o0o<E> extends AbstractList<E> implements RandomAccess {
    public final List<E> OooO00o;
    public int o00oO0O;
    public int o0ooOO0;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends E> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9233oooo0o0o(@NotNull List<? extends E> list) {
        o0O0OO00.OooO0o(list, C8412oOoo0OoO.OooO0OO);
        this.OooO00o = list;
    }

    public final void OooO00o(int i, int i2) {
        AbstractList.OooO00o.OooO00o(i, i2, this.OooO00o.size());
        this.o00oO0O = i;
        this.o0ooOO0 = i2 - i;
    }

    @Override // java.util.List, kotlin.collections.AbstractList
    public E get(int i) {
        AbstractList.OooO00o.OooO00o(i, this.o0ooOO0);
        return this.OooO00o.get(this.o00oO0O + i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int OooO00o() {
        return this.o0ooOO0;
    }
}
