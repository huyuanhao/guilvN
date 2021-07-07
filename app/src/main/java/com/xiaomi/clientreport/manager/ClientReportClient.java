package com.xiaomi.clientreport.manager;

import android.content.Context;
import android.os.Process;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.C4171a;
import com.xiaomi.clientreport.processor.C4172b;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.C4442g;

public class ClientReportClient {
    public static void init(Context context) {
        init(context, Config.defaultConfig(context), new C4171a(context), new C4172b(context));
    }

    public static void init(Context context, Config config) {
        init(context, config, new C4171a(context), new C4172b(context));
    }

    public static void init(Context context, Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        AbstractC4163b.m11305c("init in process " + C4442g.m12698a(context) + " pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        C4166a.m11308a(context).mo41253a(config, iEventProcessor, iPerfProcessor);
        if (C4442g.m12700a(context)) {
            AbstractC4163b.m11305c("init in process　start scheduleJob");
            C4166a.m11308a(context).m11316a();
        }
    }

    public static void reportEvent(Context context, EventClientReport eventClientReport) {
        if (eventClientReport != null) {
            C4166a.m11308a(context).mo41254a(eventClientReport);
        }
    }

    public static void reportPerf(Context context, PerfClientReport perfClientReport) {
        if (perfClientReport != null) {
            C4166a.m11308a(context).mo41255a(perfClientReport);
        }
    }

    public static void updateConfig(Context context, Config config) {
        if (config != null) {
            C4166a.m11308a(context).mo41256a(config.isEventUploadSwitchOpen(), config.isPerfUploadSwitchOpen(), config.getEventUploadFrequency(), config.getPerfUploadFrequency());
        }
    }
}
