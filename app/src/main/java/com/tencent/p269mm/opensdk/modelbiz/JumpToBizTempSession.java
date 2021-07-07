package com.tencent.p269mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.JumpToBizTempSession */
public final class JumpToBizTempSession {
    public static final int SHOW_CHAT = 1;
    public static final int SHOW_MENU = 0;

    /* renamed from: com.tencent.mm.opensdk.modelbiz.JumpToBizTempSession$Req */
    public static class Req extends BaseReq {
        public static final int MAX_SESSION_FROM_LENGTH = 1024;
        public static final String TAG = "MicroMsg.SDK.JumpToBizTempSession.Req";
        public String sessionFrom;
        public int showType;
        public String toUserName;

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            String str2 = this.toUserName;
            if (str2 == null || str2.length() <= 0) {
                str = "checkArgs fail, toUserName is invalid";
            } else {
                String str3 = this.sessionFrom;
                if (str3 != null && str3.length() <= 1024) {
                    return true;
                }
                str = "checkArgs fail, sessionFrom is invalid";
            }
            Log.m8651e(TAG, str);
            return false;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 10;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_jump_to_biz_webview_req_to_user_name", this.toUserName);
            bundle.putString("_wxapi_jump_to_biz_webview_req_session_from", this.sessionFrom);
            bundle.putInt("_wxapi_jump_to_biz_webview_req_show_type", this.showType);
        }
    }
}
