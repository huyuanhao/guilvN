package com.google.android.gms.vision.face;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzl;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzh;
import java.io.File;
import java.nio.ByteBuffer;

public class NativeFaceDetectorImpl extends zzh {
    public final Context mContext;
    public final ByteBuffer zzcq;
    public final DynamiteClearcutLogger zzcr;

    public NativeFaceDetectorImpl(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze) {
        this.zzcq = initDetectorJni(NativeFaceSettings.zzc(zze), new File(file, "models").toString());
        this.mContext = context;
        this.zzcr = dynamiteClearcutLogger;
    }

    public static native FaceParcel[] detectFacesJni(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    public static native FaceParcel[] detectFacesJni(ByteBuffer byteBuffer, byte[] bArr, int i, int i2, int i3);

    public static native void finalizeDetectorJni(ByteBuffer byteBuffer);

    public static native ByteBuffer initDetectorJni(NativeFaceSettings nativeFaceSettings, String str);

    public static native boolean trackSingleFaceJni(ByteBuffer byteBuffer, int i);

    public static native boolean validateModelFilesJni(NativeFaceSettings nativeFaceSettings, String str);

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final FaceParcel[] zzc(IObjectWrapper iObjectWrapper, zzn zzn) throws RemoteException {
        FaceParcel[] faceParcelArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper);
            if (byteBuffer.isDirect()) {
                faceParcelArr = detectFacesJni(this.zzcq, byteBuffer, zzn.width, zzn.height, zzn.rotation);
            } else if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
                byte[] bArr = new byte[(zzn.width * zzn.height)];
                byteBuffer.get(bArr);
                faceParcelArr = detectFacesJni(this.zzcq, bArr, zzn.width, zzn.height, zzn.rotation);
            } else {
                faceParcelArr = detectFacesJni(this.zzcq, byteBuffer.array(), zzn.width, zzn.height, zzn.rotation);
            }
            DynamiteClearcutLogger dynamiteClearcutLogger = this.zzcr;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (zzn.f1002id <= 2 || faceParcelArr.length != 0) {
                dynamiteClearcutLogger.zza(3, zzl.zza(zzn, faceParcelArr, null, elapsedRealtime2));
            }
            return faceParcelArr;
        } catch (Exception unused) {
            return new FaceParcel[0];
        }
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final boolean zzd(int i) throws RemoteException {
        return trackSingleFaceJni(this.zzcq, i);
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final void zzn() throws RemoteException {
        finalizeDetectorJni(this.zzcq);
    }
}
