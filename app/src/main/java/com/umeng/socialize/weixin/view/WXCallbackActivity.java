package com.umeng.socialize.weixin.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.modelbase.BaseResp;
import com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.handler.UMWXHandler;
import com.umeng.socialize.utils.SLog;

public abstract class WXCallbackActivity extends Activity implements IWXAPIEventHandler {
    public final String TAG = WXCallbackActivity.class.getSimpleName();
    public UMWXHandler mWxHandler = null;

    public void handleIntent(Intent intent) {
        this.mWxHandler.getWXApi().handleIntent(intent, this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SLog.m10857I("WXCallbackActivity onCreate");
        this.mWxHandler = (UMWXHandler) UMShareAPI.get(getApplicationContext()).getHandler(SHARE_MEDIA.WEIXIN);
        SLog.m10857I("WXCallbackActivity mWxHandler：" + this.mWxHandler);
        this.mWxHandler.onCreate(getApplicationContext(), PlatformConfig.getPlatform(SHARE_MEDIA.WEIXIN));
        handleIntent(getIntent());
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        SLog.m10857I("WXCallbackActivity onNewIntent");
        setIntent(intent);
        UMWXHandler uMWXHandler = (UMWXHandler) UMShareAPI.get(getApplicationContext()).getHandler(SHARE_MEDIA.WEIXIN);
        this.mWxHandler = uMWXHandler;
        uMWXHandler.onCreate(getApplicationContext(), PlatformConfig.getPlatform(SHARE_MEDIA.WEIXIN));
        handleIntent(intent);
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        UMWXHandler uMWXHandler = this.mWxHandler;
        if (uMWXHandler != null) {
            uMWXHandler.getWXEventHandler().onReq(baseReq);
        }
        finish();
    }

    @Override // com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        SLog.m10857I("WXCallbackActivity 分发回调");
        UMWXHandler uMWXHandler = this.mWxHandler;
        if (!(uMWXHandler == null || baseResp == null)) {
            try {
                uMWXHandler.getWXEventHandler().onResp(baseResp);
            } catch (Exception e) {
                SLog.error(e);
            }
        }
        finish();
    }
}
