package com.qiyukf.nimlib.p155a.p157b.p159b;

import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2129g;
import com.qiyukf.nimlib.p155a.p162c.p164b.C2137a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.p170b.C2157b;
import com.qiyukf.nimlib.p155a.p175f.C2175a;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.p195h.C2313a;
import com.qiyukf.nimlib.p195h.C2315c;
import com.qiyukf.nimlib.p195h.C2323f;
import com.qiyukf.nimlib.p195h.C2324g;
import com.qiyukf.nimlib.p195h.C2326h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.b.b.a */
public final class C2120a extends AbstractC2129g {
    /* renamed from: a */
    public static void m4297a(C2157b bVar) {
        List<C2293b> f = bVar.mo34700f();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C2293b bVar2 : f) {
            long c = bVar2.mo34957c(12);
            int b = bVar2.mo34956b(0);
            if (b == 2) {
                arrayList2.add(Long.valueOf(c));
            } else if (b == 0) {
                arrayList.add(Long.valueOf(c));
            } else if (b == 1) {
                String a = bVar2.mo34953a(1);
                Long l = (Long) hashMap.get(a);
                if (l == null || l.longValue() < c) {
                    hashMap.put(a, Long.valueOf(c));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C2137a aVar = new C2137a();
            aVar.mo34677a((byte) 7);
            aVar.mo34679b((byte) 2);
            aVar.mo34678a((List<Long>) arrayList);
            C2130c.m4323a().mo34662a(aVar, C2175a.f4338d);
        }
        if (!hashMap.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(hashMap.values());
            C2137a aVar2 = new C2137a();
            aVar2.mo34677a((byte) 8);
            aVar2.mo34679b((byte) 3);
            aVar2.mo34678a((List<Long>) arrayList3);
            C2130c.m4323a().mo34662a(aVar2, C2175a.f4338d);
        }
        if (!arrayList2.isEmpty()) {
            C2137a aVar3 = new C2137a();
            aVar3.mo34677a((byte) 101);
            aVar3.mo34679b((byte) 2);
            aVar3.mo34678a((List<Long>) arrayList2);
            C2130c.m4323a().mo34662a(aVar3, C2175a.f4338d);
        }
    }

    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        C2326h hVar;
        if (aVar.mo34690b()) {
            boolean z = aVar.mo34692d() == 4 || aVar.mo34692d() == 100;
            C2157b bVar = (C2157b) aVar;
            List<C2293b> f = bVar.mo34700f();
            boolean z2 = aVar.mo34688a().mo34947h() == 100;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet(f.size());
            for (C2293b bVar2 : f) {
                if (!hashSet.contains(bVar2.mo34953a(11))) {
                    bVar2.mo34954a(13, 1);
                    if (z2) {
                        bVar2.mo34954a(0, 2);
                    }
                    C2313a a = C2315c.m4982a(bVar2, false);
                    if (a != null) {
                        String a2 = C2315c.m4984a(bVar2);
                        ArrayList arrayList2 = (ArrayList) hashMap.get(a2);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            hashMap.put(a2, arrayList2);
                        }
                        arrayList2.add(a);
                        hashSet.add(a.getUuid());
                        hashMap2.put(a2, bVar2.mo34953a(6));
                        arrayList.add(a);
                    }
                }
            }
            C2323f.m5031a(arrayList);
            ArrayList arrayList3 = new ArrayList();
            for (String str : hashMap.keySet()) {
                ArrayList arrayList4 = (ArrayList) hashMap.get(str);
                if (z) {
                    hVar = C2315c.m4983a(arrayList4, (String) hashMap2.get(str));
                } else {
                    C2315c.m4988a(arrayList4);
                    hVar = C2324g.m5037a((C2313a) arrayList4.get(arrayList4.size() - 1));
                }
                if (hVar != null) {
                    arrayList3.add(hVar);
                }
            }
            C2209b.m4603b(arrayList3);
            if (z) {
                m4297a(bVar);
            }
        }
    }
}
