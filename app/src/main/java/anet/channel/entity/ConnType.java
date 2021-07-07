package anet.channel.entity;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.ConnProtocol;
import java.util.HashMap;
import java.util.Map;

public class ConnType {
    public static final String H2S = "h2s";
    public static ConnType HTTP = new ConnType("http");
    public static final String HTTP2 = "http2";
    public static ConnType HTTPS = new ConnType("https");
    public static final String PK_ACS = "acs";
    public static final String PK_AUTO = "auto";
    public static final String PK_CDN = "cdn";
    public static final String PK_OPEN = "open";
    public static final String QUIC = "quic";
    public static final String QUIC_PLAIN = "quicplain";
    public static final String RTT_0 = "0rtt";
    public static final String RTT_1 = "1rtt";
    public static final String SPDY = "spdy";
    public static Map<ConnProtocol, ConnType> connTypeMap = new HashMap();
    public String name = "";
    public String publicKey;
    public int spdyProtocol;

    @Deprecated
    public enum TypeLevel {
        SPDY,
        HTTP
    }

    public ConnType(String str) {
        this.name = str;
    }

    public static int compare(ConnType connType, ConnType connType2) {
        return connType.getPriority() - connType2.getPriority();
    }

    private int getPriority() {
        int i = this.spdyProtocol;
        if ((i & 8) != 0) {
            return 0;
        }
        return (i & 2) != 0 ? 1 : 2;
    }

    public static ConnType valueOf(ConnProtocol connProtocol) {
        if (connProtocol == null) {
            return null;
        }
        if ("http".equalsIgnoreCase(connProtocol.protocol)) {
            return HTTP;
        }
        if ("https".equalsIgnoreCase(connProtocol.protocol)) {
            return HTTPS;
        }
        synchronized (connTypeMap) {
            if (connTypeMap.containsKey(connProtocol)) {
                return connTypeMap.get(connProtocol);
            }
            ConnType connType = new ConnType(connProtocol.toString());
            connType.publicKey = connProtocol.publicKey;
            if (HTTP2.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol |= 8;
            } else if (SPDY.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol |= 2;
            } else if (H2S.equals(connProtocol.protocol)) {
                connType.spdyProtocol = 40;
            } else if (QUIC.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol = 12;
            } else if (QUIC_PLAIN.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol = 32780;
            }
            if (connType.spdyProtocol == 0) {
                return null;
            }
            if (!TextUtils.isEmpty(connProtocol.publicKey)) {
                connType.spdyProtocol |= 128;
                if (RTT_1.equalsIgnoreCase(connProtocol.rtt)) {
                    connType.spdyProtocol |= 8192;
                } else if (!RTT_0.equalsIgnoreCase(connProtocol.rtt)) {
                    return null;
                } else {
                    connType.spdyProtocol |= 4096;
                }
            }
            connTypeMap.put(connProtocol, connType);
            return connType;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ConnType)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.name.equals(((ConnType) obj).name);
    }

    public int getTnetConType() {
        return this.spdyProtocol;
    }

    public int getTnetPublicKey(boolean z) {
        if (PK_CDN.equals(this.publicKey)) {
            return 1;
        }
        if (GlobalAppRuntimeInfo.getEnv() == ENV.TEST) {
            return 0;
        }
        if (PK_OPEN.equals(this.publicKey)) {
            return z ? 11 : 10;
        }
        if (PK_ACS.equals(this.publicKey)) {
            return z ? 4 : 3;
        }
        return -1;
    }

    public int getType() {
        if (equals(HTTP) || equals(HTTPS)) {
            return C0133c.f156b;
        }
        return C0133c.f155a;
    }

    @Deprecated
    public TypeLevel getTypeLevel() {
        if (isHttpType()) {
            return TypeLevel.HTTP;
        }
        return TypeLevel.SPDY;
    }

    public boolean isH2S() {
        return this.spdyProtocol == 40;
    }

    public boolean isHttpType() {
        return equals(HTTP) || equals(HTTPS);
    }

    public boolean isPublicKeyAuto() {
        return "auto".equals(this.publicKey);
    }

    public boolean isQuic() {
        return (this.spdyProtocol & 4) != 0;
    }

    public boolean isSSL() {
        int i = this.spdyProtocol;
        return (i & 128) != 0 || (i & 32) != 0 || i == 12 || equals(HTTPS);
    }

    public String toString() {
        return this.name;
    }
}
