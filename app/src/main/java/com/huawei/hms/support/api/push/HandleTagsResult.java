package com.huawei.hms.support.api.push;

import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.entity.push.TagsResp;

public class HandleTagsResult extends Result {
    public TagsResp resp;

    public TagsResp getTagsRes() {
        return this.resp;
    }

    public void setTagsRes(TagsResp tagsResp) {
        this.resp = tagsResp;
    }
}
