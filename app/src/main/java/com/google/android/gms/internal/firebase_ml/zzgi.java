package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzgk;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class zzgi {
    public static WeakHashMap<Class<?>, Field> zzwj = new WeakHashMap<>();
    public static final Lock zzwk = new ReentrantLock();

    public static Field zzb(Class<?> cls) {
        Field field = null;
        if (cls == null) {
            return null;
        }
        zzwk.lock();
        try {
            if (zzwj.containsKey(cls)) {
                return zzwj.get(cls);
            }
            for (zzhl zzhl : zzhd.zzc(cls).zzhd()) {
                Field zzhf = zzhl.zzhf();
                zzgk zzgk = (zzgk) zzhf.getAnnotation(zzgk.class);
                if (zzgk != null) {
                    Object[] objArr = {cls};
                    if (field == null) {
                        boolean zza = zzhf.zza(zzhf.getType());
                        Object[] objArr2 = {cls, zzhf.getType()};
                        if (zza) {
                            zzgk.zza[] zzgu = zzgk.zzgu();
                            HashSet hashSet = new HashSet();
                            zzks.checkArgument(zzgu.length > 0, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                            for (zzgk.zza zza2 : zzgu) {
                                boolean add = hashSet.add(zza2.zzgv());
                                Object[] objArr3 = {zza2.zzgv()};
                                if (!add) {
                                    throw new IllegalArgumentException(zzla.zzb("Class contains two @TypeDef annotations with identical key: %s", objArr3));
                                }
                            }
                            field = zzhf;
                        } else {
                            throw new IllegalArgumentException(zzla.zzb("Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", objArr2));
                        }
                    } else {
                        throw new IllegalArgumentException(zzla.zzb("Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", objArr));
                    }
                }
            }
            zzwj.put(cls, field);
            zzwk.unlock();
            return field;
        } finally {
            zzwk.unlock();
        }
    }

    private final zzgm zzgs() throws IOException {
        zzgm zzgi = zzgi();
        if (zzgi == null) {
            zzgi = zzgh();
        }
        zzks.checkArgument(zzgi != null, "no JSON input found");
        return zzgi;
    }

    private final zzgm zzgt() throws IOException {
        zzgm zzgs = zzgs();
        int i = zzgj.zzwl[zzgs.ordinal()];
        boolean z = true;
        if (i == 1) {
            zzgm zzgh = zzgh();
            if (!(zzgh == zzgm.FIELD_NAME || zzgh == zzgm.END_OBJECT)) {
                z = false;
            }
            zzks.checkArgument(z, zzgh);
            return zzgh;
        } else if (i != 2) {
            return zzgs;
        } else {
            return zzgh();
        }
    }

    public abstract void close() throws IOException;

    public abstract int getIntValue() throws IOException;

    public abstract String getText() throws IOException;

    public final <T> T zza(Class<T> cls, zzgc zzgc) throws IOException {
        try {
            return (T) zza(cls, false, null);
        } finally {
            close();
        }
    }

    public abstract zzge zzgg();

    public abstract zzgm zzgh() throws IOException;

    public abstract zzgm zzgi();

    public abstract String zzgj() throws IOException;

    public abstract zzgi zzgk() throws IOException;

    public abstract byte zzgl() throws IOException;

    public abstract short zzgm() throws IOException;

    public abstract float zzgn() throws IOException;

    public abstract long zzgo() throws IOException;

    public abstract double zzgp() throws IOException;

    public abstract BigInteger zzgq() throws IOException;

    public abstract BigDecimal zzgr() throws IOException;

    public final String zza(Set<String> set) throws IOException {
        zzgm zzgt = zzgt();
        while (zzgt == zzgm.FIELD_NAME) {
            String text = getText();
            zzgh();
            if (set.contains(text)) {
                return text;
            }
            zzgk();
            zzgt = zzgh();
        }
        return null;
    }

    public final Object zza(Type type, boolean z, zzgc zzgc) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                zzgs();
            }
            return zza(null, type, new ArrayList<>(), null, null, true);
        } finally {
            if (z) {
                close();
            }
        }
    }

    private final void zza(Field field, Map<String, Object> map, Type type, ArrayList<Type> arrayList, zzgc zzgc) throws IOException {
        zzgm zzgt = zzgt();
        while (zzgt == zzgm.FIELD_NAME) {
            String text = getText();
            zzgh();
            if (zzgc == null) {
                map.put(text, zza(field, type, arrayList, map, zzgc, true));
                zzgt = zzgh();
            } else {
                throw new NoSuchMethodError();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b8 A[Catch:{ IllegalArgumentException -> 0x0438 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01c2 A[Catch:{ IllegalArgumentException -> 0x0438 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ea A[Catch:{ IllegalArgumentException -> 0x0438 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x023d A[Catch:{ IllegalArgumentException -> 0x0438 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object zza(java.lang.reflect.Field r20, java.lang.reflect.Type r21, java.util.ArrayList<java.lang.reflect.Type> r22, java.lang.Object r23, com.google.android.gms.internal.firebase_ml.zzgc r24, boolean r25) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1156
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzgi.zza(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, com.google.android.gms.internal.firebase_ml.zzgc, boolean):java.lang.Object");
    }
}
