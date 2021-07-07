package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

public class HttpDispatcher {

    /* renamed from: a */
    public CopyOnWriteArraySet<IDispatchEventListener> f374a;

    /* renamed from: b */
    public C0186b f375b;

    /* renamed from: c */
    public volatile boolean f376c;

    /* renamed from: d */
    public Set<String> f377d;

    /* renamed from: e */
    public Set<String> f378e;

    /* renamed from: f */
    public AtomicBoolean f379f;

    public interface IDispatchEventListener {
        void onEvent(DispatchEvent dispatchEvent);
    }

    /* renamed from: anet.channel.strategy.dispatch.HttpDispatcher$a */
    public static class C0184a {

        /* renamed from: a */
        public static HttpDispatcher f380a = new HttpDispatcher();
    }

    public static HttpDispatcher getInstance() {
        return C0184a.f380a;
    }

    public static void setInitHosts(List<String> list) {
        if (list != null) {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    /* renamed from: a */
    public void mo3707a(DispatchEvent dispatchEvent) {
        Iterator<IDispatchEventListener> it = this.f374a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEvent(dispatchEvent);
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void addHosts(List<String> list) {
        if (list != null) {
            this.f378e.addAll(list);
            this.f377d.clear();
        }
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        this.f374a.add(iDispatchEventListener);
    }

    public synchronized Set<String> getInitHosts() {
        m237a();
        return new HashSet(this.f378e);
    }

    public boolean isInitHostsChanged(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean contains = this.f377d.contains(str);
        if (!contains) {
            this.f377d.add(str);
        }
        return !contains;
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        this.f374a.remove(iDispatchEventListener);
    }

    public void sendAmdcRequest(Set<String> set, int i) {
        if (!this.f376c || set == null || set.isEmpty()) {
            ALog.m289e("awcn.HttpDispatcher", "invalid parameter", null, new Object[0]);
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m290i("awcn.HttpDispatcher", "sendAmdcRequest", null, DispatchConstants.HOSTS, set.toString());
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DispatchConstants.HOSTS, set);
        hashMap.put(DispatchConstants.CONFIG_VERSION, String.valueOf(i));
        this.f375b.mo3717a(hashMap);
    }

    public void setEnable(boolean z) {
        this.f376c = z;
    }

    public void switchENV() {
        this.f377d.clear();
        this.f378e.clear();
        this.f379f.set(false);
    }

    public HttpDispatcher() {
        this.f374a = new CopyOnWriteArraySet<>();
        this.f375b = new C0186b();
        this.f376c = true;
        this.f377d = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f378e = new TreeSet();
        this.f379f = new AtomicBoolean();
        m237a();
    }

    /* renamed from: a */
    private void m237a() {
        if (!this.f379f.get() && GlobalAppRuntimeInfo.getContext() != null && this.f379f.compareAndSet(false, true)) {
            this.f378e.add(DispatchConstants.getAmdcServerDomain());
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                this.f378e.addAll(Arrays.asList(DispatchConstants.initHostArray));
            }
        }
    }
}
