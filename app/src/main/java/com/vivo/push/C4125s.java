package com.vivo.push;

/* renamed from: com.vivo.push.s */
public final class C4125s implements IPushActionListener {

    /* renamed from: a */
    public final /* synthetic */ C4121p f11067a;

    public C4125s(C4121p pVar) {
        this.f11067a = pVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i == 0) {
            this.f11067a.f11048l = "";
            this.f11067a.f11047k.mo41183a("APP_TOKEN", "");
            this.f11067a.m11091t();
            this.f11067a.f11047k.mo41186c("APP_TAGS");
            return;
        }
        this.f11067a.f11048l = null;
        this.f11067a.f11047k.mo41186c("APP_TOKEN");
    }
}
