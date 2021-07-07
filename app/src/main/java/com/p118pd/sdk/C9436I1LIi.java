package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.cert.X509AttributeCertificateHolder;

/* renamed from: com.pd.sdk.丨I丨1L丨Ii  reason: invalid class name and case insensitive filesystem */
public class C9436I1LIi {
    public IL1LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5856LLl1I f22978OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f22979OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Collection f22980OooO00o = new HashSet();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Date f22981OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public X509AttributeCertificateHolder f22982OooO00o;
    public Collection OooO0O0 = new HashSet();

    private Set OooO00o(Collection collection) throws IOException {
        if (collection == null || collection.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (Object obj : collection) {
            hashSet.add(ILI.OooO00o(obj));
        }
        return hashSet;
    }

    public C5625LIi OooO00o() {
        return new C5625LIi(this.f22978OooO00o, this.OooO00o, this.f22979OooO00o, this.f22981OooO00o, this.f22982OooO00o, Collections.unmodifiableCollection(new HashSet(this.f22980OooO00o)), Collections.unmodifiableCollection(new HashSet(this.OooO0O0)));
    }

    public void OooO00o(IL1LI r1) {
        this.OooO00o = r1;
    }

    public void OooO00o(ILI ili) {
        this.OooO0O0.add(ili);
    }

    public void OooO00o(C5856LLl1I r1) {
        this.f22978OooO00o = r1;
    }

    public void OooO00o(BigInteger bigInteger) {
        this.f22979OooO00o = bigInteger;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21473OooO00o(Collection collection) throws IOException {
        this.OooO0O0 = OooO00o(collection);
    }

    public void OooO00o(Date date) {
        if (date != null) {
            this.f22981OooO00o = new Date(date.getTime());
        } else {
            this.f22981OooO00o = null;
        }
    }

    public void OooO00o(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        this.f22982OooO00o = x509AttributeCertificateHolder;
    }

    public void OooO0O0(ILI ili) {
        this.f22980OooO00o.add(ili);
    }

    public void OooO0O0(Collection collection) throws IOException {
        this.f22980OooO00o = OooO00o(collection);
    }
}
