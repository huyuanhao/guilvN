package com.xiaomi.push;

import android.os.Bundle;

/* renamed from: com.xiaomi.push.gn */
public class C4458gn extends AbstractC4456gl {

    /* renamed from: a */
    public int f12057a = Integer.MIN_VALUE;

    /* renamed from: a */
    public EnumC4459a f12058a = null;

    /* renamed from: a */
    public EnumC4460b f12059a = EnumC4460b.available;

    /* renamed from: b */
    public String f12060b = null;

    /* renamed from: com.xiaomi.push.gn$a */
    public enum EnumC4459a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* renamed from: com.xiaomi.push.gn$b */
    public enum EnumC4460b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public C4458gn(Bundle bundle) {
        super(bundle);
        if (bundle.containsKey("ext_pres_type")) {
            this.f12059a = EnumC4460b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.f12060b = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.f12057a = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.f12058a = EnumC4459a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    public C4458gn(EnumC4460b bVar) {
        mo41980a(bVar);
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public Bundle mo41938a() {
        Bundle a = super.mo41938a();
        EnumC4460b bVar = this.f12059a;
        if (bVar != null) {
            a.putString("ext_pres_type", bVar.toString());
        }
        String str = this.f12060b;
        if (str != null) {
            a.putString("ext_pres_status", str);
        }
        int i = this.f12057a;
        if (i != Integer.MIN_VALUE) {
            a.putInt("ext_pres_prio", i);
        }
        EnumC4459a aVar = this.f12058a;
        if (!(aVar == null || aVar == EnumC4459a.available)) {
            a.putString("ext_pres_mode", aVar.toString());
        }
        return a;
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public String m12803a() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (mo41977p() != null) {
            sb.append(" xmlns=\"");
            sb.append(mo41977p());
            sb.append("\"");
        }
        if (mo41966j() != null) {
            sb.append(" id=\"");
            sb.append(mo41966j());
            sb.append("\"");
        }
        if (mo41969l() != null) {
            sb.append(" to=\"");
            sb.append(C4470gw.m12831a(mo41969l()));
            sb.append("\"");
        }
        if (mo41971m() != null) {
            sb.append(" from=\"");
            sb.append(C4470gw.m12831a(mo41971m()));
            sb.append("\"");
        }
        if (mo41967k() != null) {
            sb.append(" chid=\"");
            sb.append(C4470gw.m12831a(mo41967k()));
            sb.append("\"");
        }
        if (this.f12059a != null) {
            sb.append(" type=\"");
            sb.append(this.f12059a);
            sb.append("\"");
        }
        sb.append(">");
        if (this.f12060b != null) {
            sb.append("<status>");
            sb.append(C4470gw.m12831a(this.f12060b));
            sb.append("</status>");
        }
        if (this.f12057a != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.f12057a);
            sb.append("</priority>");
        }
        EnumC4459a aVar = this.f12058a;
        if (!(aVar == null || aVar == EnumC4459a.available)) {
            sb.append("<show>");
            sb.append(this.f12058a);
            sb.append("</show>");
        }
        sb.append(mo41975o());
        C4462gp a = m12782a();
        if (a != null) {
            sb.append(a.m12810a());
        }
        sb.append("</presence>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41978a(int i) {
        if (i < -128 || i > 128) {
            throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
        }
        this.f12057a = i;
    }

    /* renamed from: a */
    public void mo41979a(EnumC4459a aVar) {
        this.f12058a = aVar;
    }

    /* renamed from: a */
    public void mo41980a(EnumC4460b bVar) {
        if (bVar != null) {
            this.f12059a = bVar;
            return;
        }
        throw new NullPointerException("Type cannot be null");
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public void mo41943a(String str) {
        this.f12060b = str;
    }
}
