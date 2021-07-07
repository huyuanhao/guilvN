package org.android.agoo.control;

import com.taobao.accs.ACCSManager;
import com.taobao.accs.AbstractC3099c;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.json.JSONObject;

/* renamed from: org.android.agoo.control.m */
public class RunnableC4806m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f13469a;

    /* renamed from: b */
    public final /* synthetic */ String f13470b;

    /* renamed from: c */
    public final /* synthetic */ String f13471c;

    /* renamed from: d */
    public final /* synthetic */ boolean f13472d;

    /* renamed from: e */
    public final /* synthetic */ NotifManager f13473e;

    public RunnableC4806m(NotifManager notifManager, String str, String str2, String str3, boolean z) {
        this.f13473e = notifManager;
        this.f13469a = str;
        this.f13470b = str2;
        this.f13471c = str3;
        this.f13472d = z;
    }

    public void run() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("thirdTokenType", this.f13469a);
            hashMap.put("token", this.f13470b);
            hashMap.put("appkey", Config.m14266a(NotifManager.mContext));
            hashMap.put("utdid", C3178j.m7663b(NotifManager.mContext));
            hashMap.put("vendorSdkVersion", this.f13471c);
            ALog.m7597d(NotifManager.TAG, "report,utdid=" + C3178j.m7663b(NotifManager.mContext) + ",regId=" + this.f13470b + ",type=" + this.f13469a, new Object[0]);
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooTokenReport", new JSONObject(hashMap).toString().getBytes("UTF-8"), null, null, null, null);
            AbstractC3099c accsInstance = ACCSManager.getAccsInstance(NotifManager.mContext, Config.m14266a(NotifManager.mContext), Config.m14271b(NotifManager.mContext));
            if (this.f13472d) {
                str = accsInstance.mo37459a(NotifManager.mContext, accsRequest);
            } else {
                str = accsInstance.mo37460a(NotifManager.mContext, accsRequest, new TaoBaseService.ExtraInfo());
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m7600i(NotifManager.TAG, "reportThirdPushToken,dataId=" + str + ",regId=" + this.f13470b + ",type=" + this.f13469a, new Object[0]);
            }
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "reportThirdPushToken", C3178j.m7663b(NotifManager.mContext), th.toString());
            if (ALog.isPrintLog(ALog.Level.f7180E)) {
                ALog.m7598e(NotifManager.TAG, "[report] is error", th, new Object[0]);
            }
        }
    }
}
