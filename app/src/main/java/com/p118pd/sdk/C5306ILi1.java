package com.p118pd.sdk;

import p293rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: com.pd.sdk.ILi1丨  reason: invalid class name and case insensitive filesystem */
public final class C5306ILi1<E> extends AbstractC6621lLlli<E> {
    public C5306ILi1() {
        OooO00o(new LinkedQueueNode<>());
        OooO0O0(this.producerNode);
        this.consumerNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
            this.producerNode.soNext(linkedQueueNode);
            this.producerNode = linkedQueueNode;
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> lvNext = this.consumerNode.lvNext();
        if (lvNext != null) {
            return lvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> lvNext = this.consumerNode.lvNext();
        if (lvNext == null) {
            return null;
        }
        E andNullValue = lvNext.getAndNullValue();
        this.consumerNode = lvNext;
        return andNullValue;
    }
}
