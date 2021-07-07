package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ft */
public class C4434ft extends Thread {

    /* renamed from: a */
    public final /* synthetic */ C4433fs f11955a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4434ft(C4433fs fsVar, String str) {
        super(str);
        this.f11955a = fsVar;
    }

    public void run() {
        try {
            this.f11955a.f11951a.m12623a();
        } catch (Exception e) {
            this.f11955a.mo41921c(9, e);
        }
    }
}
