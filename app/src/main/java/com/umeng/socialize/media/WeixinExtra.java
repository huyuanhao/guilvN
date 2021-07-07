package com.umeng.socialize.media;

import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.handler.UMWXHandler;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.weixin.net.WXAuthUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class WeixinExtra {
    public static void isAccessTokenValid(String str, String str2, final UMAuthListener uMAuthListener) {
        final String str3 = "https://api.weixin.qq.com/sns/auth?access_token=" + str + "&openid=" + str2;
        new Thread(new Runnable() {
            /* class com.umeng.socialize.media.WeixinExtra.RunnableC39621 */

            public void run() {
                try {
                    final JSONObject jSONObject = new JSONObject(WXAuthUtils.request(str3));
                    QueuedWork.runInMain(new Runnable() {
                        /* class com.umeng.socialize.media.WeixinExtra.RunnableC39621.RunnableC39631 */

                        public void run() {
                            HashMap hashMap = new HashMap();
                            if (jSONObject.optInt(UMWXHandler.ERRORCODE, -1) == 0) {
                                hashMap.put("result", jSONObject.toString());
                                uMAuthListener.onComplete(SHARE_MEDIA.WEIXIN, 2, hashMap);
                                return;
                            }
                            uMAuthListener.onError(SHARE_MEDIA.WEIXIN, 2, new Throwable(jSONObject.toString()));
                        }
                    });
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        }).start();
    }
}
