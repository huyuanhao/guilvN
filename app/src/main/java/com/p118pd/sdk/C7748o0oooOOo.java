package com.p118pd.sdk;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.o0oooOOo  reason: case insensitive filesystem */
public final class C7748o0oooOOo {
    public static final String OooO00o = "GlideRuntimeCompat";
    public static final String OooO0O0 = "cpu[0-9]+";
    public static final String OooO0OO = "/sys/devices/system/cpu/";

    /* renamed from: com.pd.sdk.o0oooOOo$OooO00o */
    public class OooO00o implements FilenameFilter {
        public final /* synthetic */ Pattern OooO00o;

        public OooO00o(Pattern pattern) {
            this.OooO00o = pattern;
        }

        public boolean accept(File file, String str) {
            return this.OooO00o.matcher(str).matches();
        }
    }

    public static int OooO00o() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(OooO0O0(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    public static int OooO0O0() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File(OooO0OO).listFiles(new OooO00o(Pattern.compile(OooO0O0)));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
