package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiL1  reason: case insensitive filesystem */
public class C6238iiL1 {
    public final AbstractC9738llL1L OooO00o;
    public final AbstractC9738llL1L OooO0O0;

    public C6238iiL1(AbstractC9738llL1L r1, AbstractC9738llL1L r2) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    public AbstractC9738llL1L OooO00o() {
        return this.OooO00o;
    }

    public boolean OooO00o(C6238iiL1 iil1) {
        return iil1.OooO00o().m21806OooO00o(OooO00o()) && iil1.OooO0O0().m21806OooO00o(OooO0O0());
    }

    public AbstractC9738llL1L OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6238iiL1) {
            return OooO00o((C6238iiL1) obj);
        }
        return false;
    }

    public int hashCode() {
        return this.OooO00o.hashCode() + (this.OooO0O0.hashCode() * 37);
    }
}
