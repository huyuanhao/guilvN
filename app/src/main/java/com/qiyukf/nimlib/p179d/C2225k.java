package com.qiyukf.nimlib.p179d;

import com.qiyukf.nimlib.p179d.C2218i;
import com.qiyukf.nimlib.sdk.AbortableFuture;
import com.qiyukf.unicorn.api.RequestCallback;

/* renamed from: com.qiyukf.nimlib.d.k */
public class C2225k implements AbortableFuture {

    /* renamed from: a */
    public RequestCallback f4433a;

    /* renamed from: b */
    public C2218i f4434b;

    public C2225k(C2218i iVar) {
        this.f4434b = iVar;
    }

    /* renamed from: a */
    public final void mo34844a() {
        RequestCallback requestCallback = this.f4433a;
        if (requestCallback != null) {
            C2218i.C2221c cVar = this.f4434b.f4417b;
            int i = cVar.f4424a;
            Object obj = cVar.f4425b;
            if (i == 200) {
                requestCallback.onSuccess(obj);
            } else if (obj instanceof Throwable) {
                requestCallback.onException((Throwable) obj);
            } else {
                requestCallback.onFailed(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo34845a(int i, Object obj) {
        this.f4434b.mo34825a(i);
        this.f4434b.mo34826a(obj);
    }

    @Override // com.qiyukf.nimlib.sdk.AbortableFuture
    public boolean abort() {
        return C2206a.m4592b(this.f4434b);
    }

    @Override // com.qiyukf.nimlib.sdk.InvocationFuture
    public final void setCallback(RequestCallback requestCallback) {
        this.f4433a = requestCallback;
    }
}
