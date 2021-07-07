package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;
import p293rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.IIll1LI */
public abstract class IIll1LI<E> extends Li1111<E> {
    public static final long OooOOo0 = C11LI1.OooO00o(IIll1LI.class, "producerNode");
    public LinkedQueueNode<E> producerNode;

    public final void OooO00o(LinkedQueueNode<E> linkedQueueNode) {
        this.producerNode = linkedQueueNode;
    }

    public final LinkedQueueNode<E> OooO0O0() {
        return (LinkedQueueNode) C11LI1.OooO00o.getObjectVolatile(this, OooOOo0);
    }

    public final LinkedQueueNode<E> OooO00o() {
        return this.producerNode;
    }
}
