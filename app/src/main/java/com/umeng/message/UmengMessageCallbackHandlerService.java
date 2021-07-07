package com.umeng.message;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.message.common.C3780d;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3819h;
import com.umeng.message.provider.C3857a;
import com.umeng.message.service.UMJobIntentService;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONObject;

public class UmengMessageCallbackHandlerService extends UMJobIntentService {
    public static final String TAG = UmengMessageCallbackHandlerService.class.getName();

    /* renamed from: a */
    public Context f9986a = this;

    @Override // com.umeng.message.service.JobIntentService, com.umeng.message.service.UMJobIntentService
    /* renamed from: a */
    public void mo39680a(Intent intent) {
        UHandler uHandler;
        String a = C3819h.m10538a(this.f9986a, Process.myPid());
        UMLog uMLog = UMConfigure.umDebugLog;
        String str = TAG;
        UMLog.mutlInfo(str, 2, "进程名：" + a);
        if (intent != null && intent.getAction() != null) {
            if (intent.getAction().equals(MsgConstant.MESSAGE_REGISTER_CALLBACK_ACTION)) {
                MLog.m9802i("wuchi", "--->>> UmengMessageCallbackHandlerService register callback");
                try {
                    final String stringExtra = intent.getStringExtra(MsgConstant.KEY_REGISTRATION_ID);
                    boolean booleanExtra = intent.getBooleanExtra("status", false);
                    UMLog uMLog2 = UMConfigure.umDebugLog;
                    String str2 = TAG;
                    UMLog.mutlInfo(str2, 2, "注册：" + stringExtra + "，状态：" + booleanExtra);
                    IUmengRegisterCallback registerCallback = PushAgent.getInstance(this.f9986a).getRegisterCallback();
                    if (booleanExtra) {
                        C3780d.m10347a(new Runnable() {
                            /* class com.umeng.message.UmengMessageCallbackHandlerService.RunnableC37741 */

                            public void run() {
                                try {
                                    String deviceToken = MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f9986a).getDeviceToken();
                                    if (!(stringExtra == null || deviceToken == null || stringExtra.equals(deviceToken))) {
                                        MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f9986a).setHasResgister(false);
                                        MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f9986a).setDeviceToken(stringExtra);
                                        UmengMessageCallbackHandlerService.this.m10281a((UmengMessageCallbackHandlerService) UmengMessageCallbackHandlerService.this.f9986a, (Context) stringExtra);
                                        ContentResolver contentResolver = UmengMessageCallbackHandlerService.this.f9986a.getContentResolver();
                                        C3857a.m10616a(UmengMessageCallbackHandlerService.this.f9986a);
                                        contentResolver.delete(C3857a.f10480e, null, null);
                                        MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f9986a).resetTags();
                                    }
                                } catch (Exception unused) {
                                }
                                UTrack.getInstance(UmengMessageCallbackHandlerService.this.f9986a).mo39636a();
                                PushAgent.getInstance(UmengMessageCallbackHandlerService.this.f9986a).onAppStart();
                            }
                        });
                        if (registerCallback != null) {
                            registerCallback.onSuccess(stringExtra);
                        }
                    } else if (registerCallback != null) {
                        registerCallback.onFailure(intent.getStringExtra(C3617o.f9366at), intent.getStringExtra("s1"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (intent.getAction().equals(MsgConstant.MESSAGE_ENABLE_CALLBACK_ACTION)) {
                MLog.m9802i("wuchi", "--->>> UmengMessageCallbackHandlerService enable callback");
                try {
                    boolean booleanExtra2 = intent.getBooleanExtra("status", false);
                    IUmengCallback callback = PushAgent.getInstance(this.f9986a).getCallback();
                    UMLog uMLog3 = UMConfigure.umDebugLog;
                    String str3 = TAG;
                    UMLog.mutlInfo(str3, 2, "开启状态:" + booleanExtra2);
                    if (booleanExtra2) {
                        if (callback != null) {
                            callback.onSuccess();
                        }
                    } else if (callback != null) {
                        callback.onFailure(intent.getStringExtra(C3617o.f9366at), intent.getStringExtra("s1"));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else if (intent.getAction().equals(MsgConstant.MESSAGE_DISABLE_CALLBACK_ACTION)) {
                MLog.m9802i("wuchi", "--->>> UmengMessageCallbackHandlerService disable callback");
                try {
                    boolean booleanExtra3 = intent.getBooleanExtra("status", false);
                    IUmengCallback callback2 = PushAgent.getInstance(this.f9986a).getCallback();
                    UMLog uMLog4 = UMConfigure.umDebugLog;
                    String str4 = TAG;
                    UMLog.mutlInfo(str4, 2, "关闭状态:" + booleanExtra3);
                    if (booleanExtra3) {
                        if (callback2 != null) {
                            callback2.onSuccess();
                        }
                    } else if (callback2 != null) {
                        callback2.onFailure(intent.getStringExtra(C3617o.f9366at), intent.getStringExtra("s1"));
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else if (intent.getAction().equals(MsgConstant.MESSAGE_MESSAGE_HANDLER_ACTION)) {
                MLog.m9802i("wuchi", "--->>> UmengMessageCallbackHandlerService message callback");
                try {
                    UMessage uMessage = new UMessage(new JSONObject(intent.getStringExtra(AgooConstants.MESSAGE_BODY)));
                    uMessage.message_id = intent.getStringExtra("id");
                    uMessage.task_id = intent.getStringExtra(AgooConstants.MESSAGE_TASK_ID);
                    if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
                        uHandler = PushAgent.getInstance(this.f9986a).getAdHandler();
                    } else {
                        uHandler = PushAgent.getInstance(this.f9986a).getMessageHandler();
                    }
                    if (uHandler != null) {
                        uHandler.handleMessage(this.f9986a, uMessage);
                    }
                } catch (Exception e4) {
                    if (e4.getMessage() != null) {
                        UMLog uMLog5 = UMConfigure.umDebugLog;
                        String str5 = TAG;
                        UMLog.mutlInfo(str5, 2, "MESSAGE_HANDLER_ACTION:" + e4.getMessage());
                    }
                }
            } else if (intent.getAction().equals(MsgConstant.MESSAGE_MESSAGE_SEND_ACTION)) {
                MLog.m9802i("wuchi", "--->>> UmengMessageCallbackHandlerService send log callback");
                try {
                    String stringExtra2 = intent.getStringExtra(MsgConstant.KEY_SENDMESSAGE);
                    final String stringExtra3 = intent.getStringExtra(MsgConstant.KEY_UMPX_PATH);
                    JSONObject jSONObject = new JSONObject(stringExtra2);
                    final JSONObject jSONObject2 = jSONObject.getJSONObject("jsonHeader");
                    final JSONObject jSONObject3 = jSONObject.getJSONObject("jsonBody");
                    final UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                    try {
                        UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() {
                            /* class com.umeng.message.UmengMessageCallbackHandlerService.C37752 */

                            @Override // com.umeng.commonsdk.utils.onMessageSendListener
                            public void onMessageSend() {
                                try {
                                    JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(UmengMessageCallbackHandlerService.this.f9986a, jSONObject2, jSONObject3, stringExtra3);
                                    if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                                        UmengMessageCallbackHandlerService.this.m10284a((UmengMessageCallbackHandlerService) jSONObject3.getJSONArray("push"));
                                    }
                                    UMConfigureImpl.removeMessageSendListener(this);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                } catch (Exception e5) {
                    if (e5.getMessage() != null) {
                        UMLog uMLog6 = UMConfigure.umDebugLog;
                        String str6 = TAG;
                        UMLog.mutlInfo(str6, 2, "MESSAGE_SEND_ACTION:" + e5.getMessage());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m10281a(Context context, String str) throws Exception {
        File file = new File(context.getExternalFilesDir(null).getPath() + "/deviceToken");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m10284a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                        String optString = jSONObject.optString("msg_id");
                        int optInt = jSONObject.optInt(MsgConstant.KEY_ACTION_TYPE);
                        String[] strArr = {optString, optInt + ""};
                        C3857a.m10616a(this.f9986a);
                        arrayList.add(ContentProviderOperation.newDelete(C3857a.f10481f).withSelection("MsgId=? And ActionType=?", strArr).build());
                        if (optInt != 0) {
                            C3857a.m10616a(this.f9986a);
                            arrayList.add(ContentProviderOperation.newDelete(C3857a.f10482g).withSelection("MsgId=?", new String[]{optString}).build());
                        }
                    }
                }
                ContentResolver contentResolver = this.f9986a.getContentResolver();
                C3857a.m10616a(this.f9986a);
                contentResolver.applyBatch(C3857a.f10476a, arrayList);
            } catch (Exception e) {
                UMLog uMLog = UMConfigure.umDebugLog;
                String str = TAG;
                UMLog.mutlInfo(str, 2, "remove cache log:" + e.getMessage());
            }
        }
    }
}
