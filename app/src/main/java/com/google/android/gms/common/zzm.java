package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.p118pd.sdk.LL1i;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
public class zzm {
    public static final zzm zzac = new zzm(true, null, null);
    public final Throwable cause;
    public final boolean zzad;
    public final String zzae;

    public zzm(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.zzad = z;
        this.zzae = str;
        this.cause = th;
    }

    public static zzm zza(Callable<String> callable) {
        return new zzo(callable);
    }

    public static zzm zzb(@NonNull String str) {
        return new zzm(false, str, null);
    }

    public static String zzc(String str, zze zze, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, Hex.bytesToStringLowercase(AndroidUtilsLight.zzi(LL1i.OooO0O0).digest(zze.getBytes())), Boolean.valueOf(z), "12451009.false");
    }

    public static zzm zze() {
        return zzac;
    }

    @Nullable
    public String getErrorMessage() {
        return this.zzae;
    }

    public final void zzf() {
        if (!this.zzad && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.cause != null) {
                getErrorMessage();
            } else {
                getErrorMessage();
            }
        }
    }

    public static zzm zza(@NonNull String str, @NonNull Throwable th) {
        return new zzm(false, str, th);
    }
}
