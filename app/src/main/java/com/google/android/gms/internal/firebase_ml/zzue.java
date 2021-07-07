package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import com.google.android.gms.internal.firebase_ml.zzue.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzue<MessageType extends zzue<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzsn<MessageType, BuilderType> {
    public static Map<Object, zzue<?, ?>> zzboj = new ConcurrentHashMap();
    public zzwx zzboh = zzwx.zztg();
    public int zzboi = -1;

    public static class zzb<T extends zzue<T, ?>> extends zzsp<T> {
        public final T zzbok;

        public zzb(T t) {
            this.zzbok = t;
        }
    }

    public static abstract class zzc<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zza<MessageType, BuilderType> implements zzvq {
        public zzc(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue.zza
        public final void zzrf() {
            if (this.zzbom) {
                super.zzrf();
                MessageType messagetype = this.zzbol;
                ((zzd) messagetype).zzbon = (zztw) ((zzd) messagetype).zzbon.clone();
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue.zza
        public /* synthetic */ zzue zzrg() {
            return (zzd) zzri();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzue.zza, com.google.android.gms.internal.firebase_ml.zzvp
        public /* synthetic */ zzvo zzri() {
            if (this.zzbom) {
                return (zzd) this.zzbol;
            }
            ((zzd) this.zzbol).zzbon.zzpt();
            return (zzd) super.zzri();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zzue<MessageType, BuilderType> implements zzvq {
        public zztw<Object> zzbon = zztw.zzqp();

        public final zztw<Object> zzrk() {
            if (this.zzbon.isImmutable()) {
                this.zzbon = (zztw) this.zzbon.clone();
            }
            return this.zzbon;
        }
    }

    public static class zze<ContainingType extends zzvo, Type> extends zztp<ContainingType, Type> {
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class zzf {
        public static final int zzboo = 1;
        public static final int zzbop = 2;
        public static final int zzboq = 3;
        public static final int zzbor = 4;
        public static final int zzbos = 5;
        public static final int zzbot = 6;
        public static final int zzbou = 7;
        public static final /* synthetic */ int[] zzbov = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzbow = 1;
        public static final int zzbox = 2;
        public static final /* synthetic */ int[] zzboy = {1, 2};
        public static final int zzboz = 1;
        public static final int zzbpa = 2;
        public static final /* synthetic */ int[] zzbpb = {1, 2};

        /* renamed from: values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0 */
        public static int[] m984x126d66cb() {
            return (int[]) zzbov.clone();
        }
    }

    public static <T extends zzue<?, ?>> void zza(Class<T> cls, T t) {
        zzboj.put(cls, t);
    }

    public static <T extends zzue<?, ?>> T zzi(Class<T> cls) {
        zzue<?, ?> zzue = zzboj.get(cls);
        if (zzue == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzue = (T) zzboj.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzue == null) {
            zzue = (T) ((zzue) ((zzue) zzxc.zzm(cls)).zza(zzf.zzbot, (Object) null, (Object) null));
            if (zzue != null) {
                zzboj.put(cls, zzue);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzue;
    }

    public static zzul zzqz() {
        return zzuf.zzrl();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.firebase_ml.zzuc, com.google.android.gms.internal.firebase_ml.zzuk] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.firebase_ml.zzuk zzra() {
        /*
            com.google.android.gms.internal.firebase_ml.zzuc r0 = com.google.android.gms.internal.firebase_ml.zzuc.zzqv()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzue.zzra():com.google.android.gms.internal.firebase_ml.zzuk");
    }

    public static <E> zzun<E> zzrb() {
        return zzwc.zzsp();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzue) zza(zzf.zzbot, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzwb.zzso().zzad(this).equals(this, (zzue) obj);
    }

    public int hashCode() {
        int i = this.zzbka;
        if (i != 0) {
            return i;
        }
        int hashCode = zzwb.zzso().zzad(this).hashCode(this);
        this.zzbka = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvq
    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public String toString() {
        return zzvr.zza(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.firebase_ml.zzvo
    public final void zzb(zztl zztl) throws IOException {
        zzwb.zzso().zzk(getClass()).zza(this, zztn.zza(zztl));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsn
    public final void zzch(int i) {
        this.zzboi = i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsn
    public final int zzpq() {
        return this.zzboi;
    }

    public final void zzpt() {
        zzwb.zzso().zzad(this).zzq(this);
    }

    public final <MessageType extends zzue<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzqx() {
        return (BuilderType) ((zza) zza(zzf.zzbos, (Object) null, (Object) null));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvo
    public final int zzqy() {
        if (this.zzboi == -1) {
            this.zzboi = zzwb.zzso().zzad(this).zzaa(this);
        }
        return this.zzboi;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvo
    public final /* synthetic */ zzvp zzrc() {
        zza zza2 = (zza) zza(zzf.zzbos, (Object) null, (Object) null);
        zza2.zza((zzue) this);
        return zza2;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvo
    public final /* synthetic */ zzvp zzrd() {
        return (zza) zza(zzf.zzbos, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvq
    public final /* synthetic */ zzvo zzre() {
        return (zzue) zza(zzf.zzbot, (Object) null, (Object) null);
    }

    public static abstract class zza<MessageType extends zzue<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzso<MessageType, BuilderType> {
        public final MessageType zzbok;
        public MessageType zzbol;
        public boolean zzbom = false;

        public zza(MessageType messagetype) {
            this.zzbok = messagetype;
            this.zzbol = (MessageType) ((zzue) messagetype.zza(zzf.zzbor, null, null));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.internal.firebase_ml.zzue$zza */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.firebase_ml.zzso, java.lang.Object
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) this.zzbok.zza(zzf.zzbos, null, null);
            zza.zza((zzue) zzri());
            return zza;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzvq
        public final boolean isInitialized() {
            return zzue.zza((zzue) this.zzbol, false);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzrf();
            zza(this.zzbol, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzso
        public final /* synthetic */ zzso zzpr() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzvq
        public final /* synthetic */ zzvo zzre() {
            return this.zzbok;
        }

        public void zzrf() {
            if (this.zzbom) {
                MessageType messagetype = (MessageType) ((zzue) this.zzbol.zza(zzf.zzbor, null, null));
                zza(messagetype, this.zzbol);
                this.zzbol = messagetype;
                this.zzbom = false;
            }
        }

        /* renamed from: zzrg */
        public MessageType zzri() {
            if (this.zzbom) {
                return this.zzbol;
            }
            this.zzbol.zzpt();
            this.zzbom = true;
            return this.zzbol;
        }

        /* renamed from: zzrh */
        public final MessageType zzrj() {
            MessageType messagetype = (MessageType) ((zzue) zzri());
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzwv(messagetype);
        }

        public static void zza(MessageType messagetype, MessageType messagetype2) {
            zzwb.zzso().zzad(messagetype).zzg(messagetype, messagetype2);
        }
    }

    public static Object zza(zzvo zzvo, String str, Object[] objArr) {
        return new zzwd(zzvo, str, objArr);
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

    public static final <T extends zzue<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zzboo, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzac = zzwb.zzso().zzad(t).zzac(t);
        if (z) {
            t.zza(zzf.zzbop, zzac ? t : null, null);
        }
        return zzac;
    }

    public static zzul zza(zzul zzul) {
        int size = zzul.size();
        return zzul.zzdg(size == 0 ? 10 : size << 1);
    }

    public static <E> zzun<E> zza(zzun<E> zzun) {
        int size = zzun.size();
        return zzun.zzck(size == 0 ? 10 : size << 1);
    }

    public static <T extends zzue<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zztr zztr) throws zzuo {
        T t2 = (T) ((zzue) t.zza(zzf.zzbor, null, null));
        try {
            zzwb.zzso().zzad(t2).zza(t2, bArr, 0, i2, new zzst(zztr));
            t2.zzpt();
            if (t2.zzbka == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzuo) {
                throw ((zzuo) e.getCause());
            }
            throw new zzuo(e.getMessage()).zzg(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzuo.zzrm().zzg(t2);
        }
    }

    public static <T extends zzue<T, ?>> T zza(T t, byte[] bArr, zztr zztr) throws zzuo {
        T t2 = (T) zza(t, bArr, 0, bArr.length, zztr);
        if (t2 == null || t2.isInitialized()) {
            return t2;
        }
        throw new zzuo(new zzwv(t2).getMessage()).zzg(t2);
    }
}
