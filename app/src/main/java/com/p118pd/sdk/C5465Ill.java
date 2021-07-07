package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ill  reason: case insensitive filesystem */
public class C5465Ill {
    public C9521Ll OooO00o;

    public C5465Ill(C9521Ll r1) {
        this.OooO00o = r1;
    }

    private int OooO00o(C6513lIiI r1) {
        if (r1 != null) {
            return r1.m17647OooO0O0().intValue();
        }
        return 0;
    }

    private String OooO00o(int i) {
        StringBuilder sb;
        String str;
        if (i < 10) {
            sb = new StringBuilder();
            str = "00";
        } else if (i >= 100) {
            return Integer.toString(i);
        } else {
            sb = new StringBuilder();
            str = "0";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public int OooO00o() {
        return OooO00o(this.OooO00o.OooO00o());
    }

    public int OooO0O0() {
        return OooO00o(this.OooO00o.m21582OooO0O0());
    }

    public int OooO0OO() {
        return OooO00o(this.OooO00o.OooO0OO());
    }

    public String toString() {
        return OooO0OO() + C9058ooOoOoOO.OooOO0 + OooO00o(OooO0O0()) + OooO00o(OooO00o());
    }
}
