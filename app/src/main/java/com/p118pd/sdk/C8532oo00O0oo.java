package com.p118pd.sdk;

import android.text.TextUtils;

/* renamed from: com.pd.sdk.oo00O0oo  reason: case insensitive filesystem */
public class C8532oo00O0oo {
    public long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21652OooO00o = "";
    public long OooO0O0 = 0;

    public C8532oo00O0oo(String str, long j) {
        this.f21652OooO00o = str;
        this.OooO00o = j;
    }

    public C8532oo00O0oo(String str, long j, long j2) {
        this.f21652OooO00o = str;
        this.OooO00o = j;
        this.OooO0O0 = j2;
    }

    public long OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20201OooO00o() {
        return this.f21652OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20202OooO00o() {
        return !TextUtils.isEmpty(this.f21652OooO00o) && this.OooO00o > 0 && this.OooO0O0 >= 0;
    }

    public long OooO0O0() {
        return this.OooO0O0;
    }
}
