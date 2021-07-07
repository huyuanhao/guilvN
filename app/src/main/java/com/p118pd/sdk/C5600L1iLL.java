package com.p118pd.sdk;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.L1丨iL丨L  reason: invalid class name and case insensitive filesystem */
public class C5600L1iLL implements AbstractC5490IlLL {
    public BigInteger OooO;
    public IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9738llL1L f16246OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16247OooO00o;
    public BigInteger OooO0oO;
    public BigInteger OooO0oo;

    public C5600L1iLL(IIiLIli r7, AbstractC9738llL1L r8, BigInteger bigInteger) {
        this(r7, r8, bigInteger, AbstractC5490IlLL.OooO0O0, null);
    }

    public C5600L1iLL(IIiLIli r7, AbstractC9738llL1L r8, BigInteger bigInteger, BigInteger bigInteger2) {
        this(r7, r8, bigInteger, bigInteger2, null);
    }

    public C5600L1iLL(IIiLIli r2, AbstractC9738llL1L r3, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.OooO = null;
        if (r2 == null) {
            throw new NullPointerException("curve");
        } else if (bigInteger != null) {
            this.OooO00o = r2;
            this.f16246OooO00o = OooO00o(r2, r3);
            this.OooO0oO = bigInteger;
            this.OooO0oo = bigInteger2;
            this.f16247OooO00o = bArr;
        } else {
            throw new NullPointerException(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
        }
    }

    public static AbstractC9738llL1L OooO00o(IIiLIli r1, AbstractC9738llL1L r2) {
        if (r2 == null) {
            throw new IllegalArgumentException("point has null value");
        } else if (!r2.m21814OooO0OO()) {
            AbstractC9738llL1L OooO0Oo = r2.OooO0Oo();
            if (OooO0Oo.m21820OooO0o0()) {
                return Lii1I.OooO0O0(r1, OooO0Oo);
            }
            throw new IllegalArgumentException("point not on curve");
        } else {
            throw new IllegalArgumentException("point at infinity");
        }
    }

    public IIiLIli OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m16003OooO00o() {
        return this.f16246OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16004OooO00o() {
        return this.OooO0oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16005OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f16247OooO00o);
    }

    public synchronized BigInteger OooO0O0() {
        if (this.OooO == null) {
            this.OooO = this.OooO0oo.modInverse(this.OooO0oO);
        }
        return this.OooO;
    }

    public BigInteger OooO0OO() {
        return this.OooO0oO;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5600L1iLL)) {
            return false;
        }
        C5600L1iLL r5 = (C5600L1iLL) obj;
        return this.OooO00o.OooO00o(r5.OooO00o) && this.f16246OooO00o.m21806OooO00o(r5.f16246OooO00o) && this.OooO0oO.equals(r5.OooO0oO) && this.OooO0oo.equals(r5.OooO0oo);
    }

    public int hashCode() {
        return (((((this.OooO00o.hashCode() * 37) ^ this.f16246OooO00o.hashCode()) * 37) ^ this.OooO0oO.hashCode()) * 37) ^ this.OooO0oo.hashCode();
    }
}
