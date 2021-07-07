package com.p118pd.sdk;

import java.io.Closeable;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "CloseableKt")
/* renamed from: com.pd.sdk.O000o0oO */
public final class O000o0oO {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        com.p118pd.sdk.o0O0O0OO.OooO0O0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (com.p118pd.sdk.O000O000.OooO00o(1, 1, 0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        OooO00o(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        com.p118pd.sdk.o0O0O0OO.OooO00o(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        throw r2;
     */
    @kotlin.internal.InlineOnly
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends java.io.Closeable, R> R OooO00o(T r3, com.p118pd.sdk.O00O0OOO<? super T, ? extends R> r4) {
        /*
            r0 = 0
            r1 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch:{ all -> 0x001e }
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r1)
            boolean r0 = com.p118pd.sdk.O000O000.OooO00o(r1, r1, r0)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            OooO00o(r3, r0)
            goto L_0x001a
        L_0x0014:
            if (r3 != 0) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r3.close()
        L_0x001a:
            com.p118pd.sdk.o0O0O0OO.OooO00o(r1)
            return r4
        L_0x001e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2 = move-exception
            com.p118pd.sdk.o0O0O0OO.OooO0O0(r1)
            boolean r0 = com.p118pd.sdk.O000O000.OooO00o(r1, r1, r0)
            if (r0 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x0033
            r3.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0033
        L_0x0030:
            OooO00o(r3, r4)
        L_0x0033:
            com.p118pd.sdk.o0O0O0OO.OooO00o(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.O000o0oO.OooO00o(java.io.Closeable, com.pd.sdk.O00O0OOO):java.lang.Object");
    }

    @SinceKotlin(version = "1.1")
    @PublishedApi
    public static final void OooO00o(@Nullable Closeable closeable, @Nullable Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C9138oooO0o00.OooO00o(th, th2);
            }
        }
    }
}
