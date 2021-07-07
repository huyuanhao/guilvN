package com.p118pd.sdk;

import java.util.Collections;
import java.util.Set;
import org.bouncycastle.cert.path.CertPathValidationException;

/* renamed from: com.pd.sdk.L1LLL */
public class L1LLL {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set f16179OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CertPathValidationException f16180OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f16181OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16182OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CertPathValidationException[] f16183OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int[] f16184OooO0O0;

    public L1LLL(C5692LLlIl r1) {
        Set unmodifiableSet = Collections.unmodifiableSet(r1.m16270OooO00o());
        this.f16179OooO00o = unmodifiableSet;
        this.f16181OooO00o = unmodifiableSet.isEmpty();
        this.OooO00o = -1;
        this.OooO0O0 = -1;
        this.f16180OooO00o = null;
    }

    public L1LLL(C5692LLlIl r1, int i, int i2, CertPathValidationException certPathValidationException) {
        this.f16179OooO00o = Collections.unmodifiableSet(r1.m16270OooO00o());
        this.f16181OooO00o = false;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f16180OooO00o = certPathValidationException;
    }

    public L1LLL(C5692LLlIl r2, int[] iArr, int[] iArr2, CertPathValidationException[] certPathValidationExceptionArr) {
        this.f16179OooO00o = Collections.unmodifiableSet(r2.m16270OooO00o());
        this.f16181OooO00o = false;
        this.f16180OooO00o = certPathValidationExceptionArr[0];
        this.OooO00o = iArr[0];
        this.OooO0O0 = iArr2[0];
        this.f16183OooO00o = certPathValidationExceptionArr;
        this.f16182OooO00o = iArr;
        this.f16184OooO0O0 = iArr2;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m15951OooO00o() {
        return this.f16179OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CertPathValidationException m15952OooO00o() {
        CertPathValidationException certPathValidationException = this.f16180OooO00o;
        if (certPathValidationException != null) {
            return certPathValidationException;
        }
        if (!this.f16179OooO00o.isEmpty()) {
            return new CertPathValidationException("Unhandled Critical Extensions");
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15953OooO00o() {
        return this.f16182OooO00o != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m15954OooO00o() {
        return C9586iIILl.m21635OooO00o(this.f16182OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CertPathValidationException[] m15955OooO00o() {
        CertPathValidationException[] certPathValidationExceptionArr = this.f16183OooO00o;
        if (certPathValidationExceptionArr != null) {
            CertPathValidationException[] certPathValidationExceptionArr2 = new CertPathValidationException[certPathValidationExceptionArr.length];
            System.arraycopy(certPathValidationExceptionArr, 0, certPathValidationExceptionArr2, 0, certPathValidationExceptionArr.length);
            return certPathValidationExceptionArr2;
        } else if (this.f16179OooO00o.isEmpty()) {
            return null;
        } else {
            return new CertPathValidationException[]{new CertPathValidationException("Unhandled Critical Extensions")};
        }
    }

    public int OooO0O0() {
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15956OooO0O0() {
        return this.f16181OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int[] m15957OooO0O0() {
        return C9586iIILl.m21635OooO00o(this.f16184OooO0O0);
    }
}
