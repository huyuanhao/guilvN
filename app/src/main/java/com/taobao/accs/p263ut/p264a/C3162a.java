package com.taobao.accs.p263ut.p264a;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.a */
public class C3162a {

    /* renamed from: a */
    public String f7115a;

    /* renamed from: b */
    public String f7116b;

    /* renamed from: c */
    public boolean f7117c;

    /* renamed from: d */
    public String f7118d;

    /* renamed from: e */
    public final String f7119e = "BindApp";

    /* renamed from: f */
    public boolean f7120f = false;

    /* renamed from: b */
    private void m7581b(String str) {
        Throwable th;
        String str2;
        String str3;
        if (!this.f7120f) {
            this.f7120f = true;
            HashMap hashMap = new HashMap();
            try {
                str3 = this.f7115a;
                try {
                    str2 = String.valueOf(Constants.SDK_VERSION_CODE);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = null;
                    ALog.m7597d("BindAppStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
                try {
                    hashMap.put("device_id", this.f7115a);
                    hashMap.put("bind_date", this.f7116b);
                    hashMap.put("ret", this.f7117c ? "y" : GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
                    hashMap.put("fail_reasons", this.f7118d);
                    hashMap.put("push_token", "");
                    UTMini.getInstance().commitEvent(66001, str, str3, (Object) null, str2, hashMap);
                } catch (Throwable th3) {
                    th = th3;
                    ALog.m7597d("BindAppStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th4) {
                th = th4;
                str3 = null;
                str2 = null;
                ALog.m7597d("BindAppStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo37708a(String str) {
        this.f7118d = str;
    }

    /* renamed from: a */
    public void mo37707a(int i) {
        if (i == -4) {
            mo37708a("msg too large");
        } else if (i == -3) {
            mo37708a("service not available");
        } else if (i == -2) {
            mo37708a("param error");
        } else if (i == -1) {
            mo37708a("network fail");
        } else if (i == 200) {
        } else {
            if (i != 300) {
                mo37708a(String.valueOf(i));
            } else {
                mo37708a("app not bind");
            }
        }
    }

    /* renamed from: a */
    public void mo37706a() {
        m7581b("BindApp");
    }
}
