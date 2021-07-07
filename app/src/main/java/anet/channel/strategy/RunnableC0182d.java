package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import java.io.File;

/* renamed from: anet.channel.strategy.d */
public class RunnableC0182d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f372a;

    /* renamed from: b */
    public final /* synthetic */ StrategyInfoHolder f373b;

    public RunnableC0182d(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f373b = strategyInfoHolder;
        this.f372a = str;
    }

    public void run() {
        try {
            ALog.m290i("awcn.StrategyInfoHolder", "start loading strategy files", null, new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                ALog.m290i("awcn.StrategyInfoHolder", "load strategy async", null, new Object[0]);
                if (!TextUtils.isEmpty(this.f372a)) {
                    this.f373b.mo3678a(this.f372a, true);
                }
                StrategyConfig strategyConfig = (StrategyConfig) C0204m.m266a("StrategyConfig", null);
                if (strategyConfig != null) {
                    strategyConfig.mo3673a();
                    strategyConfig.mo3674a(this.f373b);
                    synchronized (this.f373b) {
                        this.f373b.f346b = strategyConfig;
                    }
                }
            }
            File[] b = C0204m.m271b();
            if (b != null) {
                int i = 0;
                for (int i2 = 0; i2 < b.length && i < 2; i2++) {
                    File file = b[i2];
                    if (!file.isDirectory()) {
                        String name = file.getName();
                        if (!name.equals(this.f372a) && !name.startsWith("StrategyConfig")) {
                            this.f373b.mo3678a(name, false);
                            i++;
                        }
                    }
                }
                ALog.m290i("awcn.StrategyInfoHolder", "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Exception unused) {
        }
    }
}
