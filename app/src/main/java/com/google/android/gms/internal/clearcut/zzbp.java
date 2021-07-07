package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class zzbp implements zzfr {
    public final zzbn zzfo;

    public zzbp(zzbn zzbn) {
        zzbn zzbn2 = (zzbn) zzci.zza((Object) zzbn, "output");
        this.zzfo = zzbn2;
        zzbn2.zzfz = this;
    }

    public static zzbp zza(zzbn zzbn) {
        zzbp zzbp = zzbn.zzfz;
        return zzbp != null ? zzbp : new zzbp(zzbn);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, double d) throws IOException {
        this.zzfo.zza(i, d);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, float f) throws IOException {
        this.zzfo.zza(i, f);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, long j) throws IOException {
        this.zzfo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, zzbb zzbb) throws IOException {
        this.zzfo.zza(i, zzbb);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final <K, V> void zza(int i, zzdh<K, V> zzdh, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zzfo.zzb(i, 2);
            this.zzfo.zzo(zzdg.zza(zzdh, entry.getKey(), entry.getValue()));
            zzdg.zza(this.zzfo, zzdh, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzbb) {
            this.zzfo.zzb(i, (zzbb) obj);
        } else {
            this.zzfo.zzb(i, (zzdo) obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, Object obj, zzef zzef) throws IOException {
        this.zzfo.zza(i, (zzdo) obj, zzef);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, String str) throws IOException {
        this.zzfo.zza(i, str);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzcx) {
            zzcx zzcx = (zzcx) list;
            while (i2 < list.size()) {
                Object raw = zzcx.getRaw(i2);
                if (raw instanceof String) {
                    this.zzfo.zza(i, (String) raw);
                } else {
                    this.zzfo.zza(i, (zzbb) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zza(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, List<?> list, zzef zzef) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzef);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzs(list.get(i4).intValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzn(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzaa(int i) throws IOException {
        this.zzfo.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzab(int i) throws IOException {
        this.zzfo.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final int zzaj() {
        return zzcg.zzg.zzko;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, long j) throws IOException {
        this.zzfo.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, Object obj, zzef zzef) throws IOException {
        zzbn zzbn = this.zzfo;
        zzbn.zzb(i, 3);
        zzef.zza((zzdo) obj, zzbn.zzfz);
        zzbn.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, List<zzbb> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzfo.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, List<?> list, zzef zzef) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzef);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzv(list.get(i4).intValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzq(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, boolean z) throws IOException {
        this.zzfo.zzb(i, z);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, int i2) throws IOException {
        this.zzfo.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, long j) throws IOException {
        this.zzfo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zze(list.get(i4).longValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzb(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i, int i2) throws IOException {
        this.zzfo.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzf(list.get(i4).longValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzb(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i, int i2) throws IOException {
        this.zzfo.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzh(list.get(i4).longValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzd(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i, int i2) throws IOException {
        this.zzfo.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(list.get(i4).floatValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zza(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(list.get(i4).doubleValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zza(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzx(list.get(i4).intValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzn(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i, long j) throws IOException {
        this.zzfo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(list.get(i4).booleanValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zza(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzb(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i, long j) throws IOException {
        this.zzfo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzt(list.get(i4).intValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzo(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzd(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzw(list.get(i4).intValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzq(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzi(list.get(i4).longValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzd(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i, int i2) throws IOException {
        this.zzfo.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzu(list.get(i4).intValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzp(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i, int i2) throws IOException {
        this.zzfo.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zzfo.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzg(list.get(i4).longValue());
            }
            this.zzfo.zzo(i3);
            while (i2 < list.size()) {
                this.zzfo.zzc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzfo.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }
}
