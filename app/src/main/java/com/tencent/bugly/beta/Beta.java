package com.tencent.bugly.beta;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.bugly.AbstractC3215a;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.C3222a;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.C3227f;
import com.tencent.bugly.beta.global.ResBean;
import com.tencent.bugly.beta.global.RunnableC3225d;
import com.tencent.bugly.beta.interfaces.BetaPatchListener;
import com.tencent.bugly.beta.p267ui.C3244h;
import com.tencent.bugly.beta.p267ui.UILifecycleListener;
import com.tencent.bugly.beta.tinker.TinkerApplicationLike;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import com.tencent.bugly.beta.upgrade.C3247c;
import com.tencent.bugly.beta.upgrade.UpgradeListener;
import com.tencent.bugly.beta.upgrade.UpgradeStateListener;
import com.tencent.bugly.beta.utils.C3254e;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.proguard.C3303ac;
import com.tencent.bugly.proguard.C3319am;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;
import com.tencent.bugly.proguard.C3360p;
import com.tencent.bugly.proguard.C3361q;
import com.tencent.bugly.proguard.C3363r;
import com.tencent.bugly.proguard.C3365s;
import com.tencent.bugly.proguard.C3368u;
import com.tencent.bugly.proguard.C3369v;
import com.tencent.bugly.proguard.C3370w;
import com.tencent.bugly.proguard.C3372y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Beta extends AbstractC3215a {
    public static final String TAG_CANCEL_BUTTON = "beta_cancel_button";
    public static final String TAG_CONFIRM_BUTTON = "beta_confirm_button";
    public static final String TAG_IMG_BANNER = "beta_upgrade_banner";
    public static final String TAG_TIP_MESSAGE = "beta_tip_message";
    public static final String TAG_TITLE = "beta_title";
    public static final String TAG_UPGRADE_FEATURE = "beta_upgrade_feature";
    public static final String TAG_UPGRADE_INFO = "beta_upgrade_info";

    /* renamed from: a */
    public static DownloadTask f7327a = null;
    public static String appChannel = null;
    public static int appVersionCode = Integer.MIN_VALUE;
    public static String appVersionName = null;
    public static boolean autoCheckUpgrade = true;
    public static boolean autoDownloadOn4g = false;
    public static boolean autoDownloadOnWifi = false;
    public static boolean autoInit = true;
    public static boolean autoInstallApk = true;
    public static BetaPatchListener betaPatchListener = null;
    public static boolean canAutoDownloadPatch = true;
    public static boolean canAutoPatch = true;
    public static List<Class<? extends Activity>> canNotShowUpgradeActs = Collections.synchronizedList(new ArrayList());
    public static boolean canNotifyUserRestart = false;
    public static boolean canShowApkInfo = true;
    public static List<Class<? extends Activity>> canShowUpgradeActs = Collections.synchronizedList(new ArrayList());
    public static int defaultBannerId = 0;
    public static boolean dialogFullScreen = false;
    public static DownloadListener downloadListener = null;
    public static boolean enableHotfix = false;
    public static boolean enableNotification = true;
    public static long initDelay = 3000;
    public static String initProcessName = null;
    public static Beta instance = new Beta();
    public static int largeIconId = 0;
    public static boolean setPatchRestartOnScreenOff = true;
    public static boolean showInterruptedStrategy = true;
    public static int smallIconId = 0;
    public static List<String> soBlackList = Collections.synchronizedList(new ArrayList());
    public static File storageDir = null;
    public static String strNetworkTipsCancelBtn = "取消";
    public static String strNetworkTipsConfirmBtn = "继续下载";
    public static String strNetworkTipsMessage = "你已切换到移动网络，是否继续当前下载？";
    public static String strNetworkTipsTitle = "网络提示";
    public static String strNotificationClickToContinue = "继续下载";
    public static String strNotificationClickToInstall = "点击安装";
    public static String strNotificationClickToRetry = "点击重试";
    public static String strNotificationClickToView = "点击查看";
    public static String strNotificationDownloadError = "下载失败";
    public static String strNotificationDownloadSucc = "下载完成";
    public static String strNotificationDownloading = "正在下载";
    public static String strNotificationHaveNewVersion = "有新版本";
    public static String strToastCheckUpgradeError = "检查新版本失败，请稍后重试";
    public static String strToastCheckingUpgrade = "正在检查，请稍候...";
    public static String strToastYourAreTheLatestVersion = "你已经是最新版了";
    public static String strUpgradeDialogCancelBtn = "下次再说";
    public static String strUpgradeDialogContinueBtn = "继续";
    public static String strUpgradeDialogFeatureLabel = "更新说明";
    public static String strUpgradeDialogFileSizeLabel = "包大小";
    public static String strUpgradeDialogInstallBtn = "安装";
    public static String strUpgradeDialogRetryBtn = "重试";
    public static String strUpgradeDialogUpdateTimeLabel = "更新时间";
    public static String strUpgradeDialogUpgradeBtn = "立即更新";
    public static String strUpgradeDialogVersionLabel = "版本";
    public static int tipsDialogLayoutId;
    public static long upgradeCheckPeriod;
    public static int upgradeDialogLayoutId;
    public static UILifecycleListener<UpgradeInfo> upgradeDialogLifecycleListener;
    public static UpgradeListener upgradeListener;
    public static UpgradeStateListener upgradeStateListener;

    public static void applyDownloadedPatch() {
        if (new File(C3226e.f7357E.f7365H.getAbsolutePath()).exists()) {
            TinkerManager.getInstance().applyPatch(C3226e.f7357E.f7365H.getAbsolutePath(), true);
        } else {
            C3321an.m8354c(Beta.class, "[applyDownloadedPatch] patch file not exist", new Object[0]);
        }
    }

    public static void applyTinkerPatch(Context context, String str) {
        TinkerManager.getInstance().applyPatch(context, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (((java.lang.Boolean) r1[2]).booleanValue() == com.tencent.bugly.beta.upgrade.C3247c.f7488a.f7494g) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void cancelDownload() {
        /*
            com.tencent.bugly.beta.upgrade.c r0 = com.tencent.bugly.beta.upgrade.C3247c.f7488a
            com.tencent.bugly.beta.global.d r1 = r0.f7496i
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r1 = r1.f7356b
            r5 = r1[r4]
            com.tencent.bugly.beta.download.DownloadTask r6 = r0.f7490c
            if (r5 != r6) goto L_0x0025
            r5 = r1[r3]
            com.tencent.bugly.beta.upgrade.BetaGrayStrategy r0 = r0.f7489b
            if (r5 != r0) goto L_0x0025
            r0 = r1[r2]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.tencent.bugly.beta.upgrade.c r1 = com.tencent.bugly.beta.upgrade.C3247c.f7488a
            boolean r1 = r1.f7494g
            if (r0 == r1) goto L_0x0043
        L_0x0025:
            com.tencent.bugly.beta.upgrade.c r0 = com.tencent.bugly.beta.upgrade.C3247c.f7488a
            com.tencent.bugly.beta.global.d r1 = new com.tencent.bugly.beta.global.d
            r5 = 14
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.bugly.beta.download.DownloadTask r7 = r0.f7490c
            r6[r4] = r7
            com.tencent.bugly.beta.upgrade.BetaGrayStrategy r4 = r0.f7489b
            r6[r3] = r4
            boolean r3 = r0.f7494g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6[r2] = r3
            r1.<init>(r5, r6)
            r0.f7496i = r1
        L_0x0043:
            com.tencent.bugly.beta.upgrade.c r0 = com.tencent.bugly.beta.upgrade.C3247c.f7488a
            com.tencent.bugly.beta.global.d r0 = r0.f7496i
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.Beta.cancelDownload():void");
    }

    public static void checkUpgrade() {
        checkUpgrade(true, false);
    }

    public static void cleanTinkerPatch(boolean z) {
        C3222a.m7760a("IS_PATCH_ROLL_BACK", false);
        TinkerManager.getInstance().cleanPatch(z);
    }

    public static void downloadPatch() {
        C3361q qVar = C3361q.f8239a;
        qVar.f8240b = qVar.mo38506a(null);
        try {
            if (C3361q.f8239a.f8240b != null) {
                C3361q.f8239a.mo38507a(0, C3361q.f8239a.f8240b.f7476a, true);
            }
        } catch (Exception unused) {
        }
    }

    public static Beta getInstance() {
        Beta beta = instance;
        beta.f7321id = 1002;
        beta.version = "1.3.7";
        beta.versionKey = "G10";
        return beta;
    }

    public static DownloadTask getStrategyTask() {
        if (f7327a == null) {
            C3247c.f7488a.f7489b = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
            if (C3247c.f7488a.f7489b != null) {
                f7327a = C3226e.f7357E.f7403p.mo37901a(C3247c.f7488a.f7489b.f7476a.f8296f.f8256b, C3226e.f7357E.f7407t.getAbsolutePath(), null, C3247c.f7488a.f7489b.f7476a.f8296f.f8255a);
                C3247c.f7488a.f7490c = f7327a;
            }
        }
        return C3247c.f7488a.f7490c;
    }

    public static UpgradeInfo getUpgradeInfo() {
        try {
            C3247c.f7488a.f7489b = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
            if (C3247c.f7488a.f7489b != null) {
                return new UpgradeInfo(C3247c.f7488a.f7489b.f7476a);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static synchronized C3372y getUpgradeStrategy() {
        synchronized (Beta.class) {
            C3247c.f7488a.f7489b = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
            try {
                if (C3247c.f7488a.f7489b != null) {
                    return (C3372y) C3247c.f7488a.f7489b.f7476a.clone();
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static synchronized void init(Context context, boolean z) {
        synchronized (Beta.class) {
            C3321an.m8349a("Beta init start....", new Object[0]);
            C3303ac a = C3303ac.m8229a();
            int i = instance.f7321id;
            int i2 = C3226e.f7358a + 1;
            C3226e.f7358a = i2;
            a.mo38334a(i, i2);
            if (TextUtils.isEmpty(initProcessName)) {
                initProcessName = context.getPackageName();
            }
            C3321an.m8349a("Beta will init at: %s", initProcessName);
            String str = C3269a.m7966b().f7681e;
            C3321an.m8349a("current process: %s", str);
            if (TextUtils.equals(initProcessName, str)) {
                C3226e eVar = C3226e.f7357E;
                if (!TextUtils.isEmpty(eVar.f7409v)) {
                    C3321an.m8356d("Beta has been initialized [apkMD5 : %s]", eVar.f7409v);
                    return;
                }
                C3321an.m8349a("current upgrade sdk version:1.3.7", new Object[0]);
                eVar.f7362D = z;
                if (upgradeCheckPeriod < 0) {
                    C3321an.m8356d("upgradeCheckPeriod cannot be negative", new Object[0]);
                } else {
                    eVar.f7390c = upgradeCheckPeriod;
                    C3321an.m8349a("setted upgradeCheckPeriod: %d", Long.valueOf(upgradeCheckPeriod));
                }
                if (initDelay < 0) {
                    C3321an.m8356d("initDelay cannot be negative", new Object[0]);
                } else {
                    eVar.f7389b = initDelay;
                    C3321an.m8349a("setted initDelay: %d", Long.valueOf(initDelay));
                }
                if (smallIconId != 0) {
                    try {
                        if (context.getResources().getDrawable(smallIconId) != null) {
                            eVar.f7393f = smallIconId;
                            C3321an.m8349a("setted smallIconId: %d", Integer.valueOf(smallIconId));
                        }
                    } catch (Exception e) {
                        C3321an.m8357e("smallIconId is not available:\n %s", e.toString());
                    }
                }
                if (largeIconId != 0) {
                    try {
                        if (context.getResources().getDrawable(largeIconId) != null) {
                            eVar.f7394g = largeIconId;
                            C3321an.m8349a("setted largeIconId: %d", Integer.valueOf(largeIconId));
                        }
                    } catch (Exception e2) {
                        C3321an.m8357e("largeIconId is not available:\n %s", e2.toString());
                    }
                }
                if (defaultBannerId != 0) {
                    try {
                        if (context.getResources().getDrawable(defaultBannerId) != null) {
                            eVar.f7395h = defaultBannerId;
                            C3321an.m8349a("setted defaultBannerId: %d", Integer.valueOf(defaultBannerId));
                        }
                    } catch (Exception e3) {
                        C3321an.m8357e("defaultBannerId is not available:\n %s", e3.toString());
                    }
                }
                if (upgradeDialogLayoutId != 0) {
                    try {
                        XmlResourceParser layout = context.getResources().getLayout(upgradeDialogLayoutId);
                        if (layout != null) {
                            eVar.f7396i = upgradeDialogLayoutId;
                            C3321an.m8349a("setted upgradeDialogLayoutId: %d", Integer.valueOf(upgradeDialogLayoutId));
                            layout.close();
                        }
                    } catch (Exception e4) {
                        C3321an.m8357e("upgradeDialogLayoutId is not available:\n %s", e4.toString());
                    }
                }
                if (tipsDialogLayoutId != 0) {
                    try {
                        XmlResourceParser layout2 = context.getResources().getLayout(tipsDialogLayoutId);
                        if (layout2 != null) {
                            eVar.f7397j = tipsDialogLayoutId;
                            C3321an.m8349a("setted tipsDialogLayoutId: %d", Integer.valueOf(tipsDialogLayoutId));
                            layout2.close();
                        }
                    } catch (Exception e5) {
                        C3321an.m8357e("tipsDialogLayoutId is not available:\n %s", e5.toString());
                    }
                }
                if (upgradeDialogLifecycleListener != null) {
                    try {
                        eVar.f7398k = upgradeDialogLifecycleListener;
                        C3321an.m8349a("setted upgradeDialogLifecycleListener:%s" + upgradeDialogLifecycleListener, new Object[0]);
                    } catch (Exception e6) {
                        C3321an.m8357e("upgradeDialogLifecycleListener is not available:\n %", e6.toString());
                    }
                }
                if (canShowUpgradeActs != null && !canShowUpgradeActs.isEmpty()) {
                    for (Class<? extends Activity> cls : canShowUpgradeActs) {
                        if (cls != null) {
                            eVar.f7400m.add(cls);
                        }
                    }
                    C3321an.m8349a("setted canShowUpgradeActs: %s", eVar.f7400m);
                }
                if (canNotShowUpgradeActs != null && !canNotShowUpgradeActs.isEmpty()) {
                    for (Class<? extends Activity> cls2 : canNotShowUpgradeActs) {
                        if (cls2 != null) {
                            eVar.f7401n.add(cls2);
                        }
                    }
                    C3321an.m8349a("setted canNotShowUpgradeActs: %s", eVar.f7401n);
                }
                boolean z2 = autoCheckUpgrade;
                eVar.f7391d = z2;
                Object[] objArr = new Object[1];
                objArr[0] = z2 ? "is opened" : "is closed";
                C3321an.m8349a("autoCheckUpgrade %s", objArr);
                boolean z3 = autoInstallApk;
                eVar.f7387ad = z3;
                Object[] objArr2 = new Object[1];
                objArr2[0] = z3 ? "is opened" : "is closed";
                C3321an.m8349a("autoInstallApk %s", objArr2);
                boolean z4 = autoDownloadOn4g;
                eVar.f7377T = z4;
                Object[] objArr3 = new Object[1];
                objArr3[0] = z4 ? "is opened" : "is closed";
                C3321an.m8349a("autoDownloadOn4g %s", objArr3);
                boolean z5 = showInterruptedStrategy;
                eVar.f7392e = z5;
                Object[] objArr4 = new Object[1];
                objArr4[0] = z5 ? "is opened" : "is closed";
                C3321an.m8349a("showInterruptedStrategy %s", objArr4);
                Object[] objArr5 = new Object[1];
                objArr5[0] = upgradeListener != null ? "is opened" : "is closed";
                C3321an.m8349a("isDIY %s", objArr5);
                if (storageDir != null) {
                    if (storageDir.exists() || storageDir.mkdirs()) {
                        eVar.f7399l = storageDir;
                        C3321an.m8349a("setted storageDir: %s", storageDir.getAbsolutePath());
                    } else {
                        C3321an.m8349a("storageDir is not exists: %s", storageDir.getAbsolutePath());
                    }
                }
                if (eVar.f7403p == null) {
                    eVar.f7403p = C3365s.f8247a;
                }
                if (TextUtils.isEmpty(eVar.f7408u)) {
                    eVar.f7408u = C3269a.m7966b().mo38161f();
                }
                eVar.f7375R = enableNotification;
                C3321an.m8349a("enableNotification %s", enableNotification + "");
                eVar.f7376S = autoDownloadOnWifi;
                C3321an.m8349a("autoDownloadOnWifi %s", autoDownloadOnWifi + "");
                eVar.f7378U = canShowApkInfo;
                C3321an.m8349a("canShowApkInfo %s", canShowApkInfo + "");
                eVar.f7379V = canAutoPatch;
                C3321an.m8349a("canAutoPatch %s", canAutoPatch + "");
                eVar.f7380W = betaPatchListener;
                eVar.f7411x = appVersionName;
                eVar.f7410w = appVersionCode;
                eVar.f7381X = canNotifyUserRestart;
                C3321an.m8349a("canNotifyUserRestart %s", canNotifyUserRestart + "");
                eVar.f7382Y = canAutoDownloadPatch;
                C3321an.m8349a("canAutoDownloadPatch %s", canAutoDownloadPatch + "");
                eVar.f7383Z = enableHotfix;
                C3321an.m8349a("enableHotfix %s", enableHotfix + "");
                TinkerManager.setPatchRestartOnScreenOff(setPatchRestartOnScreenOff);
                C3321an.m8349a("setPatchRestartOnScreenOff %s", setPatchRestartOnScreenOff + "");
                if (soBlackList != null && !soBlackList.isEmpty()) {
                    for (String str2 : soBlackList) {
                        if (str2 != null) {
                            eVar.f7384aa.add(str2);
                        }
                    }
                    C3321an.m8349a("setted soBlackList: %s", eVar.f7384aa);
                }
                if (appChannel != null) {
                    eVar.f7373P = appChannel;
                    C3321an.m8349a("Beta channel %s", appChannel);
                }
                eVar.mo37914a(context);
                ResBean resBean = (ResBean) C3222a.m7756a("rb.bch", ResBean.CREATOR);
                ResBean.f7346a = resBean;
                if (resBean == null) {
                    ResBean.f7346a = new ResBean();
                }
                C3247c.f7488a.f7492e = upgradeListener;
                C3247c.f7488a.f7493f = upgradeStateListener;
                C3247c.f7488a.f7491d = downloadListener;
                if (!(getStrategyTask() == null || downloadListener == null)) {
                    getStrategyTask().addListener(C3247c.f7488a.f7491d);
                }
                if (enableHotfix) {
                    C3321an.m8349a("enableHotfix %s", "1");
                    C3325ap.m8420b("D4", "1");
                    C3363r.m8608a(context);
                }
                Resources resources = context.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                Configuration configuration = resources.getConfiguration();
                Locale locale = Locale.getDefault();
                configuration.locale = locale;
                if (locale.equals(Locale.US) || configuration.locale.equals(Locale.ENGLISH)) {
                    strToastYourAreTheLatestVersion = context.getResources().getString(C3217R.string.strToastYourAreTheLatestVersion);
                    strToastCheckUpgradeError = context.getResources().getString(C3217R.string.strToastCheckUpgradeError);
                    strToastCheckingUpgrade = context.getResources().getString(C3217R.string.strToastCheckingUpgrade);
                    strNotificationDownloading = context.getResources().getString(C3217R.string.strNotificationDownloading);
                    strNotificationClickToView = context.getResources().getString(C3217R.string.strNotificationClickToView);
                    strNotificationClickToInstall = context.getResources().getString(C3217R.string.strNotificationClickToInstall);
                    strNotificationClickToContinue = context.getResources().getString(C3217R.string.strNotificationClickToContinue);
                    strNotificationClickToRetry = context.getResources().getString(C3217R.string.strNotificationClickToRetry);
                    strNotificationDownloadSucc = context.getResources().getString(C3217R.string.strNotificationDownloadSucc);
                    strNotificationDownloadError = context.getResources().getString(C3217R.string.strNotificationDownloadError);
                    strNotificationHaveNewVersion = context.getResources().getString(C3217R.string.strNotificationHaveNewVersion);
                    strNetworkTipsMessage = context.getResources().getString(C3217R.string.strNetworkTipsMessage);
                    strNetworkTipsTitle = context.getResources().getString(C3217R.string.strNetworkTipsTitle);
                    strNetworkTipsConfirmBtn = context.getResources().getString(C3217R.string.strNetworkTipsConfirmBtn);
                    strNetworkTipsCancelBtn = context.getResources().getString(C3217R.string.strNetworkTipsCancelBtn);
                    strUpgradeDialogVersionLabel = context.getResources().getString(C3217R.string.strUpgradeDialogVersionLabel);
                    strUpgradeDialogFileSizeLabel = context.getResources().getString(C3217R.string.strUpgradeDialogFileSizeLabel);
                    strUpgradeDialogUpdateTimeLabel = context.getResources().getString(C3217R.string.strUpgradeDialogUpdateTimeLabel);
                    strUpgradeDialogFeatureLabel = context.getResources().getString(C3217R.string.strUpgradeDialogFeatureLabel);
                    strUpgradeDialogUpgradeBtn = context.getResources().getString(C3217R.string.strUpgradeDialogUpgradeBtn);
                    strUpgradeDialogInstallBtn = context.getResources().getString(C3217R.string.strUpgradeDialogInstallBtn);
                    strUpgradeDialogRetryBtn = context.getResources().getString(C3217R.string.strUpgradeDialogRetryBtn);
                    strUpgradeDialogContinueBtn = context.getResources().getString(C3217R.string.strUpgradeDialogContinueBtn);
                    strUpgradeDialogCancelBtn = context.getResources().getString(C3217R.string.strUpgradeDialogCancelBtn);
                }
                resources.updateConfiguration(configuration, displayMetrics);
                C3319am.m8340a().mo38399a(new RunnableC3225d(1, new Object[0]), eVar.f7389b);
                C3303ac a2 = C3303ac.m8229a();
                int i3 = instance.f7321id;
                int i4 = C3226e.f7358a - 1;
                C3226e.f7358a = i4;
                a2.mo38334a(i3, i4);
                C3321an.m8349a("Beta init finished...", new Object[0]);
            }
        }
    }

    public static synchronized void installApk(File file) {
        synchronized (Beta.class) {
            try {
                C3372y upgradeStrategy = getUpgradeStrategy();
                if (upgradeStrategy != null && C3222a.m7761a(C3226e.f7357E.f7406s, file, upgradeStrategy.f8296f.f8255a)) {
                    C3360p.f8238a.mo38500a(new C3370w("install", System.currentTimeMillis(), (byte) 0, 0, upgradeStrategy.f8295e, upgradeStrategy.f8303m, upgradeStrategy.f8306p, null));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

    public static void installTinker() {
        enableHotfix = true;
        installTinker(TinkerApplicationLike.getTinkerPatchApplicationLike());
    }

    public static void loadArmLibrary(Context context, String str) {
        TinkerManager.loadArmLibrary(context, str);
    }

    public static void loadArmV7Library(Context context, String str) {
        TinkerManager.loadArmV7Library(context, str);
    }

    public static void loadLibrary(String str) {
        C3226e eVar = C3226e.f7357E;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    if (C3222a.m7768b("LoadSoFileResult", true)) {
                        C3222a.m7760a("LoadSoFileResult", false);
                        String b = C3222a.m7767b(str, "");
                        boolean b2 = C3222a.m7768b("PatchResult", false);
                        if (TextUtils.isEmpty(b) || !b2) {
                            System.loadLibrary(str);
                        } else {
                            TinkerManager.loadLibraryFromTinker(eVar.f7406s, "lib/" + b, str);
                        }
                        C3222a.m7760a("LoadSoFileResult", true);
                        return;
                    }
                    System.loadLibrary(str);
                    C3222a.m7760a("IS_PATCH_ROLL_BACK", true);
                    cleanTinkerPatch(true);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                C3222a.m7760a("LoadSoFileResult", false);
                return;
            }
        }
        C3321an.m8357e("libName is invalid", new Object[0]);
    }

    public static void loadLibraryFromTinker(Context context, String str, String str2) {
        TinkerManager.loadLibraryFromTinker(context, str, str2);
    }

    public static synchronized void onUpgradeReceived(String str, int i, String str2, long j, int i2, int i3, String str3, String str4, long j2, String str5, String str6, int i4, int i5, long j3, String str7, boolean z, boolean z2, int i6, String str8, long j4) {
        synchronized (Beta.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("IMG_title", str6);
            hashMap.put("VAL_style", String.valueOf(i4));
            C3247c.f7488a.mo38045a(z, z2, i6, new C3372y(str, str2, j, 0, new C3369v(C3226e.f7357E.f7408u, (byte) 1, i3, str3, i2, "", 1, "", str5, "", ""), new C3368u(str5, str4, "", j2, ""), (byte) i, i5, j3, null, "", hashMap, str7, 1, j4, 1), str8 == null ? "" : str8);
        }
    }

    public static void registerDownloadListener(DownloadListener downloadListener2) {
        DownloadTask downloadTask;
        C3226e.f7357E.f7404q = downloadListener2;
        if (downloadListener2 != null && (downloadTask = C3247c.f7488a.f7490c) != null) {
            downloadTask.addListener(downloadListener2);
        }
    }

    public static synchronized void saveInstallEvent(boolean z) {
        synchronized (Beta.class) {
            try {
                C3372y upgradeStrategy = getUpgradeStrategy();
                if (upgradeStrategy != null && z) {
                    C3222a.m7759a("installApkMd5", upgradeStrategy.f8296f.f8255a);
                    C3360p.f8238a.mo38500a(new C3370w("install", System.currentTimeMillis(), (byte) 0, 0, upgradeStrategy.f8295e, upgradeStrategy.f8303m, upgradeStrategy.f8306p, null));
                    C3321an.m8349a("安装事件保存成功", new Object[0]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

    public static synchronized void showUpgradeDialog(String str, int i, String str2, long j, int i2, int i3, String str3, String str4, long j2, String str5, String str6, int i4, DownloadListener downloadListener2, Runnable runnable, Runnable runnable2, boolean z) {
        C3372y yVar;
        synchronized (Beta.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("IMG_title", str6);
            hashMap.put("VAL_style", String.valueOf(i4));
            C3372y yVar2 = new C3372y(str, str2, j, 0, new C3369v(C3226e.f7357E.f7408u, (byte) 1, i3, str3, i2, "", 1, "", str5, "1.3.7", ""), new C3368u(str5, str4, "", j2, ""), (byte) i, 0, 0, null, "", hashMap, null, 1, System.currentTimeMillis(), 1);
            if (f7327a != null && !f7327a.getDownloadUrl().equals(str4)) {
                f7327a.delete(true);
                f7327a = null;
            }
            if (f7327a == null) {
                yVar = yVar2;
                f7327a = C3226e.f7357E.f7403p.mo37901a(yVar.f8296f.f8256b, C3226e.f7357E.f7407t.getAbsolutePath(), null, yVar.f8296f.f8255a);
            } else {
                yVar = yVar2;
            }
            f7327a.addListener(downloadListener2);
            C3244h.f7461v.mo38023a(yVar, f7327a);
            C3244h.f7461v.f7468r = runnable;
            C3244h.f7461v.f7469s = runnable2;
            C3227f.f7414a.mo37916a(C3226e.f7357E.f7403p, yVar.f8302l);
            boolean z2 = false;
            if (z) {
                C3227f fVar = C3227f.f7414a;
                Object[] objArr = new Object[2];
                objArr[0] = C3244h.f7461v;
                if (yVar.f8297g == 2) {
                    z2 = true;
                }
                objArr[1] = Boolean.valueOf(z2);
                fVar.mo37918a(new RunnableC3225d(2, objArr), 3000);
            } else {
                C3227f fVar2 = C3227f.f7414a;
                Object[] objArr2 = new Object[2];
                objArr2[0] = C3244h.f7461v;
                if (yVar.f8297g == 2) {
                    z2 = true;
                }
                objArr2[1] = Boolean.valueOf(z2);
                fVar2.mo37917a(new RunnableC3225d(2, objArr2));
            }
        }
    }

    public static DownloadTask startDownload() {
        C3247c cVar = C3247c.f7488a;
        RunnableC3225d dVar = cVar.f7495h;
        if (dVar == null || dVar.f7356b[0] != cVar.f7490c) {
            C3247c cVar2 = C3247c.f7488a;
            cVar2.f7495h = new RunnableC3225d(13, cVar2.f7490c, cVar2.f7489b);
        }
        C3247c.f7488a.f7495h.run();
        return C3247c.f7488a.f7490c;
    }

    public static void unInit() {
        if (C3222a.m7768b("IS_PATCH_ROLL_BACK", false)) {
            C3222a.m7760a("IS_PATCH_ROLL_BACK", false);
            TinkerManager.getInstance().cleanPatch(true);
        }
    }

    public static void unregisterDownloadListener() {
        DownloadTask downloadTask = C3247c.f7488a.f7490c;
        if (downloadTask != null) {
            downloadTask.removeListener(C3226e.f7357E.f7404q);
        }
        C3226e.f7357E.f7404q = null;
    }

    @Override // com.tencent.bugly.AbstractC3215a
    public String[] getTables() {
        return new String[]{"dl_1002", "ge_1002", "st_1002"};
    }

    @Override // com.tencent.bugly.AbstractC3215a
    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0130 A[Catch:{ all -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0138 A[SYNTHETIC] */
    @Override // com.tencent.bugly.AbstractC3215a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDbUpgrade(android.database.sqlite.SQLiteDatabase r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.Beta.onDbUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public static void checkUpgrade(boolean z, boolean z2) {
        try {
            if (TextUtils.isEmpty(C3226e.f7357E.f7409v)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    C3319am.m8340a().mo38398a(new RunnableC3225d(19, Boolean.valueOf(z), Boolean.valueOf(z2)));
                    return;
                }
                synchronized (C3226e.f7357E) {
                    while (TextUtils.isEmpty(C3226e.f7357E.f7409v)) {
                        try {
                            C3226e.f7357E.wait();
                        } catch (InterruptedException unused) {
                            C3321an.m8357e("wait error", new Object[0]);
                        }
                    }
                }
            }
            if (!z) {
                if (TextUtils.isEmpty(C3226e.f7357E.f7409v)) {
                    C3321an.m8357e("[beta] BetaModule is uninitialized", new Object[0]);
                } else {
                    BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) C3222a.m7756a("st.bch", BetaGrayStrategy.CREATOR);
                    if (betaGrayStrategy == null || betaGrayStrategy.f7476a == null || System.currentTimeMillis() - betaGrayStrategy.f7480e > C3226e.f7357E.f7390c || betaGrayStrategy.f7476a.f8306p == 3) {
                        C3247c.f7488a.mo38044a(z, z2, 0);
                    } else {
                        C3247c.f7488a.mo38045a(z, z2, 0, null, "");
                    }
                }
            }
            if (!z) {
                return;
            }
            if (TextUtils.isEmpty(C3226e.f7357E.f7409v)) {
                C3321an.m8357e("[beta] BetaModule is uninitialized", new Object[0]);
                if (upgradeStateListener != null) {
                    C3254e.m7893a(new RunnableC3225d(18, upgradeStateListener, -1, Boolean.valueOf(z)));
                    return;
                }
                C3254e.m7893a(new RunnableC3225d(5, strToastCheckUpgradeError));
                return;
            }
            C3247c.f7488a.mo38044a(z, z2, 1);
            if (upgradeStateListener != null) {
                C3254e.m7893a(new RunnableC3225d(18, upgradeStateListener, 2, Boolean.valueOf(z)));
                return;
            }
            C3254e.m7893a(new RunnableC3225d(5, strToastCheckingUpgrade));
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }

    public static void installTinker(Object obj) {
        enableHotfix = true;
        TinkerManager.installTinker(obj);
    }

    public static void installTinker(Object obj, Object obj2, Object obj3, Object obj4, TinkerManager.TinkerPatchResultListener tinkerPatchResultListener, Object obj5) {
        enableHotfix = true;
        TinkerManager.installTinker(obj, obj2, obj3, obj4, tinkerPatchResultListener, obj5);
    }

    @Override // com.tencent.bugly.AbstractC3215a
    public synchronized void init(Context context, boolean z, BuglyStrategy buglyStrategy) {
        C3269a.m7966b().mo38156c("G10", "1.3.7");
        if (autoInit) {
            init(context, z);
        }
    }
}
