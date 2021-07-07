package com.p118pd.sdk;

import p293rx.internal.util.atomic.LinkedQueueNode;

/* renamed from: com.pd.sdk.iII丨iLL  reason: invalid class name and case insensitive filesystem */
public final class C6089iIIiLL<E> extends AbstractC9440IL1I<E> {
    public C6089iIIiLL() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        OooO0O0(linkedQueueNode);
        m21480OooO00o((LinkedQueueNode) linkedQueueNode);
        linkedQueueNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
            OooO0O0().soNext(linkedQueueNode);
            OooO0O0(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> lvNext = OooO00o().lvNext();
        if (lvNext != null) {
            return lvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> lvNext = OooO00o().lvNext();
        if (lvNext == null) {
            return null;
        }
        E andNullValue = lvNext.getAndNullValue();
        m21480OooO00o((LinkedQueueNode) lvNext);
        return andNullValue;
    }
}
