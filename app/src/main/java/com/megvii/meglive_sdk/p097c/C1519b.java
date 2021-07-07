package com.megvii.meglive_sdk.p097c;

import android.content.Context;
import com.megvii.meglive_sdk.listener.AbstractC1587b;
import com.megvii.meglive_sdk.p106f.C1557ad;
import com.megvii.meglive_sdk.p106f.C1571m;
import com.megvii.meglive_sdk.p106f.C1579t;
import com.megvii.meglive_sdk.volley.C1625j;
import com.megvii.meglive_sdk.volley.C1631o;
import com.megvii.meglive_sdk.volley.C1638t;
import com.megvii.meglive_sdk.volley.toolbox.C1652j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.megvii.meglive_sdk.c.b */
public final class C1519b {

    /* renamed from: a */
    public static C1519b f2146a;

    /* renamed from: com.megvii.meglive_sdk.c.b$OooO00o */
    public class OooO00o implements C1631o.AbstractC1633b<String> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC1587b f15076OooO00o;

        public OooO00o(AbstractC1587b bVar) {
            this.f15076OooO00o = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.megvii.meglive_sdk.volley.C1631o.AbstractC1633b
        /* renamed from: a */
        public final /* synthetic */ void mo16992a(String str) {
            String str2 = str;
            C1571m.m2655a("response Suc", str2.toString());
            AbstractC1587b bVar = this.f15076OooO00o;
            if (bVar != null) {
                bVar.mo17212a(str2);
            }
        }
    }

    /* renamed from: com.megvii.meglive_sdk.c.b$OooO0O0 */
    public class OooO0O0 implements C1631o.AbstractC1632a {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC1587b f15077OooO00o;

        public OooO0O0(AbstractC1587b bVar) {
            this.f15077OooO00o = bVar;
        }

        @Override // com.megvii.meglive_sdk.volley.C1631o.AbstractC1632a
        /* renamed from: a */
        public final void mo16993a(C1638t tVar) {
            if (tVar == null) {
                C1571m.m2655a("volleyError", "in null");
                AbstractC1587b bVar = this.f15077OooO00o;
                if (bVar != null) {
                    bVar.mo17211a(-1, "timeout exception".getBytes());
                    return;
                }
                return;
            }
            C1625j jVar = tVar.f2915a;
            if (jVar == null) {
                C1571m.m2655a("volleyError", "networkResponse in null");
                AbstractC1587b bVar2 = this.f15077OooO00o;
                if (bVar2 != null) {
                    bVar2.mo17211a(-1, "timeout exception".getBytes());
                    return;
                }
                return;
            }
            AbstractC1587b bVar3 = this.f15077OooO00o;
            if (bVar3 != null) {
                bVar3.mo17211a(jVar.f2877a, jVar.f2878b);
            }
            C1571m.m2655a("response Fail", "code: " + tVar.f2915a.f2877a + " data: " + new String(tVar.f2915a.f2878b));
        }
    }

    /* renamed from: com.megvii.meglive_sdk.c.b$OooO0OO */
    public class OooO0OO extends C1652j {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Map f15078OooO00o;
        public final /* synthetic */ Map OooO0O0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, C1631o.AbstractC1633b bVar, C1631o.AbstractC1632a aVar, Map map, Map map2) {
            super(str, bVar, aVar);
            this.f15078OooO00o = map;
            this.OooO0O0 = map2;
        }

        @Override // com.megvii.meglive_sdk.volley.AbstractC1628m
        /* renamed from: a */
        public final Map<String, String> mo16994a() {
            return this.f15078OooO00o;
        }

        @Override // com.megvii.meglive_sdk.volley.AbstractC1628m
        /* renamed from: b */
        public final Map<String, String> mo16995b() {
            return this.OooO0O0;
        }
    }

    /* renamed from: a */
    public static C1519b m2293a() {
        if (f2146a == null) {
            f2146a = new C1519b();
        }
        return f2146a;
    }

    /* renamed from: a */
    public final void mo16990a(Context context, String str, String str2, String str3, AbstractC1587b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("biz_token", str2);
        hashMap.put("data", str3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("User-Agent", new C1579t(context).mo17197c());
        mo16991a(context, str + "/faceid/v3/sdk/get_liveness_config", hashMap, hashMap2, bVar);
    }

    /* renamed from: a */
    public final void mo16991a(Context context, String str, Map<String, String> map, Map<String, String> map2, AbstractC1587b bVar) {
        C1557ad.m2622a(context).mo17176a(new OooO0OO(str, new OooO00o(bVar), new OooO0O0(bVar), map, map2));
    }
}
