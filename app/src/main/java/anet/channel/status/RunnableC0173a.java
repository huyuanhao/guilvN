package anet.channel.status;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;

/* renamed from: anet.channel.status.a */
public final class RunnableC0173a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ NetworkStatusHelper.NetworkStatus f307a;

    public RunnableC0173a(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f307a = networkStatus;
    }

    public void run() {
        try {
            Iterator<NetworkStatusHelper.INetworkStatusChangeListener> it = NetworkStatusHelper.listeners.iterator();
            while (it.hasNext()) {
                NetworkStatusHelper.INetworkStatusChangeListener next = it.next();
                long currentTimeMillis = System.currentTimeMillis();
                next.onNetworkStatusChanged(this.f307a);
                if (System.currentTimeMillis() - currentTimeMillis > 500) {
                    ALog.m289e(NetworkStatusHelper.TAG, "call back cost too much time", null, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, next);
                }
            }
        } catch (Exception unused) {
        }
    }
}
