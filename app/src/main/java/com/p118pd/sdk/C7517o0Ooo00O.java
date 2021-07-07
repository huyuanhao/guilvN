package com.p118pd.sdk;

import android.text.TextUtils;

/* renamed from: com.pd.sdk.o0Ooo00O  reason: case insensitive filesystem */
public final class C7517o0Ooo00O {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f20362OooO00o;
    public final String OooO0O0;

    public C7517o0Ooo00O(String str, String str2, long j) {
        this.f20362OooO00o = str;
        this.OooO0O0 = str2;
        this.OooO00o = j;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19160OooO00o() {
        return this.f20362OooO00o;
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public long OooO00o() {
        return this.OooO00o;
    }

    public static boolean OooO00o(C7517o0Ooo00O o0ooo00o) {
        return o0ooo00o == null || TextUtils.isEmpty(o0ooo00o.f20362OooO00o);
    }
}
