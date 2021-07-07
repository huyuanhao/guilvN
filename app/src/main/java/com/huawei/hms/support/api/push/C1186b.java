package com.huawei.hms.support.api.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.entity.push.GetTagsReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.TagsReq;
import com.huawei.hms.support.api.push.p046b.AbstractC1187a;
import com.huawei.hms.support.api.push.p046b.p047a.AbstractC1192b;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.AbstractC1189a;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.C1191c;
import com.huawei.hms.support.log.C1202a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.support.api.push.b */
public class C1186b {
    /* renamed from: a */
    public static Map<String, String> m1257a(Context context, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        C1191c cVar = new C1191c(context, "tags_info");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (cVar.mo15701c(key)) {
                String b = cVar.mo15700b(key);
                if (!TextUtils.isEmpty(value) && value.equals(b)) {
                    C1202a.m1316a("PushTagManager", "tag has reported:" + entry);
                }
            }
            hashMap.put(key, value);
        }
        return hashMap;
    }

    /* renamed from: a */
    public PendingResult<HandleTagsResult> mo15693a(ApiClient apiClient, Map<String, String> map) throws PushException {
        if (map != null) {
            Context context = apiClient.getContext();
            C1202a.m1316a("PushTagManager", "set tags, pkgName:" + context.getPackageName());
            Map<String, String> a = m1257a(context, map);
            try {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry<String, String> entry : a.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tagKey", entry.getKey());
                    jSONObject.put("tagValue", entry.getValue());
                    jSONObject.put("opType", 1);
                    if (jSONObject.length() > 0) {
                        jSONArray.put(jSONObject);
                    }
                }
                if (jSONArray.length() > 0) {
                    C1202a.m1316a("PushTagManager", "begin to setTags: " + jSONArray.toString());
                    return m1256a(apiClient, jSONArray.toString(), 0, 2);
                }
                C1202a.m1316a("PushTagManager", "no tag need to upload");
                throw new PushException(PushException.EXCEPITON_TAGS_NULL);
            } catch (Exception e) {
                C1202a.m1316a("PushTagManager", "set tags exception," + e.toString());
                throw new PushException(e + PushException.EXCEPITON_SET_TAGS_FAILED);
            }
        } else {
            C1202a.m1316a("PushTagManager", PushException.EXCEPITON_TAGS_NULL);
            throw new PushException(PushException.EXCEPITON_TAGS_NULL);
        }
    }

    /* renamed from: a */
    public PendingResult<HandleTagsResult> mo15692a(ApiClient apiClient, List<String> list) throws PushException {
        C1202a.m1318b("PushTagManager", "invoke method: deleteTags");
        try {
            m1258a(list);
            Context context = apiClient.getContext();
            C1202a.m1316a("PushTagManager", "delete tags, pkgName:" + context.getPackageName());
            JSONArray a = AbstractC1189a.m1271a(list, context);
            if (a.length() > 0) {
                C1202a.m1316a("PushTagManager", "begin to deleTags: " + a.toString());
                return m1256a(apiClient, a.toString(), 0, 2);
            }
            C1202a.m1316a("PushTagManager", PushException.EXCEPITON_NO_TAG_NEED_DEL);
            throw new PushException(PushException.EXCEPITON_NO_TAG_NEED_DEL);
        } catch (Exception e) {
            C1202a.m1319c("PushTagManager", "delete tag error: " + e.getMessage());
            throw new PushException(PushException.EXCEPITON_DEL_TAGS_FAILED, e);
        }
    }

    /* renamed from: a */
    public PendingResult<GetTagResult> mo15691a(ApiClient apiClient) throws PushException {
        return new GetTagsPendingResultImpl(apiClient, PushNaming.getTags, new GetTagsReq());
    }

    /* renamed from: a */
    private PendingResult<HandleTagsResult> m1256a(ApiClient apiClient, String str, long j, int i) throws PushException {
        Context context = apiClient.getContext();
        String a = AbstractC1192b.m1284a(context, "push_client_self_info");
        if (!TextUtils.isEmpty(a)) {
            TagsReq tagsReq = new TagsReq();
            tagsReq.setContent(str);
            tagsReq.setCycle(j);
            tagsReq.setOperType(1);
            tagsReq.setPlusType(i);
            tagsReq.setToken(a);
            tagsReq.setPkgName(context.getPackageName());
            tagsReq.setApkVersion(AbstractC1187a.m1264b(context));
            return new HandleTagPendingResultImpl(apiClient, PushNaming.setTags, tagsReq);
        }
        throw new PushException(PushException.EXCEPITON_TOKEN_INVALID);
    }

    /* renamed from: a */
    private void m1258a(List<String> list) {
        if (list == null || list.isEmpty()) {
            C1202a.m1316a("PushTagManager", "the key list is null");
            throw new PushException(PushException.EXCEPITON_DEL_TAGS_LIST_NULL);
        }
    }
}
