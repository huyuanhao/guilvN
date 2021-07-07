package com.tencent.bugly.crashreport.crash;

/* renamed from: com.tencent.bugly.crashreport.crash.a */
public class C3276a implements Comparable<C3276a> {

    /* renamed from: a */
    public long f7799a = -1;

    /* renamed from: b */
    public long f7800b = -1;

    /* renamed from: c */
    public String f7801c = null;

    /* renamed from: d */
    public boolean f7802d = false;

    /* renamed from: e */
    public boolean f7803e = false;

    /* renamed from: f */
    public int f7804f = 0;

    /* renamed from: a */
    public int compareTo(C3276a aVar) {
        if (aVar == null) {
            return 1;
        }
        long j = this.f7800b - aVar.f7800b;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }
}
