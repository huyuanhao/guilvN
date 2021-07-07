package com.p118pd.sdk;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: com.pd.sdk.丨I丨L1I  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9440IL1I<E> extends AbstractQueue<E> {
    public final AtomicReference<LinkedQueueNode<E>> OooO00o = new AtomicReference<>();
    public final AtomicReference<LinkedQueueNode<E>> OooO0O0 = new AtomicReference<>();

    public final LinkedQueueNode<E> OooO00o(LinkedQueueNode<E> linkedQueueNode) {
        return this.OooO00o.getAndSet(linkedQueueNode);
    }

    public final LinkedQueueNode<E> OooO0O0() {
        return this.OooO00o.get();
    }

    public final LinkedQueueNode<E> OooO0OO() {
        return this.OooO0O0.get();
    }

    public final LinkedQueueNode<E> OooO0Oo() {
        return this.OooO00o.get();
    }

    public final boolean isEmpty() {
        return OooO0OO() == OooO0Oo();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> OooO0OO = OooO0OO();
        LinkedQueueNode<E> OooO0Oo = OooO0Oo();
        int i = 0;
        while (OooO0OO != OooO0Oo && i < Integer.MAX_VALUE) {
            do {
                lvNext = OooO0OO.lvNext();
            } while (lvNext == null);
            i++;
            OooO0OO = lvNext;
        }
        return i;
    }

    public final LinkedQueueNode<E> OooO00o() {
        return this.OooO0O0.get();
    }

    public final void OooO0O0(LinkedQueueNode<E> linkedQueueNode) {
        this.OooO00o.lazySet(linkedQueueNode);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m21480OooO00o(LinkedQueueNode<E> linkedQueueNode) {
        this.OooO0O0.lazySet(linkedQueueNode);
    }
}
