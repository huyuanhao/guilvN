package com.taobao.agoo.p265a.p266a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3185p;

/* renamed from: com.taobao.agoo.a.a.c */
public class C3200c extends AbstractC3199b {
    public static final String JSON_CMD_REGISTER = "register";

    /* renamed from: a */
    public String f7272a;

    /* renamed from: b */
    public String f7273b;

    /* renamed from: c */
    public String f7274c;

    /* renamed from: d */
    public String f7275d = String.valueOf(Constants.SDK_VERSION_CODE);

    /* renamed from: f */
    public String f7276f;

    /* renamed from: g */
    public String f7277g;

    /* renamed from: h */
    public String f7278h;

    /* renamed from: i */
    public String f7279i;

    /* renamed from: j */
    public String f7280j;

    /* renamed from: k */
    public String f7281k;

    /* renamed from: l */
    public String f7282l;

    /* renamed from: m */
    public String f7283m;

    /* renamed from: n */
    public String f7284n;

    /* renamed from: o */
    public String f7285o;

    /* renamed from: p */
    public String f7286p;

    /* renamed from: a */
    public byte[] mo37822a() {
        try {
            String jSONObject = new C3185p.C3186a().mo37784a(AbstractC3199b.JSON_CMD, this.f7271e).mo37784a("appKey", this.f7272a).mo37784a("utdid", this.f7273b).mo37784a("appVersion", this.f7274c).mo37784a("sdkVersion", this.f7275d).mo37784a(Constants.KEY_TTID, this.f7276f).mo37784a(Constants.KEY_PACKAGE_NAME, this.f7277g).mo37784a("notifyEnable", this.f7278h).mo37784a("romInfo", this.f7279i).mo37784a("c0", this.f7280j).mo37784a("c1", this.f7281k).mo37784a("c2", this.f7282l).mo37784a("c3", this.f7283m).mo37784a("c4", this.f7284n).mo37784a("c5", this.f7285o).mo37784a("c6", this.f7286p).mo37785a().toString();
            ALog.m7600i("RegisterDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m7598e("RegisterDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m7733a(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.p265a.p266a.C3200c.m7733a(android.content.Context, java.lang.String, java.lang.String):byte[]");
    }
}
