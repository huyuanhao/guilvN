package com.huawei.hms.support.api.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.ResolvePendingResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.push.AgreementReq;
import com.huawei.hms.support.api.entity.push.AgreementResp;
import com.huawei.hms.support.api.entity.push.DeleteTokenReq;
import com.huawei.hms.support.api.entity.push.DeleteTokenResp;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.EnableNotifyResp;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.PushStateReq;
import com.huawei.hms.support.api.entity.push.PushStateResp;
import com.huawei.hms.support.api.entity.push.TokenReq;
import com.huawei.hms.support.api.push.p046b.AbstractC1187a;
import com.huawei.hms.support.api.push.p046b.p047a.AbstractC1192b;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.AbstractC1189a;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.C1191c;
import com.huawei.hms.support.api.push.p046b.p049b.C1197d;
import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.C5982OoooOoO;
import com.vivo.push.PushClientConstants;
import java.util.List;
import java.util.Map;

public class HuaweiPushApiImp implements HuaweiPushApi {
    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public PendingResult<HandleTagsResult> deleteTags(ApiClient apiClient, List<String> list) throws PushException {
        return new C1186b().mo15692a(apiClient, list);
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public void deleteToken(ApiClient apiClient, String str) throws PushException {
        Context context = apiClient.getContext();
        C1202a.m1318b("HuaweiPushApiImp", "invoke method: deleteToken, pkgName:" + context.getPackageName());
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.equals(AbstractC1192b.m1284a(context, "push_client_self_info"))) {
                    AbstractC1192b.m1286b(context, "push_client_self_info");
                }
                DeleteTokenReq deleteTokenReq = new DeleteTokenReq();
                deleteTokenReq.setPkgName(context.getPackageName());
                deleteTokenReq.setToken(str);
                ResolvePendingResult.build(apiClient, PushNaming.deleteToken, deleteTokenReq, DeleteTokenResp.class).get();
                AbstractC1189a.m1272a(apiClient, PushNaming.deleteToken);
            } catch (Exception e) {
                C1202a.m1316a("HuaweiPushApiImp", "delete token failed, e=" + e.getMessage());
                throw new PushException(e + PushException.EXCEPITON_DEL_TOKEN_FAILED);
            }
        } else {
            C1202a.m1316a("HuaweiPushApiImp", "token is null, can not deregister token");
            throw new PushException(PushException.EXCEPITON_TOKEN_INVALID);
        }
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public void enableReceiveNormalMsg(ApiClient apiClient, boolean z) {
        C1202a.m1318b("HuaweiPushApiImp", "invoke enableReceiveNormalMsg, set flag:" + z);
        new C1191c(apiClient.getContext(), "push_switch").mo15696a("normal_msg_enable", z ^ true);
        AbstractC1189a.m1272a(apiClient, PushNaming.enableReceiveNormalMsg);
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public Status enableReceiveNotifyMsg(ApiClient apiClient, boolean z) {
        C1202a.m1318b("HuaweiPushApiImp", "invoke enableReceiveNotifyMsg, set flag:" + z);
        Context context = apiClient.getContext();
        if (!AbstractC1187a.m1263a(context)) {
            if (!apiClient.isConnected()) {
                return new Status(CommonCode.ErrorCode.CLIENT_API_INVALID);
            }
            EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
            enableNotifyReq.setPackageName(apiClient.getPackageName());
            enableNotifyReq.setEnable(z);
            ResolvePendingResult.build(apiClient, PushNaming.setNotifyFlag, enableNotifyReq, EnableNotifyResp.class).get();
        } else if (AbstractC1187a.m1265c(context) < 90101310) {
            Intent putExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", C1197d.m1296a(context, context.getPackageName() + "#" + z));
            putExtra.setPackage("android");
            context.sendBroadcast(putExtra);
        } else {
            new C1191c(context, "push_notify_flag").mo15696a("notify_msg_enable", !z);
            Uri parse = Uri.parse("content://" + context.getPackageName() + ".huawei.push.provider/" + "push_notify_flag" + C5982OoooOoO.OooO);
            Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
            intent.putExtra("type", "enalbeFlag");
            intent.putExtra(PushClientConstants.TAG_PKG_NAME, apiClient.getPackageName());
            intent.putExtra("url", parse);
            intent.setPackage("android");
            context.sendBroadcast(intent);
        }
        return Status.SUCCESS;
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public boolean getPushState(ApiClient apiClient) {
        PushStateReq pushStateReq = new PushStateReq();
        pushStateReq.setPkgName(apiClient.getPackageName());
        ResolvePendingResult.build(apiClient, PushNaming.getPushState, pushStateReq, PushStateResp.class).get();
        AbstractC1189a.m1272a(apiClient, PushNaming.getPushState);
        return true;
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public PendingResult<GetTagResult> getTags(ApiClient apiClient) throws PushException {
        return new C1186b().mo15691a(apiClient);
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public PendingResult<TokenResult> getToken(ApiClient apiClient) {
        Context context = apiClient.getContext();
        C1202a.m1318b("HuaweiPushApiImp", "get token, pkgName:" + context.getPackageName());
        C1191c cVar = new C1191c(context, "push_client_self_info");
        TokenReq tokenReq = new TokenReq();
        tokenReq.setPackageName(apiClient.getPackageName());
        if (!cVar.mo15697a("hasRequestAgreement")) {
            tokenReq.setFirstTime(true);
            cVar.mo15696a("hasRequestAgreement", true);
        } else {
            tokenReq.setFirstTime(false);
        }
        return new GetTokenPendingResultImpl(apiClient, PushNaming.getToken, tokenReq);
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public void queryAgreement(ApiClient apiClient) throws PushException {
        C1202a.m1318b("HuaweiPushApiImp", "invoke queryAgreement");
        Context context = apiClient.getContext();
        AgreementReq agreementReq = new AgreementReq();
        agreementReq.setPkgName(context.getPackageName());
        String a = AbstractC1192b.m1284a(context, "push_client_self_info");
        if (!new C1191c(context, "push_client_self_info").mo15697a("hasRequestAgreement")) {
            agreementReq.setFirstTime(true);
        } else {
            agreementReq.setFirstTime(false);
        }
        agreementReq.setToken(a);
        ResolvePendingResult.build(apiClient, PushNaming.handleAgreement, agreementReq, AgreementResp.class).get();
    }

    @Override // com.huawei.hms.support.api.push.HuaweiPushApi
    public PendingResult<HandleTagsResult> setTags(ApiClient apiClient, Map<String, String> map) throws PushException {
        return new C1186b().mo15693a(apiClient, map);
    }
}
