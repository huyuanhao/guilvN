package com.qiyukf.nimlib.p183g.p184a.p185a;

import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.C2147d;
import com.qiyukf.nimlib.p155a.p156a.C2108a;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2111a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p183g.C2307f;
import com.qiyukf.nimlib.p183g.C2312g;
import com.qiyukf.nimlib.p183g.p184a.p186b.C2257e;
import com.qiyukf.nimlib.p183g.p184a.p187c.C2259b;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.sdk.StatusCode;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nimlib.g.a.a.b */
public class C2249b extends AbstractC2111a {

    /* renamed from: a */
    public static final String f4486a = "b";

    /* renamed from: b */
    public final boolean f4487b;

    public C2249b(boolean z) {
        this.f4487b = z;
    }

    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        if (this.f4487b) {
            C2259b bVar = (C2259b) aVar;
            if (C2205d.m4582e() == StatusCode.LOGINING) {
                C2307f.m4934a().mo34990a(bVar.mo34693e());
                if (bVar.mo34690b()) {
                    C2147d.m4399a(bVar.mo34885f().mo34953a(103));
                    C2293b bVar2 = new C2293b();
                    bVar2.mo34954a(C2108a.EnumC2109a.UNREAD_MESSAGE.mo34638a(), 0);
                    bVar2.mo34954a(C2108a.EnumC2109a.YSF_UNREAD_MSG.mo34638a(), 0);
                    C2257e eVar = new C2257e();
                    eVar.mo34881a(bVar2);
                    C2307f.m4934a().mo34993a(eVar);
                }
                ArrayList<C2107a> g = bVar.mo34886g();
                if (g == null || g.size() <= 0) {
                    C2312g.m4953a();
                } else {
                    C2312g.m4954a(g);
                }
            }
        } else {
            C2130c.m4323a().mo34660a(aVar.mo34693e());
        }
    }
}
