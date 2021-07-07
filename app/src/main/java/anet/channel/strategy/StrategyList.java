package anet.channel.strategy;

import anet.channel.strategy.C0198l;
import anet.channel.strategy.utils.C0209c;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class StrategyList implements Serializable {

    /* renamed from: a */
    public List<IPConnStrategy> f351a = new ArrayList();

    /* renamed from: b */
    public Map<Integer, ConnHistoryItem> f352b = new SerialLruCache(40);

    /* renamed from: c */
    public boolean f353c = false;

    /* renamed from: d */
    public transient Comparator<IPConnStrategy> f354d = null;

    public interface Predicate<T> {
        boolean apply(T t);
    }

    public StrategyList() {
    }

    public void checkInit() {
        if (this.f351a == null) {
            this.f351a = new ArrayList();
        }
        if (this.f352b == null) {
            this.f352b = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.f352b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().mo3639d()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.f351a) {
            if (!this.f352b.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.f352b.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.f351a, m218a());
    }

    public List<IConnStrategy> getStrategyList() {
        if (this.f351a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = null;
        for (IPConnStrategy iPConnStrategy : this.f351a) {
            ConnHistoryItem connHistoryItem = this.f352b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem == null || !connHistoryItem.mo3638c()) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(iPConnStrategy);
            } else {
                ALog.m290i("awcn.StrategyList", "strategy ban!", null, "strategy", iPConnStrategy);
            }
        }
        return linkedList == null ? Collections.EMPTY_LIST : linkedList;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if ((iConnStrategy instanceof IPConnStrategy) && this.f351a.indexOf(iConnStrategy) != -1) {
            this.f352b.get(Integer.valueOf(((IPConnStrategy) iConnStrategy).getUniqueId())).mo3636a(connEvent.isSuccess);
            Collections.sort(this.f351a, this.f354d);
        }
    }

    public boolean shouldRefresh() {
        boolean z = true;
        boolean z2 = true;
        for (IPConnStrategy iPConnStrategy : this.f351a) {
            if (!this.f352b.get(Integer.valueOf(iPConnStrategy.getUniqueId())).mo3637b()) {
                if (iPConnStrategy.f332a == 0) {
                    z = false;
                }
                z2 = false;
            }
        }
        if ((!this.f353c || !z) && !z2) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f351a.toString();
    }

    public void update(C0198l.C0200b bVar) {
        for (IPConnStrategy iPConnStrategy : this.f351a) {
            iPConnStrategy.f334c = true;
        }
        int i = 0;
        for (int i2 = 0; i2 < bVar.f429h.length; i2++) {
            int i3 = 0;
            while (true) {
                String[] strArr = bVar.f427f;
                if (i3 >= strArr.length) {
                    break;
                }
                m220a(strArr[i3], 1, bVar.f429h[i2]);
                i3++;
            }
            if (bVar.f428g != null) {
                this.f353c = true;
                int i4 = 0;
                while (true) {
                    String[] strArr2 = bVar.f428g;
                    if (i4 >= strArr2.length) {
                        break;
                    }
                    m220a(strArr2[i4], 0, bVar.f429h[i2]);
                    i4++;
                }
            } else {
                this.f353c = false;
            }
        }
        if (bVar.f430i != null) {
            while (true) {
                C0198l.C0203e[] eVarArr = bVar.f430i;
                if (i >= eVarArr.length) {
                    break;
                }
                C0198l.C0203e eVar = eVarArr[i];
                String str = eVar.f443a;
                m220a(str, C0209c.m283c(str) ? -1 : 1, eVar.f444b);
                i++;
            }
        }
        ListIterator<IPConnStrategy> listIterator = this.f351a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f334c) {
                listIterator.remove();
            }
        }
        Collections.sort(this.f351a, m218a());
    }

    /* renamed from: a */
    private void m220a(String str, int i, C0198l.C0199a aVar) {
        int a = m217a(this.f351a, new C0196j(this, aVar, str, ConnProtocol.valueOf(aVar)));
        if (a != -1) {
            IPConnStrategy iPConnStrategy = this.f351a.get(a);
            iPConnStrategy.cto = aVar.f416c;
            iPConnStrategy.rto = aVar.f417d;
            iPConnStrategy.heartbeat = aVar.f419f;
            iPConnStrategy.f332a = i;
            iPConnStrategy.f333b = 0;
            iPConnStrategy.f334c = false;
            return;
        }
        IPConnStrategy a2 = IPConnStrategy.m201a(str, aVar);
        if (a2 != null) {
            a2.f332a = i;
            a2.f333b = 0;
            if (!this.f352b.containsKey(Integer.valueOf(a2.getUniqueId()))) {
                this.f352b.put(Integer.valueOf(a2.getUniqueId()), new ConnHistoryItem());
            }
            this.f351a.add(a2);
        }
    }

    public StrategyList(List<IPConnStrategy> list) {
        this.f351a = list;
    }

    /* renamed from: a */
    private Comparator m218a() {
        if (this.f354d == null) {
            this.f354d = new C0197k(this);
        }
        return this.f354d;
    }

    /* renamed from: a */
    public static <T> int m217a(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        int i = 0;
        Iterator<T> it = collection.iterator();
        while (it.hasNext() && !predicate.apply(it.next())) {
            i++;
        }
        if (i == collection.size()) {
            return -1;
        }
        return i;
    }
}
