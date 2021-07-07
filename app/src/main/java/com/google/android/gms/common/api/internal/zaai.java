package com.google.android.gms.common.api.internal;

public final class zaai extends zabf {
    public final /* synthetic */ zaah zafu;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zaai(zaah zaah, zabd zabd) {
        super(zabd);
        this.zafu = zaah;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zaan() {
        this.zafu.onConnectionSuspended(1);
    }
}
