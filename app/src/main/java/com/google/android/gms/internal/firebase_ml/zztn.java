package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class zztn implements zzxr {
    public final zztl zzbkr;

    public zztn(zztl zztl) {
        zztl zztl2 = (zztl) zzug.zza(zztl, "output");
        this.zzbkr = zztl2;
        zztl2.zzbla = this;
    }

    public static zztn zza(zztl zztl) {
        zztn zztn = zztl.zzbla;
        if (zztn != null) {
            return zztn;
        }
        return new zztn(zztl);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzb(int i, boolean z) throws IOException {
        this.zzbkr.zzb(i, z);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzc(int i, long j) throws IOException {
        this.zzbkr.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzu(list.get(i4).longValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzq(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzde(int i) throws IOException {
        this.zzbkr.zzg(i, 3);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzdf(int i) throws IOException {
        this.zzbkr.zzg(i, 4);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzw(list.get(i4).longValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzs(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzu(list.get(i4).floatValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzt(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzd(list.get(i4).doubleValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzc(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzh(int i, int i2) throws IOException {
        this.zzbkr.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzi(int i, long j) throws IOException {
        this.zzbkr.zza(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzj(int i, long j) throws IOException {
        this.zzbkr.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzk(int i, int i2) throws IOException {
        this.zzbkr.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzx(list.get(i4).longValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzs(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzcx(list.get(i4).intValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzcs(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzj(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzv(list.get(i4).longValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzr(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final int zzqh() {
        return zzue.zzf.zzboz;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzr(int i, int i2) throws IOException {
        this.zzbkr.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzs(int i, int i2) throws IOException {
        this.zzbkr.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzb(int i, String str) throws IOException {
        this.zzbkr.zzb(i, str);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzt(list.get(i4).longValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzq(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzda(list.get(i4).intValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzcq(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzh(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzcz(list.get(i4).intValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzct(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzk(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, float f) throws IOException {
        this.zzbkr.zza(i, f);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzb(int i, long j) throws IOException {
        this.zzbkr.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzi(int i, int i2) throws IOException {
        this.zzbkr.zzi(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzj(int i, int i2) throws IOException {
        this.zzbkr.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, double d) throws IOException {
        this.zzbkr.zza(i, d);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzb(int i, Object obj, zzwe zzwe) throws IOException {
        zztl zztl = this.zzbkr;
        zztl.zzg(i, 3);
        zzwe.zza((zzvo) obj, zztl.zzbla);
        zztl.zzg(i, 4);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzai(list.get(i4).booleanValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzah(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzb(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzcw(list.get(i4).intValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzcr(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzi(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, long j) throws IOException {
        this.zzbkr.zza(i, j);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, zzsw zzsw) throws IOException {
        this.zzbkr.zza(i, zzsw);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, Object obj, zzwe zzwe) throws IOException {
        this.zzbkr.zza(i, (zzvo) obj, zzwe);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzsw) {
            this.zzbkr.zzb(i, (zzsw) obj);
        } else {
            this.zzbkr.zza(i, (zzvo) obj);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzcy(list.get(i4).intValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzct(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzk(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzbkr.zzg(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztl.zzcv(list.get(i4).intValue());
            }
            this.zzbkr.zzcr(i3);
            while (i2 < list.size()) {
                this.zzbkr.zzcq(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzh(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzb(int i, List<zzsw> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzbkr.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zzb(int i, List<?> list, zzwe zzwe) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzwe);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzux) {
            zzux zzux = (zzux) list;
            while (i2 < list.size()) {
                Object raw = zzux.getRaw(i2);
                if (raw instanceof String) {
                    this.zzbkr.zzb(i, (String) raw);
                } else {
                    this.zzbkr.zza(i, (zzsw) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzbkr.zzb(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final void zza(int i, List<?> list, zzwe zzwe) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzwe);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxr
    public final <K, V> void zza(int i, zzvh<K, V> zzvh, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzbkr.zzg(i, 2);
            this.zzbkr.zzcr(zzvg.zza(zzvh, entry.getKey(), entry.getValue()));
            zzvg.zza(this.zzbkr, zzvh, entry.getKey(), entry.getValue());
        }
    }
}
