package com.taobao.accs.net;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3190t;
import exocr.idcard.CameraManager;
import okhttp3.internal.http2.Http2Codec;

/* renamed from: com.taobao.accs.net.f */
public abstract class AbstractC3141f {

    /* renamed from: b */
    public static volatile AbstractC3141f f7030b;

    /* renamed from: c */
    public static final int[] f7031c = {270, 360, CameraManager.OooO0O0};

    /* renamed from: a */
    public Context f7032a;

    /* renamed from: d */
    public int f7033d;

    /* renamed from: e */
    public long f7034e;

    /* renamed from: f */
    public boolean f7035f = false;

    /* renamed from: g */
    public int[] f7036g = {0, 0, 0};

    /* renamed from: h */
    public boolean f7037h = true;

    public AbstractC3141f(Context context) {
        try {
            this.f7032a = context;
            this.f7033d = 0;
            this.f7034e = System.currentTimeMillis();
            this.f7037h = C3190t.m7702b();
        } catch (Throwable th) {
            ALog.m7598e("HeartbeatManager", "HeartbeatManager", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static AbstractC3141f m7500a(Context context) {
        if (f7030b == null) {
            synchronized (AbstractC3141f.class) {
                if (f7030b == null) {
                    if (Build.VERSION.SDK_INT < 21 || !m7501b(context)) {
                        ALog.m7600i("HeartbeatManager", "hb use alarm", new Object[0]);
                        f7030b = new C3136a(context);
                    } else {
                        ALog.m7600i("HeartbeatManager", "hb use job", new Object[0]);
                        f7030b = new C3154r(context);
                    }
                }
            }
        }
        return f7030b;
    }

    /* renamed from: b */
    public static boolean m7501b(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), AccsJobService.class.getName()), 0).isEnabled();
        } catch (Throwable th) {
            ALog.m7598e("HeartbeatManager", "isJobServiceExist", th, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public abstract void mo37644a(int i);

    /* renamed from: c */
    public void mo37677c() {
        this.f7034e = -1;
        if (this.f7035f) {
            int[] iArr = this.f7036g;
            int i = this.f7033d;
            iArr[i] = iArr[i] + 1;
        }
        int i2 = this.f7033d;
        this.f7033d = i2 > 0 ? i2 - 1 : 0;
        ALog.m7597d("HeartbeatManager", "onNetworkTimeout", new Object[0]);
    }

    /* renamed from: d */
    public void mo37678d() {
        this.f7034e = -1;
        ALog.m7597d("HeartbeatManager", "onNetworkFail", new Object[0]);
    }

    /* renamed from: e */
    public void mo37679e() {
        ALog.m7597d("HeartbeatManager", "onHeartbeatSucc", new Object[0]);
        if (System.currentTimeMillis() - this.f7034e > 7199000) {
            int i = this.f7033d;
            if (i < f7031c.length - 1 && this.f7036g[i] <= 2) {
                ALog.m7597d("HeartbeatManager", Http2Codec.UPGRADE, new Object[0]);
                this.f7033d++;
                this.f7035f = true;
                this.f7034e = System.currentTimeMillis();
                return;
            }
            return;
        }
        this.f7035f = false;
        this.f7036g[this.f7033d] = 0;
    }

    /* renamed from: f */
    public void mo37680f() {
        this.f7033d = 0;
        this.f7034e = System.currentTimeMillis();
        ALog.m7597d("HeartbeatManager", "resetLevel", new Object[0]);
    }

    /* renamed from: b */
    public int mo37676b() {
        int i = this.f7037h ? f7031c[this.f7033d] : 270;
        this.f7037h = C3190t.m7702b();
        return i;
    }

    /* renamed from: a */
    public synchronized void mo37675a() {
        try {
            if (this.f7034e < 0) {
                this.f7034e = System.currentTimeMillis();
            }
            int b = mo37676b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m7597d("HeartbeatManager", "set " + b, new Object[0]);
            }
            mo37644a(b);
        } catch (Throwable th) {
            ALog.m7598e("HeartbeatManager", "set", th, new Object[0]);
        }
        return;
    }
}
