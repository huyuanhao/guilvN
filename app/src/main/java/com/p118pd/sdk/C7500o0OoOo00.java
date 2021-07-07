package com.p118pd.sdk;

import java.util.Locale;

/* renamed from: com.pd.sdk.o0OoOo00  reason: case insensitive filesystem */
public final class C7500o0OoOo00 {
    public String OooO00o = C7531o0Oooo0o.OooO00o(24);

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20337OooO00o;

    public C7500o0OoOo00(boolean z) {
        this.f20337OooO00o = z;
    }

    public static byte[] OooO0O0(String str, byte[] bArr, String str2) {
        return C7493o0OoOOOO.OooO0O0(str, bArr, str2);
    }

    public C7501o0OoOo0O OooO00o(C7495o0OoOOo o0ooooo, boolean z, String str) {
        byte[] bArr;
        if (o0ooooo == null) {
            return null;
        }
        byte[] bytes = o0ooooo.OooO00o().getBytes();
        byte[] bytes2 = o0ooooo.OooO0O0().getBytes();
        if (z) {
            try {
                bytes2 = C7497o0OoOOoO.OooO00o(bytes2);
            } catch (Exception unused) {
                z = false;
            }
        }
        if (this.f20337OooO00o) {
            bArr = OooO00o(bytes, OooO00o(this.OooO00o, C7722o0ooOOO0.OooO0OO), OooO00o(this.OooO00o, bytes2, str));
        } else {
            bArr = OooO00o(bytes, bytes2);
        }
        return new C7501o0OoOo0O(z, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068 A[SYNTHETIC, Splitter:B:29:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007b A[SYNTHETIC, Splitter:B:41:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.C7495o0OoOOo OooO00o(com.p118pd.sdk.C7501o0OoOo0O r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7500o0OoOo00.OooO00o(com.pd.sdk.o0OoOo0O, java.lang.String):com.pd.sdk.o0OoOOo");
    }

    public static byte[] OooO00o(String str, String str2) {
        return C7491o0OoOOO.m19117OooO00o(str, str2);
    }

    public static byte[] OooO00o(String str, byte[] bArr, String str2) {
        return C7493o0OoOOOO.OooO00o(str, bArr, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r2 == null) goto L_0x0053;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC, Splitter:B:29:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0058 A[SYNTHETIC, Splitter:B:38:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005f A[SYNTHETIC, Splitter:B:42:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] OooO00o(byte[]... r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0063
            int r1 = r7.length
            if (r1 != 0) goto L_0x0008
            goto L_0x0063
        L_0x0008:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            r1.<init>()     // Catch:{ Exception -> 0x0043, all -> 0x0040 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r2.<init>(r1)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            int r3 = r7.length     // Catch:{ Exception -> 0x0038 }
            r4 = 0
        L_0x0014:
            if (r4 >= r3) goto L_0x002a
            r5 = r7[r4]     // Catch:{ Exception -> 0x0038 }
            int r6 = r5.length     // Catch:{ Exception -> 0x0038 }
            java.lang.String r6 = OooO00o(r6)     // Catch:{ Exception -> 0x0038 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0038 }
            r2.write(r6)     // Catch:{ Exception -> 0x0038 }
            r2.write(r5)     // Catch:{ Exception -> 0x0038 }
            int r4 = r4 + 1
            goto L_0x0014
        L_0x002a:
            r2.flush()     // Catch:{ Exception -> 0x0038 }
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x0038 }
            r1.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r2.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0053
        L_0x0038:
            r7 = move-exception
            goto L_0x0046
        L_0x003a:
            r7 = move-exception
            r2 = r0
            goto L_0x0055
        L_0x003d:
            r7 = move-exception
            r2 = r0
            goto L_0x0046
        L_0x0040:
            r7 = move-exception
            r2 = r0
            goto L_0x0056
        L_0x0043:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x0046:
            com.p118pd.sdk.C7620o0oOOOoo.m19257OooO00o(r7)     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            if (r2 == 0) goto L_0x0053
            goto L_0x0034
        L_0x0053:
            return r0
        L_0x0054:
            r7 = move-exception
        L_0x0055:
            r0 = r1
        L_0x0056:
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch:{ Exception -> 0x005c }
            goto L_0x005d
        L_0x005c:
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r7
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7500o0OoOo00.OooO00o(byte[][]):byte[]");
    }

    public static String OooO00o(int i) {
        return String.format(Locale.getDefault(), "%05d", Integer.valueOf(i));
    }

    public static int OooO00o(String str) {
        return Integer.parseInt(str);
    }
}
