package com.google.android.gms.internal.firebase_ml;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class zzoq {
    public static final GmsLogger zzaoz = new GmsLogger("RemoteModelFileManager", "");
    public static String zzarb = "com.google.firebase.ml.%s.models";
    @VisibleForTesting
    public static final String zzarc = String.format("com.google.firebase.ml.%s.models", "custom");
    @VisibleForTesting
    public static final String zzard = String.format(zzarb, "automl");
    @VisibleForTesting
    public static final String zzare = String.format(zzarb, "base");
    @VisibleForTesting
    public static final String zzarf = String.format(zzarb, "translate");
    public final FirebaseApp zzapo;
    public final String zzaqg;
    public final zzok zzara;
    public final zzox zzarg;
    public final zzoh zzarh;

    public zzoq(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull zzol zzol, @NonNull zzok zzok) {
        this.zzapo = firebaseApp;
        this.zzaqg = str;
        this.zzara = zzok;
        this.zzarg = new zzox(zzol);
        int i = zzor.zzari[zzok.ordinal()];
        if (i == 1) {
            this.zzarh = new zzob(firebaseApp, str);
        } else if (i == 2) {
            this.zzarh = new zzot(firebaseApp, str);
        } else if (i == 3 || i == 4) {
            this.zzarh = new zzos(firebaseApp, str);
        } else {
            throw new IllegalArgumentException("Unexpected model type");
        }
    }

    @WorkerThread
    public static int zzd(@NonNull File file) {
        File[] listFiles = file.listFiles();
        if (listFiles.length == 0) {
            return -1;
        }
        int i = 0;
        for (File file2 : listFiles) {
            try {
                i = Math.max(i, Integer.parseInt(file2.getName()));
            } catch (NumberFormatException unused) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(file2.getName());
                gmsLogger.mo10801d("RemoteModelFileManager", valueOf.length() != 0 ? "Contains non-integer file name ".concat(valueOf) : new String("Contains non-integer file name "));
            }
        }
        return i;
    }

    public static boolean zze(File file) {
        boolean z;
        if (file.isDirectory()) {
            z = true;
            for (File file2 : file.listFiles()) {
                z = z && zze(file2);
            }
        } else {
            z = true;
        }
        return z && file.delete();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        zza(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0146, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0149, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014a, code lost:
        zza(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014d, code lost:
        throw r10;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.File zza(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull com.google.android.gms.internal.firebase_ml.zzon r11) throws com.google.firebase.p027ml.common.FirebaseMLException {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoq.zza(android.os.ParcelFileDescriptor, java.lang.String, com.google.android.gms.internal.firebase_ml.zzon):java.io.File");
    }

    @WorkerThread
    public final synchronized boolean zzb(@NonNull File file) throws FirebaseMLException {
        File zza = zza(this.zzapo, this.zzaqg, this.zzara, false);
        if (!zza.exists()) {
            return false;
        }
        File[] listFiles = zza.listFiles();
        boolean z = true;
        for (File file2 : listFiles) {
            if (!file2.equals(file) && !zze(file2)) {
                z = false;
            }
        }
        return z;
    }

    @WorkerThread
    public final synchronized File zzc(@NonNull File file) throws FirebaseMLException {
        File file2 = new File(String.valueOf(zza(this.zzapo, this.zzaqg, this.zzara, false).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        if (file.renameTo(file2)) {
            return file2;
        }
        return file;
    }

    @Nullable
    @WorkerThread
    public final synchronized String zzmf() throws FirebaseMLException {
        File zza = zza(this.zzapo, this.zzaqg, this.zzara, false);
        int zzd = zzd(zza);
        if (zzd < 0) {
            return null;
        }
        String absolutePath = zza.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 12);
        sb.append(absolutePath);
        sb.append(C8932ooOOO0o.OooO0OO);
        sb.append(zzd);
        return sb.toString();
    }

    @WorkerThread
    public final synchronized void zzmg() throws FirebaseMLException {
        this.zzarh.zzlt();
    }

    @WorkerThread
    public static File zzb(@NonNull FirebaseApp firebaseApp, @NonNull String str, zzok zzok) throws FirebaseMLException {
        return zza(firebaseApp, str, zzok, false);
    }

    @WorkerThread
    public static File zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull zzok zzok) throws FirebaseMLException {
        return zza(firebaseApp, str, zzok, true);
    }

    @WorkerThread
    public static File zza(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull zzok zzok, boolean z) throws FirebaseMLException {
        String str2;
        File file;
        int i = zzor.zzari[zzok.ordinal()];
        if (i == 1) {
            str2 = zzare;
        } else if (i == 2) {
            str2 = zzarf;
        } else if (i == 3) {
            str2 = zzard;
        } else if (i == 4) {
            str2 = zzarc;
        } else {
            String name = zzok.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 69);
            sb.append("Unknown model type ");
            sb.append(name);
            sb.append(". Cannot find a dir to store the downloaded model.");
            throw new FirebaseMLException(sb.toString(), 13);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            file = new File(firebaseApp.getApplicationContext().getNoBackupFilesDir(), str2);
        } else {
            file = firebaseApp.getApplicationContext().getDir(str2, 0);
        }
        if (z) {
            file = new File(file, "temp");
        }
        File file2 = new File(new File(file, firebaseApp.getPersistenceKey()), str);
        if (!file2.exists()) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(file2.getAbsolutePath());
            gmsLogger.mo10801d("RemoteModelFileManager", valueOf.length() != 0 ? "model folder does not exist, creating one: ".concat(valueOf) : new String("model folder does not exist, creating one: "));
            file2.mkdirs();
        } else if (!file2.isDirectory()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 71);
            sb2.append("Can not create model folder, since an existing file has the same name: ");
            sb2.append(valueOf2);
            throw new FirebaseMLException(sb2.toString(), 6);
        }
        return file2;
    }

    public static /* synthetic */ void zza(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                zzlx.zza(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    public static /* synthetic */ void zza(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                zzlx.zza(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
