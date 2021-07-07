package com.google.android.gms.internal.firebase_ml;

import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class zzgp extends zzgf {
    public final zzqq zzxa;
    public final zzgn zzxb;

    public zzgp(zzgn zzgn, zzqq zzqq) {
        this.zzxb = zzgn;
        this.zzxa = zzqq;
        zzqq.setLenient(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void flush() throws IOException {
        this.zzxa.flush();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void writeBoolean(boolean z) throws IOException {
        this.zzxa.zzag(z);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void writeString(String str) throws IOException {
        this.zzxa.zzck(str);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zza(BigInteger bigInteger) throws IOException {
        this.zzxa.zza(bigInteger);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzad(int i) throws IOException {
        this.zzxa.zzo((long) i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzan(String str) throws IOException {
        this.zzxa.zzcj(str);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzfy() throws IOException {
        this.zzxa.zznx();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzfz() throws IOException {
        this.zzxa.zzny();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzg(long j) throws IOException {
        this.zzxa.zzo(j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzga() throws IOException {
        this.zzxa.zznz();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzgb() throws IOException {
        this.zzxa.zzoa();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzgc() throws IOException {
        this.zzxa.zzoc();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzgd() throws IOException {
        this.zzxa.setIndent(GlideException.OooO00o.o0ooOoO);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zzl(float f) throws IOException {
        this.zzxa.zzb((double) f);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zza(double d) throws IOException {
        this.zzxa.zzb(d);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgf
    public final void zza(BigDecimal bigDecimal) throws IOException {
        this.zzxa.zza(bigDecimal);
    }
}
