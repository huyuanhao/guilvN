package com.p118pd.sdk;

import com.adobe.xmp.XMPException;

/* renamed from: com.pd.sdk.o0OOoO0  reason: case insensitive filesystem */
public class C7428o0OOoO0 {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20240OooO00o;

    public C7428o0OOoO0(String str) {
        this.f20240OooO00o = str;
    }

    public char OooO00o() {
        if (this.OooO00o < this.f20240OooO00o.length()) {
            return this.f20240OooO00o.charAt(this.OooO00o);
        }
        return 0;
    }

    public char OooO00o(int i) {
        if (i < this.f20240OooO00o.length()) {
            return this.f20240OooO00o.charAt(i);
        }
        return 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18992OooO00o() {
        return this.f20240OooO00o.length();
    }

    public int OooO00o(String str, int i) throws XMPException {
        char OooO00o2 = OooO00o(this.OooO00o);
        int i2 = 0;
        boolean z = false;
        while ('0' <= OooO00o2 && OooO00o2 <= '9') {
            i2 = (i2 * 10) + (OooO00o2 - '0');
            int i3 = this.OooO00o + 1;
            this.OooO00o = i3;
            OooO00o2 = OooO00o(i3);
            z = true;
        }
        if (!z) {
            throw new XMPException(str, 5);
        } else if (i2 > i) {
            return i;
        } else {
            if (i2 < 0) {
                return 0;
            }
            return i2;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18993OooO00o() {
        this.OooO00o++;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18994OooO00o() {
        return this.OooO00o < this.f20240OooO00o.length();
    }

    public int OooO0O0() {
        return this.OooO00o;
    }
}
