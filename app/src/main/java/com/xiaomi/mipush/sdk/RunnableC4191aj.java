package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.C4498hs;

/* renamed from: com.xiaomi.mipush.sdk.aj */
public class RunnableC4191aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MiTinyDataClient.C4178a.C4179a f11222a;

    /* renamed from: a */
    public final /* synthetic */ C4498hs f11223a;

    public RunnableC4191aj(MiTinyDataClient.C4178a.C4179a aVar, C4498hs hsVar) {
        this.f11222a = aVar;
        this.f11223a = hsVar;
    }

    public void run() {
        this.f11222a.f11207a.add(this.f11223a);
        MiTinyDataClient.C4178a.C4179a.m11379a(this.f11222a);
    }
}
