package com.qiyukf.nimlib.p155a;

import android.text.TextUtils;
import com.qiyukf.nimlib.p183g.p191c.p193b.C2293b;
import com.qiyukf.nimlib.sdk.auth.OnlineClient;

/* renamed from: com.qiyukf.nimlib.a.a */
public final class C2107a implements OnlineClient {
    public static final long serialVersionUID = 1;

    /* renamed from: a */
    public int f4242a;

    /* renamed from: b */
    public String f4243b;

    /* renamed from: c */
    public int f4244c;

    /* renamed from: d */
    public String f4245d;

    /* renamed from: e */
    public String f4246e;

    /* renamed from: f */
    public String f4247f;

    /* renamed from: a */
    public static C2107a m4276a(C2293b bVar) {
        C2107a aVar = new C2107a();
        aVar.f4242a = bVar.mo34956b(3);
        aVar.f4243b = bVar.mo34953a(4);
        aVar.f4244c = bVar.mo34956b(109);
        aVar.f4245d = bVar.mo34953a(103);
        aVar.f4246e = bVar.mo34953a(102);
        aVar.f4247f = bVar.mo34953a(13);
        return aVar;
    }

    /* renamed from: a */
    public final String mo34631a() {
        return this.f4247f;
    }

    /* renamed from: a */
    public final void mo34632a(String str) {
        this.f4247f = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2107a)) {
            return false;
        }
        return TextUtils.equals(this.f4247f, ((C2107a) obj).f4247f);
    }

    @Override // com.qiyukf.nimlib.sdk.auth.OnlineClient
    public final String getClientIp() {
        return this.f4245d;
    }

    @Override // com.qiyukf.nimlib.sdk.auth.OnlineClient
    public final int getClientType() {
        return this.f4242a;
    }

    @Override // com.qiyukf.nimlib.sdk.auth.OnlineClient
    public final int getLoginTime() {
        return this.f4244c;
    }

    @Override // com.qiyukf.nimlib.sdk.auth.OnlineClient
    public final String getOs() {
        return this.f4243b;
    }
}
