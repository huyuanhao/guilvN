package com.xiaomi.push;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.xiaomi.push.ag */
public class C4249ag {

    /* renamed from: a */
    public static final String f11352a = (Environment.getExternalStorageDirectory().getPath() + "/mipush/");

    /* renamed from: b */
    public static final String f11353b = (f11352a + "lcfp");

    /* renamed from: c */
    public static final String f11354c = (f11352a + "lcfp.lock");

    /* renamed from: a */
    public static boolean m11635a(Context context, String str, long j) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IOException e;
        FileLock fileLock = null;
        try {
            File file = new File(f11354c);
            C4693y.m14241a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLock = randomAccessFile.getChannel().lock();
                boolean b = m11636b(context, str, j);
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException unused) {
                    }
                }
                C4693y.m14236a(randomAccessFile);
                return b;
            } catch (IOException e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    C4693y.m14236a(randomAccessFile);
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException unused3) {
                        }
                    }
                    C4693y.m14236a(randomAccessFile);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
            e.printStackTrace();
            fileLock.release();
            C4693y.m14236a(randomAccessFile);
            return true;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            fileLock.release();
            C4693y.m14236a(randomAccessFile);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11636b(android.content.Context r16, java.lang.String r17, long r18) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4249ag.m11636b(android.content.Context, java.lang.String, long):boolean");
    }
}
