package com.p118pd.sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.o000O  reason: case insensitive filesystem */
public final class C6977o000O {
    public static final String OooO00o = "NavUtils";
    public static final String OooO0O0 = "android.support.PARENT_ACTIVITY";

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18192OooO00o(@NonNull Activity activity, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18191OooO00o(@NonNull Activity activity) {
        Intent OooO00o2 = OooO00o(activity);
        if (OooO00o2 != null) {
            OooO00o(activity, OooO00o2);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified." + " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> " + " element in your manifest?)");
    }

    public static void OooO00o(@NonNull Activity activity, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    @Nullable
    public static Intent OooO00o(@NonNull Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String OooO00o2 = m18189OooO00o(activity);
        if (OooO00o2 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, OooO00o2);
        try {
            if (m18190OooO00o((Context) activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = "getParentActivityIntent: bad parentActivityName '" + OooO00o2 + "' in manifest";
            return null;
        }
    }

    @Nullable
    public static Intent OooO00o(@NonNull Context context, @NonNull Class<?> cls) throws PackageManager.NameNotFoundException {
        String OooO00o2 = m18190OooO00o(context, new ComponentName(context, cls));
        if (OooO00o2 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, OooO00o2);
        if (m18190OooO00o(context, componentName) == null) {
            return Intent.makeMainActivity(componentName);
        }
        return new Intent().setComponent(componentName);
    }

    @Nullable
    public static Intent OooO00o(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String OooO00o2 = m18190OooO00o(context, componentName);
        if (OooO00o2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), OooO00o2);
        if (m18190OooO00o(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18189OooO00o(@NonNull Activity activity) {
        try {
            return m18190OooO00o((Context) activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18190OooO00o(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(OooO0O0)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
