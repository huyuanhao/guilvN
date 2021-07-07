package com.qiyukf.basesdk.p138c.p140b.p141a;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.qiyukf.basesdk.p138c.p140b.AbstractC1846e;

/* renamed from: com.qiyukf.basesdk.c.b.a.b */
public final class C1821b extends ClickableSpan {

    /* renamed from: a */
    public AbstractC1846e f3367a;

    /* renamed from: b */
    public Context f3368b;

    /* renamed from: c */
    public String f3369c;

    /* renamed from: d */
    public String f3370d;

    public C1821b(Context context, String str, String str2) {
        this.f3368b = context;
        this.f3369c = str;
        this.f3370d = str2;
    }

    /* renamed from: a */
    public final void mo34090a(AbstractC1846e eVar) {
        this.f3367a = eVar;
    }

    public final void onClick(View view) {
        AbstractC1846e eVar = this.f3367a;
        if (eVar != null) {
            eVar.mo34117a(this.f3368b, this.f3369c, this.f3370d);
        }
    }
}
