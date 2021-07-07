package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzcg<MessageType extends zzcg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzas<MessageType, BuilderType> {
    public static Map<Object, zzcg<?, ?>> zzjr = new ConcurrentHashMap();
    public zzey zzjp = zzey.zzea();
    public int zzjq = -1;

    public static abstract class zza<MessageType extends zzcg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzat<MessageType, BuilderType> {
        public final MessageType zzjs;
        public MessageType zzjt;
        public boolean zzju = false;

        public zza(MessageType messagetype) {
            this.zzjs = messagetype;
            this.zzjt = (MessageType) ((zzcg) messagetype.zza(zzg.zzkg, null, null));
        }

        public static void zza(MessageType messagetype, MessageType messagetype2) {
            zzea.zzcm().zzp(messagetype).zzc(messagetype, messagetype2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.internal.clearcut.zzcg$zza */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.zzat, java.lang.Object
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) this.zzjs.zza(zzg.zzkh, null, null);
            zza.zza((zzcg) zzbi());
            return zza;
        }

        @Override // com.google.android.gms.internal.clearcut.zzdq
        public final boolean isInitialized() {
            return zzcg.zza((zzcg) this.zzjt, false);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzbf();
            zza(this.zzjt, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.clearcut.zzdq
        public final /* synthetic */ zzdo zzbe() {
            return this.zzjs;
        }

        public void zzbf() {
            if (this.zzju) {
                MessageType messagetype = (MessageType) ((zzcg) this.zzjt.zza(zzg.zzkg, null, null));
                zza(messagetype, this.zzjt);
                this.zzjt = messagetype;
                this.zzju = false;
            }
        }

        /* renamed from: zzbg */
        public MessageType zzbi() {
            if (this.zzju) {
                return this.zzjt;
            }
            MessageType messagetype = this.zzjt;
            zzea.zzcm().zzp(messagetype).zzc(messagetype);
            this.zzju = true;
            return this.zzjt;
        }

        public final MessageType zzbh() {
            MessageType messagetype = (MessageType) ((zzcg) zzbi());
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.zza(zzg.zzkd, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzea.zzcm().zzp(messagetype).zzo(messagetype);
                    if (booleanValue) {
                        messagetype.zza(zzg.zzke, z ? messagetype : null, null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzew(messagetype);
        }

        @Override // com.google.android.gms.internal.clearcut.zzdp
        public final /* synthetic */ zzdo zzbj() {
            zzcg zzcg = (zzcg) zzbi();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) zzcg.zza(zzg.zzkd, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzea.zzcm().zzp(zzcg).zzo(zzcg);
                    if (booleanValue) {
                        zzcg.zza(zzg.zzke, z ? zzcg : null, (Object) null);
                    }
                }
            }
            if (z) {
                return zzcg;
            }
            throw new zzew(zzcg);
        }

        @Override // com.google.android.gms.internal.clearcut.zzat
        public final /* synthetic */ zzat zzt() {
            return (zza) clone();
        }
    }

    public static class zzb<T extends zzcg<T, ?>> extends zzau<T> {
        public T zzjs;

        public zzb(T t) {
            this.zzjs = t;
        }
    }

    public static abstract class zzc<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zza<MessageType, BuilderType> implements zzdq {
        public zzc(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza
        public final void zzbf() {
            if (this.zzju) {
                super.zzbf();
                MessageType messagetype = this.zzjt;
                ((zzd) messagetype).zzjv = (zzby) ((zzd) messagetype).zzjv.clone();
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza
        public final /* synthetic */ zzcg zzbg() {
            return (zzd) zzbi();
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza, com.google.android.gms.internal.clearcut.zzdp
        public final /* synthetic */ zzdo zzbi() {
            MessageType messagetype;
            if (this.zzju) {
                messagetype = this.zzjt;
            } else {
                ((zzd) this.zzjt).zzjv.zzv();
                messagetype = (MessageType) super.zzbi();
            }
            return (zzd) messagetype;
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zzcg<MessageType, BuilderType> implements zzdq {
        public zzby<zze> zzjv = zzby.zzar();
    }

    public static final class zze implements zzca<zze> {
        public final int number = 66321687;
        public final zzck<?> zzjw = null;
        public final zzfl zzjx;
        public final boolean zzjy;
        public final boolean zzjz;

        public zze(zzck<?> zzck, int i, zzfl zzfl, boolean z, boolean z2) {
            this.zzjx = zzfl;
            this.zzjy = false;
            this.zzjz = false;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.number - ((zze) obj).number;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.android.gms.internal.clearcut.zzcg$zza */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzdp zza(zzdp zzdp, zzdo zzdo) {
            return ((zza) zzdp).zza((zzcg) zzdo);
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzdv zza(zzdv zzdv, zzdv zzdv2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzfl zzau() {
            return this.zzjx;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzfq zzav() {
            return this.zzjx.zzek();
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzaw() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzax() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final int zzc() {
            return this.number;
        }
    }

    public static class zzf<ContainingType extends zzdo, Type> extends zzbr<ContainingType, Type> {
        public final Type zzdu;
        public final ContainingType zzka;
        public final zzdo zzkb;
        public final zze zzkc;

        public zzf(ContainingType containingtype, Type type, zzdo zzdo, zze zze, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (zze.zzjx == zzfl.MESSAGE && zzdo == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.zzka = containingtype;
                this.zzdu = type;
                this.zzkb = zzdo;
                this.zzkc = zze;
            }
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class zzg {
        public static final int zzkd = 1;
        public static final int zzke = 2;
        public static final int zzkf = 3;
        public static final int zzkg = 4;
        public static final int zzkh = 5;
        public static final int zzki = 6;
        public static final int zzkj = 7;
        public static final /* synthetic */ int[] zzkk = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzkl = 1;
        public static final int zzkm = 2;
        public static final /* synthetic */ int[] zzkn = {1, 2};
        public static final int zzko = 1;
        public static final int zzkp = 2;
        public static final /* synthetic */ int[] zzkq = {1, 2};

        /* renamed from: values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0 */
        public static int[] m982x126d66cb() {
            return (int[]) zzkk.clone();
        }
    }

    public static <ContainingType extends zzdo, Type> zzf<ContainingType, Type> zza(ContainingType containingtype, Type type, zzdo zzdo, zzck<?> zzck, int i, zzfl zzfl, Class cls) {
        return new zzf<>(containingtype, type, zzdo, new zze(null, 66321687, zzfl, false, false), cls);
    }

    public static <T extends zzcg<T, ?>> T zza(T t, byte[] bArr) throws zzco {
        T t2 = (T) ((zzcg) t.zza(zzg.zzkg, null, null));
        try {
            zzea.zzcm().zzp(t2).zza(t2, bArr, 0, bArr.length, new zzay());
            zzea.zzcm().zzp(t2).zzc(t2);
            if (t2.zzex == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzco) {
                throw ((zzco) e.getCause());
            }
            throw new zzco(e.getMessage()).zzg(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzco.zzbl().zzg(t2);
        }
    }

    public static Object zza(zzdo zzdo, String str, Object[] objArr) {
        return new zzec(zzdo, str, objArr);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <T extends zzcg<?, ?>> void zza(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    public static final <T extends zzcg<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzg.zzkd, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return zzea.zzcm().zzp(t).zzo(t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.clearcut.zzch, com.google.android.gms.internal.clearcut.zzcl] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.clearcut.zzcl zzaz() {
        /*
            com.google.android.gms.internal.clearcut.zzch r0 = com.google.android.gms.internal.clearcut.zzch.zzbk()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzcg.zzaz():com.google.android.gms.internal.clearcut.zzcl");
    }

    public static <T extends zzcg<T, ?>> T zzb(T t, byte[] bArr) throws zzco {
        T t2 = (T) zza(t, bArr);
        if (t2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) t2.zza(zzg.zzkd, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzea.zzcm().zzp(t2).zzo(t2);
                    if (booleanValue) {
                        t2.zza(zzg.zzke, z ? t2 : null, null);
                    }
                }
            }
            if (!z) {
                throw new zzco(new zzew(t2).getMessage()).zzg(t2);
            }
        }
        return t2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.clearcut.zzcm, com.google.android.gms.internal.clearcut.zzdc] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.clearcut.zzcm zzba() {
        /*
            com.google.android.gms.internal.clearcut.zzdc r0 = com.google.android.gms.internal.clearcut.zzdc.zzbx()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzcg.zzba():com.google.android.gms.internal.clearcut.zzcm");
    }

    public static <E> zzcn<E> zzbb() {
        return zzeb.zzcn();
    }

    public static <T extends zzcg<?, ?>> T zzc(Class<T> cls) {
        T t = (T) zzjr.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unable to get default instance for: ".concat(valueOf) : new String("Unable to get default instance for: "));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzcg) zza(zzg.zzki, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzea.zzcm().zzp(this).equals(this, (zzcg) obj);
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int hashCode = zzea.zzcm().zzp(this).hashCode(this);
        this.zzex = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdq
    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zza(zzg.zzkd, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzo = zzea.zzcm().zzp(this).zzo(this);
        if (booleanValue) {
            zza(zzg.zzke, zzo ? this : null, (Object) null);
        }
        return zzo;
    }

    public String toString() {
        return zzdr.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final int zzas() {
        if (this.zzjq == -1) {
            this.zzjq = zzea.zzcm().zzp(this).zzm(this);
        }
        return this.zzjq;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final void zzb(zzbn zzbn) throws IOException {
        zzea.zzcm().zze(getClass()).zza(this, zzbp.zza(zzbn));
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final /* synthetic */ zzdp zzbc() {
        zza zza2 = (zza) zza(zzg.zzkh, (Object) null, (Object) null);
        zza2.zza((zzcg) this);
        return zza2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final /* synthetic */ zzdp zzbd() {
        return (zza) zza(zzg.zzkh, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzdq
    public final /* synthetic */ zzdo zzbe() {
        return (zzcg) zza(zzg.zzki, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzas
    public final void zzf(int i) {
        this.zzjq = i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzas
    public final int zzs() {
        return this.zzjq;
    }
}
