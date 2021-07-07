package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iI丨1i  reason: invalid class name and case insensitive filesystem */
public class C6135iI1i extends C6470l1i {
    public boolean OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    public C6135iI1i(SecureRandom secureRandom, int i, int i2, int i3) {
        this(secureRandom, i, i2, i3, false);
    }

    public C6135iI1i(SecureRandom secureRandom, int i, int i2, int i3, boolean z) {
        super(secureRandom, i);
        this.OooO00o = false;
        this.OooO0O0 = i2;
        if (i3 % 2 == 1) {
            throw new IllegalArgumentException("cntSmallPrimes must be a multiple of 2");
        } else if (i3 >= 30) {
            this.OooO0OO = i3;
            this.OooO00o = z;
        } else {
            throw new IllegalArgumentException("cntSmallPrimes must be >= 30 for security reasons");
        }
    }

    @Override // com.p118pd.sdk.C6470l1i, com.p118pd.sdk.C6470l1i
    public boolean OooO00o() {
        return this.OooO00o;
    }

    public int OooO0O0() {
        return this.OooO0O0;
    }

    public int OooO0OO() {
        return this.OooO0OO;
    }
}
