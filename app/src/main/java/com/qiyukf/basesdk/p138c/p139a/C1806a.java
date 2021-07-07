package com.qiyukf.basesdk.p138c.p139a;

import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.File;
import java.io.IOException;

/* renamed from: com.qiyukf.basesdk.c.a.a */
public final class C1806a {
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c A[SYNTHETIC, Splitter:B:42:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091 A[Catch:{ IOException -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0 A[SYNTHETIC, Splitter:B:58:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b8 A[Catch:{ IOException -> 0x00b4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m3408a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p139a.C1806a.m3408a(java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    public static File m3409a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException unused) {
            if (file.exists()) {
                file.delete();
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d A[SYNTHETIC, Splitter:B:50:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2 A[Catch:{ IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7 A[Catch:{ IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cb A[SYNTHETIC, Splitter:B:70:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d3 A[Catch:{ IOException -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8 A[Catch:{ IOException -> 0x00cf }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3410a(android.content.Context r8, android.net.Uri r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p139a.C1806a.m3410a(android.content.Context, android.net.Uri, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c A[SYNTHETIC, Splitter:B:20:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0036 A[SYNTHETIC, Splitter:B:27:0x0036] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3411a(android.graphics.Bitmap r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x003c
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x000a
            goto L_0x003c
        L_0x000a:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0033, all -> 0x0029 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0033, all -> 0x0029 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0033, all -> 0x0029 }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0033, all -> 0x0029 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x0027, all -> 0x0024 }
            r2 = 80
            r3.compress(r1, r2, r4)     // Catch:{ FileNotFoundException -> 0x0027, all -> 0x0024 }
            r4.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r3.recycle()
            r3 = 1
            return r3
        L_0x0024:
            r0 = move-exception
            r1 = r4
            goto L_0x002a
        L_0x0027:
            r1 = r4
            goto L_0x0034
        L_0x0029:
            r0 = move-exception
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r3.recycle()
            throw r0
        L_0x0033:
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            r3.recycle()
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p138c.p139a.C1806a.m3411a(android.graphics.Bitmap, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static boolean m3412b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(file.getParent() + C8932ooOOO0o.OooO0OO + System.currentTimeMillis() + "_tmp");
        if (file.renameTo(file2)) {
            file = file2;
        }
        return file.delete();
    }

    /* renamed from: b */
    public static boolean m3413b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                File file2 = new File(str2);
                if (file2.getParentFile() == null) {
                    return false;
                }
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                return file.renameTo(file2);
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m3414c(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                file.deleteOnExit();
            }
        }
    }
}
