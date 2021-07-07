package com.vivo.push;

/* renamed from: com.vivo.push.d */
public final class RunnableC4107d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f11007a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11008b;

    public RunnableC4107d(LocalAliasTagsManager localAliasTagsManager, String str) {
        this.f11008b = localAliasTagsManager;
        this.f11007a = str;
    }

    public final void run() {
        if (LocalAliasTagsManager.access$000(this.f11008b).setAlias(this.f11007a)) {
            C4121p.m11080a().mo41101a(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, this.f11007a);
        }
    }
}
