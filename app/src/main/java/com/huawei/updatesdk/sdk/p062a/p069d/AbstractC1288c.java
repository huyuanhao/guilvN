package com.huawei.updatesdk.sdk.p062a.p069d;

import com.baidu.aip.face.stat.FileUtil;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.huawei.updatesdk.sdk.a.d.c */
public abstract class AbstractC1288c {
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0075, code lost:
        if (r3 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f A[Catch:{ NoSuchAlgorithmException -> 0x006e, FileNotFoundException -> 0x0064, IOException -> 0x005a, IllegalArgumentException -> 0x0050, IndexOutOfBoundsException -> 0x0046, all -> 0x0044, all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0059 A[Catch:{ NoSuchAlgorithmException -> 0x006e, FileNotFoundException -> 0x0064, IOException -> 0x005a, IllegalArgumentException -> 0x0050, IndexOutOfBoundsException -> 0x0046, all -> 0x0044, all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063 A[Catch:{ NoSuchAlgorithmException -> 0x006e, FileNotFoundException -> 0x0064, IOException -> 0x005a, IllegalArgumentException -> 0x0050, IndexOutOfBoundsException -> 0x0046, all -> 0x0044, all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006d A[Catch:{ NoSuchAlgorithmException -> 0x006e, FileNotFoundException -> 0x0064, IOException -> 0x005a, IllegalArgumentException -> 0x0050, IndexOutOfBoundsException -> 0x0046, all -> 0x0044, all -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x007d A[SYNTHETIC, Splitter:B:54:0x007d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1619a(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1288c.m1619a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m1620a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C1278a.m1581a(FileUtil.TAG, "Closeable exception", e);
            }
        }
    }
}
