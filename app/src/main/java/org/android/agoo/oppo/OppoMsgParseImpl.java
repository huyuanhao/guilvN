package org.android.agoo.oppo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

public class OppoMsgParseImpl implements BaseNotifyClickActivity.INotifyListener {
    public static final String TAG = "OppoMsgParseImpl";

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String getMsgSource() {
        return AgooConstants.MESSAGE_SYSTEM_SOURCE_OPPO;
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity.INotifyListener
    public String parseMsgFromIntent(Intent intent) {
        String str = null;
        if (intent == null) {
            ALog.m7599e(TAG, "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra(AgooConstants.MESSAGE_OPPO_PAYLOAD);
            ALog.m7600i(TAG, "parseMsgFromIntent", "msg", str);
            return str;
        } catch (Throwable th) {
            ALog.m7598e(TAG, "parseMsgFromIntent", th, new Object[0]);
            return str;
        }
    }
}
