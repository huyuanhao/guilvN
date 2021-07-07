package com.p118pd.sdk;

import com.rxhui.rxcache.result.ResultSouce;

/* renamed from: com.pd.sdk.ooOoO00O  reason: case insensitive filesystem */
public class C9031ooOoO00O<T> {
    public ResultSouce OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f22348OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22349OooO00o;

    public C9031ooOoO00O(ResultSouce resultSouce, String str, T t) {
        this.OooO00o = resultSouce;
        this.f22349OooO00o = str;
        this.f22348OooO00o = t;
    }

    public ResultSouce OooO00o() {
        return this.OooO00o;
    }

    public String toString() {
        return "CacheResult{resultSouce=" + this.OooO00o + ", key='" + this.f22349OooO00o + '\'' + ", data=" + ((Object) this.f22348OooO00o) + '}';
    }

    public void OooO00o(ResultSouce resultSouce) {
        this.OooO00o = resultSouce;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20689OooO00o() {
        return this.f22349OooO00o;
    }

    public void OooO00o(String str) {
        this.f22349OooO00o = str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m20688OooO00o() {
        return this.f22348OooO00o;
    }

    public void OooO00o(T t) {
        this.f22348OooO00o = t;
    }
}
