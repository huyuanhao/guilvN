package com.taobao.agoo;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AbstractC3099c;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.p265a.C3202b;
import com.taobao.agoo.p265a.p266a.C3198a;
import com.taobao.agoo.p265a.p266a.C3201d;
import com.umeng.analytics.pro.C3416b;
import com.xiaomi.mipush.sdk.MiPushClient;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.NotifManager;

public final class TaobaoRegister {
    public static final int EVENT_ID = 66001;
    public static final String PREFERENCES = "Agoo_AppStore";
    public static final String PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND = "app_notification_custom_sound";
    public static final String PROPERTY_APP_NOTIFICATION_ICON = "app_notification_icon";
    public static final String PROPERTY_APP_NOTIFICATION_SOUND = "app_notification_sound";
    public static final String PROPERTY_APP_NOTIFICATION_VIBRATE = "app_notification_vibrate";
    public static final String SERVICEID = "agooSend";
    public static final String TAG = "TaobaoRegister";
    public static boolean isRegisterSuccess;
    public static C3202b mRequestListener;

    public TaobaoRegister() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static void bindAgoo(Context context, String str, String str2, CallBack callBack) {
        bindAgoo(context, null);
    }

    public static void clickMessage(Context context, String str, String str2) {
        clickMessage(context, str, str2, 0, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: org.android.agoo.common.MsgDO */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: org.android.agoo.control.AgooFactory */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.android.agoo.message.MessageService] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void dismissMessage(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.dismissMessage(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void isEnableDaemonServer(Context context, boolean z) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i(TAG, "isEnableDaemonServer begin,enable=" + z, new Object[0]);
        }
        Config.m14270a(context, z);
    }

    public static boolean isRegisterSuccess() {
        return isRegisterSuccess;
    }

    public static void pingApp(Context context, String str, String str2, String str3, int i) {
        NotifManager notifManager = new NotifManager();
        notifManager.init(context);
        notifManager.pingApp(str, str2, str3, i);
    }

    @Deprecated
    public static synchronized void register(Context context, String str, String str2, String str3, IRegister iRegister) throws AccsException {
        synchronized (TaobaoRegister.class) {
            register(context, AccsClientConfig.DEFAULT_CONFIGTAG, str, str2, str3, iRegister);
        }
    }

    public static synchronized void removeAlias(Context context, String str, ICallback iCallback) {
        synchronized (TaobaoRegister.class) {
            ALog.m7600i(TAG, C3198a.JSON_CMD_REMOVEALIAS, new Object[0]);
            try {
                String g = Config.m14278g(context);
                String a = Config.m14266a(context);
                if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(g) && context != null) {
                    if (!TextUtils.isEmpty(str)) {
                        AbstractC3099c accsInstance = ACCSManager.getAccsInstance(context, a, Config.m14271b(context));
                        if (mRequestListener == null) {
                            mRequestListener = new C3202b(context.getApplicationContext());
                        }
                        GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                        String b = accsInstance.mo37480b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", C3198a.m7731c(a, g, str), null));
                        if (TextUtils.isEmpty(b)) {
                            if (iCallback != null) {
                                iCallback.onFailure("504.1", "accs channel disabled!");
                            }
                        } else if (iCallback != null) {
                            mRequestListener.f7291a.put(b, iCallback);
                        }
                        return;
                    }
                }
                if (iCallback != null) {
                    iCallback.onFailure("504.1", "input params null!!");
                }
                ALog.m7599e(TAG, "setAlias param null", "appkey", a, "deviceId", g, "alias", str, C3416b.f8433Q, context);
            } catch (Throwable th) {
                ALog.m7598e(TAG, C3198a.JSON_CMD_REMOVEALIAS, th, new Object[0]);
            }
        }
    }

    public static synchronized void sendSwitch(Context context, ICallback iCallback, boolean z) {
        synchronized (TaobaoRegister.class) {
            try {
                String g = Config.m14278g(context);
                String a = Config.m14266a(context);
                String l = UtilityImpl.m7644l(context);
                if (!TextUtils.isEmpty(a) && context != null) {
                    if (!TextUtils.isEmpty(g) || !TextUtils.isEmpty(l)) {
                        AbstractC3099c accsInstance = ACCSManager.getAccsInstance(context, a, Config.m14271b(context));
                        if (mRequestListener == null) {
                            mRequestListener = new C3202b(context.getApplicationContext());
                        }
                        GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                        String b = accsInstance.mo37480b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", C3201d.m7735a(a, g, l, z), null));
                        if (TextUtils.isEmpty(b)) {
                            if (iCallback != null) {
                                iCallback.onFailure("503.2", "accs channel disabled!");
                            }
                        } else if (iCallback != null) {
                            mRequestListener.f7291a.put(b, iCallback);
                        }
                        return;
                    }
                }
                if (iCallback != null) {
                    iCallback.onFailure("503.3", "input params null!!");
                }
                ALog.m7599e(TAG, "sendSwitch param null", "appkey", a, "deviceId", g, C3416b.f8433Q, context, C3201d.JSON_CMD_ENABLEPUSH, Boolean.valueOf(z));
                return;
            } catch (Throwable th) {
                ALog.m7598e(TAG, "sendSwitch", th, new Object[0]);
            }
        }
    }

    public static synchronized void setAccsConfigTag(Context context, String str) {
        synchronized (TaobaoRegister.class) {
            Config.f13429a = str;
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag != null) {
                ALog.m7600i(TAG, "setAccsConfigTag", "config", configByTag.toString());
                C3103a.f6873c = configByTag.getAuthCode();
                Config.setAgooAppKey(context, configByTag.getAppKey());
                String appSecret = configByTag.getAppSecret();
                C3178j.f7226b = appSecret;
                if (!TextUtils.isEmpty(appSecret)) {
                    C3103a.f6871a = 2;
                }
            } else {
                throw new RuntimeException("accs config not exist!! please set accs config first!!");
            }
        }
    }

    public static void setAgooMsgReceiveService(String str) {
        C3103a.f6872b = str;
    }

    public static synchronized void setAlias(Context context, String str, ICallback iCallback) {
        synchronized (TaobaoRegister.class) {
            ALog.m7600i(TAG, "setAlias", "alias", str);
            String g = Config.m14278g(context);
            String a = Config.m14266a(context);
            if (TextUtils.isEmpty(a) || TextUtils.isEmpty(g) || context == null || TextUtils.isEmpty(str)) {
                if (iCallback != null) {
                    iCallback.onFailure("504.1", "input params null!!");
                }
                ALog.m7599e(TAG, "setAlias param null", "appkey", a, "deviceId", g, "alias", str, C3416b.f8433Q, context);
                return;
            }
            try {
                if (mRequestListener == null) {
                    mRequestListener = new C3202b(context.getApplicationContext());
                }
                if (C3202b.f7290b.mo37820d(str)) {
                    ALog.m7600i(TAG, "setAlias already set", "alias", str);
                    if (iCallback != null) {
                        iCallback.onSuccess();
                    }
                    return;
                }
                AbstractC3099c accsInstance = ACCSManager.getAccsInstance(context, a, Config.m14271b(context));
                if (C3202b.f7290b.mo37818b(context.getPackageName())) {
                    GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                    String b = accsInstance.mo37480b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", C3198a.m7729a(a, g, str), null));
                    if (TextUtils.isEmpty(b)) {
                        if (iCallback != null) {
                            iCallback.onFailure("504.1", "accs channel disabled!");
                        }
                    } else if (iCallback != null) {
                        iCallback.extra = str;
                        mRequestListener.f7291a.put(b, iCallback);
                    }
                } else if (iCallback != null) {
                    iCallback.onFailure("504.1", "bindApp first!!");
                }
            } catch (Throwable th) {
                ALog.m7598e(TAG, "setAlias", th, new Object[0]);
            }
        }
    }

    @Deprecated
    public static void setBuilderSound(Context context, String str) {
    }

    public static void setEnv(Context context, @AccsClientConfig.ENV int i) {
        ACCSClient.setEnvironment(context, i);
    }

    public static void setIsRegisterSuccess(boolean z) {
        isRegisterSuccess = z;
    }

    @Deprecated
    public static void setNotificationIcon(Context context, int i) {
    }

    @Deprecated
    public static void setNotificationSound(Context context, boolean z) {
    }

    @Deprecated
    public static void setNotificationVibrate(Context context, boolean z) {
    }

    @Deprecated
    public static void unBindAgoo(Context context, String str, String str2, CallBack callBack) {
        unbindAgoo(context, null);
    }

    public static void unbindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, false);
        UTMini.getInstance().commitEvent(66001, MiPushClient.COMMAND_UNREGISTER, UtilityImpl.m7644l(context));
    }

    @Deprecated
    public static void unregister(Context context, CallBack callBack) {
        unbindAgoo(context, null);
    }

    public static void bindAgoo(Context context, ICallback iCallback) {
        sendSwitch(context, iCallback, true);
        UTMini.getInstance().commitEvent(66001, "bindAgoo", UtilityImpl.m7644l(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clickMessage(android.content.Context r21, java.lang.String r22, java.lang.String r23, int r24, long r25) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.TaobaoRegister.clickMessage(android.content.Context, java.lang.String, java.lang.String, int, long):void");
    }

    public static synchronized void register(Context context, String str, String str2, String str3, String str4, IRegister iRegister) throws AccsException {
        synchronized (TaobaoRegister.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str2)) {
                    if (!TextUtils.isEmpty(str)) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            ALog.isUseTlog = false;
                            anet.channel.util.ALog.setUseTlog(false);
                        }
                        ALog.m7600i(TAG, "register", "appKey", str2, Constants.KEY_CONFIG_TAG, str);
                        Context applicationContext = context.getApplicationContext();
                        Config.f13429a = str;
                        Config.setAgooAppKey(context, str2);
                        C3178j.f7226b = str3;
                        if (!TextUtils.isEmpty(str3)) {
                            C3103a.f6871a = 2;
                        }
                        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                        if (configByTag == null) {
                            new AccsClientConfig.Builder().setAppKey(str2).setAppSecret(str3).setTag(str).build();
                        } else {
                            C3103a.f6873c = configByTag.getAuthCode();
                        }
                        AbstractC3099c accsInstance = ACCSManager.getAccsInstance(context, str2, str);
                        accsInstance.mo37473a(applicationContext, str2, str3, str4, new C3209h(applicationContext, context, iRegister, str2, str4, accsInstance));
                        return;
                    }
                }
            }
            ALog.m7599e(TAG, "register params null", "appkey", str2, Constants.KEY_CONFIG_TAG, str);
        }
    }

    public static synchronized void removeAlias(Context context, ICallback iCallback) {
        synchronized (TaobaoRegister.class) {
            ALog.m7600i(TAG, C3198a.JSON_CMD_REMOVEALIAS, new Object[0]);
            try {
                String g = Config.m14278g(context);
                String h = Config.m14279h(context);
                String a = Config.m14266a(context);
                if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(g) && context != null) {
                    if (!TextUtils.isEmpty(h)) {
                        AbstractC3099c accsInstance = ACCSManager.getAccsInstance(context, a, Config.m14271b(context));
                        if (mRequestListener == null) {
                            mRequestListener = new C3202b(context.getApplicationContext());
                        }
                        GlobalClientInfo.getInstance(context).registerListener("AgooDeviceCmd", mRequestListener);
                        String b = accsInstance.mo37480b(context, new ACCSManager.AccsRequest(null, "AgooDeviceCmd", C3198a.m7730b(a, g, h), null));
                        if (TextUtils.isEmpty(b)) {
                            if (iCallback != null) {
                                iCallback.onFailure("504.1", "accs channel disabled!");
                            }
                        } else if (iCallback != null) {
                            mRequestListener.f7291a.put(b, iCallback);
                        }
                        return;
                    }
                }
                if (iCallback != null) {
                    iCallback.onFailure("504.1", "input params null!!");
                }
                ALog.m7599e(TAG, "setAlias param null", "appkey", a, "deviceId", g, C3198a.JSON_PUSH_USER_TOKEN, h, C3416b.f8433Q, context);
            } catch (Throwable th) {
                ALog.m7598e(TAG, C3198a.JSON_CMD_REMOVEALIAS, th, new Object[0]);
            }
        }
    }
}
