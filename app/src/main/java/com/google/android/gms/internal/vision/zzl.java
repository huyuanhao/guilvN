package com.google.android.gms.internal.vision;

import androidx.annotation.Nullable;
import com.google.android.gms.vision.clearcut.LogUtils;
import com.google.android.gms.vision.face.internal.client.FaceParcel;

public final class zzl {
    public static zzdu zza(zzn zzn, FaceParcel[] faceParcelArr, @Nullable String str, long j) {
        zzdu zza = LogUtils.zza(j, faceParcelArr.length);
        zza.zzqe.zzpi = new zzdq();
        zza.zzqe.zzpi.zzpn = Long.valueOf((long) zzn.height);
        zza.zzqe.zzpi.zzpm = Long.valueOf((long) zzn.width);
        zza.zzqe.zzpi.zzpo = Long.valueOf((long) zzn.f1002id);
        zza.zzqe.zzpi.zzpp = Long.valueOf(zzn.zzat);
        zzdm zzdm = zza.zzqe.zzpk[0];
        zzdm.name = "face";
        int length = faceParcelArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            FaceParcel faceParcel = faceParcelArr[i];
            zzdt zzdt = new zzdt();
            int i3 = i2 + 1;
            zzdm.zzov[i2] = zzdt;
            zzdk zzdk = new zzdk();
            zzdt.zzpy = zzdk;
            zzdk.zzoh = new zzds[4];
            for (int i4 = 0; i4 < 4; i4++) {
                zzdt.zzpy.zzoh[i4] = new zzds();
            }
            zzdt.zzpy.zzoh[0].zzpv = Integer.valueOf((int) (faceParcel.centerX - (faceParcel.width / 2.0f)));
            zzdt.zzpy.zzoh[0].zzpw = Integer.valueOf((int) (faceParcel.centerY - (faceParcel.height / 2.0f)));
            zzds[] zzdsArr = zzdt.zzpy.zzoh;
            zzdsArr[1].zzpv = Integer.valueOf((int) (((float) zzdsArr[0].zzpv.intValue()) + faceParcel.width));
            zzds[] zzdsArr2 = zzdt.zzpy.zzoh;
            zzdsArr2[1].zzpw = zzdsArr2[0].zzpw;
            zzdsArr2[2].zzpv = Integer.valueOf((int) (((float) zzdsArr2[0].zzpv.intValue()) + faceParcel.width));
            zzds[] zzdsArr3 = zzdt.zzpy.zzoh;
            zzdsArr3[2].zzpw = Integer.valueOf((int) (((float) zzdsArr3[0].zzpw.intValue()) + faceParcel.height));
            zzds[] zzdsArr4 = zzdt.zzpy.zzoh;
            zzdsArr4[3].zzpv = zzdsArr4[0].zzpv;
            zzdsArr4[3].zzpw = Integer.valueOf((int) (((float) zzdsArr4[0].zzpw.intValue()) + faceParcel.height));
            zzdt.zzpz = Integer.valueOf(faceParcel.f1005id);
            zzdo zzdo = new zzdo();
            zzdt.zzqa = zzdo;
            zzdo.zzpf = Float.valueOf(faceParcel.zzdb);
            zzdt.zzqa.zzpg = Float.valueOf(faceParcel.zzdc);
            zzdt.zzqa.zzph = Float.valueOf(faceParcel.zzdd);
            zzdt.zzqa.zzpc = Float.valueOf(faceParcel.zzcg);
            zzdt.zzqa.zzpd = Float.valueOf(faceParcel.zzch);
            zzdt.zzqa.zzpe = Float.valueOf(faceParcel.zzci);
            i++;
            i2 = i3;
        }
        return zza;
    }
}
