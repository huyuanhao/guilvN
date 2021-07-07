package com.p118pd.sdk;

import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.I丨丨1  reason: invalid class name and case insensitive filesystem */
public class C5564I1 {
    public final AbstractC6271iilI<X509CertificateHolder> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6773llLi f16089OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C111 f16090OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f16091OooO00o;
    public AbstractC6271iilI<X509CRLHolder> OooO0O0;

    public C5564I1(AbstractC6271iilI<X509CertificateHolder> iili, AbstractC6271iilI<X509CRLHolder> iili2, C6773llLi r3, C111 r4, boolean z) {
        this.OooO00o = iili;
        this.f16089OooO00o = r3;
        this.f16090OooO00o = r4;
        this.f16091OooO00o = z;
        this.OooO0O0 = iili2;
    }

    public AbstractC6271iilI<X509CertificateHolder> OooO00o() {
        AbstractC6271iilI<X509CertificateHolder> iili = this.OooO00o;
        if (iili != null) {
            return iili;
        }
        throw new IllegalStateException("Response has no certificates.");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6773llLi m15868OooO00o() {
        return this.f16089OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m15869OooO00o() {
        return this.f16090OooO00o.m21230OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15870OooO00o() {
        return this.OooO0O0 != null;
    }

    public AbstractC6271iilI<X509CRLHolder> OooO0O0() {
        AbstractC6271iilI<X509CRLHolder> iili = this.OooO0O0;
        if (iili != null) {
            return iili;
        }
        throw new IllegalStateException("Response has no CRLs.");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15871OooO0O0() {
        return this.OooO00o != null;
    }

    public boolean OooO0OO() {
        return this.f16091OooO00o;
    }
}
