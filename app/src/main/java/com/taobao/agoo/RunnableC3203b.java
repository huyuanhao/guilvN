package com.taobao.agoo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

/* renamed from: com.taobao.agoo.b */
public class RunnableC3203b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f7292a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC3196a f7293b;

    public RunnableC3203b(AbstractC3196a aVar, Intent intent) {
        this.f7293b = aVar;
        this.f7292a = intent;
    }

    public void run() {
        Throwable th;
        Intent intent = null;
        try {
            if (this.f7292a != null) {
                String str = this.f7293b.parseMsgByThirdPush(this.f7292a);
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f7293b.msgSource)) {
                    ALog.m7599e(AbstractC3196a.TAG, "parseMsgFromNotifyListener null!!", "source", this.f7293b.msgSource);
                } else {
                    if (this.f7293b.notifyManager == null) {
                        this.f7293b.notifyManager = new NotifManager();
                    }
                    if (this.f7293b.agooFactory == null) {
                        this.f7293b.agooFactory = new AgooFactory();
                        this.f7293b.agooFactory.init(this.f7293b.context, this.f7293b.notifyManager, null);
                    }
                    Bundle msgReceiverPreHandler = this.f7293b.agooFactory.msgReceiverPreHandler(str.getBytes("UTF-8"), this.f7293b.msgSource, null, false);
                    String string = msgReceiverPreHandler.getString(AgooConstants.MESSAGE_BODY);
                    ALog.m7600i(AbstractC3196a.TAG, "begin parse EncryptedMsg", new Object[0]);
                    String parseEncryptedMsg = AgooFactory.parseEncryptedMsg(string);
                    if (!TextUtils.isEmpty(parseEncryptedMsg)) {
                        msgReceiverPreHandler.putString(AgooConstants.MESSAGE_BODY, parseEncryptedMsg);
                    } else {
                        ALog.m7599e(AbstractC3196a.TAG, "parse EncryptedMsg fail, empty", new Object[0]);
                    }
                    Intent intent2 = new Intent();
                    try {
                        intent2.putExtras(msgReceiverPreHandler);
                        this.f7293b.agooFactory.saveMsg(str.getBytes("UTF-8"), "2");
                        this.f7293b.reportClickNotifyMsg(intent2);
                        intent = intent2;
                    } catch (Throwable th2) {
                        intent = intent2;
                        th = th2;
                        try {
                            ALog.m7598e(AbstractC3196a.TAG, "buildMessage", th, new Object[0]);
                            try {
                                this.f7293b.onMessage(intent);
                                return;
                            } catch (Throwable th3) {
                                ALog.m7598e(AbstractC3196a.TAG, "onMessage", th3, new Object[0]);
                                return;
                            }
                        } catch (Throwable th4) {
                            ALog.m7598e(AbstractC3196a.TAG, "onMessage", th4, new Object[0]);
                        }
                    }
                }
            }
            try {
                this.f7293b.onMessage(intent);
                return;
            } catch (Throwable th5) {
                ALog.m7598e(AbstractC3196a.TAG, "onMessage", th5, new Object[0]);
                return;
            }
        } catch (Throwable th6) {
            th = th6;
            ALog.m7598e(AbstractC3196a.TAG, "buildMessage", th, new Object[0]);
            this.f7293b.onMessage(intent);
            return;
        }
        throw th;
    }
}
