package com.taobao.accs.utl;

import android.content.Intent;
import com.p118pd.sdk.C7227o00ooO0O;

/* renamed from: com.taobao.accs.utl.m */
public class RunnableC3182m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3180l f7248a;

    public RunnableC3182m(C3180l lVar) {
        this.f7248a = lVar;
    }

    public void run() {
        this.f7248a.f7241j = 2;
        C7227o00ooO0O.OooO00o(C3180l.f7235d).m18718OooO00o(new Intent(C3180l.ACTION_STATE_DEEPBACK));
    }
}
