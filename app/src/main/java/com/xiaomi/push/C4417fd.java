package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.C4164a;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.mipush.sdk.MiPushMessage;

/* renamed from: com.xiaomi.push.fd */
public class C4417fd {

    /* renamed from: a */
    public static volatile C4417fd f11817a;

    /* renamed from: a */
    public Context f11818a;

    public C4417fd(Context context) {
        this.f11818a = context;
    }

    /* renamed from: a */
    public static C4417fd m12519a(Context context) {
        if (f11817a == null) {
            synchronized (C4417fd.class) {
                if (f11817a == null) {
                    f11817a = new C4417fd(context);
                }
            }
        }
        return f11817a;
    }

    /* renamed from: a */
    private void m12520a(C4164a aVar) {
        if (aVar instanceof PerfClientReport) {
            ClientReportClient.reportPerf(this.f11818a, (PerfClientReport) aVar);
        } else if (aVar instanceof EventClientReport) {
            ClientReportClient.reportEvent(this.f11818a, (EventClientReport) aVar);
        }
    }

    /* renamed from: a */
    public void mo41808a(String str, int i, long j, long j2) {
        if (i >= 0 && j2 >= 0 && j > 0) {
            PerfClientReport a = C4415fc.m12508a(this.f11818a, i, j, j2);
            a.setAppPackageName(str);
            a.setSdkVersion("3_7_0");
            m12520a(a);
        }
    }

    /* renamed from: a */
    public void mo41809a(String str, Intent intent, int i, String str2) {
        if (intent != null) {
            mo41812a(str, C4415fc.m12511a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra(MiPushMessage.KEY_MESSAGE_ID), i, System.currentTimeMillis(), str2);
        }
    }

    /* renamed from: a */
    public void mo41810a(String str, Intent intent, String str2) {
        if (intent != null) {
            mo41812a(str, C4415fc.m12511a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra(MiPushMessage.KEY_MESSAGE_ID), 5001, System.currentTimeMillis(), str2);
        }
    }

    /* renamed from: a */
    public void mo41811a(String str, Intent intent, Throwable th) {
        if (intent != null) {
            mo41812a(str, C4415fc.m12511a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra(MiPushMessage.KEY_MESSAGE_ID), 5001, System.currentTimeMillis(), th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo41812a(String str, String str2, String str3, int i, long j, String str4) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            EventClientReport a = C4415fc.m12505a(this.f11818a, str2, str3, i, j, str4);
            a.setAppPackageName(str);
            a.setSdkVersion("3_7_0");
            m12520a(a);
        }
    }

    /* renamed from: a */
    public void mo41813a(String str, String str2, String str3, int i, String str4) {
        mo41812a(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    /* renamed from: a */
    public void mo41814a(String str, String str2, String str3, String str4) {
        mo41812a(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    /* renamed from: a */
    public void mo41815a(String str, String str2, String str3, Throwable th) {
        mo41812a(str, str2, str3, 5001, System.currentTimeMillis(), th.getMessage());
    }

    /* renamed from: b */
    public void mo41816b(String str, String str2, String str3, String str4) {
        mo41812a(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    /* renamed from: c */
    public void mo41817c(String str, String str2, String str3, String str4) {
        mo41812a(str, str2, str3, 4002, System.currentTimeMillis(), str4);
    }
}
