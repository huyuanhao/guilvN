package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.lang.ref.WeakReference;
import s.h.e.l.l.C;

public abstract class BaseService extends Service {

    /* renamed from: a */
    public HandlerC4176a f11188a;

    /* renamed from: com.xiaomi.mipush.sdk.BaseService$a */
    public static class HandlerC4176a extends Handler {

        /* renamed from: a */
        public WeakReference<BaseService> f11189a;

        public HandlerC4176a(WeakReference<BaseService> weakReference) {
            this.f11189a = weakReference;
        }

        /* renamed from: a */
        public void mo41280a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000);
        }

        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what == 1001 && (weakReference = this.f11189a) != null && (baseService = weakReference.get()) != null) {
                AbstractC4163b.m11305c("TimeoutHandler" + baseService.toString() + "  kill self");
                if (!baseService.mo41277a()) {
                    baseService.stopSelf();
                    return;
                }
                AbstractC4163b.m11305c("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000);
            }
        }
    }

    static {
        C.i(16777278);
    }

    /* renamed from: a */
    public abstract boolean mo41277a();

    public native IBinder onBind(Intent intent);

    public native void onStart(Intent intent, int i);
}
