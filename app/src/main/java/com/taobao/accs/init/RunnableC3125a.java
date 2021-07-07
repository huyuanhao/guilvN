package com.taobao.accs.init;

import com.taobao.accs.ACCSManager;

/* renamed from: com.taobao.accs.init.a */
public class RunnableC3125a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Launcher_CrossActivityStarted f6978a;

    public RunnableC3125a(Launcher_CrossActivityStarted launcher_CrossActivityStarted) {
        this.f6978a = launcher_CrossActivityStarted;
    }

    public void run() {
        ACCSManager.bindApp(Launcher_InitAccs.mContext, Launcher_InitAccs.mAppkey, Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
    }
}
