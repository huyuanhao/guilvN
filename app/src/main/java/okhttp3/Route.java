package okhttp3;

import com.p118pd.sdk.C7522o0Ooo0o;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

public final class Route {
    public final Address address;
    public final InetSocketAddress inetSocketAddress;
    public final Proxy proxy;

    public Route(Address address2, Proxy proxy2, InetSocketAddress inetSocketAddress2) {
        if (address2 == null) {
            throw new NullPointerException("address == null");
        } else if (proxy2 == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress2 != null) {
            this.address = address2;
            this.proxy = proxy2;
            this.inetSocketAddress = inetSocketAddress2;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public Address address() {
        return this.address;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            return route.address.equals(this.address) && route.proxy.equals(this.proxy) && route.inetSocketAddress.equals(this.inetSocketAddress);
        }
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.inetSocketAddress.hashCode();
    }

    public Proxy proxy() {
        return this.proxy;
    }

    public boolean requiresTunnel() {
        return this.address.sslSocketFactory != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress socketAddress() {
        return this.inetSocketAddress;
    }

    public String toString() {
        return "Route{" + this.inetSocketAddress + C7522o0Ooo0o.OooO0Oo;
    }
}
