package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class zzxc {
    public static final Logger logger = Logger.getLogger(zzxc.class.getName());
    public static final Class<?> zzbke = zzsr.zzpw();
    public static final boolean zzbkz = zztm();
    public static final Unsafe zzbqw = zztl();
    public static final boolean zzbst = zzp(Long.TYPE);
    public static final boolean zzbsu = zzp(Integer.TYPE);
    public static final zzd zzbsv;
    public static final boolean zzbsw = zztn();
    public static final long zzbsx = ((long) zzn(byte[].class));
    public static final long zzbsy = ((long) zzn(boolean[].class));
    public static final long zzbsz = ((long) zzo(boolean[].class));
    public static final long zzbta = ((long) zzn(int[].class));
    public static final long zzbtb = ((long) zzo(int[].class));
    public static final long zzbtc = ((long) zzn(long[].class));
    public static final long zzbtd = ((long) zzo(long[].class));
    public static final long zzbte = ((long) zzn(float[].class));
    public static final long zzbtf = ((long) zzo(float[].class));
    public static final long zzbtg = ((long) zzn(double[].class));
    public static final long zzbth = ((long) zzo(double[].class));
    public static final long zzbti = ((long) zzn(Object[].class));
    public static final long zzbtj = ((long) zzo(Object[].class));
    public static final long zzbtk;
    public static final boolean zzbtl = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    public static final class zzc extends zzd {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zzbtm.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zze(Object obj, long j, byte b) {
            this.zzbtm.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final boolean zzm(Object obj, long j) {
            return this.zzbtm.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final float zzn(Object obj, long j) {
            return this.zzbtm.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final double zzo(Object obj, long j) {
            return this.zzbtm.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final byte zzy(Object obj, long j) {
            return this.zzbtm.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, float f) {
            this.zzbtm.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, double d) {
            this.zzbtm.putDouble(obj, j, d);
        }
    }

    public static abstract class zzd {
        public Unsafe zzbtm;

        public zzd(Unsafe unsafe) {
            this.zzbtm = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public final void zza(Object obj, long j, int i) {
            this.zzbtm.putInt(obj, j, i);
        }

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public final int zzk(Object obj, long j) {
            return this.zzbtm.getInt(obj, j);
        }

        public final long zzl(Object obj, long j) {
            return this.zzbtm.getLong(obj, j);
        }

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final void zza(Object obj, long j, long j2) {
            this.zzbtm.putLong(obj, j, j2);
        }
    }

    static {
        zzd zzd2;
        zzd zzd3 = null;
        if (zzbqw != null) {
            if (!zzsr.zzpv()) {
                zzd3 = new zzc(zzbqw);
            } else if (zzbst) {
                zzd3 = new zzb(zzbqw);
            } else if (zzbsu) {
                zzd3 = new zza(zzbqw);
            }
        }
        zzbsv = zzd3;
        Field zzto = zzto();
        zzbtk = (zzto == null || (zzd2 = zzbsv) == null) ? -1 : zzd2.zzbtm.objectFieldOffset(zzto);
    }

    public static void zza(Object obj, long j, int i) {
        zzbsv.zza(obj, j, i);
    }

    public static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    public static int zzk(Object obj, long j) {
        return zzbsv.zzk(obj, j);
    }

    public static long zzl(Object obj, long j) {
        return zzbsv.zzl(obj, j);
    }

    public static <T> T zzm(Class<T> cls) {
        try {
            return (T) zzbqw.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int zzn(Class<?> cls) {
        if (zzbkz) {
            return zzbsv.zzbtm.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzo(Class<?> cls) {
        if (zzbkz) {
            return zzbsv.zzbtm.arrayIndexScale(cls);
        }
        return -1;
    }

    public static Object zzp(Object obj, long j) {
        return zzbsv.zzbtm.getObject(obj, j);
    }

    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    public static boolean zztj() {
        return zzbkz;
    }

    public static boolean zztk() {
        return zzbsw;
    }

    public static Unsafe zztl() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzxd());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zztm() {
        Unsafe unsafe = zzbqw;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzsr.zzpv()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    public static boolean zztn() {
        Unsafe unsafe = zzbqw;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzto() == null) {
                return false;
            }
            if (zzsr.zzpv()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    public static Field zzto() {
        Field zzb2;
        if (zzsr.zzpv() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    public static void zza(Object obj, long j, long j2) {
        zzbsv.zza(obj, j, j2);
    }

    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    public static final class zza extends zzd {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzxc.zzbtl) {
                zzxc.zzb(obj, j, z);
            } else {
                zzxc.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzxc.zzbtl) {
                zzxc.zza(obj, j, b);
            } else {
                zzxc.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzs(obj, j);
            }
            return zzxc.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final byte zzy(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzq(obj, j);
            }
            return zzxc.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    public static final class zzb extends zzd {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzxc.zzbtl) {
                zzxc.zzb(obj, j, z);
            } else {
                zzxc.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzxc.zzbtl) {
                zzxc.zza(obj, j, b);
            } else {
                zzxc.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzs(obj, j);
            }
            return zzxc.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final byte zzy(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzq(obj, j);
            }
            return zzxc.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxc.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    public static void zza(Object obj, long j, boolean z) {
        zzbsv.zza(obj, j, z);
    }

    public static boolean zzm(Object obj, long j) {
        return zzbsv.zzm(obj, j);
    }

    public static float zzn(Object obj, long j) {
        return zzbsv.zzn(obj, j);
    }

    public static double zzo(Object obj, long j) {
        return zzbsv.zzo(obj, j);
    }

    public static boolean zzp(Class<?> cls) {
        if (!zzsr.zzpv()) {
            return false;
        }
        try {
            Class<?> cls2 = zzbke;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void zza(Object obj, long j, float f) {
        zzbsv.zza(obj, j, f);
    }

    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : 0);
    }

    public static void zza(Object obj, long j, double d) {
        zzbsv.zza(obj, j, d);
    }

    public static void zza(Object obj, long j, Object obj2) {
        zzbsv.zzbtm.putObject(obj, j, obj2);
    }

    public static byte zza(byte[] bArr, long j) {
        return zzbsv.zzy(bArr, zzbsx + j);
    }

    public static void zza(byte[] bArr, long j, byte b) {
        zzbsv.zze(bArr, zzbsx + j, b);
    }

    public static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }
}
