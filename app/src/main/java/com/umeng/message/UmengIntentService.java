package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.entity.UMessage;
import com.umeng.message.service.UMJobIntentService;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

public class UmengIntentService extends UmengBaseIntentService {

    /* renamed from: a */
    public static final String f9977a = UmengIntentService.class.getName();

    /* renamed from: a */
    private Intent m10277a(Intent intent, UMessage uMessage) {
        Map<String, String> map;
        if (!(intent == null || uMessage == null || (map = uMessage.extra) == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    intent.putExtra(key, value);
                }
            }
        }
        return intent;
    }

    @Override // com.umeng.message.UmengBaseIntentService, org.android.agoo.control.BaseIntentService, com.taobao.agoo.TaobaoBaseIntentService
    public void onMessage(final Context context, Intent intent) {
        try {
            MLog.m9802i(f9977a, "--->>> UmengIntentService onMessage");
            super.onMessage(context, intent);
            try {
                String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
                String stringExtra2 = intent.getStringExtra("id");
                String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
                final UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                if (UMessage.DISPLAY_TYPE_PULLAPP.equals(uMessage.display_type)) {
                    if (uMessage.isAction) {
                        uMessage.pulled_service = UmengMessageDeviceConfig.getServiceName(this, uMessage.pulled_service, uMessage.pulled_package);
                    }
                    if (UmengMessageDeviceConfig.isServiceWork(context, uMessage.pulled_service, uMessage.pulled_package)) {
                        UTrack.getInstance(context).trackMsgPulled(uMessage, 52);
                    } else if (!UmengMessageDeviceConfig.getDataData(uMessage.pulled_package)) {
                        UTrack.getInstance(context).trackMsgPulled(uMessage, 53);
                    } else {
                        Intent intent2 = new Intent();
                        intent2.setClassName(uMessage.pulled_package, uMessage.pulled_service);
                        m10277a(intent2, uMessage);
                        ThreadPoolExecutorFactory.execute(new Runnable() {
                            /* class com.umeng.message.UmengIntentService.RunnableC37721 */

                            public void run() {
                                try {
                                    Thread.sleep(WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                Context context = context;
                                UMessage uMessage = uMessage;
                                if (UmengMessageDeviceConfig.isServiceWork(context, uMessage.pulled_service, uMessage.pulled_package)) {
                                    UTrack.getInstance(context).trackMsgPulled(uMessage, 51);
                                } else {
                                    UTrack.getInstance(context).trackMsgPulled(uMessage, 50);
                                }
                            }
                        });
                    }
                } else if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
                    MLog.m9802i(f9977a, "--->>> UmengIntentSerivce display_type is DISPLAY_TYPE_NOTIFICATIONPULLAPP");
                    Intent intent3 = new Intent();
                    intent3.setPackage(context.getPackageName());
                    intent3.setAction(MsgConstant.MESSAGE_MESSAGE_HANDLER_ACTION);
                    intent3.putExtra(AgooConstants.MESSAGE_BODY, stringExtra);
                    intent3.putExtra("id", stringExtra2);
                    intent3.putExtra(AgooConstants.MESSAGE_TASK_ID, stringExtra3);
                    UMJobIntentService.enqueueWork(context, UmengMessageCallbackHandlerService.class, intent3);
                } else {
                    String pushIntentServiceClass = MessageSharedPrefs.getInstance(context).getPushIntentServiceClass();
                    if (!pushIntentServiceClass.equalsIgnoreCase("")) {
                        String str = f9977a;
                        MLog.m9802i(str, "--->>> UmengIntentSerivce display_type is " + pushIntentServiceClass + " service");
                        Intent intent4 = new Intent();
                        intent4.setClassName(context, pushIntentServiceClass);
                        intent4.setPackage(context.getPackageName());
                        intent4.putExtra(AgooConstants.MESSAGE_BODY, stringExtra);
                        intent4.putExtra("id", stringExtra2);
                        intent4.putExtra(AgooConstants.MESSAGE_TASK_ID, stringExtra3);
                        UMJobIntentService.enqueueWork(context, pushIntentServiceClass, intent4);
                        return;
                    }
                    MLog.m9802i(f9977a, "--->>> UmengIntentSerivce display_type is else");
                    Intent intent5 = new Intent();
                    intent5.setPackage(context.getPackageName());
                    intent5.setAction(MsgConstant.MESSAGE_MESSAGE_HANDLER_ACTION);
                    intent5.putExtra(AgooConstants.MESSAGE_BODY, stringExtra);
                    intent5.putExtra("id", stringExtra2);
                    intent5.putExtra(AgooConstants.MESSAGE_TASK_ID, stringExtra3);
                    UMJobIntentService.enqueueWork(context, UmengMessageCallbackHandlerService.class, intent5);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable unused) {
        }
    }
}
