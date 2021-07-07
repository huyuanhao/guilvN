package com.p118pd.sdk;

import com.rxhui.rxcache.CacheTarget;
import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.ooOo0oO  reason: case insensitive filesystem */
public class C9020ooOo0oO {
    public C9025ooOo0oo0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9024ooOo0oo f22325OooO00o;

    public C9020ooOo0oO(C9024ooOo0oo oooo0oo, C9025ooOo0oo0 oooo0oo0) {
        this.f22325OooO00o = oooo0oo;
        this.OooO00o = oooo0oo0;
    }

    public <T> T OooO00o(String str, Type type) {
        T t;
        T t2;
        C9024ooOo0oo oooo0oo = this.f22325OooO00o;
        if (oooo0oo != null && (t2 = (T) oooo0oo.OooO00o(str)) != null) {
            return t2;
        }
        C9025ooOo0oo0 oooo0oo0 = this.OooO00o;
        if (oooo0oo0 == null || (t = (T) oooo0oo0.OooO00o(str, type)) == null) {
            return null;
        }
        C9024ooOo0oo oooo0oo2 = this.f22325OooO00o;
        if (oooo0oo2 != null) {
            oooo0oo2.OooO00o(str, type);
        }
        return t;
    }

    public boolean OooO0O0(String str) {
        C9024ooOo0oo oooo0oo = this.f22325OooO00o;
        boolean OooO0O0 = oooo0oo != null ? oooo0oo.OooO0O0(str) : false;
        C9025ooOo0oo0 oooo0oo0 = this.OooO00o;
        return oooo0oo0 != null ? oooo0oo0.OooO0O0(str) : OooO0O0;
    }

    public <T> boolean OooO00o(String str, T t, CacheTarget cacheTarget) {
        C9025ooOo0oo0 oooo0oo0;
        C9024ooOo0oo oooo0oo;
        boolean z = false;
        if (t == null) {
            return false;
        }
        if (cacheTarget.supportMemory() && (oooo0oo = this.f22325OooO00o) != null) {
            z = oooo0oo.OooO00o(str, t);
        }
        return (!cacheTarget.supportDisk() || (oooo0oo0 = this.OooO00o) == null) ? z : oooo0oo0.OooO00o(str, (Object) t);
    }

    public boolean OooO00o(String str) {
        C9024ooOo0oo oooo0oo = this.f22325OooO00o;
        if (oooo0oo != null && oooo0oo.m20687OooO00o(str)) {
            return true;
        }
        C9025ooOo0oo0 oooo0oo0 = this.OooO00o;
        if (oooo0oo0 == null || !oooo0oo0.OooO00o(str)) {
            return false;
        }
        return true;
    }

    public void OooO00o() {
        C9024ooOo0oo oooo0oo = this.f22325OooO00o;
        if (oooo0oo != null) {
            oooo0oo.OooO00o();
        }
        C9025ooOo0oo0 oooo0oo0 = this.OooO00o;
        if (oooo0oo0 != null) {
            oooo0oo0.OooO00o();
        }
    }
}
