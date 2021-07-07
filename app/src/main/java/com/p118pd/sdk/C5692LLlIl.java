package com.p118pd.sdk;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.LL丨l丨Il丨  reason: invalid class name and case insensitive filesystem */
public class C5692LLlIl implements AbstractC6186iLi1 {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set f16537OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16538OooO00o;
    public Set OooO0O0 = new HashSet();

    public C5692LLlIl(Set set) {
        this.f16537OooO00o = set;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m16270OooO00o() {
        HashSet hashSet = new HashSet(this.f16537OooO00o);
        hashSet.removeAll(this.OooO0O0);
        return hashSet;
    }

    public void OooO00o(LlLI1 llLI1) {
        this.OooO0O0.add(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
    }

    public void OooO00o(boolean z) {
        this.f16538OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16271OooO00o() {
        return this.f16538OooO00o;
    }
}
