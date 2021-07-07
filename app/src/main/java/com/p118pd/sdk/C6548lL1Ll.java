package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lL1Ll丨  reason: invalid class name and case insensitive filesystem */
public class C6548lL1Ll implements AbstractC6047i1lLI {
    public final BigInteger OooO00o;

    public C6548lL1Ll(BigInteger bigInteger) {
        this.OooO00o = bigInteger;
    }

    @Override // com.p118pd.sdk.AbstractC6047i1lLI
    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6047i1lLI
    public int OooO0O0() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6548lL1Ll)) {
            return false;
        }
        return this.OooO00o.equals(((C6548lL1Ll) obj).OooO00o);
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }
}
