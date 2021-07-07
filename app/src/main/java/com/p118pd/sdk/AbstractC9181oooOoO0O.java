package com.p118pd.sdk;

import java.util.AbstractList;
import java.util.List;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.1")
/* renamed from: com.pd.sdk.oooOoO0O  reason: case insensitive filesystem */
public abstract class AbstractC9181oooOoO0O<E> extends AbstractList<E> implements List<E>, O0OO0OO {
    public abstract int OooO00o();

    public abstract E OooO00o(int i);

    @Override // java.util.List, java.util.AbstractList
    public abstract void add(int i, E e);

    @Override // java.util.List, java.util.AbstractList
    public final /* bridge */ E remove(int i) {
        return OooO00o(i);
    }

    @Override // java.util.List, java.util.AbstractList
    public abstract E set(int i, E e);

    public final /* bridge */ int size() {
        return OooO00o();
    }
}
