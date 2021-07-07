package com.xiaomi.push;

import android.content.Context;

/* renamed from: com.xiaomi.push.ep */
public final class RunnableC4401ep implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11784a;

    /* renamed from: a */
    public final /* synthetic */ Context f11785a;

    /* renamed from: a */
    public final /* synthetic */ String f11786a;

    /* renamed from: b */
    public final /* synthetic */ String f11787b;

    public RunnableC4401ep(Context context, String str, int i, String str2) {
        this.f11785a = context;
        this.f11786a = str;
        this.f11784a = i;
        this.f11787b = str2;
    }

    public void run() {
        C4400eo.m12447b(this.f11785a, this.f11786a, this.f11784a, this.f11787b);
    }
}
