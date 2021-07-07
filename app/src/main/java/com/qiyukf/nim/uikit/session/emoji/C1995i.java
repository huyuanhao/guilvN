package com.qiyukf.nim.uikit.session.emoji;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.p212e.C2468d;
import com.qiyukf.unicorn.p212e.C2469e;
import com.qiyukf.unicorn.p213f.C2634c;
import com.qiyukf.unicorn.p232k.AbstractC2694b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.qiyukf.nim.uikit.session.emoji.i */
public final class C1995i {

    /* renamed from: a */
    public static C1995i f3918a;

    /* renamed from: b */
    public boolean f3919b = true;

    /* renamed from: c */
    public List<C1994h> f3920c = new ArrayList();

    /* renamed from: d */
    public Map<String, C1994h> f3921d = new HashMap();

    /* renamed from: e */
    public boolean f3922e = true;

    /* renamed from: f */
    public List<C2468d> f3923f = new ArrayList();

    /* renamed from: a */
    public static C1995i m3963a() {
        if (f3918a == null) {
            f3918a = new C1995i();
        }
        return f3918a;
    }

    /* renamed from: a */
    public final String mo34439a(String str) {
        if (str != null && str.startsWith("[:") && str.endsWith("]")) {
            for (C2468d dVar : this.f3923f) {
                if (dVar.mo35700a().contains(str)) {
                    return dVar.mo35701b();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo34440a(List<C2469e> list) {
        this.f3920c.clear();
        this.f3921d.clear();
        this.f3919b = true;
        for (C2469e eVar : list) {
            if (eVar.mo35702a() != -1) {
                C1994h hVar = new C1994h(eVar.mo35703b(), eVar.mo35704c(), eVar.mo35707f(), eVar.mo35705d());
                this.f3920c.add(hVar);
                this.f3921d.put(eVar.mo35703b(), hVar);
            } else if (eVar.mo35706e() == 0) {
                this.f3922e = false;
            } else {
                this.f3922e = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo34441b() {
        C1709a.m3011a("StickerManager", "Sticker Manager init...");
        new AbstractC2694b<Void, List<C2468d>>("Unicorn-HTTP") {
            /* class com.qiyukf.nim.uikit.session.emoji.C1995i.C19961 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
            /* renamed from: a */
            public final /* synthetic */ List<C2468d> mo34446a() {
                return C2634c.m6005c();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
            /* renamed from: a */
            public final /* synthetic */ void mo34447a(List<C2468d> list) {
                List<C2468d> list2 = list;
                if (list2 != null) {
                    C1995i.this.f3923f.clear();
                    C1995i.this.f3923f.addAll(list2);
                }
            }
        }.mo36463a((Object[]) new Void[0]);
    }

    /* renamed from: c */
    public final synchronized List<C1994h> mo34442c() {
        return this.f3920c;
    }

    /* renamed from: d */
    public final boolean mo34443d() {
        return this.f3922e;
    }

    /* renamed from: e */
    public final boolean mo34444e() {
        return this.f3919b;
    }

    /* renamed from: f */
    public final void mo34445f() {
        this.f3919b = false;
    }
}
