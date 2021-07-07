package com.p118pd.sdk;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.oooo0oO  reason: case insensitive filesystem */
public final class C9234oooo0oO<T> extends AbstractC9181oooOoO0O<T> {
    public final List<T> OooO00o;

    public C9234oooo0oO(@NotNull List<T> list) {
        o0O0OO00.OooO0o(list, "delegate");
        this.OooO00o = list;
    }

    @Override // com.p118pd.sdk.AbstractC9181oooOoO0O
    public int OooO00o() {
        return this.OooO00o.size();
    }

    @Override // java.util.List, com.p118pd.sdk.AbstractC9181oooOoO0O, java.util.AbstractList
    public void add(int i, T t) {
        this.OooO00o.add(C9211oooo000o.OooO0Oo(this, i), t);
    }

    public void clear() {
        this.OooO00o.clear();
    }

    @Override // java.util.List, java.util.AbstractList
    public T get(int i) {
        return this.OooO00o.get(C9211oooo000o.OooO0OO(this, i));
    }

    @Override // java.util.List, com.p118pd.sdk.AbstractC9181oooOoO0O, java.util.AbstractList
    public T set(int i, T t) {
        return this.OooO00o.set(C9211oooo000o.OooO0OO(this, i), t);
    }

    @Override // com.p118pd.sdk.AbstractC9181oooOoO0O
    public T OooO00o(int i) {
        return this.OooO00o.remove(C9211oooo000o.OooO0OO(this, i));
    }
}
