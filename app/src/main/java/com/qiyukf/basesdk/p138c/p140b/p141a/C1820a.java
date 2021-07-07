package com.qiyukf.basesdk.p138c.p140b.p141a;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.qiyukf.basesdk.p138c.p140b.AbstractC1846e;
import java.util.List;

/* renamed from: com.qiyukf.basesdk.c.b.a.a */
public final class C1820a extends ClickableSpan {

    /* renamed from: a */
    public AbstractC1846e f3363a;

    /* renamed from: b */
    public Context f3364b;

    /* renamed from: c */
    public List<String> f3365c;

    /* renamed from: d */
    public int f3366d;

    public C1820a(Context context, List<String> list, int i) {
        this.f3364b = context;
        this.f3365c = list;
        this.f3366d = i;
    }

    /* renamed from: a */
    public final void mo34087a(AbstractC1846e eVar) {
        this.f3363a = eVar;
    }

    public final void onClick(View view) {
        AbstractC1846e eVar = this.f3363a;
        if (eVar != null) {
            eVar.mo34118a(this.f3364b, this.f3365c, this.f3366d);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
