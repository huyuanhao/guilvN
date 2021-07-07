package com.google.android.gms.common.api.internal;

import android.app.Dialog;

public final class zao extends zabr {
    public final /* synthetic */ Dialog zadk;
    public final /* synthetic */ zan zadl;

    public zao(zan zan, Dialog dialog) {
        this.zadl = zan;
        this.zadk = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void zas() {
        this.zadl.zadj.zaq();
        if (this.zadk.isShowing()) {
            this.zadk.dismiss();
        }
    }
}
