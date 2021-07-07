package com.xiaomi.push;

import com.xiaomi.push.C4251ai;

/* renamed from: com.xiaomi.push.ak */
public class C4255ak extends C4251ai.RunnableC4253b {

    /* renamed from: a */
    public final /* synthetic */ C4251ai f11363a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4255ak(C4251ai aiVar, C4251ai.AbstractRunnableC4252a aVar) {
        super(aVar);
        this.f11363a = aiVar;
    }

    @Override // com.xiaomi.push.C4251ai.RunnableC4253b
    /* renamed from: b */
    public void mo41481b() {
        synchronized (C4251ai.m11642a(this.f11363a)) {
            C4251ai.m11640a(this.f11363a).remove(super.f11360a.mo41384a());
        }
    }
}
