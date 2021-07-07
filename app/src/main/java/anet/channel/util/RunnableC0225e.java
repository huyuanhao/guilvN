package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.status.NetworkStatusHelper;

/* renamed from: anet.channel.util.e */
public class RunnableC0225e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ RunnableC0224d f481a;

    public RunnableC0225e(RunnableC0224d dVar) {
        this.f481a = dVar;
    }

    public void run() {
        C0226f fVar;
        try {
            if (this.f481a.f479a.equals(C0223c.m316b(NetworkStatusHelper.getStatus()))) {
                ALog.m289e("awcn.Inet64Util", "startIpStackDetect double check", null, new Object[0]);
                int i = C0223c.m324i();
                if (this.f481a.f480b.ipStackType != i) {
                    C0223c.f478e.put(this.f481a.f479a, Integer.valueOf(i));
                    this.f481a.f480b.lastIpStackType = this.f481a.f480b.ipStackType;
                    this.f481a.f480b.ipStackType = i;
                }
                if ((i == 2 || i == 3) && (fVar = C0223c.m325j()) != null) {
                    C0223c.f477d.put(this.f481a.f479a, fVar);
                    this.f481a.f480b.nat64Prefix = fVar.toString();
                }
                if (GlobalAppRuntimeInfo.isTargetProcess()) {
                    AppMonitor.getInstance().commitStat(this.f481a.f480b);
                }
            }
        } catch (Exception unused) {
        }
    }
}
