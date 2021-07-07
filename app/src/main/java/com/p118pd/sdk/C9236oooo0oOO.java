package com.p118pd.sdk;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0oOO  reason: case insensitive filesystem */
public class C9236oooo0oOO<T> extends AbstractList<T> {
    public final List<T> OooO00o;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9236oooo0oOO(@NotNull List<? extends T> list) {
        o0O0OO00.OooO0o(list, "delegate");
        this.OooO00o = list;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int OooO00o() {
        return this.OooO00o.size();
    }

    @Override // java.util.List, kotlin.collections.AbstractList
    public T get(int i) {
        return this.OooO00o.get(C9211oooo000o.OooO0OO(this, i));
    }
}
