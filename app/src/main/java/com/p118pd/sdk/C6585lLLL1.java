package com.p118pd.sdk;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;

/* renamed from: com.pd.sdk.lLLL1  reason: case insensitive filesystem */
public class C6585lLLL1 {
    public char OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18502OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f18503OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public StringBuffer f18504OooO00o;

    public C6585lLLL1(String str) {
        this(str, AbstractC1299b.COMMA);
    }

    public C6585lLLL1(String str, char c) {
        this.f18504OooO00o = new StringBuffer();
        this.f18503OooO00o = str;
        this.f18502OooO00o = -1;
        this.OooO00o = c;
    }

    public String OooO00o() {
        if (this.f18502OooO00o == this.f18503OooO00o.length()) {
            return null;
        }
        int i = this.f18502OooO00o + 1;
        this.f18504OooO00o.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.f18503OooO00o.length()) {
            char charAt = this.f18503OooO00o.charAt(i);
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
            } else if (!z && !z2) {
                if (charAt == '\\') {
                    this.f18504OooO00o.append(charAt);
                    z = true;
                } else if (charAt == this.OooO00o) {
                    break;
                } else {
                    this.f18504OooO00o.append(charAt);
                }
                i++;
            }
            this.f18504OooO00o.append(charAt);
            z = false;
            i++;
        }
        this.f18502OooO00o = i;
        return this.f18504OooO00o.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17685OooO00o() {
        return this.f18502OooO00o != this.f18503OooO00o.length();
    }
}
