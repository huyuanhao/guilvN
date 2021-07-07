package com.alibaba.sdk.android.httpdns.p014b;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.alibaba.sdk.android.httpdns.b.e */
public class C0263e {

    /* renamed from: a */
    public ArrayList<C0265g> f579a;

    /* renamed from: b */
    public ArrayList<C0265g> f580b;

    /* renamed from: h */
    public String f581h;

    /* renamed from: i */
    public String f582i;

    /* renamed from: id */
    public long f583id;

    /* renamed from: j */
    public String f584j;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("[HostRecord] ");
        sb.append("id:");
        sb.append(this.f583id);
        sb.append("|");
        sb.append("host:");
        sb.append(this.f581h);
        sb.append("|");
        sb.append("sp:");
        sb.append(this.f582i);
        sb.append("|");
        sb.append("time:");
        sb.append(this.f584j);
        sb.append("|");
        sb.append("ips:");
        ArrayList<C0265g> arrayList = this.f579a;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<C0265g> it = this.f579a.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
            }
        }
        sb.append("|");
        sb.append("ipsv6:");
        ArrayList<C0265g> arrayList2 = this.f580b;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<C0265g> it2 = this.f580b.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
            }
        }
        sb.append("|");
        return sb.toString();
    }
}
