package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.processor.AbstractC4173c;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;

/* renamed from: com.xiaomi.push.bj */
public class RunnableC4289bj implements Runnable {

    /* renamed from: a */
    public Context f11431a;

    /* renamed from: a */
    public AbstractC4173c f11432a;

    /* renamed from: a */
    public void mo41519a(Context context) {
        this.f11431a = context;
    }

    /* renamed from: a */
    public void mo41520a(AbstractC4173c cVar) {
        this.f11432a = cVar;
    }

    public void run() {
        C4294bo a;
        String str;
        long currentTimeMillis;
        try {
            if (this.f11432a != null) {
                this.f11432a.mo41267a();
            }
            AbstractC4163b.m11305c("begin read and send perf / event");
            if (this.f11432a instanceof IEventProcessor) {
                a = C4294bo.m11827a(this.f11431a);
                str = "event_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else if (this.f11432a instanceof IPerfProcessor) {
                a = C4294bo.m11827a(this.f11431a);
                str = "perf_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else {
                return;
            }
            a.m11830a("sp_client_report_status", str, currentTimeMillis);
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }
}
