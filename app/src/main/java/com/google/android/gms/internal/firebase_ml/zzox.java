package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.io.File;
import java.io.IOException;

public final class zzox {
    public static final GmsLogger zzaoz = new GmsLogger("RemoteModelUtils", "");
    public final zzol zzaro;

    public zzox(@NonNull zzol zzol) {
        Preconditions.checkNotNull(zzol);
        this.zzaro = zzol;
    }

    public static boolean zza(@NonNull File file, @NonNull String str) {
        String str2;
        try {
            str2 = zzf(file);
        } catch (IOException unused) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(file.getAbsolutePath());
            gmsLogger.mo10801d("RemoteModelUtils", valueOf.length() != 0 ? "Failed to close the tmp FileInputStream: ".concat(valueOf) : new String("Failed to close the tmp FileInputStream: "));
            str2 = "";
        }
        GmsLogger gmsLogger2 = zzaoz;
        String valueOf2 = String.valueOf(str2);
        gmsLogger2.mo10801d("RemoteModelUtils", valueOf2.length() != 0 ? "Calculated hash value is: ".concat(valueOf2) : new String("Calculated hash value is: "));
        return str.equals(str2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zzf(java.io.File r8) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzox.zzf(java.io.File):java.lang.String");
    }

    public final boolean zzb(File file, zzon zzon) {
        return this.zzaro.zza(file, zzon);
    }
}
