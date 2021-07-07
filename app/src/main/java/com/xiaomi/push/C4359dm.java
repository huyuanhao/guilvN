package com.xiaomi.push;

import com.xiaomi.push.C4256al;
import com.xiaomi.push.C4354dk;

/* renamed from: com.xiaomi.push.dm */
public class C4359dm extends C4256al.AbstractC4258b {

    /* renamed from: a */
    public C4256al.AbstractC4258b f11615a;

    /* renamed from: a */
    public final /* synthetic */ C4354dk f11616a;

    public C4359dm(C4354dk dkVar) {
        this.f11616a = dkVar;
    }

    @Override // com.xiaomi.push.C4256al.AbstractC4258b
    /* renamed from: b */
    public void mo41488b() {
        C4354dk.C4356b bVar = (C4354dk.C4356b) C4354dk.m12091a(this.f11616a).peek();
        if (bVar != null && bVar.mo41487a()) {
            if (C4354dk.m12091a(this.f11616a).remove(bVar)) {
                this.f11615a = bVar;
            }
            C4256al.AbstractC4258b bVar2 = this.f11615a;
            if (bVar2 != null) {
                bVar2.mo41488b();
            }
        }
    }

    @Override // com.xiaomi.push.C4256al.AbstractC4258b
    /* renamed from: c */
    public void mo41489c() {
        C4256al.AbstractC4258b bVar = this.f11615a;
        if (bVar != null) {
            bVar.mo41489c();
        }
    }
}
