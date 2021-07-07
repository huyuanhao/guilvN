package anet.channel.strategy;

import java.util.Comparator;

/* renamed from: anet.channel.strategy.o */
public final class C0206o implements Comparator<StrategyCollection> {
    /* renamed from: a */
    public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        if (strategyCollection.f338c != strategyCollection2.f338c) {
            return (int) (strategyCollection.f338c - strategyCollection2.f338c);
        }
        return strategyCollection.f336a.compareTo(strategyCollection2.f336a);
    }
}
