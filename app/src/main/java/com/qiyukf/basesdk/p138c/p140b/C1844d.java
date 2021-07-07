package com.qiyukf.basesdk.p138c.p140b;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p140b.p141a.C1820a;
import com.qiyukf.basesdk.p138c.p140b.p141a.C1821b;
import com.qiyukf.basesdk.p138c.p140b.p141a.C1823d;
import com.qiyukf.basesdk.p138c.p140b.p141a.C1824e;
import java.util.ArrayList;

/* renamed from: com.qiyukf.basesdk.c.b.d */
public final class C1844d {

    /* renamed from: a */
    public AbstractC1825b f3397a;

    /* renamed from: b */
    public AbstractC1846e f3398b;

    /* renamed from: c */
    public AbstractC1845a f3399c;

    /* renamed from: d */
    public String f3400d;

    /* renamed from: e */
    public String f3401e;

    /* renamed from: com.qiyukf.basesdk.c.b.d$a */
    public interface AbstractC1845a {
        /* renamed from: a */
        CharSequence mo34115a(SpannableStringBuilder spannableStringBuilder);
    }

    public C1844d(String str) {
        this.f3400d = str;
    }

    /* renamed from: a */
    public static C1844d m3489a(String str) {
        return new C1844d(str);
    }

    /* renamed from: a */
    public final C1844d mo34110a(AbstractC1825b bVar) {
        this.f3397a = bVar;
        return this;
    }

    /* renamed from: a */
    public final C1844d mo34111a(AbstractC1845a aVar) {
        this.f3399c = aVar;
        return this;
    }

    /* renamed from: a */
    public final C1844d mo34112a(AbstractC1846e eVar) {
        this.f3398b = eVar;
        return this;
    }

    /* renamed from: a */
    public final void mo34113a(TextView textView) {
        if (TextUtils.isEmpty(this.f3400d)) {
            textView.setText("");
            return;
        }
        C1811a aVar = new C1811a();
        C1827c cVar = new C1827c();
        ArrayList arrayList = new ArrayList();
        aVar.mo34074a(textView);
        aVar.mo34075a(this.f3397a);
        aVar.mo34076a(this.f3400d);
        cVar.mo34105a(textView);
        cVar.mo34104a(aVar);
        String a = C1827c.m3467a(this.f3400d);
        this.f3400d = a;
        Spanned fromHtml = Html.fromHtml(a, aVar, cVar);
        SpannableStringBuilder spannableStringBuilder = fromHtml instanceof SpannableStringBuilder ? (SpannableStringBuilder) fromHtml : new SpannableStringBuilder(fromHtml);
        arrayList.clear();
        ImageSpan[] imageSpanArr = (ImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class);
        for (int i = 0; i < imageSpanArr.length; i++) {
            ImageSpan imageSpan = imageSpanArr[i];
            String source = imageSpan.getSource();
            int spanStart = spannableStringBuilder.getSpanStart(imageSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(imageSpan);
            arrayList.add(source);
            C1820a aVar2 = new C1820a(textView.getContext(), arrayList, i);
            aVar2.mo34087a(this.f3398b);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder.getSpans(spanStart, spanEnd, ClickableSpan.class);
            if (clickableSpanArr != null) {
                for (ClickableSpan clickableSpan : clickableSpanArr) {
                    spannableStringBuilder.removeSpan(clickableSpan);
                }
            }
            spannableStringBuilder.setSpan(aVar2, spanStart, spanEnd, 33);
        }
        C1824e[] eVarArr = (C1824e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1824e.class);
        for (C1824e eVar : eVarArr) {
            int spanStart2 = spannableStringBuilder.getSpanStart(eVar);
            int spanEnd2 = spannableStringBuilder.getSpanEnd(eVar);
            C1823d dVar = new C1823d(textView.getContext(), eVar.mo34097a());
            dVar.mo34094a(this.f3398b);
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannableStringBuilder.getSpans(spanStart2, spanEnd2, ClickableSpan.class);
            if (clickableSpanArr2 != null) {
                for (ClickableSpan clickableSpan2 : clickableSpanArr2) {
                    spannableStringBuilder.removeSpan(clickableSpan2);
                }
            }
            spannableStringBuilder.setSpan(dVar, spanStart2, spanEnd2, 33);
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart3 = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd3 = spannableStringBuilder.getSpanEnd(uRLSpan);
                spannableStringBuilder.removeSpan(uRLSpan);
                C1821b bVar = new C1821b(textView.getContext(), uRLSpan.getURL(), this.f3401e);
                bVar.mo34090a(this.f3398b);
                spannableStringBuilder.setSpan(bVar, spanStart3, spanEnd3, 34);
            }
        }
        while (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        AbstractC1845a aVar3 = this.f3399c;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (aVar3 != null) {
            spannableStringBuilder2 = aVar3.mo34115a(spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder2);
    }

    /* renamed from: b */
    public final C1844d mo34114b(String str) {
        this.f3401e = str;
        return this;
    }
}
