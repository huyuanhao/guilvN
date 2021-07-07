package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.C4256al;

/* renamed from: com.xiaomi.push.am */
public class HandlerC4259am extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C4256al f11372a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC4259am(C4256al alVar, Looper looper) {
        super(looper);
        this.f11372a = alVar;
    }

    public void handleMessage(Message message) {
        C4256al.AbstractC4258b bVar = (C4256al.AbstractC4258b) message.obj;
        int i = message.what;
        if (i == 0) {
            bVar.mo41487a();
        } else if (i == 1) {
            bVar.mo41489c();
        }
        super.handleMessage(message);
    }
}
