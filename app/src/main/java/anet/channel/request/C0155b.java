package anet.channel.request;

import anet.channel.util.ALog;
import java.util.concurrent.Future;

/* renamed from: anet.channel.request.b */
public class C0155b implements Cancelable {
    public static final C0155b NULL = new C0155b(null, null);

    /* renamed from: a */
    public final Future<?> f253a;

    /* renamed from: b */
    public final String f254b;

    public C0155b(Future<?> future, String str) {
        this.f253a = future;
        this.f254b = str;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        if (this.f253a != null) {
            ALog.m290i("awcn.FutureCancelable", "cancel request", this.f254b, new Object[0]);
            this.f253a.cancel(true);
        }
    }
}
