package com.p118pd.sdk;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;

/* renamed from: com.pd.sdk.IlIil11 */
public class IlIil11 {
    public char OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f15818OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f15819OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public StringBuffer f15820OooO00o;

    public IlIil11(String str) {
        this(str, AbstractC1299b.COMMA);
    }

    public IlIil11(String str, char c) {
        this.f15820OooO00o = new StringBuffer();
        this.f15819OooO00o = str;
        this.f15818OooO00o = -1;
        this.OooO00o = c;
    }

    public String OooO00o() {
        if (this.f15818OooO00o == this.f15819OooO00o.length()) {
            return null;
        }
        int i = this.f15818OooO00o + 1;
        this.f15820OooO00o.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.f15819OooO00o.length()) {
            char charAt = this.f15819OooO00o.charAt(i);
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
            } else if (!z && !z2) {
                if (charAt == '\\') {
                    this.f15820OooO00o.append(charAt);
                    z = true;
                } else if (charAt == this.OooO00o) {
                    break;
                } else {
                    this.f15820OooO00o.append(charAt);
                }
                i++;
            }
            this.f15820OooO00o.append(charAt);
            z = false;
            i++;
        }
        this.f15818OooO00o = i;
        return this.f15820OooO00o.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15664OooO00o() {
        return this.f15818OooO00o != this.f15819OooO00o.length();
    }
}
