package com.google.android.gms.internal.firebase_ml;

public abstract class zzkx extends zzjz<String> {
    public int limit;
    public int offset = 0;
    public final zzkc zzabj;
    public final boolean zzabk;
    public final CharSequence zzabo;

    public zzkx(zzku zzku, CharSequence charSequence) {
        this.zzabj = zzku.zzabj;
        this.zzabk = false;
        this.limit = zzku.limit;
        this.zzabo = charSequence;
    }

    public abstract int zzaj(int i);

    public abstract int zzak(int i);

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzjz
    public final /* synthetic */ String zzid() {
        int zzaj;
        int i = this.offset;
        while (true) {
            int i2 = this.offset;
            if (i2 != -1) {
                zzaj = zzaj(i2);
                if (zzaj == -1) {
                    zzaj = this.zzabo.length();
                    this.offset = -1;
                } else {
                    this.offset = zzak(zzaj);
                }
                int i3 = this.offset;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.offset = i4;
                    if (i4 > this.zzabo.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i < zzaj && this.zzabj.zzb(this.zzabo.charAt(i))) {
                        i++;
                    }
                    while (zzaj > i && this.zzabj.zzb(this.zzabo.charAt(zzaj - 1))) {
                        zzaj--;
                    }
                    if (!this.zzabk || i != zzaj) {
                        int i5 = this.limit;
                    } else {
                        i = this.offset;
                    }
                }
            } else {
                zzie();
                return null;
            }
        }
        int i52 = this.limit;
        if (i52 == 1) {
            zzaj = this.zzabo.length();
            this.offset = -1;
            while (zzaj > i && this.zzabj.zzb(this.zzabo.charAt(zzaj - 1))) {
                zzaj--;
            }
        } else {
            this.limit = i52 - 1;
        }
        return this.zzabo.subSequence(i, zzaj).toString();
    }
}
