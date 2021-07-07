package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

public final class zaar extends zac {
    public final WeakReference<zaak> zagj;

    public zaar(zaak zaak) {
        this.zagj = new WeakReference<>(zaak);
    }

    @Override // com.google.android.gms.signin.internal.zad, com.google.android.gms.signin.internal.zac
    @BinderThread
    public final void zab(zaj zaj) {
        zaak zaak = this.zagj.get();
        if (zaak != null) {
            zaak.zafs.zaa(new zaas(this, zaak, zaak, zaj));
        }
    }
}
