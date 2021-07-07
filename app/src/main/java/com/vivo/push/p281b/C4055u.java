package com.vivo.push.p281b;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.u */
public class C4055u extends AbstractC4160y {

    /* renamed from: a */
    public String f10941a = null;

    /* renamed from: b */
    public int f10942b = 0;

    public C4055u(int i) {
        super(i);
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public void mo40898c(C4026a aVar) {
        aVar.mo40880a("req_id", this.f10941a);
        aVar.mo40877a("status_msg_code", this.f10942b);
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public void mo40899d(C4026a aVar) {
        this.f10941a = aVar.mo40876a("req_id");
        this.f10942b = aVar.mo40883b("status_msg_code", this.f10942b);
    }

    /* renamed from: g */
    public final String mo40931g() {
        return this.f10941a;
    }

    /* renamed from: h */
    public final int mo40932h() {
        return this.f10942b;
    }

    @Override // com.vivo.push.AbstractC4160y
    public String toString() {
        return "OnReceiveCommand";
    }
}
