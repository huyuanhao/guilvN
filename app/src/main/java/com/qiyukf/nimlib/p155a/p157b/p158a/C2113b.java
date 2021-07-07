package com.qiyukf.nimlib.p155a.p157b.p158a;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2129g;
import com.qiyukf.nimlib.p155a.p162c.p163a.C2134b;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p196i.C2327a;

/* renamed from: com.qiyukf.nimlib.a.b.a.b */
public final class C2113b extends AbstractC2129g {
    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        if (aVar.mo34690b()) {
            C2134b bVar = (C2134b) C2130c.m4323a().mo34653a(aVar);
            int f = bVar.mo34674f();
            String g = bVar.mo34675g();
            if (f == 1) {
                C2327a.m5058a();
                C2327a.m5061a(g);
            }
            C1709a.m3014b("stat", "report stat success, type=" + f + ", md5=" + g);
        }
    }
}
