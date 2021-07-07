package com.tencent.bugly.beta.tinker;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.tinker.TinkerUtils;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.library.TinkerLoadLibrary;
import com.tencent.tinker.lib.listener.PatchListener;
import com.tencent.tinker.lib.patch.AbstractPatch;
import com.tencent.tinker.lib.patch.UpgradePatch;
import com.tencent.tinker.lib.reporter.LoadReporter;
import com.tencent.tinker.lib.reporter.PatchReporter;
import com.tencent.tinker.lib.service.PatchResult;
import com.tencent.tinker.lib.tinker.Tinker;
import com.tencent.tinker.lib.tinker.TinkerApplicationHelper;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.lib.util.TinkerLog;
import com.tencent.tinker.lib.util.UpgradePatchRetry;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.lang.Thread;
import java.util.HashMap;

public class TinkerManager {
    public static final String MF_FILE = "YAPATCH.MF";
    public static final String PATCH_DIR = "dex";
    public static final String PATCH_NAME = "patch.apk";
    public static final String TAG = "Tinker.TinkerManager";
    public static String apkOriginalBuildNum = "";
    public static boolean isInstalled;
    public static String patchCurBuildNum = "";
    public static boolean patchRestartOnScreenOff = true;
    public static TinkerPatchResultListener patchResultListener;
    public static Thread.UncaughtExceptionHandler systemExceptionHandler;
    public static TinkerManager tinkerManager = new TinkerManager();
    public static TinkerReport tinkerReport;
    public static TinkerUncaughtExceptionHandler uncaughtExceptionHandler;
    public static LoadReporter userLoadReporter;
    public static PatchListener userPatchListener;
    public static PatchReporter userPatchReporter;
    public static AbstractPatch userUpgradePatchProcessor;
    public Application application;
    public ApplicationLike applicationLike;
    public TinkerListener tinkerListener;

    public interface TinkerListener {
        void onApplyFailure(String str);

        void onApplySuccess(String str);

        void onDownloadFailure(String str);

        void onDownloadSuccess(String str);

        void onPatchRollback();

        void onPatchStart();
    }

    public interface TinkerPatchResultListener {
        void onPatchResult(PatchResult patchResult);
    }

    public static Application getApplication() {
        return getInstance().application;
    }

    public static TinkerManager getInstance() {
        return tinkerManager;
    }

    public static String getNewTinkerId() {
        HashMap packageConfigs = TinkerApplicationHelper.getPackageConfigs(getTinkerApplicationLike());
        if (packageConfigs != null) {
            return String.valueOf(packageConfigs.get("NEW_TINKER_ID")).replace("tinker_id_", "");
        }
        return "";
    }

    public static ApplicationLike getTinkerApplicationLike() {
        return getInstance().applicationLike;
    }

    public static String getTinkerId() {
        if (Tinker.with(getApplication()).isTinkerLoaded()) {
            HashMap packageConfigs = TinkerApplicationHelper.getPackageConfigs(getTinkerApplicationLike());
            if (packageConfigs != null) {
                return String.valueOf(packageConfigs.get("TINKER_ID")).replace("tinker_id_", "");
            }
            return "";
        }
        String manifestTinkerID = ShareTinkerInternals.getManifestTinkerID(getApplication());
        if (!TextUtils.isEmpty(manifestTinkerID)) {
            return manifestTinkerID.replace("tinker_id_", "");
        }
        return "";
    }

    public static void installDefaultTinker(ApplicationLike applicationLike2) {
        if (isInstalled) {
            TinkerLog.w(TAG, "install tinker, but has installed, ignore", new Object[0]);
        } else if (applicationLike2 == null) {
            TinkerLog.e(TAG, "Tinker ApplicationLike is null", new Object[0]);
        } else {
            getInstance().setTinkerApplicationLike(applicationLike2);
            registJavaCrashHandler();
            setUpgradeRetryEnable(true);
            tinkerReport = new TinkerReport();
            TinkerLog.setTinkerLogImp(new TinkerLogger());
            if (TinkerInstaller.install(applicationLike2, new TinkerLoadReporter(applicationLike2.getApplication()), new TinkerPatchReporter(applicationLike2.getApplication()), new TinkerPatchListener(applicationLike2.getApplication()), TinkerResultService.class, new UpgradePatch()) != null) {
                isInstalled = true;
            }
        }
    }

    public static void installTinker(Object obj) {
        if (obj == null) {
            TinkerLog.e(TAG, "Tinker ApplicationLike is null", new Object[0]);
        } else if (obj instanceof ApplicationLike) {
            installDefaultTinker((ApplicationLike) obj);
        } else {
            TinkerLog.e(TAG, "NOT tinker ApplicationLike object", new Object[0]);
        }
    }

    public static boolean isPatchRestartOnScreenOff() {
        return patchRestartOnScreenOff;
    }

    public static boolean isTinkerManagerInstalled() {
        return isInstalled;
    }

    public static void loadArmLibrary(Context context, String str) {
        TinkerLoadLibrary.loadArmLibrary(context, str);
    }

    public static void loadArmV7Library(Context context, String str) {
        TinkerLoadLibrary.loadArmV7Library(context, str);
    }

    public static void loadLibraryFromTinker(Context context, String str, String str2) {
        TinkerLoadLibrary.loadLibraryFromTinker(context, str, str2);
    }

    public static void registJavaCrashHandler() {
        if (uncaughtExceptionHandler == null) {
            systemExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            TinkerUncaughtExceptionHandler tinkerUncaughtExceptionHandler = new TinkerUncaughtExceptionHandler();
            uncaughtExceptionHandler = tinkerUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(tinkerUncaughtExceptionHandler);
        }
    }

    public static void setPatchRestartOnScreenOff(boolean z) {
        patchRestartOnScreenOff = z;
    }

    private void setTinkerApplicationLike(ApplicationLike applicationLike2) {
        this.applicationLike = applicationLike2;
        if (applicationLike2 != null) {
            this.application = applicationLike2.getApplication();
        }
    }

    public static void setUpgradeRetryEnable(boolean z) {
        UpgradePatchRetry.getInstance(getTinkerApplicationLike().getApplication()).setRetryEnable(z);
    }

    public static void unregistJavaCrashHandler() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = systemExceptionHandler;
        if (uncaughtExceptionHandler2 != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler2);
        }
    }

    public void applyPatch(Context context, String str) {
        if (!isInstalled) {
            TinkerLog.w(TAG, "Tinker has not been installed.", new Object[0]);
            return;
        }
        TinkerListener tinkerListener2 = this.tinkerListener;
        if (tinkerListener2 != null) {
            tinkerListener2.onPatchStart();
        }
        TinkerInstaller.onReceiveUpgradePatch(context, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean checkNewPatch(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.tinker.TinkerManager.checkNewPatch(java.lang.String):boolean");
    }

    public void cleanPatch(boolean z) {
        onPatchRollback(z);
    }

    public File getPatchDirectory(Context context) {
        return SharePatchFileUtil.getPatchDirectory(context);
    }

    public TinkerListener getTinkerListener() {
        return this.tinkerListener;
    }

    public void onApplyFailure(String str) {
        TinkerListener tinkerListener2 = this.tinkerListener;
        if (tinkerListener2 != null) {
            tinkerListener2.onApplyFailure(str);
        }
    }

    public void onApplySuccess(String str) {
        TinkerListener tinkerListener2 = this.tinkerListener;
        if (tinkerListener2 != null) {
            tinkerListener2.onApplySuccess(str);
        }
    }

    public void onDownloadFailure(String str) {
        TinkerListener tinkerListener2 = this.tinkerListener;
        if (tinkerListener2 != null) {
            tinkerListener2.onDownloadFailure(str);
        }
    }

    public void onDownloadSuccess(String str, boolean z) {
        try {
            TinkerLog.d(TAG, "onDownloadSuccess.", new Object[0]);
            if (this.tinkerListener != null) {
                this.tinkerListener.onDownloadSuccess(str);
            }
            applyPatch(str, z);
        } catch (Exception unused) {
            TinkerLog.e(TAG, "apply patch failed", new Object[0]);
        }
    }

    public void onPatchRollback(boolean z) {
        if (!Tinker.with(getApplication()).isTinkerLoaded()) {
            TinkerLog.w("Tinker.PatchRequestCallback", "TinkerPatchRequestCallback: onPatchRollback, tinker is not loaded, just return", new Object[0]);
            return;
        }
        if (z) {
            TinkerLog.i(TAG, "delete patch now", new Object[0]);
            TinkerUtils.rollbackPatch(getApplication());
        } else {
            TinkerLog.i(TAG, "tinker wait screen to restart process", new Object[0]);
            new TinkerUtils.ScreenState(getApplication(), new TinkerUtils.ScreenState.IOnScreenOff() {
                /* class com.tencent.bugly.beta.tinker.TinkerManager.C32291 */

                @Override // com.tencent.bugly.beta.tinker.TinkerUtils.ScreenState.IOnScreenOff
                public void onScreenOff() {
                    TinkerUtils.rollbackPatch(TinkerManager.getApplication());
                }
            });
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.tencent.bugly.beta.tinker.TinkerManager.RunnableC32302 */

            public void run() {
                if (TinkerManager.this.tinkerListener != null) {
                    TinkerManager.this.tinkerListener.onPatchRollback();
                }
            }
        });
    }

    public void setTinkerListener(TinkerListener tinkerListener2) {
        this.tinkerListener = tinkerListener2;
    }

    public void setTinkerReport(TinkerReport.Reporter reporter) {
        TinkerReport tinkerReport2 = tinkerReport;
        if (tinkerReport2 != null) {
            tinkerReport2.setReporter(reporter);
        }
    }

    public static void installTinker(Object obj, Object obj2, Object obj3, Object obj4, TinkerPatchResultListener tinkerPatchResultListener, Object obj5) {
        if (obj2 != null) {
            if (obj2 instanceof LoadReporter) {
                userLoadReporter = (LoadReporter) obj2;
            } else {
                TinkerLog.e(TAG, "NOT LoadReporter object", new Object[0]);
                return;
            }
        }
        if (obj3 != null) {
            if (obj3 instanceof PatchReporter) {
                userPatchReporter = (PatchReporter) obj3;
            } else {
                TinkerLog.e(TAG, "NOT PatchReporter object", new Object[0]);
                return;
            }
        }
        if (obj4 != null) {
            if (obj4 instanceof PatchListener) {
                userPatchListener = (PatchListener) obj4;
            } else {
                TinkerLog.e(TAG, "NOT PatchListener object", new Object[0]);
                return;
            }
        }
        if (tinkerPatchResultListener != null) {
            if (tinkerPatchResultListener instanceof TinkerPatchResultListener) {
                patchResultListener = tinkerPatchResultListener;
            } else {
                TinkerLog.e(TAG, "NOT TinkerPatchResultListener object", new Object[0]);
                return;
            }
        }
        if (obj5 != null) {
            if (obj5 instanceof AbstractPatch) {
                userUpgradePatchProcessor = (AbstractPatch) obj5;
            } else {
                TinkerLog.e(TAG, "NOT AbstractPatch object", new Object[0]);
                return;
            }
        }
        installTinker(obj);
    }

    public void applyPatch(String str, boolean z) {
        try {
            File file = new File(this.applicationLike.getApplication().getDir(PATCH_DIR, 0).getAbsolutePath(), PATCH_NAME);
            File file2 = null;
            if (checkNewPatch(str)) {
                TinkerLog.d(TAG, "has new patch.", new Object[0]);
                file2 = new File(str);
                TinkerUtils.copy(file2, file);
            }
            if (!file.exists()) {
                TinkerLog.d(TAG, "patch not exist, just return.", new Object[0]);
            } else if (file2 != null && z) {
                TinkerLog.d(TAG, "starting patch.", new Object[0]);
                applyPatch(this.applicationLike.getApplication(), file2.getAbsolutePath());
            }
        } catch (Exception e) {
            TinkerLog.e(TAG, e.getMessage(), new Object[0]);
        }
    }
}
