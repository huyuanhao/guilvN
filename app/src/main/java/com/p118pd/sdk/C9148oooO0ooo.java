package com.p118pd.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.pd.sdk.oooO0ooo  reason: case insensitive filesystem */
public final class C9148oooO0ooo implements Application.ActivityLifecycleCallbacks {
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;

    private void OooO00o(Activity activity, int i) {
        if (1 == i) {
            String unused = C9112oooO000O.OooOOOo = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = C9112oooO000O.OooOOOo = "";
        }
        C9112oooO000O.m20801OooO00o();
        if (C9120oooO00oO.m20849OooO00o()) {
            C9112oooO000O.OooO0o0();
            synchronized (C9112oooO000O.OooO00o()) {
                C9112oooO000O.OooO00o().put(activity, Integer.valueOf(i));
                OooO00o(i);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        OooO00o(activity, 2);
    }

    public final void onActivityDestroyed(Activity activity) {
        if (C9120oooO00oO.m20849OooO00o()) {
            C9112oooO000O.OooO0o0();
            synchronized (C9112oooO000O.OooO00o()) {
                C9112oooO000O.OooO00o().remove(activity);
                OooO00o(2);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        OooO00o(activity, 2);
    }

    public final void onActivityResumed(Activity activity) {
        OooO00o(activity, 1);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        OooO00o(activity, 1);
    }

    public final void onActivityStopped(Activity activity) {
        OooO00o(activity, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(int r4) {
        /*
            r3 = this;
            boolean r0 = com.p118pd.sdk.C9278ooooo0.m21166OooO()
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "[LifeCycle] ignore state change while crashing"
            java.lang.String r0 = "crashsdk"
            com.p118pd.sdk.C9090ooOooo0O.OooO00o(r0, r4)
            return
        L_0x000e:
            r0 = 1
            if (r0 != r4) goto L_0x0013
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 != 0) goto L_0x003d
            java.util.WeakHashMap r1 = com.p118pd.sdk.C9112oooO000O.OooO00o()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x0022
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r0) goto L_0x0022
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            boolean r4 = r3.OooO0O0
            if (r4 == r0) goto L_0x0047
            com.p118pd.sdk.C9112oooO000O.OooO0O0(r0)
            r3.OooO0O0 = r0
        L_0x0047:
            java.util.WeakHashMap r4 = com.p118pd.sdk.C9112oooO000O.OooO00o()
            boolean r4 = r4.isEmpty()
            boolean r0 = r3.OooO0OO
            if (r0 == r4) goto L_0x005a
            if (r4 == 0) goto L_0x0058
            com.p118pd.sdk.C9112oooO000O.m20821OooOO0()
        L_0x0058:
            r3.OooO0OO = r4
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9148oooO0ooo.OooO00o(int):void");
    }
}
