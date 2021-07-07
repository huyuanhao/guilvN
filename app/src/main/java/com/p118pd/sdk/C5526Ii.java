package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.I丨i  reason: invalid class name and case insensitive filesystem */
public class C5526Ii implements AbstractC6271iilI {
    public final Map OooO00o;

    public C5526Ii(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9469L11iL r1 = (C9469L11iL) it.next();
            hashMap.put(r1.OooO00o(), r1);
        }
        this.OooO00o = Collections.unmodifiableMap(hashMap);
    }

    public AbstractC6271iilI OooO00o() {
        Collection<C9469L11iL> OooO00o2 = OooO00o(null);
        ArrayList arrayList = new ArrayList(OooO00o2.size());
        for (C9469L11iL r2 : OooO00o2) {
            arrayList.add(r2.m21520OooO00o());
        }
        return new C5607LI1I1iI(arrayList);
    }

    @Override // com.p118pd.sdk.AbstractC6271iilI
    public Collection OooO00o(AbstractC6317ilLi illi) throws StoreException {
        if (illi == null) {
            return this.OooO00o.values();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.OooO00o.values()) {
            if (illi.OooO00o(obj)) {
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
