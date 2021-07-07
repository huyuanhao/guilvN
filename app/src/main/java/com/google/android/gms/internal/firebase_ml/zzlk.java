package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;

public final class zzlk<K, V> {
    public int size;
    public Object[] zzadd;
    public boolean zzade;

    public zzlk() {
        this(4);
    }

    public final zzlk<K, V> zzd(K k, V v) {
        int i = (this.size + 1) << 1;
        Object[] objArr = this.zzadd;
        if (i > objArr.length) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.zzadd = Arrays.copyOf(objArr, i2);
                this.zzade = false;
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        zzld.zzc(k, v);
        Object[] objArr2 = this.zzadd;
        int i3 = this.size;
        objArr2[i3 * 2] = k;
        objArr2[(i3 * 2) + 1] = v;
        this.size = i3 + 1;
        return this;
    }

    public final zzlj<K, V> zzit() {
        this.zzade = true;
        return zzln.zza(this.size, this.zzadd);
    }

    public zzlk(int i) {
        this.zzadd = new Object[8];
        this.size = 0;
        this.zzade = false;
    }
}
