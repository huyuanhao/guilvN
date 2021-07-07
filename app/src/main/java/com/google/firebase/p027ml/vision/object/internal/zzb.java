package com.google.firebase.p027ml.vision.object.internal;

import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: com.google.firebase.ml.vision.object.internal.zzb */
public interface zzb extends IInterface {
    IObjectDetector newObjectDetector(ObjectDetectorOptionsParcel objectDetectorOptionsParcel) throws RemoteException;
}
