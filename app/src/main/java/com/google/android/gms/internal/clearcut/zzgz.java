package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class zzgz extends zzfu<zzgz> implements Cloneable {
    public byte[] zzbjb = zzgb.zzse;
    public String zzbjc = "";
    public byte[][] zzbjd = zzgb.zzsd;
    public boolean zzbje = false;

    public zzgz() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzgc */
    public final zzgz clone() {
        try {
            zzgz zzgz = (zzgz) super.clone();
            byte[][] bArr = this.zzbjd;
            if (bArr != null && bArr.length > 0) {
                zzgz.zzbjd = (byte[][]) bArr.clone();
            }
            return zzgz;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgz = (zzgz) obj;
        if (!Arrays.equals(this.zzbjb, zzgz.zzbjb)) {
            return false;
        }
        String str = this.zzbjc;
        if (str == null) {
            if (zzgz.zzbjc != null) {
                return false;
            }
        } else if (!str.equals(zzgz.zzbjc)) {
            return false;
        }
        if (!zzfy.zza(this.zzbjd, zzgz.zzbjd)) {
            return false;
        }
        zzfw zzfw = this.zzrj;
        if (zzfw != null && !zzfw.isEmpty()) {
            return this.zzrj.equals(zzgz.zzrj);
        }
        zzfw zzfw2 = zzgz.zzrj;
        return zzfw2 == null || zzfw2.isEmpty();
    }

    public final int hashCode() {
        int hashCode = (((zzgz.class.getName().hashCode() + 527) * 31) + Arrays.hashCode(this.zzbjb)) * 31;
        String str = this.zzbjc;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + zzfy.zza(this.zzbjd)) * 31) + 1237) * 31;
        zzfw zzfw = this.zzrj;
        if (zzfw != null && !zzfw.isEmpty()) {
            i = this.zzrj.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz, com.google.android.gms.internal.clearcut.zzfu
    public final void zza(zzfs zzfs) throws IOException {
        if (!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            zzfs.zza(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzfs.zza(2, bArr3);
                }
                i++;
            }
        }
        String str = this.zzbjc;
        if (str != null && !str.equals("")) {
            zzfs.zza(4, this.zzbjc);
        }
        super.zza(zzfs);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz, com.google.android.gms.internal.clearcut.zzfu
    public final int zzen() {
        int zzen = super.zzen();
        if (!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            zzen += zzfs.zzb(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += zzfs.zzh(bArr3);
                }
                i++;
            }
            zzen = zzen + i2 + (i3 * 1);
        }
        String str = this.zzbjc;
        return (str == null || str.equals("")) ? zzen : zzen + zzfs.zzb(4, this.zzbjc);
    }

    /* Return type fixed from 'com.google.android.gms.internal.clearcut.zzfu' to match base method */
    @Override // com.google.android.gms.internal.clearcut.zzfu
    public final /* synthetic */ zzgz zzeo() throws CloneNotSupportedException {
        return (zzgz) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz, com.google.android.gms.internal.clearcut.zzfu
    public final /* synthetic */ zzfz zzep() throws CloneNotSupportedException {
        return (zzgz) clone();
    }
}
