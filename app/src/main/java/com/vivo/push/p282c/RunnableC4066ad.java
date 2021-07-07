package com.vivo.push.p282c;

import java.util.List;

/* renamed from: com.vivo.push.c.ad */
public final class RunnableC4066ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10954a;

    /* renamed from: b */
    public final /* synthetic */ List f10955b;

    /* renamed from: c */
    public final /* synthetic */ List f10956c;

    /* renamed from: d */
    public final /* synthetic */ String f10957d;

    /* renamed from: e */
    public final /* synthetic */ C4065ac f10958e;

    public RunnableC4066ad(C4065ac acVar, int i, List list, List list2, String str) {
        this.f10958e = acVar;
        this.f10954a = i;
        this.f10955b = list;
        this.f10956c = list2;
        this.f10957d = str;
    }

    public final void run() {
        C4065ac acVar = this.f10958e;
        ((AbstractC4064ab) acVar).f10953b.onSetTags(C4065ac.m11005a(acVar), this.f10954a, this.f10955b, this.f10956c, this.f10957d);
    }
}
