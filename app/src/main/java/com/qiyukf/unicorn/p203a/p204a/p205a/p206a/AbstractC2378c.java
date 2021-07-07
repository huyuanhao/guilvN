package com.qiyukf.unicorn.p203a.p204a.p205a.p206a;

import com.qiyukf.unicorn.p213f.p214a.AbstractC2558d;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2551d;

/* renamed from: com.qiyukf.unicorn.a.a.a.a.c */
public abstract class AbstractC2378c extends AbstractC2558d {

    /* renamed from: a */
    public AbstractC2597e f4764a;

    /* renamed from: a */
    public final AbstractC2597e mo35275a() {
        return this.f4764a;
    }

    /* renamed from: a */
    public final void mo35276a(AbstractC2597e eVar) {
        this.f4764a = eVar;
    }

    /* renamed from: b */
    public final String mo35277b() {
        AbstractC2551d dVar = (AbstractC2551d) getClass().getAnnotation(AbstractC2551d.class);
        if (dVar != null) {
            return dVar.mo35943a();
        }
        return null;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String toJson(boolean z) {
        return this.f4764a.toJson(z);
    }
}
