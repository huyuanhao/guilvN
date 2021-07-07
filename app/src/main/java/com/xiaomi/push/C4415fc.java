package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.netease.nis.captcha.Captcha;
import com.p118pd.sdk.C7088o00OO0o0;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.C4641bf;
import com.xiaomi.push.service.C4642bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.fc */
public class C4415fc {

    /* renamed from: a */
    public static AbstractC4416a f11815a;

    /* renamed from: a */
    public static Map<String, EnumC4504hy> f11816a;

    /* renamed from: com.xiaomi.push.fc$a */
    public interface AbstractC4416a {
        /* renamed from: a */
        void mo41380a(Context context, C4498hs hsVar);
    }

    /* renamed from: a */
    public static int m12502a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    /* renamed from: a */
    public static int m12503a(Enum r1) {
        if (r1 != null) {
            if (r1 instanceof EnumC4494ho) {
                return r1.ordinal() + 1001;
            }
            if (r1 instanceof EnumC4504hy) {
                return r1.ordinal() + Captcha.NO_NETWORK;
            }
            if (r1 instanceof EnumC4423fi) {
                return r1.ordinal() + AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Config m12504a(Context context) {
        boolean a = C4605ah.m13919a(context).mo42661a(EnumC4499ht.PerfUploadSwitch.mo42043a(), false);
        boolean a2 = C4605ah.m13919a(context).mo42661a(EnumC4499ht.EventUploadSwitch.mo42043a(), false);
        int a3 = C4605ah.m13919a(context).mo42656a(EnumC4499ht.PerfUploadFrequency.mo42043a(), C7088o00OO0o0.OooO0Oo);
        return Config.getBuilder().setEventUploadSwitchOpen(a2).setEventUploadFrequency((long) C4605ah.m13919a(context).mo42656a(EnumC4499ht.EventUploadFrequency.mo42043a(), C7088o00OO0o0.OooO0Oo)).setPerfUploadSwitchOpen(a).setPerfUploadFrequency((long) a3).build(context);
    }

    /* renamed from: a */
    public static EventClientReport m12505a(Context context, String str, String str2, int i, long j, String str3) {
        EventClientReport a = m12506a(str);
        a.eventId = str2;
        a.eventType = i;
        a.eventTime = j;
        a.eventContent = str3;
        return a;
    }

    /* renamed from: a */
    public static EventClientReport m12506a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    /* renamed from: a */
    public static PerfClientReport m12507a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    /* renamed from: a */
    public static PerfClientReport m12508a(Context context, int i, long j, long j2) {
        PerfClientReport a = m12507a();
        a.code = i;
        a.perfCounts = j;
        a.perfLatencies = j2;
        return a;
    }

    /* renamed from: a */
    public static C4498hs m12509a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4498hs hsVar = new C4498hs();
        hsVar.mo42028d("category_client_report_data");
        hsVar.mo42018a("push_sdk_channel");
        hsVar.mo42017a(1);
        hsVar.mo42021b(str);
        hsVar.mo42019a(true);
        hsVar.mo42020b(System.currentTimeMillis());
        hsVar.mo42035g(context.getPackageName());
        hsVar.mo42030e(MiPushRegistar.PACKAGE_XIAOMI);
        hsVar.mo42033f(C4641bf.m14054a());
        hsVar.mo42024c("quality_support");
        return hsVar;
    }

    /* renamed from: a */
    public static EnumC4504hy m12510a(String str) {
        if (f11816a == null) {
            synchronized (EnumC4504hy.class) {
                if (f11816a == null) {
                    f11816a = new HashMap();
                    EnumC4504hy[] values = EnumC4504hy.values();
                    for (EnumC4504hy hyVar : values) {
                        f11816a.put(hyVar.f12451a.toLowerCase(), hyVar);
                    }
                }
            }
        }
        EnumC4504hy hyVar2 = f11816a.get(str.toLowerCase());
        return hyVar2 != null ? hyVar2 : EnumC4504hy.Invalid;
    }

    /* renamed from: a */
    public static String m12511a(int i) {
        return i == 1000 ? "E100000" : i == 3000 ? "E100002" : i == 2000 ? "E100001" : i == 6000 ? "E100003" : "";
    }

    /* renamed from: a */
    public static void m12512a(Context context) {
        ClientReportClient.updateConfig(context, m12504a(context));
    }

    /* renamed from: a */
    public static void m12513a(Context context, Config config) {
        ClientReportClient.init(context, config, new C4413fa(context), new C4414fb(context));
    }

    /* renamed from: a */
    public static void m12514a(Context context, C4498hs hsVar) {
        if (m12517a(context.getApplicationContext())) {
            C4642bg.m14059a(context.getApplicationContext(), hsVar);
            return;
        }
        AbstractC4416a aVar = f11815a;
        if (aVar != null) {
            aVar.mo41380a(context, hsVar);
        }
    }

    /* renamed from: a */
    public static void m12515a(Context context, List<String> list) {
        if (list != null) {
            try {
                for (String str : list) {
                    C4498hs a = m12509a(context, str);
                    if (C4641bf.m14057a(a, false)) {
                        AbstractC4163b.m11305c(a.mo42029d() + "is not valid...");
                    } else {
                        AbstractC4163b.m11305c("send event/perf data item id:" + a.mo42029d());
                        m12514a(context, a);
                    }
                }
            } catch (Throwable th) {
                AbstractC4163b.m11306d(th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m12516a(AbstractC4416a aVar) {
        f11815a = aVar;
    }

    /* renamed from: a */
    public static boolean m12517a(Context context) {
        return context != null && !TextUtils.isEmpty(context.getPackageName()) && MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName());
    }
}
