package com.tencent.p269mm.opensdk.diffdev.p271a;

import com.tencent.p269mm.opensdk.diffdev.OAuthListener;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.c */
public final class RunnableC3379c implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3378b f8319g;

    public RunnableC3379c(C3378b bVar) {
        this.f8319g = bVar;
    }

    public final void run() {
        ArrayList<OAuthListener> arrayList = new ArrayList();
        arrayList.addAll(this.f8319g.f8318f.f8315c);
        for (OAuthListener oAuthListener : arrayList) {
            oAuthListener.onQrcodeScanned();
        }
    }
}
