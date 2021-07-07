package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

@KeepForSdk
public class ProcessUtils {
    public static String zzhe;
    public static int zzhf;

    @KeepForSdk
    @Nullable
    public static String getMyProcessName() {
        if (zzhe == null) {
            if (zzhf == 0) {
                zzhf = Process.myPid();
            }
            zzhe = zzd(zzhf);
        }
        return zzhe;
    }

    @Nullable
    public static String zzd(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = zzj(sb.toString());
            try {
                str = bufferedReader.readLine().trim();
                IOUtils.closeQuietly(bufferedReader);
            } catch (IOException unused) {
                IOUtils.closeQuietly(bufferedReader);
                return str;
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(bufferedReader);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
            IOUtils.closeQuietly(bufferedReader);
            return str;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            IOUtils.closeQuietly(bufferedReader);
            throw th;
        }
        return str;
    }

    public static BufferedReader zzj(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
