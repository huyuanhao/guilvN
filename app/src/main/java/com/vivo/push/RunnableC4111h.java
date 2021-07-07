package com.vivo.push;

/* renamed from: com.vivo.push.h */
public final class RunnableC4111h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f11014a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11015b;

    public RunnableC4111h(LocalAliasTagsManager localAliasTagsManager, String str) {
        this.f11015b = localAliasTagsManager;
        this.f11014a = str;
    }

    public final void run() {
        if (LocalAliasTagsManager.access$000(this.f11015b).delAlias(this.f11014a)) {
            C4121p.m11080a().mo41111b(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, this.f11014a);
        }
    }
}
