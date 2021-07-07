package com.tencent.bugly.crashreport.crash.p268h5;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.crashreport.crash.h5.a */
public class C3295a {

    /* renamed from: a */
    public String f7903a = null;

    /* renamed from: b */
    public String f7904b = null;

    /* renamed from: c */
    public String f7905c = null;

    /* renamed from: d */
    public String f7906d = null;

    /* renamed from: e */
    public String f7907e = null;

    /* renamed from: f */
    public String f7908f = null;

    /* renamed from: g */
    public String f7909g = null;

    /* renamed from: h */
    public String f7910h = null;

    /* renamed from: i */
    public String f7911i = null;

    /* renamed from: j */
    public long f7912j = 0;

    /* renamed from: k */
    public long f7913k = 0;

    /* renamed from: a */
    public Map<String, String> mo38289a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f7903a;
        if (str != null) {
            linkedHashMap.put("[JS] projectRoot", str);
        }
        String str2 = this.f7904b;
        if (str2 != null) {
            linkedHashMap.put("[JS] context", str2);
        }
        String str3 = this.f7905c;
        if (str3 != null) {
            linkedHashMap.put("[JS] url", str3);
        }
        String str4 = this.f7906d;
        if (str4 != null) {
            linkedHashMap.put("[JS] userAgent", str4);
        }
        String str5 = this.f7911i;
        if (str5 != null) {
            linkedHashMap.put("[JS] file", str5);
        }
        long j = this.f7912j;
        if (j != 0) {
            linkedHashMap.put("[JS] lineNumber", Long.toString(j));
        }
        return linkedHashMap;
    }
}
