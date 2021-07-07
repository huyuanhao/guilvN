package com.vivo.push.p282c;

import java.util.List;

/* renamed from: com.vivo.push.c.i */
public final class RunnableC4081i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10969a;

    /* renamed from: b */
    public final /* synthetic */ List f10970b;

    /* renamed from: c */
    public final /* synthetic */ List f10971c;

    /* renamed from: d */
    public final /* synthetic */ String f10972d;

    /* renamed from: e */
    public final /* synthetic */ C4080h f10973e;

    public RunnableC4081i(C4080h hVar, int i, List list, List list2, String str) {
        this.f10973e = hVar;
        this.f10969a = i;
        this.f10970b = list;
        this.f10971c = list2;
        this.f10972d = str;
    }

    public final void run() {
        C4080h hVar = this.f10973e;
        ((AbstractC4064ab) hVar).f10953b.onDelTags(hVar.f11150a, this.f10969a, this.f10970b, this.f10971c, this.f10972d);
    }
}
