package com.google.zxing.pdf417.encoder;

import androidx.exifinterface.media.ExifInterface;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.p118pd.sdk.C8027oOO00oo;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public final class PDF417HighLevelEncoder {
    public static final int BYTE_COMPACTION = 1;
    public static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
    public static final int ECI_CHARSET = 927;
    public static final int ECI_GENERAL_PURPOSE = 926;
    public static final int ECI_USER_DEFINED = 925;
    public static final int LATCH_TO_BYTE = 924;
    public static final int LATCH_TO_BYTE_PADDED = 901;
    public static final int LATCH_TO_NUMERIC = 902;
    public static final int LATCH_TO_TEXT = 900;
    public static final byte[] MIXED = new byte[128];
    public static final int NUMERIC_COMPACTION = 2;
    public static final byte[] PUNCTUATION = new byte[128];
    public static final int SHIFT_TO_BYTE = 913;
    public static final int SUBMODE_ALPHA = 0;
    public static final int SUBMODE_LOWER = 1;
    public static final int SUBMODE_MIXED = 2;
    public static final int SUBMODE_PUNCTUATION = 3;
    public static final int TEXT_COMPACTION = 0;
    public static final byte[] TEXT_MIXED_RAW = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, C8027oOO00oo.OooO0OO, ExifInterface.OooO00o, 61, 94, 0, 32, 0, 0, 0};
    public static final byte[] TEXT_PUNCTUATION_RAW = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, PublicSuffixDatabase.EXCEPTION_MARKER, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, ExifInterface.OooO00o, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1 */
    public static /* synthetic */ class C10721 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.zxing.pdf417.encoder.Compaction[] r0 = com.google.zxing.pdf417.encoder.Compaction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.C10721.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction = r0
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.C10721.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.C10721.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.C10721.<clinit>():void");
        }
    }

    static {
        Arrays.fill(MIXED, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = TEXT_MIXED_RAW;
            if (i2 >= bArr.length) {
                break;
            }
            byte b = bArr[i2];
            if (b > 0) {
                MIXED[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        while (true) {
            byte[] bArr2 = TEXT_PUNCTUATION_RAW;
            if (i < bArr2.length) {
                byte b2 = bArr2[i];
                if (b2 > 0) {
                    PUNCTUATION[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static int determineConsecutiveBinaryCount(String str, int i, Charset charset) throws WriterException {
        int i2;
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i3 = i;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && isDigit(charAt) && (i2 = i3 + (i4 = i4 + 1)) < length) {
                charAt = str.charAt(i2);
            }
            if (i4 >= 13) {
                return i3 - i;
            }
            char charAt2 = str.charAt(i3);
            if (newEncoder.canEncode(charAt2)) {
                i3++;
            } else {
                throw new WriterException("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + ')');
            }
        }
        return i3 - i;
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (isDigit(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    public static int determineConsecutiveTextCount(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && isDigit(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!isText(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    public static void encodeBinary(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    public static String encodeHighLevel(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = DEFAULT_ENCODING;
        } else if (!DEFAULT_ENCODING.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            encodingECI(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        int i = C10721.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[compaction.ordinal()];
        if (i == 1) {
            encodeText(str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            encodeBinary(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int determineConsecutiveDigitCount = determineConsecutiveDigitCount(str, i2);
                if (determineConsecutiveDigitCount >= 13) {
                    sb.append((char) 902);
                    encodeNumeric(str, i2, determineConsecutiveDigitCount, sb);
                    i2 += determineConsecutiveDigitCount;
                    i3 = 0;
                    i4 = 2;
                } else {
                    int determineConsecutiveTextCount = determineConsecutiveTextCount(str, i2);
                    if (determineConsecutiveTextCount >= 5 || determineConsecutiveDigitCount == length) {
                        if (i4 != 0) {
                            sb.append((char) 900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i3 = encodeText(str, i2, determineConsecutiveTextCount, sb, i3);
                        i2 += determineConsecutiveTextCount;
                    } else {
                        int determineConsecutiveBinaryCount = determineConsecutiveBinaryCount(str, i2, charset);
                        if (determineConsecutiveBinaryCount == 0) {
                            determineConsecutiveBinaryCount = 1;
                        }
                        int i5 = determineConsecutiveBinaryCount + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            encodeBinary(bytes2, 0, 1, 0, sb);
                        } else {
                            encodeBinary(bytes2, 0, bytes2.length, i4, sb);
                            i3 = 0;
                            i4 = 1;
                        }
                        i2 = i5;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            encodeNumeric(str, 0, length, sb);
        }
        return sb.toString();
    }

    public static void encodeNumeric(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[EDGE_INSN: B:68:0x00f6->B:53:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0011 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int encodeText(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.encodeText(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static void encodingECI(int i, StringBuilder sb) throws WriterException {
        if (i >= 0 && i < 900) {
            sb.append((char) 927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else if (i < 811800) {
            sb.append((char) 925);
            sb.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
    }

    public static boolean isAlphaLower(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean isAlphaUpper(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isMixed(char c) {
        return MIXED[c] != -1;
    }

    public static boolean isPunctuation(char c) {
        return PUNCTUATION[c] != -1;
    }

    public static boolean isText(char c) {
        if (c == '\t' || c == '\n' || c == '\r') {
            return true;
        }
        return c >= ' ' && c <= '~';
    }
}
