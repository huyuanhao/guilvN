package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oO0Oo00O  reason: case insensitive filesystem */
public final class C7885oO0Oo00O implements AbstractC7644o0oOoOO {
    public final Object OooO00o;

    public C7885oO0Oo00O(@NonNull Object obj) {
        this.OooO00o = C7842oO0O0.OooO00o(obj);
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.OooO00o.toString().getBytes(AbstractC7644o0oOoOO.f20533OooO00o));
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (obj instanceof C7885oO0Oo00O) {
            return this.OooO00o.equals(((C7885oO0Oo00O) obj).OooO00o);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.OooO00o + '}';
    }
}
