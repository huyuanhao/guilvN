package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iII丨iLli  reason: invalid class name */
public class iIIiLli {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f17500OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f17501OooO0O0;

    public iIIiLli(int i, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
    }

    public iIIiLli(long j, long j2) {
        this.f17500OooO00o = j;
        this.f17501OooO0O0 = j2;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m16950OooO00o() {
        return this.f17501OooO0O0;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public long m16951OooO0O0() {
        return this.f17500OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iIIiLli)) {
            return false;
        }
        iIIiLli r7 = (iIIiLli) obj;
        return r7.OooO0O0 == this.OooO0O0 && r7.OooO00o == this.OooO00o && r7.f17501OooO0O0 == this.f17501OooO0O0 && r7.f17500OooO00o == this.f17500OooO00o;
    }

    public int hashCode() {
        int i = this.OooO00o ^ this.OooO0O0;
        long j = this.f17500OooO00o;
        long j2 = this.f17501OooO0O0;
        return (((i ^ ((int) j)) ^ ((int) (j >> 32))) ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }
}
