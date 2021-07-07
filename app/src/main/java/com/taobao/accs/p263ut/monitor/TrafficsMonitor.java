package com.taobao.accs.p263ut.monitor;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.taobao.accs.p261c.C3100a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.taobao.accs.ut.monitor.TrafficsMonitor */
public class TrafficsMonitor {

    /* renamed from: a */
    public Map<String, List<C3168a>> f7167a = new HashMap();

    /* renamed from: b */
    public Map<String, String> f7168b = new HashMap<String, String>() {
        /* class com.taobao.accs.p263ut.monitor.TrafficsMonitor.C31671 */

        {
            put("im", "512");
            put("motu", "513");
            put("acds", "514");
            put("agooSend", "515");
            put(AgooConstants.AGOO_SERVICE_AGOOACK, "515");
            put("agooTokenReport", "515");
            put("accsSelf", "1000");
        }
    };

    /* renamed from: c */
    public int f7169c = 0;

    /* renamed from: d */
    public Context f7170d;

    /* renamed from: e */
    public String f7171e = "";

    @Monitor(module = "NetworkSDK", monitorPoint = "TrafficStats")
    /* renamed from: com.taobao.accs.ut.monitor.TrafficsMonitor$StatTrafficMonitor */
    public static class StatTrafficMonitor extends BaseMonitor {
        @Dimension
        public String bizId;
        @Dimension
        public String date;
        @Dimension
        public String host;
        @Dimension
        public boolean isBackground;
        @Dimension
        public String serviceId;
        @Measure
        public long size;
    }

    public TrafficsMonitor(Context context) {
        this.f7170d = context;
    }

    /* renamed from: b */
    private void m7593b() {
        boolean z;
        String str;
        synchronized (this.f7167a) {
            String a = UtilityImpl.m7608a(System.currentTimeMillis());
            if (TextUtils.isEmpty(this.f7171e) || this.f7171e.equals(a)) {
                str = a;
                z = false;
            } else {
                str = this.f7171e;
                z = true;
            }
            for (String str2 : this.f7167a.keySet()) {
                for (C3168a aVar : this.f7167a.get(str2)) {
                    if (aVar != null) {
                        C3100a.m7288a(this.f7170d).mo37495a(aVar.f7177e, aVar.f7175c, this.f7168b.get(aVar.f7175c), aVar.f7176d, aVar.f7178f, str);
                    }
                }
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m7597d("TrafficsMonitor", "savetoDay:" + str + " saveTraffics" + this.f7167a.toString(), new Object[0]);
            }
            if (z) {
                this.f7167a.clear();
                m7594c();
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m7597d("TrafficsMonitor", "no need commit lastsaveDay:" + this.f7171e + " currday:" + a, new Object[0]);
            }
            this.f7171e = a;
            this.f7169c = 0;
        }
    }

    /* renamed from: c */
    private void m7594c() {
        List<C3168a> a = C3100a.m7288a(this.f7170d).mo37493a(false);
        if (a != null) {
            try {
                for (C3168a aVar : a) {
                    if (aVar != null) {
                        StatTrafficMonitor statTrafficMonitor = new StatTrafficMonitor();
                        statTrafficMonitor.bizId = aVar.f7174b;
                        statTrafficMonitor.date = aVar.f7173a;
                        statTrafficMonitor.host = aVar.f7177e;
                        statTrafficMonitor.isBackground = aVar.f7176d;
                        statTrafficMonitor.size = aVar.f7178f;
                        AppMonitor.getInstance().commitStat(statTrafficMonitor);
                    }
                }
                C3100a.m7288a(this.f7170d).mo37494a();
            } catch (Throwable th) {
                ALog.m7599e("", th.toString(), new Object[0]);
                th.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r11 < 10) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        m7593b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37749a(com.taobao.accs.p263ut.monitor.TrafficsMonitor.C3168a r11) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.p263ut.monitor.TrafficsMonitor.mo37749a(com.taobao.accs.ut.monitor.TrafficsMonitor$a):void");
    }

    /* renamed from: com.taobao.accs.ut.monitor.TrafficsMonitor$a */
    public static class C3168a {

        /* renamed from: a */
        public String f7173a;

        /* renamed from: b */
        public String f7174b;

        /* renamed from: c */
        public String f7175c;

        /* renamed from: d */
        public boolean f7176d;

        /* renamed from: e */
        public String f7177e;

        /* renamed from: f */
        public long f7178f;

        public C3168a(String str, boolean z, String str2, long j) {
            this.f7175c = str;
            this.f7176d = z;
            this.f7177e = str2;
            this.f7178f = j;
        }

        public String toString() {
            return "date:" + this.f7173a + " " + "bizId:" + this.f7174b + " " + "serviceId:" + this.f7175c + " " + "host:" + this.f7177e + " " + "isBackground:" + this.f7176d + " " + "size:" + this.f7178f;
        }

        public C3168a(String str, String str2, String str3, boolean z, String str4, long j) {
            this.f7173a = str;
            this.f7174b = str2;
            this.f7175c = str3;
            this.f7176d = z;
            this.f7177e = str4;
            this.f7178f = j;
        }
    }

    /* renamed from: a */
    public void mo37748a() {
        try {
            synchronized (this.f7167a) {
                this.f7167a.clear();
            }
            List<C3168a> a = C3100a.m7288a(this.f7170d).mo37493a(true);
            if (a != null) {
                for (C3168a aVar : a) {
                    mo37749a(aVar);
                }
            }
        } catch (Exception e) {
            ALog.m7603w("TrafficsMonitor", e.toString(), new Object[0]);
        }
    }
}
