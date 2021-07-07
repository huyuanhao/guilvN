package org.android.agoo.control;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.C3194w;
import com.umeng.message.UmengMessageBootReceiver;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.huawei.HuaweiPushReceiver;
import org.android.agoo.intent.IntentUtil;
import org.android.agoo.message.MessageService;
import org.android.agoo.xiaomi.MiPushBroadcastReceiver;

public abstract class BaseIntentService extends Service {
    public static final String TAG = "BaseIntentService";
    public static boolean isBinded = false;
    public static final String msgStatus = "4";
    public AgooFactory agooFactory;
    public Context mContext = null;
    public MessageService messageService;
    public Messenger messenger = new Messenger(new HandlerC4800g(this));
    public NotifManager notifyManager;

    private final String getTrace(Context context, long j) {
        String str = null;
        String str2 = TextUtils.isEmpty(null) ? "unknow" : null;
        if (TextUtils.isEmpty(null)) {
            str = "unknow";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("appkey");
        stringBuffer.append("|");
        stringBuffer.append(j);
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02cf A[Catch:{ all -> 0x02ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0353 A[Catch:{ Exception -> 0x035e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cf A[Catch:{ all -> 0x036d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135 A[Catch:{ all -> 0x036d }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0204 A[Catch:{ all -> 0x036b }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0237 A[Catch:{ all -> 0x036b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleRemoteMessage(android.content.Context r35, android.content.Intent r36) {
        /*
        // Method dump skipped, instructions count: 918
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.BaseIntentService.handleRemoteMessage(android.content.Context, android.content.Intent):void");
    }

    private final void handleRemovePackage(Context context, Intent intent) {
        if (intent != null && context != null) {
            String str = null;
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            }
            if (!TextUtils.isEmpty(str)) {
                boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m7597d(TAG, "handleRemovePackage---->[replacing:" + booleanExtra + "],uninstallPack=" + str, new Object[0]);
                }
                if (!booleanExtra) {
                    this.notifyManager.doUninstall(str, booleanExtra);
                }
            }
        }
    }

    public static final void runIntentInService(Context context, Intent intent, String str) {
        try {
            intent.setClassName(context, str);
            context.startService(intent);
        } catch (Throwable th) {
            ALog.m7602w(TAG, "runIntentInService", th, new Object[0]);
        }
    }

    public IBinder onBind(Intent intent) {
        if (C3190t.m7703c() && C3194w.m7715a(this) && !isBinded) {
            isBinded = true;
            getApplicationContext().bindService(new Intent(getApplication(), getClass()), new ServiceConnectionC4802i(this), 1);
        }
        return this.messenger.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        ThreadPoolExecutorFactory.execute(new RunnableC4803j(this));
    }

    public abstract void onError(Context context, String str);

    public void onHandleIntent(Intent intent) {
        this.mContext = getApplicationContext();
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                String agooCommand = IntentUtil.getAgooCommand(this.mContext);
                String thirdPushCommand = IntentUtil.getThirdPushCommand(this.mContext);
                ALog.m7600i(TAG, "onHandleIntent,action=" + action + ",agooCommand=" + agooCommand + ",mipushCommand=" + thirdPushCommand, new Object[0]);
                try {
                    if (TextUtils.equals(action, agooCommand)) {
                        String stringExtra = intent.getStringExtra("command");
                        ALog.m7597d(TAG, "actionCommand --->[" + stringExtra + "]", new Object[0]);
                        if (TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_READED) || TextUtils.equals(stringExtra, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED)) {
                            onUserCommand(this.mContext, intent);
                        }
                    } else if (TextUtils.equals(action, thirdPushCommand)) {
                        String stringExtra2 = intent.getStringExtra("command");
                        String stringExtra3 = intent.getStringExtra(AgooConstants.THIRD_PUSH_ID);
                        if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_MIPUSHID_REPORT)) {
                            this.notifyManager.reportThirdPushToken(stringExtra3, MiPushBroadcastReceiver.MI_TOKEN, false);
                        } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_HUAWEIPUSHID_REPORT)) {
                            ALog.m7597d(TAG, "HW_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                            this.notifyManager.reportThirdPushToken(stringExtra3, HuaweiPushReceiver.HUAWEI_TOKEN, false);
                        } else if (TextUtils.equals(stringExtra2, AgooConstants.AGOO_COMMAND_GCMIPUSHID_REPORT)) {
                            ALog.m7600i(TAG, "GCM_TOKEN report begin..regid=" + stringExtra3, new Object[0]);
                            this.notifyManager.reportThirdPushToken(stringExtra3, AgooConstants.MESSAGE_SYSTEM_SOURCE_GCM, false);
                        }
                    } else if (action.equals(AgooConstants.INTENT_FROM_AGOO_MESSAGE)) {
                        handleRemoteMessage(this.mContext, intent);
                    } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                        handleRemovePackage(this.mContext, intent);
                    } else if (TextUtils.equals(action, AgooConstants.INTENT_FROM_AGOO_REPORT) || TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE") || TextUtils.equals(action, UmengMessageBootReceiver.f9982c) || TextUtils.equals(action, "android.intent.action.PACKAGE_ADDED") || TextUtils.equals(action, "android.intent.action.PACKAGE_REPLACED") || TextUtils.equals(action, "android.intent.action.USER_PRESENT") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_CONNECTED") || TextUtils.equals(action, "android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        try {
                            ALog.m7600i(TAG, "is report cache msg,Config.isReportCacheMsg(mContext)=" + Config.m14274c(this.mContext), new Object[0]);
                            if (Config.m14274c(this.mContext) && C3178j.m7664c(this.mContext)) {
                                Config.m14275d(this.mContext);
                                this.agooFactory.reportCacheMsg();
                                this.messageService.mo44536a();
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            if (ALog.isPrintLog(ALog.Level.I)) {
                                ALog.m7600i(TAG, "is clear all msg=" + Config.m14273b(this.mContext, currentTimeMillis), new Object[0]);
                            }
                            if (Config.m14273b(this.mContext, currentTimeMillis)) {
                                Config.m14268a(this.mContext, currentTimeMillis);
                                this.messageService.mo44536a();
                            }
                        } catch (Throwable th) {
                            ALog.m7598e(TAG, "reportCacheMsg", th, new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    C3103a.f6877g.incrementAndGet();
                    throw th2;
                }
                C3103a.f6877g.incrementAndGet();
            }
        }
    }

    public abstract void onMessage(Context context, Intent intent);

    public abstract void onRegistered(Context context, String str);

    public int onStartCommand(Intent intent, int i, int i2) {
        ThreadPoolExecutorFactory.execute(new RunnableC4804k(this, intent));
        return 2;
    }

    public void onUserCommand(Context context, Intent intent) {
    }
}
