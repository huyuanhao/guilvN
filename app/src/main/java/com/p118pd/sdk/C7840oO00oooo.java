package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.pd.sdk.oO00oooo  reason: case insensitive filesystem */
public final class C7840oO00oooo {
    public static final String OooO00o = "AppVersionSignature";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ConcurrentMap<String, AbstractC7644o0oOoOO> f20888OooO00o = new ConcurrentHashMap();

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC7644o0oOoOO m19515OooO00o(@NonNull Context context) {
        String packageName = context.getPackageName();
        AbstractC7644o0oOoOO o0ooooo = f20888OooO00o.get(packageName);
        if (o0ooooo != null) {
            return o0ooooo;
        }
        AbstractC7644o0oOoOO OooO0O0 = OooO0O0(context);
        AbstractC7644o0oOoOO putIfAbsent = f20888OooO00o.putIfAbsent(packageName, OooO0O0);
        return putIfAbsent == null ? OooO0O0 : putIfAbsent;
    }

    @NonNull
    public static AbstractC7644o0oOoOO OooO0O0(@NonNull Context context) {
        return new C7885oO0Oo00O(OooO00o(OooO00o(context)));
    }

    @VisibleForTesting
    public static void OooO00o() {
        f20888OooO00o.clear();
    }

    @NonNull
    public static String OooO00o(@Nullable PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    @Nullable
    public static PackageInfo OooO00o(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = "Cannot resolve info for" + context.getPackageName();
            return null;
        }
    }
}
