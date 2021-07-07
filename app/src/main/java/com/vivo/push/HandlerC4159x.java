package com.vivo.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.x */
public final class HandlerC4159x extends Handler {
    public HandlerC4159x(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof AbstractRunnableC4157v) {
            AbstractRunnableC4157v vVar = (AbstractRunnableC4157v) obj;
            C4146p.m11214c("PushClientThread", "PushClientThread-handleMessage, task = " + vVar);
            vVar.run();
        }
    }
}
