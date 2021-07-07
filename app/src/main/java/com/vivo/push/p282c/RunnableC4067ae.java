package com.vivo.push.p282c;

import java.util.List;

/* renamed from: com.vivo.push.c.ae */
public final class RunnableC4067ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10959a;

    /* renamed from: b */
    public final /* synthetic */ List f10960b;

    /* renamed from: c */
    public final /* synthetic */ List f10961c;

    /* renamed from: d */
    public final /* synthetic */ String f10962d;

    /* renamed from: e */
    public final /* synthetic */ C4065ac f10963e;

    public RunnableC4067ae(C4065ac acVar, int i, List list, List list2, String str) {
        this.f10963e = acVar;
        this.f10959a = i;
        this.f10960b = list;
        this.f10961c = list2;
        this.f10962d = str;
    }

    public final void run() {
        C4065ac acVar = this.f10963e;
        ((AbstractC4064ab) acVar).f10953b.onSetAlias(C4065ac.m11006b(acVar), this.f10959a, this.f10960b, this.f10961c, this.f10962d);
    }
}
