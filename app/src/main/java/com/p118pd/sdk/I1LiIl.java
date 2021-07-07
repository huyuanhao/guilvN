package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1LiIl丨  reason: invalid class name */
public class I1LiIl extends C6213iL11I {
    public L11I OooO00o;

    public I1LiIl(boolean z, L11I l11i) {
        super(z);
        this.OooO00o = l11i;
    }

    @Override // com.p118pd.sdk.C6213iL11I
    public L11I OooO00o() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof I1LiIl)) {
            return false;
        }
        L11I l11i = this.OooO00o;
        L11I OooO00o2 = ((I1LiIl) obj).OooO00o();
        return l11i == null ? OooO00o2 == null : l11i.equals(OooO00o2);
    }

    public int hashCode() {
        int i = !OooO00o();
        L11I l11i = this.OooO00o;
        return l11i != null ? i ^ l11i.hashCode() : i;
    }
}
