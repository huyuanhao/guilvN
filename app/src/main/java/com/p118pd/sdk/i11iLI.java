package com.p118pd.sdk;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

/* renamed from: com.pd.sdk.i11i丨LI  reason: invalid class name */
public class i11iLI implements CertStoreParameters {
    public Collection OooO00o;
    public boolean OooO0O0;

    public i11iLI(Collection collection) {
        this(collection, true);
    }

    public i11iLI(Collection collection, boolean z) {
        this.OooO00o = collection;
        this.OooO0O0 = z;
    }

    public Collection OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16852OooO00o() {
        return this.OooO0O0;
    }

    @Override // java.lang.Object
    public Object clone() {
        return this;
    }
}
