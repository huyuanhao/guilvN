package com.taobao.accs.p263ut.p264a;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.umeng.message.MsgConstant;
import com.umeng.socialize.common.SocializeConstants;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.d */
public class C3165d {

    /* renamed from: a */
    public String f7139a;

    /* renamed from: b */
    public String f7140b;

    /* renamed from: c */
    public String f7141c;

    /* renamed from: d */
    public String f7142d;

    /* renamed from: e */
    public String f7143e;

    /* renamed from: f */
    public String f7144f;

    /* renamed from: g */
    public String f7145g;

    /* renamed from: h */
    public boolean f7146h = false;

    /* renamed from: i */
    public String f7147i;

    /* renamed from: j */
    public final String f7148j = "receiveMessage";

    /* renamed from: k */
    public boolean f7149k = false;

    /* renamed from: a */
    public void mo37713a() {
        String str;
        String str2;
        Throwable th;
        if (!this.f7149k) {
            this.f7149k = true;
            HashMap hashMap = new HashMap();
            try {
                str2 = this.f7139a;
                try {
                    str = String.valueOf(Constants.SDK_VERSION_CODE);
                } catch (Throwable th2) {
                    th = th2;
                    str = null;
                    ALog.m7597d("ReceiveMessage", UTMini.getCommitInfo(66001, str2, (String) null, str, hashMap) + " " + th.toString(), new Object[0]);
                }
                try {
                    hashMap.put("device_id", this.f7139a);
                    hashMap.put("data_id", this.f7140b);
                    hashMap.put("receive_date", this.f7141c);
                    hashMap.put("to_bz_date", this.f7142d);
                    hashMap.put("service_id", this.f7143e);
                    hashMap.put("data_length", this.f7144f);
                    hashMap.put(MsgConstant.INAPP_MSG_TYPE, this.f7145g);
                    hashMap.put("repeat", this.f7146h ? "y" : GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
                    hashMap.put(SocializeConstants.TENCENT_UID, this.f7147i);
                    UTMini.getInstance().commitEvent(66001, "receiveMessage", str2, (Object) null, str, hashMap);
                } catch (Throwable th3) {
                    th = th3;
                    ALog.m7597d("ReceiveMessage", UTMini.getCommitInfo(66001, str2, (String) null, str, hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th4) {
                th = th4;
                str2 = null;
                str = null;
                ALog.m7597d("ReceiveMessage", UTMini.getCommitInfo(66001, str2, (String) null, str, hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
