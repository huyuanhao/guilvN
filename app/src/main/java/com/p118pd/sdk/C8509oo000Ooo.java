package com.p118pd.sdk;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.pd.sdk.oo000Ooo  reason: case insensitive filesystem */
public class C8509oo000Ooo implements AbstractC8512oo000o00 {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8492oo0000O0[] f21642OooO00o;
    public boolean OooO0O0;
    public String o0OOO0o;
    public String o0ooOOo;
    public String o0ooOoO;

    public C8509oo000Ooo(Context context, C8492oo0000O0[] oo0000o0Arr, String str, String str2, String str3, boolean z) {
        this.OooO00o = context;
        this.o0ooOOo = str;
        this.o0ooOoO = str2;
        this.f21642OooO00o = (C8492oo0000O0[]) oo0000o0Arr.clone();
        this.o0OOO0o = str3;
        this.OooO0O0 = z;
    }

    private void OooO00o() {
        AbstractC8521oo00O00.OooO0O0(this.OooO00o, AbstractC8526oo00O0O0.OooO00o(this.o0ooOOo, this.o0ooOoO, this.o0OOO0o));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.pd.sdk.oo0000o */
    /* JADX WARN: Multi-variable type inference failed */
    private void OooO00o(C8492oo0000O0[] oo0000o0Arr, String str) {
        JSONArray jSONArray = new JSONArray();
        for (C8492oo0000O0 oo0000o0 : oo0000o0Arr) {
            C8492oo0000O0 oo0000o02 = new C8492oo0000O0(this.OooO00o);
            oo0000o0.OooO00o(oo0000o02);
            jSONArray.put(oo0000o02.OooO00o(true));
        }
        AbstractC8521oo00O00.OooO00o(this.OooO00o, jSONArray.toString(), "cached_v2_1", str);
    }

    public void run() {
        if (this.OooO0O0) {
            AbstractC8536oo00OO0O.OooO0O0("EventSendResultHandleTask", "send data ok,reqID:" + this.o0OOO0o);
            OooO00o();
            return;
        }
        C8492oo0000O0[] oo0000o0Arr = this.f21642OooO00o;
        if (oo0000o0Arr == null || oo0000o0Arr.length <= 0) {
            AbstractC8536oo00OO0O.OooO0O0("EventSendResultHandleTask", "No cache info save! reqID:" + this.o0OOO0o);
        } else {
            String str = "_default_config_tag";
            if (!str.equals(this.o0ooOOo)) {
                str = this.o0ooOOo + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.o0ooOoO;
            }
            int OooO0O02 = AbstractC8453oOooOoOO.OooO0O0();
            AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/event", "data send failed, write to cache file...reqID:" + this.o0OOO0o);
            if (AbstractC8521oo00O00.OooO00o(this.OooO00o, "cached_v2_1", OooO0O02 * 1048576)) {
                AbstractC8536oo00OO0O.OooO0OO("EventSendResultHandleTask", "THe cacheFile is full,Not writing data! reqID:" + this.o0OOO0o);
                return;
            }
            AbstractC8493oo0000OO[] oo0000ooArr = C8492oo0000O0.OooO00o(AbstractC8521oo00O00.OooO00o(this.OooO00o, "cached_v2_1"), this.OooO00o, str, false).get(str);
            int length = this.f21642OooO00o.length;
            ArrayList arrayList = new ArrayList();
            if (oo0000ooArr != null && oo0000ooArr.length > 0) {
                List<AbstractC8496oo0000o0> OooO00o2 = C8517oo000oOo.OooO00o(oo0000ooArr);
                int size = OooO00o2.size() + length;
                if (size > 6000) {
                    OooO00o2 = OooO00o2.subList(length, 6000);
                    length = 6000;
                } else {
                    length = size;
                }
                for (int i = 0; i < OooO00o2.size(); i++) {
                    arrayList.add(OooO00o2.get(i).OooO00o());
                }
            }
            C8492oo0000O0[] oo0000o0Arr2 = (C8492oo0000O0[]) arrayList.toArray(new C8492oo0000O0[arrayList.size()]);
            C8492oo0000O0[] oo0000o0Arr3 = new C8492oo0000O0[length];
            C8492oo0000O0[] oo0000o0Arr4 = this.f21642OooO00o;
            System.arraycopy(oo0000o0Arr4, 0, oo0000o0Arr3, 0, oo0000o0Arr4.length);
            if (oo0000o0Arr2.length > 0) {
                System.arraycopy(oo0000o0Arr2, 0, oo0000o0Arr3, this.f21642OooO00o.length, oo0000o0Arr2.length);
            }
            OooO00o(oo0000o0Arr3, str);
        }
        OooO00o();
    }
}
