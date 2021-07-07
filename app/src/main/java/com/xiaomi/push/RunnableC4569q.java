package com.xiaomi.push;

import android.content.SharedPreferences;

/* renamed from: com.xiaomi.push.q */
public class RunnableC4569q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4567p f13066a;

    /* renamed from: a */
    public final /* synthetic */ String f13067a;

    /* renamed from: b */
    public final /* synthetic */ String f13068b;

    /* renamed from: c */
    public final /* synthetic */ String f13069c;

    public RunnableC4569q(C4567p pVar, String str, String str2, String str3) {
        this.f13066a = pVar;
        this.f13067a = str;
        this.f13068b = str2;
        this.f13069c = str3;
    }

    public void run() {
        SharedPreferences.Editor edit = C4567p.m13737a(this.f13066a).getSharedPreferences(this.f13067a, 4).edit();
        edit.putString(this.f13068b, this.f13069c);
        edit.commit();
    }
}
