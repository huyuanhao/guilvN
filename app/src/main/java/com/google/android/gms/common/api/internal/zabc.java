package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

public final class zabc extends zabr {
    public WeakReference<zaaw> zahl;

    public zabc(zaaw zaaw) {
        this.zahl = new WeakReference<>(zaaw);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zas() {
        zaaw zaaw = this.zahl.get();
        if (zaaw != null) {
            zaaw.resume();
        }
    }
}
