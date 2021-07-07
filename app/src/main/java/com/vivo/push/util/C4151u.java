package com.vivo.push.util;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: com.vivo.push.util.u */
public final class C4151u implements AbstractC4133c {

    /* renamed from: a */
    public static final String f11128a = (Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + ".vivo/pushsdk/config");

    /* renamed from: b */
    public static final String f11129b = (f11128a + File.separator + "config.txt");

    /* renamed from: c */
    public static String f11130c = "SdcardCache";

    /* renamed from: d */
    public File f11131d;

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final boolean mo41188a(Context context) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return false;
        }
        File file = new File(f11128a);
        boolean mkdirs = !file.exists() ? file.mkdirs() : true;
        if (mkdirs) {
            File file2 = new File(f11129b);
            this.f11131d = file2;
            if (!file2.exists()) {
                try {
                    this.f11131d.createNewFile();
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return mkdirs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027 A[SYNTHETIC, Splitter:B:17:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e A[SYNTHETIC, Splitter:B:21:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41189b(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.Properties r0 = m11238a()
            java.lang.String r1 = com.vivo.push.util.C4151u.f11129b
            r2 = 0
            r0.setProperty(r4, r5)     // Catch:{ Exception -> 0x0021 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0021 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0021 }
            r0.store(r4, r2)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r4.flush()     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r4.close()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            return
        L_0x0019:
            r5 = move-exception
            r2 = r4
            goto L_0x002c
        L_0x001c:
            r5 = move-exception
            r2 = r4
            goto L_0x0022
        L_0x001f:
            r5 = move-exception
            goto L_0x002c
        L_0x0021:
            r5 = move-exception
        L_0x0022:
            r5.printStackTrace()     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            return
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.C4151u.mo41189b(java.lang.String, java.lang.String):void");
    }

    @Override // com.vivo.push.util.AbstractC4133c
    /* renamed from: a */
    public final String mo41187a(String str, String str2) {
        return m11238a().getProperty(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 != null) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC, Splitter:B:19:0x002c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Properties m11238a() {
        /*
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x001d, all -> 0x001b }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001d, all -> 0x001b }
            java.lang.String r4 = com.vivo.push.util.C4151u.f11129b     // Catch:{ Exception -> 0x001d, all -> 0x001b }
            r3.<init>(r4)     // Catch:{ Exception -> 0x001d, all -> 0x001b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001d, all -> 0x001b }
            r0.load(r2)     // Catch:{ Exception -> 0x0019 }
        L_0x0015:
            r2.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x0027
        L_0x0019:
            r1 = move-exception
            goto L_0x0021
        L_0x001b:
            r0 = move-exception
            goto L_0x002a
        L_0x001d:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0021:
            r1.printStackTrace()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0027
            goto L_0x0015
        L_0x0027:
            return r0
        L_0x0028:
            r0 = move-exception
            r1 = r2
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            goto L_0x0031
        L_0x0030:
            throw r0
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.C4151u.m11238a():java.util.Properties");
    }
}
