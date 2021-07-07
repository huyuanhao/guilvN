package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;

public final class zzwd implements zzvm {
    public final int flags;
    public final String info;
    public final Object[] zzbqy;
    public final zzvo zzbrb;

    public zzwd(zzvo zzvo, String str, Object[] objArr) {
        this.zzbrb = zzvo;
        this.info = str;
        this.zzbqy = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.flags = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvm
    public final int zzsh() {
        return (this.flags & 1) == 1 ? zzue.zzf.zzbow : zzue.zzf.zzbox;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvm
    public final boolean zzsi() {
        return (this.flags & 2) == 2;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvm
    public final zzvo zzsj() {
        return this.zzbrb;
    }

    public final String zzsq() {
        return this.info;
    }

    public final Object[] zzsr() {
        return this.zzbqy;
    }
}
