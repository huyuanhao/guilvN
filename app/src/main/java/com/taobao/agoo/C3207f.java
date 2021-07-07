package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.taobao.agoo.f */
public class C3207f implements BaseNotifyClickActivity.INotifyListener {
    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO;
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String str = null;
        if (intent == null) {
            ALog.m7599e("DefaultVivoMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra(AgooConstants.MESSAGE_VIVO_PAYLOAD);
            ALog.m7600i("DefaultVivoMsgParseImpl", "parseMsgFromIntent", "msg", str);
            return str;
        } catch (Throwable th) {
            ALog.m7598e("DefaultVivoMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return str;
        }
    }
}
