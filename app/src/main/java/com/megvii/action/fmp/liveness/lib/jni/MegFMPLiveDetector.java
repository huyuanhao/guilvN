package com.megvii.action.fmp.liveness.lib.jni;

public class MegFMPLiveDetector {
    public native float getProgress(long j);

    public native int getSilentCurrentStep(long j);

    public native String getSilentDeltaInfo(long j, String str, boolean z, String str2, String str3, byte[] bArr);

    public native int getSilentDetectFailedType(long j);

    public native int getSilentQualityErrorType(long j);

    public native long nativeCreateSilentHandle(String str, int i, long j);

    public native boolean nativeLoadSilentModel(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native void nativeSilentDetectReset(long j);

    public native void nativeSilentLiveDetect(long j, byte[] bArr, int i, int i2, int i3);

    public native void nativeSilentRelease(long j);

    public native void nativeStartSilentLiveDetect(long j);

    public native void nativeStopSilentLiveDetect(long j);
}
