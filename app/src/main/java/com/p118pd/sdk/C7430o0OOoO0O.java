package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0OOoO0O  reason: case insensitive filesystem */
public class C7430o0OOoO0O {
    public String OooO00o;
    public String OooO0O0;

    public C7430o0OOoO0O(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            this.OooO00o = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            this.OooO00o = "";
        }
        this.OooO0O0 = str;
    }

    public C7430o0OOoO0O(String str, String str2) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
    }

    public String OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18997OooO00o() {
        String str = this.OooO00o;
        return str != null && str.length() > 0;
    }

    public String OooO0O0() {
        return this.OooO00o;
    }
}
