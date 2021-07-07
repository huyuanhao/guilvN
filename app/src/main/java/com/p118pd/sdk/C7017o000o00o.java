package com.p118pd.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.pd.sdk.o000o00o  reason: case insensitive filesystem */
public class C7017o000o00o {
    @VisibleForTesting
    public static final String OooO00o = "com.android.launcher.action.INSTALL_SHORTCUT";
    @VisibleForTesting
    public static final String OooO0O0 = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: com.pd.sdk.o000o00o$OooO00o */
    public static class OooO00o extends BroadcastReceiver {
        public final /* synthetic */ IntentSender OooO00o;

        public OooO00o(IntentSender intentSender) {
            this.OooO00o = intentSender;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.OooO00o.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0013
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r4 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r4 = (android.content.pm.ShortcutManager) r4
            boolean r4 = r4.isRequestPinShortcutSupported()
            return r4
        L_0x0013:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = com.p118pd.sdk.C7009o000OoOo.OooO00o(r4, r0)
            r2 = 0
            if (r1 == 0) goto L_0x001d
            return r2
        L_0x001d:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0030:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x004c
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0030
        L_0x004c:
            r4 = 1
            return r4
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7017o000o00o.OooO00o(android.content.Context):boolean");
    }

    public static boolean OooO00o(@NonNull Context context, @NonNull C7016o000o00O o000o00o, @Nullable IntentSender intentSender) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(o000o00o.m18273OooO00o(), intentSender);
        }
        if (!OooO00o(context)) {
            return false;
        }
        Intent OooO00o2 = o000o00o.OooO00o(new Intent(OooO00o));
        if (intentSender == null) {
            context.sendBroadcast(OooO00o2);
            return true;
        }
        context.sendOrderedBroadcast(OooO00o2, null, new OooO00o(intentSender), null, -1, null, null);
        return true;
    }

    @NonNull
    public static Intent OooO00o(@NonNull Context context, @NonNull C7016o000o00O o000o00o) {
        Intent createShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(o000o00o.m18273OooO00o()) : null;
        if (createShortcutResultIntent == null) {
            createShortcutResultIntent = new Intent();
        }
        return o000o00o.OooO00o(createShortcutResultIntent);
    }
}
