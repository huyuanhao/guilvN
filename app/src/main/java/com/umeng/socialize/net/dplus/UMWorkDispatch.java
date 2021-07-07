package com.umeng.socialize.net.dplus;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.dplus.cache.DplusCacheApi;
import com.umeng.socialize.net.dplus.cache.DplusCacheListener;
import com.umeng.socialize.utils.DeviceConfig;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import org.json.JSONException;
import org.json.JSONObject;

public class UMWorkDispatch {
    public static String URL = "umpx_share";

    public static JSONObject constructHeader(Context context, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                optJSONObject.put("s_sdk_v", "7.0.2");
                optJSONObject.put(CommonNetImpl.PCV, SocializeConstants.PROTOCOL_VERSON);
                optJSONObject.put("imei", DeviceConfig.getDeviceId(context));
            }
            jSONObject.put("header", optJSONObject);
        } catch (JSONException e) {
            SLog.error(e);
        }
        return jSONObject;
    }

    public static void sendEvent(final Context context, final int i, Object obj) {
        UMSLEnvelopeBuild.mContext = context;
        if (i == 24581) {
            DplusCacheApi.getInstance().saveFile(context, (JSONObject) obj, i, new DplusCacheListener() {
                /* class com.umeng.socialize.net.dplus.UMWorkDispatch.C39771 */

                @Override // com.umeng.socialize.net.dplus.cache.DplusCacheListener
                public void onResult(JSONObject jSONObject) {
                }
            });
        } else {
            DplusCacheApi.getInstance().saveFile(context, (JSONObject) obj, i, new DplusCacheListener() {
                /* class com.umeng.socialize.net.dplus.UMWorkDispatch.C39782 */

                @Override // com.umeng.socialize.net.dplus.cache.DplusCacheListener
                public void onResult(JSONObject jSONObject) {
                    JSONObject buildSLBaseHeader;
                    UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                    Context context = context;
                    if (context != null && (buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(context)) != null) {
                        JSONObject constructHeader = UMWorkDispatch.constructHeader(context, buildSLBaseHeader);
                        JSONObject readFileAsnc = DplusCacheApi.getInstance().readFileAsnc(context, i);
                        JSONObject jSONObject2 = null;
                        if (readFileAsnc != null && !TextUtils.isEmpty(readFileAsnc.toString())) {
                            jSONObject2 = uMSLEnvelopeBuild.buildSLEnvelope(context, constructHeader, readFileAsnc, UMWorkDispatch.URL);
                        }
                        if (jSONObject2 == null) {
                            SLog.m10856E(UmengText.NET.BODYNULL);
                        } else if (!jSONObject2.has("exception")) {
                            DplusCacheApi.getInstance().deleteFileAsnc(context);
                        } else if (jSONObject2.optInt("exception") != 101) {
                            DplusCacheApi.getInstance().deleteFileAsnc(context);
                        }
                    }
                }
            });
        }
    }
}
