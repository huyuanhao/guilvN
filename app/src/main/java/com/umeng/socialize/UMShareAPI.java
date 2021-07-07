package com.umeng.socialize;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Process;
import com.p118pd.sdk.C5982OoooOoO;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.handler.UMSSOHandler;
import com.umeng.socialize.net.ActionBarRequest;
import com.umeng.socialize.net.RestAPI;
import com.umeng.socialize.net.analytics.SocialAnalytics;
import com.umeng.socialize.net.dplus.DplusApi;
import com.umeng.socialize.p274a.C3903a;
import com.umeng.socialize.uploadlog.UMLog;
import com.umeng.socialize.utils.ContextUtil;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeSpUtils;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import com.umeng.socialize.utils.UrlUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

public class UMShareAPI {

    /* renamed from: a */
    public static UMShareAPI f10636a;

    /* renamed from: b */
    public C3903a f10637b;

    /* renamed from: c */
    public UMShareConfig f10638c = new UMShareConfig();

    /* renamed from: com.umeng.socialize.UMShareAPI$a */
    public static class C3902a extends QueuedWork.UMAsyncTask<Void> {

        /* renamed from: a */
        public Context f10655a;

        /* renamed from: b */
        public boolean f10656b = false;

        /* renamed from: c */
        public boolean f10657c = false;

        public C3902a(Context context) {
            this.f10655a = context;
            this.f10656b = SocializeUtils.isToday(SocializeSpUtils.getTime(context));
            this.f10657c = SocializeUtils.isHasDplusCache();
        }

        /* renamed from: c */
        private boolean m10721c() {
            return this.f10655a.getSharedPreferences(SocializeConstants.SOCIAL_PREFERENCE_NAME, 0).getBoolean("newinstall", false);
        }

        /* renamed from: a */
        public Void doInBackground() {
            boolean c = m10721c();
            SLog.m10856E(UmengText.CHECK.SDKVERSION + "7.0.2");
            if (!this.f10656b) {
                RestAPI.queryShareId(new ActionBarRequest(this.f10655a, c));
            }
            if (!this.f10656b) {
                SocializeSpUtils.putTime(this.f10655a);
                DplusApi.uploadDAU(ContextUtil.getContext());
                SocialAnalytics.dauStats(this.f10655a, true);
                return null;
            } else if (!this.f10657c) {
                return null;
            } else {
                DplusApi.uploadDAU(ContextUtil.getContext());
                SocialAnalytics.dauStats(this.f10655a, true);
                return null;
            }
        }

        /* renamed from: b */
        public void mo40215b() {
            SharedPreferences.Editor edit = this.f10655a.getSharedPreferences(SocializeConstants.SOCIAL_PREFERENCE_NAME, 0).edit();
            edit.putBoolean("newinstall", true);
            edit.commit();
        }
    }

    public UMShareAPI(Context context) {
        ContextUtil.setContext(context.getApplicationContext());
        this.f10637b = new C3903a(context.getApplicationContext());
        if (m10717a(context) != null && m10717a(context).equals(ContextUtil.getPackageName())) {
            new C3902a(context.getApplicationContext()).execute();
        }
    }

    public static UMShareAPI get(Context context) {
        UMShareAPI uMShareAPI = f10636a;
        if (uMShareAPI == null || uMShareAPI.f10637b == null) {
            f10636a = new UMShareAPI(context);
            SLog.welcome();
        }
        f10636a.f10637b.mo40247a(context);
        return f10636a;
    }

    public static void init(Context context, String str) {
        SocializeConstants.APPKEY = str;
        get(context);
    }

    public void deleteOauth(final Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        if (activity != null) {
            f10636a.f10637b.mo40247a(activity);
            new QueuedWork.DialogThread<Void>(activity) {
                /* class com.umeng.socialize.UMShareAPI.C38992 */

                @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
                public Object doInBackground() {
                    if (UMShareAPI.this.f10637b == null) {
                        return null;
                    }
                    UMShareAPI.this.f10637b.mo40246a(activity, share_media, uMAuthListener);
                    return null;
                }
            }.execute();
            return;
        }
        SLog.m10856E(UmengText.CHECK.ACTIVITYNULL);
    }

    @Deprecated
    public void doOauthVerify(final Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        UMLog.putAuth();
        if (!UMConfigure.getInitStatus()) {
            SLog.selfLog(UmengText.CHECK.NOINT);
            return;
        }
        f10636a.f10637b.mo40247a(activity);
        if (SLog.isDebug() && !m10718a(activity, share_media)) {
            return;
        }
        if (activity != null) {
            new QueuedWork.DialogThread<Void>(activity) {
                /* class com.umeng.socialize.UMShareAPI.C38981 */

                /* renamed from: a */
                public Void doInBackground() {
                    if (UMShareAPI.this.f10637b == null) {
                        UMShareAPI.this.f10637b = new C3903a(activity);
                    }
                    UMShareAPI.this.f10637b.mo40254c(activity, share_media, uMAuthListener);
                    return null;
                }
            }.execute();
        } else {
            SLog.m10856E(UmengText.CHECK.ACTIVITYNULL);
        }
    }

    public void doShare(Activity activity, final ShareAction shareAction, final UMShareListener uMShareListener) {
        UMLog.putShare();
        if (!UMConfigure.getInitStatus()) {
            SLog.selfLog(UmengText.CHECK.NOINT);
            return;
        }
        final WeakReference weakReference = new WeakReference(activity);
        if (SLog.isDebug()) {
            if (m10718a(activity, shareAction.getPlatform())) {
                UrlUtil.sharePrint(shareAction.getPlatform());
            } else {
                return;
            }
        }
        if (weakReference.get() == null || ((Activity) weakReference.get()).isFinishing()) {
            SLog.m10856E(UmengText.CHECK.ACTIVITYNULL);
            return;
        }
        f10636a.f10637b.mo40247a(activity);
        new QueuedWork.DialogThread<Void>((Context) weakReference.get()) {
            /* class com.umeng.socialize.UMShareAPI.C39014 */

            /* renamed from: a */
            public Void doInBackground() {
                if (weakReference.get() != null && !((Activity) weakReference.get()).isFinishing()) {
                    if (UMShareAPI.this.f10637b != null) {
                        UMShareAPI.this.f10637b.mo40245a((Activity) weakReference.get(), shareAction, uMShareListener);
                    } else {
                        UMShareAPI.this.f10637b = new C3903a((Context) weakReference.get());
                        UMShareAPI.this.f10637b.mo40245a((Activity) weakReference.get(), shareAction, uMShareListener);
                    }
                }
                return null;
            }
        }.execute();
    }

    public void fetchAuthResultWithBundle(Activity activity, Bundle bundle, UMAuthListener uMAuthListener) {
        this.f10637b.mo40244a(activity, bundle, uMAuthListener);
    }

    public UMSSOHandler getHandler(SHARE_MEDIA share_media) {
        C3903a aVar = this.f10637b;
        if (aVar != null) {
            return aVar.mo40240a(share_media);
        }
        return null;
    }

    public void getPlatformInfo(final Activity activity, final SHARE_MEDIA share_media, final UMAuthListener uMAuthListener) {
        if (activity == null) {
            SLog.m10856E(UmengText.CHECK.ACTIVITYNULL);
        } else if (!UMConfigure.getInitStatus()) {
            SLog.selfLog(UmengText.CHECK.NOINT);
        } else {
            UMLog.putAuth();
            if (SLog.isDebug()) {
                if (m10718a(activity, share_media)) {
                    UrlUtil.getInfoPrint(share_media);
                } else {
                    return;
                }
            }
            f10636a.f10637b.mo40247a(activity);
            new QueuedWork.DialogThread<Void>(activity) {
                /* class com.umeng.socialize.UMShareAPI.C39003 */

                @Override // com.umeng.socialize.common.QueuedWork.UMAsyncTask
                public Object doInBackground() {
                    if (UMShareAPI.this.f10637b == null) {
                        return null;
                    }
                    UMShareAPI.this.f10637b.mo40251b(activity, share_media, uMAuthListener);
                    return null;
                }
            }.execute();
        }
    }

    public String getversion(Activity activity, SHARE_MEDIA share_media) {
        C3903a aVar = this.f10637b;
        if (aVar != null) {
            return aVar.mo40253c(activity, share_media);
        }
        C3903a aVar2 = new C3903a(activity);
        this.f10637b = aVar2;
        return aVar2.mo40253c(activity, share_media);
    }

    public boolean isAuthorize(Activity activity, SHARE_MEDIA share_media) {
        C3903a aVar = this.f10637b;
        if (aVar != null) {
            return aVar.mo40255d(activity, share_media);
        }
        C3903a aVar2 = new C3903a(activity);
        this.f10637b = aVar2;
        return aVar2.mo40255d(activity, share_media);
    }

    public boolean isInstall(Activity activity, SHARE_MEDIA share_media) {
        C3903a aVar = this.f10637b;
        if (aVar != null) {
            return aVar.mo40250a(activity, share_media);
        }
        C3903a aVar2 = new C3903a(activity);
        this.f10637b = aVar2;
        return aVar2.mo40250a(activity, share_media);
    }

    public boolean isSupport(Activity activity, SHARE_MEDIA share_media) {
        C3903a aVar = this.f10637b;
        if (aVar != null) {
            return aVar.mo40252b(activity, share_media);
        }
        C3903a aVar2 = new C3903a(activity);
        this.f10637b = aVar2;
        return aVar2.mo40252b(activity, share_media);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C3903a aVar = this.f10637b;
        if (aVar != null) {
            aVar.mo40242a(i, i2, intent);
        } else {
            SLog.m10856E(UmengText.CHECK.ROUTERNULL);
        }
        SLog.m10857I(UmengText.CHECK.getActivityResult(i, i2));
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f10637b.mo40248a(bundle);
    }

    public void release() {
        this.f10637b.mo40241a();
    }

    public void setShareConfig(UMShareConfig uMShareConfig) {
        this.f10637b.mo40249a(uMShareConfig);
    }

    /* renamed from: a */
    private String m10717a(Context context) {
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        if (activityManager == null || activityManager.getRunningAppProcesses() == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m10718a(Activity activity, SHARE_MEDIA share_media) {
        boolean z = false;
        for (Method method : activity.getClass().getDeclaredMethods()) {
            if (method.getName().equals("onActivityResult")) {
                z = true;
            }
        }
        if (!z) {
            SLog.mutlE(UmengText.CHECK.ALL_NO_ONACTIVITY, UrlUtil.ALL_NO_ONACTIVITY);
        }
        if (share_media == SHARE_MEDIA.QQ) {
            SLog.m10856E(UmengTool.checkQQByself(activity));
            return true;
        } else if (share_media == SHARE_MEDIA.WEIXIN) {
            SLog.m10856E(UmengTool.checkWxBySelf(activity));
            return true;
        } else if (share_media == SHARE_MEDIA.SINA) {
            SLog.m10856E(UmengTool.checkSinaBySelf(activity));
            return true;
        } else if (share_media == SHARE_MEDIA.FACEBOOK) {
            SLog.m10856E(UmengTool.checkFBByself(activity));
            return true;
        } else {
            if (share_media == SHARE_MEDIA.VKONTAKTE) {
                SLog.m10856E(UmengTool.checkVKByself(activity));
            }
            if (share_media == SHARE_MEDIA.LINKEDIN) {
                SLog.m10856E(UmengTool.checkLinkin(activity));
            }
            if (share_media == SHARE_MEDIA.KAKAO) {
                SLog.m10856E(UmengTool.checkKakao(activity));
            }
            return true;
        }
    }
}
