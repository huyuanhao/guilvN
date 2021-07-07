package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IAppReceiverV1;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.net.AbstractC3137b;
import com.taobao.accs.p259a.C3084a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3169a;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.Config;

/* renamed from: com.taobao.accs.data.g */
public class C3116g {

    /* renamed from: a */
    public static Set<String> f6962a;

    /* renamed from: b */
    public static volatile C3116g f6963b;

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02e9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7386b(android.content.Context r28, com.taobao.accs.net.AbstractC3137b r29, android.content.Intent r30) {
        /*
        // Method dump skipped, instructions count: 790
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.C3116g.m7386b(android.content.Context, com.taobao.accs.net.b, android.content.Intent):void");
    }

    /* renamed from: b */
    public String mo37609b() {
        return C3178j.msgService;
    }

    /* renamed from: a */
    public static C3116g m7380a() {
        if (f6963b == null) {
            synchronized (C3116g.class) {
                if (f6963b == null) {
                    f6963b = new C3116g();
                }
            }
        }
        return f6963b;
    }

    /* renamed from: a */
    public static void m7381a(Context context, Intent intent) {
        m7382a(context, null, intent);
    }

    /* renamed from: a */
    public static void m7382a(Context context, AbstractC3137b bVar, Intent intent) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3117h(context, bVar, intent));
        } catch (Throwable th) {
            if (!(bVar == null || intent == null)) {
                String stringExtra = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                String stringExtra2 = intent.getStringExtra(Constants.KEY_DATA_ID);
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                    bVar.mo37658b(Message.buildErrorReportMessage(stringExtra2, intent.getStringExtra(Constants.KEY_SERVICE_ID), bVar.mo37654b((String) null), 3), true);
                }
            }
            ALog.m7598e("MsgDistribute", "distribMessage", th, new Object[0]);
            UTMini instance = UTMini.getInstance();
            instance.commitEvent(66001, "MsgToBuss8", "distribMessage" + th.toString(), Integer.valueOf(Constants.SDK_VERSION_CODE));
        }
    }

    /* renamed from: a */
    public boolean mo37607a(int i, String str) {
        if (i != 100 && !"agooSend".equals(str)) {
            long a = UtilityImpl.m7606a();
            if (a != -1 && a <= 5242880) {
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "space low " + a);
                ALog.m7599e("MsgDistribute", "user space low, don't distribute", FileAttachment.KEY_SIZE, Long.valueOf(a), Constants.KEY_SERVICE_ID, str);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo37608a(Context context, String str, String str2, Intent intent, IAppReceiver iAppReceiver) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
            if (TextUtils.isEmpty(service) && iAppReceiver != null) {
                service = iAppReceiver.getService(str);
            }
            if (TextUtils.isEmpty(service)) {
                service = GlobalClientInfo.getInstance(context).getService(str);
            }
            if (!TextUtils.isEmpty(service) || UtilityImpl.isMainProcess(context)) {
                return false;
            }
            if ("accs".equals(str)) {
                ALog.m7599e("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            } else {
                ALog.m7600i("MsgDistribute", "start MsgDistributeService", Constants.KEY_DATA_ID, str2);
            }
            intent.setClassName(intent.getPackage(), mo37609b());
            C3084a.m7226a(context, intent);
            return true;
        } catch (Throwable th) {
            ALog.m7598e("MsgDistribute", "handleMsgInChannelProcess", th, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    private void m7383a(Context context, AbstractC3137b bVar, Intent intent, String str, String str2, int i, String str3, String str4, String str5, IAppReceiver iAppReceiver, int i2) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            Object[] objArr = new Object[12];
            objArr[0] = Constants.KEY_CONFIG_TAG;
            objArr[1] = str;
            objArr[2] = Constants.KEY_DATA_ID;
            objArr[3] = str5;
            objArr[4] = Constants.KEY_SERVICE_ID;
            objArr[5] = str4;
            objArr[6] = "command";
            objArr[7] = Integer.valueOf(i);
            objArr[8] = Constants.KEY_ERROR_CODE;
            objArr[9] = Integer.valueOf(i2);
            objArr[10] = "appReceiver";
            objArr[11] = iAppReceiver == null ? null : iAppReceiver.getClass().getName();
            ALog.m7597d("MsgDistribute", "handleControlMsg", objArr);
        }
        if (iAppReceiver != null) {
            if (i != 1) {
                if (i == 2) {
                    if (i2 == 200) {
                        UtilityImpl.disableService(context);
                    }
                    iAppReceiver.onUnbindApp(i2);
                } else if (i == 3) {
                    iAppReceiver.onBindUser(str3, i2);
                } else if (i == 4) {
                    iAppReceiver.onUnbindUser(i2);
                } else if (i != 100) {
                    if (i == 101 && TextUtils.isEmpty(str4)) {
                        ALog.m7597d("MsgDistribute", "handleControlMsg serviceId isEmpty", new Object[0]);
                        byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                        if (byteArrayExtra != null) {
                            iAppReceiver.onData(str3, str5, byteArrayExtra);
                        }
                    }
                } else if (TextUtils.isEmpty(str4)) {
                    iAppReceiver.onSendData(str5, i2);
                }
            } else if (iAppReceiver instanceof IAppReceiverV1) {
                ((IAppReceiverV1) iAppReceiver).onBindApp(i2, null);
            } else {
                iAppReceiver.onBindApp(i2);
            }
        }
        if (i == 1 && GlobalClientInfo.f6859b != null && str2 != null && str2.equals(Config.m14266a(context))) {
            ALog.m7597d("MsgDistribute", "handleControlMsg agoo receiver onBindApp", new Object[0]);
            GlobalClientInfo.f6859b.onBindApp(i2, null);
        } else if (iAppReceiver == null && i != 104 && i != 103) {
            if (bVar != null) {
                bVar.mo37658b(Message.buildErrorReportMessage(str5, str4, bVar.mo37654b((String) null), 0), true);
            }
            C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str4, "1", "appReceiver null return");
            UTMini.getInstance().commitEvent(66001, "MsgToBuss7", "commandId=" + i, "serviceId=" + str4 + " errorCode=" + i2 + " dataId=" + str5, Integer.valueOf(Constants.SDK_VERSION_CODE));
        }
    }

    /* renamed from: b */
    private boolean m7387b(Context context, Intent intent, String str, String str2) {
        if (context.getPackageName().equals(intent.getPackage())) {
            return false;
        }
        try {
            ALog.m7599e("MsgDistribute", "start MsgDistributeService", "receive pkg", context.getPackageName(), "target pkg", intent.getPackage(), Constants.KEY_SERVICE_ID, str2);
            intent.setClassName(intent.getPackage(), C3178j.msgService);
            intent.putExtra("routingMsg", true);
            intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
            C3084a.m7226a(context, intent);
            if (f6962a == null) {
                f6962a = new HashSet();
            }
            f6962a.add(str);
            ThreadPoolExecutorFactory.schedule(new RunnableC3118i(this, str, str2, intent), 10, TimeUnit.SECONDS);
        } catch (Throwable th) {
            C3179k.m7668a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "", "exception", th.toString());
            ALog.m7598e("MsgDistribute", "routing msg error, try election", th, Constants.KEY_SERVICE_ID, str2, Constants.KEY_DATA_ID, str);
        }
        return true;
    }

    /* renamed from: a */
    public void mo37605a(Context context, AbstractC3137b bVar, IAppReceiver iAppReceiver, Intent intent, String str, String str2, int i, int i2) {
        ALog.m7600i("MsgDistribute", "handleBusinessMsg start", Constants.KEY_DATA_ID, str2, Constants.KEY_SERVICE_ID, str, "command", Integer.valueOf(i));
        String service = GlobalClientInfo.getInstance(context).getService(intent.getStringExtra(Constants.KEY_CONFIG_TAG), str);
        if (TextUtils.isEmpty(service) && iAppReceiver != null) {
            service = iAppReceiver.getService(str);
        }
        if (TextUtils.isEmpty(service)) {
            service = GlobalClientInfo.getInstance(context).getService(str);
        }
        if (!TextUtils.isEmpty(service)) {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m7597d("MsgDistribute", "handleBusinessMsg to start service", PushClientConstants.TAG_CLASS_NAME, service);
            }
            intent.setClassName(context, service);
            C3084a.m7226a(context, intent);
        } else {
            AccsDataListener listener = GlobalClientInfo.getInstance(context).getListener(str);
            if (listener != null) {
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m7597d("MsgDistribute", "handleBusinessMsg getListener not null", new Object[0]);
                }
                C3169a.m7653a(context, intent, listener);
            } else {
                if (bVar != null) {
                    bVar.mo37658b(Message.buildErrorReportMessage(str2, str, bVar.mo37654b((String) null), 0), true);
                }
                ALog.m7599e("MsgDistribute", "handleBusinessMsg getListener also null", new Object[0]);
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, str, "1", "service is null");
            }
        }
        UTMini.getInstance().commitEvent(66001, "MsgToBuss", "commandId=" + i, "serviceId=" + str + " errorCode=" + i2 + " dataId=" + str2, Integer.valueOf(Constants.SDK_VERSION_CODE));
        StringBuilder sb = new StringBuilder();
        sb.append("2commandId=");
        sb.append(i);
        sb.append("serviceId=");
        sb.append(str);
        C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, sb.toString(), AbstractC8352oOoOOoO0.OooO0O0);
    }

    /* renamed from: a */
    public void mo37606a(Context context, Map<String, IAppReceiver> map, Intent intent, int i, int i2) {
        ALog.m7600i("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, IAppReceiver> entry : map.entrySet()) {
                Map<String, String> allService = GlobalClientInfo.getInstance(context).getAllService(entry.getKey());
                if (allService == null) {
                    allService = entry.getValue().getAllServices();
                }
                if (allService != null) {
                    hashMap.putAll(allService);
                }
            }
        }
        if (i == 103) {
            for (String str : hashMap.keySet()) {
                if ("accs".equals(str) || "windvane".equals(str) || "motu-remote".equals(str)) {
                    String str2 = (String) hashMap.get(str);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = GlobalClientInfo.getInstance(context).getService(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setClassName(context, str2);
                        C3084a.m7226a(context, intent);
                    }
                }
            }
            boolean booleanExtra = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
            String stringExtra = intent.getStringExtra("host");
            String stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
            boolean booleanExtra2 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
            boolean booleanExtra3 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
            TaoBaseService.ConnectInfo connectInfo = null;
            if (!TextUtils.isEmpty(stringExtra)) {
                if (booleanExtra) {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
                } else {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, i2, stringExtra2);
                }
                connectInfo.connected = booleanExtra;
            }
            if (connectInfo != null) {
                ALog.m7597d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
                Intent intent2 = new Intent(Constants.ACTION_CONNECT_INFO);
                intent2.setPackage(context.getPackageName());
                intent2.putExtra(Constants.KEY_CONNECT_INFO, connectInfo);
                context.sendBroadcast(intent2);
                return;
            }
            ALog.m7599e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
        } else if (i == 104) {
            for (String str3 : hashMap.keySet()) {
                String str4 = (String) hashMap.get(str3);
                if (TextUtils.isEmpty(str4)) {
                    str4 = GlobalClientInfo.getInstance(context).getService(str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    intent.setClassName(context, str4);
                    C3084a.m7226a(context, intent);
                }
            }
        } else {
            ALog.m7603w("MsgDistribute", "handBroadCastMsg not handled command", new Object[0]);
        }
    }

    /* renamed from: a */
    private boolean m7385a(Context context, Intent intent, String str, String str2) {
        boolean z;
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        boolean booleanExtra2 = intent.getBooleanExtra("routingMsg", false);
        if (booleanExtra) {
            ALog.m7599e("MsgDistribute", "recieve routiong ack", Constants.KEY_DATA_ID, str, Constants.KEY_SERVICE_ID, str2);
            Set<String> set = f6962a;
            if (set != null) {
                set.remove(str);
            }
            C3179k.m7666a("accs", BaseMonitor.ALARM_MSG_ROUTING_RATE, "");
            z = true;
        } else {
            z = false;
        }
        if (booleanExtra2) {
            try {
                String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
                ALog.m7599e("MsgDistribute", "send routiong ack", Constants.KEY_DATA_ID, str, "to pkg", stringExtra, Constants.KEY_SERVICE_ID, str2);
                Intent intent2 = new Intent(Constants.ACTION_COMMAND);
                intent2.putExtra("command", 106);
                intent2.setClassName(stringExtra, C3178j.channelService);
                intent2.putExtra("routingAck", true);
                intent2.putExtra(Constants.KEY_PACKAGE_NAME, stringExtra);
                intent2.putExtra(Constants.KEY_DATA_ID, str);
                C3084a.m7226a(context, intent);
            } catch (Throwable th) {
                ALog.m7598e("MsgDistribute", "send routing ack", th, Constants.KEY_SERVICE_ID, str2);
            }
        }
        return z;
    }
}
