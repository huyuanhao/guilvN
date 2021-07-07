package com.huawei.hms.support.api.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.AbstractC1160c;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.GetTagsResp;
import com.huawei.hms.support.api.push.HmsPushConst;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.C1191c;
import com.huawei.hms.support.log.C1202a;

public class GetTagsPendingResultImpl extends AbstractC1160c<GetTagResult, GetTagsResp> {

    /* renamed from: a */
    public ApiClient f1209a;

    public GetTagsPendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        super(apiClient, str, iMessageEntity);
        this.f1209a = apiClient;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.huawei.hms.support.api.entity.push.GetTagsResp */
    /* JADX WARN: Multi-variable type inference failed */
    public GetTagResult onComplete(GetTagsResp getTagsResp) {
        GetTagResult getTagResult = new GetTagResult();
        try {
            getTagsResp.setTags(new C1191c(this.f1209a.getContext(), "tags_info").mo15694a());
            getTagResult.setTagsRes(getTagsResp);
            getTagResult.setStatus(Status.SUCCESS);
        } catch (Exception e) {
            C1202a.m1320d("GetTagsPendingResultImpl", "get tags failed, error:" + e.getMessage());
            getTagResult.setTagsRes(getTagsResp);
            getTagResult.setStatus(new Status(HmsPushConst.ErrorCode.REPORT_SYSTEM_ERROR));
        }
        return getTagResult;
    }
}
