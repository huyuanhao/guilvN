package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.w */
public final class C4158w {

    /* renamed from: a */
    public static final Handler f11153a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final HandlerThread f11154b;

    /* renamed from: c */
    public static final Handler f11155c = new HandlerC4159x(f11154b.getLooper());

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        f11154b = handlerThread;
        handlerThread.start();
    }

    /* renamed from: a */
    public static void m11278a(AbstractRunnableC4157v vVar) {
        if (vVar == null) {
            C4146p.m11204a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a = vVar.mo41208a();
        Message message = new Message();
        message.what = a;
        message.obj = vVar;
        f11155c.sendMessageDelayed(message, 0);
    }

    /* renamed from: b */
    public static void m11280b(Runnable runnable) {
        f11153a.post(runnable);
    }

    /* renamed from: a */
    public static void m11279a(Runnable runnable) {
        f11155c.removeCallbacks(runnable);
        f11155c.postDelayed(runnable, 15000);
    }
}
