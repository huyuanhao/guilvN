package com.google.android.gms.vision.face;

import android.content.res.AssetManager;
import android.os.RemoteException;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.vision.zzbo;
import com.google.android.gms.internal.vision.zzca;
import com.google.android.gms.internal.vision.zzfk;
import com.google.android.gms.internal.vision.zzgf;
import com.google.android.gms.vision.C0960L;
import java.nio.ByteBuffer;

public class FaceDetectorV2Jni {
    public final zzfk zzco;

    public FaceDetectorV2Jni() {
        zzfk zzej = zzfk.zzej();
        this.zzco = zzej;
        zzej.zza(zzca.zziv);
    }

    @Keep
    private native void closeDetectorJni(long j);

    @Keep
    private native byte[] detectFacesImageByteArrayJni(long j, byte[] bArr, byte[] bArr2);

    @Keep
    private native byte[] detectFacesImageByteBufferJni(long j, ByteBuffer byteBuffer, byte[] bArr);

    @Keep
    private native long initDetectorJni(byte[] bArr, AssetManager assetManager);

    public final long zza(zzca.zzd zzd, AssetManager assetManager) {
        C0960L.zza("FaceDetectorV2Jni", "initialize.start()");
        long initDetectorJni = initDetectorJni(zzd.toByteArray(), assetManager);
        C0960L.zza("FaceDetectorV2Jni", "initialize.end()");
        return initDetectorJni;
    }

    @Nullable
    public final zzca.zzc zza(long j, ByteBuffer byteBuffer, zzbo zzbo) throws RemoteException {
        C0960L.zza("FaceDetectorV2Jni", "detectFacesImageByteBuffer.start()");
        zzca.zzc zzc = null;
        try {
            byte[] detectFacesImageByteBufferJni = detectFacesImageByteBufferJni(j, byteBuffer, zzbo.toByteArray());
            if (detectFacesImageByteBufferJni != null && detectFacesImageByteBufferJni.length > 0) {
                zzc = zzca.zzc.zza(detectFacesImageByteBufferJni, this.zzco);
            }
        } catch (zzgf e) {
            Object[] objArr = new Object[1];
            String valueOf = String.valueOf(e.getMessage());
            objArr[0] = valueOf.length() != 0 ? "detectFacesImageByteBuffer failed to parse result: ".concat(valueOf) : new String("detectFacesImageByteBuffer failed to parse result: ");
            C0960L.zzc("FaceDetectorV2Jni", objArr);
        }
        C0960L.zza("FaceDetectorV2Jni", "detectFacesImageByteBuffer.end()");
        return zzc;
    }

    @Nullable
    public final zzca.zzc zza(long j, byte[] bArr, zzbo zzbo) throws RemoteException {
        C0960L.zza("FaceDetectorV2Jni", "detectFacesImageByteArray.start()");
        zzca.zzc zzc = null;
        try {
            byte[] detectFacesImageByteArrayJni = detectFacesImageByteArrayJni(j, bArr, zzbo.toByteArray());
            if (detectFacesImageByteArrayJni != null && detectFacesImageByteArrayJni.length > 0) {
                zzc = zzca.zzc.zza(detectFacesImageByteArrayJni, this.zzco);
            }
        } catch (zzgf e) {
            Object[] objArr = new Object[1];
            String valueOf = String.valueOf(e.getMessage());
            objArr[0] = valueOf.length() != 0 ? "detectFacesImageByteArray failed to parse result: ".concat(valueOf) : new String("detectFacesImageByteArray failed to parse result: ");
            C0960L.zzc("FaceDetectorV2Jni", objArr);
        }
        C0960L.zza("FaceDetectorV2Jni", "detectFacesImageByteArray.end()");
        return zzc;
    }

    public final void zza(long j) throws RemoteException {
        C0960L.zza("FaceDetectorV2Jni", "closeDetector.start()");
        closeDetectorJni(j);
        C0960L.zza("FaceDetectorV2Jni", "closeDetector.end()");
    }
}
