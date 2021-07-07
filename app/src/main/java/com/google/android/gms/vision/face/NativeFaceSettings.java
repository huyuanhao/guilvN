package com.google.android.gms.vision.face;

import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.vision.face.internal.client.zze;

@UsedByNative("wrapper.cc")
public class NativeFaceSettings {
    public boolean classifyEyesOpen;
    public boolean classifySmiling;
    public float confidenceThreshold;
    public int detectionType;
    public int fastDetectorAggressiveness;
    public int landmarkType;
    public int maxNumFaces;
    public int numThreads;
    public float proportionalMinFaceSize;
    public boolean trackingEnabled;

    public static NativeFaceSettings zzc(zze zze) {
        NativeFaceSettings nativeFaceSettings = new NativeFaceSettings();
        boolean z = zze.mode == 0;
        if (z) {
            nativeFaceSettings.detectionType = 0;
        } else {
            nativeFaceSettings.detectionType = 1;
        }
        if (zze.landmarkType == 1) {
            if (z) {
                nativeFaceSettings.landmarkType = 1;
            } else {
                nativeFaceSettings.landmarkType = 3;
            }
        } else if (zze.zzcn == 1) {
            nativeFaceSettings.landmarkType = 1;
        } else {
            nativeFaceSettings.landmarkType = 0;
        }
        boolean z2 = zze.trackingEnabled;
        nativeFaceSettings.trackingEnabled = z2;
        if (z2) {
            nativeFaceSettings.confidenceThreshold = 0.2f;
            nativeFaceSettings.fastDetectorAggressiveness = 1;
        } else {
            nativeFaceSettings.confidenceThreshold = 0.75f;
            nativeFaceSettings.fastDetectorAggressiveness = 0;
        }
        if (zze.zzcm) {
            nativeFaceSettings.maxNumFaces = 1;
            nativeFaceSettings.proportionalMinFaceSize = 0.35f;
        } else {
            nativeFaceSettings.maxNumFaces = 1000;
            nativeFaceSettings.proportionalMinFaceSize = 0.1f;
        }
        float f = zze.proportionalMinFaceSize;
        if (f >= 0.0f) {
            nativeFaceSettings.proportionalMinFaceSize = f;
        }
        nativeFaceSettings.numThreads = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);
        if (zze.zzcn == 1) {
            nativeFaceSettings.classifyEyesOpen = true;
            nativeFaceSettings.classifySmiling = true;
        } else {
            nativeFaceSettings.classifyEyesOpen = false;
            nativeFaceSettings.classifySmiling = false;
        }
        return nativeFaceSettings;
    }
}
