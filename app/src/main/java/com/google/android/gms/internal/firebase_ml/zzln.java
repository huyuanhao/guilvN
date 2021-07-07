package com.google.android.gms.internal.firebase_ml;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzln<K, V> extends zzlj<K, V> {
    public static final zzlj<Object, Object> zzadi = new zzln(null, new Object[0], 0);
    public final transient int size;
    public final transient Object[] zzadd;
    public final transient int[] zzadj;

    public zzln(int[] iArr, Object[] objArr, int i) {
        this.zzadj = iArr;
        this.zzadd = objArr;
        this.size = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        r3[r8] = r5;
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.android.gms.internal.firebase_ml.zzln<K, V> zza(int r11, java.lang.Object[] r12) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzln.zza(int, java.lang.Object[]):com.google.android.gms.internal.firebase_ml.zzln");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlj, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        int[] iArr = this.zzadj;
        Object[] objArr = this.zzadd;
        int i = this.size;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[0].equals(obj)) {
                return (V) objArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int zzal = zzle.zzal(obj.hashCode());
            while (true) {
                int i2 = zzal & length;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (objArr[i3].equals(obj)) {
                    return (V) objArr[i3 ^ 1];
                }
                zzal = i2 + 1;
            }
        }
    }

    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlj
    public final zzll<Map.Entry<K, V>> zziq() {
        return new zzlo(this, this.zzadd, 0, this.size);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlj
    public final zzll<K> zzir() {
        return new zzlq(this, new zzlr(this.zzadd, 0, this.size));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlj
    public final zzlf<V> zzis() {
        return new zzlr(this.zzadd, 1, this.size);
    }
}
