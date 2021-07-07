package org.android.agoo.control;

import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3179k;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.d */
public class RunnableC4797d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ byte[] f13451a;

    /* renamed from: b */
    public final /* synthetic */ boolean f13452b;

    /* renamed from: c */
    public final /* synthetic */ AgooFactory f13453c;

    public RunnableC4797d(AgooFactory agooFactory, byte[] bArr, boolean z) {
        this.f13453c = agooFactory;
        this.f13451a = bArr;
        this.f13452b = z;
    }

    public void run() {
        try {
            String str = new String(this.f13451a, "utf-8");
            if (TextUtils.isEmpty(str)) {
                C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "msg==null", AbstractC8352oOoOOoO0.OooO0O0);
                return;
            }
            ALog.m7600i(AgooFactory.TAG, "message = " + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            String str2 = null;
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("id");
            if (TextUtils.equals(string, "agooReport")) {
                str2 = jSONObject.getString("status");
            }
            if (TextUtils.equals(string, AgooConstants.AGOO_SERVICE_AGOOACK)) {
                C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "handlerACKMessage", AbstractC8352oOoOOoO0.OooO0O0);
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(str2)) {
                C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json key null", AbstractC8352oOoOOoO0.OooO0O0);
                return;
            }
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m7600i(AgooFactory.TAG, "updateMsg data begin,api=" + string + ",id=" + string2 + ",status=" + str2 + ",reportTimes=" + Config.m14276e(AgooFactory.mContext), new Object[0]);
            }
            if (TextUtils.equals(string, "agooReport")) {
                if (TextUtils.equals(str2, "4") && this.f13452b) {
                    this.f13453c.messageService.mo44538a(string2, "1");
                } else if ((TextUtils.equals(str2, "8") || TextUtils.equals(str2, "9")) && this.f13452b) {
                    this.f13453c.messageService.mo44538a(string2, MessageService.MSG_DB_COMPLETE);
                }
                C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, str2, AbstractC8352oOoOOoO0.OooO0O0);
            }
        } catch (Throwable th) {
            ALog.m7599e(AgooFactory.TAG, "updateMsg get data error,e=" + th, new Object[0]);
            C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, "json exception", AbstractC8352oOoOOoO0.OooO0O0);
        }
    }
}
