package com.google.android.gms.internal.firebase_ml;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.google.firebase.p027ml.common.modeldownload.FirebaseRemoteModel;
import com.umeng.message.util.HttpRequest;
import javax.net.ssl.HttpsURLConnection;

@WorkerThread
public final class zzof {
    public static final GmsLogger zzaoz = new GmsLogger("BaseModelInfoRetriever", "");

    @Nullable
    public static zzop zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzon zzon) throws FirebaseMLException {
        HttpsURLConnection zza = zzou.zza(String.format("https://mlkit.googleapis.com/_i/v1/1p/m?n=%s", firebaseRemoteModel.zzmj()), zzon);
        if (zza == null) {
            return null;
        }
        String headerField = zza.getHeaderField("Content-Location");
        String headerField2 = zza.getHeaderField(HttpRequest.HEADER_ETAG);
        GmsLogger gmsLogger = zzaoz;
        String valueOf = String.valueOf(headerField);
        gmsLogger.mo10801d("BaseModelInfoRetriever", valueOf.length() != 0 ? "Received download URL: ".concat(valueOf) : new String("Received download URL: "));
        if (headerField == null) {
            return null;
        }
        if (headerField2 == null) {
            zzon.zza(zzmk.MODEL_INFO_DOWNLOAD_NO_HASH, false);
            throw new FirebaseMLException("No hash value for the base model", 13);
        } else if (firebaseRemoteModel.zzcd(headerField2)) {
            firebaseRemoteModel.zzce(headerField2);
            return new zzop(firebaseRemoteModel.zzmj(), Uri.parse(headerField), headerField2, zzok.BASE);
        } else {
            throw new FirebaseMLException("Downloaded model hash doesn't match the expected. ", 13);
        }
    }
}
