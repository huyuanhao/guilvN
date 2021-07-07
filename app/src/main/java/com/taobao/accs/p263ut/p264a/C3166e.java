package com.taobao.accs.p263ut.p264a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.umeng.analytics.pro.C3460q;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.e */
public class C3166e {

    /* renamed from: a */
    public String f7150a;

    /* renamed from: b */
    public String f7151b;

    /* renamed from: c */
    public String f7152c;

    /* renamed from: d */
    public String f7153d;

    /* renamed from: e */
    public String f7154e;

    /* renamed from: f */
    public String f7155f;

    /* renamed from: g */
    public final String f7156g = "sendAck";

    /* renamed from: h */
    public boolean f7157h = false;

    /* renamed from: a */
    public void mo37714a() {
        String str;
        String str2;
        Throwable th;
        if (!this.f7157h) {
            this.f7157h = true;
            HashMap hashMap = new HashMap();
            try {
                str2 = this.f7150a;
                try {
                    str = String.valueOf(Constants.SDK_VERSION_CODE);
                    try {
                        hashMap.put("device_id", this.f7150a);
                        hashMap.put(C3460q.f8779c, this.f7151b);
                        hashMap.put("data_id", this.f7152c);
                        hashMap.put("ack_date", this.f7153d);
                        hashMap.put("service_id", this.f7154e);
                        hashMap.put("fail_reasons", this.f7155f);
                        UTMini.getInstance().commitEvent(66001, "sendAck", str2, (Object) null, str, hashMap);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = null;
                    ALog.m7597d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str2, (String) null, str, hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th4) {
                th = th4;
                str2 = null;
                str = null;
                ALog.m7597d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str2, (String) null, str, hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
