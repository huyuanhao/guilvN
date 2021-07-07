package com.umeng.socialize.net.dplus.cache;

import android.text.TextUtils;
import com.umeng.socialize.utils.ContextUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class DplueCache {
    /* renamed from: a */
    public static JSONObject m10841a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("content")) == null) {
            return new JSONObject();
        }
        return optJSONObject.optJSONObject("share");
    }

    public static boolean deleteFile(File file) {
        return file.delete();
    }

    public static String getFileName() {
        return "dpluscache";
    }

    public static File getFilePath(String str) {
        if (ContextUtil.getContext() == null) {
            return null;
        }
        String packageName = ContextUtil.getContext().getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return null;
        }
        String str2 = File.separator + "data" + File.separator + "data" + File.separator + packageName + File.separator + "files" + File.separator + str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str2);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050 A[SYNTHETIC, Splitter:B:24:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[SYNTHETIC, Splitter:B:31:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFile(java.io.File r5) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.cache.DplueCache.readFile(java.io.File):java.lang.String");
    }

    public static boolean save(JSONObject jSONObject, File file) throws JSONException, IOException {
        if (file.exists()) {
            String readFile = readFile(file);
            return m10842a(readFile + Constants.ACCEPT_TIME_SEPARATOR_SP + jSONObject, file);
        }
        file.createNewFile();
        return m10842a(jSONObject.toString(), file);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[SYNTHETIC, Splitter:B:20:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044 A[SYNTHETIC, Splitter:B:26:0x0044] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m10842a(java.lang.String r3, java.io.File r4) {
        /*
            r0 = 0
            r1 = 0
            android.content.Context r2 = com.umeng.socialize.utils.ContextUtil.getContext()     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x002f }
            java.io.FileOutputStream r4 = r2.openFileOutput(r4, r0)     // Catch:{ Exception -> 0x002f }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x002f }
            r2.<init>(r4)     // Catch:{ Exception -> 0x002f }
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x002f }
            r4.<init>(r2)     // Catch:{ Exception -> 0x002f }
            r4.write(r3)     // Catch:{ Exception -> 0x002a, all -> 0x0027 }
            r3 = 1
            r4.close()     // Catch:{ Exception -> 0x0020 }
            goto L_0x0026
        L_0x0020:
            r4 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r4)
        L_0x0026:
            return r3
        L_0x0027:
            r3 = move-exception
            r1 = r4
            goto L_0x0042
        L_0x002a:
            r3 = move-exception
            r1 = r4
            goto L_0x0030
        L_0x002d:
            r3 = move-exception
            goto L_0x0042
        L_0x002f:
            r3 = move-exception
        L_0x0030:
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE     // Catch:{ all -> 0x002d }
            com.umeng.socialize.utils.SLog.error(r4, r3)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ Exception -> 0x003b }
            goto L_0x0041
        L_0x003b:
            r3 = move-exception
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.CACHE.CLOSE
            com.umeng.socialize.utils.SLog.error(r4, r3)
        L_0x0041:
            return r0
        L_0x0042:
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ Exception -> 0x0048 }
            goto L_0x004e
        L_0x0048:
            r4 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r4)
        L_0x004e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.dplus.cache.DplueCache.m10842a(java.lang.String, java.io.File):boolean");
    }
}
