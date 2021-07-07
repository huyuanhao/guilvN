package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.megvii.apo.PhoneFingerManager;
import com.p118pd.sdk.AbstractC8411oOoo0Oo0;
import com.p118pd.sdk.C7088o00OO0o0;
import com.umeng.analytics.pro.C3416b;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.AbstractC4565n;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4365ds;
import com.xiaomi.push.C4413fa;
import com.xiaomi.push.C4414fb;
import com.xiaomi.push.C4415fc;
import com.xiaomi.push.C4442g;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4515ii;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4521io;
import com.xiaomi.push.C4525is;
import com.xiaomi.push.C4527iu;
import com.xiaomi.push.C4529iw;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.C4570r;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.EnumC4423fi;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.EnumC4509ic;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.C4609ak;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.android.agoo.xiaomi.MiPushRegistar;

public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    public static boolean isCrashHandlerSuggested;
    public static Context sContext;
    public static long sCurMsgId = System.currentTimeMillis();

    @Deprecated
    public static abstract class MiPushClientCallback {
        public String category;

        public String getCategory() {
            return this.category;
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        public void setCategory(String str) {
            this.category = str;
        }
    }

    public static boolean acceptTimeSet(Context context, String str, String str2) {
        String acceptTime = getAcceptTime(context);
        return TextUtils.equals(acceptTime, str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
    }

    public static long accountSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("account_" + str, -1);
    }

    public static synchronized void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
            C4570r.m13744a(edit);
        }
    }

    public static synchronized void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static synchronized void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_pull_notification", System.currentTimeMillis());
        C4570r.m13744a(edit);
    }

    public static void addRegRequestTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_reg_request", System.currentTimeMillis());
        C4570r.m13744a(edit);
    }

    public static synchronized void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static long aliasSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("alias_" + str, -1);
    }

    public static void awakeApps(Context context, String[] strArr) {
        C4251ai.m11641a(context).mo41474a(new RunnableC4187af(strArr, context));
    }

    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.m11386a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException("param " + str + " is not nullable");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (com.xiaomi.push.C4269au.m11702a(r5).m11706a() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkPermission(android.content.Context r5) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiPushClient.checkPermission(android.content.Context):boolean");
    }

    public static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        C4204aw.m11444a(context).m11489e();
    }

    public static void clearNotification(Context context) {
        C4204aw.m11444a(context).mo41396a(-1);
    }

    public static void clearNotification(Context context, int i) {
        C4204aw.m11444a(context).mo41396a(i);
    }

    public static void clearNotification(Context context, String str, String str2) {
        C4204aw.m11444a(context).mo41409a(str, str2);
    }

    public static void disablePush(Context context) {
        C4204aw.m11444a(context).mo41410a(true);
    }

    public static void enablePush(Context context) {
        C4204aw.m11444a(context).mo41410a(false);
    }

    public static void forceHandleCrash() {
        boolean a = C4605ah.m13919a(sContext).mo42661a(EnumC4499ht.ForceHandleCrashSwitch.mo42043a(), false);
        if (!isCrashHandlerSuggested && a) {
            Thread.setDefaultUncaughtExceptionHandler(new C4235v(sContext));
        }
    }

    public static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (C4209b.m11491a(context).m11511c()) {
            return C4209b.m11491a(context).mo41434f();
        }
        return null;
    }

    public static boolean getDefaultSwitch() {
        return C4563l.m13729b();
    }

    public static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, C3416b.f8433Q);
        return C4217e.m11541a(context).mo41450b(EnumC4216d.ASSEMBLE_PUSH_FCM);
    }

    public static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, C3416b.f8433Q);
        return C4217e.m11541a(context).mo41450b(EnumC4216d.ASSEMBLE_PUSH_HUAWEI);
    }

    public static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, C3416b.f8433Q);
        return C4217e.m11541a(context).mo41450b(EnumC4216d.ASSEMBLE_PUSH_COS);
    }

    public static boolean getOpenVIVOPush(Context context) {
        return C4217e.m11541a(context).mo41450b(EnumC4216d.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (C4209b.m11491a(context).m11511c()) {
            return C4209b.m11491a(context).m11510c();
        }
        return null;
    }

    public static void initEventPerfLogic(Context context) {
        C4415fc.m12516a(new C4188ag());
        Config a = C4415fc.m12504a(context);
        ClientReportClient.init(context, a, new C4413fa(context), new C4414fb(context));
        C4181a.m11400a(context);
        C4231r.m11589a(context, a);
        C4605ah.m13919a(context).mo42659a(new C4189ah(100, "perf event job update", context));
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, null);
    }

    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback, String str3) {
        try {
            AbstractC4163b.m11301a("sdk_version = 3_7_0");
            if (miPushClientCallback != null) {
                PushMessageHandler.m11392a(miPushClientCallback);
            }
            if (C4688t.m14224a(sContext)) {
                C4237x.m11606a(sContext);
            }
            if (C4209b.m11491a(sContext).mo41427a(str, str2) || checkPermission(sContext)) {
                boolean z = C4209b.m11491a(sContext).mo41421a() != Constants.m11356a();
                if (z || shouldSendRegRequest(sContext)) {
                    if (z || !C4209b.m11491a(sContext).mo41427a(str, str2) || C4209b.m11491a(sContext).m11515e()) {
                        String a = C4285bf.m11799a(6);
                        C4209b.m11491a(sContext).m11496a();
                        C4209b.m11491a(sContext).mo41423a(Constants.m11356a());
                        C4209b.m11491a(sContext).mo41425a(str, str2, a);
                        MiTinyDataClient.C4178a.mo41342a().mo41344b(MiTinyDataClient.PENDING_REASON_APPID);
                        clearExtras(sContext);
                        C4521io ioVar = new C4521io();
                        ioVar.mo42342a(C4609ak.m13938a());
                        ioVar.mo42346b(str);
                        ioVar.mo42357e(str2);
                        ioVar.mo42354d(sContext.getPackageName());
                        ioVar.mo42361f(a);
                        ioVar.mo42350c(C4442g.m12699a(sContext, sContext.getPackageName()));
                        ioVar.mo42345b(C4442g.m12696a(sContext, sContext.getPackageName()));
                        ioVar.mo42367h("3_7_0");
                        ioVar.mo42340a(30700);
                        ioVar.mo42370i(C4506i.m13047e(sContext));
                        ioVar.mo42341a(EnumC4509ic.Init);
                        if (!TextUtils.isEmpty(str3)) {
                            ioVar.mo42364g(str3);
                        }
                        if (!C4563l.m13731d()) {
                            String g = C4506i.m13049g(sContext);
                            String i = C4506i.m13051i(sContext);
                            if (!TextUtils.isEmpty(g)) {
                                if (C4563l.m13729b()) {
                                    if (!TextUtils.isEmpty(i)) {
                                        g = g + Constants.ACCEPT_TIME_SEPARATOR_SP + i;
                                    }
                                    ioVar.mo42372j(g);
                                }
                                ioVar.mo42376l(C4285bf.m11800a(g) + Constants.ACCEPT_TIME_SEPARATOR_SP + C4506i.m13052j(sContext));
                            }
                        }
                        ioVar.mo42374k(C4506i.m13031a());
                        int a2 = C4506i.m13028a();
                        if (a2 >= 0) {
                            ioVar.mo42349c(a2);
                        }
                        C4204aw.m11444a(sContext).mo41400a(ioVar, z);
                        sContext.getSharedPreferences("mipush_extra", 4).getBoolean("mipush_registed", true);
                    } else {
                        if (1 == PushMessageHelper.getPushMode(sContext)) {
                            checkNotNull(miPushClientCallback, "callback");
                            miPushClientCallback.onInitializeResult(0, null, C4209b.m11491a(sContext).m11510c());
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(C4209b.m11491a(sContext).m11510c());
                            PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_REGISTER.f11840a, arrayList, 0, null, null));
                        }
                        C4204aw.m11444a(sContext).m11465a();
                        if (C4209b.m11491a(sContext).m11502a()) {
                            C4520in inVar = new C4520in();
                            inVar.mo42314b(C4209b.m11491a(sContext).m11495a());
                            inVar.mo42317c("client_info_update");
                            inVar.mo42307a(C4609ak.m13938a());
                            HashMap hashMap = new HashMap();
                            inVar.f12723a = hashMap;
                            hashMap.put("app_version", C4442g.m12699a(sContext, sContext.getPackageName()));
                            inVar.f12723a.put(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(C4442g.m12696a(sContext, sContext.getPackageName())));
                            inVar.f12723a.put("push_sdk_vn", "3_7_0");
                            inVar.f12723a.put("push_sdk_vc", Integer.toString(30700));
                            String e = C4209b.m11491a(sContext).mo41433e();
                            if (!TextUtils.isEmpty(e)) {
                                inVar.f12723a.put("deviceid", e);
                            }
                            C4204aw.m11444a(sContext).mo41404a((AbstractC4532iz) inVar, EnumC4494ho.Notification, false, (C4508ib) null);
                        }
                        if (!AbstractC4565n.m13736a(sContext, "update_devId", false)) {
                            updateImeiOrOaid();
                            AbstractC4565n.m13734a(sContext, "update_devId", true);
                        }
                        String d = C4506i.m13046d(sContext);
                        if (!TextUtils.isEmpty(d)) {
                            C4515ii iiVar = new C4515ii();
                            iiVar.mo42232a(C4609ak.m13938a());
                            iiVar.mo42236b(str);
                            iiVar.mo42239c(EnumC4423fi.COMMAND_CHK_VDEVID.f11840a);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(C4506i.m13045c(sContext));
                            arrayList2.add(d);
                            String str4 = "";
                            arrayList2.add(Build.MODEL != null ? Build.MODEL : str4);
                            if (Build.BOARD != null) {
                                str4 = Build.BOARD;
                            }
                            arrayList2.add(str4);
                            iiVar.mo42233a(arrayList2);
                            C4204aw.m11444a(sContext).mo41404a((AbstractC4532iz) iiVar, EnumC4494ho.Command, false, (C4508ib) null);
                        }
                        if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                            C4520in inVar2 = new C4520in();
                            inVar2.mo42314b(C4209b.m11491a(sContext).m11495a());
                            inVar2.mo42317c(EnumC4504hy.PullOfflineMessage.f12451a);
                            inVar2.mo42307a(C4609ak.m13938a());
                            inVar2.mo42310a(false);
                            C4204aw.m11444a(sContext).mo41405a((AbstractC4532iz) inVar2, EnumC4494ho.Notification, false, (C4508ib) null, false);
                            addPullNotificationTime(sContext);
                        }
                    }
                    addRegRequestTime(sContext);
                    scheduleOcVersionCheckJob();
                    scheduleDataCollectionJobs(sContext);
                    initEventPerfLogic(sContext);
                    C4213bc.m11531a(sContext);
                    forceHandleCrash();
                    if (!sContext.getPackageName().equals(MiPushRegistar.PACKAGE_XIAOMI)) {
                        if (Logger.getUserLogger() != null) {
                            Logger.setLogger(sContext, Logger.getUserLogger());
                        }
                        AbstractC4163b.m11295a(2);
                    }
                    operateSyncAction(context);
                    return;
                }
                C4204aw.m11444a(sContext).m11465a();
                AbstractC4163b.m11301a("Could not send  register message within 5s repeatly .");
            }
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
        }
    }

    public static void operateSyncAction(Context context) {
        if ("syncing".equals(C4194am.m11405a(sContext).mo41387a(EnumC4212bb.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(C4194am.m11405a(sContext).mo41387a(EnumC4212bb.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        if ("syncing".equals(C4194am.m11405a(sContext).mo41387a(EnumC4212bb.UPLOAD_HUAWEI_TOKEN))) {
            syncAssemblePushToken(sContext);
        }
        if ("syncing".equals(C4194am.m11405a(sContext).mo41387a(EnumC4212bb.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        if ("syncing".equals(C4194am.m11405a(sContext).mo41387a(EnumC4212bb.UPLOAD_COS_TOKEN))) {
            syncAssembleCOSPushToken(context);
        }
        if ("syncing".equals(C4194am.m11405a(sContext).mo41387a(EnumC4212bb.UPLOAD_FTOS_TOKEN))) {
            syncAssembleFTOSPushToken(context);
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    public static void reInitialize(Context context, EnumC4509ic icVar) {
        if (C4209b.m11491a(context).m11511c()) {
            String a = C4285bf.m11799a(6);
            String a2 = C4209b.m11491a(context).m11495a();
            String b = C4209b.m11491a(context).mo41428b();
            C4209b.m11491a(context).m11496a();
            C4209b.m11491a(context).mo41423a(Constants.m11356a());
            C4209b.m11491a(context).mo41425a(a2, b, a);
            C4521io ioVar = new C4521io();
            ioVar.mo42342a(C4609ak.m13938a());
            ioVar.mo42346b(a2);
            ioVar.mo42357e(b);
            ioVar.mo42361f(a);
            ioVar.mo42354d(context.getPackageName());
            ioVar.mo42350c(C4442g.m12699a(context, context.getPackageName()));
            ioVar.mo42341a(icVar);
            C4204aw.m11444a(context).mo41400a(ioVar, false);
        }
    }

    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(new C4235v(sContext, uncaughtExceptionHandler));
        isCrashHandlerSuggested = true;
    }

    public static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            context.getApplicationContext().registerReceiver(new NetworkStatusReceiver(null), intentFilter);
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
        }
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, null);
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration, String str3) {
        checkNotNull(context, C3416b.f8433Q);
        checkNotNull(str, AbstractC8411oOoo0Oo0.OooOo00);
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        C4688t.m14222a(context2);
        if (!NetworkStatusReceiver.m14194a()) {
            registerNetworkReceiver(sContext);
        }
        C4217e.m11541a(sContext).mo41448a(pushConfiguration);
        C4251ai.m11641a(context2).mo41474a(new RunnableC4184ac(str, str2, str3));
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3);
    }

    public static synchronized void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
            C4570r.m13744a(edit);
        }
    }

    public static synchronized void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("account_" + str).commit();
        }
    }

    public static synchronized void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("alias_" + str).commit();
        }
    }

    public static synchronized void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllUserAccount(context)) {
                removeAccount(context, str);
            }
        }
    }

    public static synchronized void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllAlias(context)) {
                removeAlias(context, str);
            }
        }
    }

    public static synchronized void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllTopic(context)) {
                removeTopic(context, str);
            }
        }
    }

    public static synchronized void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("topic_" + str).commit();
        }
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (C4209b.m11491a(context).m11509b()) {
            EnumC4504hy hyVar = z ? EnumC4504hy.APP_SLEEP : EnumC4504hy.APP_WAKEUP;
            C4520in inVar = new C4520in();
            inVar.mo42314b(C4209b.m11491a(context).m11495a());
            inVar.mo42317c(hyVar.f12451a);
            inVar.mo42321d(context.getPackageName());
            inVar.mo42307a(C4609ak.m13938a());
            inVar.mo42310a(false);
            C4204aw.m11444a(context).mo41405a((AbstractC4532iz) inVar, EnumC4494ho.Notification, false, (C4508ib) null, false);
        }
    }

    public static void reportIgnoreRegMessageClicked(Context context, String str, C4508ib ibVar, String str2, String str3) {
        C4520in inVar = new C4520in();
        if (TextUtils.isEmpty(str3)) {
            AbstractC4163b.m11306d("do not report clicked message");
            return;
        }
        inVar.mo42314b(str3);
        inVar.mo42317c("bar:click");
        inVar.mo42307a(str);
        inVar.mo42310a(false);
        C4204aw.m11444a(context).mo41407a(inVar, EnumC4494ho.Notification, false, true, ibVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        C4508ib ibVar = new C4508ib();
        ibVar.mo42116a(miPushMessage.getMessageId());
        ibVar.mo42122b(miPushMessage.getTopic());
        ibVar.mo42130d(miPushMessage.getDescription());
        ibVar.mo42127c(miPushMessage.getTitle());
        ibVar.mo42126c(miPushMessage.getNotifyId());
        ibVar.mo42115a(miPushMessage.getNotifyType());
        ibVar.mo42121b(miPushMessage.getPassThrough());
        ibVar.mo42117a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), ibVar, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    public static void reportMessageClicked(Context context, String str, C4508ib ibVar, String str2) {
        C4520in inVar = new C4520in();
        if (TextUtils.isEmpty(str2)) {
            if (C4209b.m11491a(context).m11509b()) {
                str2 = C4209b.m11491a(context).m11495a();
            } else {
                AbstractC4163b.m11306d("do not report clicked message");
                return;
            }
        }
        inVar.mo42314b(str2);
        inVar.mo42317c("bar:click");
        inVar.mo42307a(str);
        inVar.mo42310a(false);
        C4204aw.m11444a(context).mo41404a((AbstractC4532iz) inVar, EnumC4494ho.Notification, false, ibVar);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    public static void scheduleDataCollectionJobs(Context context) {
        if (C4605ah.m13919a(sContext).mo42661a(EnumC4499ht.DataCollectionSwitch.mo42043a(), getDefaultSwitch())) {
            C4365ds.mo41674a().mo41675a(new C4230q(context));
            C4251ai.m11641a(sContext).mo41475a(new RunnableC4185ad(), 10);
        }
    }

    public static void scheduleOcVersionCheckJob() {
        C4251ai.m11641a(sContext).mo41478a(new C4193al(sContext), C4605ah.m13919a(sContext).mo42656a(EnumC4499ht.OcVersionCheckFrequency.mo42043a(), C7088o00OO0o0.OooO0Oo), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = (long) (((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60);
        long j = ((((long) ((i * 60) + i2)) + rawOffset) + 1440) % 1440;
        long j2 = ((((long) ((i3 * 60) + i4)) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i), Integer.valueOf(i2)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i4)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, EnumC4423fi.COMMAND_SET_ACCEPT_TIME.f11840a, arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.m11391a(context, str, EnumC4423fi.COMMAND_SET_ACCEPT_TIME.f11840a, 0, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_SET_ACCEPT_TIME.f11840a, arrayList2, 0, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, EnumC4423fi.COMMAND_SET_ALIAS.f11840a, str, str2);
        }
    }

    public static void setCommand(Context context, String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        EnumC4423fi fiVar;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (!EnumC4423fi.COMMAND_SET_ALIAS.f11840a.equalsIgnoreCase(str) || Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) >= 86400000) {
            if (EnumC4423fi.COMMAND_UNSET_ALIAS.f11840a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
                sb = new StringBuilder();
                str4 = "Don't cancel alias for ";
            } else if (!EnumC4423fi.COMMAND_SET_ACCOUNT.f11840a.equalsIgnoreCase(str) || Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) >= PhoneFingerManager.PER_HOUR_MILLISECOND) {
                if (!EnumC4423fi.COMMAND_UNSET_ACCOUNT.f11840a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
                    setCommand(context, str, arrayList, str3);
                    return;
                } else {
                    sb = new StringBuilder();
                    str4 = "Don't cancel account for ";
                }
            } else if (1 != PushMessageHelper.getPushMode(context)) {
                fiVar = EnumC4423fi.COMMAND_SET_ACCOUNT;
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fiVar.f11840a, arrayList, 0, null, str3));
                return;
            }
            sb.append(str4);
            sb.append(C4285bf.m11801a(arrayList.toString(), 3));
            sb.append(" is unseted");
            AbstractC4163b.m11301a(sb.toString());
            return;
        } else if (1 != PushMessageHelper.getPushMode(context)) {
            fiVar = EnumC4423fi.COMMAND_SET_ALIAS;
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fiVar.f11840a, arrayList, 0, null, str3));
            return;
        }
        PushMessageHandler.m11391a(context, str3, str, 0, null, arrayList);
    }

    public static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (!TextUtils.isEmpty(C4209b.m11491a(context).m11495a())) {
            C4515ii iiVar = new C4515ii();
            iiVar.mo42232a(C4609ak.m13938a());
            iiVar.mo42236b(C4209b.m11491a(context).m11495a());
            iiVar.mo42239c(str);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                iiVar.m13228a(it.next());
            }
            iiVar.mo42245e(str2);
            iiVar.mo42243d(context.getPackageName());
            C4204aw.m11444a(context).mo41402a(iiVar, EnumC4494ho.Command, (C4508ib) null);
        }
    }

    public static void setLocalNotificationType(Context context, int i) {
        C4204aw.m11444a(context).mo41413b(i & -1);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, EnumC4423fi.COMMAND_SET_ACCOUNT.f11840a, str, str2);
        }
    }

    public static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1)) > Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    public static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1)) > WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return C4204aw.m11444a(context).m11482a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(C4209b.m11491a(context).m11495a()) && !TextUtils.isEmpty(str)) {
            if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) > 86400000) {
                C4525is isVar = new C4525is();
                isVar.mo42453a(C4609ak.m13938a());
                isVar.mo42455b(C4209b.m11491a(context).m11495a());
                isVar.mo42457c(str);
                isVar.mo42460d(context.getPackageName());
                isVar.mo42462e(str2);
                C4204aw.m11444a(context).mo41402a(isVar, EnumC4494ho.Subscription, (C4508ib) null);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.m11390a(context, str2, 0, null, str);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(EnumC4423fi.COMMAND_SUBSCRIBE_TOPIC.f11840a, arrayList, 0, null, null));
            }
        }
    }

    public static void syncAssembleCOSPushToken(Context context) {
        C4204aw.m11444a(context).mo41408a((String) null, EnumC4212bb.UPLOAD_COS_TOKEN, EnumC4216d.ASSEMBLE_PUSH_COS);
    }

    public static void syncAssembleFCMPushToken(Context context) {
        C4204aw.m11444a(context).mo41408a((String) null, EnumC4212bb.UPLOAD_FCM_TOKEN, EnumC4216d.ASSEMBLE_PUSH_FCM);
    }

    public static void syncAssembleFTOSPushToken(Context context) {
        C4204aw.m11444a(context).mo41408a((String) null, EnumC4212bb.UPLOAD_FTOS_TOKEN, EnumC4216d.ASSEMBLE_PUSH_FTOS);
    }

    public static void syncAssemblePushToken(Context context) {
        C4204aw.m11444a(context).mo41408a((String) null, EnumC4212bb.UPLOAD_HUAWEI_TOKEN, EnumC4216d.ASSEMBLE_PUSH_HUAWEI);
    }

    public static long topicSubscribedTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("topic_" + str, -1);
    }

    public static void unregisterPush(Context context) {
        C4220h.m11568c(context);
        C4605ah.m13919a(context).mo42658a();
        if (C4209b.m11491a(context).m11509b()) {
            C4527iu iuVar = new C4527iu();
            iuVar.mo42486a(C4609ak.m13938a());
            iuVar.mo42489b(C4209b.m11491a(context).m11495a());
            iuVar.mo42492c(C4209b.m11491a(context).m11510c());
            iuVar.mo42497e(C4209b.m11491a(context).mo41428b());
            iuVar.mo42495d(context.getPackageName());
            C4204aw.m11444a(context).mo41401a(iuVar);
            PushMessageHandler.mo41277a();
            C4209b.m11491a(context).m11506b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, EnumC4423fi.COMMAND_UNSET_ALIAS.f11840a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, EnumC4423fi.COMMAND_UNSET_ACCOUNT.f11840a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (C4209b.m11491a(context).m11509b()) {
            if (topicSubscribedTime(context, str) < 0) {
                AbstractC4163b.m11301a("Don't cancel subscribe for " + str + " is unsubscribed");
                return;
            }
            C4529iw iwVar = new C4529iw();
            iwVar.mo42527a(C4609ak.m13938a());
            iwVar.mo42529b(C4209b.m11491a(context).m11495a());
            iwVar.mo42531c(str);
            iwVar.mo42534d(context.getPackageName());
            iwVar.mo42536e(str2);
            C4204aw.m11444a(context).mo41402a(iwVar, EnumC4494ho.UnSubscription, (C4508ib) null);
        }
    }

    public static void updateImeiOrOaid() {
        new Thread(new RunnableC4186ae()).start();
    }
}
