package anet.channel.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyTemplate {
    public Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    /* renamed from: anet.channel.strategy.StrategyTemplate$a */
    public static class C0177a {

        /* renamed from: a */
        public static StrategyTemplate f363a = new StrategyTemplate();
    }

    public static StrategyTemplate getInstance() {
        return C0177a.f363a;
    }

    public ConnProtocol getConnProtocol(String str) {
        return this.templateMap.get(str);
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance instance = StrategyCenter.getInstance();
                if (instance instanceof C0193g) {
                    ((C0193g) instance).f403b.f347c.mo3700a(str, connProtocol);
                }
            } catch (Exception unused) {
            }
        }
    }
}
