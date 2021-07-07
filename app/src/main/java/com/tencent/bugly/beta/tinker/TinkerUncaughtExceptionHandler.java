package com.tencent.bugly.beta.tinker;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.tinker.TinkerApplicationHelper;
import com.tencent.tinker.lib.util.TinkerLog;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.lang.Thread;

public class TinkerUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final String DALVIK_XPOSED_CRASH = "Class ref in pre-verified class resolved to unexpected implementation";
    public static final int MAX_CRASH_COUNT = 3;
    public static final long QUICK_CRASH_ELAPSE = 10000;
    public static final String TAG = "Tinker.TinkerUncaughtExceptionHandler";
    public final Thread.UncaughtExceptionHandler ueh = Thread.getDefaultUncaughtExceptionHandler();

    private boolean tinkerFastCrashProtect() {
        ApplicationLike tinkerApplicationLike = TinkerManager.getTinkerApplicationLike();
        if (tinkerApplicationLike != null && tinkerApplicationLike.getApplication() != null && TinkerApplicationHelper.isTinkerLoadSuccess(tinkerApplicationLike) && SystemClock.elapsedRealtime() - tinkerApplicationLike.getApplicationStartElapsedTime() < QUICK_CRASH_ELAPSE) {
            String currentVersion = TinkerApplicationHelper.getCurrentVersion(tinkerApplicationLike);
            if (ShareTinkerInternals.isNullOrNil(currentVersion)) {
                return false;
            }
            SharedPreferences sharedPreferences = tinkerApplicationLike.getApplication().getSharedPreferences("tinker_share_config", 0);
            int i = sharedPreferences.getInt(currentVersion, 0) + 1;
            if (i >= 3) {
                TinkerReport.onFastCrashProtect();
                TinkerApplicationHelper.cleanPatch(tinkerApplicationLike);
                TinkerLog.e(TAG, "tinker has fast crash more than %d, we just clean patch!", new Object[]{Integer.valueOf(i)});
                return true;
            }
            sharedPreferences.edit().putInt(currentVersion, i).apply();
            TinkerLog.e(TAG, "tinker has fast crash %d times", new Object[]{Integer.valueOf(i)});
        }
        return false;
    }

    private void tinkerPreVerifiedCrashHandler(Throwable th) {
        ApplicationLike tinkerApplicationLike = TinkerManager.getTinkerApplicationLike();
        if (tinkerApplicationLike == null || tinkerApplicationLike.getApplication() == null) {
            TinkerLog.w(TAG, "applicationlike is null", new Object[0]);
        } else if (!TinkerApplicationHelper.isTinkerLoadSuccess(tinkerApplicationLike)) {
            TinkerLog.w(TAG, "tinker is not loaded", new Object[0]);
        } else {
            boolean z = false;
            while (th != null) {
                if (!z) {
                    z = TinkerUtils.isXposedExists(th);
                }
                if (z) {
                    if ((th instanceof IllegalAccessError) && th.getMessage().contains(DALVIK_XPOSED_CRASH)) {
                        TinkerReport.onXposedCrash();
                        TinkerLog.e(TAG, "have xposed: just clean tinker", new Object[0]);
                        ShareTinkerInternals.killAllOtherProcess(tinkerApplicationLike.getApplication());
                        TinkerApplicationHelper.cleanPatch(tinkerApplicationLike);
                        ShareTinkerInternals.setTinkerDisableWithSharedPreferences(tinkerApplicationLike.getApplication());
                        return;
                    }
                }
                th = th.getCause();
            }
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        TinkerLog.e(TAG, "uncaughtException:" + th.getMessage(), new Object[0]);
        tinkerFastCrashProtect();
        tinkerPreVerifiedCrashHandler(th);
        this.ueh.uncaughtException(thread, th);
    }
}
