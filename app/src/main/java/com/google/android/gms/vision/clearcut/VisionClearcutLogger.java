package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.internal.vision.zzct;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.internal.vision.zzjt;
import com.google.android.gms.vision.C0960L;

@Keep
public class VisionClearcutLogger {
    public final ClearcutLogger zzbw;
    public boolean zzbx = true;

    public VisionClearcutLogger(Context context) {
        this.zzbw = new ClearcutLogger(context, "VISION", null);
    }

    public final void zzb(int i, zzdu zzdu) {
        int zzeq = zzdu.zzeq();
        byte[] bArr = new byte[zzeq];
        zzjt.zza(zzdu, bArr, 0, zzeq);
        if (i < 0 || i > 3) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Illegal event code: ");
            sb.append(i);
            String sb2 = sb.toString();
            Object[] objArr = new Object[0];
            if (C0960L.isLoggable(4)) {
                Log.i("Vision", String.format(sb2, objArr));
                return;
            }
            return;
        }
        try {
            if (this.zzbx) {
                this.zzbw.newEvent(bArr).setEventCode(i).log();
                return;
            }
            zzdu zzdu2 = new zzdu();
            try {
                zzjt.zza(zzdu2, bArr);
                C0960L.zzc("Would have logged:\n%s", zzdu2.toString());
            } catch (Exception e) {
                C0960L.zza(e, "Parsing error", new Object[0]);
            }
        } catch (Exception e2) {
            zzct.zza(e2);
            C0960L.zza(e2, "Failed to log", new Object[0]);
        }
    }
}
