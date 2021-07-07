package com.taobao.accs.init;

import android.app.Application;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3180l;
import com.taobao.accs.utl.C3190t;
import com.taobao.aranger.ARanger;
import java.io.Serializable;
import java.util.HashMap;

public class Launcher_InitAgooLifecycle implements Serializable {

    /* renamed from: a */
    public static final String f6977a = Launcher_InitAgooLifecycle.class.getSimpleName();

    public void init(Application application, HashMap<String, Object> hashMap) {
        ALog.m7600i(f6977a, "init", new Object[0]);
        GlobalClientInfo.f6858a = application.getApplicationContext();
        C3180l.m7670a().mo37769a(application);
        if (C3190t.m7707g()) {
            Constants.SDK_VERSION_CODE = 400;
            ARanger.init(application.getApplicationContext());
        }
    }
}
