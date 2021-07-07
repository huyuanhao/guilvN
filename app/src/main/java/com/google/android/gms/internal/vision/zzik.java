package com.google.android.gms.internal.vision;

public final class zzik {
    public static String zzd(zzeo zzeo) {
        zzil zzil = new zzil(zzeo);
        StringBuilder sb = new StringBuilder(zzil.size());
        for (int i = 0; i < zzil.size(); i++) {
            byte zzai = zzil.zzai(i);
            if (zzai == 34) {
                sb.append("\\\"");
            } else if (zzai == 39) {
                sb.append("\\'");
            } else if (zzai != 92) {
                switch (zzai) {
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
                        if (zzai < 32 || zzai > 126) {
                            sb.append('\\');
                            sb.append((char) (((zzai >>> 6) & 3) + 48));
                            sb.append((char) (((zzai >>> 3) & 7) + 48));
                            sb.append((char) ((zzai & 7) + 48));
                            break;
                        } else {
                            sb.append((char) zzai);
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
