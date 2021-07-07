package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@VisibleForTesting
public final class zzc {
    public static final Object lock = new Object();
    @GuardedBy("lock")
    public static int zzau;
    @GuardedBy("lock")
    public SparseArray<Integer> zzav = new SparseArray<>();
    @GuardedBy("lock")
    public SparseArray<Integer> zzaw = new SparseArray<>();

    public final int zzb(int i) {
        synchronized (lock) {
            Integer num = this.zzav.get(i);
            if (num != null) {
                return num.intValue();
            }
            int i2 = zzau;
            zzau++;
            this.zzav.append(i, Integer.valueOf(i2));
            this.zzaw.append(i2, Integer.valueOf(i));
            return i2;
        }
    }

    public final int zzc(int i) {
        int intValue;
        synchronized (lock) {
            intValue = this.zzaw.get(i).intValue();
        }
        return intValue;
    }
}
