package com.p118pd.sdk;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o000OO0O */
public final class o000OO0O {
    public static void OooO00o(@NonNull AlarmManager alarmManager, long j, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
        if (Build.VERSION.SDK_INT >= 21) {
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent2);
        } else {
            OooO0O0(alarmManager, 0, j, pendingIntent2);
        }
    }

    public static void OooO0O0(@NonNull AlarmManager alarmManager, int i, long j, @NonNull PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void OooO0OO(@NonNull AlarmManager alarmManager, int i, long j, @NonNull PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        } else {
            OooO0O0(alarmManager, i, j, pendingIntent);
        }
    }

    public static void OooO00o(@NonNull AlarmManager alarmManager, int i, long j, @NonNull PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }
}
