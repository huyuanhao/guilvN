package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.o0oo0o  reason: case insensitive filesystem */
public final class C7691o0oo0o implements AbstractC7644o0oOoOO {
    public final AbstractC7644o0oOoOO OooO00o;
    public final AbstractC7644o0oOoOO OooO0O0;

    public C7691o0oo0o(AbstractC7644o0oOoOO o0ooooo, AbstractC7644o0oOoOO o0ooooo2) {
        this.OooO00o = o0ooooo;
        this.OooO0O0 = o0ooooo2;
    }

    public AbstractC7644o0oOoOO OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (!(obj instanceof C7691o0oo0o)) {
            return false;
        }
        C7691o0oo0o o0oo0o = (C7691o0oo0o) obj;
        if (!this.OooO00o.equals(o0oo0o.OooO00o) || !this.OooO0O0.equals(o0oo0o.OooO0O0)) {
            return false;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return (this.OooO00o.hashCode() * 31) + this.OooO0O0.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.OooO00o + ", signature=" + this.OooO0O0 + '}';
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        this.OooO00o.OooO00o(messageDigest);
        this.OooO0O0.OooO00o(messageDigest);
    }
}
