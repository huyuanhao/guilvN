package com.taobao.accs.data;

import anet.channel.appmonitor.AppMonitor;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p263ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.c */
public class RunnableC3112c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3110a f6942a;

    public RunnableC3112c(C3110a aVar) {
        this.f6942a = aVar;
    }

    public void run() {
        synchronized (this.f6942a) {
            if (C3110a.m7338a(this.f6942a) == 0) {
                ALog.m7599e("AssembleMessage", C7486o0OoO0oO.f20312OooO0Oo, Constants.KEY_DATA_ID, C3110a.m7341b(this.f6942a));
                C3110a.m7339a(this.f6942a, 1);
                C3110a.m7342c(this.f6942a).clear();
                AppMonitor.getInstance().commitStat(new AssembleMonitor(C3110a.m7341b(this.f6942a), String.valueOf(C3110a.m7338a(this.f6942a))));
            }
        }
    }
}
