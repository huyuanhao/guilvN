package com.qiyukf.nimlib.p179d;

import android.os.Handler;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p155a.C2107a;
import com.qiyukf.nimlib.sdk.Observer;
import com.qiyukf.nimlib.sdk.auth.AuthServiceObserver;
import java.util.ArrayList;

/* renamed from: com.qiyukf.nimlib.d.d */
public final class C2211d {

    /* renamed from: a */
    public Handler f4408a;

    public C2211d(Handler handler) {
        this.f4408a = handler;
    }

    /* renamed from: a */
    public final void mo34820a(String str, final Observer observer) {
        if (str.equals(AuthServiceObserver.class.getSimpleName() + "/observeOtherClients")) {
            final ArrayList<C2107a> i = C2205d.m4586i();
            this.f4408a.post(new Runnable() {
                /* class com.qiyukf.nimlib.p179d.C2211d.RunnableC22121 */

                public final void run() {
                    observer.onEvent(i);
                }
            });
        }
    }
}
