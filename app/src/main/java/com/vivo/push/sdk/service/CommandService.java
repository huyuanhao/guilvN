package com.vivo.push.sdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.vivo.push.sdk.C4127a;
import com.vivo.push.util.C4146p;
import s.h.e.l.l.C;

public class CommandService extends Service {
    static {
        C.i(16777276);
    }

    /* renamed from: a */
    public boolean mo41159a(String str) {
        return "com.vivo.pushservice.action.RECEIVE".equals(str);
    }

    public native IBinder onBind(Intent intent);

    public native void onCreate();

    public native void onDestroy();

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            stopSelf();
            return 2;
        } else if (!mo41159a(intent.getAction())) {
            C4146p.m11204a("CommandService", getPackageName() + " receive invalid action " + intent.getAction());
            stopSelf();
            return 2;
        } else {
            try {
                String stringExtra = intent.getStringExtra("command_type");
                if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals("reflect_receiver")) {
                    C4127a.m11143a().mo41156a(intent);
                }
            } catch (Exception e) {
                C4146p.m11205a("CommandService", "onStartCommand -- error", e);
            }
            stopSelf();
            return 2;
        }
    }

    public native boolean onUnbind(Intent intent);
}
