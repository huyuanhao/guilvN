package com.vivo.push.p281b;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.ac */
public final class C4034ac extends AbstractC4160y {

    /* renamed from: a */
    public String f10910a;

    public C4034ac(String str) {
        super(2008);
        this.f10910a = str;
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        aVar.mo40880a("package_name", this.f10910a);
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        this.f10910a = aVar.mo40876a("package_name");
    }

    @Override // com.vivo.push.AbstractC4160y
    public final String toString() {
        return "StopServiceCommand";
    }

    public C4034ac() {
        super(2008);
    }
}
