package com.google.android.gms.internal.firebase_ml;

public final class zzlh<E> extends zzlc<E> {
    public final zzlg<E> zzacx;

    public zzlh(zzlg<E> zzlg, int i) {
        super(zzlg.size(), i);
        this.zzacx = zzlg;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlc
    public final E get(int i) {
        return this.zzacx.get(i);
    }
}
