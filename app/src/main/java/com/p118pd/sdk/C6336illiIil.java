package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.illi丨Iil  reason: invalid class name and case insensitive filesystem */
public class C6336illiIil extends ii1IIl1 {
    public BigInteger OooO00o;

    public C6336illiIil(BigInteger bigInteger, C5312ILl iLl) {
        super(true, iLl);
        this.OooO00o = bigInteger;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.ii1IIl1
    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.ii1IIl1
    public boolean equals(Object obj) {
        if ((obj instanceof C6336illiIil) && ((C6336illiIil) obj).OooO00o().equals(this.OooO00o)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.p118pd.sdk.ii1IIl1
    public int hashCode() {
        return OooO00o().hashCode();
    }
}
