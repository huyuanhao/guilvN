package com.taobao.accs.base;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.internal.ServiceImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3194w;

public class BaseService extends Service {
    public static final String TAG = "BaseService";
    public static boolean isBinded;
    public IBaseService mBaseService = null;
    public Messenger messenger = new Messenger(new Handler() {
        /* class com.taobao.accs.base.BaseService.HandlerC30921 */

        public void handleMessage(Message message) {
            if (message != null) {
                ALog.m7600i(BaseService.TAG, "handleMessage on receive msg", "msg", message.toString());
                Intent intent = (Intent) message.getData().getParcelable("intent");
                if (intent != null) {
                    ALog.m7600i(BaseService.TAG, "handleMessage get intent success", "intent", intent.toString());
                    BaseService.this.onStartCommand(intent, 0, 0);
                }
            }
        }
    });

    public IBinder onBind(Intent intent) {
        ALog.m7597d(TAG, "onBind", "intent", intent);
        try {
            if (C3194w.m7715a(this) && !isBinded) {
                isBinded = true;
                ALog.m7600i(TAG, "onBind bind service", new Object[0]);
                getApplicationContext().bindService(new Intent(this, getClass()), new ServiceConnection() {
                    /* class com.taobao.accs.base.BaseService.ServiceConnectionC30954 */

                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    }

                    public void onServiceDisconnected(ComponentName componentName) {
                    }
                }, 1);
            }
        } catch (Throwable th) {
            ALog.m7600i(TAG, "onBind bind service with exception", th.toString());
        }
        return this.messenger.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        ThreadPoolExecutorFactory.execute(new Runnable() {
            /* class com.taobao.accs.base.BaseService.RunnableC30932 */

            public void run() {
                try {
                    BaseService.this.mBaseService = new ServiceImpl(BaseService.this);
                    BaseService.this.mBaseService.onCreate();
                } catch (Exception e) {
                    ALog.m7599e(BaseService.TAG, "create ServiceImpl error", e.getMessage());
                }
            }
        });
    }

    public void onDestroy() {
        ThreadPoolExecutorFactory.execute(new Runnable() {
            /* class com.taobao.accs.base.BaseService.RunnableC30965 */

            public void run() {
                IBaseService iBaseService = BaseService.this.mBaseService;
                if (iBaseService != null) {
                    iBaseService.onDestroy();
                    BaseService.this.mBaseService = null;
                }
            }
        });
        super.onDestroy();
    }

    public int onStartCommand(final Intent intent, final int i, final int i2) {
        ThreadPoolExecutorFactory.execute(new Runnable() {
            /* class com.taobao.accs.base.BaseService.RunnableC30943 */

            public void run() {
                BaseService baseService = BaseService.this;
                IBaseService iBaseService = baseService.mBaseService;
                if (iBaseService != null) {
                    iBaseService.onStartCommand(intent, i, i2);
                    return;
                }
                baseService.onCreate();
                BaseService.this.onStartCommand(intent, i, i2);
            }
        });
        return 1;
    }
}
