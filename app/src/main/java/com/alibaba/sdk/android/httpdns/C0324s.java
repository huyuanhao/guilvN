package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.p016d.C0276b;

/* renamed from: com.alibaba.sdk.android.httpdns.s */
public class C0324s {

    /* renamed from: a */
    public static volatile C0324s f711a;

    /* renamed from: g */
    public long f712g = 0;

    /* renamed from: g */
    public boolean f713g = true;
    public String hostName = null;

    /* renamed from: a */
    public static C0324s m582a() {
        if (f711a == null) {
            synchronized (C0324s.class) {
                if (f711a == null) {
                    f711a = new C0324s();
                }
            }
        }
        return f711a;
    }

    /* renamed from: a */
    private void m583a(String str, String str2) {
        try {
            C0276b a = C0276b.m496a();
            if (a != null) {
                a.mo3984a(str, C0325t.m588a(EnumC0312o.SNIFF_HOST), str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private boolean m584d() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f712g;
        if (j != 0 && currentTimeMillis - j < 30000) {
            return false;
        }
        this.f712g = currentTimeMillis;
        return true;
    }

    /* renamed from: c */
    public synchronized void mo4059c(boolean z) {
        this.f713g = z;
    }

    /* renamed from: e */
    public synchronized void mo4060e() {
        this.f712g = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ Exception -> 0x0063 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo4061g(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.C0324s.mo4061g(java.lang.String):void");
    }
}
