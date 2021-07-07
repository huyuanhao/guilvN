package com.alipay.apmobilesecuritysdk.p022d;

import android.content.Context;
import com.p118pd.sdk.C7557o0o00OO0;
import com.p118pd.sdk.C8932ooOOO0o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.alipay.apmobilesecuritysdk.d.e */
public final class C0390e {

    /* renamed from: a */
    public static Map<String, String> f869a;

    /* renamed from: b */
    public static final String[] f870b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    /* renamed from: a */
    public static String m753a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                str3 = "&";
            }
            sb.append(str3);
            sb.append(str);
            sb.append(C8932ooOOO0o.OooO0Oo);
            sb.append(str2);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m754a(Context context, Map<String, String> map) {
        Map<String, String> map2;
        synchronized (C0390e.class) {
            if (f869a == null) {
                m757c(context, map);
            }
            f869a.putAll(C0389d.m751a());
            map2 = f869a;
        }
        return map2;
    }

    /* renamed from: a */
    public static synchronized void m755a() {
        synchronized (C0390e.class) {
            f869a = null;
        }
    }

    /* renamed from: b */
    public static synchronized String m756b(Context context, Map<String, String> map) {
        String OooO00o;
        synchronized (C0390e.class) {
            m754a(context, map);
            TreeMap treeMap = new TreeMap();
            String[] strArr = f870b;
            for (String str : strArr) {
                if (f869a.containsKey(str)) {
                    treeMap.put(str, f869a.get(str));
                }
            }
            OooO00o = C7557o0o00OO0.OooO00o(m753a(treeMap));
        }
        return OooO00o;
    }

    /* renamed from: c */
    public static synchronized void m757c(Context context, Map<String, String> map) {
        synchronized (C0390e.class) {
            TreeMap treeMap = new TreeMap();
            f869a = treeMap;
            treeMap.putAll(C0387b.m749a(context, map));
            f869a.putAll(C0389d.m752a(context));
            f869a.putAll(C0388c.m750a(context));
            f869a.putAll(C0386a.m748a(context, map));
        }
    }
}
