package com.vivo.push;

import java.util.List;

/* renamed from: com.vivo.push.n */
public final class RunnableC4119n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f11034a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11035b;

    public RunnableC4119n(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f11035b = localAliasTagsManager;
        this.f11034a = list;
    }

    public final void run() {
        List list = this.f11034a;
        if (list != null && list.size() > 0) {
            LocalAliasTagsManager.access$000(this.f11035b).setAliasSuccess((String) this.f11034a.get(0));
        }
    }
}
