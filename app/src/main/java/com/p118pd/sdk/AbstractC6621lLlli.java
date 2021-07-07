package com.p118pd.sdk;

import java.util.Iterator;
import p293rx.internal.util.SuppressAnimalSniffer;
import p293rx.internal.util.atomic.LinkedQueueNode;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.lLlli丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6621lLlli<E> extends lII1l<E> {
    public long Oooo;
    public long Oooo0;
    public long Oooo0O0;
    public long Oooo0OO;
    public long Oooo0o;
    public long Oooo0o0;
    public long Oooo0oO;
    public long Oooo0oo;
    public long OoooO;
    public long OoooO0;
    public long OoooO00;
    public long OoooO0O;
    public long OoooOO0;
    public long OoooOOO;
    public long OoooOOo;
    public long o000oOoO;

    public final boolean isEmpty() {
        return OooO0Oo() == OooO0O0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> OooO0Oo = OooO0Oo();
        LinkedQueueNode<E> OooO0O0 = OooO0O0();
        int i = 0;
        while (OooO0Oo != OooO0O0 && i < Integer.MAX_VALUE) {
            do {
                lvNext = OooO0Oo.lvNext();
            } while (lvNext == null);
            i++;
            OooO0Oo = lvNext;
        }
        return i;
    }
}
