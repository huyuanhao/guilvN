package com.megvii.meglive_sdk.p106f;

import com.megvii.meglive_sdk.listener.AbstractC1586a;
import com.megvii.meglive_sdk.p095a.C1507a;
import com.megvii.meglive_sdk.p095a.C1508b;
import com.megvii.meglive_sdk.p095a.C1509c;
import com.megvii.meglive_sdk.p095a.C1510d;
import com.megvii.meglive_sdk.p095a.C1511e;
import com.megvii.meglive_sdk.p096b.C1517d;
import com.megvii.meglive_sdk.p097c.C1520c;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.io.UnsupportedEncodingException;

/* renamed from: com.megvii.meglive_sdk.f.b */
public final class C1558b {

    /* renamed from: a */
    public static C1520c f2558a;

    /* renamed from: com.megvii.meglive_sdk.f.b$OooO00o */
    public static class OooO00o implements Runnable {
        public final /* synthetic */ C1517d OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC1586a f15084OooO00o = null;
        public final /* synthetic */ String o0OOO0o;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public OooO00o(C1517d dVar, String str, String str2, String str3) {
            this.OooO00o = dVar;
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
            this.o0OOO0o = str3;
        }

        public final void run() {
            try {
                C1509c cVar = new C1509c(this.OooO00o.f2143c, this.OooO00o.f2141a, this.OooO00o.f2142b, this.o0ooOOo);
                C1511e eVar = new C1511e("", "0.0.0.0");
                C1507a aVar = new C1507a();
                aVar.f2073a.put("data", C1508b.m2279a(this.o0ooOoO));
                eVar.mo16969a(aVar);
                String str = this.o0OOO0o;
                String str2 = cVar.f2078c + cVar.f2077b + C9058ooOoOoOO.OooOO0 + cVar.f2076a + "/logstores/" + str + "/shards/lb";
                try {
                    byte[] bytes = eVar.mo16968a().getBytes("UTF-8");
                    byte[] a = C1509c.m2282a(bytes);
                    C1509c.m2281a(str2, cVar.mo16967a(str, bytes, a), a);
                } catch (UnsupportedEncodingException e) {
                    throw new C1510d("LogClientError", "Failed to pass log to utf-8 bytes", e, "");
                }
            } catch (C1510d e2) {
                e2.printStackTrace();
                C1571m.m2655a("LogException: ", "");
            }
        }
    }
}
