package com.qiyukf.nimlib.p155a.p157b.p160c;

import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2129g;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.p171c.C2160b;
import com.qiyukf.nimlib.p183g.C2312g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.b.c.a */
public final class C2122a extends AbstractC2129g {
    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        C2160b bVar = (C2160b) aVar;
        if (bVar.mo34690b() && bVar.mo34704f().size() > 0) {
            ArrayList arrayList = new ArrayList(bVar.mo34704f().size());
            for (String str : bVar.mo34704f()) {
                C2107a aVar2 = new C2107a();
                aVar2.mo34632a(str);
                arrayList.add(aVar2);
            }
            C2312g.m4955a((List<C2107a>) arrayList);
        }
        AbstractC2129g.m4322a(aVar, null);
    }
}
