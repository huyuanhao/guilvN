package com.jinhui365.template.view;

import android.content.Intent;
import android.os.Bundle;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.AbstractC8698oo0o00o;
import com.p118pd.sdk.C8651oo0OOooo;
import com.p118pd.sdk.C8700oo0o00oo;
import com.p118pd.sdk.C8701oo0o0O;
import com.p118pd.sdk.C8713oo0o0o;
import com.p118pd.sdk.C9054ooOoOo0;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;

public class MainTask implements AbstractC8698oo0o00o {
    public Class<?> activityClass = null;

    @Override // com.p118pd.sdk.AbstractC8698oo0o00o
    public void execute(C8700oo0o00oo oo0o00oo) {
        if (oo0o00oo.m20311OooO00o().getTaskOptions().containsKey("clazz")) {
            this.activityClass = getActivityClass((String) oo0o00oo.m20311OooO00o().getTaskOptions().get("clazz"));
        } else {
            this.activityClass = MainActivity.class;
        }
        Intent intent = new Intent(oo0o00oo.m20310OooO00o(), this.activityClass);
        Bundle bundle = new Bundle();
        Map<String, Object> taskOptions = oo0o00oo.m20311OooO00o().getTaskOptions();
        for (String str : taskOptions.keySet()) {
            bundle.putAll(C8701oo0o0O.OooO00o(bundle, str, taskOptions.get(str)));
        }
        for (String str2 : oo0o00oo.m20311OooO00o().getParams().keySet()) {
            bundle.putAll(C8701oo0o0O.OooO00o(bundle, str2, oo0o00oo.m20311OooO00o().getParams().get(str2)));
        }
        intent.addFlags(oo0o00oo.m20311OooO00o().getFlags());
        if (C9054ooOoOo0.OooO0Oo(bundle.getString(C8651oo0OOooo.OooO0o)) && "0".equals(bundle.getString(C8651oo0OOooo.OooO0o))) {
            intent.addFlags(603979776);
        }
        bundle.remove(C8713oo0o0o.f21884OooO00o);
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.remove(C8651oo0OOooo.OooO0O0);
        bundle2.remove(C8651oo0OOooo.OooO0OO);
        bundle2.remove("__notification_page_url");
        bundle2.remove("__notification_page_params");
        bundle2.remove("__from_url__");
        bundle2.remove(C8651oo0OOooo.OooO0o);
        bundle.putBundle(C8651oo0OOooo.OooO0OO, bundle2);
        if (C9054ooOoOo0.OooO0OO(bundle.getString("__EVENT_TYPE__"))) {
            bundle.putString("__EVENT_TYPE__", "push");
        }
        intent.putExtras(bundle);
        oo0o00oo.m20310OooO00o().startActivity(intent);
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "实例启动Task执行");
        hashMap.put("url", bundle.get(C8713oo0o0o.f21884OooO00o) + "");
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "execute");
        LogCollectorManager.sharedInstance().recordInfo(MainTask.class.getSimpleName(), hashMap);
    }

    public Class<?> getActivityClass(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "获取Activity反射类报错");
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getActivityClass");
            hashMap.put("message", e.getMessage());
            LogCollectorManager.sharedInstance().recordInfo(MainTask.class.getSimpleName(), hashMap);
            return null;
        }
    }
}
