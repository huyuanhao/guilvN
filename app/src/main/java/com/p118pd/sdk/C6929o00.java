package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00  reason: case insensitive filesystem */
public class C6929o00 {
    public static final String OooO00o = "TypefaceCompatUtil";
    public static final String OooO0O0 = ".font";

    @Nullable
    public static File OooO00o(Context context) {
        String str = OooO0O0 + Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myTid() + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        for (int i = 0; i < 100; i++) {
            File file = new File(context.getCacheDir(), str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r7.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = move-exception;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer OooO00o(java.io.File r7) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0025 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0025 }
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x0019 }
            long r5 = r1.size()     // Catch:{ all -> 0x0019 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0019 }
            r3 = 0
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0019 }
            r0.close()
            return r7
        L_0x0019:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x001b }
        L_0x001b:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            r7.addSuppressed(r0)
        L_0x0024:
            throw r1
        L_0x0025:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6929o00.OooO00o(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        if (r7 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        r8.addSuppressed(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        throw r9;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer OooO00o(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch:{ IOException -> 0x004f }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x004f }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0041 }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x0041 }
            r8.<init>(r9)     // Catch:{ all -> 0x0041 }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0035 }
            long r5 = r1.size()     // Catch:{ all -> 0x0035 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0035 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0035 }
            r8.close()
            if (r7 == 0) goto L_0x0034
            r7.close()
        L_0x0034:
            return r9
        L_0x0035:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r8 = move-exception
            r9.addSuppressed(r8)
        L_0x0040:
            throw r1
        L_0x0041:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r9 = move-exception
            if (r7 == 0) goto L_0x004e
            r7.close()     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r7 = move-exception
            r8.addSuppressed(r7)
        L_0x004e:
            throw r9
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6929o00.OooO00o(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    @Nullable
    @RequiresApi(19)
    public static ByteBuffer OooO00o(Context context, Resources resources, int i) {
        File OooO00o2 = OooO00o(context);
        if (OooO00o2 == null) {
            return null;
        }
        try {
            if (!OooO00o(OooO00o2, resources, i)) {
                return null;
            }
            ByteBuffer OooO00o3 = OooO00o(OooO00o2);
            OooO00o2.delete();
            return OooO00o3;
        } finally {
            OooO00o2.delete();
        }
    }

    public static boolean OooO00o(File file, InputStream inputStream) {
        Throwable th;
        IOException e;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        OooO00o(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    String str = "Error copying resource contents to temp file: " + e.getMessage();
                    OooO00o(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    OooO00o(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                OooO00o(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            String str2 = "Error copying resource contents to temp file: " + e.getMessage();
            OooO00o(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static boolean OooO00o(File file, Resources resources, int i) {
        InputStream inputStream;
        Throwable th;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean OooO00o2 = OooO00o(file, inputStream);
                OooO00o(inputStream);
                return OooO00o2;
            } catch (Throwable th2) {
                th = th2;
                OooO00o(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            OooO00o(inputStream);
            throw th;
        }
    }

    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
