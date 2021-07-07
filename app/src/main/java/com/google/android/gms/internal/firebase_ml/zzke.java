package com.google.android.gms.internal.firebase_ml;

public final class zzke extends zzkd {
    public final char zzabb;

    public zzke(char c) {
        this.zzabb = c;
    }

    public final String toString() {
        String str = zzkc.zzc(this.zzabb);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzkc
    public final boolean zzb(char c) {
        return c == this.zzabb;
    }
}
