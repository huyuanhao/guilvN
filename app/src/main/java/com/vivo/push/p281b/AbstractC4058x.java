package com.vivo.push.p281b;

import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.x */
public abstract class AbstractC4058x extends C4055u {

    /* renamed from: a */
    public String f10947a;

    /* renamed from: b */
    public long f10948b;

    public AbstractC4058x(int i) {
        super(i);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public void mo40898c(C4026a aVar) {
        super.mo40898c(aVar);
        aVar.mo40880a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f10947a);
        aVar.mo40878a("notify_id", this.f10948b);
    }

    @Override // com.vivo.push.p281b.C4055u, com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public void mo40899d(C4026a aVar) {
        super.mo40899d(aVar);
        this.f10947a = aVar.mo40876a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.f10948b = aVar.mo40884b("notify_id", -1L);
    }

    /* renamed from: f */
    public final long mo40937f() {
        return this.f10948b;
    }

    /* renamed from: i */
    public final String mo40938i() {
        return this.f10947a;
    }
}
