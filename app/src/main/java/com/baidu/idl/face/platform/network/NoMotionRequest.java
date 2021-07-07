package com.baidu.idl.face.platform.network;

import android.os.Handler;

public class NoMotionRequest extends BaseRequest {
    public static final String TAG = "NoMotionRequest";
    public static final String URL_POST_NOMOTION_LIVENESS = "http://face.baidu.com/gate/api/userverifydemo";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0159 A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x015e A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0163 A[Catch:{ IOException -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x017a A[SYNTHETIC, Splitter:B:114:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0182 A[Catch:{ IOException -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0187 A[Catch:{ IOException -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x018c A[Catch:{ IOException -> 0x017e }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01a3 A[SYNTHETIC, Splitter:B:131:0x01a3] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01ab A[Catch:{ IOException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b0 A[Catch:{ IOException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01b5 A[Catch:{ IOException -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cb A[SYNTHETIC, Splitter:B:148:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01d3 A[Catch:{ IOException -> 0x01cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01d8 A[Catch:{ IOException -> 0x01cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01dd A[Catch:{ IOException -> 0x01cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01f3 A[SYNTHETIC, Splitter:B:165:0x01f3] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01fb A[Catch:{ IOException -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0200 A[Catch:{ IOException -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0205 A[Catch:{ IOException -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0221 A[SYNTHETIC, Splitter:B:180:0x0221] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0229 A[Catch:{ IOException -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x022e A[Catch:{ IOException -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0233 A[Catch:{ IOException -> 0x0225 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0151 A[SYNTHETIC, Splitter:B:97:0x0151] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void httpUrlConnectionPost(java.lang.String r9, android.os.Handler r10) {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.network.NoMotionRequest.httpUrlConnectionPost(java.lang.String, android.os.Handler):void");
    }

    public static void sendMessage(final String str, final Handler handler) {
        if (str != null && str.length() > 0) {
            new Thread(new Runnable() {
                /* class com.baidu.idl.face.platform.network.NoMotionRequest.RunnableC04151 */

                public void run() {
                    NoMotionRequest.httpUrlConnectionPost(str, handler);
                }
            }).start();
        }
    }
}
