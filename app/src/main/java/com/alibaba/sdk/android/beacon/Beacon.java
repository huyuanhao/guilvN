package com.alibaba.sdk.android.beacon;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Beacon {

    /* renamed from: a */
    public int f532a;

    /* renamed from: a */
    public final HandlerThread f533a;

    /* renamed from: a */
    public final C0245b f534a;

    /* renamed from: a */
    public final List<OnUpdateListener> f535a;

    /* renamed from: b */
    public final List<OnServiceErrListener> f536b;
    public final String mAppKey;
    public final String mAppSecret;
    public final Map<String, String> mExtras;
    public Handler mHandler;
    public long mLoopInterval;

    public final class BeaconHandler extends Handler {
        public static final int MSG_ADD_ERR_LISTENER = 6;
        public static final int MSG_ADD_UPDATE_LISTENER = 4;
        public static final int MSG_ERR_CALLBACK = 7;
        public static final int MSG_REMOVE_UPDATE_LISTENER = 5;
        public static final int MSG_START = 0;
        public static final int MSG_START_POLLING = 2;
        public static final int MSG_STOP_POLLING = 3;
        public static final int MSG_UPDATE = 1;

        public BeaconHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                switch (message.what) {
                    case 0:
                        Beacon.this.m389c((Context) message.obj);
                        return;
                    case 1:
                        Beacon.this.m391d((Context) message.obj);
                        return;
                    case 2:
                        Beacon.this.m392e((Context) message.obj);
                        return;
                    case 3:
                        Beacon.this.m383b();
                        return;
                    case 4:
                        Beacon.this.m377a((Beacon) ((OnUpdateListener) message.obj));
                        return;
                    case 5:
                        Beacon.this.m386b((Beacon) ((OnUpdateListener) message.obj));
                        return;
                    case 6:
                        Beacon.this.m376a((Beacon) ((OnServiceErrListener) message.obj));
                        return;
                    case 7:
                        Beacon.this.m385b((Beacon) ((Error) message.obj));
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                Log.i("beacon", e.getMessage(), e);
            }
        }
    }

    public static final class Builder {
        public String mAppKey;
        public String mAppSecret;
        public Map<String, String> mExtras = new HashMap();
        public long mLoopInterval = Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;

        public Builder appKey(String str) {
            this.mAppKey = str.trim();
            return this;
        }

        public Builder appSecret(String str) {
            this.mAppSecret = str.trim();
            return this;
        }

        public Beacon build() {
            return new Beacon(this);
        }

        public Builder extras(Map<String, String> map) {
            this.mExtras.putAll(map);
            return this;
        }

        public Builder loopInterval(long j) {
            if (j < 60000) {
                this.mLoopInterval = 60000;
            } else {
                this.mLoopInterval = j;
            }
            return this;
        }
    }

    public static final class Config {
        public final String key;
        public final String value;

        public Config(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public static final class Error {
        public final String errCode;
        public final String errMsg;

        public Error(String str, String str2) {
            this.errCode = str;
            this.errMsg = str2;
        }
    }

    public interface OnServiceErrListener {
        void onErr(Error error);
    }

    public interface OnUpdateListener {
        void onUpdate(List<Config> list);
    }

    public Beacon(Builder builder) {
        this.f535a = new ArrayList();
        this.f536b = new ArrayList();
        this.f532a = 255;
        this.mAppKey = builder.mAppKey;
        this.mAppSecret = builder.mAppSecret;
        this.mExtras = builder.mExtras;
        this.mLoopInterval = builder.mLoopInterval;
        this.f534a = new C0245b(this);
        HandlerThread handlerThread = new HandlerThread("Beacon Daemon");
        this.f533a = handlerThread;
        handlerThread.start();
        m374a();
    }

    /* renamed from: a */
    private void m374a() {
        this.mHandler = new BeaconHandler(this.f533a.getLooper());
    }

    /* renamed from: a */
    private void m375a(Context context) {
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = context;
        this.mHandler.sendMessage(obtain);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m376a(OnServiceErrListener onServiceErrListener) {
        this.f536b.add(onServiceErrListener);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m377a(OnUpdateListener onUpdateListener) {
        this.f535a.add(onUpdateListener);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m383b() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.mHandler.getLooper().quitSafely();
        } else {
            this.mHandler.getLooper().quit();
        }
        m374a();
    }

    /* renamed from: b */
    private void m384b(Context context) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = context;
        this.mHandler.sendMessage(obtain);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m385b(Error error) {
        for (OnServiceErrListener onServiceErrListener : this.f536b) {
            onServiceErrListener.onErr(error);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m386b(OnUpdateListener onUpdateListener) {
        this.f535a.remove(onUpdateListener);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private void m389c(Context context) {
        m384b(context);
        this.f532a = 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m391d(Context context) {
        this.f534a.m401a(context, this.mAppKey, this.mAppSecret, this.mExtras);
        List<Config> a = this.f534a.mo3922a();
        for (OnUpdateListener onUpdateListener : this.f535a) {
            onUpdateListener.onUpdate(a);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m392e(Context context) {
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
        }
        m375a(context);
        this.mHandler.sendEmptyMessageDelayed(2, this.mLoopInterval);
    }

    private boolean isStarted() {
        return this.f532a == 1;
    }

    public static final void setPrepare(boolean z) {
        C0244a.f537a = z;
    }

    /* renamed from: a */
    public void mo3908a(Error error) {
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.obj = error;
        this.mHandler.sendMessage(obtain);
    }

    public void addServiceErrListener(OnServiceErrListener onServiceErrListener) {
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.obj = onServiceErrListener;
        this.mHandler.sendMessage(obtain);
    }

    public void addUpdateListener(OnUpdateListener onUpdateListener) {
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = onUpdateListener;
        this.mHandler.sendMessage(obtain);
    }

    public List<Config> getConfigs() {
        return this.f534a.mo3922a();
    }

    public void start(Context context) {
        if (!isStarted()) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = context;
            this.mHandler.sendMessage(obtain);
        }
    }

    public void stop() {
        if (isStarted()) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            this.mHandler.sendMessage(obtain);
        }
    }
}
