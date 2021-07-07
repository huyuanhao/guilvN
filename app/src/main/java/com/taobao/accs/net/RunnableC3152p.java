package com.taobao.accs.net;

import android.text.TextUtils;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.p */
public class RunnableC3152p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3145j f7069a;

    public RunnableC3152p(C3145j jVar) {
        this.f7069a = jVar;
    }

    public void run() {
        try {
            if (this.f7069a.f7012d != null && !TextUtils.isEmpty(this.f7069a.mo37667i())) {
                ALog.m7600i(this.f7069a.mo37662d(), "mTryStartServiceRunable bindapp", new Object[0]);
                this.f7069a.mo37669k();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
