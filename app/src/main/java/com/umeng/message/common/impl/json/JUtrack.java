package com.umeng.message.common.impl.json;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.UTrack;
import com.umeng.message.UmengMessageCallbackHandlerService;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.common.inter.IUtrack;
import com.umeng.message.entity.Alias;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.proguard.C3849m;
import com.umeng.message.provider.C3857a;
import com.umeng.message.service.UMJobIntentService;
import com.umeng.message.util.C3892b;
import com.umeng.message.util.HttpRequest;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class JUtrack implements IUtrack {

    /* renamed from: a */
    public static final String f10134a = "JUtrack";

    /* renamed from: b */
    public Context f10135b;

    public JUtrack(Context context) {
        this.f10135b = context.getApplicationContext();
    }

    public static JSONObject sendRequest(JSONObject jSONObject, String str) throws Exception {
        String body = HttpRequest.post(str).acceptJson().contentType(HttpRequest.CONTENT_TYPE_JSON).send(jSONObject.toString()).body("UTF-8");
        UMLog uMLog = UMConfigure.umDebugLog;
        String str2 = f10134a;
        UMLog.mutlInfo(str2, 2, "sendRequest() url=" + str + "\n request = " + jSONObject + "\n response = " + body);
        return new JSONObject(body);
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void addAlias(String str, String str2, JSONObject jSONObject, UTrack.ICallBack iCallBack) throws Exception {
        JSONObject jSONObject2;
        String optString = jSONObject.optString("fail", "");
        String optString2 = jSONObject.optString("success", "");
        UMLog uMLog = UMConfigure.umDebugLog;
        String str3 = f10134a;
        UMLog.mutlInfo(str3, 2, "keyfail:" + optString + ",keysuccess:" + optString2);
        if (!optString.equals("") || !optString2.equals("")) {
            if (!optString.equals("")) {
                iCallBack.onMessage(false, "alias:" + str + "添加失败");
                MessageSharedPrefs.getInstance(this.f10135b).addAlias(str, str2, 0, 1, optString);
            }
            if (!optString2.equals("")) {
                iCallBack.onMessage(true, "alias:" + str + "已经添加");
                MessageSharedPrefs.getInstance(this.f10135b).addAlias(str, str2, 0, 2, optString2);
                return;
            }
            return;
        }
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.ALIAS_ENDPOINT);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().contains(MsgConstant.HTTPSDNS_ERROR) || !UmengMessageDeviceConfig.isOnline(this.f10135b)) {
                throw new Exception(e);
            }
            jSONObject2 = sendRequest(this.f10135b, jSONObject, MsgConstant.ALIAS_ENDPOINT);
        }
        if (jSONObject2 == null || !TextUtils.equals(jSONObject2.optString("success", ""), "ok")) {
            MessageSharedPrefs instance = MessageSharedPrefs.getInstance(this.f10135b);
            instance.addAlias(str, str2, 0, 1, "网络请求失败alias:" + str + ",type:" + str2 + ",devicetoken:" + MessageSharedPrefs.getInstance(this.f10135b).getDeviceToken());
            StringBuilder sb = new StringBuilder();
            sb.append("alias:");
            sb.append(str);
            sb.append("添加失败");
            iCallBack.onMessage(false, sb.toString());
            return;
        }
        MessageSharedPrefs.getInstance(this.f10135b).addAlias(str, str2, 0, 0, "");
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("interval", jSONObject2.optLong("interval", 0));
            jSONObject3.put("last_requestTime", System.currentTimeMillis());
            MessageSharedPrefs.getInstance(this.f10135b).add_addAliasInterval(jSONObject3.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        iCallBack.onMessage(true, "alias:" + str + "添加成功");
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void deleteAlias(String str, String str2, JSONObject jSONObject, UTrack.ICallBack iCallBack) throws Exception {
        JSONObject jSONObject2;
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.DELETE_ALIAS_ENDPOINT);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().contains(MsgConstant.HTTPSDNS_ERROR) || !UmengMessageDeviceConfig.isOnline(this.f10135b)) {
                throw new Exception(e);
            }
            jSONObject2 = sendRequest(this.f10135b, jSONObject, MsgConstant.DELETE_ALIAS_ENDPOINT);
        }
        if (jSONObject2 != null && TextUtils.equals(jSONObject2.getString("success"), "ok")) {
            MessageSharedPrefs.getInstance(this.f10135b).removeAlias(0, str, str2);
            MessageSharedPrefs.getInstance(this.f10135b).removeAlias(1, str, str2);
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("interval", jSONObject2.optLong("interval", 0));
                jSONObject3.put("last_requestTime", System.currentTimeMillis());
                MessageSharedPrefs.getInstance(this.f10135b).add_deleteAliasInterval(jSONObject3.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            iCallBack.onMessage(true, "alias:" + str + ",type:" + str2 + "删除成功");
        }
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void sendAliasFailLog(JSONObject jSONObject) {
        if (MessageSharedPrefs.getInstance(this.f10135b).getDaRegisterSendPolicy() == 1) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10134a, 2, "da_register_policy=1, skip sending da_register info.");
            return;
        }
        try {
            ContentResolver contentResolver = this.f10135b.getContentResolver();
            C3857a.m10616a(this.f10135b);
            Uri uri = C3857a.f10479d;
            String[] strArr = {"message", "time"};
            Cursor query = contentResolver.query(uri, strArr, "error=?", new String[]{"1"}, null);
            if (query != null) {
                ArrayList<Alias> arrayList = new ArrayList();
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(query.getColumnIndex("message"));
                    long j = query.getLong(query.getColumnIndex("time"));
                    Alias alias = new Alias();
                    alias.aliasMessage = string;
                    alias.aliasTime = j;
                    arrayList.add(alias);
                    query.moveToNext();
                }
                if (query != null) {
                    query.close();
                }
                for (Alias alias2 : arrayList) {
                    m10351a(jSONObject, alias2.aliasMessage, alias2.aliasTime);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void sendMsgLog(JSONObject jSONObject, final String str, final int i) throws Exception {
        UMSLEnvelopeBuild.mContext = this.f10135b;
        final UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
        final JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(this.f10135b);
        JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
        jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(this.f10135b));
        jSONObject2.put(C3617o.f9371ay, MsgConstant.SDK_VERSION);
        jSONObject2.put("push_switch", UmengMessageDeviceConfig.isNotificationEnabled(this.f10135b));
        buildSLBaseHeader.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("ts", jSONObject.getLong("ts"));
        jSONObject3.put("pa", jSONObject.getString("pa"));
        jSONObject3.put(MsgConstant.KEY_DEVICE_TOKEN, MessageSharedPrefs.getInstance(this.f10135b).getDeviceToken());
        jSONObject3.put("msg_id", jSONObject.getString("msg_id"));
        jSONObject3.put(MsgConstant.KEY_ACTION_TYPE, jSONObject.getInt(MsgConstant.KEY_ACTION_TYPE));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        final JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONArray);
        if (C3819h.m10565d(this.f10135b)) {
            try {
                UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() {
                    /* class com.umeng.message.common.impl.json.JUtrack.C37821 */

                    @Override // com.umeng.commonsdk.utils.onMessageSendListener
                    public void onMessageSend() {
                        try {
                            JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(JUtrack.this.f10135b, buildSLBaseHeader, jSONObject4, MsgConstant.UNPX_PUSH_LOGS);
                            if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                                C3849m.m10581a(JUtrack.this.f10135b).mo39923a(str, i);
                                if (i != 0) {
                                    C3849m.m10581a(JUtrack.this.f10135b).mo39930b(str);
                                }
                            }
                            UMConfigureImpl.removeMessageSendListener(this);
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("jsonHeader", buildSLBaseHeader);
            jSONObject5.put("jsonBody", jSONObject4);
            jSONObject5.put("msgId", str);
            jSONObject5.put("actionType", i);
            Intent intent = new Intent();
            intent.setPackage(this.f10135b.getPackageName());
            intent.setAction(MsgConstant.MESSAGE_MESSAGE_SEND_ACTION);
            intent.putExtra(MsgConstant.KEY_UMPX_PATH, MsgConstant.UNPX_PUSH_LOGS);
            intent.putExtra(MsgConstant.KEY_SENDMESSAGE, jSONObject5.toString());
            UMJobIntentService.enqueueWork(this.f10135b, UmengMessageCallbackHandlerService.class, intent);
        }
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void sendRegisterLog(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        int parseInt;
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.ALIAS_LOG);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().contains(MsgConstant.HTTPSDNS_ERROR) || !UmengMessageDeviceConfig.isOnline(this.f10135b)) {
                throw new Exception(e);
            }
            jSONObject2 = sendRequest(this.f10135b, jSONObject, MsgConstant.ALIAS_LOG);
        }
        if (jSONObject2 != null && TextUtils.equals(jSONObject2.optString("success", ""), "ok") && (parseInt = Integer.parseInt(jSONObject2.getString("da_register_policy"))) > 0) {
            MessageSharedPrefs.getInstance(this.f10135b).setDaRegisterSendPolicy(parseInt);
        }
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void setAlias(String str, String str2, JSONObject jSONObject, UTrack.ICallBack iCallBack) throws Exception {
        JSONObject jSONObject2;
        String optString = jSONObject.optString("fail", "");
        String optString2 = jSONObject.optString("success", "");
        UMLog uMLog = UMConfigure.umDebugLog;
        String str3 = f10134a;
        UMLog.mutlInfo(str3, 2, "keyfail:" + optString + ",keysuccess:" + optString2);
        if (!optString.equals("") || !optString2.equals("")) {
            if (!optString.equals("")) {
                iCallBack.onMessage(false, "alias:" + str + "添加失败");
                MessageSharedPrefs.getInstance(this.f10135b).addAlias(str, str2, 1, 1, optString);
            }
            if (!optString2.equals("")) {
                iCallBack.onMessage(true, "alias:" + str + "已经添加");
                MessageSharedPrefs.getInstance(this.f10135b).addAlias(str, str2, 1, 2, optString2);
                return;
            }
            return;
        }
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.ALIAS_EXCLUSIVE_ENDPOINT);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().contains(MsgConstant.HTTPSDNS_ERROR) || !UmengMessageDeviceConfig.isOnline(this.f10135b)) {
                throw new Exception(e);
            }
            jSONObject2 = sendRequest(this.f10135b, jSONObject, MsgConstant.ALIAS_EXCLUSIVE_ENDPOINT);
        }
        if (jSONObject2 == null || !TextUtils.equals(jSONObject2.optString("success", ""), "ok")) {
            MessageSharedPrefs instance = MessageSharedPrefs.getInstance(this.f10135b);
            instance.addAlias(str, str2, 1, 1, "网络请求失败alias:" + str + ",type:" + str2 + ",devicetoken:" + MessageSharedPrefs.getInstance(this.f10135b).getDeviceToken());
            StringBuilder sb = new StringBuilder();
            sb.append("alias:");
            sb.append(str);
            sb.append("添加失败");
            iCallBack.onMessage(false, sb.toString());
            return;
        }
        MessageSharedPrefs.getInstance(this.f10135b).addAlias(str, str2, 1, 0, "");
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("interval", jSONObject2.optLong("interval", 0));
            jSONObject3.put("last_requestTime", System.currentTimeMillis());
            MessageSharedPrefs.getInstance(this.f10135b).add_setAliasInterval(jSONObject3.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        iCallBack.onMessage(true, "alias:" + str + "添加成功");
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void trackAppLaunch(JSONObject jSONObject) throws Exception {
        UMSLEnvelopeBuild.mContext = this.f10135b;
        final UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
        final JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(this.f10135b);
        JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
        jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(this.f10135b));
        jSONObject2.put(C3617o.f9371ay, MsgConstant.SDK_VERSION);
        jSONObject2.put("push_switch", UmengMessageDeviceConfig.isNotificationEnabled(this.f10135b));
        buildSLBaseHeader.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(MsgConstant.KEY_DEVICE_TOKEN, MessageSharedPrefs.getInstance(this.f10135b).getDeviceToken());
        final JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONObject3);
        if (C3819h.m10565d(this.f10135b)) {
            try {
                UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() {
                    /* class com.umeng.message.common.impl.json.JUtrack.C37832 */

                    @Override // com.umeng.commonsdk.utils.onMessageSendListener
                    public void onMessageSend() {
                        try {
                            JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(JUtrack.this.f10135b, buildSLBaseHeader, jSONObject4, MsgConstant.UMPX_PUSH_LAUNCH);
                            if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                                C3849m.m10581a(JUtrack.this.f10135b).mo39921a(System.currentTimeMillis());
                                int parseInt = Integer.parseInt(UMEnvelopeBuild.imprintProperty(JUtrack.this.f10135b, "launch_policy", "-1"));
                                UMLog uMLog = UMConfigure.umDebugLog;
                                String str = JUtrack.f10134a;
                                UMLog.mutlInfo(str, 2, "launch_policy:" + parseInt);
                                int parseInt2 = Integer.parseInt(UMEnvelopeBuild.imprintProperty(JUtrack.this.f10135b, "tag_policy", "-1"));
                                UMLog uMLog2 = UMConfigure.umDebugLog;
                                String str2 = JUtrack.f10134a;
                                UMLog.mutlInfo(str2, 2, "tag_policy:" + parseInt2);
                                if (parseInt > 0) {
                                    MessageSharedPrefs.getInstance(JUtrack.this.f10135b).setAppLaunchLogSendPolicy(parseInt);
                                }
                                if (parseInt2 > 0) {
                                    MessageSharedPrefs.getInstance(JUtrack.this.f10135b).setTagSendPolicy(parseInt2);
                                }
                            }
                            UMConfigureImpl.removeMessageSendListener(this);
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("jsonHeader", buildSLBaseHeader);
            jSONObject5.put("jsonBody", jSONObject4);
            Intent intent = new Intent();
            intent.setPackage(this.f10135b.getPackageName());
            intent.setAction(MsgConstant.MESSAGE_MESSAGE_SEND_ACTION);
            intent.putExtra(MsgConstant.KEY_UMPX_PATH, MsgConstant.UMPX_PUSH_LAUNCH);
            intent.putExtra(MsgConstant.KEY_SENDMESSAGE, jSONObject5.toString());
            UMJobIntentService.enqueueWork(this.f10135b, UmengMessageCallbackHandlerService.class, intent);
        }
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void trackLocation(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.LBS_ENDPOINT);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().contains(MsgConstant.HTTPSDNS_ERROR) || !UmengMessageDeviceConfig.isOnline(this.f10135b)) {
                throw new Exception(e);
            }
            jSONObject2 = sendRequest(this.f10135b, jSONObject, MsgConstant.LBS_ENDPOINT);
        } catch (Exception e2) {
            e2.printStackTrace();
            return;
        }
        if (jSONObject2 != null && TextUtils.equals(jSONObject2.getString("success"), "ok")) {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f10134a, 2, "location track success");
        }
    }

    @Override // com.umeng.message.common.inter.IUtrack
    public void trackRegister(JSONObject jSONObject) throws Exception {
        UMSLEnvelopeBuild.mContext = this.f10135b;
        final UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
        final JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(this.f10135b);
        JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
        jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(this.f10135b));
        jSONObject2.put(C3617o.f9371ay, MsgConstant.SDK_VERSION);
        jSONObject2.put("push_switch", UmengMessageDeviceConfig.isNotificationEnabled(this.f10135b));
        buildSLBaseHeader.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(MsgConstant.KEY_DEVICE_TOKEN, MessageSharedPrefs.getInstance(this.f10135b).getDeviceToken());
        final JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONObject3);
        if (C3819h.m10565d(this.f10135b)) {
            try {
                UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() {
                    /* class com.umeng.message.common.impl.json.JUtrack.C37843 */

                    @Override // com.umeng.commonsdk.utils.onMessageSendListener
                    public void onMessageSend() {
                        try {
                            JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(JUtrack.this.f10135b, buildSLBaseHeader, jSONObject4, MsgConstant.UMPX_PUSH_REGISTER);
                            if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                                MessageSharedPrefs.getInstance(JUtrack.this.f10135b).setHasResgister(true);
                                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(JUtrack.this.f10135b).getDeviceToken())) {
                                    UMLog uMLog = UMConfigure.umDebugLog;
                                    UMLog.mutlInfo(JUtrack.f10134a, 0, "setRegisteredToUmeng: device token为空");
                                }
                            }
                            UMConfigureImpl.removeMessageSendListener(this);
                        } catch (Throwable unused) {
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m10351a(JSONObject jSONObject, String str, long j) throws Exception {
        JSONObject jSONObject2;
        if (!str.equals("")) {
            jSONObject.put(MsgConstant.KEY_ALIAS_FAIL_LOG, str);
            try {
                jSONObject2 = sendRequest(jSONObject, MsgConstant.ALIAS_LOG);
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().contains(MsgConstant.HTTPSDNS_ERROR) || !UmengMessageDeviceConfig.isOnline(this.f10135b)) {
                    throw new Exception(e);
                }
                jSONObject2 = sendRequest(this.f10135b, jSONObject, MsgConstant.ALIAS_LOG);
            }
            if (jSONObject2 != null && TextUtils.equals(jSONObject2.optString("success", ""), "ok")) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("error", "3");
                String[] strArr = {j + ""};
                ContentResolver contentResolver = this.f10135b.getContentResolver();
                C3857a.m10616a(this.f10135b);
                contentResolver.update(C3857a.f10479d, contentValues, "time=?", strArr);
                int parseInt = Integer.parseInt(jSONObject2.optString("da_register_policy"));
                if (parseInt > 0) {
                    MessageSharedPrefs.getInstance(this.f10135b).setDaRegisterSendPolicy(parseInt);
                }
            }
        }
    }

    public static JSONObject sendRequest(Context context, JSONObject jSONObject, String str) throws Exception {
        String host = new URL(str).getHost();
        String a = C3892b.m10698a(context, host);
        UMLog uMLog = UMConfigure.umDebugLog;
        String str2 = f10134a;
        UMLog.mutlInfo(str2, 2, "ip:" + a);
        if (a == null) {
            return null;
        }
        URL url = new URL(str.replaceFirst(host, a));
        String body = HttpRequest.post(url).acceptJson().contentType(HttpRequest.CONTENT_TYPE_JSON).header(HttpConstant.HOST, host).trustHosts().send(jSONObject.toString()).body("UTF-8");
        UMLog uMLog2 = UMConfigure.umDebugLog;
        String str3 = f10134a;
        UMLog.mutlInfo(str3, 2, "dns-->sendRequest() url=" + url.toString() + "\n request = " + jSONObject + "\n response = " + body);
        return new JSONObject(body);
    }
}
