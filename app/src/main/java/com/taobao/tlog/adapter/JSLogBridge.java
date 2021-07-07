package com.taobao.tlog.adapter;

import android.taobao.windvane.jsbridge.WVApiPlugin;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WVPluginManager;
import android.taobao.windvane.jsbridge.WVResult;
import android.text.TextUtils;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import org.json.JSONException;
import org.json.JSONObject;

public class JSLogBridge extends WVApiPlugin {
    public static final String GETLOGLEVEL = "getLogLevel";
    public static final String LOGD = "logd";
    public static final String LOGE = "loge";
    public static final String LOGI = "logi";
    public static final String LOGV = "logv";
    public static final String LOGW = "logw";
    public static final String tlogBridgeName = "tlogBridge";

    public class LogBody {
        public String data;
        public String module;
        public String tag;

        public LogBody() {
        }
    }

    private LogBody getLog(String str) {
        try {
            LogBody logBody = new LogBody();
            JSONObject jSONObject = new JSONObject(str);
            logBody.tag = jSONObject.optString(CommonNetImpl.TAG, "jsTag");
            logBody.data = jSONObject.optString("content", "");
            return logBody;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void init() {
        WVPluginManager.registerPlugin(tlogBridgeName, JSLogBridge.class, true);
    }

    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        if (!TextUtils.isEmpty(str) && wVCallBackContext != null) {
            if (GETLOGLEVEL.equals(str)) {
                WVResult wVResult = new WVResult();
                wVResult.addData("logLevel", AdapterForTLog.getLogLevel());
                wVCallBackContext.success(wVResult);
                return true;
            } else if (LOGV.equals(str)) {
                logv(str2, wVCallBackContext);
                return true;
            } else if (LOGD.equals(str)) {
                logd(str2, wVCallBackContext);
                return true;
            } else if (LOGI.equals(str)) {
                logi(str2, wVCallBackContext);
                return true;
            } else if (LOGW.equals(str)) {
                logw(str2, wVCallBackContext);
                return true;
            } else if (LOGE.equals(str)) {
                loge(str2, wVCallBackContext);
                return true;
            }
        }
        return false;
    }

    public void logd(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logd(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void loge(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.loge(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logi(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logi(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logv(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logv(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logw(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logw(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }
}
