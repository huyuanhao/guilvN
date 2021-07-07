package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;
import p293rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.II丨lL  reason: invalid class name and case insensitive filesystem */
public final class C5243IIlL<E> extends AbstractC6621lLlli<E> {
    public C5243IIlL() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        this.consumerNode = linkedQueueNode;
        OooO00o((LinkedQueueNode) linkedQueueNode);
    }

    @Override // com.p118pd.sdk.IIll1LI
    public LinkedQueueNode<E> OooO00o(LinkedQueueNode<E> linkedQueueNode) {
        LinkedQueueNode<E> linkedQueueNode2;
        do {
            linkedQueueNode2 = this.producerNode;
        } while (!C11LI1.OooO00o.compareAndSwapObject(this, IIll1LI.OooOOo0, linkedQueueNode2, linkedQueueNode));
        return linkedQueueNode2;
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
        LinkedQueueNode<E> linkedQueueNode = this.consumerNode;
        LinkedQueueNode<E> lvNext2 = linkedQueueNode.lvNext();
        if (lvNext2 != null) {
            return lvNext2.lpValue();
        }
        if (linkedQueueNode == OooO0O0()) {
            return null;
        }
        do {
            lvNext = linkedQueueNode.lvNext();
        } while (lvNext == null);
        return lvNext.lpValue();
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> OooO0OO = OooO0OO();
        LinkedQueueNode<E> lvNext2 = OooO0OO.lvNext();
        if (lvNext2 != null) {
            E andNullValue = lvNext2.getAndNullValue();
            OooO0O0(lvNext2);
            return andNullValue;
        } else if (OooO0OO == OooO0O0()) {
            return null;
        } else {
            do {
                lvNext = OooO0OO.lvNext();
            } while (lvNext == null);
            E andNullValue2 = lvNext.getAndNullValue();
            this.consumerNode = lvNext;
            return andNullValue2;
        }
    }
}
