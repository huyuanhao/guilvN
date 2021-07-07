package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.service.UMJobIntentService;
import org.android.agoo.common.AgooConstants;

public abstract class UmengMessageService extends UMJobIntentService {

    /* renamed from: a */
    public static final String f10005a = UmengMessageService.class.getSimpleName();

    @Override // com.umeng.message.service.JobIntentService, com.umeng.message.service.UMJobIntentService
    /* renamed from: a */
    public void mo39680a(Intent intent) {
        try {
            onMessage(this, intent);
            String stringExtra = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
            UMLog uMLog = UMConfigure.umDebugLog;
            String str = f10005a;
            UMLog.mutlInfo(str, 2, "message:" + stringExtra);
        } catch (Throwable unused) {
        }
    }

    public abstract void onMessage(Context context, Intent intent);
}
