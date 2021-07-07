package com.google.android.gms.internal.clearcut;

import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8318oOo0oooo;
import java.util.List;
import java.util.Map;

public final class zzdr {
    public static String zza(zzdo zzdo, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzdo, sb, 0);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f2, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0203, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0214, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0226, code lost:
        if (((java.lang.Double) r11).doubleValue() == com.p118pd.sdk.AbstractC8352oOoOOoO0.OooO0O0) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0258  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zza(com.google.android.gms.internal.clearcut.zzdo r18, java.lang.StringBuilder r19, int r20) {
        /*
        // Method dump skipped, instructions count: 700
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzdr.zza(com.google.android.gms.internal.clearcut.zzdo, java.lang.StringBuilder, int):void");
    }

    public static final void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zza(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zza(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzet.zzc(zzbb.zzf((String) obj)));
                sb.append(C8318oOo0oooo.OooO00o);
            } else if (obj instanceof zzbb) {
                sb.append(": \"");
                sb.append(zzet.zzc((zzbb) obj));
                sb.append(C8318oOo0oooo.OooO00o);
            } else if (obj instanceof zzcg) {
                sb.append(" {");
                zza((zzcg) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append(C7522o0Ooo0o.OooO0Oo);
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                zza(sb, i4, "key", entry2.getKey());
                zza(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append(C7522o0Ooo0o.OooO0Oo);
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static final String zzj(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
