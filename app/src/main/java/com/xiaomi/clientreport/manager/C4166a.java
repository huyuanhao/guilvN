package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.C4164a;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4287bh;
import com.xiaomi.push.C4288bi;
import com.xiaomi.push.C4291bl;
import com.xiaomi.push.C4294bo;
import com.xiaomi.push.RunnableC4286bg;
import com.xiaomi.push.RunnableC4289bj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.xiaomi.clientreport.manager.a */
public class C4166a {

    /* renamed from: a */
    public static volatile C4166a f11170a;

    /* renamed from: a */
    public Context f11171a;

    /* renamed from: a */
    public Config f11172a;

    /* renamed from: a */
    public IEventProcessor f11173a;

    /* renamed from: a */
    public IPerfProcessor f11174a;

    /* renamed from: a */
    public HashMap<String, HashMap<String, C4164a>> f11175a = new HashMap<>();

    /* renamed from: a */
    public ExecutorService f11176a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public HashMap<String, ArrayList<C4164a>> f11177b = new HashMap<>();

    public C4166a(Context context) {
        this.f11171a = context;
    }

    /* renamed from: a */
    public static C4166a m11308a(Context context) {
        if (f11170a == null) {
            synchronized (C4166a.class) {
                if (f11170a == null) {
                    f11170a = new C4166a(context);
                }
            }
        }
        return f11170a;
    }

    /* renamed from: a */
    private void m11312a(Runnable runnable, int i) {
        C4251ai.m11641a(this.f11171a).mo41475a(runnable, i);
    }

    /* renamed from: d */
    private void m11313d() {
        if (m11308a(this.f11171a).mo41252a().isEventUploadSwitchOpen()) {
            C4287bh bhVar = new C4287bh(this.f11171a);
            int eventUploadFrequency = (int) m11308a(this.f11171a).mo41252a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - C4294bo.m11827a(this.f11171a).mo41525a("sp_client_report_status", "event_last_upload_time", 0L) > ((long) (eventUploadFrequency * 1000))) {
                C4251ai.m11641a(this.f11171a).mo41475a(new RunnableC4169d(this, bhVar), 10);
            }
            synchronized (C4166a.class) {
                if (!C4251ai.m11641a(this.f11171a).mo41477a((C4251ai.AbstractRunnableC4252a) bhVar, eventUploadFrequency)) {
                    C4251ai.m11641a(this.f11171a).m11647a(100886);
                    C4251ai.m11641a(this.f11171a).mo41477a((C4251ai.AbstractRunnableC4252a) bhVar, eventUploadFrequency);
                }
            }
        }
    }

    /* renamed from: e */
    private void m11314e() {
        if (m11308a(this.f11171a).mo41252a().isPerfUploadSwitchOpen()) {
            C4288bi biVar = new C4288bi(this.f11171a);
            int perfUploadFrequency = (int) m11308a(this.f11171a).mo41252a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - C4294bo.m11827a(this.f11171a).mo41525a("sp_client_report_status", "perf_last_upload_time", 0L) > ((long) (perfUploadFrequency * 1000))) {
                C4251ai.m11641a(this.f11171a).mo41475a(new RunnableC4170e(this, biVar), 15);
            }
            synchronized (C4166a.class) {
                if (!C4251ai.m11641a(this.f11171a).mo41477a((C4251ai.AbstractRunnableC4252a) biVar, perfUploadFrequency)) {
                    C4251ai.m11641a(this.f11171a).m11647a(100887);
                    C4251ai.m11641a(this.f11171a).mo41477a((C4251ai.AbstractRunnableC4252a) biVar, perfUploadFrequency);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized Config mo41252a() {
        if (this.f11172a == null) {
            this.f11172a = Config.defaultConfig(this.f11171a);
        }
        return this.f11172a;
    }

    /* renamed from: a */
    public void m11316a() {
        m11308a(this.f11171a).m11313d();
        m11308a(this.f11171a).m11314e();
    }

    /* renamed from: a */
    public void mo41253a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f11172a = config;
        this.f11173a = iEventProcessor;
        this.f11174a = iPerfProcessor;
        iEventProcessor.setEventMap(this.f11177b);
        this.f11174a.setPerfMap(this.f11175a);
    }

    /* renamed from: a */
    public void mo41254a(EventClientReport eventClientReport) {
        if (mo41252a().isEventUploadSwitchOpen()) {
            this.f11176a.execute(new RunnableC4286bg(this.f11171a, eventClientReport, this.f11173a));
            m11312a(new RunnableC4167b(this), 30);
        }
    }

    /* renamed from: a */
    public void mo41255a(PerfClientReport perfClientReport) {
        if (mo41252a().isPerfUploadSwitchOpen()) {
            this.f11176a.execute(new RunnableC4286bg(this.f11171a, perfClientReport, this.f11174a));
            m11312a(new RunnableC4168c(this), 30);
        }
    }

    /* renamed from: a */
    public void mo41256a(boolean z, boolean z2, long j, long j2) {
        Config config = this.f11172a;
        if (config == null) {
            return;
        }
        if (z != config.isEventUploadSwitchOpen() || z2 != this.f11172a.isPerfUploadSwitchOpen() || j != this.f11172a.getEventUploadFrequency() || j2 != this.f11172a.getPerfUploadFrequency()) {
            long eventUploadFrequency = this.f11172a.getEventUploadFrequency();
            long perfUploadFrequency = this.f11172a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(C4291bl.m11819a(this.f11171a)).setEventEncrypted(this.f11172a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f11171a);
            this.f11172a = build;
            if (!build.isEventUploadSwitchOpen()) {
                C4251ai.m11641a(this.f11171a).m11647a(100886);
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                AbstractC4163b.m11305c(this.f11171a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                m11313d();
            }
            if (!this.f11172a.isPerfUploadSwitchOpen()) {
                C4251ai.m11641a(this.f11171a).m11647a(100887);
            } else if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                AbstractC4163b.m11305c(this.f11171a.getPackageName() + "reset perf job " + build.getPerfUploadFrequency());
                m11314e();
            }
        }
    }

    /* renamed from: b */
    public void mo41257b() {
        if (mo41252a().isEventUploadSwitchOpen()) {
            RunnableC4289bj bjVar = new RunnableC4289bj();
            bjVar.mo41519a(this.f11171a);
            bjVar.mo41520a(this.f11173a);
            this.f11176a.execute(bjVar);
        }
    }

    /* renamed from: c */
    public void mo41258c() {
        if (mo41252a().isPerfUploadSwitchOpen()) {
            RunnableC4289bj bjVar = new RunnableC4289bj();
            bjVar.mo41520a(this.f11174a);
            bjVar.mo41519a(this.f11171a);
            this.f11176a.execute(bjVar);
        }
    }
}
