package com.taobao.agoo.p265a.p266a;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3185p;

/* renamed from: com.taobao.agoo.a.a.d */
public class C3201d extends AbstractC3199b {
    public static final String JSON_CMD_DISABLEPUSH = "disablePush";
    public static final String JSON_CMD_ENABLEPUSH = "enablePush";

    /* renamed from: a */
    public String f7287a;

    /* renamed from: b */
    public String f7288b;

    /* renamed from: c */
    public String f7289c;

    /* renamed from: a */
    public byte[] mo37823a() {
        try {
            C3185p.C3186a aVar = new C3185p.C3186a();
            aVar.mo37784a(AbstractC3199b.JSON_CMD, this.f7271e).mo37784a("appKey", this.f7287a);
            if (TextUtils.isEmpty(this.f7288b)) {
                aVar.mo37784a("utdid", this.f7289c);
            } else {
                aVar.mo37784a("deviceId", this.f7288b);
            }
            String jSONObject = aVar.mo37785a().toString();
            ALog.m7600i("SwitchDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m7598e("SwitchDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m7735a(String str, String str2, String str3, boolean z) {
        C3201d dVar = new C3201d();
        dVar.f7287a = str;
        dVar.f7288b = str2;
        dVar.f7289c = str3;
        if (z) {
            dVar.f7271e = JSON_CMD_ENABLEPUSH;
        } else {
            dVar.f7271e = JSON_CMD_DISABLEPUSH;
        }
        return dVar.mo37823a();
    }
}
