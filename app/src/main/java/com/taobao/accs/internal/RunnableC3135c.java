package com.taobao.accs.internal;

import android.content.Intent;
import android.os.Process;
import com.taobao.accs.internal.ServiceImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.internal.c */
public class RunnableC3135c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ServiceImpl.BinderC31321 f7003a;

    public RunnableC3135c(ServiceImpl.BinderC31321 r1) {
        this.f7003a = r1;
    }

    public void run() {
        try {
            if (ServiceImpl.this.f6994c == null || !UtilityImpl.m7637e(ServiceImpl.this.f6994c)) {
                Process.killProcess(Process.myPid());
            } else {
                Intent intent = new Intent();
                intent.setAction("org.agoo.android.intent.action.PING_V4");
                intent.setClassName(ServiceImpl.this.f6994c.getPackageName(), C3178j.channelService);
                ServiceImpl.this.f6994c.startService(intent);
                UTMini.getInstance().commitEvent(66001, "probeServiceEnabled", UtilityImpl.m7644l(ServiceImpl.this.f6994c));
                ALog.m7597d("ServiceImpl", "ReceiverImpl probeTaoBao........mContext.startService(intent) [probe][successfully]", new Object[0]);
            }
            ALog.m7597d("ServiceImpl", "ReceiverImpl probeTaoBao........messageServiceBinder [probe][end]", new Object[0]);
        } catch (Throwable th) {
            ALog.m7597d("ServiceImpl", "ReceiverImpl probeTaoBao error........e=" + th, new Object[0]);
        }
    }
}
