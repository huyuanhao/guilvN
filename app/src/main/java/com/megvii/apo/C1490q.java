package com.megvii.apo;

import android.content.Context;
import java.util.Map;

/* renamed from: com.megvii.apo.q */
public final class C1490q extends AbstractC1486m {

    /* renamed from: c */
    public C1487n f2010c;

    /* renamed from: d */
    public C1484k f2011d;

    /* renamed from: e */
    public C1483j f2012e;

    public C1490q(Context context) {
        super(context);
        this.f2010c = new C1487n(context);
        this.f2011d = new C1484k(context);
        this.f2012e = new C1483j(context);
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        this.f2010c.mo16948a(map);
        this.f2011d.mo16948a(map);
        this.f2012e.mo16948a(map);
    }
}
