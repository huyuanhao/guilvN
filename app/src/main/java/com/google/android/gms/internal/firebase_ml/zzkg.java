package com.google.android.gms.internal.firebase_ml;

public final class zzkg extends zzkf {
    public static final zzkg zzabc = new zzkg();

    public zzkg() {
        super("CharMatcher.none()");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkc
    public final int zza(CharSequence charSequence, int i) {
        zzks.zza(i, charSequence.length(), "index");
        return -1;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkc
    public final boolean zzb(char c) {
        return false;
    }
}
