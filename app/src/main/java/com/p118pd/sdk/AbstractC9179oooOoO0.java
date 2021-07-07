package com.p118pd.sdk;

import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.1")
/* renamed from: com.pd.sdk.oooOoO0  reason: case insensitive filesystem */
public abstract class AbstractC9179oooOoO0<E> extends AbstractCollection<E> implements Collection<E>, O0OO0O0 {
    public abstract int OooO00o();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    public final /* bridge */ int size() {
        return OooO00o();
    }
}
