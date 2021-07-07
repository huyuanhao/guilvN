package com.vivo.push.model;

import android.text.TextUtils;
import com.p118pd.sdk.C7522o0Ooo0o;

/* renamed from: com.vivo.push.model.b */
public final class C4118b {

    /* renamed from: a */
    public String f11028a;

    /* renamed from: b */
    public long f11029b = -1;

    /* renamed from: c */
    public int f11030c = -1;

    /* renamed from: d */
    public String f11031d;

    /* renamed from: e */
    public boolean f11032e = false;

    /* renamed from: f */
    public boolean f11033f = false;

    public C4118b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f11028a = str;
            return;
        }
        throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
    }

    /* renamed from: a */
    public final String mo41081a() {
        return this.f11028a;
    }

    /* renamed from: b */
    public final long mo41086b() {
        return this.f11029b;
    }

    /* renamed from: c */
    public final boolean mo41088c() {
        return this.f11032e;
    }

    /* renamed from: d */
    public final boolean mo41089d() {
        return this.f11033f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.f11028a + ", mPushVersion=" + this.f11029b + ", mPackageVersion=" + this.f11030c + ", mInBlackList=" + this.f11032e + ", mPushEnable=" + this.f11033f + C7522o0Ooo0o.OooO0Oo;
    }

    /* renamed from: a */
    public final void mo41083a(long j) {
        this.f11029b = j;
    }

    /* renamed from: b */
    public final void mo41087b(boolean z) {
        this.f11033f = z;
    }

    /* renamed from: a */
    public final void mo41085a(boolean z) {
        this.f11032e = z;
    }

    /* renamed from: a */
    public final void mo41082a(int i) {
        this.f11030c = i;
    }

    /* renamed from: a */
    public final void mo41084a(String str) {
        this.f11031d = str;
    }
}
