package com.p118pd.sdk;

/* renamed from: com.pd.sdk.o0o00Oo0  reason: case insensitive filesystem */
public final class C7561o0o00Oo0 {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[SYNTHETIC, Splitter:B:18:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            r2.<init>(r4, r5)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            boolean r4 = r2.exists()     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            if (r4 != 0) goto L_0x0012
            return r1
        L_0x0012:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            java.lang.String r2 = "UTF-8"
            r5.<init>(r3, r2)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x003d, all -> 0x0036 }
        L_0x0023:
            java.lang.String r5 = r4.readLine()     // Catch:{ IOException -> 0x0034, all -> 0x0031 }
            if (r5 == 0) goto L_0x002d
            r0.append(r5)     // Catch:{ IOException -> 0x0034, all -> 0x0031 }
            goto L_0x0023
        L_0x002d:
            r4.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0043
        L_0x0031:
            r5 = move-exception
            r1 = r4
            goto L_0x0037
        L_0x0034:
            r1 = r4
            goto L_0x003e
        L_0x0036:
            r5 = move-exception
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r5
        L_0x003d:
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7561o0o00Oo0.OooO00o(java.lang.String, java.lang.String):java.lang.String");
    }
}
