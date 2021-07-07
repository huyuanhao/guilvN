package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzso;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzsn<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzso<MessageType, BuilderType>> implements zzvo {
    public static boolean zzbkb;
    public int zzbka = 0;

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzug.checkNotNull(iterable);
        if (iterable instanceof zzux) {
            List<?> zzrv = ((zzux) iterable).zzrv();
            zzux zzux = (zzux) list;
            int size = list.size();
            for (Object obj : zzrv) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzux.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzux.size() - 1; size2 >= size; size2--) {
                        zzux.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof zzsw) {
                    zzux.zzc((zzsw) obj);
                } else {
                    zzux.add((String) obj);
                }
            }
        } else if (iterable instanceof zzwa) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzqy()];
            zztl zzg = zztl.zzg(bArr);
            zzb(zzg);
            zzg.zzqf();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public void zzch(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvo
    public final zzsw zzpp() {
        try {
            zzte zzcn = zzsw.zzcn(zzqy());
            zzb(zzcn.zzqc());
            return zzcn.zzqb();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int zzpq() {
        throw new UnsupportedOperationException();
    }
}
