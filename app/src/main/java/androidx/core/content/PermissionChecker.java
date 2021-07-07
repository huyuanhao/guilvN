package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.p118pd.sdk.C6989o000O0oO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionChecker {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = -1;
    public static final int OooO0OO = -2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface PermissionResult {
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str, int i, int i2, @Nullable String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String OooO00o2 = C6989o000O0oO.OooO00o(str);
        if (OooO00o2 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C6989o000O0oO.OooO0O0(context, OooO00o2, str2) != 0) {
            return -2;
        }
        return 0;
    }

    public static int OooO0O0(@NonNull Context context, @NonNull String str) {
        return OooO00o(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return OooO00o(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str) {
        return OooO00o(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }
}
