package com.taobao.accs.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.C3194w;

public class MsgDistributeService extends Service {

    /* renamed from: a */
    public static boolean f6931a;

    /* renamed from: b */
    public Messenger f6932b = new Messenger(new HandlerC3119j(this));

    public IBinder onBind(Intent intent) {
        if (C3190t.m7703c() && C3194w.m7715a(this) && !f6931a) {
            f6931a = true;
            getApplicationContext().bindService(new Intent(this, MsgDistributeService.class), new ServiceConnectionC3120k(this), 1);
        }
        return this.f6932b.getBinder();
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            ALog.m7600i("MsgDistributeService", "onStartCommand", "action", intent.getAction());
            if (TextUtils.isEmpty(intent.getAction()) || !TextUtils.equals(intent.getAction(), Constants.ACTION_SEND)) {
                ALog.m7600i("MsgDistributeService", "onStartCommand distribute message", new Object[0]);
                C3116g.m7381a(getApplicationContext(), intent);
            } else {
                ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3121l(this, intent));
            }
        } catch (Throwable th) {
            ALog.m7598e("MsgDistributeService", "onStartCommand", th, new Object[0]);
        }
        return 2;
    }
}
