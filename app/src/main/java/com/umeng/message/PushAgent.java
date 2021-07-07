package com.umeng.message;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import anet.channel.AwcnConfig;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.ICallback;
import com.taobao.agoo.IRegister;
import com.taobao.agoo.TaobaoRegister;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.UTrack;
import com.umeng.message.common.C3780d;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.proguard.C3847k;
import com.umeng.message.service.UMJobIntentService;
import com.umeng.message.tag.TagManager;
import com.umeng.message.util.C3892b;
import com.umeng.message.util.C3894d;
import java.util.Random;
import org.android.spdy.SpdyAgent;

public class PushAgent {
    public static boolean DEBUG = false;
    public static final String TAG = "com.umeng.message.PushAgent";
    public static boolean sAppLaunchBy;
    public static PushAgent singleton;
    public Handler handler;
    public UHandler mAd;
    public Context mContext;
    public UHandler mMessageHandler;
    public UHandler mNotificationClickHandler;
    public boolean mPushCheck = false;
    public IUmengRegisterCallback mRegisterCallback;
    public TagManager mTagMgr;
    public IUmengCallback mUnregisterCallback;
    public boolean powerMode = true;

    public PushAgent(Context context) {
        try {
            this.mContext = context;
            this.mTagMgr = TagManager.getInstance(context);
            this.mMessageHandler = new UmengMessageHandler();
            this.mAd = new UmengAdHandler();
            this.mNotificationClickHandler = new UmengNotificationClickHandler();
            C3892b.m10699a(context);
            checkAviable();
        } catch (Exception e) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, "PushAgent初始化失败", e.getMessage());
        }
        this.handler = new Handler(context.getMainLooper()) {
            /* class com.umeng.message.PushAgent.HandlerC37501 */

            public void handleMessage(Message message) {
                super.handleMessage(message);
            }
        };
    }

    private void checkAviable() {
        if (C3894d.m10703a("com.umeng.commonsdk.utils.onMessageSendListener") == null) {
            new Thread() {
                /* class com.umeng.message.PushAgent.C37555 */

                public void run() {
                    try {
                        Looper.prepare();
                        Toast.makeText(PushAgent.this.mContext, "common sdk版本不匹配，请确认！", 1).show();
                        Looper.loop();
                    } catch (Throwable unused) {
                    }
                }
            }.start();
        }
    }

    private void disable() {
        try {
            TaobaoRegister.unbindAgoo(this.mContext, new ICallback() {
                /* class com.umeng.message.PushAgent.C37544 */

                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str, String str2) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    String str3 = PushAgent.TAG;
                    UMLog.mutlInfo(str3, 0, "关闭推送失败-->s:" + str + ",s1:" + str2);
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction(MsgConstant.MESSAGE_DISABLE_CALLBACK_ACTION);
                    intent.putExtra("status", false);
                    intent.putExtra(C3617o.f9366at, str);
                    intent.putExtra("s1", str2);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(PushAgent.TAG, 2, "关闭推送成功");
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction(MsgConstant.MESSAGE_DISABLE_CALLBACK_ACTION);
                    intent.putExtra("status", true);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }
            });
        } catch (Exception unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, "关闭推送失败");
        }
    }

    private void enable() {
        try {
            TaobaoRegister.bindAgoo(this.mContext, new ICallback() {
                /* class com.umeng.message.PushAgent.C37533 */

                @Override // com.taobao.agoo.ICallback
                public void onFailure(String str, String str2) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    String str3 = PushAgent.TAG;
                    UMLog.mutlInfo(str3, 2, "开启推送失败-->s:" + str + ",s1:" + str2);
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction(MsgConstant.MESSAGE_ENABLE_CALLBACK_ACTION);
                    intent.putExtra("status", false);
                    intent.putExtra(C3617o.f9366at, str);
                    intent.putExtra("s1", str2);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }

                @Override // com.taobao.agoo.ICallback
                public void onSuccess() {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(PushAgent.TAG, 2, "开启推送成功");
                    Intent intent = new Intent();
                    intent.setPackage(PushAgent.this.mContext.getPackageName());
                    intent.setAction(MsgConstant.MESSAGE_ENABLE_CALLBACK_ACTION);
                    intent.putExtra("status", true);
                    UMJobIntentService.enqueueWork(PushAgent.this.mContext, UmengMessageCallbackHandlerService.class, intent);
                }
            });
        } catch (Exception unused) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, "开启推送失败");
        }
    }

    public static synchronized PushAgent getInstance(Context context) {
        PushAgent pushAgent;
        synchronized (PushAgent.class) {
            if (singleton == null) {
                singleton = new PushAgent(context.getApplicationContext());
            }
            pushAgent = singleton;
        }
        return pushAgent;
    }

    private String getNotificationChannel(Context context) {
        String notificationChannelName = getInstance(context).getNotificationChannelName();
        return TextUtils.isEmpty(notificationChannelName) ? UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME : notificationChannelName;
    }

    private boolean getPowerMode() {
        return this.powerMode;
    }

    public static boolean isAppLaunchByMessage() {
        return sAppLaunchBy;
    }

    private void register() {
        try {
            if (Build.VERSION.SDK_INT < 14) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(TAG, 0, "U-Push最低支持的系统版本为Android 4.0");
            } else if (!C3819h.m10549a(this.mContext, this.handler)) {
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(TAG, 0, "AndroidManifest权限或参数错误");
            } else {
                UMLog uMLog3 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(TAG, 2, "AndroidManifest配置正确、参数正确");
                if (!TextUtils.isEmpty(getMessageAppkey())) {
                    if (!TextUtils.isEmpty(getMessageSecret())) {
                        C3819h.m10545a(this.mContext, UmengMessageCallbackHandlerService.class);
                        if (DEBUG) {
                            C3819h.m10554b(this.mContext, this.handler);
                        }
                        ALog.setUseTlog(false);
                        anet.channel.util.ALog.setUseTlog(false);
                        AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
                        ACCSClient.setEnvironment(this.mContext, 0);
                        AccsClientConfig.Builder builder = new AccsClientConfig.Builder();
                        ACCSClient.init(this.mContext, builder.setAppKey("umeng:" + getMessageAppkey()).setAppSecret(getMessageSecret()).setInappHost("umengacs.m.taobao.com").setInappPubKey(11).setChannelHost("umengjmacs.m.taobao.com").setChannelPubKey(11).setKeepAlive(getPowerMode()).setAutoUnit(false).setTag(AccsClientConfig.DEFAULT_CONFIGTAG).build());
                        DispatchConstants.setAmdcServerDomain(new String[]{"amdcopen.m.taobao.com", "amdc.wapa.taobao.com", "amdc.taobao.net"});
                        DispatchConstants.setAmdcServerFixIp(new String[][]{new String[]{"106.11.61.135", "106.11.61.137"}, null, null});
                        if (UmengMessageDeviceConfig.isMiui8()) {
                            TaobaoRegister.setAgooMsgReceiveService("com.umeng.message.XiaomiIntentService");
                        } else {
                            TaobaoRegister.setAgooMsgReceiveService("com.umeng.message.UmengIntentService");
                        }
                        C3780d.m10347a(new Runnable() {
                            /* class com.umeng.message.PushAgent.RunnableC37512 */

                            public void run() {
                                String str = "umeng:" + PushAgent.this.getMessageAppkey();
                                String messageSecret = PushAgent.this.getMessageSecret();
                                UMLog uMLog = UMConfigure.umDebugLog;
                                UMLog.mutlInfo(PushAgent.TAG, 2, "appkey:" + str + ",secret:" + messageSecret);
                                try {
                                    TaobaoRegister.register(PushAgent.this.mContext, AccsClientConfig.DEFAULT_CONFIGTAG, str, messageSecret, "android@umeng", new IRegister() {
                                        /* class com.umeng.message.PushAgent.RunnableC37512.C37521 */

                                        @Override // com.taobao.agoo.IRegister, com.taobao.agoo.ICallback
                                        public void onFailure(String str, String str2) {
                                            UMLog uMLog = UMConfigure.umDebugLog;
                                            String str3 = PushAgent.TAG;
                                            UMLog.mutlInfo(str3, 0, "注册失败-->s:" + str + ",s1:" + str2);
                                            PushAgent.this.registerFailure(str, str2);
                                            UMLog uMLog2 = UMConfigure.umDebugLog;
                                            UMLog.m9005aq(C3847k.f10376a, 0, "\\|");
                                        }

                                        @Override // com.taobao.agoo.IRegister
                                        public void onSuccess(String str) {
                                            UMLog uMLog = UMConfigure.umDebugLog;
                                            String str2 = PushAgent.TAG;
                                            UMLog.mutlInfo(str2, 2, "注册成功:" + str);
                                            PushAgent.this.registerSuccesss(str);
                                        }
                                    });
                                } catch (AccsException unused) {
                                    UMLog uMLog2 = UMConfigure.umDebugLog;
                                    UMLog.mutlInfo(PushAgent.TAG, 0, "注册失败");
                                }
                            }
                        });
                        if (Build.VERSION.SDK_INT >= 26 && !UmengMessageHandler.isChannelSet) {
                            UmengMessageHandler.isChannelSet = true;
                            NotificationChannel notificationChannel = new NotificationChannel(UmengMessageHandler.PRIMARY_CHANNEL, getNotificationChannel(this.mContext), 3);
                            NotificationManager notificationManager = (NotificationManager) this.mContext.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION);
                            if (notificationManager != null) {
                                notificationManager.createNotificationChannel(notificationChannel);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                UMLog uMLog4 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(TAG, 0, "Appkey和Secret key均不能为空");
            }
        } catch (Exception unused) {
            UMLog uMLog5 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, "注册失败");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void registerFailure(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage(this.mContext.getPackageName());
        intent.setAction(MsgConstant.MESSAGE_REGISTER_CALLBACK_ACTION);
        intent.putExtra("status", false);
        intent.putExtra(C3617o.f9366at, str);
        intent.putExtra("s1", str2);
        UMJobIntentService.enqueueWork(this.mContext, UmengMessageCallbackHandlerService.class, intent);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void registerSuccesss(String str) {
        Intent intent = new Intent();
        intent.setPackage(this.mContext.getPackageName());
        intent.setAction(MsgConstant.MESSAGE_REGISTER_CALLBACK_ACTION);
        intent.putExtra(MsgConstant.KEY_REGISTRATION_ID, str);
        intent.putExtra("status", true);
        UMJobIntentService.enqueueWork(this.mContext, UmengMessageCallbackHandlerService.class, intent);
    }

    public static void setAppLaunchByMessage() {
        sAppLaunchBy = true;
    }

    @Deprecated
    private void setAppkey(String str) {
        if (!C3819h.m10565d(this.mContext)) {
            return;
        }
        if (str == null || str.equals("")) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, "appkey不能为null");
            return;
        }
        MessageSharedPrefs.getInstance(this.mContext).setMessageAppKey(str);
    }

    @Deprecated
    private void setAppkeyAndSecret(String str, String str2) {
        if (C3819h.m10565d(this.mContext)) {
            String messageAppKey = MessageSharedPrefs.getInstance(this.mContext).getMessageAppKey();
            String messageAppSecret = MessageSharedPrefs.getInstance(this.mContext).getMessageAppSecret();
            if (!messageAppKey.equals(str) && !messageAppSecret.equals(str2)) {
                MessageSharedPrefs.getInstance(this.mContext).removeMessageAppKey();
                MessageSharedPrefs.getInstance(this.mContext).removeMessageAppSecret();
            }
            MessageSharedPrefs.getInstance(this.mContext).setMessageAppKey(str);
            MessageSharedPrefs.getInstance(this.mContext).setMessageAppSecret(str2);
            UTrack.getInstance(this.mContext).updateHeader();
        }
    }

    private void setDebugMode(boolean z) {
        DEBUG = z;
        ALog.setPrintLog(z);
        anet.channel.util.ALog.setPrintLog(z);
        SpdyAgent.enableDebug = z;
    }

    @Deprecated
    private void setMessageChannel(String str) {
        System.currentTimeMillis();
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setMessageChannel(str);
            C3780d.m10347a(new Runnable() {
                /* class com.umeng.message.PushAgent.RunnableC37566 */

                public void run() {
                    UTrack.getInstance(PushAgent.this.mContext).updateHeader();
                }
            });
        }
    }

    @Deprecated
    private void setSecret(String str) {
        if (!C3819h.m10565d(this.mContext)) {
            return;
        }
        if (str == null || str.equals("")) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, "appSecret不能为null");
            return;
        }
        MessageSharedPrefs.getInstance(this.mContext).setMessageAppSecret(str);
    }

    public void addAlias(String str, String str2, UTrack.ICallBack iCallBack) {
        UTrack.getInstance(this.mContext).addAlias(str, str2, iCallBack);
    }

    public void deleteAlias(String str, String str2, UTrack.ICallBack iCallBack) {
        UTrack.getInstance(this.mContext).deleteAlias(str, str2, iCallBack);
    }

    public UHandler getAdHandler() {
        return this.mAd;
    }

    public IUmengCallback getCallback() {
        return this.mUnregisterCallback;
    }

    public int getDisplayNotificationNumber() {
        return MessageSharedPrefs.getInstance(this.mContext).getDisplayNotificationNumber();
    }

    public String getMessageAppkey() {
        return MessageSharedPrefs.getInstance(this.mContext).getMessageAppKey();
    }

    public String getMessageChannel() {
        String messageChannel = MessageSharedPrefs.getInstance(this.mContext).getMessageChannel();
        return TextUtils.isEmpty(messageChannel) ? UmengMessageDeviceConfig.getChannel(this.mContext) : messageChannel;
    }

    public UHandler getMessageHandler() {
        return this.mMessageHandler;
    }

    public String getMessageSecret() {
        String messageAppSecret = MessageSharedPrefs.getInstance(this.mContext).getMessageAppSecret();
        return TextUtils.isEmpty(messageAppSecret) ? UmengMessageDeviceConfig.getMetaData(this.mContext, "UMENG_MESSAGE_SECRET") : messageAppSecret;
    }

    public int getMuteDurationSeconds() {
        return MessageSharedPrefs.getInstance(this.mContext).getMuteDuration();
    }

    public int getNoDisturbEndHour() {
        return MessageSharedPrefs.getInstance(this.mContext).mo39493c();
    }

    public int getNoDisturbEndMinute() {
        return MessageSharedPrefs.getInstance(this.mContext).mo39494d();
    }

    public int getNoDisturbStartHour() {
        return MessageSharedPrefs.getInstance(this.mContext).mo39480a();
    }

    public int getNoDisturbStartMinute() {
        return MessageSharedPrefs.getInstance(this.mContext).mo39491b();
    }

    public String getNotificationChannelName() {
        return MessageSharedPrefs.getInstance(this.mContext).mo39534h();
    }

    public UHandler getNotificationClickHandler() {
        return this.mNotificationClickHandler;
    }

    public boolean getNotificationOnForeground() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificaitonOnForeground();
    }

    public int getNotificationPlayLights() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificationPlayLights();
    }

    public int getNotificationPlaySound() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificationPlaySound();
    }

    public int getNotificationPlayVibrate() {
        return MessageSharedPrefs.getInstance(this.mContext).getNotificationPlayVibrate();
    }

    public String getPushIntentServiceClass() {
        return MessageSharedPrefs.getInstance(this.mContext).getPushIntentServiceClass();
    }

    public IUmengRegisterCallback getRegisterCallback() {
        return this.mRegisterCallback;
    }

    public String getRegistrationId() {
        return MessageSharedPrefs.getInstance(this.mContext).getDeviceToken();
    }

    public String getResourcePackageName() {
        return MessageSharedPrefs.getInstance(this.mContext).getResourcePackageName();
    }

    public TagManager getTagManager() {
        return this.mTagMgr;
    }

    public boolean isIncludesUmengUpdateSDK() {
        Class<?> cls;
        try {
            cls = Class.forName("com.umeng.update.UmengUpdateAgent");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        return cls != null;
    }

    public boolean isPushCheck() {
        return this.mPushCheck;
    }

    public void keepLowPowerMode(boolean z) {
        this.powerMode = !z;
    }

    public void onAppStart() {
        UTrack.getInstance(this.mContext).trackAppLaunch(TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE);
        UTrack.getInstance(this.mContext).sendCachedMsgLog(isAppLaunchByMessage() ? Math.abs(new Random().nextLong() % MsgConstant.f9886b) : 0);
    }

    public void setAlias(String str, String str2, UTrack.ICallBack iCallBack) {
        UTrack.getInstance(this.mContext).setAlias(str, str2, iCallBack);
    }

    public void setCallback(IUmengCallback iUmengCallback) {
        this.mUnregisterCallback = iUmengCallback;
    }

    public void setDisplayNotificationNumber(int i) {
        if (C3819h.m10565d(this.mContext) && i >= 0 && i <= 10) {
            MessageSharedPrefs.getInstance(this.mContext).setDisplayNotificationNumber(i);
        }
    }

    public void setEnableForground(Context context, boolean z) {
        GlobalConfig.setEnableForground(context, z);
    }

    public void setMessageHandler(UHandler uHandler) {
        this.mMessageHandler = uHandler;
    }

    public void setMuteDurationSeconds(int i) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setMuteDuration(i);
        }
    }

    public void setNoDisturbMode(int i, int i2, int i3, int i4) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).mo39481a(i, i2, i3, i4);
        }
    }

    public void setNotificaitonOnForeground(boolean z) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificaitonOnForeground(z);
        }
    }

    public void setNotificationChannelName(String str) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).mo39492b(str);
        }
    }

    public void setNotificationClickHandler(UHandler uHandler) {
        this.mNotificationClickHandler = uHandler;
    }

    public void setNotificationPlayLights(int i) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificationPlayLights(i);
        }
    }

    public void setNotificationPlaySound(int i) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificationPlaySound(i);
        }
    }

    public void setNotificationPlayVibrate(int i) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setNotificationPlayVibrate(i);
        }
    }

    public void setPushCheck(boolean z) {
        this.mPushCheck = z;
    }

    public <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setPushIntentServiceClass(cls);
        }
    }

    public void setRegisterCallback(IUmengRegisterCallback iUmengRegisterCallback) {
        this.mRegisterCallback = iUmengRegisterCallback;
    }

    public void setResourcePackageName(String str) {
        if (C3819h.m10565d(this.mContext)) {
            MessageSharedPrefs.getInstance(this.mContext).setResourcePackageName(str);
        }
    }

    public void disable(IUmengCallback iUmengCallback) {
        setCallback(iUmengCallback);
        disable();
    }

    public void enable(IUmengCallback iUmengCallback) {
        setCallback(iUmengCallback);
        enable();
    }

    public PushAgent() {
    }

    public void register(IUmengRegisterCallback iUmengRegisterCallback) {
        setRegisterCallback(iUmengRegisterCallback);
        register();
    }
}
