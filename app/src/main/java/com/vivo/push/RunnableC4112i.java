package com.vivo.push;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.vivo.push.i */
public final class RunnableC4112i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f11016a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11017b;

    public RunnableC4112i(LocalAliasTagsManager localAliasTagsManager, ArrayList arrayList) {
        this.f11017b = localAliasTagsManager;
        this.f11016a = arrayList;
    }

    public final void run() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f11016a.iterator();
        while (it.hasNext()) {
            hashSet.add((String) it.next());
        }
        if (LocalAliasTagsManager.access$100(this.f11017b).delTags(hashSet)) {
            C4121p.m11080a().mo41112b(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, this.f11016a);
        }
    }
}
