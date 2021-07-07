package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.L1L丨1ll  reason: invalid class name */
public class L1L1ll implements AbstractC9757IL1i1<C5510IIl> {
    public List OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f16186OooO00o = new HashMap();

    public L1L1ll(C5510IIl r3) {
        ArrayList arrayList = new ArrayList(1);
        this.OooO00o = arrayList;
        arrayList.add(r3);
        this.f16186OooO00o.put(r3.m15762OooO00o(), this.OooO00o);
    }

    public L1L1ll(Collection<C5510IIl> collection) {
        for (C5510IIl r1 : collection) {
            C1679L1 OooO00o2 = r1.m15762OooO00o();
            ArrayList arrayList = (ArrayList) this.f16186OooO00o.get(OooO00o2);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f16186OooO00o.put(OooO00o2, arrayList);
            }
            arrayList.add(r1);
        }
        this.OooO00o = new ArrayList(collection);
    }

    public C5510IIl OooO00o(C1679L1 l1) {
        Collection<C5510IIl> OooO00o2 = m15959OooO00o(l1);
        if (OooO00o2.size() == 0) {
            return null;
        }
        return OooO00o2.iterator().next();
    }

    public Collection<C5510IIl> OooO00o() {
        return new ArrayList(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<C5510IIl> m15959OooO00o(C1679L1 l1) {
        if (l1.OooO00o() == null || l1.m15875OooO00o() == null) {
            ArrayList arrayList = (ArrayList) this.f16186OooO00o.get(l1);
            return arrayList == null ? new ArrayList() : new ArrayList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Collection<C5510IIl> OooO00o2 = m15959OooO00o(new C1679L1(l1.OooO00o(), l1.m15874OooO00o()));
        if (OooO00o2 != null) {
            arrayList2.addAll(OooO00o2);
        }
        Collection<C5510IIl> OooO00o3 = m15959OooO00o(new C1679L1(l1.m15875OooO00o()));
        if (OooO00o3 != null) {
            arrayList2.addAll(OooO00o3);
        }
        return arrayList2;
    }

    @Override // com.p118pd.sdk.AbstractC9757IL1i1, java.lang.Iterable
    public Iterator<C5510IIl> iterator() {
        return OooO00o().iterator();
    }

    public int size() {
        return this.OooO00o.size();
    }
}
