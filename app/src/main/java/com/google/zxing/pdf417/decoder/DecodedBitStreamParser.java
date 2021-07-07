package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.util.Arrays;

public final class DecodedBitStreamParser {

    /* renamed from: AL */
    public static final int f1027AL = 28;

    /* renamed from: AS */
    public static final int f1028AS = 27;
    public static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    public static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    public static final int BYTE_COMPACTION_MODE_LATCH = 901;
    public static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    public static final int ECI_CHARSET = 927;
    public static final int ECI_GENERAL_PURPOSE = 926;
    public static final int ECI_USER_DEFINED = 925;
    public static final BigInteger[] EXP900;

    /* renamed from: LL */
    public static final int f1029LL = 27;
    public static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    public static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    public static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    public static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    public static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    public static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    public static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    public static final int MACRO_PDF417_TERMINATOR = 922;
    public static final int MAX_NUMERIC_CODEWORDS = 15;
    public static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: ML */
    public static final int f1030ML = 28;
    public static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    public static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    public static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    public static final int PAL = 29;

    /* renamed from: PL */
    public static final int f1031PL = 25;

    /* renamed from: PS */
    public static final int f1032PS = 29;
    public static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    public static final int TEXT_COMPACTION_MODE_LATCH = 900;

    /* renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C10711 {

        /* renamed from: $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode */
        public static final /* synthetic */ int[] f1033x45bba1d;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C10711.f1033x45bba1d = r0
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C10711.f1033x45bba1d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C10711.f1033x45bba1d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C10711.f1033x45bba1d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C10711.f1033x45bba1d     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C10711.f1033x45bba1d     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.pdf417.decoder.DecodedBitStreamParser$Mode r1 = com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.C10711.<clinit>():void");
        }
    }

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        EXP900[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0021 A[ADDED_TO_REGION, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int byteCompaction(int r16, int[] r17, java.nio.charset.Charset r18, int r19, java.lang.StringBuilder r20) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.byteCompaction(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.zxing.common.DecoderResult decode(int[] r6, java.lang.String r7) throws com.google.zxing.FormatException {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.decode(int[], java.lang.String):com.google.zxing.common.DecoderResult");
    }

    public static String decodeBase900toBase10(int[] iArr, int i) throws FormatException {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(EXP900[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] iArr, int i, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int textCompaction = textCompaction(iArr, i, sb);
            pDF417ResultMetadata.setFileId(sb.toString());
            int i3 = iArr[textCompaction] == 923 ? textCompaction + 1 : -1;
            while (textCompaction < iArr[0]) {
                int i4 = iArr[textCompaction];
                if (i4 == 922) {
                    textCompaction++;
                    pDF417ResultMetadata.setLastSegment(true);
                } else if (i4 == 923) {
                    int i5 = textCompaction + 1;
                    switch (iArr[i5]) {
                        case 0:
                            StringBuilder sb2 = new StringBuilder();
                            textCompaction = textCompaction(iArr, i5 + 1, sb2);
                            pDF417ResultMetadata.setFileName(sb2.toString());
                            continue;
                        case 1:
                            StringBuilder sb3 = new StringBuilder();
                            textCompaction = numericCompaction(iArr, i5 + 1, sb3);
                            pDF417ResultMetadata.setSegmentCount(Integer.parseInt(sb3.toString()));
                            continue;
                        case 2:
                            StringBuilder sb4 = new StringBuilder();
                            textCompaction = numericCompaction(iArr, i5 + 1, sb4);
                            pDF417ResultMetadata.setTimestamp(Long.parseLong(sb4.toString()));
                            continue;
                        case 3:
                            StringBuilder sb5 = new StringBuilder();
                            textCompaction = textCompaction(iArr, i5 + 1, sb5);
                            pDF417ResultMetadata.setSender(sb5.toString());
                            continue;
                        case 4:
                            StringBuilder sb6 = new StringBuilder();
                            textCompaction = textCompaction(iArr, i5 + 1, sb6);
                            pDF417ResultMetadata.setAddressee(sb6.toString());
                            continue;
                        case 5:
                            StringBuilder sb7 = new StringBuilder();
                            textCompaction = numericCompaction(iArr, i5 + 1, sb7);
                            pDF417ResultMetadata.setFileSize(Long.parseLong(sb7.toString()));
                            continue;
                        case 6:
                            StringBuilder sb8 = new StringBuilder();
                            textCompaction = numericCompaction(iArr, i5 + 1, sb8);
                            pDF417ResultMetadata.setChecksum(Integer.parseInt(sb8.toString()));
                            continue;
                        default:
                            throw FormatException.getFormatInstance();
                    }
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            if (i3 != -1) {
                int i6 = textCompaction - i3;
                if (pDF417ResultMetadata.isLastSegment()) {
                    i6--;
                }
                pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i3, i6 + i3));
            }
            return textCompaction;
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static void decodeTextCompaction(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        Mode mode;
        int i2;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            char c = ' ';
            switch (C10711.f1033x45bba1d[mode2.ordinal()]) {
                case 1:
                    if (i4 < 26) {
                        i2 = i4 + 65;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c = 0;
                                    mode3 = mode2;
                                    mode2 = mode;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                    break;
                case 2:
                    if (i4 < 26) {
                        i2 = i4 + 97;
                        c = (char) i2;
                        break;
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 27:
                                    mode = Mode.ALPHA_SHIFT;
                                    c = 0;
                                    mode3 = mode2;
                                    mode2 = mode;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c = 0;
                                    mode3 = mode2;
                                    mode2 = mode;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                    break;
                case 3:
                    if (i4 < 25) {
                        c = MIXED_CHARS[i4];
                        break;
                    } else {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != 913) {
                            switch (i4) {
                                case 25:
                                    mode2 = Mode.PUNCT;
                                    break;
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.ALPHA;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    c = 0;
                                    mode3 = mode2;
                                    mode2 = mode;
                                    break;
                            }
                        } else {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                    break;
                case 4:
                    if (i4 < 29) {
                        c = PUNCT_CHARS[i4];
                        break;
                    } else {
                        if (i4 == 29) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 == 913) {
                            sb.append((char) iArr2[i3]);
                        }
                        c = 0;
                        break;
                    }
                case 5:
                    if (i4 < 26) {
                        c = (char) (i4 + 65);
                    } else if (i4 != 26) {
                        if (i4 == 900) {
                            mode2 = Mode.ALPHA;
                            c = 0;
                            break;
                        }
                        mode2 = mode3;
                        c = 0;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i4 < 29) {
                        c = PUNCT_CHARS[i4];
                        mode2 = mode3;
                        break;
                    } else {
                        if (i4 == 29) {
                            mode2 = Mode.ALPHA;
                        } else if (i4 != 900) {
                            if (i4 == 913) {
                                sb.append((char) iArr2[i3]);
                            }
                            mode2 = mode3;
                        } else {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                        break;
                    }
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb.append(c);
            }
        }
    }

    public static int numericCompaction(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else {
                if (!(i4 == 900 || i4 == 901 || i4 == 928)) {
                    switch (i4) {
                    }
                }
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(decodeBase900toBase10(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    public static int textCompaction(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        default:
                            switch (i4) {
                            }
                        case 901:
                        case 902:
                            i = i3 - 1;
                            z = true;
                            break;
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        decodeTextCompaction(iArr2, iArr3, i2, sb);
        return i;
    }
}
