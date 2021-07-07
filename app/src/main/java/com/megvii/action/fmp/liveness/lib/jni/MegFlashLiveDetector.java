package com.megvii.action.fmp.liveness.lib.jni;

public class MegFlashLiveDetector {
    public native int getFlashCurrentStep(long j);

    public native String getFlashDeltaInfo(long j, String str, boolean z, String str2, String str3, byte[] bArr);

    public native int getFlashDetectFailedType(long j);

    public native int getFlashQualityErrorType(long j);

    public native float getProgress(long j);

    public native long nativeCreateFlashHandle(String str, int i, long j, long j2, float f, String str2, float f2, float f3, String str3);

    public native void nativeFlashDetectReset(long j);

    public native void nativeFlashLiveDetect(long j, byte[] bArr, int i, int i2, int i3, boolean z, float f, boolean z2);

    public native void nativeFlashRelease(long j);

    public native void nativeFlashSetConfig(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13);

    public native boolean nativeLoadFlashModel(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native void nativeStartFlashLiveDetect(long j);

    public native void nativeStopFlashLiveDetect(long j);
}
