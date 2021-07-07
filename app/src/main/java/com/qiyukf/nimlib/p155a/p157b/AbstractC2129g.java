package com.qiyukf.nimlib.p155a.p157b;

import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p179d.C2206a;
import com.qiyukf.nimlib.p179d.C2218i;
import java.io.Serializable;

/* renamed from: com.qiyukf.nimlib.a.b.g */
public abstract class AbstractC2129g extends AbstractC2111a {
    /* renamed from: a */
    public static void m4322a(AbstractC2148a aVar, Serializable serializable) {
        AbstractC2131a a = C2130c.m4323a().mo34653a(aVar);
        if (a != null && a.mo34672e() != null && (a.mo34672e() instanceof C2218i)) {
            C2218i iVar = (C2218i) a.mo34672e();
            iVar.mo34825a(aVar.mo34693e());
            iVar.mo34826a(serializable);
            C2206a.m4593c(iVar);
        }
    }
}
