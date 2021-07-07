package com.qiyukf.nimlib.p177c;

import android.content.Context;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.C2180b;

/* renamed from: com.qiyukf.nimlib.c.c */
public final class C2204c {

    /* renamed from: b */
    public static C2204c f4387b = new C2204c();

    /* renamed from: a */
    public C2192a f4388a;

    /* renamed from: a */
    public static C2204c m4563a() {
        return f4387b;
    }

    /* renamed from: a */
    public final synchronized boolean mo34812a(Context context, String str) {
        String str2 = C2180b.m4482g() + C8932ooOOO0o.OooO0OO + str;
        String str3 = C2180b.m4479d().databaseEncryptKey;
        if (this.f4388a == null || !this.f4388a.mo34779b()) {
            this.f4388a = new C2192a(context, str2);
        }
        return mo34813b();
    }

    /* renamed from: b */
    public final boolean mo34813b() {
        C2192a aVar = this.f4388a;
        return aVar != null && aVar.mo34779b();
    }

    /* renamed from: c */
    public final synchronized void mo34814c() {
        if (this.f4388a != null) {
            this.f4388a.mo34780c();
            this.f4388a = null;
        }
    }

    /* renamed from: d */
    public final C2192a mo34815d() {
        C2192a aVar = this.f4388a;
        if (aVar != null) {
            return aVar;
        }
        C1709a.m3011a("NimDatabases", "MsgDatabase is not opened. Please login first!");
        throw new IllegalStateException("MsgDatabase is not opened. Please login first!");
    }
}
