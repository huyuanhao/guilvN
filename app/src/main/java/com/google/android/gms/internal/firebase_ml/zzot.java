package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import java.io.File;

public final class zzot implements zzoh {
    public final FirebaseApp zzapo;
    public final String zzaqg;

    public zzot(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        this.zzapo = firebaseApp;
        this.zzaqg = str;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzoh
    @Nullable
    public final File zza(File file) throws FirebaseMLException {
        File zzb = zzoq.zzb(this.zzapo, this.zzaqg, zzok.TRANSLATE);
        File file2 = new File(zzb, String.valueOf(zzoq.zzd(zzb) + 1));
        if (file.renameTo(file2)) {
            zzoq.zzaoz.mo10801d("RemoteModelFileManager", "Rename to serving model successfully");
            file2.setExecutable(false);
            file2.setWritable(false);
            return file2;
        }
        zzoq.zzaoz.mo10801d("RemoteModelFileManager", "Rename to serving model failed, remove the temp file.");
        if (file.delete()) {
            return null;
        }
        GmsLogger gmsLogger = zzoq.zzaoz;
        String valueOf = String.valueOf(file.getAbsolutePath());
        gmsLogger.mo10801d("RemoteModelFileManager", valueOf.length() != 0 ? "Failed to delete the temp file: ".concat(valueOf) : new String("Failed to delete the temp file: "));
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzoh
    public final void zzlt() {
    }
}
