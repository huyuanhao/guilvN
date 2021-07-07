package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Date;
import java.util.Locale;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.iIi111l  reason: case insensitive filesystem */
public class C6104iIi111l {
    public i1Lii OooO00o;

    public C6104iIi111l(l1LILI1 r3, BigInteger bigInteger, C5432IlIlIlL r5, C5432IlIlIlL r6, l1LILI1 r7, C6888ll r8) {
        if (r3 == null) {
            throw new IllegalArgumentException("issuer must not be null");
        } else if (r8 != null) {
            i1Lii i1lii = new i1Lii();
            this.OooO00o = i1lii;
            i1lii.OooO00o(new C6513lIiI(bigInteger));
            this.OooO00o.OooO00o(r3);
            this.OooO00o.OooO0O0(r5);
            this.OooO00o.OooO00o(r6);
            this.OooO00o.OooO0O0(r7);
            this.OooO00o.OooO00o(r8);
        } else {
            throw new IllegalArgumentException("publicKeyInfo must not be null");
        }
    }

    public C6104iIi111l(l1LILI1 r8, BigInteger bigInteger, Date date, Date date2, l1LILI1 r12, C6888ll r13) {
        this(r8, bigInteger, new C5432IlIlIlL(date), new C5432IlIlIlL(date2), r12, r13);
    }

    public C6104iIi111l(l1LILI1 r8, BigInteger bigInteger, Date date, Date date2, Locale locale, l1LILI1 r13, C6888ll r14) {
        this(r8, bigInteger, new C5432IlIlIlL(date, locale), new C5432IlIlIlL(date2, locale), r13, r14);
    }

    public X509CertificateHolder OooO00o(Lii1ii1 r3) {
        this.OooO00o.OooO00o(r3.OooO00o());
        return lIil1IL.OooO00o(r3, this.OooO00o.OooO00o());
    }
}
