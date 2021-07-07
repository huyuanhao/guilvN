package com.huawei.hms.support.api.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.AbstractC1160c;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.TagsResp;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.AbstractC1189a;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.C1191c;
import com.huawei.hms.support.log.C1202a;
import org.json.JSONArray;
import org.json.JSONObject;

public class HandleTagPendingResultImpl extends AbstractC1160c<HandleTagsResult, TagsResp> {

    /* renamed from: a */
    public ApiClient f1211a;

    public HandleTagPendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        super(apiClient, str, iMessageEntity);
        this.f1211a = apiClient;
    }

    /* renamed from: a */
    public static void m1156a(ApiClient apiClient, String str) {
        if (apiClient == null) {
            C1202a.m1316a("HandleTagPendingResultImpl", "the client is null when adding or deleting tags from file.");
            return;
        }
        try {
            JSONArray a = AbstractC1189a.m1270a(str);
            if (a != null) {
                C1191c cVar = new C1191c(apiClient.getContext(), "tags_info");
                int length = a.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = a.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("tagKey");
                        int optInt = optJSONObject.optInt("opType");
                        if (1 == optInt) {
                            cVar.mo15698a(optString, (Object) optJSONObject.optString("tagValue"));
                        } else if (2 == optInt) {
                            cVar.mo15702d(optString);
                        }
                    }
                }
            }
        } catch (Exception e) {
            C1202a.m1319c("HandleTagPendingResultImpl", "when adding or deleting tags from file excepiton," + e.getMessage());
        }
    }

    public HandleTagsResult onComplete(TagsResp tagsResp) {
        C1202a.m1316a("HandleTagPendingResultImpl", "report tag completely, retcode is:" + tagsResp.getRetCode());
        if (907122001 == tagsResp.getRetCode()) {
            C1202a.m1316a("HandleTagPendingResultImpl", "report tag success.");
            m1156a(this.f1211a, tagsResp.getContent());
        }
        HandleTagsResult handleTagsResult = new HandleTagsResult();
        handleTagsResult.setStatus(new Status(tagsResp.getRetCode()));
        handleTagsResult.setTagsRes(tagsResp);
        return handleTagsResult;
    }
}
