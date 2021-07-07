package androidx.core.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ConnectivityManagerCompat {
    public static final int OooO00o = 1;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface RestrictBackgroundStatus {
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m14558OooO00o(@NonNull ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 7 || type == 9) {
            return false;
        }
        return true;
    }

    @Nullable
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo OooO00o(@NonNull ConnectivityManager connectivityManager, @NonNull Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int OooO00o(@NonNull ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 3;
    }
}
