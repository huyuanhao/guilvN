package com.qiyukf.basesdk.p138c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.umeng.message.UmengMessageHandler;
import java.util.HashMap;

/* renamed from: com.qiyukf.basesdk.c.a */
public final class C1805a {

    /* renamed from: a */
    public static C1805a f3330a;

    /* renamed from: b */
    public static Handler f3331b;

    /* renamed from: c */
    public final HashMap<String, HandlerThread> f3332c = new HashMap<>();

    /* renamed from: a */
    public static synchronized C1805a m3403a() {
        C1805a aVar;
        synchronized (C1805a.class) {
            if (f3330a == null) {
                f3330a = new C1805a();
            }
            aVar = f3330a;
        }
        return aVar;
    }

    /* renamed from: b */
    public static Handler m3404b() {
        if (f3331b == null) {
            f3331b = new Handler(Looper.getMainLooper());
        }
        return f3331b;
    }

    /* renamed from: b */
    private HandlerThread m3405b(String str) {
        HandlerThread handlerThread;
        synchronized (this.f3332c) {
            handlerThread = this.f3332c.get(str);
            if (handlerThread == null) {
                StringBuilder sb = new StringBuilder("HT-");
                sb.append(TextUtils.isEmpty(str) ? UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME : str);
                handlerThread = new HandlerThread(sb.toString());
                handlerThread.start();
                this.f3332c.put(str, handlerThread);
            }
        }
        return handlerThread;
    }

    /* renamed from: a */
    public final Handler mo34072a(String str) {
        return new Handler(m3405b(str).getLooper());
    }

    /* renamed from: c */
    public final Handler mo34073c() {
        return mo34072a(UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME);
    }
}
