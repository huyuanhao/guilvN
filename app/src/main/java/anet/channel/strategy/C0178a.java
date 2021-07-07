package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.C0207a;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.strategy.a */
public class C0178a {

    /* renamed from: a */
    public final ConcurrentHashMap<String, List<IPConnStrategy>> f364a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final HashMap<String, Object> f365b = new HashMap<>();

    /* renamed from: a */
    public List mo3699a(String str) {
        Object obj;
        if (TextUtils.isEmpty(str) || !C0209c.m283c(str) || DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
            return Collections.EMPTY_LIST;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m287d("awcn.LocalDnsStrategyTable", "try resolve ip with local dns", null, "host", str);
        }
        List list = Collections.EMPTY_LIST;
        if (!this.f364a.containsKey(str)) {
            synchronized (this.f365b) {
                if (!this.f365b.containsKey(str)) {
                    obj = new Object();
                    this.f365b.put(str, obj);
                    m230a(str, obj);
                } else {
                    obj = this.f365b.get(str);
                }
            }
            if (obj != null) {
                try {
                    synchronized (obj) {
                        obj.wait(500);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
        List<IPConnStrategy> list2 = this.f364a.get(str);
        if (!(list2 == null || list2 == Collections.EMPTY_LIST)) {
            list = new ArrayList(list2);
        }
        ALog.m290i("awcn.LocalDnsStrategyTable", "get local strategy", null, "strategyList", list2);
        return list;
    }

    /* renamed from: a */
    public void mo3700a(String str, ConnProtocol connProtocol) {
        List<IPConnStrategy> list = this.f364a.get(str);
        if (!(list == null || list.isEmpty())) {
            for (IPConnStrategy iPConnStrategy : list) {
                if (iPConnStrategy.getProtocol().equals(connProtocol)) {
                    return;
                }
            }
            list.add(IPConnStrategy.m200a(list.get(0).getIp(), !(connProtocol.protocol.equalsIgnoreCase("https") || !TextUtils.isEmpty(connProtocol.publicKey)) ? 80 : Constants.PORT, connProtocol, 0, 0, 1, 45000));
            ALog.m290i("awcn.LocalDnsStrategyTable", "setProtocolForHost", null, "strategyList", list);
        }
    }

    /* renamed from: a */
    public void mo3701a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        List<IPConnStrategy> list;
        if (!connEvent.isSuccess && !TextUtils.isEmpty(str) && (list = this.f364a.get(str)) != null && list != Collections.EMPTY_LIST) {
            Iterator<IPConnStrategy> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == iConnStrategy) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                this.f364a.put(str, Collections.EMPTY_LIST);
            }
        }
    }

    /* renamed from: a */
    private void m230a(String str, Object obj) {
        C0207a.m276a(new RunnableC0179b(this, str, obj));
    }
}
