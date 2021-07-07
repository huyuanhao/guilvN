package com.qiyukf.unicorn.mediaselect.internal.p238a;

import androidx.annotation.StyleRes;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a;
import com.qiyukf.unicorn.mediaselect.p233a.p234a.C2727a;
import com.qiyukf.unicorn.mediaselect.p235b.AbstractC2732a;
import com.qiyukf.unicorn.mediaselect.p237c.AbstractC2736a;
import com.qiyukf.unicorn.mediaselect.p237c.AbstractC2738c;
import java.util.List;
import java.util.Set;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.a.e */
public final class C2745e {

    /* renamed from: a */
    public Set<EnumC2731b> f5674a;

    /* renamed from: b */
    public boolean f5675b;

    /* renamed from: c */
    public boolean f5676c;
    @StyleRes

    /* renamed from: d */
    public int f5677d;

    /* renamed from: e */
    public int f5678e;

    /* renamed from: f */
    public boolean f5679f;

    /* renamed from: g */
    public int f5680g;

    /* renamed from: h */
    public int f5681h;

    /* renamed from: i */
    public int f5682i;

    /* renamed from: j */
    public List<AbstractC2732a> f5683j;

    /* renamed from: k */
    public boolean f5684k;

    /* renamed from: l */
    public C2741b f5685l;

    /* renamed from: m */
    public int f5686m;

    /* renamed from: n */
    public int f5687n;

    /* renamed from: o */
    public float f5688o;

    /* renamed from: p */
    public AbstractC2726a f5689p;

    /* renamed from: q */
    public boolean f5690q;

    /* renamed from: r */
    public AbstractC2738c f5691r;

    /* renamed from: s */
    public boolean f5692s;

    /* renamed from: t */
    public boolean f5693t;

    /* renamed from: u */
    public int f5694u;

    /* renamed from: v */
    public AbstractC2736a f5695v;

    /* renamed from: com.qiyukf.unicorn.mediaselect.internal.a.e$a */
    public static final class C2746a {

        /* renamed from: a */
        public static final C2745e f5696a = new C2745e((byte) 0);
    }

    public C2745e() {
    }

    public /* synthetic */ C2745e(byte b) {
        this();
    }

    /* renamed from: a */
    public static C2745e m6339a() {
        return C2746a.f5696a;
    }

    /* renamed from: b */
    public static C2745e m6340b() {
        C2745e eVar = C2746a.f5696a;
        eVar.f5674a = null;
        eVar.f5675b = true;
        eVar.f5676c = false;
        eVar.f5677d = C2364R.style.ysf_media_select_theme;
        eVar.f5678e = 0;
        eVar.f5679f = false;
        eVar.f5680g = 1;
        eVar.f5681h = 0;
        eVar.f5682i = 0;
        eVar.f5683j = null;
        eVar.f5684k = false;
        eVar.f5685l = null;
        eVar.f5686m = 3;
        eVar.f5687n = 0;
        eVar.f5688o = 0.5f;
        eVar.f5689p = new C2727a();
        eVar.f5690q = true;
        eVar.f5692s = false;
        eVar.f5693t = false;
        eVar.f5694u = Integer.MAX_VALUE;
        return eVar;
    }

    /* renamed from: c */
    public final boolean mo36518c() {
        if (!this.f5679f) {
            return this.f5680g == 1 || (this.f5681h == 1 && this.f5682i == 1);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo36519d() {
        return this.f5678e != -1;
    }

    /* renamed from: e */
    public final boolean mo36520e() {
        return this.f5676c && EnumC2731b.m6307b().containsAll(this.f5674a);
    }

    /* renamed from: f */
    public final boolean mo36521f() {
        return this.f5676c && EnumC2731b.m6309c().containsAll(this.f5674a);
    }
}
