package com.qiyukf.basesdk.p138c.p140b.p141a;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.qiyukf.basesdk.p138c.p140b.AbstractC1846e;

/* renamed from: com.qiyukf.basesdk.c.b.a.d */
public final class C1823d extends ClickableSpan {

    /* renamed from: a */
    public AbstractC1846e f3373a;

    /* renamed from: b */
    public Context f3374b;

    /* renamed from: c */
    public String f3375c;

    public C1823d(Context context, String str) {
        this.f3374b = context;
        this.f3375c = str;
    }

    /* renamed from: a */
    public final void mo34094a(AbstractC1846e eVar) {
        this.f3373a = eVar;
    }

    public final void onClick(View view) {
        AbstractC1846e eVar = this.f3373a;
        if (eVar != null) {
            eVar.mo34116a(this.f3374b, this.f3375c);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
