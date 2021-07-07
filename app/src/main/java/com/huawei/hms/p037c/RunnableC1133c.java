package com.huawei.hms.p037c;

import com.baidu.aip.face.stat.FileUtil;
import com.huawei.hms.support.log.C1202a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.huawei.hms.c.c */
public final class RunnableC1133c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ File f1167a;

    /* renamed from: b */
    public final /* synthetic */ long f1168b;

    /* renamed from: c */
    public final /* synthetic */ String f1169c;

    public RunnableC1133c(File file, long j, String str) {
        this.f1167a = file;
        this.f1168b = j;
        this.f1169c = str;
    }

    public void run() {
        Throwable th;
        IOException e;
        File file = this.f1167a;
        if (file == null) {
            C1202a.m1320d(FileUtil.TAG, "In writeFile Failed to get local file.");
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
            C1202a.m1320d(FileUtil.TAG, "In writeFile, Failed to create directory.");
            return;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            long length = this.f1167a.length();
            if (length > this.f1168b) {
                String canonicalPath = this.f1167a.getCanonicalPath();
                if (!this.f1167a.delete()) {
                    C1202a.m1320d(FileUtil.TAG, "last file delete failed.");
                }
                randomAccessFile = new RandomAccessFile(new File(canonicalPath), "rw");
            } else {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f1167a, "rw");
                try {
                    randomAccessFile2.seek(length);
                    randomAccessFile = randomAccessFile2;
                } catch (IOException e2) {
                    e = e2;
                    randomAccessFile = randomAccessFile2;
                    try {
                        C1202a.m1317a(FileUtil.TAG, "writeFile exception:", e);
                        C1135e.m1069a(randomAccessFile);
                    } catch (Throwable th2) {
                        th = th2;
                        C1135e.m1069a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    randomAccessFile = randomAccessFile2;
                    C1135e.m1069a(randomAccessFile);
                    throw th;
                }
            }
            randomAccessFile.writeBytes(this.f1169c + System.getProperty("line.separator"));
        } catch (IOException e3) {
            e = e3;
            C1202a.m1317a(FileUtil.TAG, "writeFile exception:", e);
            C1135e.m1069a(randomAccessFile);
        }
        C1135e.m1069a(randomAccessFile);
    }
}
