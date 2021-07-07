package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;

/* renamed from: anet.channel.monitor.c */
public class C0149c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0147b f199a;

    public C0149c(C0147b bVar) {
        this.f199a = bVar;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        C0147b.m102a(this.f199a).mo3517a();
        C0147b.f189f = 0;
        this.f199a.mo3513d();
    }
}
