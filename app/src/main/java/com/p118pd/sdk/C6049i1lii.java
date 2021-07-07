package com.p118pd.sdk;

import p293rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: com.pd.sdk.i1lii  reason: case insensitive filesystem */
public final class C6049i1lii<E> extends AbstractC9440IL1I<E> {
    public C6049i1lii() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        m21480OooO00o((LinkedQueueNode) linkedQueueNode);
        OooO00o((LinkedQueueNode) linkedQueueNode);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
            OooO00o((LinkedQueueNode) linkedQueueNode).soNext(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> OooO00o = OooO00o();
        LinkedQueueNode<E> lvNext2 = OooO00o.lvNext();
        if (lvNext2 != null) {
            return lvNext2.lpValue();
        }
        if (OooO00o == OooO0Oo()) {
            return null;
        }
        do {
            lvNext = OooO00o.lvNext();
        } while (lvNext == null);
        return lvNext.lpValue();
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> OooO00o = OooO00o();
        LinkedQueueNode<E> lvNext2 = OooO00o.lvNext();
        if (lvNext2 != null) {
            E andNullValue = lvNext2.getAndNullValue();
            m21480OooO00o((LinkedQueueNode) lvNext2);
            return andNullValue;
        } else if (OooO00o == OooO0Oo()) {
            return null;
        } else {
            do {
                lvNext = OooO00o.lvNext();
            } while (lvNext == null);
            E andNullValue2 = lvNext.getAndNullValue();
            m21480OooO00o((LinkedQueueNode) lvNext);
            return andNullValue2;
        }
    }
}
