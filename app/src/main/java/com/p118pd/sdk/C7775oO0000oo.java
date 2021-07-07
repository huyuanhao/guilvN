package com.p118pd.sdk;

import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0000oo  reason: case insensitive filesystem */
public class C7775oO0000oo implements AbstractC7641o0oOoO<InputStream> {
    public static final String OooO00o = "StreamEncoder";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7707o0ooO00O f20815OooO00o;

    public C7775oO0000oo(AbstractC7707o0ooO00O o0ooo00o) {
        this.f20815OooO00o = o0ooo00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[SYNTHETIC, Splitter:B:26:0x0041] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(@androidx.annotation.NonNull java.io.InputStream r4, @androidx.annotation.NonNull java.io.File r5, @androidx.annotation.NonNull com.p118pd.sdk.C7648o0oOoOo r6) {
        /*
            r3 = this;
            com.pd.sdk.o0ooO00O r6 = r3.f20815OooO00o
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r6 = r6.OooO0O0(r1, r0)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002d }
            r2.<init>(r5)     // Catch:{ IOException -> 0x002d }
        L_0x0013:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r1 = -1
            if (r5 == r1) goto L_0x001e
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            goto L_0x0013
        L_0x001e:
            r2.close()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            r0 = 1
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0039
        L_0x0026:
            r4 = move-exception
            r1 = r2
            goto L_0x003f
        L_0x0029:
            r1 = r2
            goto L_0x002d
        L_0x002b:
            r4 = move-exception
            goto L_0x003f
        L_0x002d:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0039
            r1.close()
        L_0x0039:
            com.pd.sdk.o0ooO00O r4 = r3.f20815OooO00o
            r4.OooO00o(r6)
            return r0
        L_0x003f:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            com.pd.sdk.o0ooO00O r5 = r3.f20815OooO00o
            r5.OooO00o(r6)
            goto L_0x004b
        L_0x004a:
            throw r4
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7775oO0000oo.OooO00o(java.io.InputStream, java.io.File, com.pd.sdk.o0oOoOo):boolean");
    }
}
