package com.megvii.meglive_sdk.p097c;

/* renamed from: com.megvii.meglive_sdk.c.a */
public final class C1518a {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2292a(android.content.Context r6) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            android.content.ContentResolver r2 = r6.getContentResolver()
            java.lang.String r3 = "airplane_mode_on"
            java.lang.String r2 = android.provider.Settings.System.getString(r2, r3)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0024
            java.lang.String r5 = "1"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x0024
            r1 = -1
            goto L_0x002f
        L_0x0024:
            if (r1 == 0) goto L_0x002e
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L_0x002e
            r1 = 1
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 != r4) goto L_0x0055
            java.lang.Object r6 = r6.getSystemService(r0)
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0059
            int r0 = r6.getType()
            android.net.NetworkInfo$State r6 = r6.getState()
            if (r0 != r4) goto L_0x004d
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTED
            if (r6 != r1) goto L_0x004d
            r6 = 1
            goto L_0x005a
        L_0x004d:
            if (r0 != 0) goto L_0x0059
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.CONNECTED
            if (r6 != r0) goto L_0x0059
            r6 = 2
            goto L_0x005a
        L_0x0055:
            if (r1 == 0) goto L_0x0059
            r6 = 3
            goto L_0x005a
        L_0x0059:
            r6 = 0
        L_0x005a:
            if (r6 != 0) goto L_0x005d
            return r3
        L_0x005d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.p097c.C1518a.m2292a(android.content.Context):boolean");
    }
}
