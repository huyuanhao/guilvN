package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;
import p293rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.lII1l */
public abstract class lII1l<E> extends iLILL<E> {
    public static final long Oooo00o = C11LI1.OooO00o(lII1l.class, "consumerNode");
    public LinkedQueueNode<E> consumerNode;

    public final void OooO0O0(LinkedQueueNode<E> linkedQueueNode) {
        this.consumerNode = linkedQueueNode;
    }

    public final LinkedQueueNode<E> OooO0OO() {
        return this.consumerNode;
    }

    public final LinkedQueueNode<E> OooO0Oo() {
        return (LinkedQueueNode) C11LI1.OooO00o.getObjectVolatile(this, Oooo00o);
    }
}
