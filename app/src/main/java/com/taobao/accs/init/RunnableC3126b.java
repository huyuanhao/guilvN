package com.taobao.accs.init;

import com.taobao.accs.ACCSManager;

/* renamed from: com.taobao.accs.init.b */
public class RunnableC3126b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Launcher_CrossActivityStopped f6979a;

    public RunnableC3126b(Launcher_CrossActivityStopped launcher_CrossActivityStopped) {
        this.f6979a = launcher_CrossActivityStopped;
    }

    public void run() {
        ACCSManager.bindApp(Launcher_InitAccs.mContext, Launcher_InitAccs.mAppkey, Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
    }
}
