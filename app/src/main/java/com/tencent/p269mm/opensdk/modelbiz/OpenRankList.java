package com.tencent.p269mm.opensdk.modelbiz;

import com.tencent.p269mm.opensdk.modelbase.BaseReq;

/* renamed from: com.tencent.mm.opensdk.modelbiz.OpenRankList */
public class OpenRankList {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.OpenRankList$Req */
    public static class Req extends BaseReq {
        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p269mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 11;
        }
    }
}
