package com.alibaba.sdk.android.httpdns.net64;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.alibaba.sdk.android.httpdns.net64.a */
public class C0308a implements Net64Service {

    /* renamed from: a */
    public C0311b f670a;

    /* renamed from: a */
    public ConcurrentHashMap<String, List<String>> f671a;

    /* renamed from: j */
    public boolean f672j;

    /* renamed from: k */
    public volatile boolean f673k;

    /* renamed from: com.alibaba.sdk.android.httpdns.net64.a$a */
    public static final class C0310a {

        /* renamed from: a */
        public static final C0308a f674a = new C0308a();
    }

    public C0308a() {
        this.f670a = new C0311b();
        this.f671a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static C0308a mo4034a() {
        return C0310a.f674a;
    }

    /* renamed from: a */
    public List<String> mo4032a(String str) {
        return this.f671a.get(str);
    }

    /* renamed from: a */
    public void mo4033a(String str, List<String> list) {
        this.f671a.put(str, list);
    }

    /* renamed from: a */
    public boolean m551a() {
        return this.f672j;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z) {
        this.f672j = z;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        List<String> list;
        if (this.f672j && (list = this.f671a.get(str)) != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo4035h() {
        return this.f673k;
    }
}
