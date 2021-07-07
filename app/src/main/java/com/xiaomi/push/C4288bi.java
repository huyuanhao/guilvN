package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.manager.C4166a;
import com.xiaomi.push.C4251ai;

/* renamed from: com.xiaomi.push.bi */
public class C4288bi extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public Context f11430a;

    public C4288bi(Context context) {
        this.f11430a = context;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    private boolean mo41384a() {
        return C4166a.m11308a(this.f11430a).mo41252a().isPerfUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int m11815a() {
        return 100887;
    }

    public void run() {
        try {
            if (mo41384a()) {
                C4166a.m11308a(this.f11430a).mo41258c();
                AbstractC4163b.m11305c(this.f11430a.getPackageName() + "perf  begin upload");
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }
}
