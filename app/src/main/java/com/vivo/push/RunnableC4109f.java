package com.vivo.push;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.vivo.push.f */
public final class RunnableC4109f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f11011a;

    /* renamed from: b */
    public final /* synthetic */ LocalAliasTagsManager f11012b;

    public RunnableC4109f(LocalAliasTagsManager localAliasTagsManager, ArrayList arrayList) {
        this.f11012b = localAliasTagsManager;
        this.f11011a = arrayList;
    }

    public final void run() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f11011a.iterator();
        while (it.hasNext()) {
            hashSet.add((String) it.next());
        }
        if (LocalAliasTagsManager.access$100(this.f11012b).setTags(hashSet)) {
            C4121p.m11080a().mo41102a(LocalAliasTagsManager.DEFAULT_LOCAL_REQUEST_ID, this.f11011a);
        }
    }
}
