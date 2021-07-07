package com.taobao.accs.init;

import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.C3180l;

/* renamed from: com.taobao.accs.init.c */
public class RunnableC3127c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Launcher_InitAccs f6980a;

    public RunnableC3127c(Launcher_InitAccs launcher_InitAccs) {
        this.f6980a = launcher_InitAccs;
    }

    public void run() {
        ACCSManager.bindApp(Launcher_InitAccs.mContext, Launcher_InitAccs.mAppkey, Launcher_InitAccs.mTtid, Launcher_InitAccs.mAppReceiver);
        Launcher_InitAccs.mIsInited = true;
        C3180l.m7670a().mo37770b();
    }
}
