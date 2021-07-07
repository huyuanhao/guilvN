package com.qiyukf.nimlib.p155a.p157b.p158a;

import com.qiyukf.basesdk.p120b.p121a.p123b.C1735a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1747d;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2129g;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.p169a.C2150a;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nimlib.a.b.a.a */
public final class C2112a extends AbstractC2129g {
    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar.mo34690b()) {
            for (C2293b bVar : ((C2150a) aVar).mo34694f()) {
                C1747d dVar = new C1747d();
                dVar.mo33937b(bVar.mo34953a(3));
                dVar.mo33935a(bVar.mo34953a(2));
                dVar.mo33939c(bVar.mo34953a(1));
                dVar.mo33934a(bVar.mo34956b(4));
                arrayList.add(dVar);
            }
        }
        C1735a.m3113a().mo33912a(arrayList);
    }
}
