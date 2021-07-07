package exocr.bankcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.UnsupportedEncodingException;

public final class EXBankCardReco {
    public static final String OooO00o = "EXBankCardReco";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f23670OooO00o;

    static {
        System.loadLibrary("exbankcardrec");
    }

    public static boolean OooO00o(byte[] bArr, int i, EXBankCardInfo eXBankCardInfo) {
        if (eXBankCardInfo == null) {
            return false;
        }
        byte[] bArr2 = new byte[72];
        if (i < 70) {
            return false;
        }
        eXBankCardInfo.o0OOO0o = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
        int i2 = 4;
        eXBankCardInfo.o0Oo0oo = ((bArr[2] & 255) << 8) + (bArr[3] & 255);
        int i3 = 0;
        while (i3 < 64) {
            bArr2[i3] = bArr[i2];
            i3++;
            i2++;
        }
        try {
            eXBankCardInfo.f23668o0ooOOo = new String(bArr2, "GBK");
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] & 255) << 8) + (bArr[i4] & 255);
            int i7 = 0;
            while (i5 < i - 9) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                int i10 = ((bArr[i5] & 255) << 8) + (bArr[i8] & 255);
                int i11 = i9 + 1;
                int i12 = i11 + 1;
                int i13 = ((bArr[i9] & 255) << 8) + (bArr[i11] & 255);
                int i14 = i12 + 1;
                int i15 = i14 + 1;
                int i16 = ((bArr[i12] & 255) << 8) + (bArr[i14] & 255);
                int i17 = i15 + 1;
                int i18 = i17 + 1;
                int i19 = ((bArr[i15] & 255) << 8) + (bArr[i17] & 255);
                int i20 = i18 + 1;
                int i21 = ((bArr[i18] & 255) << 8) + (bArr[i20] & 255);
                eXBankCardInfo.f23662OooO00o[i7] = (char) i10;
                eXBankCardInfo.f23663OooO00o[i7] = new Rect(i13, i16, i19 + i13, i21 + i16);
                i7++;
                i5 = i20 + 1;
            }
            eXBankCardInfo.f23662OooO00o[i7] = 0;
            eXBankCardInfo.o00oO0O = i7;
            if (EXBankCardInfo.OooO0O0) {
                eXBankCardInfo.f23669o0ooOoO = new String(eXBankCardInfo.f23662OooO00o, 0, eXBankCardInfo.o00oO0O);
            } else {
                eXBankCardInfo.f23669o0ooOoO = new String(eXBankCardInfo.f23662OooO00o, 0, eXBankCardInfo.o00oO0O).replace(" ", "");
            }
            int i22 = eXBankCardInfo.o00oO0O;
            if (i22 < 10 || i22 > 24 || i7 != i6) {
                return false;
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static boolean OooO0O0(byte[] bArr, int i, EXBankCardInfo eXBankCardInfo) {
        if (eXBankCardInfo == null) {
            return false;
        }
        byte[] bArr2 = new byte[72];
        if (i < 156) {
            return false;
        }
        eXBankCardInfo.o0OOO0o = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
        int i2 = 4;
        eXBankCardInfo.o0Oo0oo = ((bArr[2] & 255) << 8) + (bArr[3] & 255);
        int i3 = 0;
        int i4 = 0;
        while (i3 < 64) {
            int i5 = i2 + 1;
            bArr2[i3] = bArr[i2];
            if (bArr2[i3] != 0) {
                i4 = i3;
            }
            i3++;
            i2 = i5;
        }
        try {
            eXBankCardInfo.f23668o0ooOOo = new String(bArr2, 0, i4 + 1, "GBK");
            int i6 = 0;
            int i7 = 0;
            while (i6 < 32) {
                int i8 = i2 + 1;
                bArr2[i6] = bArr[i2];
                if (bArr2[i6] != 0) {
                    i7 = i6;
                }
                i6++;
                i2 = i8;
            }
            eXBankCardInfo.f23666o0OOO0o = new String(bArr2, 0, i7 + 1, "GBK");
            int i9 = 0;
            int i10 = 0;
            while (i9 < 32) {
                int i11 = i2 + 1;
                bArr2[i9] = bArr[i2];
                if (bArr2[i9] != 0) {
                    i10 = i9;
                }
                i9++;
                i2 = i11;
            }
            eXBankCardInfo.f23667o0Oo0oo = new String(bArr2, 0, i10 + 1, "GBK");
            int i12 = i2 + 1;
            eXBankCardInfo.o0ooOoO = bArr[i2];
            for (int i13 = 1; i13 < 8; i13++) {
                i12++;
            }
            int i14 = i12 + 1;
            int i15 = i14 + 1;
            int i16 = ((bArr[i12] & 255) << 8) + (bArr[i14] & 255);
            eXBankCardInfo.o0ooOO0 = i16;
            int i17 = i15 + 1;
            int i18 = i17 + 1;
            int i19 = ((bArr[i15] & 255) << 8) + (bArr[i17] & 255);
            eXBankCardInfo.o0ooOOo = i19;
            if (i16 == 0 || i19 == 0) {
                eXBankCardInfo.o0OO00O = "0/0";
            } else {
                int i20 = i19 - 2000;
                if (i16 > 9 && i20 > 9) {
                    eXBankCardInfo.o0OO00O = eXBankCardInfo.o0ooOO0 + C8932ooOOO0o.OooO0OO + i20;
                } else if (eXBankCardInfo.o0ooOO0 <= 9 && i20 > 9) {
                    eXBankCardInfo.o0OO00O = "0" + eXBankCardInfo.o0ooOO0 + C8932ooOOO0o.OooO0OO + i20;
                } else if (eXBankCardInfo.o0ooOO0 > 9 && i20 <= 9) {
                    eXBankCardInfo.o0OO00O = eXBankCardInfo.o0ooOO0 + "/0" + i20;
                } else if (eXBankCardInfo.o0ooOO0 <= 9 && i20 <= 9) {
                    eXBankCardInfo.o0OO00O = "0" + eXBankCardInfo.o0ooOO0 + "/0" + i20;
                }
            }
            int i21 = i18 + 1;
            int i22 = i21 + 1;
            int i23 = ((bArr[i18] & 255) << 8) + (bArr[i21] & 255);
            int i24 = 0;
            while (i22 < i - 9) {
                int i25 = i22 + 1;
                int i26 = i25 + 1;
                int i27 = ((bArr[i22] & 255) << 8) + (bArr[i25] & 255);
                int i28 = i26 + 1;
                int i29 = i28 + 1;
                int i30 = ((bArr[i26] & 255) << 8) + (bArr[i28] & 255);
                int i31 = i29 + 1;
                int i32 = i31 + 1;
                int i33 = ((bArr[i29] & 255) << 8) + (bArr[i31] & 255);
                int i34 = i32 + 1;
                int i35 = i34 + 1;
                int i36 = ((bArr[i32] & 255) << 8) + (bArr[i34] & 255);
                int i37 = i35 + 1;
                int i38 = ((bArr[i35] & 255) << 8) + (bArr[i37] & 255);
                eXBankCardInfo.f23662OooO00o[i24] = (char) i27;
                eXBankCardInfo.f23663OooO00o[i24] = new Rect(i30, i33, i36 + i30, i38 + i33);
                i24++;
                i22 = i37 + 1;
            }
            eXBankCardInfo.f23662OooO00o[i24] = 0;
            eXBankCardInfo.o00oO0O = i24;
            if (BankManager.OooO00o().m21985OooO00o()) {
                eXBankCardInfo.f23669o0ooOoO = new String(eXBankCardInfo.f23662OooO00o, 0, eXBankCardInfo.o00oO0O);
            } else {
                eXBankCardInfo.f23669o0ooOoO = new String(eXBankCardInfo.f23662OooO00o, 0, eXBankCardInfo.o00oO0O).replace(" ", "");
            }
            int i39 = eXBankCardInfo.o00oO0O;
            if (i39 < 10 || i39 > 24 || i24 != i23) {
                return false;
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static native int nativeCheckSignature(Context context);

    public static native int nativeDone();

    public static native float nativeFocusScore(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    public static native int nativeGetVersion(byte[] bArr);

    public static native int nativeInit(byte[] bArr);

    public static native int nativeQueryBankInfo(byte[] bArr, int i, byte[] bArr2, int i2);

    public static native int nativeRecoBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, byte[] bArr, int i5);

    public static native Bitmap nativeRecoNV21ST(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, byte[] bArr2, int i11, int[] iArr);

    public static native int nativeRecoRawdat(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr2, int i8);

    public static native Bitmap nativeRecoStillImage(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr);

    public static native Bitmap nativeRecoStillImage2(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr, int[] iArr2);

    public static boolean OooO00o(byte[] bArr, int i, int i2, int i3, Rect rect, EXBankCardInfo eXBankCardInfo) {
        if (eXBankCardInfo.o00oO0O < 1) {
            return false;
        }
        Rect rect2 = new Rect(eXBankCardInfo.f23663OooO00o[0]);
        int width = eXBankCardInfo.f23663OooO00o[0].width();
        int height = eXBankCardInfo.f23663OooO00o[0].height();
        int i4 = 1;
        for (int i5 = 1; i5 < eXBankCardInfo.o00oO0O; i5++) {
            rect2.union(eXBankCardInfo.f23663OooO00o[i5]);
            if (eXBankCardInfo.f23662OooO00o[i5] != ' ') {
                width += eXBankCardInfo.f23663OooO00o[i5].width();
                height += eXBankCardInfo.f23663OooO00o[i5].height();
                i4++;
            }
        }
        int i6 = width / i4;
        int i7 = height / i4;
        rect2.offset(rect.left, rect.top);
        int i8 = rect2.top - i7;
        rect2.top = i8;
        if (i8 < 0) {
            rect2.top = 0;
        }
        int i9 = rect2.bottom + i7;
        rect2.bottom = i9;
        if (i9 >= i2) {
            rect2.bottom = i2 - 1;
        }
        int i10 = rect2.left - i6;
        rect2.left = i10;
        if (i10 < 0) {
            rect2.left = 0;
        }
        int i11 = rect2.right + i6;
        rect2.right = i11;
        if (i11 >= i) {
            rect2.right = i - 1;
        }
        for (int i12 = 0; i12 < eXBankCardInfo.o00oO0O; i12++) {
            eXBankCardInfo.f23663OooO00o[i12].offset(rect.left - rect2.left, rect.top - rect2.top);
        }
        Bitmap bitmap = eXBankCardInfo.f23661OooO00o;
        if (bitmap != null) {
            bitmap.recycle();
        }
        eXBankCardInfo.f23661OooO00o = CardScanner.OooO00o(bArr, i, i2, i3, rect2, 1);
        Bitmap bitmap2 = eXBankCardInfo.f23665OooO0O0;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        eXBankCardInfo.f23665OooO0O0 = CardScanner.OooO00o(bArr, i, i2, i3, rect, 1);
        return true;
    }
}
