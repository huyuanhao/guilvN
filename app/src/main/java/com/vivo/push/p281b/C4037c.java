package com.vivo.push.p281b;

import android.text.TextUtils;
import com.vivo.push.AbstractC4160y;
import com.vivo.push.C4026a;

/* renamed from: com.vivo.push.b.c */
public class C4037c extends AbstractC4160y {

    /* renamed from: a */
    public String f10916a;

    /* renamed from: b */
    public String f10917b;

    /* renamed from: c */
    public long f10918c = -1;

    /* renamed from: d */
    public int f10919d = -1;

    /* renamed from: e */
    public int f10920e;

    /* renamed from: f */
    public String f10921f;

    public C4037c(int i, String str, String str2) {
        super(i);
        this.f10916a = str;
        this.f10917b = str2;
    }

    /* renamed from: a */
    public final void mo40905a(int i) {
        this.f10920e = i;
    }

    /* renamed from: b */
    public final void mo40906b(String str) {
        this.f10916a = str;
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: c */
    public void mo40898c(C4026a aVar) {
        aVar.mo40880a("req_id", this.f10916a);
        aVar.mo40880a("package_name", this.f10917b);
        aVar.mo40878a("sdk_version", 293L);
        aVar.mo40877a("PUSH_APP_STATUS", this.f10919d);
        if (!TextUtils.isEmpty(this.f10921f)) {
            aVar.mo40880a("BaseAppCommand.EXTRA__HYBRIDVERSION", this.f10921f);
        }
    }

    @Override // com.vivo.push.AbstractC4160y
    /* renamed from: d */
    public void mo40899d(C4026a aVar) {
        this.f10916a = aVar.mo40876a("req_id");
        this.f10917b = aVar.mo40876a("package_name");
        this.f10918c = aVar.mo40884b("sdk_version", 0L);
        this.f10919d = aVar.mo40883b("PUSH_APP_STATUS", 0);
        this.f10921f = aVar.mo40876a("BaseAppCommand.EXTRA__HYBRIDVERSION");
    }

    /* renamed from: f */
    public final int mo40907f() {
        return this.f10920e;
    }

    /* renamed from: g */
    public final void mo40908g() {
        this.f10921f = null;
    }

    /* renamed from: h */
    public final String mo40909h() {
        return this.f10916a;
    }

    @Override // com.vivo.push.AbstractC4160y
    public String toString() {
        return "BaseAppCommand";
    }
}
