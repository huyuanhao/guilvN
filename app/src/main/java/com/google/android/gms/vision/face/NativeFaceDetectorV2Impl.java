package com.google.android.gms.vision.face;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.vision.zzbl;
import com.google.android.gms.internal.vision.zzbo;
import com.google.android.gms.internal.vision.zzbq;
import com.google.android.gms.internal.vision.zzca;
import com.google.android.gms.internal.vision.zzcc;
import com.google.android.gms.internal.vision.zzch;
import com.google.android.gms.internal.vision.zzck;
import com.google.android.gms.internal.vision.zzfy;
import com.google.android.gms.internal.vision.zzjx;
import com.google.android.gms.internal.vision.zzkf;
import com.google.android.gms.internal.vision.zzl;
import com.google.android.gms.internal.vision.zzn;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.face.internal.client.zza;
import com.google.android.gms.vision.face.internal.client.zze;
import com.google.android.gms.vision.face.internal.client.zzh;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class NativeFaceDetectorV2Impl extends zzh {
    public static final GmsLogger zzcs = new GmsLogger("NativeFaceDetectorV2Imp", "");
    public final long zzct;
    public final DynamiteClearcutLogger zzcu;
    public final zzca.zzd zzcv;
    public final FaceDetectorV2Jni zzcw;

    /* renamed from: com.google.android.gms.vision.face.NativeFaceDetectorV2Impl$1 */
    public static /* synthetic */ class C09621 {
        public static final /* synthetic */ int[] zzcx;
        public static final /* synthetic */ int[] zzcy;

        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(66:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Can't wrap try/catch for region: R(68:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
        /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00ed */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x010b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x011f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0129 */
        static {
            /*
            // Method dump skipped, instructions count: 308
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.NativeFaceDetectorV2Impl.C09621.<clinit>():void");
        }
    }

    public NativeFaceDetectorV2Impl(Context context, DynamiteClearcutLogger dynamiteClearcutLogger, File file, zze zze, FaceDetectorV2Jni faceDetectorV2Jni) {
        zzca.zzg zzg = (zzca.zzg) ((zzfy) zzca.zzg.zzbo().zzj("models").zzfg());
        zzca.zzd.zza zzf = zzca.zzd.zzbi().zzb((zzca.zze) ((zzfy) zzca.zze.zzbk().zzh(zzg).zzi(zzg).zzj(zzg).zzfg())).zzb((zzca.zza) ((zzfy) zzca.zza.zzaw().zzc(zzg).zzd(zzg).zzfg())).zzb((zzca.zzf) ((zzfy) zzca.zzf.zzbm().zzo(zzg).zzp(zzg).zzq(zzg).zzr(zzg).zzfg())).zzd(zze.zzcm).zze(zze.trackingEnabled).zze(zze.proportionalMinFaceSize).zzf(true);
        int i = zze.mode;
        if (i == 0) {
            zzf.zzb(zzck.FAST);
        } else if (i == 1) {
            zzf.zzb(zzck.ACCURATE);
        } else if (i == 2) {
            zzf.zzb(zzck.SELFIE);
        }
        int i2 = zze.landmarkType;
        if (i2 == 0) {
            zzf.zzb(zzch.NO_LANDMARK);
        } else if (i2 == 1) {
            zzf.zzb(zzch.ALL_LANDMARKS);
        } else if (i2 == 2) {
            zzf.zzb(zzch.CONTOUR_LANDMARKS);
        }
        int i3 = zze.zzcn;
        if (i3 == 0) {
            zzf.zzb(zzcc.NO_CLASSIFICATION);
        } else if (i3 == 1) {
            zzf.zzb(zzcc.ALL_CLASSIFICATIONS);
        }
        zzca.zzd zzd = (zzca.zzd) ((zzfy) zzf.zzfg());
        this.zzcv = zzd;
        this.zzct = faceDetectorV2Jni.zza(zzd, context.getAssets());
        this.zzcu = dynamiteClearcutLogger;
        this.zzcw = faceDetectorV2Jni;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final FaceParcel[] zzc(IObjectWrapper iObjectWrapper, zzn zzn) throws RemoteException {
        zzbq zzbq;
        zzca.zzc zzc;
        float f;
        float f2;
        float f3;
        int i;
        zzcc zzcc;
        zzkf zzkf;
        LandmarkParcel[] landmarkParcelArr;
        zzch zzch;
        zza[] zzaArr;
        int i2;
        int i3;
        zzcc zzcc2;
        zzkf zzkf2;
        List<zzjx.zze> list;
        int i4;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ObjectWrapper.unwrap(iObjectWrapper);
            zzbo.zza zzj = zzbo.zzai().zzi(zzn.width).zzj(zzn.height);
            int i5 = zzn.rotation;
            if (i5 == 0) {
                zzbq = zzbq.ROTATION_0;
            } else if (i5 == 1) {
                zzbq = zzbq.ROTATION_270;
            } else if (i5 == 2) {
                zzbq = zzbq.ROTATION_180;
            } else if (i5 == 3) {
                zzbq = zzbq.ROTATION_90;
            } else {
                throw new IllegalArgumentException("Unsupported rotation degree.");
            }
            zzbo.zza zzb = zzj.zzb(zzbq).zzb(zzbl.NV21);
            if (zzn.zzat > 0) {
                zzb.zzc(zzn.zzat);
            }
            zzbo zzbo = (zzbo) ((zzfy) zzb.zzfg());
            if (byteBuffer.isDirect()) {
                zzc = this.zzcw.zza(this.zzct, byteBuffer, zzbo);
            } else if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                zzc = this.zzcw.zza(this.zzct, bArr, zzbo);
            } else {
                zzc = this.zzcw.zza(this.zzct, byteBuffer.array(), zzbo);
            }
            zzcc zzbh = this.zzcv.zzbh();
            zzch zzbg = this.zzcv.zzbg();
            zzkf zzbe = zzc.zzbe();
            int zzip = zzbe.zzip();
            FaceParcel[] faceParcelArr = new FaceParcel[zzip];
            int i6 = 0;
            while (i6 < zzbe.zzip()) {
                zzjx zzcc3 = zzbe.zzcc(i6);
                zzjx.zzb zzhw = zzcc3.zzhw();
                float zzig = zzhw.zzig() + ((zzhw.zzii() - zzhw.zzig()) / 2.0f);
                float zzih = zzhw.zzih() + ((zzhw.zzij() - zzhw.zzih()) / 2.0f);
                float zzii = zzhw.zzii() - zzhw.zzig();
                float zzij = zzhw.zzij() - zzhw.zzih();
                float f4 = -1.0f;
                if (zzbh == zzcc.ALL_CLASSIFICATIONS) {
                    float f5 = -1.0f;
                    float f6 = -1.0f;
                    for (zzjx.zza zza : zzcc3.zzib()) {
                        if (zza.getName().equals("joy")) {
                            f6 = zza.getConfidence();
                        } else if (zza.getName().equals("left_eye_closed")) {
                            f4 = 1.0f - zza.getConfidence();
                        } else if (zza.getName().equals("right_eye_closed")) {
                            f5 = 1.0f - zza.getConfidence();
                        }
                    }
                    f3 = f4;
                    f2 = f5;
                    f = f6;
                } else {
                    f3 = -1.0f;
                    f2 = -1.0f;
                    f = -1.0f;
                }
                if (zzbg == zzch.ALL_LANDMARKS) {
                    List<zzjx.zze> zzhx = zzcc3.zzhx();
                    ArrayList arrayList = new ArrayList();
                    int i7 = 0;
                    while (i7 < zzhx.size()) {
                        zzjx.zze zze = zzhx.get(i7);
                        zzjx.zze.zzb zzin = zze.zzin();
                        switch (C09621.zzcx[zzin.ordinal()]) {
                            case 1:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 4;
                                break;
                            case 2:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 10;
                                break;
                            case 3:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 6;
                                break;
                            case 4:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 0;
                                break;
                            case 5:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 5;
                                break;
                            case 6:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 11;
                                break;
                            case 7:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 3;
                                break;
                            case 8:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 9;
                                break;
                            case 9:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 1;
                                break;
                            case 10:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 7;
                                break;
                            case 11:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 2;
                                break;
                            case 12:
                                list = zzhx;
                                zzkf2 = zzbe;
                                zzcc2 = zzbh;
                                i3 = zzip;
                                i4 = 8;
                                break;
                            default:
                                list = zzhx;
                                GmsLogger gmsLogger = zzcs;
                                zzkf2 = zzbe;
                                String valueOf = String.valueOf(zzin);
                                zzcc2 = zzbh;
                                i3 = zzip;
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                                sb.append("Unknown landmark type: ");
                                sb.append(valueOf);
                                gmsLogger.mo10801d("NativeFaceDetectorV2Imp", sb.toString());
                                i4 = -1;
                                break;
                        }
                        if (i4 >= 0) {
                            arrayList.add(new LandmarkParcel(-1, zze.getX(), zze.getY(), i4));
                        }
                        i7++;
                        zzhx = list;
                        zzbe = zzkf2;
                        zzbh = zzcc2;
                        zzip = i3;
                    }
                    zzkf = zzbe;
                    zzcc = zzbh;
                    i = zzip;
                    landmarkParcelArr = (LandmarkParcel[]) arrayList.toArray(new LandmarkParcel[0]);
                } else {
                    zzkf = zzbe;
                    zzcc = zzbh;
                    i = zzip;
                    landmarkParcelArr = new LandmarkParcel[0];
                }
                if (zzbg == zzch.CONTOUR_LANDMARKS) {
                    List list2 = (List) zzcc3.zzc(zzca.zziv);
                    zzaArr = new zza[list2.size()];
                    int i8 = 0;
                    while (i8 < list2.size()) {
                        zzca.zzb zzb2 = (zzca.zzb) list2.get(i8);
                        PointF[] pointFArr = new PointF[zzb2.zzba()];
                        int i9 = 0;
                        while (i9 < zzb2.zzba()) {
                            zzca.zzb.C4900zzb zzb3 = zzb2.zzaz().get(i9);
                            pointFArr[i9] = new PointF(zzb3.getX(), zzb3.getY());
                            i9++;
                            list2 = list2;
                            zzbg = zzbg;
                        }
                        zzca.zzb.zzc zzay = zzb2.zzay();
                        switch (C09621.zzcy[zzay.ordinal()]) {
                            case 1:
                                i2 = 1;
                                break;
                            case 2:
                                i2 = 2;
                                break;
                            case 3:
                                i2 = 3;
                                break;
                            case 4:
                                i2 = 4;
                                break;
                            case 5:
                                i2 = 5;
                                break;
                            case 6:
                                i2 = 6;
                                break;
                            case 7:
                                i2 = 7;
                                break;
                            case 8:
                                i2 = 8;
                                break;
                            case 9:
                                i2 = 9;
                                break;
                            case 10:
                                i2 = 10;
                                break;
                            case 11:
                                i2 = 11;
                                break;
                            case 12:
                                i2 = 12;
                                break;
                            case 13:
                                i2 = 13;
                                break;
                            case 14:
                            case 15:
                                GmsLogger gmsLogger2 = zzcs;
                                String valueOf2 = String.valueOf(zzay);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
                                sb2.append("Intentionally ignore contour type: ");
                                sb2.append(valueOf2);
                                gmsLogger2.mo10801d("NativeFaceDetectorV2Imp", sb2.toString());
                                i2 = -1;
                                break;
                            default:
                                GmsLogger gmsLogger3 = zzcs;
                                String valueOf3 = String.valueOf(zzay);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
                                sb3.append("Unknown contour type: ");
                                sb3.append(valueOf3);
                                gmsLogger3.mo10803e("NativeFaceDetectorV2Imp", sb3.toString());
                                i2 = -1;
                                break;
                        }
                        zzaArr[i8] = new zza(pointFArr, i2);
                        i8++;
                        list2 = list2;
                        zzbg = zzbg;
                    }
                    zzch = zzbg;
                } else {
                    zzch = zzbg;
                    zzaArr = new zza[0];
                }
                faceParcelArr[i6] = new FaceParcel(3, (int) zzcc3.zzic(), zzig, zzih, zzii, zzij, zzcc3.zzhz(), -zzcc3.zzhy(), zzcc3.zzia(), landmarkParcelArr, f3, f2, f, zzaArr);
                i6++;
                zzbe = zzkf;
                zzbh = zzcc;
                zzip = i;
                zzbg = zzch;
            }
            DynamiteClearcutLogger dynamiteClearcutLogger = this.zzcu;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (zzn.f1002id <= 2 || zzip != 0) {
                dynamiteClearcutLogger.zza(3, zzl.zza(zzn, faceParcelArr, null, elapsedRealtime2));
            }
            return faceParcelArr;
        } catch (Exception e) {
            zzcs.mo10804e("NativeFaceDetectorV2Imp", "Native face detection v2 failed", e);
            return new FaceParcel[0];
        }
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final boolean zzd(int i) throws RemoteException {
        return true;
    }

    @Override // com.google.android.gms.vision.face.internal.client.zzg
    public final void zzn() throws RemoteException {
        this.zzcw.zza(this.zzct);
    }
}
