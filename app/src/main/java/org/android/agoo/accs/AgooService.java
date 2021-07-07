package org.android.agoo.accs;

import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.UTMini;
import java.nio.charset.Charset;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.CallBack;
import org.android.agoo.common.Config;
import org.android.agoo.control.AgooFactory;

public class AgooService extends TaoBaseService {

    /* renamed from: a */
    public static CallBack f13426a;

    /* renamed from: b */
    public static CallBack f13427b;

    /* renamed from: c */
    public AgooFactory f13428c;

    /* renamed from: a */
    private String m14265a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.f7180E)) {
            ALog.m7599e("AgooService", "into--[onBind]:serviceId:" + str + ",errorCode=" + i, new Object[0]);
        }
        if (f13426a != null && "agooSend".equals(str)) {
            if (i == 200) {
                f13426a.onSuccess();
            } else {
                f13426a.onFailure(String.valueOf(i), "bind Agoo service fail");
            }
        }
        f13426a = null;
    }

    @Override // com.taobao.accs.base.TaoBaseService
    public void onCreate() {
        super.onCreate();
        ALog.m7597d("AgooService", "into--[onCreate]", new Object[0]);
        AgooFactory agooFactory = new AgooFactory();
        this.f13428c = agooFactory;
        agooFactory.init(getApplicationContext(), null, null);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i("AgooService", "into--[onData]:serviceId:" + str + ",dataId=" + str3, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("push data:");
            sb.append(new String(bArr, Charset.forName("UTF-8")));
            ALog.m7597d("AgooService", sb.toString(), new Object[0]);
        }
        UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", C3178j.m7663b(getApplicationContext()), str3);
        C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_TOTAL_ARRIVE, "total_arrive", AbstractC8352oOoOOoO0.OooO0O0);
        try {
            this.f13428c.saveMsg(bArr);
            this.f13428c.msgRecevie(bArr, "accs", extraInfo);
        } catch (Throwable th) {
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", "onDataError", th);
            ALog.m7599e("AgooService", "into--[onData,dealMessage]:error:" + th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i("AgooService", "onResponse,dataId=" + str2 + ",errorCode=" + i + ",data=" + bArr + ",serviceId=" + str, new Object[0]);
        }
        String str3 = null;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    str3 = new String(bArr, "utf-8");
                }
            } catch (Throwable th) {
                ALog.m7599e("AgooService", "onResponse get data error,e=" + th, new Object[0]);
            }
        }
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m7597d("AgooService", "onResponse,message=" + str3, new Object[0]);
        }
        if (i == 200 && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
            if (ALog.isPrintLog(ALog.Level.f7180E)) {
                ALog.m7599e("AgooService", "request is success", Constants.KEY_DATA_ID, str2);
            }
            this.f13428c.updateMsg(bArr, true);
        } else if (i != 200 && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK)) {
            if (ALog.isPrintLog(ALog.Level.f7180E)) {
                ALog.m7599e("AgooService", "request is error", Constants.KEY_DATA_ID, str2, "errorid", Integer.valueOf(i));
            }
            Config.m14267a(getApplicationContext(), 1);
            C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i), AbstractC8352oOoOOoO0.OooO0O0);
        } else if (ALog.isPrintLog(ALog.Level.f7180E)) {
            ALog.m7599e("AgooService", "business request is error,message=" + str3, new Object[0]);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m7600i("AgooService", "onSendData,dataId=" + str2 + ",errorCode=" + i + ",serviceId=" + str, new Object[0]);
            }
            if (i == 200) {
                if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                    C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_SUCCESS_ACK, "8/9", AbstractC8352oOoOOoO0.OooO0O0);
                }
                if (TextUtils.isEmpty(str) || !TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) || Long.parseLong(str2) <= 300000000 || Long.parseLong(str2) >= 600000000) {
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, AgooConstants.AGOO_SERVICE_AGOOACK) && Long.parseLong(str2) > 600000000 && ALog.isPrintLog(ALog.Level.I)) {
                        ALog.m7600i("AgooService", "onSendData,reportData=" + str2 + ",serviceId=" + str, new Object[0]);
                    }
                } else if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m7600i("AgooService", "onSendData,AckData=" + str2 + ",serviceId=" + str, new Object[0]);
                }
            } else {
                if (TextUtils.equals(AgooConstants.AGOO_SERVICE_AGOOACK, str)) {
                    Config.m14267a(getApplicationContext(), 1);
                    C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_FAIL_ACK, String.valueOf(i), AbstractC8352oOoOOoO0.OooO0O0);
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.m7600i("AgooService", "onSendData error,dataId=" + str2 + ",serviceId=" + str, new Object[0]);
                    ALog.m7599e("AgooService", "into--[parseError]", new Object[0]);
                }
                UTMini instance = UTMini.getInstance();
                String b = C3178j.m7663b(getApplicationContext());
                instance.commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", b, Constants.KEY_ERROR_CODE, str2 + ",serviceId=" + str + ",errorCode=" + i);
            }
        } catch (Throwable th) {
            if (ALog.isPrintLog(ALog.Level.f7180E)) {
                ALog.m7599e("AgooService", "onSendData exception,e=" + th.getMessage() + ",e.getStackMsg=" + m14265a(th), new Object[0]);
            }
            UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, "accs.agooService", C3178j.m7663b(getApplicationContext()), "onSendDataException", m14265a(th));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        if (ALog.isPrintLog(ALog.Level.f7180E)) {
            ALog.m7599e("AgooService", "into--[onUnbind]:serviceId:" + str + ",errorCode=" + i, new Object[0]);
        }
        if (f13427b != null && "agooSend".equals(str)) {
            if (i == 200) {
                f13427b.onSuccess();
            } else {
                f13427b.onFailure(String.valueOf(i), "unbind Agoo service fail");
            }
        }
        f13427b = null;
    }
}
