package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import anet.channel.util.ALog;
import anetwork.channel.aidl.NetworkService;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.pd.sdk.o0O0oO  reason: case insensitive filesystem */
public class C7337o0O0oO {
    public static ServiceConnection OooO00o = new ServiceConnectionC7342o0O0oOO0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Handler f20054OooO00o = new Handler(Looper.getMainLooper());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile AbstractC7328o0O0o00O f20055OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile CountDownLatch f20056OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static volatile boolean f20057OooO00o;
    public static volatile boolean OooO0O0;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        anet.channel.util.ALog.m290i("anet.RemoteGetter", "[initRemoteGetterAndWait]begin to wait", null, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (com.p118pd.sdk.C7337o0O0oO.f20056OooO00o.await((long) com.p118pd.sdk.C7348o0O0oo.OooO0OO(), java.util.concurrent.TimeUnit.SECONDS) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        anet.channel.util.ALog.m290i("anet.RemoteGetter", "mServiceBindLock count down to 0", null, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        anet.channel.util.ALog.m290i("anet.RemoteGetter", "mServiceBindLock wait timeout", null, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(android.content.Context r4, boolean r5) {
        /*
            com.pd.sdk.o0O0o00O r0 = com.p118pd.sdk.C7337o0O0oO.f20055OooO00o
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = com.p118pd.sdk.C7337o0O0oO.f20057OooO00o
            if (r0 != 0) goto L_0x0062
            OooO00o(r4)
            boolean r4 = com.p118pd.sdk.C7337o0O0oO.f20057OooO00o
            if (r4 != 0) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            r4 = 0
            r5 = 0
            java.lang.Class<com.pd.sdk.o0O0oO> r0 = com.p118pd.sdk.C7337o0O0oO.class
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0059 }
            com.pd.sdk.o0O0o00O r1 = com.p118pd.sdk.C7337o0O0oO.f20055OooO00o     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x001d:
            java.util.concurrent.CountDownLatch r1 = com.p118pd.sdk.C7337o0O0oO.f20056OooO00o     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0029
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0056 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0056 }
            com.p118pd.sdk.C7337o0O0oO.f20056OooO00o = r1     // Catch:{ all -> 0x0056 }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "anet.RemoteGetter"
            java.lang.String r1 = "[initRemoteGetterAndWait]begin to wait"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            anet.channel.util.ALog.m290i(r0, r1, r5, r2)
            java.util.concurrent.CountDownLatch r0 = com.p118pd.sdk.C7337o0O0oO.f20056OooO00o
            int r1 = com.p118pd.sdk.C7348o0O0oo.OooO0OO()
            long r1 = (long) r1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            boolean r0 = r0.await(r1, r3)
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "anet.RemoteGetter"
            java.lang.String r1 = "mServiceBindLock count down to 0"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            anet.channel.util.ALog.m290i(r0, r1, r5, r2)
            goto L_0x0062
        L_0x004c:
            java.lang.String r0 = "anet.RemoteGetter"
            java.lang.String r1 = "mServiceBindLock wait timeout"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            anet.channel.util.ALog.m290i(r0, r1, r5, r2)
            goto L_0x0062
        L_0x0056:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0059:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = "anet.RemoteGetter"
            java.lang.String r1 = "mServiceBindLock wait interrupt"
            anet.channel.util.ALog.m289e(r0, r1, r5, r4)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7337o0O0oO.OooO00o(android.content.Context, boolean):void");
    }

    public static AbstractC7328o0O0o00O OooO00o() {
        return f20055OooO00o;
    }

    public static void OooO00o(Context context) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("anet.RemoteGetter", "[asyncBindService] mContext:" + context + " bBindFailed:" + f20057OooO00o + " bBinding:" + OooO0O0, null, new Object[0]);
        }
        if (context != null && !f20057OooO00o && !OooO0O0) {
            OooO0O0 = true;
            Intent intent = new Intent(context, NetworkService.class);
            intent.setAction(AbstractC7328o0O0o00O.class.getName());
            intent.addCategory("android.intent.category.DEFAULT");
            f20057OooO00o = !context.bindService(intent, OooO00o, 1);
            if (f20057OooO00o) {
                OooO0O0 = false;
                ALog.m292w("anet.RemoteGetter", "[asyncBindService]ANet_Service start not success. ANet run with local mode!", null, new Object[0]);
            }
            f20054OooO00o.postDelayed(new RunnableC7341o0O0oOO(), TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
        }
    }
}
