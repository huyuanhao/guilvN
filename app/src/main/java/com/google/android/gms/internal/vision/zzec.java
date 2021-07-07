package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzec;
import com.google.android.gms.internal.vision.zzed;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzec<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzed<MessageType, BuilderType>> implements zzhf {
    public static boolean zzrj;
    public int zzri = 0;

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzga.checkNotNull(iterable);
        if (iterable instanceof zzgo) {
            List<?> zzft = ((zzgo) iterable).zzft();
            zzgo zzgo = (zzgo) list;
            int size = list.size();
            for (Object obj : zzft) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzgo.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzgo.size() - 1; size2 >= size; size2--) {
                        zzgo.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof zzeo) {
                    zzgo.zzc((zzeo) obj);
                } else {
                    zzgo.add((String) obj);
                }
            }
        } else if (iterable instanceof zzhr) {
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
            byte[] bArr = new byte[zzeq()];
            zzfe zzg = zzfe.zzg(bArr);
            zzb(zzg);
            zzg.zzea();
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

    @Override // com.google.android.gms.internal.vision.zzhf
    public final zzeo zzce() {
        try {
            zzev zzaj = zzeo.zzaj(zzeq());
            zzb(zzaj.zzdp());
            return zzaj.zzdo();
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

    public int zzcf() {
        throw new UnsupportedOperationException();
    }

    public void zzy(int i) {
        throw new UnsupportedOperationException();
    }
}
