package com.umeng.commonsdk.framework;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import org.json.JSONObject;

public class UMEnvelopeBuild {
    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        return C3516a.m9024a(context, jSONObject, jSONObject2);
    }

    public static String imprintProperty(Context context, String str, String str2) {
        return C3516a.m9023a(context, str, str2);
    }

    public static boolean isOnline(Context context) {
        return UMFrUtils.isOnline(context);
    }

    public static boolean isOnlineNew(Context context) {
        if (!C3516a.m9030b()) {
            return false;
        }
        return UMFrUtils.isOnline(context);
    }

    public static boolean isReadyBuild(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return C3516a.m9031b(context, uMBusinessType);
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        return C3516a.m9027a(context, uMBusinessType);
    }

    public static boolean isReadyBuildStateless() {
        return C3516a.m9026a();
    }

    public static long lastInstantBuildTime(Context context) {
        return C3516a.m9029b(context);
    }

    public static long lastSuccessfulBuildTime(Context context) {
        return C3516a.m9022a(context);
    }

    public static long maxDataSpace(Context context) {
        return C3516a.m9032c(context);
    }
}
