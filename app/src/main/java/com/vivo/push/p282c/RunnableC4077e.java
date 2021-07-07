package com.vivo.push.p282c;

import android.text.TextUtils;
import com.vivo.push.p281b.C4045k;

/* renamed from: com.vivo.push.c.e */
public final class RunnableC4077e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f10966a;

    /* renamed from: b */
    public final /* synthetic */ C4045k f10967b;

    /* renamed from: c */
    public final /* synthetic */ C4076d f10968c;

    public RunnableC4077e(C4076d dVar, String str, C4045k kVar) {
        this.f10968c = dVar;
        this.f10966a = str;
        this.f10967b = kVar;
    }

    public final void run() {
        if (!TextUtils.isEmpty(this.f10966a)) {
            C4076d dVar = this.f10968c;
            ((AbstractC4064ab) dVar).f10953b.onReceiveRegId(dVar.f11150a, this.f10966a);
        }
        C4076d dVar2 = this.f10968c;
        ((AbstractC4064ab) dVar2).f10953b.onBind(dVar2.f11150a, this.f10967b.mo40932h(), this.f10967b.mo40912d());
    }
}
