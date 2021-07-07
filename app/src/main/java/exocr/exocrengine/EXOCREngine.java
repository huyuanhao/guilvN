package exocr.exocrengine;

import android.content.Context;
import android.graphics.Bitmap;

public final class EXOCREngine {
    public static final String OooO00o = "EXOCREngine";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f23699OooO00o = false;
    public static final int OooO0O0 = 4096;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static boolean f23700OooO0O0;
    public static boolean OooO0OO;
    public static boolean OooO0Oo;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23701OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f23702OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23703OooO00o = new byte[4096];

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f23704OooO0O0;

    static {
        System.loadLibrary("exocrenginec");
    }

    public static void OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        if (i != 0) {
            f23699OooO00o = true;
        } else {
            f23699OooO00o = false;
        }
        if (i2 != 0) {
            f23700OooO0O0 = true;
        } else {
            f23700OooO0O0 = false;
        }
        if (i3 != 0) {
            OooO0OO = true;
        } else {
            OooO0OO = false;
        }
        if (i4 != 0) {
            OooO0Oo = true;
        } else {
            OooO0Oo = false;
        }
    }

    public static native int nativeCheckSignature(Context context);

    public static native int nativeDone();

    public static native float nativeGetFocusScore(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6);

    public static native Bitmap nativeGetIDCardStdImg(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int[] iArr);

    public static native Bitmap nativeGetIDCardStdImg2(byte[] bArr, int i, int i2, int i3, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    public static native Bitmap nativeGetVECardStdImg(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int[] iArr);

    public static native int nativeGetVersion(byte[] bArr);

    public static native int nativeInit(byte[] bArr);

    public static native Bitmap nativeRecoCardNV21(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, int i10);

    public static native Bitmap nativeRecoDRCardNV21(byte[] bArr, int i, int i2, int i3, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    public static native Bitmap nativeRecoDRCardStillImage(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr, int[] iArr2);

    public static native int nativeRecoIDCardBitmap(Bitmap bitmap, byte[] bArr, int i);

    public static native int nativeRecoIDCardRawdat(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5);

    public static native Bitmap nativeRecoIDCardStillImage(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr);

    public static native Bitmap nativeRecoIDCardStillImageV2(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr, int[] iArr2);

    public static native int nativeRecoItemNV21(byte[] bArr, int i, byte[] bArr2, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public static native int nativeRecoScanLineRawdata(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr2, int i9);

    public static native Bitmap nativeRecoVE2CardNV21(byte[] bArr, int i, int i2, int i3, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    public static native Bitmap nativeRecoVE2CardStillImage(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr, int[] iArr2);

    public static native int nativeRecoVECardBitmap(Bitmap bitmap, byte[] bArr, int i);

    public static native int nativeRecoVECardRawdat(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5);

    public static native Bitmap nativeRecoVECardStillImage(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr);

    public static native Bitmap nativeRecoVECardStillImageV2(Bitmap bitmap, int i, int i2, byte[] bArr, int i3, int[] iArr, int[] iArr2);

    public static native void nativeSetExtractImageMode2(int i, int i2);
}
