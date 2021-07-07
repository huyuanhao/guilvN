package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class zzvu<T> implements zzwe<T> {
    public final zzvo zzbrb;
    public final boolean zzbrc;
    public final zzww<?, ?> zzbrl;
    public final zztt<?> zzbrm;

    public zzvu(zzww<?, ?> zzww, zztt<?> zztt, zzvo zzvo) {
        this.zzbrl = zzww;
        this.zzbrc = zztt.zze(zzvo);
        this.zzbrm = zztt;
        this.zzbrb = zzvo;
    }

    public static <T> zzvu<T> zza(zzww<?, ?> zzww, zztt<?> zztt, zzvo zzvo) {
        return new zzvu<>(zzww, zztt, zzvo);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final boolean equals(T t, T t2) {
        if (!this.zzbrl.zzae(t).equals(this.zzbrl.zzae(t2))) {
            return false;
        }
        if (this.zzbrc) {
            return this.zzbrm.zzo(t).equals(this.zzbrm.zzo(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final int hashCode(T t) {
        int hashCode = this.zzbrl.zzae(t).hashCode();
        return this.zzbrc ? (hashCode * 53) + this.zzbrm.zzo(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final T newInstance() {
        return (T) this.zzbrb.zzrd().zzri();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final int zzaa(T t) {
        zzww<?, ?> zzww = this.zzbrl;
        int zzaf = zzww.zzaf(zzww.zzae(t)) + 0;
        return this.zzbrc ? zzaf + this.zzbrm.zzo(t).zzqq() : zzaf;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final boolean zzac(T t) {
        return this.zzbrm.zzo(t).isInitialized();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final void zzg(T t, T t2) {
        zzwg.zza(this.zzbrl, t, t2);
        if (this.zzbrc) {
            zzwg.zza(this.zzbrm, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final void zzq(T t) {
        this.zzbrl.zzq(t);
        this.zzbrm.zzq(t);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final void zza(T t, zzxr zzxr) throws IOException {
        Iterator<Map.Entry<?, Object>> it = this.zzbrm.zzo(t).iterator();
        while (it.hasNext()) {
            Map.Entry<?, Object> next = it.next();
            zzty zzty = (zzty) next.getKey();
            if (zzty.zzqs() != zzxq.MESSAGE || zzty.zzqt() || zzty.zzqu()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof zzut) {
                zzxr.zza(zzty.zzo(), (Object) ((zzut) next).zzru().zzpp());
            } else {
                zzxr.zza(zzty.zzo(), next.getValue());
            }
        }
        zzww<?, ?> zzww = this.zzbrl;
        zzww.zzc(zzww.zzae(t), zzxr);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzwe
    public final void zza(T t, byte[] bArr, int i, int i2, zzst zzst) throws IOException {
        T t2 = t;
        zzwx zzwx = t2.zzboh;
        if (zzwx == zzwx.zztg()) {
            zzwx = zzwx.zzth();
            t2.zzboh = zzwx;
        }
        t.zzrk();
        zzue.zze zze = null;
        while (i < i2) {
            int zza = zzss.zza(bArr, i, zzst);
            int i3 = zzst.zzbkg;
            if (i3 == 11) {
                int i4 = 0;
                zzsw zzsw = null;
                while (zza < i2) {
                    zza = zzss.zza(bArr, zza, zzst);
                    int i5 = zzst.zzbkg;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (zze != null) {
                                zzwb.zzso();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                zza = zzss.zze(bArr, zza, zzst);
                                zzsw = (zzsw) zzst.zzbki;
                            }
                        }
                    } else if (i7 == 0) {
                        zza = zzss.zza(bArr, zza, zzst);
                        i4 = zzst.zzbkg;
                        zze = (zzue.zze) this.zzbrm.zza(zzst.zzix, this.zzbrb, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    zza = zzss.zza(i5, bArr, zza, i2, zzst);
                }
                if (zzsw != null) {
                    zzwx.zzb((i4 << 3) | 2, zzsw);
                }
                i = zza;
            } else if ((i3 & 7) == 2) {
                zze = (zzue.zze) this.zzbrm.zza(zzst.zzix, this.zzbrb, i3 >>> 3);
                if (zze == null) {
                    i = zzss.zza(i3, bArr, zza, i2, zzwx, zzst);
                } else {
                    zzwb.zzso();
                    throw new NoSuchMethodError();
                }
            } else {
                i = zzss.zza(i3, bArr, zza, i2, zzst);
            }
        }
        if (i != i2) {
            throw zzuo.zzrq();
        }
    }
}
