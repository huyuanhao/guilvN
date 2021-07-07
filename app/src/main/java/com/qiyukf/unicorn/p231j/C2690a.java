package com.qiyukf.unicorn.p231j;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import com.qiyukf.unicorn.p212e.C2466b;
import com.qiyukf.unicorn.p213f.C2634c;
import com.qiyukf.unicorn.p232k.AbstractC2694b;

/* renamed from: com.qiyukf.unicorn.j.a */
public final class C2690a {

    /* renamed from: a */
    public static C2690a f5590a;

    /* renamed from: b */
    public C2466b f5591b;

    /* renamed from: a */
    public static C2690a m6219a() {
        if (f5590a == null) {
            f5590a = new C2690a();
        }
        return f5590a;
    }

    /* renamed from: a */
    public final void mo36459a(View view) {
        if (mo36462d() && view.getBackground() != null) {
            view.getBackground().setColorFilter(Color.parseColor(m6219a().mo36461c().mo35690b()), PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: b */
    public final void mo36460b() {
        new AbstractC2694b<Void, C2466b>("Unicorn-HTTP") {
            /* class com.qiyukf.unicorn.p231j.C2690a.C26911 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
            /* renamed from: a */
            public final /* synthetic */ C2466b mo34446a() {
                return C2634c.m6006d();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.qiyukf.unicorn.p232k.AbstractC2694b
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo34447a(C2466b bVar) {
                C2466b bVar2 = bVar;
                if (bVar2 != null) {
                    C2690a.this.f5591b = bVar2;
                }
            }
        }.mo36463a((Object[]) new Void[0]);
    }

    /* renamed from: c */
    public final C2466b mo36461c() {
        if (this.f5591b == null) {
            this.f5591b = new C2466b();
        }
        return this.f5591b;
    }

    /* renamed from: d */
    public final boolean mo36462d() {
        return mo36461c().mo35689a() == 1;
    }
}
