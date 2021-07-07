package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3179k;
import com.taobao.agoo.BaseNotifyClickActivity;
import java.util.Iterator;
import java.util.Set;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* renamed from: com.taobao.agoo.a */
public abstract class AbstractC3196a {
    public static final String TAG = "accs.BaseNotifyClick";
    public AgooFactory agooFactory;
    public Context context;
    public String msgSource;
    public NotifManager notifyManager;

    private void buildMessage(Intent intent) {
        ThreadPoolExecutorFactory.execute(new RunnableC3203b(this, intent));
    }

    /* access modifiers changed from: private */
    public String parseMsgByThirdPush(Intent intent) {
        String str;
        Set<BaseNotifyClickActivity.INotifyListener> set = BaseNotifyClickActivity.notifyListeners;
        if (set != null && set.size() > 0) {
            Iterator<BaseNotifyClickActivity.INotifyListener> it = BaseNotifyClickActivity.notifyListeners.iterator();
            str = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseNotifyClickActivity.INotifyListener next = it.next();
                String parseMsgFromIntent = next.parseMsgFromIntent(intent);
                if (!TextUtils.isEmpty(parseMsgFromIntent)) {
                    this.msgSource = next.getMsgSource();
                    str = parseMsgFromIntent;
                    break;
                }
                str = parseMsgFromIntent;
            }
        } else {
            ALog.m7599e(TAG, "no impl, try use default impl to parse intent!", new Object[0]);
            BaseNotifyClickActivity.INotifyListener cVar = new C3204c();
            str = cVar.parseMsgFromIntent(intent);
            if (TextUtils.isEmpty(str)) {
                cVar = new C3208g();
                str = cVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                cVar = new C3206e();
                str = cVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                cVar = new C3207f();
                str = cVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                cVar = new C3205d();
                str = cVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                C3179k.m7667a("accs", "error", "parse 3push error", AbstractC8352oOoOOoO0.OooO0O0);
            } else {
                this.msgSource = cVar.getMsgSource();
                C3179k.m7667a("accs", "error", "parse 3push default " + this.msgSource, AbstractC8352oOoOOoO0.OooO0O0);
            }
        }
        ALog.m7600i(TAG, "parseMsgByThirdPush", "result", str, "msgSource", this.msgSource);
        return str;
    }

    /* access modifiers changed from: private */
    public void reportClickNotifyMsg(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("id");
            String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_SOURCE);
            String stringExtra3 = intent.getStringExtra("report");
            String stringExtra4 = intent.getStringExtra(AgooConstants.MESSAGE_EXT);
            MsgDO msgDO = new MsgDO();
            msgDO.msgIds = stringExtra;
            msgDO.extData = stringExtra4;
            msgDO.messageSource = stringExtra2;
            msgDO.reportStr = stringExtra3;
            msgDO.msgStatus = "8";
            ALog.m7600i(TAG, "reportClickNotifyMsg messageId:" + stringExtra + " source:" + stringExtra2 + " reportStr:" + stringExtra3 + " status:" + msgDO.msgStatus, new Object[0]);
            this.notifyManager.report(msgDO, null);
        } catch (Exception e) {
            ALog.m7599e(TAG, "reportClickNotifyMsg exception: " + e, new Object[0]);
        }
    }

    public void onCreate(Context context2, Intent intent) {
        ALog.m7600i(TAG, "onCreate", new Object[0]);
        this.context = context2;
        buildMessage(intent);
    }

    public abstract void onMessage(Intent intent);

    public void onNewIntent(Intent intent) {
        ALog.m7600i(TAG, "onNewIntent", new Object[0]);
        buildMessage(intent);
    }
}
