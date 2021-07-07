package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ds */
public class C4365ds {

    /* renamed from: a */
    public static volatile C4365ds f11630a;

    /* renamed from: a */
    public AbstractC4364dr f11631a;

    /* renamed from: a */
    public static C4365ds mo41674a() {
        if (f11630a == null) {
            synchronized (C4365ds.class) {
                if (f11630a == null) {
                    f11630a = new C4365ds();
                }
            }
        }
        return f11630a;
    }

    /* renamed from: a */
    public AbstractC4364dr m12121a() {
        return this.f11631a;
    }

    /* renamed from: a */
    public void mo41675a(AbstractC4364dr drVar) {
        this.f11631a = drVar;
    }
}
