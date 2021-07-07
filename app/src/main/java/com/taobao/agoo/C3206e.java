package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.taobao.agoo.e */
public class C3206e implements BaseNotifyClickActivity.INotifyListener {
    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO;
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String str = null;
        if (intent == null) {
            ALog.m7599e("DefaultOppoMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra(AgooConstants.MESSAGE_OPPO_PAYLOAD);
            ALog.m7600i("DefaultOppoMsgParseImpl", "parseMsgFromIntent", "msg", str);
            return str;
        } catch (Throwable th) {
            ALog.m7598e("DefaultOppoMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return str;
        }
    }
}
