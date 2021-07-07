package org.android.agoo.control;

import android.os.RemoteException;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;

/* renamed from: org.android.agoo.control.f */
public class RunnableC4799f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AgooFactory.ServiceConnectionC4792a f13457a;

    public RunnableC4799f(AgooFactory.ServiceConnectionC4792a aVar) {
        this.f13457a = aVar;
    }

    public void run() {
        try {
            ALog.m7597d(AgooFactory.TAG, "onConnected running tid:" + Thread.currentThread().getId(), new Object[0]);
            this.f13457a.f13438d.doSend(this.f13457a.f13436b);
            ALog.m7597d(AgooFactory.TAG, "send finish. close this connection", new Object[0]);
        } catch (RemoteException e) {
            ALog.m7598e(AgooFactory.TAG, "send error", e, new Object[0]);
            ALog.m7597d(AgooFactory.TAG, "send finish. close this connection", new Object[0]);
        } catch (Throwable th) {
            ALog.m7597d(AgooFactory.TAG, "send finish. close this connection", new Object[0]);
            this.f13457a.f13438d = null;
            AgooFactory.mContext.unbindService(this.f13457a.f13439e);
            throw th;
        }
        this.f13457a.f13438d = null;
        AgooFactory.mContext.unbindService(this.f13457a.f13439e);
    }
}
