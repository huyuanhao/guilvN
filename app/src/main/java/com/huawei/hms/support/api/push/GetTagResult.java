package com.huawei.hms.support.api.push;

import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.entity.push.GetTagsResp;
import java.util.Map;

public class GetTagResult extends Result {
    public GetTagsResp resp = null;

    public Map<String, String> getTags() {
        GetTagsResp getTagsResp = this.resp;
        if (getTagsResp != null) {
            return getTagsResp.getTags();
        }
        return null;
    }

    public GetTagsResp getTagsRes() {
        return this.resp;
    }

    public void setTagsRes(GetTagsResp getTagsResp) {
        this.resp = getTagsResp;
    }
}
