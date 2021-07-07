package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.manager.C4166a;
import com.xiaomi.push.C4251ai;

/* renamed from: com.xiaomi.push.bh */
public class C4287bh extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public Context f11429a;

    public C4287bh(Context context) {
        this.f11429a = context;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    private boolean mo41384a() {
        return C4166a.m11308a(this.f11429a).mo41252a().isEventUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int m11813a() {
        return 100886;
    }

    public void run() {
        try {
            if (mo41384a()) {
                AbstractC4163b.m11305c(this.f11429a.getPackageName() + " begin upload event");
                C4166a.m11308a(this.f11429a).mo41257b();
            }
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
        }
    }
}
