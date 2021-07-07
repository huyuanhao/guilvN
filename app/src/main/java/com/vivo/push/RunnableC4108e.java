package com.vivo.push;

import java.util.HashSet;
import java.util.List;

/* renamed from: com.vivo.push.e */
public final class RunnableC4108e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f11009a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11010b;

    public RunnableC4108e(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f11010b = localAliasTagsManager;
        this.f11009a = list;
    }

    public final void run() {
        List list = this.f11009a;
        if (list != null && list.size() > 0) {
            HashSet hashSet = new HashSet();
            for (String str : this.f11009a) {
                hashSet.add(str);
            }
            LocalAliasTagsManager.access$100(this.f11010b).setTagsSuccess(hashSet);
        }
    }
}
