package com.tencent.p269mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.modelbase.BaseResp;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg */
public final class SubscribeMiniProgramMsg {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Req */
    public static class Req extends BaseReq {
        public static final int LENGTH_LIMIT = 1024;
        public static final String TAG = "MicroMsg.SDK.SubscribeMessage.Req";
        public String miniProgramAppId;

        public Req() {
        }

        public Req(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str = this.miniProgramAppId;
            if (str != null && str.length() != 0) {
                return true;
            }
            Log.m8651e("MicroMsg.SDK.SubscribeMessage.Req", "checkArgs fail, miniProgramAppId is null");
            return false;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.miniProgramAppId = bundle.getString("_wxapi_subscribeminiprogram_req_miniprogramappid");
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 23;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_subscribeminiprogram_req_miniprogramappid", this.miniProgramAppId);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Resp */
    public static class Resp extends BaseResp {
        public static final String TAG = "MicroMsg.SDK.SubscribeMessage.Resp";
        public String nickname;
        public String unionId;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.unionId = bundle.getString("_wxapi_subscribeminiprogram_resp_unionId");
            this.nickname = bundle.getString("_wxapi_subscribeminiprogram_resp_nickname");
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 23;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_subscribeminiprogram_resp_unionId", this.unionId);
            bundle.putString("_wxapi_subscribeminiprogram_resp_nickname", this.nickname);
        }
    }
}
