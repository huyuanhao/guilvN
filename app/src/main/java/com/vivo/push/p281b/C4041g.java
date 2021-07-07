package com.vivo.push.p281b;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.g */
public final class C4041g extends AbstractC4160y {

    /* renamed from: a */
    public int f10923a = -1;

    public C4041g() {
        super(2015);
    }

    /* renamed from: a */
    public static boolean m10929a(int i) {
        return i > 0 && i <= 4;
    }

    /* renamed from: b */
    public final void mo40911b(int i) {
        this.f10923a = i;
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        if (m10929a(this.f10923a)) {
            aVar.mo40877a("environment", this.f10923a);
        }
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        this.f10923a = aVar.mo40883b("environment", 1);
    }
}
