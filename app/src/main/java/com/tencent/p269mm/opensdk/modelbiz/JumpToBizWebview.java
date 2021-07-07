package com.tencent.p269mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.JumpToBizWebview */
public final class JumpToBizWebview {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.JumpToBizWebview$Req */
    public static class Req extends BaseReq {
        public static final int EXT_MSG_LENGTH = 1024;
        public static final String TAG = "MicroMsg.SDK.JumpToBizWebview.Req";
        public String extMsg;
        public int scene = 1;
        public String toUserName;
        public int webType;

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            String str2 = this.toUserName;
            if (str2 == null || str2.length() <= 0) {
                str = "checkArgs fail, toUserName is invalid";
            } else {
                String str3 = this.extMsg;
                if (str3 == null || str3.length() <= 1024) {
                    return true;
                }
                str = "ext msg is not null, while the length exceed 1024 bytes";
            }
            Log.m8651e(TAG, str);
            return false;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 8;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_jump_to_biz_webview_req_to_user_name", this.toUserName);
            bundle.putString("_wxapi_jump_to_biz_webview_req_ext_msg", this.extMsg);
            bundle.putInt("_wxapi_jump_to_biz_webview_req_web_type", this.webType);
            bundle.putInt("_wxapi_jump_to_biz_webview_req_scene", this.scene);
        }
    }
}
