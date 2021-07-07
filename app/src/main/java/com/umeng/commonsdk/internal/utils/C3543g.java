package com.umeng.commonsdk.internal.utils;

import com.p118pd.sdk.C8932ooOOO0o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: com.umeng.commonsdk.internal.utils.g */
public class C3543g {

    /* renamed from: a */
    public static final String f9117a = "\n";

    /* renamed from: b */
    public static final byte[] f9118b = "\nexit\n".getBytes();

    /* renamed from: c */
    public static byte[] f9119c = new byte[32];

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:? */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.io.InputStreamReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.io.InputStreamReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: java.io.InputStreamReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: java.io.InputStreamReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r5v13, resolved type: java.io.BufferedReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v21, resolved type: java.io.InputStreamReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v22, resolved type: java.io.InputStreamReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v23, resolved type: java.io.InputStreamReader */
    /* JADX DEBUG: Multi-variable search result rejected for r4v24, resolved type: java.io.InputStreamReader */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r9 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        m9168c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r0 = th;
        r4 = r4;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00cc, code lost:
        if (r9 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00d9, code lost:
        if (r9 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00dc, code lost:
        if (r7 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00de, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00e3, code lost:
        return r7.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9164a(java.lang.String... r9) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3543g.m9164a(java.lang.String[]):java.lang.String");
    }

    /* renamed from: b */
    public static int m9167b(Process process) {
        String obj = process.toString();
        try {
            return Integer.parseInt(obj.substring(obj.indexOf(C8932ooOOO0o.OooO0Oo) + 1, obj.indexOf("]")));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static void m9168c(Process process) {
        if (process != null) {
            try {
                if (process.exitValue() != 0) {
                    m9166a(process);
                }
            } catch (IllegalThreadStateException unused) {
                m9166a(process);
            }
        }
    }

    /* renamed from: a */
    public static void m9165a(OutputStream outputStream, InputStream inputStream, InputStream inputStream2, InputStreamReader inputStreamReader, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused3) {
            }
        }
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException unused4) {
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|4|5|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9166a(java.lang.Process r1) {
        /*
            int r0 = m9167b(r1)
            if (r0 == 0) goto L_0x000d
            android.os.Process.killProcess(r0)     // Catch:{ Exception -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r1.destroy()     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3543g.m9166a(java.lang.Process):void");
    }
}
