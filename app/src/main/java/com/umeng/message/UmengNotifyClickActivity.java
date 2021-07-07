package com.umeng.message;

import android.content.Intent;
import android.os.Bundle;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UMessage;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class UmengNotifyClickActivity extends BaseNotifyClickActivity {

    /* renamed from: a */
    public static final String f10007a = UmengNotifyClickActivity.class.getName();

    /* renamed from: a */
    public void mo39720a(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity
    public void onMessage(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
            UMLog uMLog = UMConfigure.umDebugLog;
            String str = f10007a;
            UMLog.mutlInfo(str, 2, "onMessage():[" + stringExtra + "]");
            try {
                UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                uMessage.message_id = intent.getStringExtra("id");
                uMessage.task_id = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
                UTrack.getInstance(this).trackMiPushMsgClick(uMessage);
            } catch (JSONException e) {
                e.printStackTrace();
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f10007a, 2, e.toString());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo39718a() {
        super.onStart();
    }

    /* renamed from: a */
    public void mo39719a(Intent intent) {
        super.onNewIntent(intent);
    }
}
