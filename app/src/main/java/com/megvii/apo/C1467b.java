package com.megvii.apo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.megvii.apo.util.C1495e;
import com.megvii.apo.util.C1497g;
import com.megvii.apo.util.C1500j;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.megvii.apo.b */
public final class C1467b extends AbstractC1486m {

    /* renamed from: c */
    public PackageManager f1937c = this.f1983a.getPackageManager();

    /* renamed from: com.megvii.apo.b$a */
    public static class C1468a {

        /* renamed from: a */
        public String f1938a;

        /* renamed from: b */
        public String f1939b;

        /* renamed from: c */
        public String f1940c;

        /* renamed from: d */
        public String f1941d;

        /* renamed from: e */
        public String f1942e;

        /* renamed from: f */
        public String f1943f;

        /* renamed from: g */
        public String f1944g;

        /* renamed from: h */
        public String f1945h;

        /* renamed from: i */
        public String f1946i;

        /* renamed from: j */
        public String f1947j;

        /* renamed from: k */
        public String f1948k;

        /* renamed from: l */
        public String f1949l;

        /* renamed from: m */
        public String f1950m = "0";

        /* renamed from: n */
        public boolean f1951n;

        public final String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("101071001", this.f1938a);
                jSONObject.put("101071002", this.f1939b);
                jSONObject.put("101071003", this.f1940c);
                jSONObject.put("101071004", this.f1941d);
                jSONObject.put("101071005", this.f1942e);
                jSONObject.put("101071007", this.f1944g);
                jSONObject.put("101071008", this.f1945h);
                jSONObject.put("101071009", this.f1946i);
                jSONObject.put("101071011", this.f1948k);
                jSONObject.put("101071014", this.f1949l);
                jSONObject.put("101071015", this.f1950m);
                jSONObject.put("101071016", this.f1951n ? "1" : "0");
                jSONObject.put("101071010", this.f1947j);
                jSONObject.put("101071006", this.f1943f);
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
            return jSONObject.toString();
        }
    }

    public C1467b(Context context) {
        super(context);
    }

    /* renamed from: b */
    private boolean m2179b() {
        try {
            List<String> a = m2177a(this.f1983a);
            if (a.size() == 0) {
                return false;
            }
            for (String str : a) {
                if (m2180b(str)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return false;
        }
    }

    @Override // com.megvii.apo.AbstractC1486m
    /* renamed from: a */
    public final void mo16948a(Map<String, Object> map) {
        if (C1500j.f2034E == 1) {
            try {
                ArrayList arrayList = new ArrayList();
                for (ApplicationInfo applicationInfo : this.f1937c.getInstalledApplications(8192)) {
                    C1468a a = C1497g.m2263a(this.f1983a, applicationInfo);
                    a.f1938a = "0";
                    arrayList.add(a);
                }
                map.put("101071000", new JSONArray(arrayList.toString()));
                map.put("101074001", m2178a(arrayList)[0]);
                map.put("101074003", m2178a(arrayList)[1]);
                map.put("101076005", Boolean.valueOf(m2179b()));
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        com.megvii.apo.util.C1495e.m2258a(r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2180b(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.apo.C1467b.m2180b(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static String[] m2178a(List<C1468a> list) {
        String str = "";
        String str2 = str;
        for (C1468a aVar : list) {
            if ("1".equals(aVar.f1950m)) {
                str2 = (str2 + aVar.f1941d) + Constants.ACCEPT_TIME_SEPARATOR_SP;
                str = (str + aVar.f1939b) + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
        }
        return new String[]{str, str2, ""};
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a A[SYNTHETIC, Splitter:B:42:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m2177a(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.apo.C1467b.m2177a(android.content.Context):java.util.List");
    }
}
