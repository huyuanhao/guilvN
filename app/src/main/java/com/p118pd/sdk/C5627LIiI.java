package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIiI  reason: case insensitive filesystem */
public class C5627LIiI extends C6213iL11I {
    public C6017i1Il OooO00o;

    public C5627LIiI(boolean z, C6017i1Il i1il) {
        super(z);
        this.OooO00o = i1il;
    }

    @Override // com.p118pd.sdk.C6213iL11I
    public C6017i1Il OooO00o() {
        return this.OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5627LIiI)) {
            return false;
        }
        C6017i1Il i1il = this.OooO00o;
        C6017i1Il OooO00o2 = ((C5627LIiI) obj).OooO00o();
        return i1il == null ? OooO00o2 == null : i1il.equals(OooO00o2);
    }

    public int hashCode() {
        int i = !OooO00o();
        C6017i1Il i1il = this.OooO00o;
        return i1il != null ? i ^ i1il.hashCode() : i;
    }
}
