package com.megvii.meglive_sdk.volley.p107a.p112d;

import com.megvii.meglive_sdk.volley.p107a.AbstractC1594a;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1598c;
import com.megvii.meglive_sdk.volley.p107a.p113e.AbstractC1609a;
import java.util.List;

/* renamed from: com.megvii.meglive_sdk.volley.a.d.a */
public abstract class AbstractC1602a implements AbstractC1598c {

    /* renamed from: a */
    public C1607f f2829a;
    @Deprecated

    /* renamed from: b */
    public AbstractC1609a f2830b;

    @Deprecated
    public AbstractC1602a() {
        this.f2829a = new C1607f();
        this.f2830b = null;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1598c
    /* renamed from: a */
    public final AbstractC1594a[] mo17302a() {
        List<AbstractC1594a> list = this.f2829a.f2845a;
        return (AbstractC1594a[]) list.toArray(new AbstractC1594a[list.size()]);
    }

    /* renamed from: a */
    public final void mo17308a(AbstractC1594a aVar) {
        this.f2829a.f2845a.add(aVar);
    }

    public AbstractC1602a(byte b) {
        this();
    }
}
