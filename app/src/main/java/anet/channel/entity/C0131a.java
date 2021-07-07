package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;
import com.p118pd.sdk.C7486o0OoO0oO;

/* renamed from: anet.channel.entity.a */
public class C0131a {

    /* renamed from: a */
    public final IConnStrategy f147a;

    /* renamed from: b */
    public int f148b = 0;

    /* renamed from: c */
    public int f149c = 0;

    /* renamed from: d */
    public String f150d;

    /* renamed from: e */
    public String f151e;

    public C0131a(String str, String str2, IConnStrategy iConnStrategy) {
        this.f147a = iConnStrategy;
        this.f150d = str;
        this.f151e = str2;
    }

    /* renamed from: a */
    public String mo3484a() {
        IConnStrategy iConnStrategy = this.f147a;
        if (iConnStrategy != null) {
            return iConnStrategy.getIp();
        }
        return null;
    }

    /* renamed from: b */
    public int mo3485b() {
        IConnStrategy iConnStrategy = this.f147a;
        if (iConnStrategy != null) {
            return iConnStrategy.getPort();
        }
        return 0;
    }

    /* renamed from: c */
    public ConnType mo3486c() {
        IConnStrategy iConnStrategy = this.f147a;
        if (iConnStrategy != null) {
            return ConnType.valueOf(iConnStrategy.getProtocol());
        }
        return ConnType.HTTP;
    }

    /* renamed from: d */
    public int mo3487d() {
        IConnStrategy iConnStrategy = this.f147a;
        if (iConnStrategy == null || iConnStrategy.getConnectionTimeout() == 0) {
            return C7486o0OoO0oO.OooO0o;
        }
        return this.f147a.getConnectionTimeout();
    }

    /* renamed from: e */
    public int mo3488e() {
        IConnStrategy iConnStrategy = this.f147a;
        if (iConnStrategy == null || iConnStrategy.getReadTimeout() == 0) {
            return C7486o0OoO0oO.OooO0o;
        }
        return this.f147a.getReadTimeout();
    }

    /* renamed from: f */
    public String mo3489f() {
        return this.f150d;
    }

    /* renamed from: g */
    public int mo3490g() {
        IConnStrategy iConnStrategy = this.f147a;
        if (iConnStrategy != null) {
            return iConnStrategy.getHeartbeat();
        }
        return 45000;
    }

    /* renamed from: h */
    public String mo3491h() {
        return this.f151e;
    }

    public String toString() {
        return "ConnInfo [ip=" + mo3484a() + ",port=" + mo3485b() + ",type=" + mo3486c() + ",hb" + mo3490g() + "]";
    }
}
