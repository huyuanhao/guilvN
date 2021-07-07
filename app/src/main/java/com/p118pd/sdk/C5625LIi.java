package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import org.bouncycastle.cert.X509AttributeCertificateHolder;

/* renamed from: com.pd.sdk.LIi  reason: case insensitive filesystem */
public class C5625LIi implements AbstractC6317ilLi {
    public final IL1LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5856LLl1I f16306OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f16307OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Collection f16308OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Date f16309OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final X509AttributeCertificateHolder f16310OooO00o;
    public final Collection OooO0O0;

    public C5625LIi(C5856LLl1I r1, IL1LI r2, BigInteger bigInteger, Date date, X509AttributeCertificateHolder x509AttributeCertificateHolder, Collection collection, Collection collection2) {
        this.f16306OooO00o = r1;
        this.OooO00o = r2;
        this.f16307OooO00o = bigInteger;
        this.f16309OooO00o = date;
        this.f16310OooO00o = x509AttributeCertificateHolder;
        this.f16308OooO00o = collection;
        this.OooO0O0 = collection2;
    }

    public IL1LI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5856LLl1I m16064OooO00o() {
        return this.f16306OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16065OooO00o() {
        return this.f16307OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m16066OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m16067OooO00o() {
        if (this.f16309OooO00o != null) {
            return new Date(this.f16309OooO00o.getTime());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509AttributeCertificateHolder m16068OooO00o() {
        return this.f16310OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        C5237III extension;
        if (!(obj instanceof X509AttributeCertificateHolder)) {
            return false;
        }
        X509AttributeCertificateHolder x509AttributeCertificateHolder = (X509AttributeCertificateHolder) obj;
        X509AttributeCertificateHolder x509AttributeCertificateHolder2 = this.f16310OooO00o;
        if (!(x509AttributeCertificateHolder2 == null || x509AttributeCertificateHolder2.equals(x509AttributeCertificateHolder))) {
            return false;
        }
        if (!(this.f16307OooO00o == null || x509AttributeCertificateHolder.getSerialNumber().equals(this.f16307OooO00o))) {
            return false;
        }
        if (!(this.f16306OooO00o == null || x509AttributeCertificateHolder.getHolder().equals(this.f16306OooO00o))) {
            return false;
        }
        if (!(this.OooO00o == null || x509AttributeCertificateHolder.getIssuer().equals(this.OooO00o))) {
            return false;
        }
        Date date = this.f16309OooO00o;
        if (!(date == null || x509AttributeCertificateHolder.isValidOn(date))) {
            return false;
        }
        if ((!this.f16308OooO00o.isEmpty() || !this.OooO0O0.isEmpty()) && (extension = x509AttributeCertificateHolder.getExtension(C5237III.o00o0OO0)) != null) {
            try {
                IIl1LLl[] OooO00o2 = C9761IiiLLI.OooO00o(extension.m15435OooO0O0()).OooO00o();
                if (!this.f16308OooO00o.isEmpty()) {
                    boolean z = false;
                    for (IIl1LLl r4 : OooO00o2) {
                        C5620LII[] OooO00o3 = r4.OooO00o();
                        int i = 0;
                        while (true) {
                            if (i >= OooO00o3.length) {
                                break;
                            } else if (this.f16308OooO00o.contains(ILI.OooO00o(OooO00o3[i].OooO0O0()))) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
                if (!this.OooO0O0.isEmpty()) {
                    boolean z2 = false;
                    for (IIl1LLl r42 : OooO00o2) {
                        C5620LII[] OooO00o4 = r42.OooO00o();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= OooO00o4.length) {
                                break;
                            } else if (this.OooO0O0.contains(ILI.OooO00o(OooO00o4[i2].OooO00o()))) {
                                z2 = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return true;
    }

    public Collection OooO0O0() {
        return this.f16308OooO00o;
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C5625LIi(this.f16306OooO00o, this.OooO00o, this.f16307OooO00o, this.f16309OooO00o, this.f16310OooO00o, this.f16308OooO00o, this.OooO0O0);
    }
}
