package com.taobao.accs.init;

import android.app.Application;
import com.taobao.accs.client.C3103a;
import java.util.HashMap;

public class Launcher_InitAccsHTao extends Launcher_InitAccs {
    @Override // com.taobao.accs.init.Launcher_InitAccs
    public void init(Application application, HashMap<String, Object> hashMap) {
        Launcher_InitAccs.defaultAppkey = "";
        super.init(application, hashMap);
        C3103a.f6872b = "com.taobao.taobao.TaobaoIntentService";
    }
}
