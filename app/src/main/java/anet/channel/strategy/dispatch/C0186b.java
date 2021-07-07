package anet.channel.strategy.dispatch;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C0207a;
import anet.channel.util.ALog;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: anet.channel.strategy.dispatch.b */
public class C0186b {
    public static final String TAG = "awcn.AmdcThreadPoolExecutor";

    /* renamed from: b */
    public static Random f391b = new Random();

    /* renamed from: a */
    public Map<String, Object> f392a;

    /* renamed from: anet.channel.strategy.dispatch.b$a */
    public class RunnableC0187a implements Runnable {

        /* renamed from: b */
        public Map<String, Object> f394b;

        public RunnableC0187a(Map<String, Object> map) {
            this.f394b = map;
        }

        public void run() {
            Map<String, Object> map;
            try {
                Map<String, Object> map2 = this.f394b;
                if (map2 == null) {
                    synchronized (C0186b.class) {
                        map = C0186b.this.f392a;
                        C0186b.this.f392a = null;
                    }
                    map2 = map;
                }
                if (NetworkStatusHelper.isConnected()) {
                    if (GlobalAppRuntimeInfo.getEnv() != map2.get("Env")) {
                        ALog.m292w(C0186b.TAG, "task's env changed", null, new Object[0]);
                    } else {
                        C0188c.m255a(C0190e.m258a(map2));
                    }
                }
            } catch (Exception e) {
                ALog.m288e(C0186b.TAG, "exec amdc task failed.", null, e, new Object[0]);
            }
        }

        public RunnableC0187a() {
        }
    }

    /* renamed from: a */
    public void mo3717a(Map<String, Object> map) {
        try {
            map.put("Env", GlobalAppRuntimeInfo.getEnv());
            synchronized (this) {
                if (this.f392a == null) {
                    this.f392a = map;
                    int nextInt = f391b.nextInt(3000) + 2000;
                    ALog.m290i(TAG, "merge amdc request", null, "delay", Integer.valueOf(nextInt));
                    C0207a.m277a(new RunnableC0187a(), (long) nextInt);
                } else {
                    Set set = (Set) this.f392a.get(DispatchConstants.HOSTS);
                    Set set2 = (Set) map.get(DispatchConstants.HOSTS);
                    if (map.get("Env") != this.f392a.get("Env")) {
                        this.f392a = map;
                    } else if (set.size() + set2.size() <= 40) {
                        set2.addAll(set);
                        this.f392a = map;
                    } else {
                        C0207a.m276a(new RunnableC0187a(map));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
