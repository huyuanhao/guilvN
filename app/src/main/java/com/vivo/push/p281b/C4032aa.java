package com.vivo.push.p281b;

import com.umeng.message.proguard.C3848l;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;
import java.util.HashMap;

/* renamed from: com.vivo.push.b.aa */
public final class C4032aa extends AbstractC4160y {

    /* renamed from: a */
    public HashMap<String, String> f10908a;

    /* renamed from: b */
    public long f10909b;

    public C4032aa() {
        super(2012);
    }

    /* renamed from: a */
    public final void mo40901a(HashMap<String, String> hashMap) {
        this.f10908a = hashMap;
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public final void mo40898c(C4026a aVar) {
        aVar.mo40879a("ReporterCommand.EXTRA_PARAMS", this.f10908a);
        aVar.mo40878a("ReporterCommand.EXTRA_REPORTER_TYPE", this.f10909b);
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public final void mo40899d(C4026a aVar) {
        this.f10908a = (HashMap) aVar.mo40887c("ReporterCommand.EXTRA_PARAMS");
        this.f10909b = aVar.mo40884b("ReporterCommand.EXTRA_REPORTER_TYPE", this.f10909b);
    }

    @Override // com.vivo.push.AbstractC4160y
    public final String toString() {
        return "ReporterCommand（" + this.f10909b + C3848l.f10402t;
    }

    public C4032aa(long j) {
        this();
        this.f10909b = j;
    }
}
