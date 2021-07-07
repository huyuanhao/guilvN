package com.vivo.push.p282c;

import android.text.TextUtils;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4121p;
import com.vivo.push.C4158w;
import com.vivo.push.p281b.C4045k;

/* renamed from: com.vivo.push.c.d */
public final class C4076d extends AbstractC4064ab {
    public C4076d(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        C4045k kVar = (C4045k) yVar;
        String e = kVar.mo40913e();
        C4121p.m11080a().mo41099a(kVar.mo40931g(), kVar.mo40932h(), e);
        if (TextUtils.isEmpty(kVar.mo40931g()) && !TextUtils.isEmpty(e)) {
            C4121p.m11080a().mo41097a(e);
        }
        C4158w.m11280b(new RunnableC4077e(this, e, kVar));
    }
}
