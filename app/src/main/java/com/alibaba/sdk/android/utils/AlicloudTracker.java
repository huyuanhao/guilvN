package com.alibaba.sdk.android.utils;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class AlicloudTracker {

    /* renamed from: a */
    public C0330c f731a;

    /* renamed from: a */
    public String f732a;

    /* renamed from: b */
    public String f733b;

    /* renamed from: b */
    public Map<String, String> f734b = new HashMap();

    public AlicloudTracker(C0330c cVar, String str, String str2) {
        this.f731a = cVar;
        this.f732a = str;
        this.f733b = str2;
    }

    public void removeGlobalProperty(String str) {
        if (!TextUtils.isEmpty(str) && this.f734b.containsKey(str)) {
            this.f734b.remove(str);
        }
    }

    public void sendCustomHit(String str, long j, Map<String, String> map) {
        try {
            if (this.f731a != null) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.putAll(this.f734b);
                map.put("sdkId", this.f732a);
                map.put("sdkVersion", this.f733b);
                C0330c cVar = this.f731a;
                cVar.sendCustomHit(this.f732a + "_" + str, j, map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setGlobalProperty(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            if (this.f734b.containsKey(str)) {
                this.f734b.remove(str);
            }
            this.f734b.put(str, str2);
        }
    }

    public void sendCustomHit(String str, Map<String, String> map) {
        sendCustomHit(str, 0, map);
    }
}
