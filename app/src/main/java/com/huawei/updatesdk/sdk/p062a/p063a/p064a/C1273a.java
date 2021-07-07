package com.huawei.updatesdk.sdk.p062a.p063a.p064a;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.p118pd.sdk.C7714o0ooO0o0;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.huawei.updatesdk.sdk.a.a.a.a */
public final class C1273a {

    /* renamed from: b */
    public static final C1273a f1417b = new C1273a();

    /* renamed from: a */
    public final Queue<byte[]> f1418a = new ArrayDeque(0);

    /* renamed from: a */
    public static C1273a m1567a() {
        return f1417b;
    }

    /* renamed from: a */
    public void mo15878a(byte[] bArr) {
        if (bArr.length == 65536) {
            synchronized (this.f1418a) {
                if (this.f1418a.size() < 32 && !this.f1418a.offer(bArr)) {
                    C1278a.m1580a(C7714o0ooO0o0.OooO00o, "releaseBytes false");
                }
            }
        }
    }

    /* renamed from: b */
    public byte[] mo15879b() {
        byte[] poll;
        synchronized (this.f1418a) {
            poll = this.f1418a.poll();
        }
        return poll == null ? new byte[65536] : poll;
    }
}
