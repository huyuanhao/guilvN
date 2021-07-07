package com.xiaomi.push.service;

import android.app.NotificationManager;
import com.xiaomi.push.C4251ai;

/* renamed from: com.xiaomi.push.service.ab */
public final class C4597ab extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public final /* synthetic */ int f13148a;

    /* renamed from: a */
    public final /* synthetic */ NotificationManager f13149a;

    public C4597ab(int i, NotificationManager notificationManager) {
        this.f13148a = i;
        this.f13149a = notificationManager;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return this.f13148a;
    }

    public void run() {
        this.f13149a.cancel(this.f13148a);
    }
}
