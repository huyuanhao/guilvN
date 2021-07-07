package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

public final class zzz {
    public final KeyPair zzbr;
    public final long zzbs;

    @VisibleForTesting
    public zzz(KeyPair keyPair, long j) {
        this.zzbr = keyPair;
        this.zzbs = j;
    }

    /* access modifiers changed from: private */
    public final String zzv() {
        return Base64.encodeToString(this.zzbr.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    public final String zzw() {
        return Base64.encodeToString(this.zzbr.getPrivate().getEncoded(), 11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzz)) {
            return false;
        }
        zzz zzz = (zzz) obj;
        if (this.zzbs != zzz.zzbs || !this.zzbr.getPublic().equals(zzz.zzbr.getPublic()) || !this.zzbr.getPrivate().equals(zzz.zzbr.getPrivate())) {
            return false;
        }
        return true;
    }

    public final long getCreationTime() {
        return this.zzbs;
    }

    public final KeyPair getKeyPair() {
        return this.zzbr;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbr.getPublic(), this.zzbr.getPrivate(), Long.valueOf(this.zzbs));
    }
}
