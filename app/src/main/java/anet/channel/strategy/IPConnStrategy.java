package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C0198l;
import java.io.Serializable;

public class IPConnStrategy implements IConnStrategy, Serializable {
    public static final int SOURCE_AMDC = 0;
    public static final int SOURCE_CUSTOMIZED = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IP_TO_HOST = -1;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_STATIC_BANDWITDH = 0;

    /* renamed from: a */
    public volatile int f332a = 1;

    /* renamed from: b */
    public volatile int f333b = 1;

    /* renamed from: c */
    public transient boolean f334c;
    public volatile int cto;
    public volatile int heartbeat;

    /* renamed from: ip */
    public final String f335ip;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;

    public IPConnStrategy(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5) {
        this.f335ip = str;
        this.port = i;
        this.protocol = connProtocol;
        this.cto = i2;
        this.rto = i3;
        this.retry = i4;
        this.heartbeat = i5;
    }

    /* renamed from: a */
    public static IPConnStrategy m201a(String str, C0198l.C0199a aVar) {
        ConnProtocol valueOf = ConnProtocol.valueOf(aVar);
        if (valueOf == null) {
            return null;
        }
        return m200a(str, aVar.f414a, valueOf, aVar.f416c, aVar.f417d, aVar.f418e, aVar.f419f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IPConnStrategy)) {
            return false;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
        if (this.port != iPConnStrategy.port || !this.f335ip.equals(iPConnStrategy.f335ip) || !this.protocol.equals(iPConnStrategy.protocol)) {
            return false;
        }
        return true;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.cto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.heartbeat;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f335ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f333b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f332a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.port;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.protocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.rto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.retry;
    }

    public int getUniqueId() {
        return hashCode();
    }

    public int hashCode() {
        return ((((527 + this.f335ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        sb.append(this.f335ip);
        if (this.f332a == 0) {
            sb.append("(*)");
        }
        sb.append(' ');
        sb.append(this.port);
        sb.append(' ');
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static IPConnStrategy m200a(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5) {
        if (TextUtils.isEmpty(str) || connProtocol == null || i <= 0) {
            return null;
        }
        return new IPConnStrategy(str, i, connProtocol, i2, i3, i4, i5);
    }
}
