package com.taobao.accs.init;

import android.app.Application;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;

public class Launcher_Login implements Serializable {
    public void init(Application application, HashMap<String, Object> hashMap) {
        ALog.m7600i("Launcher_Login", "login", new Object[0]);
        ThreadPoolExecutorFactory.execute(new RunnableC3129e(this, hashMap, application));
    }
}
