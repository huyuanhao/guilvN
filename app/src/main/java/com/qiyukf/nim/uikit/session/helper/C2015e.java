package com.qiyukf.nim.uikit.session.helper;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.qiyukf.basesdk.p138c.p142c.C1849b;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.session.helper.e */
public final class C2015e {
    /* renamed from: a */
    public static SpannableStringBuilder m4002a(Context context, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        m4003a(context, spannableStringBuilder);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static void m4003a(Context context, SpannableStringBuilder spannableStringBuilder) {
        List<C1849b.C1851a> a = C1849b.m3508a(spannableStringBuilder.toString());
        if (a.size() != 0) {
            for (C1849b.C1851a aVar : a) {
                spannableStringBuilder.setSpan(new C2003b(context, aVar.f3408a), aVar.f3409b, aVar.f3410c, 33);
            }
        }
    }
}
