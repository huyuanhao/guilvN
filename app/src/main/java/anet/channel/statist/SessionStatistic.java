package anet.channel.statist;

import anet.channel.entity.C0131a;
import anet.channel.strategy.IConnStrategy;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.umeng.analytics.pro.C3416b;
import org.json.JSONObject;

@Monitor(module = "networkPrefer", monitorPoint = C3416b.f8468at)
public class SessionStatistic extends StatObject {
    public static int maxRetryTime;
    @Measure
    public long ackTime;
    @Measure(max = 15000.0d)
    public long authTime;
    @Measure
    public long cfRCount;
    @Dimension
    public String closeReason;
    @Measure(max = 15000.0d, name = "connTime")
    public long connectionTime;
    @Dimension(name = "protocolType")
    public String conntype;
    @Dimension
    public long errorCode;
    @Dimension
    public JSONObject extra = null;
    @Dimension
    public String host;
    @Measure
    public long inceptCount;
    @Dimension

    /* renamed from: ip */
    public String f302ip;
    @Dimension
    public int ipRefer = 0;
    @Dimension
    public int ipType = 1;
    @Dimension
    public boolean isBackground;
    public boolean isCommitted = false;
    @Dimension
    public long isKL;
    @Dimension
    public int isProxy = 0;
    @Dimension
    public String isTunnel;
    @Measure
    public int lastPingInterval;
    @Measure(max = 86400.0d)
    public long liveTime = 0;
    @Dimension
    public String netType;
    @Measure
    public long pRate;
    @Dimension
    public int port;
    @Measure
    public long ppkgCount;
    @Measure
    public long recvSizeCount;
    @Measure(constantValue = 1.0d)
    public long requestCount = 1;
    @Dimension
    public int ret;
    @Dimension
    public long retryTimes;
    @Dimension
    public int sdkv;
    @Measure
    public long sendSizeCount;
    @Measure(max = 15000.0d)
    public long sslCalTime;
    @Measure(max = 15000.0d)
    public long sslTime;
    @Measure(constantValue = AbstractC8352oOoOOoO0.OooO0O0)
    public long stdRCount = 1;

    public SessionStatistic(C0131a aVar) {
        this.f302ip = aVar.mo3484a();
        this.port = aVar.mo3485b();
        IConnStrategy iConnStrategy = aVar.f147a;
        if (iConnStrategy != null) {
            this.ipRefer = iConnStrategy.getIpSource();
            this.ipType = aVar.f147a.getIpType();
        }
        this.pRate = (long) aVar.mo3490g();
        this.conntype = aVar.mo3486c().toString();
        this.retryTimes = (long) aVar.f148b;
        maxRetryTime = aVar.f149c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r3 != -2601) goto L_0x0052;
     */
    @Override // anet.channel.statist.StatObject
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean beforeCommit() {
        /*
            r7 = this;
            int r0 = r7.ret
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0052
            long r3 = r7.retryTimes
            int r0 = anet.channel.statist.SessionStatistic.maxRetryTime
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            long r3 = r7.errorCode
            r5 = -2613(0xfffffffffffff5cb, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            r5 = -2601(0xfffffffffffff5d7, double:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
        L_0x001d:
            boolean r0 = anet.channel.util.ALog.isPrintLog(r2)
            if (r0 == 0) goto L_0x0051
            r0 = 0
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r4 = r7.retryTimes
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "maxRetryTime"
            r3[r2] = r4
            r2 = 2
            int r4 = anet.channel.statist.SessionStatistic.maxRetryTime
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            r2 = 3
            java.lang.String r4 = "errorCode"
            r3[r2] = r4
            r2 = 4
            long r4 = r7.errorCode
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r2] = r4
            java.lang.String r2 = "SessionStat no need commit"
            java.lang.String r4 = "retry:"
            anet.channel.util.ALog.m287d(r2, r0, r4, r3)
        L_0x0051:
            return r1
        L_0x0052:
            boolean r0 = r7.isCommitted
            if (r0 == 0) goto L_0x0057
            return r1
        L_0x0057:
            r7.isCommitted = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.statist.SessionStatistic.beforeCommit():boolean");
    }

    public AlarmObject getAlarmObject() {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "connect_succ_rate";
        boolean z = this.ret != 0;
        alarmObject.isSuccess = z;
        if (z) {
            alarmObject.arg = this.closeReason;
        } else {
            alarmObject.errorCode = String.valueOf(this.errorCode);
        }
        return alarmObject;
    }
}
