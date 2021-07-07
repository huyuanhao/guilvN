package com.p118pd.sdk;

import android.text.TextUtils;

/* renamed from: com.pd.sdk.oOoo00o0  reason: case insensitive filesystem */
public class C8399oOoo00o0 extends AbstractC8411oOoo0Oo0 {
    public long OooO00o;
    public long OooO0O0;
    public int OooOOo = 0;
    public int OooOOo0;
    public int OooOOoo = 0;
    public String OooOo = "08:00-22:00";
    public String OooOo0O;
    public String OooOo0o;
    public String OooOoO0;

    @Override // com.p118pd.sdk.AbstractC8411oOoo0Oo0, com.p118pd.sdk.AbstractC8411oOoo0Oo0
    public long OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(long j) {
        this.OooO0O0 = j;
    }

    @Override // com.p118pd.sdk.AbstractC8411oOoo0Oo0, com.p118pd.sdk.AbstractC8411oOoo0Oo0
    public int OooO0O0() {
        return 4098;
    }

    @Override // com.p118pd.sdk.AbstractC8411oOoo0Oo0, com.p118pd.sdk.AbstractC8411oOoo0Oo0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public long m20064OooO0O0() {
        return this.OooO00o;
    }

    public void OooO0O0(long j) {
        this.OooO00o = j;
    }

    public int OooO0OO() {
        return this.OooOOo0;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public String m20065OooO0OO() {
        return this.OooOo0o;
    }

    public void OooO0OO(int i) {
        this.OooOOo0 = i;
    }

    public void OooO0OO(String str) {
        this.OooOo0o = str;
    }

    public int OooO0Oo() {
        return this.OooOOoo;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public String m20066OooO0Oo() {
        return this.OooOoO0;
    }

    public void OooO0Oo(int i) {
        this.OooOOoo = i;
    }

    public void OooO0Oo(String str) {
        this.OooOoO0 = str;
    }

    public String OooO0o() {
        return this.OooOo0O;
    }

    public void OooO0o(String str) {
        this.OooOo0O = str;
    }

    public int OooO0o0() {
        return this.OooOOo;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public String m20067OooO0o0() {
        return this.OooOo;
    }

    public void OooO0o0(int i) {
        this.OooOOo = i;
    }

    public void OooO0o0(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.OooOo = str;
        }
    }

    public String toString() {
        return "AppMessage{mTitle='" + this.OooOo0O + '\'' + ", mContent='" + this.OooOo0o + '\'' + ", mStartDate=" + this.OooO00o + ", mEndDate=" + this.OooO0O0 + ", mBalanceTime=" + this.OooOOo0 + ", mTimeRanges='" + this.OooOo + '\'' + ", mRule='" + this.OooOoO0 + '\'' + ", mForcedDelivery=" + this.OooOOo + ", mDistinctBycontent=" + this.OooOOoo + '}';
    }
}
