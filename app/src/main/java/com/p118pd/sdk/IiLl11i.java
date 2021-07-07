package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.IiLl丨11i  reason: invalid class name */
public class IiLl11i implements AbstractC9757IL1i1<AbstractC6832lIi> {
    public final List OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map f15726OooO00o = new HashMap();

    public IiLl11i(AbstractC6832lIi r3) {
        ArrayList arrayList = new ArrayList(1);
        this.OooO00o = arrayList;
        arrayList.add(r3);
        this.f15726OooO00o.put(r3.m17967OooO00o(), this.OooO00o);
    }

    public IiLl11i(Collection<AbstractC6832lIi> collection) {
        for (AbstractC6832lIi r1 : collection) {
            iilI1iI OooO00o2 = r1.m17967OooO00o();
            ArrayList arrayList = (ArrayList) this.f15726OooO00o.get(OooO00o2);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f15726OooO00o.put(OooO00o2, arrayList);
            }
            arrayList.add(r1);
        }
        this.OooO00o = new ArrayList(collection);
    }

    public AbstractC6832lIi OooO00o(iilI1iI r2) {
        Collection<AbstractC6799ll> OooO00o2 = m15609OooO00o(r2);
        if (OooO00o2.size() == 0) {
            return null;
        }
        return (AbstractC6832lIi) OooO00o2.iterator().next();
    }

    public Collection<AbstractC6832lIi> OooO00o() {
        return new ArrayList(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection<AbstractC6799ll> m15609OooO00o(iilI1iI r5) {
        if (r5 instanceof C9610iLl1) {
            C9610iLl1 r0 = (C9610iLl1) r5;
            l1LILI1 OooO00o2 = r0.OooO00o();
            byte[] OooO00o3 = r0.m21668OooO00o();
            if (!(OooO00o2 == null || OooO00o3 == null)) {
                ArrayList arrayList = new ArrayList();
                Collection<AbstractC6799ll> OooO00o4 = m15609OooO00o((iilI1iI) new C9610iLl1(OooO00o2, r0.m21667OooO00o()));
                if (OooO00o4 != null) {
                    arrayList.addAll(OooO00o4);
                }
                Collection<AbstractC6799ll> OooO00o5 = m15609OooO00o((iilI1iI) new C9610iLl1(OooO00o3));
                if (OooO00o5 != null) {
                    arrayList.addAll(OooO00o5);
                }
                return arrayList;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f15726OooO00o.get(r5);
        return arrayList2 == null ? new ArrayList() : new ArrayList(arrayList2);
    }

    @Override // com.p118pd.sdk.AbstractC9757IL1i1, java.lang.Iterable
    public Iterator<AbstractC6832lIi> iterator() {
        return OooO00o().iterator();
    }

    public int size() {
        return this.OooO00o.size();
    }
}
