package com.qiyukf.unicorn.mediaselect.p235b;

import android.content.Context;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2742c;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.mediaselect.b.a */
public abstract class AbstractC2732a {
    /* renamed from: a */
    public abstract C2742c mo36486a(Context context, C2743d dVar);

    /* renamed from: a */
    public abstract Set<EnumC2731b> mo36487a();

    /* renamed from: b */
    public final boolean mo36488b(Context context, C2743d dVar) {
        for (EnumC2731b bVar : mo36487a()) {
            if (bVar.mo36484a(context.getContentResolver(), dVar.f5671c)) {
                return true;
            }
        }
        return false;
    }
}
