package com.xiaomi.push;

import com.xiaomi.push.C4251ai;

/* renamed from: com.xiaomi.push.aj */
public class C4254aj extends C4251ai.RunnableC4253b {

    /* renamed from: a */
    public final /* synthetic */ C4251ai f11361a;

    /* renamed from: a */
    public final /* synthetic */ String f11362a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4254aj(C4251ai aiVar, C4251ai.AbstractRunnableC4252a aVar, String str) {
        super(aVar);
        this.f11361a = aiVar;
        this.f11362a = str;
    }

    @Override // com.xiaomi.push.C4251ai.RunnableC4253b
    /* renamed from: a */
    public void mo41480a() {
        super.mo41480a();
    }

    @Override // com.xiaomi.push.C4251ai.RunnableC4253b
    /* renamed from: b */
    public void mo41481b() {
        C4251ai.m11639a(this.f11361a).edit().putLong(this.f11362a, System.currentTimeMillis()).commit();
    }
}
