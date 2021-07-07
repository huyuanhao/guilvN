package com.qiyukf.nimlib.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1863d;
import s.h.e.l.l.C;

public class WakeupService extends Service {
    static {
        C.i(16777271);
    }

    /* renamed from: a */
    public static void m5145a(Context context) {
        if (context == null) {
            C1709a.m3011a("WakeupService", "send back data while context is null.");
        } else {
            C1863d.m3547a(context, new Intent(context, WakeupService.class));
        }
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public native void onCreate();

    public native int onStartCommand(Intent intent, int i, int i2);
}
