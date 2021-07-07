package com.google.android.gms.internal.firebase_ml;

import com.umeng.message.util.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class zzfu implements zzhu {
    public static final String MEDIA_TYPE = new zzfg(HttpRequest.CONTENT_TYPE_FORM).zza(zzhc.UTF_8).zzew();

    public static Object zza(Type type, List<Type> list, String str) {
        return zzhf.zza(zzhf.zza(list, type), str);
    }

    public static void zze(String str, Object obj) {
        if (str != null) {
            try {
                StringReader stringReader = new StringReader(str);
                Class<?> cls = obj.getClass();
                zzhd zzc = zzhd.zzc(cls);
                List asList = Arrays.asList(cls);
                zzhm zzhm = zzhm.class.isAssignableFrom(cls) ? (zzhm) obj : null;
                Map map = Map.class.isAssignableFrom(cls) ? (Map) obj : null;
                zzgy zzgy = new zzgy(obj);
                StringWriter stringWriter = new StringWriter();
                StringWriter stringWriter2 = new StringWriter();
                boolean z = true;
                while (true) {
                    int read = stringReader.read();
                    if (read == -1 || read == 38) {
                        String zzar = zzie.zzar(stringWriter.toString());
                        if (zzar.length() != 0) {
                            String zzar2 = zzie.zzar(stringWriter2.toString());
                            zzhl zzao = zzc.zzao(zzar);
                            if (zzao != null) {
                                Type zza = zzhf.zza((List<Type>) asList, zzao.getGenericType());
                                if (zzia.zzc(zza)) {
                                    Class<?> zzb = zzia.zzb(asList, zzia.zzd(zza));
                                    zzgy.zza(zzao.zzhf(), zzb, zza(zzb, asList, zzar2));
                                } else if (zzia.zza(zzia.zzb(asList, zza), (Class<?>) Iterable.class)) {
                                    Collection<Object> collection = (Collection) zzao.zzh(obj);
                                    if (collection == null) {
                                        collection = zzhf.zzb(zza);
                                        zzao.zzb(obj, collection);
                                    }
                                    collection.add(zza(zza == Object.class ? null : zzia.zze(zza), asList, zzar2));
                                } else {
                                    zzao.zzb(obj, zza(zza, asList, zzar2));
                                }
                            } else if (map != null) {
                                ArrayList arrayList = (ArrayList) map.get(zzar);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    if (zzhm != null) {
                                        zzhm.zzb(zzar, arrayList);
                                    } else {
                                        map.put(zzar, arrayList);
                                    }
                                }
                                arrayList.add(zzar2);
                            }
                        }
                        StringWriter stringWriter3 = new StringWriter();
                        StringWriter stringWriter4 = new StringWriter();
                        if (read == -1) {
                            zzgy.zzha();
                            return;
                        }
                        stringWriter2 = stringWriter4;
                        z = true;
                        stringWriter = stringWriter3;
                    } else if (read != 61) {
                        if (z) {
                            stringWriter.write(read);
                        } else {
                            stringWriter2.write(read);
                        }
                    } else if (z) {
                        z = false;
                    } else {
                        stringWriter2.write(read);
                    }
                }
            } catch (IOException e) {
                throw zzlb.zza(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhu
    public final <T> T zza(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        throw new NoSuchMethodError();
    }
}
