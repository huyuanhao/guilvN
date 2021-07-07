package com.qiyukf.nimlib.p176b;

import android.content.Context;
import android.content.SharedPreferences;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1847c;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.p180e.C2238d;
import org.json.JSONObject;

/* renamed from: com.qiyukf.nimlib.b.b */
public final class C2183b extends AbstractC2182a {

    /* renamed from: com.qiyukf.nimlib.b.b$a */
    public static class C2184a {

        /* renamed from: a */
        public static final C2183b f4365a = new C2183b((byte) 0);
    }

    public C2183b() {
        this.f4361a = m4500a("loc");
        this.f4362b = m4500a("wifi");
        this.f4363c = m4500a("ipc_ack");
        this.f4364d = m4500a("self_kill");
        String d = mo34769d();
        C1709a.m3011a(d, "read sdk config from SP, " + toString());
    }

    public /* synthetic */ C2183b(byte b) {
        this();
    }

    /* renamed from: a */
    public static void m4499a(String str, boolean z) {
        C1847c.m3503a(m4502f(), str, z);
    }

    /* renamed from: a */
    public static boolean m4500a(String str) {
        return m4502f().getBoolean(str, true);
    }

    /* renamed from: e */
    public static C2183b m4501e() {
        return C2184a.f4365a;
    }

    /* renamed from: f */
    public static SharedPreferences m4502f() {
        Context a = C2180b.m4471a();
        return a.getSharedPreferences("NIMSDK_CONFIG_STRATEGY_" + C2180b.m4482g(), 0);
    }

    /* renamed from: a */
    public final void mo34771a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (jSONObject != null) {
            boolean z5 = false;
            try {
                boolean z6 = true;
                if (jSONObject.has("loc") && (z4 = jSONObject.getBoolean("loc")) != this.f4361a) {
                    this.f4361a = z4;
                    z5 = true;
                }
                if (jSONObject.has("wifi") && (z3 = jSONObject.getBoolean("wifi")) != this.f4362b) {
                    this.f4362b = z3;
                    z5 = true;
                }
                if (jSONObject.has("ipc_ack") && (z2 = jSONObject.getBoolean("ipc_ack")) != this.f4363c) {
                    this.f4363c = z2;
                    z5 = true;
                }
                if (!jSONObject.has("self_kill") || (z = jSONObject.getBoolean("self_kill")) == this.f4364d) {
                    z6 = z5;
                } else {
                    this.f4364d = z;
                }
                String d = mo34769d();
                C1709a.m3011a(d, "read sdk config from lbs, " + toString() + ", changed=" + z6);
                if (z6) {
                    m4499a("loc", this.f4361a);
                    m4499a("wifi", this.f4362b);
                    m4499a("ipc_ack", this.f4363c);
                    m4499a("self_kill", this.f4364d);
                    String d2 = mo34769d();
                    C1709a.m3011a(d2, "write sdk config to SP, " + toString());
                    C2238d.m4685b();
                    C1709a.m3011a(mo34769d(), "notify sdk config to UI...");
                }
            } catch (Throwable th) {
                String d3 = mo34769d();
                C1709a.m3011a(d3, "read sdk config from lbs error, e=" + th.getMessage());
            }
        }
    }

    @Override // com.qiyukf.nimlib.p176b.AbstractC2182a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo34766a() {
        return super.mo34766a();
    }

    @Override // com.qiyukf.nimlib.p176b.AbstractC2182a
    /* renamed from: b */
    public final String mo34767b() {
        return "push";
    }

    @Override // com.qiyukf.nimlib.p176b.AbstractC2182a
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ String mo34768c() {
        return super.mo34768c();
    }

    @Override // com.qiyukf.nimlib.p176b.AbstractC2182a
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
