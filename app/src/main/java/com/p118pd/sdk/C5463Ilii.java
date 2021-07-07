package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.dvcs.DVCSParsingException;

/* renamed from: com.pd.sdk.Ili丨i  reason: invalid class name and case insensitive filesystem */
public class C5463Ilii {
    public C6207iLLILi OooO00o;

    public C5463Ilii(C6207iLLILi r1) {
        this.OooO00o = r1;
    }

    public C5463Ilii(byte[] bArr) {
        this(C6207iLLILi.OooO00o(bArr));
    }

    public static boolean OooO00o(C5463Ilii r3, C5463Ilii r4) {
        C6207iLLILi r32 = r3.OooO00o;
        C6207iLLILi r42 = r4.OooO00o;
        if (r32.OooO0O0() != r42.OooO0O0() || !OooO00o(r32.OooO00o(), r42.OooO00o()) || !OooO00o(r32.m17186OooO00o(), r42.m17186OooO00o()) || !OooO00o(r32.m17189OooO00o(), r42.m17189OooO00o()) || !OooO00o(r32.m17188OooO00o(), r42.m17188OooO00o())) {
            return false;
        }
        if (r32.m17190OooO00o() == null) {
            return true;
        }
        if (r42.m17190OooO00o() == null) {
            return false;
        }
        byte[] byteArray = r32.m17190OooO00o().toByteArray();
        byte[] byteArray2 = r42.m17190OooO00o().toByteArray();
        return byteArray2.length >= byteArray.length && C9586iIILl.m21627OooO00o(byteArray, C9586iIILl.m21632OooO00o(byteArray2, 0, byteArray.length));
    }

    public static boolean OooO00o(Object obj, Object obj2) {
        return (obj == null && obj2 == null) || (obj != null && obj.equals(obj2));
    }

    public int OooO00o() {
        return this.OooO00o.OooO00o().OooO00o().intValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5845LIillll m15700OooO00o() {
        return this.OooO00o.m17187OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6207iLLILi m15701OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9879iI m15702OooO00o() {
        if (this.OooO00o.m17189OooO00o() != null) {
            return this.OooO00o.m17189OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15703OooO00o() {
        return this.OooO00o.m17190OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m15704OooO00o() throws DVCSParsingException {
        C5509IIiI OooO00o2 = this.OooO00o.m17186OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        try {
            return OooO00o2.m15760OooO00o() != null ? OooO00o2.m15760OooO00o().OooO00o() : new C9448Il(OooO00o2.OooO00o()).OooO00o().m15621OooO00o();
        } catch (Exception e) {
            throw new DVCSParsingException("unable to extract time: " + e.getMessage(), e);
        }
    }

    public int OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5845LIillll m15705OooO0O0() {
        return this.OooO00o.m17191OooO0O0();
    }

    public C5845LIillll OooO0OO() {
        return this.OooO00o.OooO0OO();
    }
}
