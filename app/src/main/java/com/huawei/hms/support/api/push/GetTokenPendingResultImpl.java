package com.huawei.hms.support.api.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.AbstractC1160c;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.TokenResp;
import com.huawei.hms.support.log.C1202a;
import com.umeng.message.MsgConstant;

public class GetTokenPendingResultImpl extends AbstractC1160c<TokenResult, TokenResp> {

    /* renamed from: a */
    public Context f1210a;

    public GetTokenPendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        super(apiClient, str, iMessageEntity);
        this.f1210a = apiClient.getContext();
    }

    public TokenResult onComplete(TokenResp tokenResp) {
        TokenResult tokenResult = new TokenResult();
        C1202a.m1318b("GetTokenPendingResultImpl", "get token complete, the return code:" + tokenResp.getRetCode());
        tokenResult.setStatus(new Status(tokenResp.getRetCode()));
        tokenResult.setTokenRes(tokenResp);
        if (!TextUtils.isEmpty(tokenResp.getToken()) && this.f1210a != null) {
            try {
                Intent flags = new Intent("com.huawei.android.push.intent.REGISTRATION").setPackage(this.f1210a.getPackageName()).putExtra(MsgConstant.KEY_DEVICE_TOKEN, tokenResp.getToken().getBytes("UTF-8")).setFlags(32);
                Context context = this.f1210a;
                context.sendBroadcast(flags, this.f1210a.getPackageName() + ".permission.PROCESS_PUSH_MSG");
            } catch (RuntimeException unused) {
                C1202a.m1318b("GetTokenPendingResultImpl", "send broadcast runtime failed");
            } catch (Exception unused2) {
                C1202a.m1318b("GetTokenPendingResultImpl", "send broadcast failed");
            }
        }
        return tokenResult;
    }

    @Override // com.huawei.hms.support.api.AbstractC1160c
    public TokenResult onError(int i) {
        TokenResult tokenResult = new TokenResult();
        tokenResult.setStatus(new Status(i));
        return tokenResult;
    }
}
