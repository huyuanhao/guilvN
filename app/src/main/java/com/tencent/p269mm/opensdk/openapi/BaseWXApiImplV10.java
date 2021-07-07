package com.tencent.p269mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.tencent.p269mm.opensdk.channel.MMessageActV2;
import com.tencent.p269mm.opensdk.channel.p270a.C3374a;
import com.tencent.p269mm.opensdk.channel.p270a.C3376b;
import com.tencent.p269mm.opensdk.constants.ConstantsAPI;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.modelbase.BaseResp;
import com.tencent.p269mm.opensdk.modelbiz.AddCardToWXCardPackage;
import com.tencent.p269mm.opensdk.modelbiz.ChooseCardFromWXCardPackage;
import com.tencent.p269mm.opensdk.modelbiz.CreateChatroom;
import com.tencent.p269mm.opensdk.modelbiz.HandleScanResult;
import com.tencent.p269mm.opensdk.modelbiz.JoinChatroom;
import com.tencent.p269mm.opensdk.modelbiz.OpenWebview;
import com.tencent.p269mm.opensdk.modelbiz.SubscribeMessage;
import com.tencent.p269mm.opensdk.modelbiz.SubscribeMiniProgramMsg;
import com.tencent.p269mm.opensdk.modelbiz.WXInvoiceAuthInsert;
import com.tencent.p269mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.p269mm.opensdk.modelbiz.WXNontaxPay;
import com.tencent.p269mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.p269mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.p269mm.opensdk.modelbiz.WXPayInsurance;
import com.tencent.p269mm.opensdk.modelmsg.GetMessageFromWX;
import com.tencent.p269mm.opensdk.modelmsg.LaunchFromWX;
import com.tencent.p269mm.opensdk.modelmsg.SendAuth;
import com.tencent.p269mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p269mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p269mm.opensdk.modelpay.JumpToOfflinePay;
import com.tencent.p269mm.opensdk.modelpay.PayResp;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.ILog;
import com.tencent.p269mm.opensdk.utils.Log;
import com.umeng.socialize.handler.UMWXHandler;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10 */
public class BaseWXApiImplV10 implements IWXAPI {
    public static final String TAG = "MicroMsg.SDK.WXApiImplV10";
    public static String wxappPayEntryClassname;
    public String appId;
    public boolean checkSignature = false;
    public Context context;
    public boolean detached = false;
    public int wxSdkVersion;

    public BaseWXApiImplV10(Context context2, String str, boolean z) {
        Log.m8650d(TAG, "<init>, appId = " + str + ", checkSignature = " + z);
        this.context = context2;
        this.appId = str;
        this.checkSignature = z;
        C3392d.f8347D = context2.getApplicationContext();
    }

    private boolean checkSumConsistent(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            str = "checkSumConsistent fail, invalid arguments";
        } else if (bArr.length != bArr2.length) {
            str = "checkSumConsistent fail, length is different";
        } else {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        Log.m8651e(TAG, str);
        return false;
    }

    private boolean createChatroom(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private String getTokenFromWX(Context context2) {
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"), null, null, new String[]{this.appId, "621019904"}, null);
        if (query == null || !query.moveToFirst()) {
            return null;
        }
        String string = query.getString(0);
        Log.m8652i(TAG, "getTokenFromWX token is " + string);
        query.close();
        return string;
    }

    private boolean handleWxInternalRespType(String str, IWXAPIEventHandler iWXAPIEventHandler) {
        Log.m8652i(TAG, "handleWxInternalRespType, extInfo = " + str);
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("wx_internal_resptype");
            Log.m8652i(TAG, "handleWxInternalRespType, respType = " + queryParameter);
            if (C3392d.m8661b(queryParameter)) {
                Log.m8651e(TAG, "handleWxInternalRespType fail, respType is null");
                return false;
            } else if (queryParameter.equals("subscribemessage")) {
                SubscribeMessage.Resp resp = new SubscribeMessage.Resp();
                String queryParameter2 = parse.getQueryParameter("ret");
                if (queryParameter2 != null && queryParameter2.length() > 0) {
                    resp.errCode = C3392d.m8662c(queryParameter2);
                }
                resp.openId = parse.getQueryParameter("openid");
                resp.templateID = parse.getQueryParameter("template_id");
                resp.scene = C3392d.m8662c(parse.getQueryParameter("scene"));
                resp.action = parse.getQueryParameter("action");
                resp.reserved = parse.getQueryParameter("reserved");
                iWXAPIEventHandler.onResp(resp);
                return true;
            } else if (queryParameter.contains("invoice_auth_insert")) {
                WXInvoiceAuthInsert.Resp resp2 = new WXInvoiceAuthInsert.Resp();
                String queryParameter3 = parse.getQueryParameter("ret");
                if (queryParameter3 != null && queryParameter3.length() > 0) {
                    resp2.errCode = C3392d.m8662c(queryParameter3);
                }
                resp2.wxOrderId = parse.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp(resp2);
                return true;
            } else if (queryParameter.contains("payinsurance")) {
                WXPayInsurance.Resp resp3 = new WXPayInsurance.Resp();
                String queryParameter4 = parse.getQueryParameter("ret");
                if (queryParameter4 != null && queryParameter4.length() > 0) {
                    resp3.errCode = C3392d.m8662c(queryParameter4);
                }
                resp3.wxOrderId = parse.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp(resp3);
                return true;
            } else if (queryParameter.contains("nontaxpay")) {
                WXNontaxPay.Resp resp4 = new WXNontaxPay.Resp();
                String queryParameter5 = parse.getQueryParameter("ret");
                if (queryParameter5 != null && queryParameter5.length() > 0) {
                    resp4.errCode = C3392d.m8662c(queryParameter5);
                }
                resp4.wxOrderId = parse.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp(resp4);
                return true;
            } else if ("subscribeminiprogrammsg".equals(queryParameter) || "5".equals(queryParameter)) {
                SubscribeMiniProgramMsg.Resp resp5 = new SubscribeMiniProgramMsg.Resp();
                String queryParameter6 = parse.getQueryParameter("ret");
                if (queryParameter6 != null && queryParameter6.length() > 0) {
                    resp5.errCode = C3392d.m8662c(queryParameter6);
                }
                resp5.openId = parse.getQueryParameter("openid");
                resp5.unionId = parse.getQueryParameter("unionid");
                resp5.nickname = parse.getQueryParameter(UMWXHandler.NICKNAME);
                resp5.errStr = parse.getQueryParameter(UMWXHandler.ERRMSG);
                iWXAPIEventHandler.onResp(resp5);
                return true;
            } else {
                Log.m8651e(TAG, "this open sdk version not support the request type");
                return false;
            }
        } catch (Exception e) {
            Log.m8651e(TAG, "handleWxInternalRespType fail, ex = " + e.getMessage());
        }
    }

    private boolean joinChatroom(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private void launchWXIfNeed() {
        if (Build.VERSION.SDK_INT >= 28) {
            Log.m8652i(TAG, "openWXApp before api call");
            openWXApp();
        }
    }

    private boolean sendAddCardToWX(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, new String[]{this.appId, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendChooseCardFromWX(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, new String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendHandleScanResult(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, new String[]{this.appId, bundle.getString("_wxapi_scan_qrcode_result")}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendInvoiceAuthInsert(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "2", URLEncoder.encode(String.format("url=%s", URLEncoder.encode(((WXInvoiceAuthInsert.Req) baseReq).url)))}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendJumpToBizProfileReq(Context context2, Bundle bundle) {
        launchWXIfNeed();
        ContentResolver contentResolver = context2.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_scene"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bundle.getInt("_wxapi_jump_to_biz_profile_req_profile_type"));
        Cursor query = contentResolver.query(parse, null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg"), sb.toString(), sb2.toString()}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendJumpToBizTempSessionReq(Context context2, Bundle bundle) {
        launchWXIfNeed();
        ContentResolver contentResolver = context2.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizTempSession");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_show_type"));
        Cursor query = contentResolver.query(parse, null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_session_from"), sb.toString()}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendJumpToBizWebviewReq(Context context2, Bundle bundle) {
        launchWXIfNeed();
        ContentResolver contentResolver = context2.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToBizProfile");
        StringBuilder sb = new StringBuilder();
        sb.append(bundle.getInt("_wxapi_jump_to_biz_webview_req_scene"));
        Cursor query = contentResolver.query(parse, null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_biz_webview_req_to_user_name"), bundle.getString("_wxapi_jump_to_biz_webview_req_ext_msg"), sb.toString()}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendJumpToOfflinePayReq(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"), null, null, new String[]{this.appId}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendLaunchWXMiniprogram(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        WXLaunchMiniProgram.Req req = (WXLaunchMiniProgram.Req) baseReq;
        ContentResolver contentResolver = context2.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        StringBuilder sb = new StringBuilder();
        sb.append(req.miniprogramType);
        Cursor query = contentResolver.query(parse, null, null, new String[]{this.appId, req.userName, req.path, sb.toString(), req.extData}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendNonTaxPay(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "3", URLEncoder.encode(String.format("url=%s", URLEncoder.encode(((WXNontaxPay.Req) baseReq).url)))}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendOpenBusiLuckyMoney(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, new String[]{this.appId, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendOpenBusinessView(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        WXOpenBusinessView.Req req = (WXOpenBusinessView.Req) baseReq;
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessView"), null, null, new String[]{this.appId, req.businessType, req.query, req.extInfo}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendOpenBusinessWebview(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        WXOpenBusinessWebview.Req req = (WXOpenBusinessWebview.Req) baseReq;
        ContentResolver contentResolver = context2.getContentResolver();
        Uri parse = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessWebview");
        HashMap<String, String> hashMap = req.queryInfo;
        String jSONObject = (hashMap == null || hashMap.size() <= 0) ? "" : new JSONObject(req.queryInfo).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(req.businessType);
        Cursor query = contentResolver.query(parse, null, null, new String[]{this.appId, sb.toString(), jSONObject}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendOpenRankListReq(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new String[0], null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendOpenWebview(Context context2, Bundle bundle) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendPayInSurance(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "4", URLEncoder.encode(String.format("url=%s", URLEncoder.encode(((WXPayInsurance.Req) baseReq).url)))}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendPayReq(Context context2, Bundle bundle) {
        if (wxappPayEntryClassname == null) {
            wxappPayEntryClassname = new MMSharedPreferences(context2).getString("_wxapp_pay_entry_classname_", null);
            Log.m8650d(TAG, "pay, set wxappPayEntryClassname = " + wxappPayEntryClassname);
            if (wxappPayEntryClassname == null) {
                try {
                    wxappPayEntryClassname = context2.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
                } catch (Exception e) {
                    Log.m8651e(TAG, "get from metaData failed : " + e.getMessage());
                }
            }
            if (wxappPayEntryClassname == null) {
                Log.m8651e(TAG, "pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.bundle = bundle;
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = wxappPayEntryClassname;
        return MMessageActV2.send(context2, args);
    }

    private boolean sendSubscribeMessage(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        SubscribeMessage.Req req = (SubscribeMessage.Req) baseReq;
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "1", String.valueOf(req.scene), req.templateID, req.reserved}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    private boolean sendSubscribeMiniProgramMsg(Context context2, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor query = context2.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "5", ((SubscribeMiniProgramMsg.Req) baseReq).miniProgramAppId}, null);
        if (query != null) {
            query.close();
        }
        return true;
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public void detach() {
        Log.m8650d(TAG, "detach");
        this.detached = true;
        this.context = null;
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public int getWXAppSupportAPI() {
        if (this.detached) {
            throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
        } else if (!isWXAppInstalled()) {
            Log.m8651e(TAG, "open wx app failed, not installed or signature check failed");
            return 0;
        } else {
            this.wxSdkVersion = 0;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() {
                /* class com.tencent.p269mm.opensdk.openapi.BaseWXApiImplV10.RunnableC33861 */

                public void run() {
                    try {
                        MMSharedPreferences mMSharedPreferences = new MMSharedPreferences(BaseWXApiImplV10.this.context);
                        BaseWXApiImplV10.this.wxSdkVersion = mMSharedPreferences.getInt("_build_info_sdk_int_", 0);
                    } catch (Exception e) {
                        Log.m8654w(BaseWXApiImplV10.TAG, e.getMessage());
                    }
                    countDownLatch.countDown();
                }
            }, "OpenSdkGetWXAppSupportAPI").run();
            try {
                countDownLatch.await(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.m8654w(TAG, e.getMessage());
            }
            Log.m8650d(TAG, "_build_info_sdk_int_ = " + this.wxSdkVersion);
            if (this.wxSdkVersion == 0) {
                try {
                    this.wxSdkVersion = this.context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
                    Log.m8650d(TAG, "OPEN_SDK_VERSION = " + this.wxSdkVersion);
                } catch (Exception e2) {
                    Log.m8651e(TAG, "get from metaData failed : " + e2.getMessage());
                }
            }
            return this.wxSdkVersion;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public boolean handleIntent(Intent intent, IWXAPIEventHandler iWXAPIEventHandler) {
        try {
            if (!WXApiImplComm.isIntentFromWx(intent, ConstantsAPI.Token.WX_TOKEN_VALUE_MSG)) {
                Log.m8652i(TAG, "handleIntent fail, intent not from weixin msg");
                return false;
            } else if (!this.detached) {
                String stringExtra = intent.getStringExtra(ConstantsAPI.CONTENT);
                int intExtra = intent.getIntExtra(ConstantsAPI.SDK_VERSION, 0);
                String stringExtra2 = intent.getStringExtra(ConstantsAPI.APP_PACKAGE);
                if (stringExtra2 != null) {
                    if (stringExtra2.length() != 0) {
                        if (!checkSumConsistent(intent.getByteArrayExtra(ConstantsAPI.CHECK_SUM), C3376b.m8637a(stringExtra, intExtra, stringExtra2))) {
                            Log.m8651e(TAG, "checksum fail");
                            return false;
                        }
                        int intExtra2 = intent.getIntExtra("_wxapi_command_type", 0);
                        Log.m8652i(TAG, "handleIntent, cmd = " + intExtra2);
                        switch (intExtra2) {
                            case 1:
                                iWXAPIEventHandler.onResp(new SendAuth.Resp(intent.getExtras()));
                                return true;
                            case 2:
                                iWXAPIEventHandler.onResp(new SendMessageToWX.Resp(intent.getExtras()));
                                return true;
                            case 3:
                                iWXAPIEventHandler.onReq(new GetMessageFromWX.Req(intent.getExtras()));
                                return true;
                            case 4:
                                ShowMessageFromWX.Req req = new ShowMessageFromWX.Req(intent.getExtras());
                                String str = req.message.messageExt;
                                if (str == null || !str.contains("wx_internal_resptype")) {
                                    if (str != null && str.contains("openbusinesswebview")) {
                                        try {
                                            Uri parse = Uri.parse(str);
                                            if (parse == null || !"openbusinesswebview".equals(parse.getHost())) {
                                                Log.m8650d(TAG, "not openbusinesswebview %" + str);
                                            } else {
                                                WXOpenBusinessWebview.Resp resp = new WXOpenBusinessWebview.Resp();
                                                String queryParameter = parse.getQueryParameter("ret");
                                                if (queryParameter != null && queryParameter.length() > 0) {
                                                    resp.errCode = C3392d.m8662c(queryParameter);
                                                }
                                                resp.resultInfo = parse.getQueryParameter("resultInfo");
                                                resp.errStr = parse.getQueryParameter(UMWXHandler.ERRMSG);
                                                String queryParameter2 = parse.getQueryParameter("type");
                                                if (queryParameter2 != null && queryParameter2.length() > 0) {
                                                    resp.businessType = C3392d.m8662c(queryParameter2);
                                                }
                                                iWXAPIEventHandler.onResp(resp);
                                                return true;
                                            }
                                        } catch (Exception e) {
                                            Log.m8651e(TAG, "parse fail, ex = " + e.getMessage());
                                        }
                                    }
                                    iWXAPIEventHandler.onReq(req);
                                    return true;
                                }
                                boolean handleWxInternalRespType = handleWxInternalRespType(str, iWXAPIEventHandler);
                                Log.m8652i(TAG, "handleIntent, extInfo contains wx_internal_resptype, ret = " + handleWxInternalRespType);
                                return handleWxInternalRespType;
                            case 5:
                                iWXAPIEventHandler.onResp(new PayResp(intent.getExtras()));
                                return true;
                            case 6:
                                iWXAPIEventHandler.onReq(new LaunchFromWX.Req(intent.getExtras()));
                                return true;
                            case 7:
                            case 8:
                            case 10:
                            case 11:
                            case 13:
                            case 18:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            default:
                                Log.m8651e(TAG, "unknown cmd = " + intExtra2);
                                break;
                            case 9:
                                iWXAPIEventHandler.onResp(new AddCardToWXCardPackage.Resp(intent.getExtras()));
                                return true;
                            case 12:
                                iWXAPIEventHandler.onResp(new OpenWebview.Resp(intent.getExtras()));
                                return true;
                            case 14:
                                iWXAPIEventHandler.onResp(new CreateChatroom.Resp(intent.getExtras()));
                                return true;
                            case 15:
                                iWXAPIEventHandler.onResp(new JoinChatroom.Resp(intent.getExtras()));
                                return true;
                            case 16:
                                iWXAPIEventHandler.onResp(new ChooseCardFromWXCardPackage.Resp(intent.getExtras()));
                                return true;
                            case 17:
                                iWXAPIEventHandler.onResp(new HandleScanResult.Resp(intent.getExtras()));
                                return true;
                            case 19:
                                iWXAPIEventHandler.onResp(new WXLaunchMiniProgram.Resp(intent.getExtras()));
                                return true;
                            case 24:
                                iWXAPIEventHandler.onResp(new JumpToOfflinePay.Resp(intent.getExtras()));
                                return true;
                            case 25:
                                iWXAPIEventHandler.onResp(new WXOpenBusinessWebview.Resp(intent.getExtras()));
                                return true;
                            case 26:
                                iWXAPIEventHandler.onResp(new WXOpenBusinessView.Resp(intent.getExtras()));
                                return true;
                        }
                        return false;
                    }
                }
                Log.m8651e(TAG, "invalid argument");
                return false;
            } else {
                throw new IllegalStateException("handleIntent fail, WXMsgImpl has been detached");
            }
        } catch (Exception e2) {
            Log.m8651e(TAG, "handleIntent fail, ex = " + e2.getMessage());
        }
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public boolean isWXAppInstalled() {
        if (!this.detached) {
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
                if (packageInfo == null) {
                    return false;
                }
                return WXApiImplComm.validateAppSignature(this.context, packageInfo.signatures, this.checkSignature);
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
        }
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public boolean openWXApp() {
        String str;
        if (!this.detached) {
            if (!isWXAppInstalled()) {
                str = "open wx app failed, not installed or signature check failed";
            } else {
                try {
                    this.context.startActivity(this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
                    return true;
                } catch (Exception e) {
                    str = "startActivity fail, exception = " + e.getMessage();
                }
            }
            Log.m8651e(TAG, str);
            return false;
        }
        throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public boolean registerApp(String str) {
        return registerApp(str, 0);
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public boolean registerApp(String str, long j) {
        if (this.detached) {
            throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
        } else if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            Log.m8651e(TAG, "register app failed for wechat app signature check failed");
            return false;
        } else {
            Log.m8650d(TAG, "registerApp, appId = " + str);
            if (str != null) {
                this.appId = str;
            }
            Log.m8650d(TAG, "registerApp, appId = " + str);
            if (str != null) {
                this.appId = str;
            }
            Log.m8650d(TAG, "register app " + this.context.getPackageName());
            C3374a.C3375a aVar = new C3374a.C3375a();
            aVar.f8313a = "com.tencent.mm";
            aVar.action = ConstantsAPI.ACTION_HANDLE_APP_REGISTER;
            aVar.content = "weixin://registerapp?appid=" + this.appId;
            aVar.f8314b = j;
            return C3374a.m8636a(this.context, aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x0215  */
    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendReq(com.tencent.p269mm.opensdk.modelbase.BaseReq r12) {
        /*
        // Method dump skipped, instructions count: 623
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p269mm.opensdk.openapi.BaseWXApiImplV10.sendReq(com.tencent.mm.opensdk.modelbase.BaseReq):boolean");
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public boolean sendResp(BaseResp baseResp) {
        String str;
        if (!this.detached) {
            if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
                str = "sendResp failed for wechat app signature check failed";
            } else if (!baseResp.checkArgs()) {
                str = "sendResp checkArgs fail";
            } else {
                Bundle bundle = new Bundle();
                baseResp.toBundle(bundle);
                MMessageActV2.Args args = new MMessageActV2.Args();
                args.bundle = bundle;
                args.content = "weixin://sendresp?appid=" + this.appId;
                args.targetPkgName = "com.tencent.mm";
                args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                return MMessageActV2.send(this.context, args);
            }
            Log.m8651e(TAG, str);
            return false;
        }
        throw new IllegalStateException("sendResp fail, WXMsgImpl has been detached");
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public void setLogImpl(ILog iLog) {
        Log.setLogImpl(iLog);
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPI
    public void unregisterApp() {
        if (this.detached) {
            throw new IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
        } else if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            Log.m8651e(TAG, "unregister app failed for wechat app signature check failed");
        } else {
            Log.m8650d(TAG, "unregisterApp, appId = " + this.appId);
            String str = this.appId;
            if (str == null || str.length() == 0) {
                Log.m8651e(TAG, "unregisterApp fail, appId is empty");
                return;
            }
            Log.m8650d(TAG, "unregister app " + this.context.getPackageName());
            C3374a.C3375a aVar = new C3374a.C3375a();
            aVar.f8313a = "com.tencent.mm";
            aVar.action = ConstantsAPI.ACTION_HANDLE_APP_UNREGISTER;
            aVar.content = "weixin://unregisterapp?appid=" + this.appId;
            C3374a.m8636a(this.context, aVar);
        }
    }
}
