package anet.channel.strategy;

import anet.channel.strategy.dispatch.HttpDispatcher;
import java.util.ArrayList;
import java.util.List;

public class HttpDnsAdapter {

    public static final class HttpDnsOrigin {
        public final IConnStrategy connStrategy;

        public HttpDnsOrigin(IConnStrategy iConnStrategy) {
            this.connStrategy = iConnStrategy;
        }

        public boolean canWithSPDY() {
            String str = this.connStrategy.getProtocol().protocol;
            return !str.equalsIgnoreCase("http") && !str.equalsIgnoreCase("https");
        }

        public String getOriginIP() {
            return this.connStrategy.getIp();
        }

        public int getOriginPort() {
            return this.connStrategy.getPort();
        }

        public String toString() {
            return this.connStrategy.toString();
        }
    }

    public static String getIpByHttpDns(String str) {
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost.isEmpty()) {
            return null;
        }
        return connStrategyListByHost.get(0).getIp();
    }

    public static HttpDnsOrigin getOriginByHttpDns(String str) {
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost.isEmpty()) {
            return null;
        }
        return new HttpDnsOrigin(connStrategyListByHost.get(0));
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDns(String str) {
        return getOriginsByHttpDns(str, true);
    }

    public static void setHosts(ArrayList<String> arrayList) {
        HttpDispatcher.getInstance().addHosts(arrayList);
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDns(String str, boolean z) {
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost.isEmpty()) {
            return null;
        }
        ArrayList<HttpDnsOrigin> arrayList = new ArrayList<>(connStrategyListByHost.size());
        for (IConnStrategy iConnStrategy : connStrategyListByHost) {
            if (z || iConnStrategy.getIpSource() != 1) {
                arrayList.add(new HttpDnsOrigin(iConnStrategy));
            }
        }
        return arrayList;
    }
}
