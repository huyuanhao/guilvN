package com.qiyukf.nimlib.p155a.p157b.p161d;

import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.C2147d;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2129g;
import com.qiyukf.nimlib.p155a.p162c.p164b.C2137a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p168d.p170b.C2155a;
import com.qiyukf.nimlib.p155a.p168d.p172d.C2161a;
import com.qiyukf.nimlib.p155a.p175f.C2175a;
import com.qiyukf.nimlib.p179d.C2209b;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.nimlib.a.b.d.a */
public final class C2124a extends AbstractC2129g {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0121, code lost:
        if ((r15 != null && r15.supportOffline()) == false) goto L_0x01b2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m4313a(com.qiyukf.nimlib.p183g.p191c.p193b.C2293b r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p155a.p157b.p161d.C2124a.m4313a(com.qiyukf.nimlib.g.c.b.b, boolean):int");
    }

    /* renamed from: a */
    public static void m4314a(byte b, List<Long> list) {
        C2137a aVar = new C2137a();
        aVar.mo34677a(b);
        aVar.mo34679b((byte) 3);
        aVar.mo34678a(list);
        C2130c.m4323a().mo34662a(aVar, C2175a.f4338d);
    }

    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        if (aVar.mo34690b()) {
            int i = 0;
            if (aVar instanceof C2161a) {
                i = 0 + m4313a(((C2161a) aVar).mo34705f(), false);
            } else if (aVar instanceof C2155a) {
                List<C2293b> f = ((C2155a) aVar).mo34698f();
                ArrayList arrayList = new ArrayList();
                for (C2293b bVar : f) {
                    i += m4313a(bVar, true);
                    long c = bVar.mo34957c(6);
                    if (c > 0) {
                        arrayList.add(Long.valueOf(c));
                    }
                }
                m4314a(aVar.mo34688a().mo34947h() == 6 ? (byte) 7 : 101, arrayList);
            }
            if (i > 0) {
                int a = i + C2147d.m4397a();
                C2147d.m4398a(a);
                C2209b.m4596a(a);
            }
        }
    }
}
