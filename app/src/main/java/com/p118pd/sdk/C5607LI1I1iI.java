package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.pd.sdk.LI1I1iI  reason: case insensitive filesystem */
public class C5607LI1I1iI<T> implements AbstractC6271iilI<T>, AbstractC9757IL1i1<T> {
    public Collection<T> OooO00o;

    public C5607LI1I1iI(Collection<T> collection) {
        this.OooO00o = new ArrayList(collection);
    }

    @Override // com.p118pd.sdk.AbstractC6271iilI
    public Collection<T> OooO00o(AbstractC6317ilLi<T> illi) {
        if (illi == null) {
            return new ArrayList(this.OooO00o);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : this.OooO00o) {
            if (illi.OooO00o(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @Override // com.p118pd.sdk.AbstractC9757IL1i1, java.lang.Iterable
    public Iterator<T> iterator() {
        return OooO00o(null).iterator();
    }
}
