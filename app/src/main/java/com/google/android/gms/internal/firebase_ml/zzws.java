package com.google.android.gms.internal.firebase_ml;

public final class zzws {
    public static String zzd(zzsw zzsw) {
        zzwt zzwt = new zzwt(zzsw);
        StringBuilder sb = new StringBuilder(zzwt.size());
        for (int i = 0; i < zzwt.size(); i++) {
            byte zzcl = zzwt.zzcl(i);
            if (zzcl == 34) {
                sb.append("\\\"");
            } else if (zzcl == 39) {
                sb.append("\\'");
            } else if (zzcl != 92) {
                switch (zzcl) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zzcl < 32 || zzcl > 126) {
                            sb.append('\\');
                            sb.append((char) (((zzcl >>> 6) & 3) + 48));
                            sb.append((char) (((zzcl >>> 3) & 7) + 48));
                            sb.append((char) ((zzcl & 7) + 48));
                            break;
                        } else {
                            sb.append((char) zzcl);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
