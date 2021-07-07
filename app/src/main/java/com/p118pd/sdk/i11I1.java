package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨i11I1丨  reason: invalid class name */
public class i11I1 {
    public String OooO00o;
    public String OooO0O0;

    public i11I1(String str, String str2) {
        this.OooO00o = str;
        this.OooO0O0 = str2;
    }

    private int OooO00o(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    private boolean OooO00o(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i11I1)) {
            return false;
        }
        i11I1 r4 = (i11I1) obj;
        return r4 == this || (OooO00o(this.OooO00o, r4.OooO00o) && OooO00o(this.OooO0O0, r4.OooO0O0));
    }

    public int hashCode() {
        return OooO00o(this.OooO00o) + (OooO00o(this.OooO0O0) * 31);
    }
}
