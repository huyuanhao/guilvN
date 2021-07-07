package com.google.zxing.datamatrix.encoder;

import com.facebook.imageutils.JfifUtil;
import com.p118pd.sdk.AbstractC9366ILlIL;
import com.p118pd.sdk.C7637o0oOo0OO;
import com.p118pd.sdk.C7967oO0oOo00;
import com.p118pd.sdk.LayoutInflater$Factory2C7167o00o0o;
import com.p118pd.sdk.Lillilli;
import com.tencent.bugly.beta.tinker.TinkerReport;

public final class ErrorCorrection {
    public static final int[] ALOG = new int[255];
    public static final int[][] FACTORS = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{175, 138, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, 12, Lillilli.OoooooO, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, TinkerReport.KEY_LOADED_EXCEPTION_DEX, 95, 9, 157, 119, 138, 45, 18, Lillilli.OoooOoo, 83, 185}, new int[]{83, Lillilli.Ooooooo, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, Lillilli.Ooooooo, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK, 79, 108, 82, 27, 174, Lillilli.OoooOoo, 172}, new int[]{52, Lillilli.OooooOO, 88, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, 109, 39, 176, 21, 155, Lillilli.ooOO, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, Lillilli.Oooooo}, new int[]{AbstractC9366ILlIL.OooO00o, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, C7637o0oOo0OO.OooO0o, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, LayoutInflater$Factory2C7167o00o0o.o0ooOoO, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, Lillilli.Oooooo, 137, 31, 19, 38, 22, 153, 247, 105, TinkerReport.KEY_APPLIED_DEXOPT_EXIST, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, 188, 237, 87, Lillilli.OooooOo, 106, 16, 147, 118, 23, 37, 90, 170, TinkerReport.KEY_APPLIED_FAIL_COST_5S_LESS, 131, 88, 120, 100, 66, 138, Lillilli.OoooOoo, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, TinkerReport.KEY_LOADED_EXCEPTION_DEX_CHECK, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, LayoutInflater$Factory2C7167o00o0o.o0ooOoO, 208, 100, 29, 175, 170, 230, 192, JfifUtil.MARKER_RST7, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, Lillilli.o0OoOo0, 37, 185, 112, 134, 230, 245, 63, Lillilli.ooOO, Lillilli.OooooOO, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, C7967oO0oOo00.Ooooo0o, 124, 86, 47, 11, 204}, new int[]{LayoutInflater$Factory2C7167o00o0o.o0ooOoO, 228, 173, 89, TinkerReport.KEY_LOADED_UNCAUGHT_EXCEPTION, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, Lillilli.ooOO, 158, 177, 68, TinkerReport.KEY_APPLIED_DEXOPT_EXIST, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, LayoutInflater$Factory2C7167o00o0o.o0ooOoO, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, AbstractC9366ILlIL.OooO00o, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, Lillilli.OoooOoo}};
    public static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    public static final int[] LOG = new int[256];
    public static final int MODULO_VALUE = 301;

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            ALOG[i2] = i;
            LOG[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    public static String createECCBlock(CharSequence charSequence, int i) {
        return createECCBlock(charSequence, 0, charSequence.length(), i);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() == symbolInfo.getDataCapacity()) {
            StringBuilder sb = new StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
            sb.append(str);
            int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
            if (interleavedBlockCount == 1) {
                sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
            } else {
                sb.setLength(sb.capacity());
                int[] iArr = new int[interleavedBlockCount];
                int[] iArr2 = new int[interleavedBlockCount];
                int[] iArr3 = new int[interleavedBlockCount];
                int i = 0;
                while (i < interleavedBlockCount) {
                    int i2 = i + 1;
                    iArr[i] = symbolInfo.getDataLengthForInterleavedBlock(i2);
                    iArr2[i] = symbolInfo.getErrorLengthForInterleavedBlock(i2);
                    iArr3[i] = 0;
                    if (i > 0) {
                        iArr3[i] = iArr3[i - 1] + iArr[i];
                    }
                    i = i2;
                }
                for (int i3 = 0; i3 < interleavedBlockCount; i3++) {
                    StringBuilder sb2 = new StringBuilder(iArr[i3]);
                    for (int i4 = i3; i4 < symbolInfo.getDataCapacity(); i4 += interleavedBlockCount) {
                        sb2.append(str.charAt(i4));
                    }
                    String createECCBlock = createECCBlock(sb2.toString(), iArr2[i3]);
                    int i5 = i3;
                    int i6 = 0;
                    while (i5 < iArr2[i3] * interleavedBlockCount) {
                        sb.setCharAt(symbolInfo.getDataCapacity() + i5, createECCBlock.charAt(i6));
                        i5 += interleavedBlockCount;
                        i6++;
                    }
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }

    public static String createECCBlock(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            } else if (iArr[i4] == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int[] iArr2 = FACTORS[i4];
            char[] cArr = new char[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                cArr[i5] = 0;
            }
            for (int i6 = i; i6 < i + i2; i6++) {
                int i7 = i3 - 1;
                int charAt = cArr[i7] ^ charSequence.charAt(i6);
                while (i7 > 0) {
                    if (charAt == 0 || iArr2[i7] == 0) {
                        cArr[i7] = cArr[i7 - 1];
                    } else {
                        char c = cArr[i7 - 1];
                        int[] iArr3 = ALOG;
                        int[] iArr4 = LOG;
                        cArr[i7] = (char) (c ^ iArr3[(iArr4[charAt] + iArr4[iArr2[i7]]) % 255]);
                    }
                    i7--;
                }
                if (charAt == 0 || iArr2[0] == 0) {
                    cArr[0] = 0;
                } else {
                    int[] iArr5 = ALOG;
                    int[] iArr6 = LOG;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[iArr2[0]]) % 255];
                }
            }
            char[] cArr2 = new char[i3];
            for (int i8 = 0; i8 < i3; i8++) {
                cArr2[i8] = cArr[(i3 - i8) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
    }
}
