package anet.channel.strategy;

/* renamed from: anet.channel.strategy.e */
public class RunnableC0191e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f398a;

    /* renamed from: b */
    public final /* synthetic */ StrategyInfoHolder f399b;

    public RunnableC0191e(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f399b = strategyInfoHolder;
        this.f398a = str;
    }

    public void run() {
        this.f399b.mo3678a(this.f398a, true);
    }
}
