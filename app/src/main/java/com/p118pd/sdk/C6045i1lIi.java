package com.p118pd.sdk;

import com.p118pd.sdk.C11lILlL;
import java.security.InvalidParameterException;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.i1lIi丨  reason: invalid class name and case insensitive filesystem */
public class C6045i1lIi implements CertPathParameters {
    public final C11lILlL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<X509Certificate> f17439OooO00o;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.i1lIi丨$OooO0O0 */
    public static class OooO0O0 {
        public int OooO00o = 5;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C11lILlL f17440OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Set<X509Certificate> f17441OooO00o = new HashSet();

        public OooO0O0(C11lILlL r2) {
            this.f17440OooO00o = r2;
        }

        public OooO0O0(PKIXBuilderParameters pKIXBuilderParameters) {
            this.f17440OooO00o = new C11lILlL.OooO0O0(pKIXBuilderParameters).OooO00o();
            this.OooO00o = pKIXBuilderParameters.getMaxPathLength();
        }

        public OooO0O0 OooO00o(int i) {
            if (i >= -1) {
                this.OooO00o = i;
                return this;
            }
            throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
        }

        public OooO0O0 OooO00o(Set<X509Certificate> set) {
            this.f17441OooO00o.addAll(set);
            return this;
        }

        public C6045i1lIi OooO00o() {
            return new C6045i1lIi(this);
        }
    }

    public C6045i1lIi(OooO0O0 oooO0O0) {
        this.OooO00o = oooO0O0.f17440OooO00o;
        this.f17439OooO00o = Collections.unmodifiableSet(oooO0O0.f17441OooO00o);
        this.o00oO0O = oooO0O0.OooO00o;
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C11lILlL m16910OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m16911OooO00o() {
        return this.f17439OooO00o;
    }

    @Override // java.lang.Object
    public Object clone() {
        return this;
    }
}
