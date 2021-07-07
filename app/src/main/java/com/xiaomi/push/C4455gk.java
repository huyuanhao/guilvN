package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.xiaomi.push.gk */
public class C4455gk extends AbstractC4456gl {

    /* renamed from: a */
    public boolean f12030a = false;

    /* renamed from: b */
    public String f12031b = null;

    /* renamed from: b */
    public boolean f12032b = false;

    /* renamed from: c */
    public String f12033c = null;

    /* renamed from: d */
    public String f12034d;

    /* renamed from: e */
    public String f12035e;

    /* renamed from: f */
    public String f12036f;

    /* renamed from: g */
    public String f12037g;

    /* renamed from: h */
    public String f12038h;

    /* renamed from: i */
    public String f12039i = "";

    /* renamed from: j */
    public String f12040j = "";

    /* renamed from: k */
    public String f12041k = "";

    /* renamed from: l */
    public String f12042l = "";

    public C4455gk() {
    }

    public C4455gk(Bundle bundle) {
        super(bundle);
        this.f12031b = bundle.getString("ext_msg_type");
        this.f12034d = bundle.getString("ext_msg_lang");
        this.f12033c = bundle.getString("ext_msg_thread");
        this.f12035e = bundle.getString("ext_msg_sub");
        this.f12036f = bundle.getString("ext_msg_body");
        this.f12037g = bundle.getString("ext_body_encode");
        this.f12038h = bundle.getString("ext_msg_appid");
        this.f12030a = bundle.getBoolean("ext_msg_trans", false);
        this.f12032b = bundle.getBoolean("ext_msg_encrypt", false);
        this.f12039i = bundle.getString("ext_msg_seq");
        this.f12040j = bundle.getString("ext_msg_mseq");
        this.f12041k = bundle.getString("ext_msg_fseq");
        this.f12042l = bundle.getString("ext_msg_status");
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public Bundle mo41938a() {
        Bundle a = super.mo41938a();
        if (!TextUtils.isEmpty(this.f12031b)) {
            a.putString("ext_msg_type", this.f12031b);
        }
        String str = this.f12034d;
        if (str != null) {
            a.putString("ext_msg_lang", str);
        }
        String str2 = this.f12035e;
        if (str2 != null) {
            a.putString("ext_msg_sub", str2);
        }
        String str3 = this.f12036f;
        if (str3 != null) {
            a.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.f12037g)) {
            a.putString("ext_body_encode", this.f12037g);
        }
        String str4 = this.f12033c;
        if (str4 != null) {
            a.putString("ext_msg_thread", str4);
        }
        String str5 = this.f12038h;
        if (str5 != null) {
            a.putString("ext_msg_appid", str5);
        }
        if (this.f12030a) {
            a.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.f12039i)) {
            a.putString("ext_msg_seq", this.f12039i);
        }
        if (!TextUtils.isEmpty(this.f12040j)) {
            a.putString("ext_msg_mseq", this.f12040j);
        }
        if (!TextUtils.isEmpty(this.f12041k)) {
            a.putString("ext_msg_fseq", this.f12041k);
        }
        if (this.f12032b) {
            a.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.f12042l)) {
            a.putString("ext_msg_status", this.f12042l);
        }
        return a;
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public String m12756a() {
        C4462gp a;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (mo41977p() != null) {
            sb.append(" xmlns=\"");
            sb.append(mo41977p());
            sb.append("\"");
        }
        if (this.f12034d != null) {
            sb.append(" xml:lang=\"");
            sb.append(mo41959h());
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
        if (!TextUtils.isEmpty(mo41950d())) {
            sb.append(" seq=\"");
            sb.append(mo41950d());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo41952e())) {
            sb.append(" mseq=\"");
            sb.append(mo41952e());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo41955f())) {
            sb.append(" fseq=\"");
            sb.append(mo41955f());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(mo41957g())) {
            sb.append(" status=\"");
            sb.append(mo41957g());
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
        if (this.f12030a) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.f12038h)) {
            sb.append(" appid=\"");
            sb.append(mo41948c());
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(this.f12031b)) {
            sb.append(" type=\"");
            sb.append(this.f12031b);
            sb.append("\"");
        }
        if (this.f12032b) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.f12035e != null) {
            sb.append("<subject>");
            sb.append(C4470gw.m12831a(this.f12035e));
            sb.append("</subject>");
        }
        if (this.f12036f != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f12037g)) {
                sb.append(" encode=\"");
                sb.append(this.f12037g);
                sb.append("\"");
            }
            sb.append(">");
            sb.append(C4470gw.m12831a(this.f12036f));
            sb.append("</body>");
        }
        if (this.f12033c != null) {
            sb.append("<thread>");
            sb.append(this.f12033c);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.f12031b) && (a = m12782a()) != null) {
            sb.append(a.m12810a());
        }
        sb.append(mo41975o());
        sb.append("</message>");
        return sb.toString();
    }

    @Override // com.xiaomi.push.AbstractC4456gl, com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public void mo41943a(String str) {
        this.f12038h = str;
    }

    @Override // com.xiaomi.push.AbstractC4456gl
    /* renamed from: a */
    public void mo41944a(String str, String str2) {
        this.f12036f = str;
        this.f12037g = str2;
    }

    /* renamed from: a */
    public void mo41945a(boolean z) {
        this.f12030a = z;
    }

    @Override // com.xiaomi.push.AbstractC4456gl
    /* renamed from: b */
    public String mo41941b() {
        return this.f12031b;
    }

    /* renamed from: b */
    public void mo41946b(String str) {
        this.f12039i = str;
    }

    /* renamed from: b */
    public void mo41947b(boolean z) {
        this.f12032b = z;
    }

    /* renamed from: c */
    public String mo41948c() {
        return this.f12038h;
    }

    /* renamed from: c */
    public void mo41949c(String str) {
        this.f12040j = str;
    }

    /* renamed from: d */
    public String mo41950d() {
        return this.f12039i;
    }

    /* renamed from: d */
    public void mo41951d(String str) {
        this.f12041k = str;
    }

    /* renamed from: e */
    public String mo41952e() {
        return this.f12040j;
    }

    /* renamed from: e */
    public void mo41953e(String str) {
        this.f12042l = str;
    }

    @Override // com.xiaomi.push.AbstractC4456gl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4455gk.class != obj.getClass()) {
            return false;
        }
        C4455gk gkVar = (C4455gk) obj;
        if (!super.equals(gkVar)) {
            return false;
        }
        String str = this.f12036f;
        if (str == null ? gkVar.f12036f != null : !str.equals(gkVar.f12036f)) {
            return false;
        }
        String str2 = this.f12034d;
        if (str2 == null ? gkVar.f12034d != null : !str2.equals(gkVar.f12034d)) {
            return false;
        }
        String str3 = this.f12035e;
        if (str3 == null ? gkVar.f12035e != null : !str3.equals(gkVar.f12035e)) {
            return false;
        }
        String str4 = this.f12033c;
        if (str4 == null ? gkVar.f12033c == null : str4.equals(gkVar.f12033c)) {
            return this.f12031b == gkVar.f12031b;
        }
        return false;
    }

    /* renamed from: f */
    public String mo41955f() {
        return this.f12041k;
    }

    /* renamed from: f */
    public void mo41956f(String str) {
        this.f12031b = str;
    }

    /* renamed from: g */
    public String mo41957g() {
        return this.f12042l;
    }

    /* renamed from: g */
    public void mo41958g(String str) {
        this.f12035e = str;
    }

    /* renamed from: h */
    public String mo41959h() {
        return this.f12034d;
    }

    /* renamed from: h */
    public void mo41960h(String str) {
        this.f12036f = str;
    }

    @Override // com.xiaomi.push.AbstractC4456gl
    public int hashCode() {
        String str = this.f12031b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12036f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12033c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f12034d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f12035e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public void mo41962i(String str) {
        this.f12033c = str;
    }

    /* renamed from: j */
    public void mo41963j(String str) {
        this.f12034d = str;
    }
}
