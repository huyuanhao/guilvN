package com.vivo.push.p281b;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.z */
public final class C4060z extends AbstractC4160y {

    /* renamed from: a */
    public int f10949a = 0;

    public C4060z() {
        super(2011);
    }

    /* renamed from: a */
    public final void mo40939a(int i) {
        this.f10949a = i;
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        aVar.mo40877a("com.bbk.push.ikey.MODE_TYPE", this.f10949a);
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final boolean mo40902c() {
        return true;
    }

    /* renamed from: d */
    public final int mo40940d() {
        return this.f10949a;
    }

    @Override // com.vivo.push.AbstractC4160y
    public final String toString() {
        return "PushModeCommand";
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        this.f10949a = aVar.mo40883b("com.bbk.push.ikey.MODE_TYPE", 0);
    }
}
