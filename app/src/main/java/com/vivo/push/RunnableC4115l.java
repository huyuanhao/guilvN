package com.vivo.push;

import java.util.List;

/* renamed from: com.vivo.push.l */
public final class RunnableC4115l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f11022a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11023b;

    public RunnableC4115l(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f11023b = localAliasTagsManager;
        this.f11022a = list;
    }

    public final void run() {
        List list = this.f11022a;
        if (list != null && list.size() > 0) {
            LocalAliasTagsManager.access$000(this.f11023b).delAliasSuccess((String) this.f11022a.get(0));
        }
    }
}
