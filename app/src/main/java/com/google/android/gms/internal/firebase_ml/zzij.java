package com.google.android.gms.internal.firebase_ml;

public abstract class zzij extends zzif {
    public abstract int zza(CharSequence charSequence, int i, int i2);

    public final String zza(String str, int i) {
        int length = str.length();
        char[] zzhk = zzih.zzhk();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            if (i < length) {
                int i4 = i + 1;
                char charAt = str.charAt(i);
                int i5 = 1;
                int i6 = charAt;
                if (charAt >= 55296) {
                    i6 = charAt;
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            StringBuilder sb = new StringBuilder(82);
                            sb.append("Unexpected low surrogate character '");
                            sb.append(charAt);
                            sb.append("' with value ");
                            sb.append((int) charAt);
                            sb.append(" at index ");
                            sb.append(i4 - 1);
                            throw new IllegalArgumentException(sb.toString());
                        } else if (i4 == length) {
                            i6 = -charAt;
                        } else {
                            char charAt2 = str.charAt(i4);
                            if (Character.isLowSurrogate(charAt2)) {
                                i6 = Character.toCodePoint(charAt, charAt2);
                            } else {
                                StringBuilder sb2 = new StringBuilder(83);
                                sb2.append("Expected low surrogate but got char '");
                                sb2.append(charAt2);
                                sb2.append("' with value ");
                                sb2.append((int) charAt2);
                                sb2.append(" at index ");
                                sb2.append(i4);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    char[] zzai = zzai(i6 == 1 ? 1 : 0);
                    if (Character.isSupplementaryCodePoint(i6)) {
                        i5 = 2;
                    }
                    int i7 = i5 + i;
                    if (zzai != null) {
                        int i8 = i - i2;
                        int i9 = i3 + i8;
                        int length2 = zzai.length + i9;
                        if (zzhk.length < length2) {
                            zzhk = zza(zzhk, i3, ((length2 + length) - i) + 32);
                        }
                        if (i8 > 0) {
                            str.getChars(i2, i, zzhk, i3);
                            i3 = i9;
                        }
                        if (zzai.length > 0) {
                            System.arraycopy(zzai, 0, zzhk, i3, zzai.length);
                            i3 += zzai.length;
                        }
                        i2 = i7;
                    }
                    i = zza(str, i7, length);
                } else {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i10 = length - i2;
        if (i10 > 0) {
            int i11 = i10 + i3;
            if (zzhk.length < i11) {
                zzhk = zza(zzhk, i3, i11);
            }
            str.getChars(i2, length, zzhk, i3);
            i3 = i11;
        }
        return new String(zzhk, 0, i3);
    }

    public abstract char[] zzai(int i);

    public static char[] zza(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
