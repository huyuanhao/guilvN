package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.taobao.agoo.TaobaoBaseIntentService;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3849m;
import org.android.agoo.common.AgooConstants;
import org.json.JSONObject;

public abstract class UmengBaseIntentService extends TaobaoBaseIntentService {

    /* renamed from: a */
    public static final String f9957a = UmengBaseIntentService.class.getName();

    @Override // org.android.agoo.control.BaseIntentService, com.taobao.agoo.TaobaoBaseIntentService
    public void onError(Context context, String str) {
        UMLog uMLog = UMConfigure.umDebugLog;
        String str2 = f9957a;
        UMLog.mutlInfo(str2, 0, "onError()[" + str + "]");
    }

    @Override // org.android.agoo.control.BaseIntentService, com.taobao.agoo.TaobaoBaseIntentService
    public void onMessage(Context context, Intent intent) {
        try {
            MLog.m9802i(f9957a, "--->>> UmengBaseIntentService onMessage");
            if (Process.getElapsedCpuTime() < 3000) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9957a, 2, "应用程序通过推送消息启动");
                PushAgent.setAppLaunchByMessage();
            }
            String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
            UMLog uMLog2 = UMConfigure.umDebugLog;
            String str = f9957a;
            UMLog.mutlInfo(str, 2, "onMessage():[" + stringExtra + "]");
            try {
                UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                uMessage.message_id = intent.getStringExtra("id");
                uMessage.task_id = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
                UTrack.getInstance(getApplicationContext()).trackMsgArrival(uMessage);
                C3849m.m10581a(context).mo39926a(uMessage.message_id, uMessage.task_id, uMessage.display_type);
                if (TextUtils.equals(UMessage.DISPLAY_TYPE_AUTOUPDATE, uMessage.display_type)) {
                    String stringExtra2 = intent.getStringExtra("id");
                    String stringExtra3 = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
                    Intent intent2 = new Intent();
                    intent2.setPackage(context.getPackageName());
                    intent2.setAction(MsgConstant.MESSAGE_AUTOUPDATE_HANDLER_ACTION);
                    intent2.putExtra(AgooConstants.MESSAGE_BODY, stringExtra);
                    intent2.putExtra("id", stringExtra2);
                    intent2.putExtra(AgooConstants.MESSAGE_TASK_ID, stringExtra3);
                }
            } catch (Exception e) {
                e.printStackTrace();
                UMLog uMLog3 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9957a, 0, e.toString());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // org.android.agoo.control.BaseIntentService, com.taobao.agoo.TaobaoBaseIntentService
    public void onRegistered(Context context, String str) {
    }

    @Override // com.taobao.agoo.TaobaoBaseIntentService
    public void onUnregistered(Context context, String str) {
    }
}
