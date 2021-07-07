package com.qiyukf.nimlib.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1863d;
import com.qiyukf.nimlib.p180e.C2238d;
import s.h.e.l.l.C;

public class NimService extends Service {

    public static final class Aux extends Service {

        /* renamed from: a */
        public static final Binder f4720a = new Binder();

        public final IBinder onBind(Intent intent) {
            C2238d.m4687d();
            return f4720a;
        }

        public final void onRebind(Intent intent) {
            C2238d.m4687d();
            super.onRebind(intent);
        }

        public final boolean onUnbind(Intent intent) {
            return true;
        }
    }

    static {
        C.i(16777270);
    }

    /* renamed from: a */
    public static Intent m5141a(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), NimService.class);
        intent.setAction("com.qiyukf.desk.ACTION.KEEP_ALIVE");
        intent.putExtra("EXTRA_FROM", 4);
        return intent;
    }

    /* renamed from: a */
    public static void m5142a(Context context, int i) {
        C1709a.m3018d("service", "start service from " + i);
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, NimService.class);
        intent.putExtra("EXTRA_FROM", i);
        C1863d.m3547a(applicationContext, intent);
    }

    /* renamed from: b */
    public static Intent m5143b(Context context) {
        return new Intent(context, NimService.class);
    }

    /* renamed from: c */
    public static Intent m5144c(Context context) {
        return new Intent(context, Aux.class);
    }

    public native IBinder onBind(Intent intent);

    public native void onCreate();

    public native void onDestroy();

    public native void onRebind(Intent intent);

    public native int onStartCommand(Intent intent, int i, int i2);

    public native boolean onUnbind(Intent intent);
}
