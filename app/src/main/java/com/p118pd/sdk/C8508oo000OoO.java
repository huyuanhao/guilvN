package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.pd.sdk.oo000OoO  reason: case insensitive filesystem */
public final class C8508oo000OoO implements AbstractC8512oo000o00 {
    public Context OooO00o;
    public int o00oO0O = -1;
    public String o0OOO0o;
    public String o0ooOOo;
    public String o0ooOoO;

    public C8508oo000OoO(Context context, String str, String str2, String str3) {
        this.OooO00o = context;
        this.o0ooOOo = str;
        this.o0ooOoO = str2;
        this.o0OOO0o = str3;
    }

    private void OooO00o() {
        Set<String> OooO00o2 = AbstractC8521oo00O00.m20192OooO00o(AbstractC8521oo00O00.OooO00o(this.OooO00o, "stat_v2_1"));
        Set<String> OooO00o3 = AbstractC8521oo00O00.m20192OooO00o(AbstractC8521oo00O00.OooO00o(this.OooO00o, "cached_v2_1"));
        HashSet hashSet = new HashSet(OooO00o2);
        hashSet.addAll(OooO00o3);
        Set<String> OooO00o4 = AbstractC8526oo00O0O0.OooO00o(AbstractC8453oOooOoOO.m20095OooO00o());
        OooO00o2.removeAll(OooO00o4);
        AbstractC8521oo00O00.OooO00o(OooO00o4, hashSet, this.OooO00o);
    }

    private void OooO00o(String str, AbstractC8493oo0000OO[] oo0000ooArr) {
        new C8506oo000OOo(this.OooO00o, str, oo0000ooArr, this.o0OOO0o, UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "")).OooO00o();
    }

    public void run() {
        Map<String, AbstractC8493oo0000OO[]> OooO00o2;
        boolean z = true;
        AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "run report.TAG : %s,TYPE: %s", this.o0ooOOo, this.o0ooOoO);
        String str = this.o0ooOOo;
        boolean OooO00o3 = AbstractC8521oo00O00.m20195OooO00o(this.OooO00o);
        if (OooO00o3) {
            this.o00oO0O = 1;
            OooO00o();
        } else if (TextUtils.isEmpty(this.o0ooOoO) && TextUtils.isEmpty(this.o0ooOOo)) {
            OooO00o();
            OooO00o2 = C8495oo0000o.OooO00o(AbstractC8521oo00O00.OooO00o(this.OooO00o, "stat_v2_1"), this.OooO00o, str, z);
            Map<String, AbstractC8493oo0000OO[]> OooO00o4 = C8492oo0000O0.OooO00o(AbstractC8521oo00O00.OooO00o(this.OooO00o, "cached_v2_1"), this.OooO00o, str, z);
            if (OooO00o2 != null || OooO00o4 == null) {
                AbstractC8536oo00OO0O.OooO0OO("EventReportTask", "Unknown anomaly,No data send!");
            }
            for (Map.Entry<String, AbstractC8493oo0000OO[]> entry : OooO00o2.entrySet()) {
                String key = entry.getKey();
                AbstractC8493oo0000OO[] value = entry.getValue();
                AbstractC8493oo0000OO[] oo0000ooArr = OooO00o4.get(key);
                if (oo0000ooArr != null) {
                    AbstractC8493oo0000OO[] oo0000ooArr2 = new AbstractC8493oo0000OO[(value.length + oo0000ooArr.length)];
                    System.arraycopy(oo0000ooArr, 0, oo0000ooArr2, 0, oo0000ooArr.length);
                    System.arraycopy(value, 0, oo0000ooArr2, oo0000ooArr.length, value.length);
                    OooO00o4.remove(key);
                    OooO00o(key, oo0000ooArr2);
                } else {
                    OooO00o(key, value);
                }
            }
            if (OooO00o4.size() > 0) {
                for (Map.Entry<String, AbstractC8493oo0000OO[]> entry2 : OooO00o4.entrySet()) {
                    OooO00o(entry2.getKey(), entry2.getValue());
                }
            }
            AbstractC8521oo00O00.OooO00o(str, z, this.OooO00o);
            C8518oo000oo.OooO00o(this.OooO00o).OooO00o(AbstractC8522oo00O000.OooO00o(), this.o00oO0O);
            return;
        } else if (!"_default_config_tag".equals(this.o0ooOOo) && "allType".equals(this.o0ooOoO)) {
            AbstractC8536oo00OO0O.OooO0OO("EventReportTask", "eventType UnKnown,Stop Report!");
            return;
        } else if (!"_default_config_tag".equals(this.o0ooOOo) && !"allType".equals(this.o0ooOoO)) {
            str = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.o0ooOoO;
        }
        z = OooO00o3;
        OooO00o2 = C8495oo0000o.OooO00o(AbstractC8521oo00O00.OooO00o(this.OooO00o, "stat_v2_1"), this.OooO00o, str, z);
        Map<String, AbstractC8493oo0000OO[]> OooO00o42 = C8492oo0000O0.OooO00o(AbstractC8521oo00O00.OooO00o(this.OooO00o, "cached_v2_1"), this.OooO00o, str, z);
        if (OooO00o2 != null) {
        }
        AbstractC8536oo00OO0O.OooO0OO("EventReportTask", "Unknown anomaly,No data send!");
    }
}
