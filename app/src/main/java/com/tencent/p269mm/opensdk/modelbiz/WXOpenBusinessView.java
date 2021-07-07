package com.tencent.p269mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.modelbase.BaseResp;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView */
public class WXOpenBusinessView {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req */
    public static final class Req extends BaseReq {
        public static final String TAG = "MicroMsg.SDK.WXOpenBusinessView.Req";
        public String businessType;
        public String extInfo;
        public String query;

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public final boolean checkArgs() {
            if (!C3392d.m8661b(this.businessType)) {
                return true;
            }
            Log.m8651e(TAG, "businessType is null");
            return false;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.businessType = bundle.getString("_openbusinessview_businessType");
            this.query = bundle.getString("_openbusinessview__query_info");
            this.extInfo = bundle.getString("_openbusinessview_extInfo");
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public final int getType() {
            return 26;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_openbusinessview_businessType", this.businessType);
            bundle.putString("_openbusinessview__query_info", this.query);
            bundle.putString("_openbusinessview_extInfo", this.extInfo);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp */
    public static final class Resp extends BaseResp {
        public String businessType;
        public String extMsg;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_openbusinessview_ext_msg");
            this.businessType = bundle.getString("_openbusinessview_business_type");
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public final int getType() {
            return 26;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseResp
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_openbusinessview_ext_msg", this.extMsg);
            bundle.putString("_openbusinessview_business_type", this.businessType);
        }
    }
}
