package com.p118pd.sdk;

import com.facebook.cache.disk.DefaultDiskStorage;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.lI1II1 */
public class lI1II1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f18322OooO00o;
    public final BigInteger OooO0O0;
    public final BigInteger OooO0OO;
    public final BigInteger OooO0Oo;
    public final BigInteger OooO0o;
    public final BigInteger OooO0o0;
    public final BigInteger OooO0oO;
    public final BigInteger OooO0oo;

    public lI1II1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        OooO00o(bigIntegerArr, "v1");
        OooO00o(bigIntegerArr2, DefaultDiskStorage.DEFAULT_DISK_STORAGE_VERSION_PREFIX);
        this.f18322OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigIntegerArr[0];
        this.OooO0Oo = bigIntegerArr[1];
        this.OooO0o0 = bigIntegerArr2[0];
        this.OooO0o = bigIntegerArr2[1];
        this.OooO0oO = bigInteger3;
        this.OooO0oo = bigInteger4;
        this.OooO00o = i;
    }

    public static void OooO00o(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17616OooO00o() {
        return this.f18322OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger[] m17617OooO00o() {
        return new BigInteger[]{this.OooO0OO, this.OooO0Oo};
    }

    public BigInteger OooO0O0() {
        return this.OooO0oO;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger[] m17618OooO0O0() {
        return new BigInteger[]{this.OooO0o0, this.OooO0o};
    }

    public BigInteger OooO0OO() {
        return this.OooO0oo;
    }

    public BigInteger OooO0Oo() {
        return this.OooO0O0;
    }

    public BigInteger OooO0o() {
        return this.OooO0Oo;
    }

    public BigInteger OooO0o0() {
        return this.OooO0OO;
    }

    public BigInteger OooO0oO() {
        return this.OooO0o0;
    }

    public BigInteger OooO0oo() {
        return this.OooO0o;
    }
}
