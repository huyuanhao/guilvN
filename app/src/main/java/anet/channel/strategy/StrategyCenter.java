package anet.channel.strategy;

public class StrategyCenter {
    public static volatile IStrategyInstance instance;

    public static IStrategyInstance getInstance() {
        if (instance == null) {
            synchronized (StrategyCenter.class) {
                if (instance == null) {
                    instance = new C0193g();
                }
            }
        }
        return instance;
    }

    public static void setInstance(IStrategyInstance iStrategyInstance) {
        instance = iStrategyInstance;
    }
}
