package com.taobao.accs.utl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p118pd.sdk.C7227o00ooO0O;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.agoo.TaobaoRegister;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.taobao.accs.utl.l */
public class C3180l implements Application.ActivityLifecycleCallbacks {
    public static final String ACTION_STATE_BACK = "com.taobao.accs.ACTION_STATE_BACK";
    public static final String ACTION_STATE_DEEPBACK = "com.taobao.accs.ACTION_STATE_DEEPBACK";
    public static final String ACTION_STATE_FORE = "com.taobao.accs.ACTION_STATE_FORE";
    public static final int STATE_BACK = 0;
    public static final int STATE_DEEPBACK = 2;
    public static final int STATE_FORE = 1;

    /* renamed from: a */
    public static final String f7232a = C3180l.class.getSimpleName();

    /* renamed from: b */
    public static volatile C3180l f7233b;

    /* renamed from: c */
    public static ArrayList<RunnableC3181a> f7234c;

    /* renamed from: d */
    public static Context f7235d;

    /* renamed from: e */
    public int f7236e = 0;

    /* renamed from: f */
    public boolean f7237f;

    /* renamed from: g */
    public boolean f7238g;

    /* renamed from: h */
    public long f7239h;

    /* renamed from: i */
    public int f7240i = 0;

    /* renamed from: j */
    public int f7241j = 1;

    /* renamed from: k */
    public Handler f7242k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    public Runnable f7243l = new RunnableC3182m(this);

    /* renamed from: com.taobao.accs.utl.l$a */
    public static class RunnableC3181a implements Runnable {

        /* renamed from: a */
        public String f7244a;

        /* renamed from: b */
        public int f7245b;

        /* renamed from: c */
        public long f7246c;

        /* renamed from: d */
        public long f7247d;

        public RunnableC3181a(String str, int i, long j, long j2) {
            this.f7244a = str;
            this.f7245b = i;
            this.f7246c = j;
            this.f7247d = j2;
        }

        public void run() {
            ALog.m7599e(C3180l.f7232a, "click report", "lastActiveTime", Long.valueOf(this.f7247d), "currentActiveTime", Long.valueOf(this.f7246c));
            long j = this.f7247d;
            if (j == 0 || UtilityImpl.m7616a(j, this.f7246c)) {
                this.f7245b |= 8;
            }
            TaobaoRegister.clickMessage(C3180l.f7235d, this.f7244a, null, this.f7245b, this.f7247d);
        }
    }

    public C3180l() {
        f7234c = new ArrayList<>();
    }

    /* renamed from: b */
    public void mo37770b() {
        ArrayList<RunnableC3181a> arrayList = f7234c;
        if (arrayList != null) {
            Iterator<RunnableC3181a> it = arrayList.iterator();
            while (it.hasNext()) {
                ThreadPoolExecutorFactory.getScheduledExecutor().execute(it.next());
            }
            f7234c.clear();
        }
    }

    /* renamed from: c */
    public int mo37771c() {
        return this.f7241j;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f7238g) {
            int i = this.f7236e;
            if ((i & 1) != 1) {
                int i2 = i | 1;
                this.f7236e = i2;
                this.f7236e = i2 | 2;
            } else if ((i & 2) == 2) {
                this.f7236e = i & -3;
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        if (this.f7237f) {
            C3190t.m7693a(f7235d, this.f7239h);
        }
        this.f7237f = false;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        this.f7239h = System.currentTimeMillis();
        long a = C3190t.m7691a(f7235d);
        int i = this.f7240i;
        this.f7240i = i + 1;
        int i2 = 2;
        if (i == 0) {
            ALog.m7600i(f7232a, "onActivityStarted back to force", new Object[0]);
            this.f7242k.removeCallbacks(this.f7243l);
            this.f7237f = true;
            boolean z = this.f7241j == 2;
            this.f7241j = 1;
            Intent intent = new Intent(new Intent(ACTION_STATE_FORE));
            intent.putExtra("state", z);
            C7227o00ooO0O.OooO00o(f7235d).m18718OooO00o(intent);
        }
        if (this.f7238g) {
            int i3 = this.f7237f ? 4 : 0;
            if ((this.f7236e & 2) != 2) {
                i2 = 1;
            }
            int i4 = i3 | i2;
            if (activity != null && activity.getIntent() != null) {
                try {
                    Intent intent2 = activity.getIntent();
                    String stringExtra = intent2.getStringExtra(AgooConstants.FLAG_FROM_AGOO_MESSAGE_ID);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        ALog.m7600i(f7232a, "onActivityStarted isFromAgoo", new Object[0]);
                        intent2.removeExtra(AgooConstants.FLAG_FROM_AGOO_MESSAGE_ID);
                        RunnableC3181a aVar = new RunnableC3181a(stringExtra, i4, this.f7239h, a);
                        if (!TaobaoRegister.isRegisterSuccess()) {
                            if (!Launcher_InitAccs.mIsInited) {
                                ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3183n(this, aVar));
                                return;
                            }
                        }
                        ThreadPoolExecutorFactory.execute(aVar);
                    }
                } catch (Exception e) {
                    ALog.m7598e(f7232a, "onActivityStarted Error:", e, new Object[0]);
                }
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        int i = this.f7240i - 1;
        this.f7240i = i;
        if (i == 0) {
            this.f7241j = 0;
            this.f7242k.postDelayed(this.f7243l, TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
            C7227o00ooO0O.OooO00o(f7235d).m18718OooO00o(new Intent(ACTION_STATE_BACK));
        }
    }

    /* renamed from: a */
    public static C3180l m7670a() {
        if (f7233b == null) {
            synchronized (C3180l.class) {
                if (f7233b == null) {
                    f7233b = new C3180l();
                }
            }
        }
        return f7233b;
    }

    /* renamed from: a */
    public void mo37769a(Application application) {
        if (f7235d == null) {
            f7235d = application;
            this.f7238g = C3190t.m7705e();
            application.registerActivityLifecycleCallbacks(this);
        }
    }
}
