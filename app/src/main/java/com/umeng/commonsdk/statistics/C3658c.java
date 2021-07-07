package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.C3516a;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3569al;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.proguard.C3633w;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.idtracking.C3676e;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.AbstractC3701d;
import com.umeng.commonsdk.statistics.internal.C3696a;
import com.umeng.commonsdk.statistics.internal.C3700c;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.proto.Response;
import java.io.File;

/* renamed from: com.umeng.commonsdk.statistics.c */
public class C3658c {

    /* renamed from: b */
    public static final int f9565b = 1;

    /* renamed from: c */
    public static final int f9566c = 2;

    /* renamed from: d */
    public static final int f9567d = 3;

    /* renamed from: o */
    public static final String f9568o = "thtstart";

    /* renamed from: p */
    public static final String f9569p = "gkvc";

    /* renamed from: q */
    public static final String f9570q = "ekvc";

    /* renamed from: a */
    public String f9571a = null;

    /* renamed from: e */
    public final int f9572e = 1;

    /* renamed from: f */
    public C3700c f9573f;

    /* renamed from: g */
    public ImprintHandler f9574g;

    /* renamed from: h */
    public C3676e f9575h;

    /* renamed from: i */
    public ImprintHandler.C3671a f9576i = null;

    /* renamed from: j */
    public ABTest f9577j = null;

    /* renamed from: k */
    public Defcon f9578k = null;

    /* renamed from: l */
    public long f9579l = 0;

    /* renamed from: m */
    public int f9580m = 0;

    /* renamed from: n */
    public int f9581n = 0;

    /* renamed from: r */
    public Context f9582r;

    /* renamed from: s */
    public ReportPolicy.ReportStrategy f9583s = null;

    public C3658c(Context context) {
        this.f9582r = context;
        this.f9576i = ImprintHandler.getImprintService(context).mo39228c();
        this.f9578k = Defcon.getService(this.f9582r);
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f9582r);
        this.f9579l = sharedPreferences.getLong("thtstart", 0);
        this.f9580m = sharedPreferences.getInt("gkvc", 0);
        this.f9581n = sharedPreferences.getInt("ekvc", 0);
        this.f9571a = UMEnvelopeBuild.imprintProperty(this.f9582r, "track_list", null);
        ImprintHandler imprintService = ImprintHandler.getImprintService(this.f9582r);
        this.f9574g = imprintService;
        imprintService.mo39222a(new AbstractC3701d() {
            /* class com.umeng.commonsdk.statistics.C3658c.C36591 */

            @Override // com.umeng.commonsdk.statistics.internal.AbstractC3701d
            public void onImprintChanged(ImprintHandler.C3671a aVar) {
                C3658c.this.f9578k.onImprintChanged(aVar);
                C3658c cVar = C3658c.this;
                cVar.f9571a = UMEnvelopeBuild.imprintProperty(cVar.f9582r, "track_list", null);
                String a = C3516a.m9023a(C3658c.this.f9582r, C3617o.f9376e, (String) null);
                if (!TextUtils.isEmpty(a)) {
                    try {
                        Class<?> cls = Class.forName("com.umeng.commonsdk.internal.utils.SDStorageAgent");
                        if (cls != null) {
                            cls.getMethod("updateUMTT", Context.class, String.class).invoke(cls, C3658c.this.f9582r, a);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.f9575h = C3676e.m9914a(this.f9582r);
        C3700c cVar = new C3700c(this.f9582r);
        this.f9573f = cVar;
        cVar.mo39280a(StatTracer.getInstance(this.f9582r));
    }

    /* renamed from: a */
    public boolean mo39178a(File file) {
        int i;
        boolean z;
        if (file == null) {
            return false;
        }
        try {
            byte[] byteArray = UMFrUtils.toByteArray(file.getPath());
            if (byteArray == null) {
                return false;
            }
            C3696a.m9958a(this.f9582r).mo39279c(file.getName());
            boolean a = C3696a.m9958a(this.f9582r).mo39276a(file.getName());
            boolean b = C3696a.m9958a(this.f9582r).mo39278b(file.getName());
            byte[] a2 = this.f9573f.mo39282a(byteArray, a);
            if (a2 == null) {
                i = 1;
            } else {
                if (!a) {
                    if (!b) {
                        z = false;
                        i = m9783a(a2, z);
                    }
                }
                z = true;
                i = m9783a(a2, z);
            }
            if (i == 2) {
                this.f9575h.mo39250d();
                StatTracer.getInstance(this.f9582r).saveSate();
            } else if (i == 3) {
                StatTracer.getInstance(this.f9582r).saveSate();
            }
            if (i == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9582r, th);
            return false;
        }
    }

    /* renamed from: a */
    private int m9783a(byte[] bArr, boolean z) {
        Response response = new Response();
        try {
            new C3633w(new C3569al.C3570a()).mo39073a(response, bArr);
            if (response.resp_code == 1) {
                this.f9574g.mo39227b(response.getImprint());
                this.f9574g.mo39229d();
            }
            if (z) {
                MLog.m9799i("send log:" + response.getMsg());
            } else {
                MLog.m9799i("inner req:" + response.getMsg());
            }
            if (z) {
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "send log: " + response.getMsg());
            } else {
                UMRTLog.m9012i(UMRTLog.RTLOG_TAG, "inner req: " + response.getMsg());
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9582r, th);
        }
        return response.resp_code == 1 ? 2 : 3;
    }
}
