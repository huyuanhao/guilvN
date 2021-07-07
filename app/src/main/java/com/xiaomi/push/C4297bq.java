package com.xiaomi.push;

import com.umeng.message.proguard.C3848l;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.Date;

/* renamed from: com.xiaomi.push.bq */
public class C4297bq implements AbstractC4439fx {

    /* renamed from: a */
    public final /* synthetic */ C4295bp f11446a;

    public C4297bq(C4295bp bpVar) {
        this.f11446a = bpVar;
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41529a(AbstractC4435fu fuVar) {
        AbstractC4163b.m11305c("[Slim] " + C4295bp.m11833a(this.f11446a).format(new Date()) + " Connection reconnected (" + C4295bp.m11832a(this.f11446a).hashCode() + C3848l.f10402t);
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41530a(AbstractC4435fu fuVar, int i, Exception exc) {
        AbstractC4163b.m11305c("[Slim] " + C4295bp.m11833a(this.f11446a).format(new Date()) + " Connection closed (" + C4295bp.m11832a(this.f11446a).hashCode() + C3848l.f10402t);
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: a */
    public void mo41531a(AbstractC4435fu fuVar, Exception exc) {
        AbstractC4163b.m11305c("[Slim] " + C4295bp.m11833a(this.f11446a).format(new Date()) + " Reconnection failed due to an exception (" + C4295bp.m11832a(this.f11446a).hashCode() + C3848l.f10402t);
        exc.printStackTrace();
    }

    @Override // com.xiaomi.push.AbstractC4439fx
    /* renamed from: b */
    public void mo41532b(AbstractC4435fu fuVar) {
        AbstractC4163b.m11305c("[Slim] " + C4295bp.m11833a(this.f11446a).format(new Date()) + " Connection started (" + C4295bp.m11832a(this.f11446a).hashCode() + C3848l.f10402t);
    }
}
