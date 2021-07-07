package org.android.agoo.control;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.p259a.C3084a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.UTMini;
import com.umeng.commonsdk.proguard.C3617o;
import com.xiaomi.mipush.sdk.Constants;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.android.agoo.message.MessageService;
import org.android.agoo.service.SendMessage;
import org.json.JSONArray;
import org.json.JSONObject;

public class AgooFactory {
    public static final String DEAL_MESSAGE = "accs.msgRecevie";
    public static final String TAG = "AgooFactory";
    public static Context mContext;
    public MessageService messageService = null;
    public NotifManager notifyManager = null;

    /* renamed from: org.android.agoo.control.AgooFactory$a */
    public class ServiceConnectionC4792a implements ServiceConnection {

        /* renamed from: b */
        public Intent f13436b;

        /* renamed from: c */
        public String f13437c;

        /* renamed from: d */
        public SendMessage f13438d;

        /* renamed from: e */
        public ServiceConnection f13439e = this;

        public ServiceConnectionC4792a(String str, Intent intent) {
            this.f13437c = str;
            this.f13436b = intent;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ALog.m7597d(AgooFactory.TAG, "MessageConnection conneted:" + componentName, new Object[0]);
            this.f13438d = SendMessage.Stub.asInterface(iBinder);
            ALog.m7597d(AgooFactory.TAG, "onConnected current tid:" + Thread.currentThread().getId(), new Object[0]);
            ALog.m7597d(AgooFactory.TAG, "MessageConnection sent:" + this.f13436b, new Object[0]);
            if (this.f13438d != null) {
                ThreadPoolExecutorFactory.execute(new RunnableC4799f(this));
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            ALog.m7597d(AgooFactory.TAG, "MessageConnection disConnected", new Object[0]);
        }
    }

    /* renamed from: org.android.agoo.control.AgooFactory$b */
    public class RunnableC4793b implements Runnable {

        /* renamed from: b */
        public String f13441b;

        /* renamed from: c */
        public Intent f13442c;

        public RunnableC4793b(String str, Intent intent) {
            this.f13441b = str;
            this.f13442c = intent;
        }

        public void run() {
            try {
                ALog.m7597d(AgooFactory.TAG, "running tid:" + Thread.currentThread().getId() + ",pack=" + this.f13441b, new Object[0]);
                AgooFactory.mContext.sendBroadcast(this.f13442c);
                StringBuilder sb = new StringBuilder();
                sb.append("SendMessageRunnable for accs,pack=");
                sb.append(this.f13441b);
                ALog.m7597d(AgooFactory.TAG, sb.toString(), new Object[0]);
                try {
                    this.f13442c.setPackage(this.f13441b);
                    this.f13442c.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
                    C3084a.m7226a(AgooFactory.mContext, this.f13442c);
                } catch (Throwable unused) {
                }
                Intent intent = new Intent(AgooConstants.BINDER_MSGRECEIVER_ACTION);
                intent.setPackage(this.f13441b);
                ALog.m7597d(AgooFactory.TAG, "this message pack:" + this.f13441b, new Object[0]);
                ALog.m7597d(AgooFactory.TAG, "start to service...", new Object[0]);
                boolean bindService = AgooFactory.mContext.bindService(intent, new ServiceConnectionC4792a(this.f13442c.getStringExtra("id"), this.f13442c), 17);
                ALog.m7597d(AgooFactory.TAG, "start service ret:" + bindService, new Object[0]);
                if (!bindService) {
                    ALog.m7597d(AgooFactory.TAG, "SendMessageRunnable is error", new Object[0]);
                }
            } catch (Throwable th) {
                ALog.m7599e(AgooFactory.TAG, "SendMessageRunnable is error,e=" + th.toString(), new Object[0]);
            }
        }
    }

    public static final boolean checkPackage(Context context, String str) {
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    public static Bundle getFlag(long j, MsgDO msgDO) {
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString(AgooConstants.MESSAGE_NOTIFICATION, "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String parseEncryptedMsg(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.control.AgooFactory.parseEncryptedMsg(java.lang.String):java.lang.String");
    }

    private void sendMsgByBindService(String str, Intent intent) {
        try {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m7597d(TAG, "onHandleMessage current tid:" + Thread.currentThread().getId(), new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new RunnableC4793b(str, intent));
        } catch (Throwable th) {
            ALog.m7598e(TAG, "sendMsgByBindService error >>", th, new Object[0]);
        }
    }

    private void sendMsgToBussiness(Context context, String str, Bundle bundle, boolean z, String str2, TaoBaseService.ExtraInfo extraInfo) {
        Intent intent = new Intent();
        intent.setAction(AgooConstants.INTENT_FROM_AGOO_MESSAGE);
        intent.setPackage(str);
        intent.putExtras(bundle);
        intent.putExtra("type", "common-push");
        intent.putExtra(AgooConstants.MESSAGE_SOURCE, str2);
        intent.addFlags(32);
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable(AgooConstants.MESSAGE_ACCS_EXTRA, extraInfo);
            intent.putExtra(AgooConstants.MESSAGE_AGOO_BUNDLE, bundle2);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "sendMsgToBussiness", th, new Object[0]);
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i(TAG, "sendMsgToBussiness intent:" + bundle.toString() + ",utdid=" + C3178j.m7663b(context) + ",pack=" + str + ",agooFlag=" + z, new Object[0]);
        }
        if (z) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, C3178j.m7663b(context), "agooMsg", AgooConstants.ACK_PACK_ERROR);
            sendMsgByBindService(str, intent);
            return;
        }
        intent.setClassName(str, C3103a.m7296a(str));
        C3084a.m7226a(context, intent);
    }

    public void init(Context context, NotifManager notifManager, MessageService messageService2) {
        mContext = context.getApplicationContext();
        this.notifyManager = notifManager;
        if (notifManager == null) {
            this.notifyManager = new NotifManager();
        }
        this.notifyManager.init(mContext);
        this.messageService = messageService2;
        if (messageService2 == null) {
            this.messageService = new MessageService();
        }
        this.messageService.mo44537a(mContext);
    }

    public Bundle msgReceiverPreHandler(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo, boolean z) {
        JSONArray jSONArray;
        String str2;
        int i;
        StringBuilder sb;
        StringBuilder sb2;
        int i2;
        String str3;
        Bundle bundle;
        StringBuilder sb3;
        String str4;
        boolean z2;
        String str5 = "ext";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str6 = new String(bArr, "utf-8");
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.m7600i(TAG, "msgRecevie,message--->[" + str6 + "]" + ",utdid=" + C3178j.m7663b(mContext), new Object[0]);
                    }
                    if (TextUtils.isEmpty(str6)) {
                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, C3178j.m7663b(mContext), "message==null");
                        ALog.m7600i(TAG, "handleMessage message==null,utdid=" + C3178j.m7663b(mContext), new Object[0]);
                        return null;
                    }
                    JSONArray jSONArray2 = new JSONArray(str6);
                    int length = jSONArray2.length();
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sb5 = new StringBuilder();
                    StringBuilder sb6 = new StringBuilder();
                    Bundle bundle2 = null;
                    String str7 = null;
                    int i3 = 0;
                    while (i3 < length) {
                        Bundle bundle3 = new Bundle();
                        JSONObject jSONObject = jSONArray2.getJSONObject(i3);
                        if (jSONObject == null) {
                            jSONArray = jSONArray2;
                            i2 = i3;
                            sb3 = sb6;
                            sb = sb4;
                            i = length;
                            str2 = str5;
                            str3 = str6;
                            bundle = bundle3;
                            sb2 = sb5;
                        } else {
                            MsgDO msgDO = new MsgDO();
                            jSONArray = jSONArray2;
                            String string = jSONObject.getString(C3617o.f9365as);
                            String string2 = jSONObject.getString(C3617o.f9367au);
                            String string3 = jSONObject.getString("b");
                            long j = jSONObject.getLong("f");
                            String string4 = !jSONObject.isNull(str5) ? jSONObject.getString(str5) : str7;
                            sb4.append(string2);
                            str2 = str5;
                            int i4 = length - 1;
                            if (i3 < i4) {
                                sb4.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            }
                            msgDO.msgIds = string2;
                            msgDO.extData = string4;
                            msgDO.removePacks = string;
                            msgDO.messageSource = str;
                            if (TextUtils.isEmpty(string3)) {
                                msgDO.errorCode = AgooConstants.ACK_BODY_NULL;
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else if (TextUtils.isEmpty(string)) {
                                msgDO.errorCode = AgooConstants.ACK_PACK_NULL;
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else if (j == -1) {
                                msgDO.errorCode = "13";
                                this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                            } else {
                                if (!checkPackage(mContext, string)) {
                                    ALog.m7597d(TAG, "msgRecevie checkpackage is del,pack=" + string, new Object[0]);
                                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, C3178j.m7663b(mContext), "deletePack", string);
                                    sb6.append(string);
                                    sb5.append(string2);
                                    if (i3 < i4) {
                                        sb6.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        sb5.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                    }
                                    sb2 = sb5;
                                    str4 = string4;
                                    i2 = i3;
                                    sb3 = sb6;
                                } else {
                                    Bundle flag = getFlag(j, msgDO);
                                    String string5 = flag.getString(AgooConstants.MESSAGE_ENCRYPTED);
                                    if (!mContext.getPackageName().equals(string)) {
                                        z2 = true;
                                    } else if (TextUtils.equals(string5, Integer.toString(4))) {
                                        z2 = false;
                                    } else {
                                        ALog.m7599e(TAG, "msgRecevie msg encrypted flag not exist, cannot prase!!!", new Object[0]);
                                        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, C3178j.m7663b(mContext), "encrypted!=4", AgooConstants.ACK_PACK_ERROR);
                                        msgDO.errorCode = AgooConstants.REPORT_NOT_ENCRYPT;
                                        this.notifyManager.handlerACKMessage(msgDO, extraInfo);
                                        str4 = string4;
                                        i2 = i3;
                                        sb3 = sb6;
                                        sb2 = sb5;
                                    }
                                    if (flag != null) {
                                        bundle = bundle3;
                                        bundle.putAll(flag);
                                    } else {
                                        bundle = bundle3;
                                    }
                                    try {
                                        String string6 = jSONObject.getString("t");
                                        if (!TextUtils.isEmpty(string6)) {
                                            bundle.putString("time", string6);
                                        }
                                    } catch (Throwable unused) {
                                        if (ALog.isPrintLog(ALog.Level.I)) {
                                            ALog.m7600i(TAG, "agoo msg has no time", new Object[0]);
                                        }
                                    }
                                    bundle.putLong(AgooConstants.MESSAGE_TRACE, System.currentTimeMillis());
                                    bundle.putString("id", string2);
                                    bundle.putString(AgooConstants.MESSAGE_BODY, string3);
                                    bundle.putString("source", string);
                                    bundle.putString(AgooConstants.MESSAGE_FROM_APPKEY, Config.m14266a(mContext));
                                    bundle.putString(AgooConstants.MESSAGE_EXT, string4);
                                    str3 = str6;
                                    bundle.putString(AgooConstants.MESSAGE_ORI, str3);
                                    if (z) {
                                        str4 = string4;
                                        i2 = i3;
                                        sb3 = sb6;
                                        sb2 = sb5;
                                        sb = sb4;
                                        i = length;
                                        sendMsgToBussiness(mContext, string, bundle, z2, str, extraInfo);
                                    } else {
                                        str4 = string4;
                                        i2 = i3;
                                        sb2 = sb5;
                                        sb3 = sb6;
                                        i = length;
                                        sb = sb4;
                                        bundle.putString("type", "common-push");
                                        bundle.putString(AgooConstants.MESSAGE_SOURCE, str);
                                    }
                                    str7 = str4;
                                }
                                str3 = str6;
                                bundle = bundle3;
                                i = length;
                                sb = sb4;
                                str7 = str4;
                            }
                            str4 = string4;
                            i2 = i3;
                            sb = sb4;
                            str3 = str6;
                            bundle = bundle3;
                            sb2 = sb5;
                            sb3 = sb6;
                            i = length;
                            str7 = str4;
                        }
                        i3 = i2 + 1;
                        sb6 = sb3;
                        bundle2 = bundle;
                        sb5 = sb2;
                        sb4 = sb;
                        length = i;
                        str5 = str2;
                        jSONArray2 = jSONArray;
                        str6 = str3;
                    }
                    if (sb6.length() > 0) {
                        MsgDO msgDO2 = new MsgDO();
                        msgDO2.msgIds = sb5.toString();
                        msgDO2.removePacks = sb6.toString();
                        msgDO2.errorCode = AgooConstants.ACK_REMOVE_PACKAGE;
                        msgDO2.messageSource = str;
                        this.notifyManager.handlerACKMessage(msgDO2, extraInfo);
                    }
                    return bundle2;
                }
            } catch (Throwable th) {
                if (!ALog.isPrintLog(ALog.Level.f7180E)) {
                    return null;
                }
                ALog.m7599e(TAG, "msgRecevie is error,e=" + th, new Object[0]);
                return null;
            }
        }
        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, DEAL_MESSAGE, C3178j.m7663b(mContext), "data==null");
        ALog.m7600i(TAG, "handleMessage data==null,utdid=" + C3178j.m7663b(mContext), new Object[0]);
        return null;
    }

    public void msgRecevie(byte[] bArr, String str) {
        msgRecevie(bArr, str, null);
    }

    public void reportCacheMsg() {
        try {
            ThreadPoolExecutorFactory.execute(new RunnableC4796c(this));
        } catch (Throwable th) {
            ALog.m7599e(TAG, "reportCacheMsg fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr) {
        saveMsg(bArr, null);
    }

    public void updateMsg(byte[] bArr, boolean z) {
        ThreadPoolExecutorFactory.execute(new RunnableC4797d(this, bArr, z));
    }

    public void updateMsgStatus(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m7600i(TAG, "updateNotifyMsg begin,messageId=" + str + ",status=" + str2 + ",reportTimes=" + Config.m14276e(mContext), new Object[0]);
                }
                if (TextUtils.equals(str2, "8")) {
                    this.messageService.mo44538a(str, "2");
                } else if (TextUtils.equals(str2, "9")) {
                    this.messageService.mo44538a(str, "3");
                }
            }
        } catch (Throwable th) {
            ALog.m7599e(TAG, "updateNotifyMsg e=" + th.toString(), new Object[0]);
        }
    }

    public void updateNotifyMsg(String str, String str2) {
        ThreadPoolExecutorFactory.execute(new RunnableC4798e(this, str, str2));
    }

    public void msgRecevie(byte[] bArr, String str, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m7600i(TAG, "into--[AgooFactory,msgRecevie]:messageSource=" + str, new Object[0]);
            }
            ThreadPoolExecutorFactory.execute(new RunnableC4795b(this, bArr, str, extraInfo));
        } catch (Throwable th) {
            ALog.m7599e(TAG, "serviceImpl init task fail:" + th.toString(), new Object[0]);
        }
    }

    public void saveMsg(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            ThreadPoolExecutorFactory.execute(new RunnableC4794a(this, bArr, str));
        }
    }
}
