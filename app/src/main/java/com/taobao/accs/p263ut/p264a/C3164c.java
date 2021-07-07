package com.taobao.accs.p263ut.p264a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.c */
public class C3164c {

    /* renamed from: a */
    public int f7128a;

    /* renamed from: b */
    public int f7129b;

    /* renamed from: c */
    public boolean f7130c = false;

    /* renamed from: d */
    public int f7131d = 0;

    /* renamed from: e */
    public int f7132e = 0;

    /* renamed from: f */
    public String f7133f;

    /* renamed from: g */
    public String f7134g;

    /* renamed from: h */
    public long f7135h;

    /* renamed from: i */
    public boolean f7136i;

    /* renamed from: j */
    public boolean f7137j;

    /* renamed from: k */
    public long f7138k = 0;

    /* renamed from: a */
    public void mo37712a() {
        String str;
        String str2;
        Throwable th;
        long currentTimeMillis = System.currentTimeMillis();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m7597d("MonitorStatistic", "commitUT interval:" + (currentTimeMillis - this.f7138k) + " interval1:" + (currentTimeMillis - this.f7135h), new Object[0]);
        }
        if (currentTimeMillis - this.f7138k > 1200000 && currentTimeMillis - this.f7135h > 60000) {
            HashMap hashMap = new HashMap();
            String str3 = null;
            try {
                String valueOf = String.valueOf(this.f7131d);
                try {
                    str = String.valueOf(this.f7132e);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = null;
                    str = null;
                    str3 = valueOf;
                    ALog.m7597d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
                try {
                    str2 = String.valueOf(Constants.SDK_VERSION_CODE);
                } catch (Throwable th3) {
                    th = th3;
                    str2 = null;
                    str3 = valueOf;
                    ALog.m7597d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
                try {
                    hashMap.put("connStatus", String.valueOf(this.f7128a));
                    hashMap.put("connType", String.valueOf(this.f7129b));
                    hashMap.put("tcpConnected", String.valueOf(this.f7130c));
                    hashMap.put("proxy", String.valueOf(this.f7133f));
                    hashMap.put("startServiceTime", String.valueOf(this.f7135h));
                    hashMap.put("commitTime", String.valueOf(currentTimeMillis));
                    hashMap.put("networkAvailable", String.valueOf(this.f7136i));
                    hashMap.put("threadIsalive", String.valueOf(this.f7137j));
                    hashMap.put("url", this.f7134g);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        try {
                            ALog.m7597d("MonitorStatistic", UTMini.getCommitInfo(66001, valueOf, str, str2, hashMap), new Object[0]);
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    try {
                        UTMini.getInstance().commitEvent(66001, "MONITOR", valueOf, str, str2, hashMap);
                        this.f7138k = currentTimeMillis;
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = valueOf;
                        str2 = str2;
                        str = str;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str3 = valueOf;
                    ALog.m7597d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th7) {
                th = th7;
                str2 = null;
                str = null;
                ALog.m7597d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str, str2, hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
