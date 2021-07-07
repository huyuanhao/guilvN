package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;

public final class zzg extends zzm<zzh> {
    public final zze zzbm;

    public zzg(Context context, zze zze) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.zzbm = zze;
        zzq();
    }

    public final Barcode[] zza(ByteBuffer byteBuffer, zzn zzn) {
        if (!isOperational()) {
            return new Barcode[0];
        }
        try {
            return ((zzh) zzq()).zza(ObjectWrapper.wrap(byteBuffer), zzn);
        } catch (RemoteException unused) {
            return new Barcode[0];
        }
    }

    @Override // com.google.android.gms.internal.vision.zzm
    public final void zzm() throws RemoteException {
        if (isOperational()) {
            ((zzh) zzq()).zzn();
        }
    }

    public final Barcode[] zza(Bitmap bitmap, zzn zzn) {
        if (!isOperational()) {
            return new Barcode[0];
        }
        try {
            return ((zzh) zzq()).zzb(ObjectWrapper.wrap(bitmap), zzn);
        } catch (RemoteException unused) {
            return new Barcode[0];
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.vision.zzm
    public final /* synthetic */ zzh zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        zzj zzj;
        IBinder instantiate = dynamiteModule.instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (instantiate == null) {
            zzj = null;
        } else {
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            if (queryLocalInterface instanceof zzj) {
                zzj = (zzj) queryLocalInterface;
            } else {
                zzj = new zzk(instantiate);
            }
        }
        if (zzj == null) {
            return null;
        }
        return zzj.zza(ObjectWrapper.wrap(context), this.zzbm);
    }
}
