package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;

/* renamed from: com.xiaomi.mipush.sdk.ak */
public class RunnableC4192ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MiTinyDataClient.C4178a.C4179a f11224a;

    public RunnableC4192ak(MiTinyDataClient.C4178a.C4179a aVar) {
        this.f11224a = aVar;
    }

    public void run() {
        if (this.f11224a.f11207a.size() != 0) {
            this.f11224a.m11380b();
        } else if (MiTinyDataClient.C4178a.C4179a.m11376a(this.f11224a) != null) {
            MiTinyDataClient.C4178a.C4179a.m11376a(this.f11224a).cancel(false);
            this.f11224a.f11208a = null;
        }
    }
}
