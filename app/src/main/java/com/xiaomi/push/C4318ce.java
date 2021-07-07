package com.xiaomi.push;

import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4312cd;

/* renamed from: com.xiaomi.push.ce */
public class C4318ce extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public final /* synthetic */ C4312cd f11501a;

    public C4318ce(C4312cd cdVar) {
        this.f11501a = cdVar;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 100957;
    }

    public void run() {
        synchronized (this.f11501a.f11479a) {
            if (this.f11501a.f11479a.size() > 0) {
                if (this.f11501a.f11479a.size() > 1) {
                    this.f11501a.mo41577a(this.f11501a.f11479a);
                } else {
                    this.f11501a.mo41578b((C4312cd.AbstractRunnableC4313a) this.f11501a.f11479a.get(0));
                }
                this.f11501a.f11479a.clear();
                System.gc();
            }
        }
    }
}
