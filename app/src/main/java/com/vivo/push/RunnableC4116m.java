package com.vivo.push;

import java.util.HashSet;
import java.util.List;

/* renamed from: com.vivo.push.m */
public final class RunnableC4116m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ List f11024a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11025b;

    public RunnableC4116m(LocalAliasTagsManager localAliasTagsManager, List list) {
        this.f11025b = localAliasTagsManager;
        this.f11024a = list;
    }

    public final void run() {
        List list = this.f11024a;
        if (list != null && list.size() > 0) {
            HashSet hashSet = new HashSet();
            for (String str : this.f11024a) {
                hashSet.add(str);
            }
            LocalAliasTagsManager.access$100(this.f11025b).delTagsSuccess(hashSet);
        }
    }
}
