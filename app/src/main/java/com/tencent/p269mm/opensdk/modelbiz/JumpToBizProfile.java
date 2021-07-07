package com.tencent.p269mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.JumpToBizProfile */
public class JumpToBizProfile {
    public static final int JUMP_TO_HARD_WARE_BIZ_PROFILE = 1;
    public static final int JUMP_TO_NORMAL_BIZ_PROFILE = 0;

    /* renamed from: com.tencent.mm.opensdk.modelbiz.JumpToBizProfile$Req */
    public static class Req extends BaseReq {
        public static final int EXT_MSG_LENGTH = 1024;
        public static final String TAG = "MicroMsg.SDK.JumpToBizProfile.Req";
        public String extMsg;
        public int profileType = 0;
        public String toUserName;

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            String str2;
            String str3 = this.toUserName;
            if (str3 == null || str3.length() == 0) {
                str = "checkArgs fail, toUserName is invalid";
            } else {
                String str4 = this.extMsg;
                if (str4 != null && str4.length() > 1024) {
                    str = "ext msg is not null, while the length exceed 1024 bytes";
                } else if (this.profileType != 1 || ((str2 = this.extMsg) != null && str2.length() != 0)) {
                    return true;
                } else {
                    str = "scene is jump to hardware profile, while extmsg is null";
                }
            }
            Log.m8651e(TAG, str);
            return false;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.toUserName = bundle.getString("_wxapi_jump_to_biz_profile_req_to_user_name");
            this.extMsg = bundle.getString("_wxapi_jump_to_biz_profile_req_ext_msg");
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 7;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_jump_to_biz_profile_req_to_user_name", this.toUserName);
            bundle.putString("_wxapi_jump_to_biz_profile_req_ext_msg", this.extMsg);
            bundle.putInt("_wxapi_jump_to_biz_profile_req_scene", 0);
            bundle.putInt("_wxapi_jump_to_biz_profile_req_profile_type", this.profileType);
        }
    }
}
