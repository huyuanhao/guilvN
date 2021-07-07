package com.taobao.accs.init;

import android.app.Application;
import android.text.TextUtils;
import anet.channel.util.AppLifecycle;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.umeng.analytics.pro.C3416b;
import java.io.Serializable;
import java.util.HashMap;

public class Launcher_CrossActivityStopped implements Serializable {
    public void init(Application application, HashMap<String, Object> hashMap) {
        try {
            if (ALog.isPrintLog(ALog.Level.I)) {
                ALog.m7600i("Launcher_CrossActivityStopped", "onStopped", new Object[0]);
            }
            AppLifecycle.onBackground();
            if (!TextUtils.isEmpty(Launcher_InitAccs.mAppkey)) {
                if (Launcher_InitAccs.mContext != null) {
                    if (Launcher_InitAccs.mIsInited) {
                        ThreadPoolExecutorFactory.execute(new RunnableC3126b(this));
                        return;
                    }
                    return;
                }
            }
            ALog.m7599e("Launcher_CrossActivityStopped", "params null!!!", "appkey", Launcher_InitAccs.mAppkey, C3416b.f8433Q, Launcher_InitAccs.mContext);
        } catch (Throwable th) {
            ALog.m7598e("Launcher_CrossActivityStopped", "onStoped", th, new Object[0]);
            th.printStackTrace();
        }
    }
}
