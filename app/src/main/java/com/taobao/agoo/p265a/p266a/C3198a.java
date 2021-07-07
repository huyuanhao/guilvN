package com.taobao.agoo.p265a.p266a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3185p;

/* renamed from: com.taobao.agoo.a.a.a */
public class C3198a extends AbstractC3199b {
    public static final String JSON_CMD_REMOVEALIAS = "removeAlias";
    public static final String JSON_CMD_SETALIAS = "setAlias";
    public static final String JSON_PUSH_USER_TOKEN = "pushAliasToken";

    /* renamed from: a */
    public String f7267a;

    /* renamed from: b */
    public String f7268b;

    /* renamed from: c */
    public String f7269c;

    /* renamed from: d */
    public String f7270d;

    /* renamed from: b */
    public static byte[] m7730b(String str, String str2, String str3) {
        C3198a aVar = new C3198a();
        aVar.f7267a = str;
        aVar.f7268b = str2;
        aVar.f7270d = str3;
        aVar.f7271e = JSON_CMD_REMOVEALIAS;
        return aVar.mo37821a();
    }

    /* renamed from: c */
    public static byte[] m7731c(String str, String str2, String str3) {
        C3198a aVar = new C3198a();
        aVar.f7267a = str;
        aVar.f7268b = str2;
        aVar.f7269c = str3;
        aVar.f7271e = JSON_CMD_REMOVEALIAS;
        return aVar.mo37821a();
    }

    /* renamed from: a */
    public byte[] mo37821a() {
        try {
            String jSONObject = new C3185p.C3186a().mo37784a(AbstractC3199b.JSON_CMD, this.f7271e).mo37784a("appKey", this.f7267a).mo37784a("deviceId", this.f7268b).mo37784a("alias", this.f7269c).mo37784a(JSON_PUSH_USER_TOKEN, this.f7270d).mo37785a().toString();
            ALog.m7600i("AliasDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m7598e("AliasDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m7729a(String str, String str2, String str3) {
        C3198a aVar = new C3198a();
        aVar.f7267a = str;
        aVar.f7268b = str2;
        aVar.f7269c = str3;
        aVar.f7271e = "setAlias";
        return aVar.mo37821a();
    }
}
