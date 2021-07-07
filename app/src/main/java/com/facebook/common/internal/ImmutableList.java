package com.facebook.common.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList<E> extends ArrayList<E> {
    public ImmutableList(int i) {
        super(i);
    }

    public static <E> ImmutableList<E> copyOf(List<E> list) {
        return new ImmutableList<>(list);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m843of(E... eArr) {
        ImmutableList<E> immutableList = new ImmutableList<>(eArr.length);
        Collections.addAll(immutableList, eArr);
        return immutableList;
    }

    public ImmutableList(List<E> list) {
        super(list);
    }
}
