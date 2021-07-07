package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzll<E> extends zzlf<E> implements Set<E> {
    @NullableDecl
    public transient zzlg<E> zzadf;

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return zzls.zza(this, obj);
    }

    public int hashCode() {
        return zzls.zzb(this);
    }

    @Override // java.util.AbstractCollection, com.google.android.gms.internal.firebase_ml.zzlf, java.util.Collection, java.util.Set, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public zzlg<E> zzin() {
        zzlg<E> zzlg = this.zzadf;
        if (zzlg != null) {
            return zzlg;
        }
        zzlg<E> zziu = zziu();
        this.zzadf = zziu;
        return zziu;
    }

    public zzlg<E> zziu() {
        return zzlg.zza(toArray());
    }
}
