package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.umeng.commonsdk.stateless.f */
public class C3653f {

    /* renamed from: a */
    public static int f9551a;

    /* renamed from: b */
    public static final byte[] f9552b = {10, 1, 11, 5, 4, 15, 7, 9, 23, 3, 1, 6, 8, 12, 13, 91};

    /* renamed from: c */
    public static Object f9553c = new Object();

    /* renamed from: a */
    public static boolean m9765a(long j, long j2) {
        return j > j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        r9 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb A[SYNTHETIC, Splitter:B:42:0x00fb] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9766a(android.content.Context r8, java.lang.String r9, java.lang.String r10, byte[] r11) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3653f.m9766a(android.content.Context, java.lang.String, java.lang.String, byte[]):boolean");
    }

    /* renamed from: b */
    public static byte[] m9770b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            return instance.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m9771c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(bArr[i])));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public static byte[] m9767a(String str) throws IOException {
        byte[] bArr;
        synchronized (f9553c) {
            ULog.m9832i("walle", "[stateless] begin read envelope, thread is " + Thread.currentThread());
            FileChannel fileChannel = null;
            try {
                FileChannel channel = new RandomAccessFile(str, "r").getChannel();
                MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size()).load();
                bArr = new byte[((int) channel.size())];
                if (load.remaining() > 0) {
                    load.get(bArr, 0, load.remaining());
                }
                ULog.m9832i("walle", "[stateless] end read envelope, thread id " + Thread.currentThread());
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException e) {
                ULog.m9832i("walle", "[stateless] write envelope, e is " + e.getMessage());
                throw e;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static File m9763a(Context context) {
        File[] listFiles;
        File[] listFiles2;
        File file = null;
        try {
            synchronized (f9553c) {
                ULog.m9832i("walle", "get last envelope begin, thread is " + Thread.currentThread());
                if (!(context == null || context.getApplicationContext() == null)) {
                    String str = context.getApplicationContext().getFilesDir() + C8932ooOOO0o.OooO0OO + C3640a.f9476e;
                    if (!TextUtils.isEmpty(str)) {
                        File file2 = new File(str);
                        if (file2.isDirectory() && (listFiles = file2.listFiles()) != null && listFiles.length > 0) {
                            for (File file3 : listFiles) {
                                if (file3 != null && file3.isDirectory() && (listFiles2 = file3.listFiles()) != null && listFiles2.length > 0) {
                                    Arrays.sort(listFiles2, new Comparator<File>() {
                                        /* class com.umeng.commonsdk.stateless.C3653f.C36541 */

                                        /* renamed from: a */
                                        public int compare(File file, File file2) {
                                            long lastModified = file.lastModified() - file2.lastModified();
                                            if (lastModified > 0) {
                                                return 1;
                                            }
                                            return lastModified == 0 ? 0 : -1;
                                        }
                                    });
                                    File file4 = listFiles2[0];
                                    if (file4 != null && (file == null || file.lastModified() > file4.lastModified())) {
                                        file = file4;
                                    }
                                }
                            }
                        }
                    }
                }
                ULog.m9832i("walle", "get last envelope end, thread is " + Thread.currentThread());
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
        return file;
    }

    /* renamed from: a */
    public static void m9764a(Context context, String str, int i) {
        if (str == null) {
            try {
                ULog.m9832i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        } else {
            File file = new File(str);
            if (!file.isDirectory()) {
                ULog.m9832i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (f9553c) {
                File[] listFiles = file.listFiles();
                ULog.m9832i("AmapLBS", "[lbs-build] delete file begin " + listFiles.length + ", thread is " + Thread.currentThread());
                if (listFiles == null || listFiles.length < i) {
                    ULog.m9832i("AmapLBS", "[lbs-build] file size < max");
                } else {
                    ULog.m9832i("AmapLBS", "[lbs-build] file size >= max");
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listFiles) {
                        if (file2 != null) {
                            arrayList.add(file2);
                        }
                    }
                    if (arrayList.size() >= i) {
                        Collections.sort(arrayList, new Comparator<File>() {
                            /* class com.umeng.commonsdk.stateless.C3653f.C36552 */

                            /* renamed from: a */
                            public int compare(File file, File file2) {
                                if (file == null || file2 == null || file.lastModified() >= file2.lastModified()) {
                                    return (file == null || file2 == null || file.lastModified() != file2.lastModified()) ? 1 : 0;
                                }
                                return -1;
                            }
                        });
                        if (ULog.DEBUG) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                ULog.m9832i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                            }
                        }
                        for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                            if (arrayList.get(i3) != null) {
                                ULog.m9832i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                try {
                                    ((File) arrayList.get(i3)).delete();
                                    arrayList.remove(i3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                ULog.m9832i("AmapLBS", "[lbs-build] delete file end " + listFiles.length + ", thread is " + Thread.currentThread());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m9768a(byte[] r5) throws java.io.IOException {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0046
            int r1 = r5.length
            if (r1 > 0) goto L_0x0007
            goto L_0x0046
        L_0x0007:
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r5)
            r1.finish()
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]
            r2 = 0
            com.umeng.commonsdk.stateless.C3653f.f9551a = r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
        L_0x001e:
            boolean r0 = r1.finished()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0031
            int r0 = r1.deflate(r5)     // Catch:{ all -> 0x003c }
            int r4 = com.umeng.commonsdk.stateless.C3653f.f9551a     // Catch:{ all -> 0x003c }
            int r4 = r4 + r0
            com.umeng.commonsdk.stateless.C3653f.f9551a = r4     // Catch:{ all -> 0x003c }
            r3.write(r5, r2, r0)     // Catch:{ all -> 0x003c }
            goto L_0x001e
        L_0x0031:
            r1.end()     // Catch:{ all -> 0x003c }
            r3.close()
            byte[] r5 = r3.toByteArray()
            return r5
        L_0x003c:
            r5 = move-exception
            r0 = r3
            goto L_0x0040
        L_0x003f:
            r5 = move-exception
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            r0.close()
        L_0x0045:
            throw r5
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3653f.m9768a(byte[]):byte[]");
    }

    /* renamed from: a */
    public static byte[] m9769a(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        instance.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(f9552b));
        return instance.doFinal(bArr);
    }
}
