package androidx.core.app;

import android.app.Service;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ServiceCompat {
    public static final int OooO00o = 1;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StopForegroundFlags {
    }

    public static void OooO00o(@NonNull Service service, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            service.stopForeground(i);
            return;
        }
        boolean z = true;
        if ((i & 1) == 0) {
            z = false;
        }
        service.stopForeground(z);
    }
}
