package anet.channel.appmonitor;

import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.StatObject;

public class AppMonitor {
    public static volatile IAppMonitor apmMonitor = null;
    public static volatile IAppMonitor appMonitor = new C0109a(null);

    /* renamed from: anet.channel.appmonitor.AppMonitor$a */
    public static class C0109a implements IAppMonitor {

        /* renamed from: a */
        public IAppMonitor f102a = null;

        public C0109a(IAppMonitor iAppMonitor) {
            this.f102a = iAppMonitor;
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitAlarm(AlarmObject alarmObject) {
            IAppMonitor iAppMonitor = this.f102a;
            if (iAppMonitor != null) {
                iAppMonitor.commitAlarm(alarmObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitCount(CountObject countObject) {
            IAppMonitor iAppMonitor = this.f102a;
            if (iAppMonitor != null) {
                iAppMonitor.commitCount(countObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        public void commitStat(StatObject statObject) {
            if (AppMonitor.apmMonitor != null) {
                AppMonitor.apmMonitor.commitStat(statObject);
            }
            IAppMonitor iAppMonitor = this.f102a;
            if (iAppMonitor != null) {
                iAppMonitor.commitStat(statObject);
            }
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        @Deprecated
        public void register() {
        }

        @Override // anet.channel.appmonitor.IAppMonitor
        @Deprecated
        public void register(Class<?> cls) {
        }
    }

    public static IAppMonitor getInstance() {
        return appMonitor;
    }

    public static void setApmMonitor(IAppMonitor iAppMonitor) {
        apmMonitor = iAppMonitor;
    }

    public static void setInstance(IAppMonitor iAppMonitor) {
        appMonitor = new C0109a(iAppMonitor);
    }
}
