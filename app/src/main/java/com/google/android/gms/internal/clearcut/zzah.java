package com.google.android.gms.internal.clearcut;

public final /* synthetic */ class zzah implements zzam {
    public final String zzea;
    public final boolean zzeb = false;

    public zzah(String str, boolean z) {
        this.zzea = str;
    }

    @Override // com.google.android.gms.internal.clearcut.zzam
    public final Object zzp() {
        return Boolean.valueOf(zzy.zza(zzae.zzh.getContentResolver(), this.zzea, this.zzeb));
    }
}
