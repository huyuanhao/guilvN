package com.vivo.push.p282c;

import java.util.List;

/* renamed from: com.vivo.push.c.j */
public final class RunnableC4082j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10974a;

    /* renamed from: b */
    public final /* synthetic */ List f10975b;

    /* renamed from: c */
    public final /* synthetic */ List f10976c;

    /* renamed from: d */
    public final /* synthetic */ String f10977d;

    /* renamed from: e */
    public final /* synthetic */ C4080h f10978e;

    public RunnableC4082j(C4080h hVar, int i, List list, List list2, String str) {
        this.f10978e = hVar;
        this.f10974a = i;
        this.f10975b = list;
        this.f10976c = list2;
        this.f10977d = str;
    }

    public final void run() {
        C4080h hVar = this.f10978e;
        ((AbstractC4064ab) hVar).f10953b.onDelAlias(hVar.f11150a, this.f10974a, this.f10975b, this.f10976c, this.f10977d);
    }
}
