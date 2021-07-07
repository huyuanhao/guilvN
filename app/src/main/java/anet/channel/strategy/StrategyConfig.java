package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.utils.C0209c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyConfig implements Serializable {
    public static final String NO_RESULT = "No_Result";

    /* renamed from: a */
    public SerialLruCache<String, String> f342a = null;

    /* renamed from: b */
    public Map<String, String> f343b = null;

    /* renamed from: c */
    public transient StrategyInfoHolder f344c = null;

    /* renamed from: a */
    public void mo3674a(StrategyInfoHolder strategyInfoHolder) {
        this.f344c = strategyInfoHolder;
    }

    /* renamed from: b */
    public String mo3676b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f343b.get(str);
    }

    /* renamed from: a */
    public void mo3673a() {
        if (this.f342a == null) {
            this.f342a = new SerialLruCache<>(256);
        }
        if (this.f343b == null) {
            this.f343b = new ConcurrentHashMap();
        }
    }

    /* renamed from: a */
    public void mo3675a(C0198l.C0202d dVar) {
        if (dVar.f436b != null) {
            synchronized (this) {
                TreeMap treeMap = null;
                for (int i = 0; i < dVar.f436b.length; i++) {
                    C0198l.C0200b bVar = dVar.f436b[i];
                    if (bVar.f431j) {
                        this.f342a.remove(bVar.f422a);
                    } else if (bVar.f425d != null) {
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                        }
                        treeMap.put(bVar.f422a, bVar.f425d);
                    } else {
                        if ("http".equalsIgnoreCase(bVar.f424c) || "https".equalsIgnoreCase(bVar.f424c)) {
                            this.f342a.put(bVar.f422a, bVar.f424c);
                        } else {
                            this.f342a.put(bVar.f422a, NO_RESULT);
                        }
                        if (!TextUtils.isEmpty(bVar.f426e)) {
                            this.f343b.put(bVar.f422a, bVar.f426e);
                        } else {
                            this.f343b.remove(bVar.f422a);
                        }
                    }
                }
                if (treeMap != null) {
                    for (Map.Entry entry : treeMap.entrySet()) {
                        String str = (String) entry.getValue();
                        if (this.f342a.containsKey(str)) {
                            this.f342a.put(entry.getKey(), this.f342a.get(str));
                        } else {
                            this.f342a.put(entry.getKey(), NO_RESULT);
                        }
                    }
                }
            }
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.StrategyConfig", "", null, "SchemeMap", this.f342a.toString());
                ALog.m287d("awcn.StrategyConfig", "", null, "UnitMap", this.f343b.toString());
            }
        }
    }

    /* renamed from: a */
    public String mo3672a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !C0209c.m283c(str)) {
            return null;
        }
        synchronized (this.f342a) {
            str2 = this.f342a.get(str);
            if (str2 == null) {
                this.f342a.put(str, NO_RESULT);
            }
        }
        if (str2 == null) {
            this.f344c.mo3681d().mo3692a(str, false);
        } else if (NO_RESULT.equals(str2)) {
            return null;
        }
        return str2;
    }
}
