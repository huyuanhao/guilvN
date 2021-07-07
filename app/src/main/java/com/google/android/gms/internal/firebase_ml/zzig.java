package com.google.android.gms.internal.firebase_ml;

import com.tencent.bugly.beta.tinker.TinkerReport;

public final class zzig extends zzij {
    public static final char[] zzaam = {'+'};
    public static final char[] zzaan = "0123456789ABCDEF".toCharArray();
    public final boolean zzaao;
    public final boolean[] zzaap;

    public zzig(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (!str.contains("%")) {
            this.zzaao = z;
            char[] charArray = str.toCharArray();
            int i = TinkerReport.KEY_APPLIED_DEXOPT_EXIST;
            for (char c : charArray) {
                i = Math.max((int) c, i);
            }
            boolean[] zArr = new boolean[(i + 1)];
            for (int i2 = 48; i2 <= 57; i2++) {
                zArr[i2] = true;
            }
            for (int i3 = 65; i3 <= 90; i3++) {
                zArr[i3] = true;
            }
            for (int i4 = 97; i4 <= 122; i4++) {
                zArr[i4] = true;
            }
            for (char c2 : charArray) {
                zArr[c2] = true;
            }
            this.zzaap = zArr;
        } else {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzij
    public final int zza(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.zzaap;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzij
    public final char[] zzai(int i) {
        boolean[] zArr = this.zzaap;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.zzaao) {
            return zzaam;
        }
        if (i <= 127) {
            char[] cArr = new char[3];
            cArr[0] = '%';
            char[] cArr2 = zzaan;
            cArr[2] = cArr2[i & 15];
            cArr[1] = cArr2[i >>> 4];
            return cArr;
        } else if (i <= 2047) {
            char[] cArr3 = new char[6];
            cArr3[0] = '%';
            cArr3[3] = '%';
            char[] cArr4 = zzaan;
            cArr3[5] = cArr4[i & 15];
            int i2 = i >>> 4;
            cArr3[4] = cArr4[(i2 & 3) | 8];
            int i3 = i2 >>> 2;
            cArr3[2] = cArr4[i3 & 15];
            cArr3[1] = cArr4[(i3 >>> 4) | 12];
            return cArr3;
        } else if (i <= 65535) {
            char[] cArr5 = new char[9];
            cArr5[0] = '%';
            cArr5[1] = 'E';
            cArr5[3] = '%';
            cArr5[6] = '%';
            char[] cArr6 = zzaan;
            cArr5[8] = cArr6[i & 15];
            int i4 = i >>> 4;
            cArr5[7] = cArr6[(i4 & 3) | 8];
            int i5 = i4 >>> 2;
            cArr5[5] = cArr6[i5 & 15];
            int i6 = i5 >>> 4;
            cArr5[4] = cArr6[(i6 & 3) | 8];
            cArr5[2] = cArr6[i6 >>> 2];
            return cArr5;
        } else if (i <= 1114111) {
            char[] cArr7 = new char[12];
            cArr7[0] = '%';
            cArr7[1] = 'F';
            cArr7[3] = '%';
            cArr7[6] = '%';
            cArr7[9] = '%';
            char[] cArr8 = zzaan;
            cArr7[11] = cArr8[i & 15];
            int i7 = i >>> 4;
            cArr7[10] = cArr8[(i7 & 3) | 8];
            int i8 = i7 >>> 2;
            cArr7[8] = cArr8[i8 & 15];
            int i9 = i8 >>> 4;
            cArr7[7] = cArr8[(i9 & 3) | 8];
            int i10 = i9 >>> 2;
            cArr7[5] = cArr8[i10 & 15];
            int i11 = i10 >>> 4;
            cArr7[4] = cArr8[(i11 & 3) | 8];
            cArr7[2] = cArr8[(i11 >>> 2) & 7];
            return cArr7;
        } else {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Invalid unicode character value ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzif
    public final String zzaw(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.zzaap;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return zza(str, i);
            }
        }
        return str;
    }
}
