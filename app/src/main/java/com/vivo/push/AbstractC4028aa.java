package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.umeng.message.proguard.C3848l;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.aa */
public abstract class AbstractC4028aa {

    /* renamed from: a */
    public Context f10893a;

    /* renamed from: b */
    public Handler f10894b;

    /* renamed from: c */
    public final Object f10895c = new Object();

    /* renamed from: com.vivo.push.aa$a */
    public class HandlerC4029a extends Handler {
        public HandlerC4029a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            AbstractC4028aa.this.mo40891b(message);
        }
    }

    public AbstractC4028aa() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.f10894b = new HandlerC4029a(handlerThread.getLooper());
    }

    /* renamed from: a */
    public final void mo40889a(Context context) {
        this.f10893a = context;
    }

    /* renamed from: b */
    public abstract void mo40891b(Message message);

    /* renamed from: a */
    public final void mo40890a(Message message) {
        synchronized (this.f10895c) {
            if (this.f10894b == null) {
                String simpleName = getClass().getSimpleName();
                C4146p.m11217e(simpleName, ("Dead worker dropping a message: " + message.what) + " (Thread " + Thread.currentThread().getId() + C3848l.f10402t);
            } else {
                this.f10894b.sendMessage(message);
            }
        }
    }
}
