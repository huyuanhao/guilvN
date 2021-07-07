package com.qiyukf.unicorn.p232k;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.unicorn.k.l */
public final class C2714l {
    /* renamed from: a */
    public static boolean m6275a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo[] allNetworkInfo;
        if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null)) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m6276b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return context.getString(C2364R.string.ysf_service_title_default);
        }
    }
}
