package com.tencent.p269mm.opensdk.openapi;

import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.modelbase.BaseResp;

/* renamed from: com.tencent.mm.opensdk.openapi.IWXAPIEventHandler */
public interface IWXAPIEventHandler {
    void onReq(BaseReq baseReq);

    void onResp(BaseResp baseResp);
}
