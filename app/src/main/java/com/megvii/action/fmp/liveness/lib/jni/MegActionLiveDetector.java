package com.megvii.action.fmp.liveness.lib.jni;

public class MegActionLiveDetector {
    public native int getActionCount(long j);

    public native int getActionCurrentStep(long j);

    public native String getActionDeltaInfo(long j, String str, boolean z, String str2, String str3);

    public native int getActionDetectFailedType(long j);

    public native int getActionQualityErrorType(long j);

    public native long getActionTimeout(long j);

    public native int getCurrentActionIndex(long j);

    public native long getDetectTime(long j);

    public native int getSelectedAction(long j);

    public native void nativeActionDetectReset(long j);

    public native void nativeActionLiveDetect(long j, byte[] bArr, int i, int i2, int i3);

    public native void nativeActionRelease(long j);

    public native long nativeCreateActionHandle(boolean z, int i, int i2, String str, int[] iArr);

    public native boolean nativeLoadActionModel(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native void nativeResetActionQueue(long j, int[] iArr);

    public native void nativeStartActionLiveDetect(long j);

    public native void nativeStopActionLiveDetect(long j);
}
