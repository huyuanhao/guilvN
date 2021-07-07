package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* renamed from: com.alipay.android.phone.mrpc.core.h */
public final class C0361h extends AbstractC0377w {

    /* renamed from: a */
    public Context f799a;

    public C0361h(Context context) {
        this.f799a = context;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0377w
    /* renamed from: a */
    public final <T> T mo4147a(Class<T> cls, C0349aa aaVar) {
        return (T) new C0378x(new C0362i(this, aaVar)).mo4181a(cls);
    }
}
