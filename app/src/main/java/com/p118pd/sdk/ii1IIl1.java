package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii1IIl1丨  reason: invalid class name */
public class ii1IIl1 extends C6213iL11I {
    public C5312ILl OooO00o;

    public ii1IIl1(boolean z, C5312ILl iLl) {
        super(z);
        this.OooO00o = iLl;
    }

    @Override // com.p118pd.sdk.C6213iL11I
    public C5312ILl OooO00o() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ii1IIl1)) {
            return false;
        }
        C5312ILl iLl = this.OooO00o;
        C5312ILl OooO00o2 = ((ii1IIl1) obj).OooO00o();
        return iLl == null ? OooO00o2 == null : iLl.equals(OooO00o2);
    }

    public int hashCode() {
        C5312ILl iLl = this.OooO00o;
        if (iLl != null) {
            return iLl.hashCode();
        }
        return 0;
    }
}
