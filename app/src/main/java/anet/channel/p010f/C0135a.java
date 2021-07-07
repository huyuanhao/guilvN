package anet.channel.p010f;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.f.a */
public class C0135a {

    /* renamed from: a */
    public static String f160a;

    /* renamed from: b */
    public static HashMap<String, Long> f161b = new HashMap<>();

    /* renamed from: c */
    public static AtomicBoolean f162c = new AtomicBoolean(false);

    /* renamed from: d */
    public static IStrategyFilter f163d = new C0136b();

    /* renamed from: e */
    public static AtomicInteger f164e = new AtomicInteger(1);

    /* renamed from: a */
    public static void m91a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (!AwcnConfig.isQuicEnable()) {
            ALog.m290i("awcn.QuicConnDetector", "startDetect", null, "quic global config close.");
        } else if (NetworkStatusHelper.isConnected()) {
            if (TextUtils.isEmpty(f160a)) {
                ALog.m289e("awcn.QuicConnDetector", "startDetect", null, "host is null");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = f161b.get(networkStatus.getType());
            if (l == null || l.longValue() + 1800000 <= currentTimeMillis) {
                List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(f160a, f163d);
                if (connStrategyListByHost.isEmpty()) {
                    ALog.m289e("awcn.QuicConnDetector", "startDetect", null, "quic strategy is null.");
                    return;
                }
                f161b.put(networkStatus.getType(), Long.valueOf(currentTimeMillis));
                ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC0137c(connStrategyListByHost), ThreadPoolExecutorFactory.Priority.LOW);
            }
        }
    }

    /* renamed from: a */
    public static void m90a() {
        ALog.m289e("awcn.QuicConnDetector", "registerListener", null, new Object[0]);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
        f160a = defaultSharedPreferences.getString("quic_detector_host", "");
        NetworkStatusHelper.addStatusChangeListener(new C0139e());
        StrategyCenter.getInstance().registerListener(new C0140f(defaultSharedPreferences));
    }
}
