package com.alibaba.sdk.android.httpdns.p014b;

/* renamed from: com.alibaba.sdk.android.httpdns.b.g */
public class C0265g {

    /* renamed from: h */
    public long f585h;

    /* renamed from: id */
    public long f586id;

    /* renamed from: k */
    public String f587k;

    /* renamed from: l */
    public String f588l;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("[IpRecord] ");
        sb.append("id:");
        sb.append(this.f586id);
        sb.append("|");
        sb.append("host_id:");
        sb.append(this.f585h);
        sb.append("|");
        sb.append("ip:");
        sb.append(this.f587k);
        sb.append("|");
        sb.append("ttl:");
        sb.append(this.f588l);
        sb.append("|");
        return sb.toString();
    }
}
