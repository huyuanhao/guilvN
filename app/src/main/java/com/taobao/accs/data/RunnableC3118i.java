package com.taobao.accs.data;

import android.content.Intent;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3179k;

/* renamed from: com.taobao.accs.data.i */
public class RunnableC3118i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f6967a;

    /* renamed from: b */
    public final /* synthetic */ String f6968b;

    /* renamed from: c */
    public final /* synthetic */ Intent f6969c;

    /* renamed from: d */
    public final /* synthetic */ C3116g f6970d;

    public RunnableC3118i(C3116g gVar, String str, String str2, Intent intent) {
        this.f6970d = gVar;
        this.f6967a = str;
        this.f6968b = str2;
        this.f6969c = intent;
    }

    public void run() {
        if (C3116g.f6962a != null && C3116g.f6962a.contains(this.f6967a)) {
            ALog.m7599e("MsgDistribute", "routing msg time out, try election", Constants.KEY_DATA_ID, this.f6967a, Constants.KEY_SERVICE_ID, this.f6968b);
            C3116g.f6962a.remove(this.f6967a);
            C3179k.m7668a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", C7486o0OoO0oO.f20312OooO0Oo, "pkg:" + this.f6969c.getPackage());
        }
    }
}
