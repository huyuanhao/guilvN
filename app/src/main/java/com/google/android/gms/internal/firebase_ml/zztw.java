package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zztw<FieldDescriptorType extends zzty<FieldDescriptorType>> {
    public static final zztw zzbln = new zztw(true);
    public final zzwh<FieldDescriptorType, Object> zzblk = zzwh.zzdo(16);
    public boolean zzbll;
    public boolean zzblm = false;

    public zztw() {
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzblk.get(fielddescriptortype);
        return obj instanceof zzur ? zzur.zzrt() : obj;
    }

    public static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzqs() == zzxq.MESSAGE) {
            if (key.zzqt()) {
                for (zzvo zzvo : (List) entry.getValue()) {
                    if (!zzvo.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzvo) {
                    if (!((zzvo) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzur) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        zzvo zzvo;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzur) {
            value = zzur.zzrt();
        }
        if (key.zzqt()) {
            Object zza = zza(key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzr(obj));
            }
            this.zzblk.put(key, zza);
        } else if (key.zzqs() == zzxq.MESSAGE) {
            Object zza2 = zza(key);
            if (zza2 == null) {
                this.zzblk.put(key, zzr(value));
                return;
            }
            if (zza2 instanceof zzvv) {
                zzvo = key.zza((zzvv) zza2, (zzvv) value);
            } else {
                zzvo = key.zza(((zzvo) zza2).zzrc(), (zzvo) value).zzrj();
            }
            this.zzblk.put(key, zzvo);
        } else {
            this.zzblk.put(key, zzr(value));
        }
    }

    public static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzqs() != zzxq.MESSAGE || key.zzqt() || key.zzqu()) {
            return zzb((zzty<?>) key, value);
        }
        if (value instanceof zzur) {
            return zztl.zzb(entry.getKey().zzo(), (zzur) value);
        }
        return zztl.zzb(entry.getKey().zzo(), (zzvo) value);
    }

    public static <T extends zzty<T>> zztw<T> zzqp() {
        return zzbln;
    }

    public static Object zzr(Object obj) {
        if (obj instanceof zzvv) {
            return ((zzvv) obj).zzsk();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zztw zztw = new zztw();
        for (int i = 0; i < this.zzblk.zzsx(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzdp = this.zzblk.zzdp(i);
            zztw.zza(zzdp.getKey(), zzdp.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzblk.zzsy()) {
            zztw.zza(entry.getKey(), entry.getValue());
        }
        zztw.zzblm = this.zzblm;
        return zztw;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzblm) {
            return new zzuu(this.zzblk.zzsz().iterator());
        }
        return this.zzblk.zzsz().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztw)) {
            return false;
        }
        return this.zzblk.equals(((zztw) obj).zzblk);
    }

    public final int hashCode() {
        return this.zzblk.hashCode();
    }

    public final boolean isImmutable() {
        return this.zzbll;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzblk.zzsx(); i++) {
            if (!zzb(this.zzblk.zzdp(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzblk.zzsy()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzblm) {
            return new zzuu(this.zzblk.entrySet().iterator());
        }
        return this.zzblk.entrySet().iterator();
    }

    public final void zzpt() {
        if (!this.zzbll) {
            this.zzblk.zzpt();
            this.zzbll = true;
        }
    }

    public final int zzqq() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzblk.zzsx(); i2++) {
            i += zzd(this.zzblk.zzdp(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzblk.zzsy()) {
            i += zzd(entry);
        }
        return i;
    }

    public zztw(boolean z) {
        zzpt();
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzqt()) {
            zza(fielddescriptortype.zzqr(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zza(fielddescriptortype.zzqr(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzur) {
            this.zzblm = true;
        }
        this.zzblk.put(fielddescriptortype, obj);
    }

    public static int zzb(zzxl zzxl, Object obj) {
        switch (zztx.zzblp[zzxl.ordinal()]) {
            case 1:
                return zztl.zzd(((Double) obj).doubleValue());
            case 2:
                return zztl.zzu(((Float) obj).floatValue());
            case 3:
                return zztl.zzt(((Long) obj).longValue());
            case 4:
                return zztl.zzu(((Long) obj).longValue());
            case 5:
                return zztl.zzcv(((Integer) obj).intValue());
            case 6:
                return zztl.zzw(((Long) obj).longValue());
            case 7:
                return zztl.zzcy(((Integer) obj).intValue());
            case 8:
                return zztl.zzai(((Boolean) obj).booleanValue());
            case 9:
                return zztl.zzd((zzvo) obj);
            case 10:
                if (obj instanceof zzur) {
                    return zztl.zza((zzur) obj);
                }
                return zztl.zzc((zzvo) obj);
            case 11:
                if (obj instanceof zzsw) {
                    return zztl.zzb((zzsw) obj);
                }
                return zztl.zzcp((String) obj);
            case 12:
                if (obj instanceof zzsw) {
                    return zztl.zzb((zzsw) obj);
                }
                return zztl.zzh((byte[]) obj);
            case 13:
                return zztl.zzcw(((Integer) obj).intValue());
            case 14:
                return zztl.zzcz(((Integer) obj).intValue());
            case 15:
                return zztl.zzx(((Long) obj).longValue());
            case 16:
                return zztl.zzcx(((Integer) obj).intValue());
            case 17:
                return zztl.zzv(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzuh) {
                    return zztl.zzda(((zzuh) obj).zzo());
                }
                return zztl.zzda(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase_ml.zzuh) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase_ml.zzur) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zza(com.google.android.gms.internal.firebase_ml.zzxl r2, java.lang.Object r3) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztw.zza(com.google.android.gms.internal.firebase_ml.zzxl, java.lang.Object):void");
    }

    public final void zza(zztw<FieldDescriptorType> zztw) {
        for (int i = 0; i < zztw.zzblk.zzsx(); i++) {
            zzc(zztw.zzblk.zzdp(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zztw.zzblk.zzsy()) {
            zzc(entry);
        }
    }

    public static void zza(zztl zztl, zzxl zzxl, int i, Object obj) throws IOException {
        if (zzxl == zzxl.GROUP) {
            zzvo zzvo = (zzvo) obj;
            zzug.zzf(zzvo);
            zztl.zzg(i, 3);
            zzvo.zzb(zztl);
            zztl.zzg(i, 4);
            return;
        }
        zztl.zzg(i, zzxl.zztq());
        switch (zztx.zzblp[zzxl.ordinal()]) {
            case 1:
                zztl.zzc(((Double) obj).doubleValue());
                return;
            case 2:
                zztl.zzt(((Float) obj).floatValue());
                return;
            case 3:
                zztl.zzq(((Long) obj).longValue());
                return;
            case 4:
                zztl.zzq(((Long) obj).longValue());
                return;
            case 5:
                zztl.zzcq(((Integer) obj).intValue());
                return;
            case 6:
                zztl.zzs(((Long) obj).longValue());
                return;
            case 7:
                zztl.zzct(((Integer) obj).intValue());
                return;
            case 8:
                zztl.zzah(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzvo) obj).zzb(zztl);
                return;
            case 10:
                zztl.zzb((zzvo) obj);
                return;
            case 11:
                if (obj instanceof zzsw) {
                    zztl.zza((zzsw) obj);
                    return;
                } else {
                    zztl.zzco((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzsw) {
                    zztl.zza((zzsw) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zztl.zze(bArr, 0, bArr.length);
                return;
            case 13:
                zztl.zzcr(((Integer) obj).intValue());
                return;
            case 14:
                zztl.zzct(((Integer) obj).intValue());
                return;
            case 15:
                zztl.zzs(((Long) obj).longValue());
                return;
            case 16:
                zztl.zzcs(((Integer) obj).intValue());
                return;
            case 17:
                zztl.zzr(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzuh) {
                    zztl.zzcq(((zzuh) obj).zzo());
                    return;
                } else {
                    zztl.zzcq(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static int zzb(zzty<?> zzty, Object obj) {
        zzxl zzqr = zzty.zzqr();
        int zzo = zzty.zzo();
        if (!zzty.zzqt()) {
            return zza(zzqr, zzo, obj);
        }
        int i = 0;
        if (zzty.zzqu()) {
            for (Object obj2 : (List) obj) {
                i += zzb(zzqr, obj2);
            }
            return zztl.zzcu(zzo) + i + zztl.zzdd(i);
        }
        for (Object obj3 : (List) obj) {
            i += zza(zzqr, zzo, obj3);
        }
        return i;
    }

    public static int zza(zzxl zzxl, int i, Object obj) {
        int zzcu = zztl.zzcu(i);
        if (zzxl == zzxl.GROUP) {
            zzug.zzf((zzvo) obj);
            zzcu <<= 1;
        }
        return zzcu + zzb(zzxl, obj);
    }
}
