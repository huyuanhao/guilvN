package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzgd extends zzhm implements Cloneable {
    public zzge zzwf;

    public String toString() {
        zzge zzge = this.zzwf;
        if (zzge == null) {
            return super.toString();
        }
        try {
            return zzge.toString(this);
        } catch (IOException e) {
            throw zzlb.zza(e);
        }
    }

    public final void zza(zzge zzge) {
        this.zzwf = zzge;
    }

    /* renamed from: zzeg */
    public zzgd clone() {
        return (zzgd) super.clone();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhm
    public /* synthetic */ zzhm zzeh() {
        return (zzgd) clone();
    }

    public final String zzfx() throws IOException {
        zzge zzge = this.zzwf;
        if (zzge != null) {
            return zzge.zzc(this);
        }
        return super.toString();
    }

    /* renamed from: zza */
    public zzgd zzb(String str, Object obj) {
        return (zzgd) super.zzb(str, obj);
    }
}
