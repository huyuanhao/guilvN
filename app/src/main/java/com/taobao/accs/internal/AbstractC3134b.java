package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.p118pd.sdk.C8400oOoo00oO;
import com.taobao.accs.base.IBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC3137b;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3194w;
import com.taobao.accs.utl.UtilityImpl;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.taobao.accs.internal.b */
public abstract class AbstractC3134b implements IBaseService {

    /* renamed from: a */
    public static ConcurrentHashMap<String, AbstractC3137b> f7000a = new ConcurrentHashMap<>(2);

    /* renamed from: b */
    public Context f7001b;

    /* renamed from: c */
    public Service f7002c = null;

    public AbstractC3134b(Service service) {
        this.f7002c = service;
        this.f7001b = service.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        if (r11 == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r0.mo37646a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.taobao.accs.net.AbstractC3137b m7469a(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.AbstractC3134b.m7469a(android.content.Context, java.lang.String, boolean):com.taobao.accs.net.b");
    }

    /* renamed from: b */
    private void m7470b(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra("appKey");
            String stringExtra3 = intent.getStringExtra(Constants.KEY_TTID);
            String stringExtra4 = intent.getStringExtra("app_sercet");
            String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
            int intExtra = intent.getIntExtra("mode", 0);
            ALog.m7600i("ElectionServiceImpl", "handleStartCommand", Constants.KEY_CONFIG_TAG, stringExtra5, "appkey", stringExtra2, C8400oOoo00oO.f21511Oooo00o, stringExtra4, Constants.KEY_TTID, stringExtra3, "pkg", stringExtra);
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && stringExtra.equals(this.f7001b.getPackageName())) {
                C3194w.m7712a(this.f7001b, intExtra);
                AbstractC3137b a = m7469a(this.f7001b, stringExtra5, false);
                if (a != null) {
                    a.f7009a = stringExtra3;
                } else {
                    ALog.m7599e("ElectionServiceImpl", "handleStartCommand start action, no connection", Constants.KEY_CONFIG_TAG, stringExtra5);
                }
                UtilityImpl.m7633d(this.f7001b, stringExtra2);
            }
        } catch (Throwable th) {
            ALog.m7598e("ElectionServiceImpl", "handleStartCommand", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract int mo37638a(Intent intent);

    @Override // com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onCreate() {
        ALog.m7600i("ElectionServiceImpl", "onCreate,", "sdkVersion", Integer.valueOf(Constants.SDK_VERSION_CODE));
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onDestroy() {
        ALog.m7599e("ElectionServiceImpl", "Service onDestroy", new Object[0]);
        this.f7001b = null;
        this.f7002c = null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        ALog.m7600i("ElectionServiceImpl", "onStartCommand begin", "action", action);
        if (TextUtils.equals(action, Constants.ACTION_START_SERVICE)) {
            m7470b(intent);
        }
        return mo37638a(intent);
    }

    @Override // com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }
}
