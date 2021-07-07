package com.megvii.meglive_sdk.p106f;

import com.megvii.meglive_sdk.p096b.C1517d;
import com.megvii.meglive_sdk.p097c.C1520c;
import com.megvii.meglive_sdk.p098d.C1525e;
import com.megvii.meglive_sdk.p106f.C1558b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.megvii.meglive_sdk.f.x */
public final class C1583x {

    /* renamed from: a */
    public static JSONArray f2647a;

    /* renamed from: a */
    public static synchronized void m2690a(JSONObject jSONObject) {
        synchronized (C1583x.class) {
            if (f2647a == null) {
                f2647a = new JSONArray();
            }
            f2647a.put(jSONObject);
            int g = C1565g.m2638g(C1525e.m2307a().f2160a);
            C1517d c = C1565g.m2634c(C1525e.m2307a().f2160a);
            if (g == 2 && c != null) {
                C1571m.m2655a("buriedPoint: log", jSONObject.toString());
                String jSONObject2 = jSONObject.toString();
                String str = c.f2144d;
                String str2 = c.f2145e;
                if (C1558b.f2558a == null) {
                    C1558b.f2558a = new C1520c(3, 3);
                }
                C1558b.f2558a.mo16996a(new C1558b.OooO00o(c, str, jSONObject2, str2));
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m2691b() {
        synchronized (C1583x.class) {
            f2647a = new JSONArray();
        }
    }

    /* renamed from: a */
    public static synchronized String m2689a() {
        String jSONArray;
        synchronized (C1583x.class) {
            C1571m.m2655a("dataPoint", f2647a.toString());
            jSONArray = f2647a.toString();
        }
        return jSONArray;
    }
}
