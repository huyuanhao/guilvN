package com.taobao.accs.p263ut.p264a;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.umeng.socialize.common.SocializeConstants;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.b */
public class C3163b {

    /* renamed from: a */
    public String f7121a;

    /* renamed from: b */
    public String f7122b;

    /* renamed from: c */
    public boolean f7123c;

    /* renamed from: d */
    public String f7124d;

    /* renamed from: e */
    public String f7125e;

    /* renamed from: f */
    public final String f7126f = "BindUser";

    /* renamed from: g */
    public boolean f7127g = false;

    /* renamed from: b */
    private void m7585b(String str) {
        Throwable th;
        String str2;
        String str3;
        if (!this.f7127g) {
            this.f7127g = true;
            HashMap hashMap = new HashMap();
            try {
                str3 = this.f7121a;
                try {
                    str2 = String.valueOf(Constants.SDK_VERSION_CODE);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = null;
                    ALog.m7597d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
                try {
                    hashMap.put("device_id", this.f7121a);
                    hashMap.put("bind_date", this.f7122b);
                    hashMap.put("ret", this.f7123c ? "y" : GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
                    hashMap.put("fail_reasons", this.f7124d);
                    hashMap.put(SocializeConstants.TENCENT_UID, this.f7125e);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.m7597d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, hashMap), new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(66001, str, str3, (Object) null, str2, hashMap);
                } catch (Throwable th3) {
                    th = th3;
                    ALog.m7597d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th4) {
                th = th4;
                str3 = null;
                str2 = null;
                ALog.m7597d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo37711a(String str) {
        this.f7124d = str;
    }

    /* renamed from: a */
    public void mo37710a(int i) {
        if (i == -4) {
            mo37711a("msg too large");
        } else if (i == -3) {
            mo37711a("service not available");
        } else if (i == -2) {
            mo37711a("param error");
        } else if (i == -1) {
            mo37711a("network fail");
        } else if (i == 200) {
        } else {
            if (i != 300) {
                mo37711a(String.valueOf(i));
            } else {
                mo37711a("app not bind");
            }
        }
    }

    /* renamed from: a */
    public void mo37709a() {
        m7585b("BindUser");
    }
}
