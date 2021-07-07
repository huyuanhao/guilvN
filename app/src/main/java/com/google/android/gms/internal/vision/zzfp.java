package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzfp<FieldDescriptorType extends zzfr<FieldDescriptorType>> {
    public static final zzfp zztp = new zzfp(true);
    public final zzhz<FieldDescriptorType, Object> zztm = zzhz.zzbo(16);
    public boolean zztn;
    public boolean zzto = false;

    public zzfp() {
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        zzhf zzhf;
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzgi) {
            value = zzgi.zzfr();
        }
        if (key.zzeu()) {
            Object zza = zza(key);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) zza).add(zzf(obj));
            }
            this.zztm.put(key, zza);
        } else if (key.zzet() == zzji.MESSAGE) {
            Object zza2 = zza(key);
            if (zza2 == null) {
                this.zztm.put(key, zzf(value));
                return;
            }
            if (zza2 instanceof zzhm) {
                zzhf = key.zza((zzhm) zza2, (zzhm) value);
            } else {
                zzhf = key.zza(((zzhf) zza2).zzez(), (zzhf) value).zzfg();
            }
            this.zztm.put(key, zzhf);
        } else {
            this.zztm.put(key, zzf(value));
        }
    }

    public static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzet() != zzji.MESSAGE || key.zzeu() || key.zzev()) {
            return zzc(key, value);
        }
        if (value instanceof zzgi) {
            return zzfe.zzb(entry.getKey().zzr(), (zzgi) value);
        }
        return zzfe.zzd(entry.getKey().zzr(), (zzhf) value);
    }

    public static <T extends zzfr<T>> zzfp<T> zzep() {
        return zztp;
    }

    public static Object zzf(Object obj) {
        if (obj instanceof zzhm) {
            return ((zzhm) obj).zzgh();
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
        zzfp zzfp = new zzfp();
        for (int i = 0; i < this.zztm.zzgu(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzbp = this.zztm.zzbp(i);
            zzfp.zza(zzbp.getKey(), zzbp.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            zzfp.zza(entry.getKey(), entry.getValue());
        }
        zzfp.zzto = this.zzto;
        return zzfp;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzto) {
            return new zzgl(this.zztm.zzgw().iterator());
        }
        return this.zztm.zzgw().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return false;
        }
        return this.zztm.equals(((zzfp) obj).zztm);
    }

    public final int hashCode() {
        return this.zztm.hashCode();
    }

    public final boolean isEmpty() {
        return this.zztm.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zztn;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zztm.zzgu(); i++) {
            if (!zzb(this.zztm.zzbp(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            if (!zzb(entry)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzto) {
            return new zzgl(this.zztm.entrySet().iterator());
        }
        return this.zztm.entrySet().iterator();
    }

    public final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zztm.get(fielddescriptortype);
        return obj instanceof zzgi ? zzgi.zzfr() : obj;
    }

    public final void zzb(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.zzeu()) {
            zza(fielddescriptortype.zzes(), obj);
            Object zza = zza(fielddescriptortype);
            if (zza == null) {
                list = new ArrayList();
                this.zztm.put(fielddescriptortype, list);
            } else {
                list = (List) zza;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void zzci() {
        if (!this.zztn) {
            this.zztm.zzci();
            this.zztn = true;
        }
    }

    public final int zzeq() {
        int i = 0;
        for (int i2 = 0; i2 < this.zztm.zzgu(); i2++) {
            Map.Entry<FieldDescriptorType, Object> zzbp = this.zztm.zzbp(i2);
            i += zzc(zzbp.getKey(), zzbp.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            i += zzc(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int zzer() {
        int i = 0;
        for (int i2 = 0; i2 < this.zztm.zzgu(); i2++) {
            i += zzd(this.zztm.zzbp(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zztm.zzgv()) {
            i += zzd(entry);
        }
        return i;
    }

    public zzfp(boolean z) {
        zzci();
    }

    public final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzeu()) {
            zza(fielddescriptortype.zzes(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zza(fielddescriptortype.zzes(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgi) {
            this.zzto = true;
        }
        this.zztm.put(fielddescriptortype, obj);
    }

    public static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzet() == zzji.MESSAGE) {
            if (key.zzeu()) {
                for (zzhf zzhf : (List) entry.getValue()) {
                    if (!zzhf.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzhf) {
                    if (!((zzhf) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzgi) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof com.google.android.gms.internal.vision.zzgb) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.vision.zzgi) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zza(com.google.android.gms.internal.vision.zzjd r2, java.lang.Object r3) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfp.zza(com.google.android.gms.internal.vision.zzjd, java.lang.Object):void");
    }

    public static int zzb(zzjd zzjd, Object obj) {
        switch (zzfq.zzrr[zzjd.ordinal()]) {
            case 1:
                return zzfe.zzb(((Double) obj).doubleValue());
            case 2:
                return zzfe.zzg(((Float) obj).floatValue());
            case 3:
                return zzfe.zzh(((Long) obj).longValue());
            case 4:
                return zzfe.zzi(((Long) obj).longValue());
            case 5:
                return zzfe.zzaw(((Integer) obj).intValue());
            case 6:
                return zzfe.zzk(((Long) obj).longValue());
            case 7:
                return zzfe.zzaz(((Integer) obj).intValue());
            case 8:
                return zzfe.zzi(((Boolean) obj).booleanValue());
            case 9:
                return zzfe.zzd((zzhf) obj);
            case 10:
                if (obj instanceof zzgi) {
                    return zzfe.zza((zzgi) obj);
                }
                return zzfe.zzc((zzhf) obj);
            case 11:
                if (obj instanceof zzeo) {
                    return zzfe.zzb((zzeo) obj);
                }
                return zzfe.zzn((String) obj);
            case 12:
                if (obj instanceof zzeo) {
                    return zzfe.zzb((zzeo) obj);
                }
                return zzfe.zzh((byte[]) obj);
            case 13:
                return zzfe.zzax(((Integer) obj).intValue());
            case 14:
                return zzfe.zzba(((Integer) obj).intValue());
            case 15:
                return zzfe.zzl(((Long) obj).longValue());
            case 16:
                return zzfe.zzay(((Integer) obj).intValue());
            case 17:
                return zzfe.zzj(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzgb) {
                    return zzfe.zzbb(((zzgb) obj).zzr());
                }
                return zzfe.zzbb(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzc(zzfr<?> zzfr, Object obj) {
        zzjd zzes = zzfr.zzes();
        int zzr = zzfr.zzr();
        if (!zzfr.zzeu()) {
            return zza(zzes, zzr, obj);
        }
        int i = 0;
        if (zzfr.zzev()) {
            for (Object obj2 : (List) obj) {
                i += zzb(zzes, obj2);
            }
            return zzfe.zzav(zzr) + i + zzfe.zzbd(i);
        }
        for (Object obj3 : (List) obj) {
            i += zza(zzes, zzr, obj3);
        }
        return i;
    }

    public final void zza(zzfp<FieldDescriptorType> zzfp) {
        for (int i = 0; i < zzfp.zztm.zzgu(); i++) {
            zzc(zzfp.zztm.zzbp(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : zzfp.zztm.zzgv()) {
            zzc(entry);
        }
    }

    public static void zza(zzfe zzfe, zzjd zzjd, int i, Object obj) throws IOException {
        if (zzjd == zzjd.GROUP) {
            zzhf zzhf = (zzhf) obj;
            zzga.zzf(zzhf);
            zzfe.zzd(i, 3);
            zzhf.zzb(zzfe);
            zzfe.zzd(i, 4);
            return;
        }
        zzfe.zzd(i, zzjd.zzhp());
        switch (zzfq.zzrr[zzjd.ordinal()]) {
            case 1:
                zzfe.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzfe.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzfe.zze(((Long) obj).longValue());
                return;
            case 4:
                zzfe.zze(((Long) obj).longValue());
                return;
            case 5:
                zzfe.zzar(((Integer) obj).intValue());
                return;
            case 6:
                zzfe.zzg(((Long) obj).longValue());
                return;
            case 7:
                zzfe.zzau(((Integer) obj).intValue());
                return;
            case 8:
                zzfe.zzh(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzhf) obj).zzb(zzfe);
                return;
            case 10:
                zzfe.zzb((zzhf) obj);
                return;
            case 11:
                if (obj instanceof zzeo) {
                    zzfe.zza((zzeo) obj);
                    return;
                } else {
                    zzfe.zzm((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeo) {
                    zzfe.zza((zzeo) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzfe.zzf(bArr, 0, bArr.length);
                return;
            case 13:
                zzfe.zzas(((Integer) obj).intValue());
                return;
            case 14:
                zzfe.zzau(((Integer) obj).intValue());
                return;
            case 15:
                zzfe.zzg(((Long) obj).longValue());
                return;
            case 16:
                zzfe.zzat(((Integer) obj).intValue());
                return;
            case 17:
                zzfe.zzf(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzgb) {
                    zzfe.zzar(((zzgb) obj).zzr());
                    return;
                } else {
                    zzfe.zzar(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static int zza(zzjd zzjd, int i, Object obj) {
        int zzav = zzfe.zzav(i);
        if (zzjd == zzjd.GROUP) {
            zzga.zzf((zzhf) obj);
            zzav <<= 1;
        }
        return zzav + zzb(zzjd, obj);
    }
}
