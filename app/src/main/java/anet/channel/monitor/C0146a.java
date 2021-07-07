package anet.channel.monitor;

import anet.channel.util.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.monitor.a */
public class C0146a {

    /* renamed from: a */
    public static volatile C0146a f181a;

    /* renamed from: b */
    public Map<INetworkQualityChangeListener, C0152f> f182b = new ConcurrentHashMap();

    /* renamed from: c */
    public C0152f f183c = new C0152f();

    /* renamed from: a */
    public static C0146a m96a() {
        if (f181a == null) {
            synchronized (C0146a.class) {
                if (f181a == null) {
                    f181a = new C0146a();
                }
            }
        }
        return f181a;
    }

    /* renamed from: a */
    public void mo3509a(INetworkQualityChangeListener iNetworkQualityChangeListener, C0152f fVar) {
        if (iNetworkQualityChangeListener == null) {
            ALog.m289e("BandWidthListenerHelp", "listener is null", null, new Object[0]);
        } else if (fVar == null) {
            this.f183c.f216b = System.currentTimeMillis();
            this.f182b.put(iNetworkQualityChangeListener, this.f183c);
        } else {
            fVar.f216b = System.currentTimeMillis();
            this.f182b.put(iNetworkQualityChangeListener, fVar);
        }
    }

    /* renamed from: a */
    public void mo3508a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        this.f182b.remove(iNetworkQualityChangeListener);
    }

    /* renamed from: a */
    public void mo3507a(double d) {
        boolean a;
        for (Map.Entry<INetworkQualityChangeListener, C0152f> entry : this.f182b.entrySet()) {
            INetworkQualityChangeListener key = entry.getKey();
            C0152f value = entry.getValue();
            if (!(key == null || value == null || value.mo3520b() || value.f215a == (a = value.mo3519a(d)))) {
                value.f215a = a;
                key.onNetworkQualityChanged(a ? NetworkSpeed.Slow : NetworkSpeed.Fast);
            }
        }
    }
}
