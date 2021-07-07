package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzak extends zzm<zzaa> {
    public final zzal zzfa;

    public zzak(Context context, zzal zzal) {
        super(context, "TextNativeHandle", "text");
        this.zzfa = zzal;
        zzq();
    }

    public final zzae[] zza(Bitmap bitmap, zzn zzn, zzag zzag) {
        if (!isOperational()) {
            return new zzae[0];
        }
        try {
            return ((zzaa) zzq()).zza(ObjectWrapper.wrap(bitmap), zzn, zzag);
        } catch (RemoteException unused) {
            return new zzae[0];
        }
    }

    @Override // com.google.android.gms.internal.vision.zzm
    public final void zzm() throws RemoteException {
        ((zzaa) zzq()).zzs();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.vision.zzm
    public final /* synthetic */ zzaa zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        zzac zzac;
        IBinder instantiate = dynamiteModule.instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        if (instantiate == null) {
            zzac = null;
        } else {
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            if (queryLocalInterface instanceof zzac) {
                zzac = (zzac) queryLocalInterface;
            } else {
                zzac = new zzad(instantiate);
            }
        }
        if (zzac == null) {
            return null;
        }
        return zzac.zza(ObjectWrapper.wrap(context), this.zzfa);
    }
}
