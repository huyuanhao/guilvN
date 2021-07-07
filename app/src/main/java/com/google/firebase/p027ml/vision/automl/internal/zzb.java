package com.google.firebase.p027ml.vision.automl.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: com.google.firebase.ml.vision.automl.internal.zzb */
public interface zzb extends IInterface {
    IOnDeviceAutoMLImageLabeler newOnDeviceAutoMLImageLabeler(IObjectWrapper iObjectWrapper, OnDeviceAutoMLImageLabelerOptionsParcel onDeviceAutoMLImageLabelerOptionsParcel) throws RemoteException;
}
