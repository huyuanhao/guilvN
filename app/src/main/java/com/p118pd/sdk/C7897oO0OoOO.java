package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.pd.sdk.oO0OoOO  reason: case insensitive filesystem */
public class C7897oO0OoOO {
    public static <E> List<E> OooO00o(Iterable<E> iterable) {
        ArrayList arrayList = new ArrayList();
        for (E e : iterable) {
            arrayList.add(e);
        }
        return arrayList;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <E> Set<E> m19578OooO00o(Iterable<E> iterable) {
        HashSet hashSet = new HashSet();
        for (E e : iterable) {
            hashSet.add(e);
        }
        return hashSet;
    }
}
