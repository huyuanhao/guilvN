package com.umeng.message;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.taobao.agoo.TaobaoRegister;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.message.common.C3778b;
import com.umeng.message.common.C3780d;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.common.impl.json.JUtrack;
import com.umeng.message.common.inter.IUtrack;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3814c;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.proguard.C3849m;
import com.umeng.message.provider.C3857a;
import com.umeng.message.service.UMJobIntentService;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UTrack {

    /* renamed from: a */
    public static final String f9896a = "com.umeng.message.UTrack";

    /* renamed from: d */
    public static UTrack f9897d;

    /* renamed from: e */
    public static IUtrack f9898e;

    /* renamed from: i */
    public static boolean f9899i;

    /* renamed from: j */
    public static boolean f9900j;

    /* renamed from: k */
    public static boolean f9901k;

    /* renamed from: b */
    public JSONObject f9902b;

    /* renamed from: c */
    public JSONObject f9903c;

    /* renamed from: f */
    public Context f9904f;

    /* renamed from: g */
    public boolean f9905g;

    /* renamed from: h */
    public final String f9906h = "appkey";

    public interface ICallBack {
        void onMessage(boolean z, String str);
    }

    public enum SuccessState {
        SUCCESS_CACHE,
        SUCCESS,
        FAIL_REQUEST,
        FAIL_PARAM
    }

    public UTrack(Context context) {
        this.f9904f = context.getApplicationContext();
        m10256e();
    }

    /* renamed from: e */
    private void m10256e() {
        if (this.f9902b == null) {
            C3778b bVar = new C3778b();
            bVar.mo39724b(this.f9904f, new String[0]);
            Context context = this.f9904f;
            bVar.mo39721a(context, PushAgent.getInstance(context).getMessageAppkey(), PushAgent.getInstance(this.f9904f).getMessageChannel());
            JSONObject jSONObject = new JSONObject();
            this.f9902b = jSONObject;
            try {
                bVar.mo39725b(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f9903c == null) {
            C3778b bVar2 = new C3778b();
            bVar2.mo39727c(this.f9904f, new String[0]);
            Context context2 = this.f9904f;
            bVar2.mo39721a(context2, PushAgent.getInstance(context2).getMessageAppkey(), PushAgent.getInstance(this.f9904f).getMessageChannel());
            JSONObject jSONObject2 = new JSONObject();
            this.f9903c = jSONObject2;
            try {
                bVar2.mo39728c(jSONObject2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private boolean m10257f() {
        if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(this.f9904f))) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9896a, 0, "UTDID为空");
            return false;
        } else if (!TextUtils.isEmpty(MessageSharedPrefs.getInstance(this.f9904f).getDeviceToken())) {
            return true;
        } else {
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9896a, 0, "Device token为空");
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[SYNTHETIC, Splitter:B:34:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac A[SYNTHETIC, Splitter:B:41:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b5 A[SYNTHETIC, Splitter:B:46:0x00b5] */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10258g() {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UTrack.m10258g():java.lang.String");
    }

    public static synchronized UTrack getInstance(Context context) {
        UTrack uTrack;
        synchronized (UTrack.class) {
            if (f9897d == null) {
                f9897d = new UTrack(context);
                f9898e = new JUtrack(context);
            }
            uTrack = f9897d;
        }
        return uTrack;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private JSONObject m10259h() throws JSONException {
        String deviceToken = MessageSharedPrefs.getInstance(this.f9904f).getDeviceToken();
        String utdid = UmengMessageDeviceConfig.getUtdid(this.f9904f);
        JSONObject jSONObject = new JSONObject();
        this.f9902b.put("umid", UmengMessageDeviceConfig.getUmid(this.f9904f));
        jSONObject.put("header", this.f9902b);
        jSONObject.put("utdid", utdid);
        jSONObject.put(MsgConstant.KEY_DEVICE_TOKEN, deviceToken);
        return jSONObject;
    }

    /* renamed from: i */
    private JSONObject m10260i() throws JSONException {
        String deviceToken = MessageSharedPrefs.getInstance(this.f9904f).getDeviceToken();
        String utdid = UmengMessageDeviceConfig.getUtdid(this.f9904f);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.f9902b;
        jSONObject2.put("umid", UmengMessageDeviceConfig.getUmid(this.f9904f));
        jSONObject.put("header", jSONObject2);
        jSONObject.put("utdid", utdid);
        jSONObject.put(MsgConstant.KEY_DEVICE_TOKEN, deviceToken);
        return jSONObject;
    }

    /* renamed from: j */
    private JSONObject m10261j() throws JSONException {
        String deviceToken = MessageSharedPrefs.getInstance(this.f9904f).getDeviceToken();
        String utdid = UmengMessageDeviceConfig.getUtdid(this.f9904f);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appkey", PushAgent.getInstance(this.f9904f).getMessageAppkey());
        jSONObject.put("utdid", utdid);
        jSONObject.put(MsgConstant.KEY_DEVICE_TOKEN, deviceToken);
        return jSONObject;
    }

    public boolean addAlias(final String str, final String str2, final ICallBack iCallBack) {
        new Thread(new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC37612 */

            public void run() {
                SuccessState successState = null;
                try {
                    String str = MessageSharedPrefs.getInstance(UTrack.this.f9904f).get_addAliasInterval();
                    String a = UTrack.this.m10237a((UTrack) str, str2, (String) ((str == null || str.length() <= 0) ? null : new JSONObject(str)));
                    if (a != null && a.length() > 0) {
                        iCallBack.onMessage(false, a);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                StringBuilder sb = new StringBuilder();
                String str2 = "";
                sb.append(str2);
                sb.append("utdid:");
                sb.append(UmengMessageDeviceConfig.getUtdid(UTrack.this.f9904f));
                sb.append(",deviceToken:");
                sb.append(MessageSharedPrefs.getInstance(UTrack.this.f9904f).getDeviceToken());
                sb.append(C7522o0Ooo0o.OooO0O0);
                String sb2 = sb.toString();
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "addAlias: type或alias为空");
                    sb2 = sb2 + "addAlias: empty type or alias;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(UTrack.this.f9904f))) {
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "UTDID为空");
                    sb2 = sb2 + "UTDID is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(UTrack.this.f9904f).getDeviceToken())) {
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "Device token为空");
                    sb2 = sb2 + "RegistrationId is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (MessageSharedPrefs.getInstance(UTrack.this.f9904f).isAliasSet(0, str, str2)) {
                    UMLog uMLog4 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 2, String.format("addAlias: <%s, %s> 已经同步至服务器，忽略该请求", str, str2));
                    str2 = str2 + String.format("addAlias: <%s, %s> has been synced to the server before. Ingore this request;", str, str2);
                    successState = SuccessState.SUCCESS_CACHE;
                }
                try {
                    JSONObject h = UTrack.this.m10259h();
                    if (successState == null) {
                        h.put("alias", str);
                        h.put("type", str2);
                        h.put(MsgConstant.KEY_LAST_ALIAS, MessageSharedPrefs.getInstance(UTrack.this.f9904f).getLastAlias(0, str2));
                        h.put("ts", System.currentTimeMillis());
                    } else if (successState == SuccessState.FAIL_PARAM) {
                        h.put("fail", sb2);
                    } else if (successState == SuccessState.SUCCESS_CACHE) {
                        h.put("success", str2);
                    }
                    UTrack.f9898e.addAlias(str, str2, h, iCallBack);
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        ICallBack iCallBack = iCallBack;
                        if (iCallBack != null) {
                            iCallBack.onMessage(false, "alias:" + str + "添加失败:" + e2.getMessage());
                            MessageSharedPrefs.getInstance(UTrack.this.f9904f).addAlias(str, str2, 0, 1, e2.getMessage());
                            return;
                        }
                        return;
                    }
                    ICallBack iCallBack2 = iCallBack;
                    if (iCallBack2 != null) {
                        iCallBack2.onMessage(false, "alias:" + str + "添加失败");
                        MessageSharedPrefs.getInstance(UTrack.this.f9904f).addAlias(str, str2, 0, 1, "添加失败");
                    }
                }
            }
        }).start();
        return false;
    }

    public void deleteAlias(final String str, final String str2, final ICallBack iCallBack) {
        new Thread(new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC37634 */

            public void run() {
                SuccessState successState;
                String str;
                try {
                    String str2 = MessageSharedPrefs.getInstance(UTrack.this.f9904f).get_deleteALiasInterval();
                    String a = UTrack.this.m10237a((UTrack) str, str2, (String) ((str2 == null || str2.length() <= 0) ? null : new JSONObject(str2)));
                    if (a != null && a.length() > 0) {
                        iCallBack.onMessage(false, a);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TextUtils.isEmpty(str2)) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "removeAlias: type为空");
                    str = "" + "removeAlias: empty type";
                    successState = SuccessState.FAIL_PARAM;
                } else {
                    successState = null;
                    str = "";
                }
                if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(UTrack.this.f9904f))) {
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "UTDID为空");
                    str = str + "UTDID is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(UTrack.this.f9904f).getDeviceToken())) {
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "Device token为空");
                    str = str + "RegistrationId is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                try {
                    JSONObject h = UTrack.this.m10259h();
                    if (successState == null) {
                        h.put("alias", str);
                        h.put("type", str2);
                        h.put("ts", System.currentTimeMillis());
                    } else if (successState == SuccessState.FAIL_PARAM) {
                        h.put("fail", str);
                    } else if (successState == SuccessState.SUCCESS_CACHE) {
                        h.put("success", "");
                    }
                    UTrack.f9898e.deleteAlias(str, str2, h, iCallBack);
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        iCallBack.onMessage(false, "alias:" + str + "移除失败:" + e2.getMessage());
                        return;
                    }
                    iCallBack.onMessage(false, "alias:" + str + "移除失败");
                }
            }
        }).start();
    }

    public JSONObject getHeader() {
        return this.f9902b;
    }

    public void sendAliasFailLog() {
        new Thread(new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC375911 */

            public void run() {
                try {
                    UTrack.f9898e.sendAliasFailLog(UTrack.this.m10259h());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void sendCachedMsgLog(long j) {
        m10238a(j);
    }

    public synchronized void sendMsgLogForAgoo(String str, String str2, String str3) {
        UMLog uMLog = UMConfigure.umDebugLog;
        String str4 = f9896a;
        UMLog.mutlInfo(str4, 2, "sendMsgLogForAgoo-->msgId:" + str + ",taskId:" + str2);
        if (str3.equalsIgnoreCase("8")) {
            TaobaoRegister.clickMessage(this.f9904f, str, str2);
        } else {
            TaobaoRegister.dismissMessage(this.f9904f, str, str2);
        }
        C3849m.m10581a(this.f9904f).mo39931b(str, str3);
        if (!str3.equals(MsgConstant.MESSAGE_NOTIFY_ARRIVAL)) {
            C3849m.m10581a(this.f9904f).mo39937d(str);
        }
    }

    public void sendRegisterLog(final String str) {
        new Thread(new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC376012 */

            public void run() {
                if (MessageSharedPrefs.getInstance(UTrack.this.f9904f).getDaRegisterSendPolicy() == 1) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 2, "da_register_policy=1, skip sending da_register info");
                    return;
                }
                try {
                    JSONObject h = UTrack.this.m10259h();
                    h.put("registerLog", str);
                    UTrack.f9898e.sendRegisterLog(h);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void setAlias(final String str, final String str2, final ICallBack iCallBack) {
        new Thread(new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC37623 */

            public void run() {
                SuccessState successState;
                String str;
                try {
                    String str2 = MessageSharedPrefs.getInstance(UTrack.this.f9904f).get_setAliasInterval();
                    String a = UTrack.this.m10237a((UTrack) str, str2, (String) ((str2 == null || str2.length() <= 0) ? null : new JSONObject(str2)));
                    if (a != null && a.length() > 0) {
                        iCallBack.onMessage(false, a);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String str3 = "";
                if (TextUtils.isEmpty(str2)) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "addExclusiveAlias: type为空");
                    str = str3 + "addExclusiveAlias: empty type";
                    successState = SuccessState.FAIL_PARAM;
                } else {
                    successState = null;
                    str = str3;
                }
                if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(UTrack.this.f9904f))) {
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "UTDID为空");
                    str = str + "UTDID is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(UTrack.this.f9904f).getDeviceToken())) {
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 0, "Device token为空");
                    str = str + "RegistrationId is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (MessageSharedPrefs.getInstance(UTrack.this.f9904f).isAliasSet(1, str, str2)) {
                    UMLog uMLog4 = UMConfigure.umDebugLog;
                    UMLog.mutlInfo(UTrack.f9896a, 2, String.format("addExclusiveAlias: <%s, %s> 已经同步至服务器，忽略该请求", str, str2));
                    str3 = str3 + String.format("addExclusiveAlias: <%s, %s> has been synced to the server before. Ingore this request.", str, str2);
                    successState = SuccessState.SUCCESS_CACHE;
                }
                try {
                    JSONObject h = UTrack.this.m10259h();
                    if (successState == null) {
                        h.put("alias", str);
                        h.put("type", str2);
                        h.put(MsgConstant.KEY_LAST_ALIAS, MessageSharedPrefs.getInstance(UTrack.this.f9904f).getLastAlias(1, str2));
                        h.put("ts", System.currentTimeMillis());
                    } else if (successState == SuccessState.FAIL_PARAM) {
                        h.put("fail", str);
                    } else if (successState == SuccessState.SUCCESS_CACHE) {
                        h.put("success", str3);
                    }
                    UTrack.f9898e.setAlias(str, str2, h, iCallBack);
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        iCallBack.onMessage(false, "alias:" + str + "添加失败:" + e2.getMessage());
                        MessageSharedPrefs.getInstance(UTrack.this.f9904f).addAlias(str, str2, 1, 1, e2.getMessage());
                        return;
                    }
                    iCallBack.onMessage(false, "alias:" + str + "添加失败");
                    MessageSharedPrefs.getInstance(UTrack.this.f9904f).addAlias(str, str2, 1, 1, "添加失败");
                }
            }
        }).start();
    }

    public void setClearPrevMessage(boolean z) {
        this.f9905g = z;
    }

    public void trackAppLaunch(long j) {
        if (m10257f()) {
            if (MessageSharedPrefs.getInstance(this.f9904f).getAppLaunchLogSendPolicy() == 1) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9896a, 2, "launch_policy=1, 跳过发送应用程序启动信息");
            } else if (!MessageSharedPrefs.getInstance(this.f9904f).hasAppLaunchLogSentToday()) {
                m10247b(j);
            }
        }
    }

    public void trackMiPushMsgClick(UMessage uMessage) {
        String str;
        if (!(uMessage == null || (str = uMessage.msg_id) == null)) {
            m10248b(str, 21, uMessage.random_min * 60000, uMessage.pulledWho);
        }
        if (!this.f9905g) {
            return;
        }
        if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
            ((UmengAdHandler) PushAgent.getInstance(this.f9904f).getAdHandler()).setPrevMessage(null);
        } else {
            ((UmengMessageHandler) PushAgent.getInstance(this.f9904f).getMessageHandler()).setPrevMessage(null);
        }
    }

    public void trackMsgArrival(UMessage uMessage) {
        String str;
        if (uMessage != null && (str = uMessage.msg_id) != null) {
            m10248b(str, 0, uMessage.random_min * 60000, uMessage.pulledWho);
        }
    }

    public void trackMsgClick(UMessage uMessage) {
        String str;
        String str2;
        if (!(uMessage == null || (str2 = uMessage.msg_id) == null)) {
            m10248b(str2, 1, uMessage.random_min * 60000, uMessage.pulledWho);
        }
        if (!(uMessage == null || (str = uMessage.message_id) == null)) {
            m10242a(str, uMessage.task_id, "8");
        }
        if (!this.f9905g) {
            return;
        }
        if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
            ((UmengAdHandler) PushAgent.getInstance(this.f9904f).getAdHandler()).setPrevMessage(null);
        } else {
            ((UmengMessageHandler) PushAgent.getInstance(this.f9904f).getMessageHandler()).setPrevMessage(null);
        }
    }

    public void trackMsgDismissed(UMessage uMessage) {
        String str;
        String str2;
        if (!(uMessage == null || (str2 = uMessage.msg_id) == null)) {
            m10248b(str2, 2, uMessage.random_min * 60000, uMessage.pulledWho);
        }
        if (!(uMessage == null || (str = uMessage.message_id) == null)) {
            m10242a(str, uMessage.task_id, "9");
        }
        if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
            ((UmengAdHandler) PushAgent.getInstance(this.f9904f).getAdHandler()).setPrevMessage(null);
        } else {
            ((UmengMessageHandler) PushAgent.getInstance(this.f9904f).getMessageHandler()).setPrevMessage(null);
        }
    }

    public void trackMsgPulled(UMessage uMessage, int i) {
        String str;
        if (uMessage != null && (str = uMessage.msg_id) != null) {
            m10248b(str, i, uMessage.random_min * 60000, uMessage.pulledWho);
        }
    }

    public void updateHeader() {
        C3778b bVar = new C3778b();
        bVar.mo39724b(this.f9904f, new String[0]);
        Context context = this.f9904f;
        bVar.mo39721a(context, PushAgent.getInstance(context).getMessageAppkey(), PushAgent.getInstance(this.f9904f).getMessageChannel());
        JSONObject jSONObject = new JSONObject();
        this.f9902b = jSONObject;
        try {
            bVar.mo39725b(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C3778b bVar2 = new C3778b();
        bVar2.mo39727c(this.f9904f, new String[0]);
        Context context2 = this.f9904f;
        bVar2.mo39721a(context2, PushAgent.getInstance(context2).getMessageAppkey(), PushAgent.getInstance(this.f9904f).getMessageChannel());
        JSONObject jSONObject2 = new JSONObject();
        this.f9903c = jSONObject2;
        try {
            bVar2.mo39728c(jSONObject2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONArray m10255d() {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UTrack.m10255d():org.json.JSONArray");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private synchronized void m10252c(String str, int i, long j, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            JSONObject i2 = m10260i();
            i2.put("msg_id", str);
            i2.put(MsgConstant.KEY_ACTION_TYPE, i);
            i2.put("ts", j);
            i2.put("pa", str2);
            f9898e.sendMsgLog(i2, str, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo39639b(UMessage uMessage) {
        m10248b(uMessage.recall, 5, uMessage.random_min * 60000, uMessage.pulledWho);
    }

    /* renamed from: b */
    private void m10248b(String str, int i, long j, String str2) {
        m10241a(str, i, j, str2);
    }

    /* renamed from: b */
    private void m10247b(long j) {
        if (f9900j) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9896a, 2, "trackAppLaunch已经在队列里, 忽略这次请求");
            return;
        }
        UMLog uMLog2 = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f9896a, 2, "trackAppLaunch开始, 设置appLaunchSending标志位");
        f9900j = true;
        RunnableC37699 r0 = new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC37699 */

            public void run() {
                try {
                    JSONObject h = UTrack.this.m10259h();
                    JSONArray d = UTrack.this.m10255d();
                    if (d != null) {
                        h.put(MsgConstant.KEY_UCODE, C3814c.m10489a(d.toString()));
                    }
                    UTrack.f9898e.trackAppLaunch(h);
                } catch (Exception unused) {
                } finally {
                    boolean unused2 = UTrack.f9900j = false;
                }
            }
        };
        UMLog uMLog3 = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f9896a, 2, String.format("trackAppLaunch(delay=%d)", Long.valueOf(j)));
        C3780d.m10348a(r0, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void mo39637a(UMessage uMessage) {
        m10248b(uMessage.recall, 4, uMessage.random_min * 60000, uMessage.pulledWho);
    }

    /* renamed from: a */
    private void m10241a(final String str, final int i, long j, final String str2) {
        if (m10257f()) {
            if (TextUtils.isEmpty(str)) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9896a, 0, "trackMsgLog: msgId为空");
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            try {
                C3849m.m10581a(this.f9904f).mo39924a(str, i, currentTimeMillis, str2);
            } catch (Exception e) {
                e.printStackTrace();
                UMLog uMLog2 = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9896a, 2, "trackMsgLog: ", e.toString());
            }
            RunnableC37571 r0 = new Runnable() {
                /* class com.umeng.message.UTrack.RunnableC37571 */

                public void run() {
                    UTrack.this.m10252c(str, i, currentTimeMillis, str2);
                }
            };
            long j2 = 0;
            if (!(j <= 0 || i == 1 || i == 21)) {
                j2 = Math.abs(new Random().nextLong() % j);
            }
            UMLog uMLog3 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9896a, 2, String.format("trackMsgLog(msgId=%s, actionType=%d, random=%d, delay=%d)", str, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)));
            C3780d.m10348a(r0, j2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private void m10242a(final String str, final String str2, final String str3) {
        C3780d.m10347a(new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC37645 */

            public void run() {
                UTrack.this.sendMsgLogForAgoo(str, str2, str3);
            }
        });
    }

    /* renamed from: a */
    private void m10238a(long j) {
        if (m10257f()) {
            if (f9899i) {
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(f9896a, 2, "appCachedPushlog已经在队列里, 忽略这次请求");
                return;
            }
            UMLog uMLog2 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9896a, 2, "appCachedPushlog开始, 设置appLaunchSending标志位");
            f9899i = true;
            if (C3819h.m10565d(this.f9904f)) {
                new Thread(new Runnable() {
                    /* class com.umeng.message.UTrack.RunnableC37656 */

                    public void run() {
                        try {
                            Thread.sleep(30000);
                            boolean unused = UTrack.f9899i = false;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
            C3780d.m10347a(new Runnable() {
                /* class com.umeng.message.UTrack.RunnableC37667 */

                public void run() {
                    try {
                        final JSONArray jSONArray = new JSONArray();
                        ArrayList<C3849m.C3851a> a = C3849m.m10581a(UTrack.this.f9904f).mo39919a();
                        if (a != null && a.size() > 0) {
                            for (int i = 0; i < a.size(); i++) {
                                C3849m.C3851a aVar = a.get(i);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("ts", aVar.f10443b);
                                jSONObject.put("pa", aVar.f10445d);
                                jSONObject.put(MsgConstant.KEY_DEVICE_TOKEN, MessageSharedPrefs.getInstance(UTrack.this.f9904f).getDeviceToken());
                                jSONObject.put("msg_id", aVar.f10442a);
                                jSONObject.put(MsgConstant.KEY_ACTION_TYPE, aVar.f10444c);
                                jSONArray.put(jSONObject);
                            }
                            UMSLEnvelopeBuild.mContext = UTrack.this.f9904f;
                            final UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                            final JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(UTrack.this.f9904f);
                            JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
                            jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(UTrack.this.f9904f));
                            jSONObject2.put(C3617o.f9371ay, MsgConstant.SDK_VERSION);
                            jSONObject2.put("umid", UmengMessageDeviceConfig.getUmid(UTrack.this.f9904f));
                            buildSLBaseHeader.put("header", jSONObject2);
                            final JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("push", jSONArray);
                            if (C3819h.m10565d(UTrack.this.f9904f)) {
                                try {
                                    UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() {
                                        /* class com.umeng.message.UTrack.RunnableC37667.C37671 */

                                        @Override // com.umeng.commonsdk.utils.onMessageSendListener
                                        public void onMessageSend() {
                                            try {
                                                JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(UTrack.this.f9904f, buildSLBaseHeader, jSONObject3, MsgConstant.UNPX_PUSH_LOGS);
                                                if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                                                    UTrack.this.m10243a((UTrack) jSONArray);
                                                }
                                                UMConfigureImpl.removeMessageSendListener(this);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    });
                                } catch (Throwable unused) {
                                }
                            } else {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("jsonHeader", buildSLBaseHeader);
                                jSONObject4.put("jsonBody", jSONObject3);
                                Intent intent = new Intent();
                                intent.setPackage(UTrack.this.f9904f.getPackageName());
                                intent.setAction(MsgConstant.MESSAGE_MESSAGE_SEND_ACTION);
                                intent.putExtra(MsgConstant.KEY_UMPX_PATH, MsgConstant.UNPX_PUSH_LOGS);
                                intent.putExtra(MsgConstant.KEY_SENDMESSAGE, jSONObject4.toString());
                                UMJobIntentService.enqueueWork(UTrack.this.f9904f, UmengMessageCallbackHandlerService.class, intent);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
            C3780d.m10347a(new Runnable() {
                /* class com.umeng.message.UTrack.RunnableC37688 */

                public void run() {
                    try {
                        ArrayList<C3849m.C3852b> c = C3849m.m10581a(UTrack.this.f9904f).mo39933c();
                        for (int i = 0; i < c.size(); i++) {
                            C3849m.C3852b bVar = c.get(i);
                            UTrack.this.sendMsgLogForAgoo(bVar.f10447a, bVar.f10448b, bVar.f10449c);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(UTrack.f9896a, 2, th.toString());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m10243a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                        String optString = jSONObject.optString("msg_id");
                        int optInt = jSONObject.optInt(MsgConstant.KEY_ACTION_TYPE);
                        String[] strArr = {optString, optInt + ""};
                        C3857a.m10616a(this.f9904f);
                        arrayList.add(ContentProviderOperation.newDelete(C3857a.f10481f).withSelection("MsgId=? And ActionType=?", strArr).build());
                        if (optInt != 0) {
                            C3857a.m10616a(this.f9904f);
                            arrayList.add(ContentProviderOperation.newDelete(C3857a.f10482g).withSelection("MsgId=?", new String[]{optString}).build());
                        }
                    }
                }
                ContentResolver contentResolver = this.f9904f.getContentResolver();
                C3857a.m10616a(this.f9904f);
                contentResolver.applyBatch(C3857a.f10476a, arrayList);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo39636a() {
        if (!m10257f() || MessageSharedPrefs.getInstance(this.f9904f).getHasRegister()) {
            return;
        }
        if (f9901k) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9896a, 2, "sendRegisterLog已经在队列里，忽略这次请求");
            return;
        }
        UMLog uMLog2 = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f9896a, 2, "trackRegisterLog开始, 设置registerSending标志位");
        f9901k = true;
        RunnableC375810 r0 = new Runnable() {
            /* class com.umeng.message.UTrack.RunnableC375810 */

            public void run() {
                try {
                    JSONObject h = UTrack.this.m10259h();
                    UMLog uMLog = UMConfigure.umDebugLog;
                    String str = UTrack.f9896a;
                    UMLog.mutlInfo(str, 2, "trackRegister-->request:" + h.toString());
                    String g = UTrack.this.m10258g();
                    if (!C3819h.m10566d(g)) {
                        UMLog uMLog2 = UMConfigure.umDebugLog;
                        String str2 = UTrack.f9896a;
                        UMLog.mutlInfo(str2, 2, "TestDevice sign =" + g);
                        h.put(MsgConstant.f9888d, g);
                    }
                    UTrack.f9898e.trackRegister(h);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    boolean unused = UTrack.f9901k = false;
                    throw th;
                }
                boolean unused2 = UTrack.f9901k = false;
            }
        };
        UMLog uMLog3 = UMConfigure.umDebugLog;
        UMLog.mutlInfo(f9896a, 2, String.format("trackRegister(delay=%d)", 0));
        C3780d.m10348a(r0, 0, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private String m10237a(String str, String str2, JSONObject jSONObject) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bytes2 = str2.getBytes("UTF-8");
            boolean z = true;
            boolean z2 = bytes.length <= 128 && bytes.length >= 0;
            if (bytes2.length > 64 || bytes2.length < 0) {
                z = false;
            }
            if (!z2 || !z) {
                return "alias长度不在0~128之间或aliasType长度不在0~64之间";
            }
            if (jSONObject == null) {
                return null;
            }
            long optLong = jSONObject.optLong("interval", 0);
            long optLong2 = jSONObject.optLong("last_requestTime", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (optLong == 0 || (currentTimeMillis - optLong2) / 1000 >= optLong) {
                return null;
            }
            return "interval限制";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
