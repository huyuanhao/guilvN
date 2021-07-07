package com.baidu.aip.face.stat;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static final String TAG = "FileUtil";

    public FileUtil() {
        throw new RuntimeException("This class instance can not be created.");
    }

    public static boolean createFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (file.exists() && file.length() > 3145728) {
            file.delete();
        }
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC, Splitter:B:20:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0028 A[SYNTHETIC, Splitter:B:25:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean loadPropertiesFile(java.io.File r3, java.util.Properties r4) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x001b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001b }
            r4.load(r1)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            r3 = 1
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r3
        L_0x0013:
            r3 = move-exception
            r0 = r1
            goto L_0x0026
        L_0x0016:
            r3 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r3 = move-exception
            goto L_0x0026
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            r3.printStackTrace()     // Catch:{ all -> 0x0019 }
            r3 = 0
            if (r0 == 0) goto L_0x0025
            r0.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return r3
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.aip.face.stat.FileUtil.loadPropertiesFile(java.io.File, java.util.Properties):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0022 A[SYNTHETIC, Splitter:B:20:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0028 A[SYNTHETIC, Splitter:B:25:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean savePropertiesFile(java.io.File r3, java.util.Properties r4) {
        /*
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x001b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001b }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001b }
            r4.store(r1, r0)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            r3 = 1
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r3
        L_0x0013:
            r3 = move-exception
            r0 = r1
            goto L_0x0026
        L_0x0016:
            r3 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r3 = move-exception
            goto L_0x0026
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            r3.printStackTrace()     // Catch:{ all -> 0x0019 }
            r3 = 0
            if (r0 == 0) goto L_0x0025
            r0.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return r3
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.aip.face.stat.FileUtil.savePropertiesFile(java.io.File, java.util.Properties):boolean");
    }
}
