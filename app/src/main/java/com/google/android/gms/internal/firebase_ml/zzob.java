package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class zzob implements zzoh {
    public static final GmsLogger zzaoz = new GmsLogger("AutoMLModelFileManager", "");
    public final FirebaseApp zzapo;
    public final String zzaqg;

    public zzob(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        this.zzapo = firebaseApp;
        this.zzaqg = str;
    }

    @VisibleForTesting
    public static File zzj(@NonNull FirebaseApp firebaseApp, @NonNull String str) throws FirebaseMLException {
        File zza = zzoq.zza(firebaseApp, str, zzok.AUTOML);
        if (!zza.exists() || !zza.isFile() || zza.delete()) {
            if (!zza.exists()) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(zza.getAbsolutePath());
                gmsLogger.mo10801d("AutoMLModelFileManager", valueOf.length() != 0 ? "Temp labels folder does not exist, creating one: ".concat(valueOf) : new String("Temp labels folder does not exist, creating one: "));
                if (!zza.mkdirs()) {
                    throw new FirebaseMLException("Failed to create a directory to hold the AutoML model's labels file.", 13);
                }
            }
            return new File(zza, "labels.txt");
        }
        String valueOf2 = String.valueOf(zza.getAbsolutePath());
        throw new FirebaseMLException(valueOf2.length() != 0 ? "Failed to delete the temp labels file: ".concat(valueOf2) : new String("Failed to delete the temp labels file: "), 13);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzoh
    @Nullable
    public final File zza(File file) throws FirebaseMLException {
        File zzb = zzoq.zzb(this.zzapo, this.zzaqg, zzok.AUTOML);
        File file2 = new File(new File(zzb, String.valueOf(zzoq.zzd(zzb) + 1)), "model.tflite");
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        File zzj = zzj(this.zzapo, this.zzaqg);
        File file3 = new File(parentFile, "labels.txt");
        if (!file.renameTo(file2) || !zzj.renameTo(file3)) {
            zzaoz.mo10801d("AutoMLModelFileManager", "Rename to serving model failed, remove the temp file.");
            if (!file.delete()) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(file.getAbsolutePath());
                gmsLogger.mo10801d("AutoMLModelFileManager", valueOf.length() != 0 ? "Failed to delete the temp model file: ".concat(valueOf) : new String("Failed to delete the temp model file: "));
            }
            if (zzj.delete()) {
                return null;
            }
            GmsLogger gmsLogger2 = zzaoz;
            String valueOf2 = String.valueOf(zzj.getAbsolutePath());
            gmsLogger2.mo10801d("AutoMLModelFileManager", valueOf2.length() != 0 ? "Failed to delete the temp labels file: ".concat(valueOf2) : new String("Failed to delete the temp labels file: "));
            return null;
        }
        zzaoz.mo10801d("AutoMLModelFileManager", "Rename to serving model successfully");
        file2.setExecutable(false);
        file2.setWritable(false);
        file3.setExecutable(false);
        file3.setWritable(false);
        try {
            zza(new File(parentFile, "manifest.json"), new zzoc(String.format("{\n\t\"modelType\": \"%s\",\n\t\"modelFile\": \"%s\",\n\t\"labelsFile\": \"%s\"\n}", "IMAGE_LABELING", "model.tflite", "labels.txt")));
            return file2.getParentFile();
        } catch (IOException e) {
            String valueOf3 = String.valueOf(this.zzaqg);
            throw new FirebaseMLException(valueOf3.length() != 0 ? "Failed to write manifest json for the AutoML model: ".concat(valueOf3) : new String("Failed to write manifest json for the AutoML model: "), 13, e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzoh
    public final void zzlt() throws FirebaseMLException {
        File zzj = zzj(this.zzapo, this.zzaqg);
        if (!zzoq.zze(zzj.getParentFile())) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(zzj.getParentFile().getAbsolutePath());
            gmsLogger.mo10803e("AutoMLModelFileManager", valueOf.length() != 0 ? "Failed to delete the temp labels file directory: ".concat(valueOf) : new String("Failed to delete the temp labels file directory: "));
        }
    }

    public static void zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull List<String> list) throws FirebaseMLException {
        try {
            zza(zzj(firebaseApp, str), new zzod(list));
        } catch (IOException e) {
            String valueOf = String.valueOf(str);
            throw new FirebaseMLException(valueOf.length() != 0 ? "Failed to write labels file for the AutoML model: ".concat(valueOf) : new String("Failed to write labels file for the AutoML model: "), 13, e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        com.google.android.gms.internal.firebase_ml.zzlx.zza(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r4 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zza(java.io.File r3, com.google.android.gms.internal.firebase_ml.zzoe r4) throws java.io.IOException {
        /*
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.zza(r0)     // Catch:{ all -> 0x001c }
            r0.close()
            return
        L_0x001c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001e }
        L_0x001e:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r0 = move-exception
            com.google.android.gms.internal.firebase_ml.zzlx.zza(r3, r0)
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzob.zza(java.io.File, com.google.android.gms.internal.firebase_ml.zzoe):void");
    }

    public static final /* synthetic */ void zza(List list, BufferedWriter bufferedWriter) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bufferedWriter.write((String) it.next());
            bufferedWriter.newLine();
        }
    }
}
