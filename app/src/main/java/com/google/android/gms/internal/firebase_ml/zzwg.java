package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class zzwg {
    public static final Class<?> zzbru = zzsv();
    public static final zzww<?, ?> zzbrv = zzak(false);
    public static final zzww<?, ?> zzbrw = zzak(true);
    public static final zzww<?, ?> zzbrx = new zzwy();

    public static void zza(int i, List<Double> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzg(i, list, z);
        }
    }

    public static zzww<?, ?> zzak(boolean z) {
        try {
            Class<?> zzsw = zzsw();
            if (zzsw == null) {
                return null;
            }
            return (zzww) zzsw.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzb(int i, List<Float> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzb(i, list, z);
        }
    }

    public static void zzl(Class<?> cls) {
        Class<?> cls2;
        if (!zzue.class.isAssignableFrom(cls) && (cls2 = zzbru) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzm(int i, List<Integer> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzi(i, list, z);
        }
    }

    public static int zzo(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzi(list) + (list.size() * zztl.zzcu(i));
    }

    public static int zzp(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zztl.zzcu(i));
    }

    public static int zzq(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zztl.zzcu(i));
    }

    public static int zzr(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zztl.zzcu(i));
    }

    public static int zzs(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzm(list) + (size * zztl.zzcu(i));
    }

    public static zzww<?, ?> zzss() {
        return zzbrv;
    }

    public static zzww<?, ?> zzst() {
        return zzbrw;
    }

    public static zzww<?, ?> zzsu() {
        return zzbrx;
    }

    public static Class<?> zzsv() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> zzsw() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zzt(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzn(list) + (size * zztl.zzcu(i));
    }

    public static int zzu(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzo(list) + (size * zztl.zzcu(i));
    }

    public static int zzv(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztl.zzo(i, 0);
    }

    public static int zzw(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztl.zzg(i, 0L);
    }

    public static int zzx(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zztl.zzc(i, true);
    }

    public static void zza(int i, List<String> list, zzxr zzxr) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zza(i, list);
        }
    }

    public static void zzb(int i, List<zzsw> list, zzxr zzxr) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzb(i, list);
        }
    }

    public static int zzc(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzcu = zztl.zzcu(i) * size;
        if (list instanceof zzux) {
            zzux zzux = (zzux) list;
            while (i4 < size) {
                Object raw = zzux.getRaw(i4);
                if (raw instanceof zzsw) {
                    i3 = zztl.zzb((zzsw) raw);
                } else {
                    i3 = zztl.zzcp((String) raw);
                }
                zzcu += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzsw) {
                    i2 = zztl.zzb((zzsw) obj);
                } else {
                    i2 = zztl.zzcp((String) obj);
                }
                zzcu += i2;
                i4++;
            }
        }
        return zzcu;
    }

    public static int zzd(int i, List<zzsw> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzcu = size * zztl.zzcu(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzcu += zztl.zzb(list.get(i2));
        }
        return zzcu;
    }

    public static boolean zzh(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zzi(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvc) {
            zzvc zzvc = (zzvc) list;
            i = 0;
            while (i2 < size) {
                i += zztl.zzt(zzvc.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zztl.zzt(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzj(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvc) {
            zzvc zzvc = (zzvc) list;
            i = 0;
            while (i2 < size) {
                i += zztl.zzu(zzvc.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zztl.zzu(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzk(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzvc) {
            zzvc zzvc = (zzvc) list;
            i = 0;
            while (i2 < size) {
                i += zztl.zzv(zzvc.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zztl.zzv(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuf) {
            zzuf zzuf = (zzuf) list;
            i = 0;
            while (i2 < size) {
                i += zztl.zzcv(zzuf.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zztl.zzcv(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzn(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuf) {
            zzuf zzuf = (zzuf) list;
            i = 0;
            while (i2 < size) {
                i += zztl.zzcw(zzuf.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zztl.zzcw(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void zzl(int i, List<Integer> list, zzxr zzxr, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzk(i, list, z);
        }
    }

    public static int zzo(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuf) {
            zzuf zzuf = (zzuf) list;
            i = 0;
            while (i2 < size) {
                i += zztl.zzcx(zzuf.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zztl.zzcx(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzp(List<?> list) {
        return list.size() << 2;
    }

    public static int zzq(List<?> list) {
        return list.size() << 3;
    }

    public static int zzr(List<?> list) {
        return list.size();
    }

    public static void zza(int i, List<?> list, zzxr zzxr, zzwe zzwe) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zza(i, list, zzwe);
        }
    }

    public static void zzb(int i, List<?> list, zzxr zzxr, zzwe zzwe) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzxr.zzb(i, list, zzwe);
        }
    }

    public static int zzl(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzuf) {
            zzuf zzuf = (zzuf) list;
            i = 0;
            while (i2 < size) {
                i += zztl.zzda(zzuf.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zztl.zzda(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static <T> void zza(zzvj zzvj, T t, T t2, long j) {
        zzxc.zza(t, j, zzvj.zzf(zzxc.zzp(t, j), zzxc.zzp(t2, j)));
    }

    public static int zzd(int i, List<zzvo> list, zzwe zzwe) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zztl.zzc(i, list.get(i3), zzwe);
        }
        return i2;
    }

    public static <T, FT extends zzty<FT>> void zza(zztt<FT> zztt, T t, T t2) {
        zztw<FT> zzo = zztt.zzo(t2);
        if (!zzo.zzblk.isEmpty()) {
            zztt.zzp(t).zza(zzo);
        }
    }

    public static <T, UT, UB> void zza(zzww<UT, UB> zzww, T t, T t2) {
        zzww.zzi(t, zzww.zzk(zzww.zzae(t), zzww.zzae(t2)));
    }

    public static int zzc(int i, Object obj, zzwe zzwe) {
        if (obj instanceof zzuv) {
            return zztl.zza(i, (zzuv) obj);
        }
        return zztl.zzb(i, (zzvo) obj, zzwe);
    }

    public static <UT, UB> UB zza(int i, List<Integer> list, zzuj zzuj, UB ub, zzww<UT, UB> zzww) {
        if (zzuj == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzuj.zze(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(i, intValue, ub, zzww);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzuj.zze(intValue2)) {
                    ub = (UB) zza(i, intValue2, ub, zzww);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzc(int i, List<?> list, zzwe zzwe) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzcu = zztl.zzcu(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzuv) {
                i2 = zztl.zza((zzuv) obj);
            } else {
                i2 = zztl.zza((zzvo) obj, zzwe);
            }
            zzcu += i2;
        }
        return zzcu;
    }

    public static <UT, UB> UB zza(int i, int i2, UB ub, zzww<UT, UB> zzww) {
        if (ub == null) {
            ub = zzww.zztf();
        }
        zzww.zza(ub, i, (long) i2);
        return ub;
    }
}
