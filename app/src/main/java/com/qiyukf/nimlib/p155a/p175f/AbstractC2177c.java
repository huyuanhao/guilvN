package com.qiyukf.nimlib.p155a.p175f;

import com.qiyukf.basesdk.sdk.ResponseCode;
import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;

/* renamed from: com.qiyukf.nimlib.a.f.c */
public abstract class AbstractC2177c {

    /* renamed from: a */
    public final C2175a f4342a;

    /* renamed from: b */
    public boolean f4343b = false;

    public AbstractC2177c(C2175a aVar) {
        this.f4342a = aVar == null ? null : new C2175a(aVar);
    }

    /* renamed from: a */
    public abstract void mo34684a(AbstractC2148a aVar);

    /* renamed from: a */
    public final void mo34753a(short s) {
        C2130c.m4323a().mo34655a(AbstractC2148a.C2149a.m4409a(mo34752b().mo34667a(), s));
    }

    /* renamed from: a */
    public boolean mo34685a() {
        mo34752b().mo34667a().mo34940b();
        C2130c.m4323a().mo34663a(this);
        return true;
    }

    /* renamed from: b */
    public abstract AbstractC2131a mo34752b();

    /* renamed from: c */
    public final boolean mo34754c() {
        C2175a aVar = this.f4342a;
        return aVar != null && aVar.mo34749a() > 0;
    }

    /* renamed from: d */
    public final int mo34755d() {
        C2175a aVar = this.f4342a;
        if (aVar != null) {
            return aVar.mo34750b();
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo34756e() {
        C2175a aVar = this.f4342a;
        if (aVar == null) {
            return false;
        }
        int c = aVar.mo34751c();
        if (c == -1 || this.f4343b) {
            mo34753a(ResponseCode.RES_ETIMEOUT);
            return false;
        } else if (c < -1) {
            return false;
        } else {
            return mo34685a();
        }
    }

    /* renamed from: f */
    public final boolean mo34757f() {
        C2175a aVar = this.f4342a;
        boolean z = false;
        if (aVar == null || aVar.mo34751c() < -1) {
            return false;
        }
        if (this.f4342a.mo34749a() == -1) {
            z = true;
        }
        this.f4343b = z;
        return mo34685a();
    }
}
