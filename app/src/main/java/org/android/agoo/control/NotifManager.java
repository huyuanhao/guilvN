package org.android.agoo.control;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.UTMini;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.json.JSONObject;

public class NotifManager {
    public static final String ACK_MESSAGE = "accs.ackMessage";
    public static final int EVENT_ID = 66001;
    public static final String TAG = "NotifManager";
    public static Context mContext;

    private byte[] convertMsgToBytes(MsgDO msgDO) throws UnsupportedEncodingException {
        HashMap hashMap = new HashMap();
        hashMap.put("api", "agooReport");
        hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
        hashMap.put("ext", msgDO.extData);
        hashMap.put("status", msgDO.msgStatus);
        if (!TextUtils.isEmpty(msgDO.errorCode)) {
            hashMap.put("ec", msgDO.errorCode);
        }
        if (!TextUtils.isEmpty(msgDO.type)) {
            hashMap.put("type", msgDO.type);
        }
        if (!TextUtils.isEmpty(msgDO.fromPkg)) {
            hashMap.put("fromPkg", msgDO.fromPkg);
        }
        if (!TextUtils.isEmpty(msgDO.fromAppkey)) {
            hashMap.put(AgooConstants.MESSAGE_FROM_APPKEY, msgDO.fromAppkey);
        }
        if (!TextUtils.isEmpty(msgDO.notifyEnable)) {
            hashMap.put("notifyEnable", msgDO.notifyEnable);
        }
        if (!TextUtils.isEmpty(msgDO.extData)) {
            hashMap.put("ext", msgDO.extData);
        }
        hashMap.put("isStartProc", Boolean.toString(msgDO.isStartProc));
        hashMap.put("appkey", Config.m14266a(mContext));
        hashMap.put("utdid", C3178j.m7663b(mContext));
        hashMap.put("evokeAppStatus", String.valueOf(msgDO.evokeAppStatus));
        hashMap.put("lastActiveTime", String.valueOf(msgDO.lastActiveTime));
        hashMap.put("isGlobalClick", String.valueOf(msgDO.isGlobalClick));
        return new JSONObject(hashMap).toString().getBytes("UTF-8");
    }

    private String getVersion(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "null";
            }
            String str2 = mContext.getPackageManager().getPackageInfo(str, 0).versionName;
            ALog.m7597d(TAG, "getVersion###版本号为 : " + str2, new Object[0]);
            return str2;
        } catch (Throwable unused) {
            return "null";
        }
    }

    private boolean isAppInstalled(String str) {
        PackageInfo packageInfo;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            packageInfo = mContext.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return false;
            }
            ALog.m7600i(TAG, "isAppInstalled true..", new Object[0]);
            return true;
        } catch (Throwable unused) {
            packageInfo = null;
        }
    }

    private void reportMethod(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (msgDO == null) {
            try {
                ALog.m7599e(TAG, "reportMethod msg null", new Object[0]);
            } catch (Throwable th) {
                C3179k.m7667a("accs", "error", th.toString(), AbstractC8352oOoOOoO0.OooO0O0);
            }
        } else {
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            String a = ACCSManager.getAccsInstance(mContext, Config.m14266a(mContext), Config.m14271b(mContext)).mo37460a(mContext, accsRequest, extraInfo);
            if (ALog.isPrintLog(ALog.Level.f7180E)) {
                ALog.m7599e(TAG, "report", Constants.KEY_DATA_ID, a, "status", msgDO.msgStatus, "errorcode", msgDO.errorCode);
            }
        }
    }

    public void doUninstall(String str, boolean z) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pack", str);
            hashMap.put("appkey", Config.m14266a(mContext));
            hashMap.put("utdid", C3178j.m7663b(mContext));
            ACCSManager.getAccsInstance(mContext, Config.m14266a(mContext), Config.m14271b(mContext)).mo37460a(mContext, new ACCSManager.AccsRequest(null, "agooKick", new JSONObject(hashMap).toString().getBytes("UTF-8"), null, null, null, null), new TaoBaseService.ExtraInfo());
        } catch (Throwable th) {
            ALog.m7598e(TAG, "[doUninstall] is error", th, new Object[0]);
        }
    }

    public void handlerACKMessage(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (msgDO != null) {
            if (!TextUtils.isEmpty(msgDO.msgIds) || !TextUtils.isEmpty(msgDO.removePacks) || !TextUtils.isEmpty(msgDO.errorCode)) {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("api", AgooConstants.AGOO_SERVICE_AGOOACK);
                    hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
                    if (!TextUtils.isEmpty(msgDO.removePacks)) {
                        hashMap.put("del_pack", msgDO.removePacks);
                    }
                    if (!TextUtils.isEmpty(msgDO.errorCode)) {
                        hashMap.put("ec", msgDO.errorCode);
                    }
                    if (!TextUtils.isEmpty(msgDO.type)) {
                        hashMap.put("type", msgDO.type);
                    }
                    if (!TextUtils.isEmpty(msgDO.extData)) {
                        hashMap.put("ext", msgDO.extData);
                    }
                    hashMap.put("appkey", Config.m14266a(mContext));
                    hashMap.put("utdid", C3178j.m7663b(mContext));
                    byte[] bytes = new JSONObject(hashMap).toString().getBytes("UTF-8");
                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, C3178j.m7663b(mContext), "handlerACKMessageSendData", msgDO.msgIds);
                    C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_ACK, "handlerACKMessage", AbstractC8352oOoOOoO0.OooO0O0);
                    ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, bytes, null, null, null, null);
                    if (msgDO != null) {
                        accsRequest.setTag(msgDO.msgIds);
                    }
                    String a = ACCSManager.getAccsInstance(mContext, Config.m14266a(mContext), Config.m14271b(mContext)).mo37460a(mContext, accsRequest, extraInfo);
                    ALog.m7600i(TAG, "handlerACKMessage,endRequest,dataId=" + a, new Object[0]);
                } catch (Throwable th) {
                    if (ALog.isPrintLog(ALog.Level.f7180E)) {
                        ALog.m7599e(TAG, "handlerACKMessage Throwable,msgIds=" + msgDO.msgIds + ",type=" + msgDO.type + ",e=" + th.toString(), new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, C3178j.m7663b(mContext), "handlerACKMessageExceptionFailed", th.toString());
                }
            } else {
                UTMini instance = UTMini.getInstance();
                String b = C3178j.m7663b(mContext);
                instance.commitEvent(AgooConstants.AGOO_EVENT_ID, ACK_MESSAGE, b, "handlerACKMessageRetuen", "msgids=" + msgDO.msgIds + ",removePacks=" + msgDO.removePacks + ",errorCode=" + msgDO.errorCode);
            }
        }
    }

    public void init(Context context) {
        mContext = context;
    }

    public void pingApp(String str, String str2, String str3, int i) {
    }

    public void report(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (!TextUtils.isEmpty(msgDO.reportStr)) {
            try {
                if (Integer.parseInt(msgDO.reportStr) >= -1) {
                    reportMethod(msgDO, extraInfo);
                    if (!msgDO.isFromCache) {
                        C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, AbstractC8352oOoOOoO0.OooO0O0);
                    }
                }
            } catch (Throwable th) {
                ALog.m7598e(TAG, "[report] is error", th, new Object[0]);
            }
        }
    }

    public void reportNotifyMessage(MsgDO msgDO) {
        if (msgDO != null) {
            try {
                C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_REPORT_ID, msgDO.msgIds, AbstractC8352oOoOOoO0.OooO0O0);
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, AgooConstants.AGOO_SERVICE_AGOOACK, convertMsgToBytes(msgDO), null, null, null, null);
                ACCSManager.getAccsInstance(mContext, Config.m14266a(mContext), Config.m14271b(mContext)).mo37460a(mContext, accsRequest, (TaoBaseService.ExtraInfo) null);
                if (ALog.isPrintLog(ALog.Level.f7180E)) {
                    ALog.m7599e(TAG, "reportNotifyMessage", Constants.KEY_DATA_ID, accsRequest.dataId, "status", msgDO.msgStatus);
                }
                C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_CLICK, msgDO.msgStatus, AbstractC8352oOoOOoO0.OooO0O0);
                C3179k.m7667a("accs", BaseMonitor.COUNT_AGOO_ACK, msgDO.msgStatus, AbstractC8352oOoOOoO0.OooO0O0);
            } catch (Throwable th) {
                ALog.m7598e(TAG, "[reportNotifyMessage] is error", th, new Object[0]);
                C3179k.m7667a("accs", "error", th.toString(), AbstractC8352oOoOOoO0.OooO0O0);
            }
        }
    }

    public void reportThirdPushToken(String str, String str2, boolean z) {
        ThreadPoolExecutorFactory.schedule(new RunnableC4805l(this, str2, str, z), 10, TimeUnit.SECONDS);
    }

    public void reportThirdPushToken(String str, String str2, String str3, boolean z) {
        ThreadPoolExecutorFactory.schedule(new RunnableC4806m(this, str2, str, str3, z), 10, TimeUnit.SECONDS);
    }

    public void reportThirdPushToken(String str, String str2) {
        reportThirdPushToken(str, str2, true);
    }
}
