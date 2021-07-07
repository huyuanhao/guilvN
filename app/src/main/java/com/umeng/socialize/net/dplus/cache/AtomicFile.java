package com.umeng.socialize.net.dplus.cache;

import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtomicFile {

    /* renamed from: a */
    public final File f10821a;

    /* renamed from: b */
    public final File f10822b;

    public AtomicFile(File file) {
        this.f10821a = file;
        this.f10822b = new File(file.getPath() + ".bak");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10826a(java.io.File r5, java.io.File r6) throws java.io.IOException {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            r3.<init>(r5)     // Catch:{ all -> 0x0050 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x004c }
            r5.<init>(r6)     // Catch:{ all -> 0x004c }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x004a }
        L_0x0013:
            int r2 = r3.read(r6)     // Catch:{ all -> 0x004a }
            if (r2 <= 0) goto L_0x002e
            r4 = 0
            r5.write(r6, r4, r2)     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r4.<init>()     // Catch:{ all -> 0x004a }
            r4.append(r2)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = ""
            r4.append(r2)     // Catch:{ all -> 0x004a }
            r4.toString()     // Catch:{ all -> 0x004a }
            goto L_0x0013
        L_0x002e:
            r3.close()
            r5.close()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "comsum time:"
            r5.append(r6)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r5.append(r2)
            r5.toString()
            return
        L_0x004a:
            r6 = move-exception
            goto L_0x004e
        L_0x004c:
            r6 = move-exception
            r5 = r2
        L_0x004e:
            r2 = r3
            goto L_0x0052
        L_0x0050:
            r6 = move-exception
            r5 = r2
        L_0x0052:
            if (r2 == 0) goto L_0x0057
            r2.close()
        L_0x0057:
            if (r5 == 0) goto L_0x005c
            r5.close()
        L_0x005c:
            goto L_0x005e
        L_0x005d:
            throw r6
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.cache.AtomicFile.m10826a(java.io.File, java.io.File):void");
    }

    public void delete() {
        this.f10821a.delete();
        this.f10822b.delete();
    }

    public void failWrite(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m10827a(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f10821a.delete();
                this.f10822b.renameTo(this.f10821a);
            } catch (IOException e) {
                SLog.error(UmengText.CACHE.CACHEFILE, e);
            }
        }
    }

    public void finishWrite(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m10827a(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f10822b.delete();
            } catch (IOException e) {
                SLog.error(UmengText.CACHE.CACHEFILE, e);
            }
        }
    }

    public File getBaseFile() {
        return this.f10821a;
    }

    public FileInputStream openRead() throws FileNotFoundException {
        if (this.f10822b.exists()) {
            this.f10821a.delete();
            this.f10822b.renameTo(this.f10821a);
        }
        return new FileInputStream(this.f10821a);
    }

    public byte[] readFully() throws IOException {
        FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i = 0;
            while (true) {
                int read = openRead.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = openRead.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[(available + i)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    public FileOutputStream startWrite(boolean z) throws IOException {
        if (this.f10821a.exists()) {
            if (this.f10822b.exists()) {
                this.f10821a.delete();
            } else if (!this.f10821a.renameTo(this.f10822b)) {
                String str = "Couldn't rename file " + this.f10821a + " to backup file " + this.f10822b;
            } else {
                m10826a(this.f10822b, this.f10821a);
            }
        }
        try {
            return new FileOutputStream(this.f10821a, z);
        } catch (FileNotFoundException e) {
            if (!this.f10821a.getParentFile().mkdirs()) {
                SLog.error(UmengText.CACHE.CACHEFILE, e);
            }
            try {
                return new FileOutputStream(this.f10821a, z);
            } catch (FileNotFoundException unused) {
                SLog.error(UmengText.CACHE.CACHEFILE, e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static boolean m10827a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return true;
        }
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException e) {
            SLog.error(UmengText.CACHE.CACHEFILE, e);
            return false;
        }
    }
}
