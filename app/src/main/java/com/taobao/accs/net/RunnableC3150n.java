package com.taobao.accs.net;

import anet.channel.session.TnetSpdySession;
import com.taobao.accs.p263ut.p264a.C3165d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.net.n */
public class RunnableC3150n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7061a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f7062b;

    /* renamed from: c */
    public final /* synthetic */ TnetSpdySession f7063c;

    /* renamed from: d */
    public final /* synthetic */ C3145j f7064d;

    public RunnableC3150n(C3145j jVar, int i, byte[] bArr, TnetSpdySession tnetSpdySession) {
        this.f7064d = jVar;
        this.f7061a = i;
        this.f7062b = bArr;
        this.f7063c = tnetSpdySession;
    }

    public void run() {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i(this.f7064d.mo37662d(), "onDataReceive", "type", Integer.valueOf(this.f7061a));
        }
        if (this.f7061a == 200) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f7064d.f7013e.mo37593a(this.f7062b, this.f7063c.getHost());
                C3165d g = this.f7064d.f7013e.mo37601g();
                if (g != null) {
                    g.f7141c = String.valueOf(currentTimeMillis);
                    g.f7145g = this.f7064d.f7011c == 0 ? "service" : "inapp";
                    g.mo37713a();
                }
            } catch (Throwable th) {
                ALog.m7598e(this.f7064d.mo37662d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "DATA_RECEIVE", UtilityImpl.m7611a(th));
            }
        } else {
            String d = this.f7064d.mo37662d();
            ALog.m7599e(d, "drop frame len:" + this.f7062b.length + " frameType" + this.f7061a, new Object[0]);
        }
    }
}
