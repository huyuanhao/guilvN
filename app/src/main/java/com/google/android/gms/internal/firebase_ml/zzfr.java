package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class zzfr {
    public static final Map<Character, zzfs> zzvi = new HashMap();

    static {
        zzfs.values();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0200 A[EDGE_INSN: B:85:0x0200->B:83:0x0200 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzfr.zza(java.lang.String, java.lang.String, java.lang.Object, boolean):java.lang.String");
    }

    public static Map<String, Object> zzb(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : zzhf.zzf(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !zzhf.isNull(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    public static String zza(String str, Iterator<?> it, boolean z, zzfs zzfs) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            str2 = zzfs.zzfs();
        } else {
            if (zzfs.zzft()) {
                sb.append(zzie.zzas(str));
                sb.append(C8932ooOOO0o.OooO0Oo);
            }
            str2 = Constants.ACCEPT_TIME_SEPARATOR_SP;
        }
        while (it.hasNext()) {
            if (z && zzfs.zzft()) {
                sb.append(zzie.zzas(str));
                sb.append(C8932ooOOO0o.OooO0Oo);
            }
            sb.append(zzfs.zzak(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
