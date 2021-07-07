package com.qiyukf.nim.uikit.session.p152b;

import com.qiyukf.nim.uikit.common.media.p146a.AbstractC1891b;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.msg.attachment.AudioAttachment;

/* renamed from: com.qiyukf.nim.uikit.session.b.a */
public class C1964a implements AbstractC1891b {

    /* renamed from: a */
    public IMMessage f3835a;

    public C1964a(IMMessage iMMessage) {
        this.f3835a = iMMessage;
    }

    @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1891b
    /* renamed from: a */
    public final long mo34210a() {
        return ((AudioAttachment) this.f3835a.getAttachment()).getDuration();
    }

    @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1891b
    /* renamed from: a */
    public final boolean mo34211a(AbstractC1891b bVar) {
        if (C1964a.class.isInstance(bVar)) {
            return this.f3835a.isTheSame(((C1964a) bVar).f3835a);
        }
        return false;
    }

    @Override // com.qiyukf.nim.uikit.common.media.p146a.AbstractC1891b
    /* renamed from: b */
    public final String mo34212b() {
        return ((AudioAttachment) this.f3835a.getAttachment()).getPath();
    }

    /* renamed from: c */
    public final IMMessage mo34391c() {
        return this.f3835a;
    }
}
