package com.jinhui365.util.webview;

import androidx.annotation.Keep;
import com.jinhui365.util.util.gson.GsonUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Keep
public class AppSendWebData implements Serializable {
    public Map<String, Object> data;

    /* renamed from: id */
    public String f1901id;
    public MessageBean message;

    public static class MessageBean implements Serializable {
        public int code = 0;
        public String message = "success";

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setMessage(String str) {
            this.message = str;
        }
    }

    public Map<String, Object> getData() {
        Map<String, Object> map = this.data;
        return (map == null || map.isEmpty()) ? new HashMap() : this.data;
    }

    public String getId() {
        return this.f1901id;
    }

    public MessageBean getMessage() {
        return this.message;
    }

    public String objectToJsonString() {
        return GsonUtil.toJson(this);
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    public void setId(String str) {
        this.f1901id = str;
    }

    public void setMessage(MessageBean messageBean) {
        this.message = messageBean;
    }
}
