package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨i */
public class C1705i {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23139OooO00o;

    public C1705i(String str) {
        this.f23139OooO00o = str;
    }

    public String OooO00o() {
        int i = this.OooO00o;
        if (i == -1) {
            return null;
        }
        int indexOf = this.f23139OooO00o.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.f23139OooO00o.substring(this.OooO00o);
            this.OooO00o = -1;
            return substring;
        }
        String substring2 = this.f23139OooO00o.substring(this.OooO00o, indexOf);
        this.OooO00o = indexOf + 1;
        return substring2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21612OooO00o() {
        return this.OooO00o != -1;
    }
}
