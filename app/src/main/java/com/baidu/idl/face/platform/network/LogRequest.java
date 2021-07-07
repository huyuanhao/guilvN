package com.baidu.idl.face.platform.network;

public class LogRequest extends BaseRequest {
    public static final String URL_GET_LOG = "http://face.baidu.com/openapi/v2/stat/sdkdata";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x019d A[SYNTHETIC, Splitter:B:145:0x019d] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01a5 A[Catch:{ IOException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01aa A[Catch:{ IOException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01af A[Catch:{ IOException -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void httpUrlConnectionPost(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.network.LogRequest.httpUrlConnectionPost(java.lang.String):void");
    }

    public static void sendLogMessage(final String str) {
        if (str != null && str.length() > 0) {
            new Thread(new Runnable() {
                /* class com.baidu.idl.face.platform.network.LogRequest.RunnableC04141 */

                public void run() {
                    LogRequest.httpUrlConnectionPost(str);
                }
            }).start();
        }
    }
}
