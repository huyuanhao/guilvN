package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.bc */
public final class C3339bc extends AbstractC3357m implements Cloneable {

    /* renamed from: b */
    public static ArrayList<C3338bb> f8120b;

    /* renamed from: a */
    public ArrayList<C3338bb> f8121a = null;

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38482a((Collection) this.f8121a, 0);
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        if (f8120b == null) {
            f8120b = new ArrayList<>();
            f8120b.add(new C3338bb());
        }
        this.f8121a = (ArrayList) kVar.mo38453a((Object) f8120b, 0, true);
    }
}
