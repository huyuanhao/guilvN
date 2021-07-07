package com.qiyukf.unicorn.mediaselect.p235b.p236a;

import android.content.Context;
import com.p118pd.sdk.C9021ooOo0oOO;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2742c;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.p235b.AbstractC2732a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.mediaselect.b.a.a */
public final class C2733a extends AbstractC2732a {

    /* renamed from: a */
    public int f5653a = C9021ooOo0oOO.C9023OooO0o0.OooO0OO;

    /* renamed from: b */
    public int f5654b = 30000;

    @Override // com.qiyukf.unicorn.mediaselect.p235b.AbstractC2732a
    /* renamed from: a */
    public final C2742c mo36486a(Context context, C2743d dVar) {
        if (!mo36488b(context, dVar)) {
            return null;
        }
        if (dVar.f5672d > ((long) this.f5653a) || dVar.f5673e > ((long) this.f5654b)) {
            return new C2742c(context.getString(C2364R.string.ysf_exceed_limit_str), (byte) 0);
        }
        return null;
    }

    @Override // com.qiyukf.unicorn.mediaselect.p235b.AbstractC2732a
    /* renamed from: a */
    public final Set<EnumC2731b> mo36487a() {
        return new HashSet<EnumC2731b>() {
            /* class com.qiyukf.unicorn.mediaselect.p235b.p236a.C2733a.C27341 */

            {
                add(EnumC2731b.MP4);
            }
        };
    }
}
