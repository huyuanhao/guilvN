package com.xiaomi.push;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.gj */
public class C4453gj extends AbstractC4456gl {

    /* renamed from: a */
    public C4454a f12022a = C4454a.f12024a;

    /* renamed from: a */
    public final Map<String, String> f12023a = new HashMap();

    /* renamed from: com.xiaomi.push.gj$a */
    public static class C4454a {

        /* renamed from: a */
        public static final C4454a f12024a = new C4454a("get");

        /* renamed from: b */
        public static final C4454a f12025b = new C4454a("set");

        /* renamed from: c */
        public static final C4454a f12026c = new C4454a("result");

        /* renamed from: d */
        public static final C4454a f12027d = new C4454a("error");

        /* renamed from: e */
        public static final C4454a f12028e = new C4454a("command");

        /* renamed from: a */
        public String f12029a;

        public C4454a(String str) {
            this.f12029a = str;
        }

        /* renamed from: a */
        public static C4454a m12754a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            if (f12024a.toString().equals(lowerCase)) {
                return f12024a;
            }
            if (f12025b.toString().equals(lowerCase)) {
                return f12025b;
            }
            if (f12027d.toString().equals(lowerCase)) {
                return f12027d;
            }
            if (f12026c.toString().equals(lowerCase)) {
                return f12026c;
            }
            if (f12028e.toString().equals(lowerCase)) {
                return f12028e;
            }
            return null;
        }

        public String toString() {
            return this.f12029a;
        }
    }

    public C4453gj() {
    }

    public C4453gj(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_iq_type")) {
            this.f12022a = C4454a.m12754a(bundle.getString("ext_iq_type"));
        }
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public Bundle mo41938a() {
        Bundle a = super.mo41938a();
        C4454a aVar = this.f12022a;
        if (aVar != null) {
            a.putString("ext_iq_type", aVar.toString());
        }
        return a;
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public C4454a m12749a() {
        return this.f12022a;
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public String m12750a() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (mo41966j() != null) {
            sb.append("id=\"" + mo41966j() + "\" ");
        }
        if (mo41969l() != null) {
            sb.append("to=\"");
            sb.append(C4470gw.m12831a(mo41969l()));
            sb.append("\" ");
        }
        if (mo41971m() != null) {
            sb.append("from=\"");
            sb.append(C4470gw.m12831a(mo41971m()));
            sb.append("\" ");
        }
        if (mo41967k() != null) {
            sb.append("chid=\"");
            sb.append(C4470gw.m12831a(mo41967k()));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f12023a.entrySet()) {
            sb.append(C4470gw.m12831a(entry.getKey()));
            sb.append("=\"");
            sb.append(C4470gw.m12831a(entry.getValue()));
            sb.append("\" ");
        }
        if (this.f12022a == null) {
            str = "type=\"get\">";
        } else {
            sb.append("type=\"");
            sb.append(m12749a());
            str = "\">";
        }
        sb.append(str);
        String b = mo41941b();
        if (b != null) {
            sb.append(b);
        }
        sb.append(mo41975o());
        C4462gp a = m12782a();
        if (a != null) {
            sb.append(a.m12810a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41939a(C4454a aVar) {
        if (aVar == null) {
            aVar = C4454a.f12024a;
        }
        this.f12022a = aVar;
    }

    /* renamed from: a */
    public synchronized void mo41940a(Map<String, String> map) {
        this.f12023a.putAll(map);
    }

    @Override // com.xiaomi.push.AbstractC4456gl
    /* renamed from: b */
    public String mo41941b() {
        return null;
    }
}
