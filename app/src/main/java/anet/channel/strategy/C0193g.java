package anet.channel.strategy;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.C0180c;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.dispatch.C0185a;
import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C0207a;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: anet.channel.strategy.g */
public class C0193g implements IStrategyInstance, HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    public boolean f402a = false;

    /* renamed from: b */
    public StrategyInfoHolder f403b = null;

    /* renamed from: c */
    public long f404c = 0;

    /* renamed from: d */
    public CopyOnWriteArraySet<IStrategyListener> f405d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    public IStrategyFilter f406e = new C0194h(this);

    @Override // anet.channel.strategy.IStrategyInstance
    public void forceRefreshStrategy(String str) {
        if (!m260a() && !TextUtils.isEmpty(str)) {
            ALog.m290i("awcn.StrategyCenter", "force refresh strategy", null, "host", str);
            this.f403b.mo3681d().mo3692a(str, true);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getCNameByHost(String str) {
        if (m260a() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f403b.mo3681d().getCnameByHost(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getClientIp() {
        if (m260a()) {
            return "";
        }
        return this.f403b.mo3681d().f357b;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str) {
        return getConnStrategyListByHost(str, this.f406e);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getFormalizeUrl(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            ALog.m289e("awcn.StrategyCenter", "url is invalid.", null, "URL", str);
            return null;
        }
        String urlString = parse.urlString();
        try {
            String schemeByHost = getSchemeByHost(parse.host(), parse.scheme());
            if (!schemeByHost.equalsIgnoreCase(parse.scheme())) {
                urlString = StringUtils.concatString(schemeByHost, Constants.COLON_SEPARATOR, str.substring(str.indexOf("//")));
            }
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.StrategyCenter", "", null, "raw", StringUtils.simplifyString(str, 128), "ret", StringUtils.simplifyString(urlString, 128));
            }
        } catch (Exception e) {
            ALog.m288e("awcn.StrategyCenter", "getFormalizeUrl failed", null, e, "raw", str);
        }
        return urlString;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    @Deprecated
    public String getSchemeByHost(String str) {
        return getSchemeByHost(str, null);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getUnitByHost(String str) {
        if (m260a()) {
            return null;
        }
        return this.f403b.f346b.mo3676b(str);
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void initialize(Context context) {
        if (!this.f402a && context != null) {
            try {
                ALog.m290i("awcn.StrategyCenter", "StrategyCenter initialize started.", null, new Object[0]);
                C0185a.m241a(context);
                C0204m.m268a(context);
                HttpDispatcher.getInstance().addListener(this);
                this.f403b = StrategyInfoHolder.m207a();
                this.f402a = true;
                ALog.m290i("awcn.StrategyCenter", "StrategyCenter initialize finished.", null, new Object[0]);
            } catch (Exception e) {
                ALog.m288e("awcn.StrategyCenter", "StrategyCenter initialize failed.", null, e, new Object[0]);
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if (!m260a() && iConnStrategy != null && (iConnStrategy instanceof IPConnStrategy)) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
            if (iPConnStrategy.f333b == 1) {
                this.f403b.f347c.mo3701a(str, iConnStrategy, connEvent);
            } else if (iPConnStrategy.f333b == 0) {
                this.f403b.mo3681d().mo3691a(str, iConnStrategy, connEvent);
            }
        }
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        if (dispatchEvent.eventType == 1 && this.f403b != null) {
            ALog.m287d("awcn.StrategyCenter", "receive amdc event", null, new Object[0]);
            C0198l.C0202d a = C0198l.m264a((JSONObject) dispatchEvent.extraObject);
            if (a != null) {
                this.f403b.mo3677a(a);
                saveData();
                Iterator<IStrategyListener> it = this.f405d.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onStrategyUpdated(a);
                    } catch (Exception e) {
                        ALog.m288e("awcn.StrategyCenter", "onStrategyUpdated failed", null, e, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void registerListener(IStrategyListener iStrategyListener) {
        ALog.m289e("awcn.StrategyCenter", "registerListener", null, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, this.f405d);
        if (iStrategyListener != null) {
            this.f405d.add(iStrategyListener);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void saveData() {
        ALog.m290i("awcn.StrategyCenter", "saveData", null, new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f404c > 30000) {
            this.f404c = currentTimeMillis;
            C0207a.m277a(new RunnableC0195i(this), 500);
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public synchronized void switchEnv() {
        C0204m.m267a();
        HttpDispatcher.getInstance().switchENV();
        if (this.f403b != null) {
            this.f403b.mo3679b();
            this.f403b = StrategyInfoHolder.m207a();
        }
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public void unregisterListener(IStrategyListener iStrategyListener) {
        ALog.m289e("awcn.StrategyCenter", "unregisterListener", null, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, this.f405d);
        this.f405d.remove(iStrategyListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m260a() {
        if (this.f403b != null) {
            return false;
        }
        ALog.m292w("StrategyCenter not initialized", null, "isInitialized", Boolean.valueOf(this.f402a));
        return true;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter) {
        if (TextUtils.isEmpty(str) || m260a()) {
            return Collections.EMPTY_LIST;
        }
        String cnameByHost = this.f403b.mo3681d().getCnameByHost(str);
        if (!TextUtils.isEmpty(cnameByHost)) {
            str = cnameByHost;
        }
        List queryByHost = this.f403b.mo3681d().queryByHost(str);
        if (queryByHost.isEmpty()) {
            queryByHost = this.f403b.f347c.mo3699a(str);
        }
        if (queryByHost.isEmpty() || iStrategyFilter == null) {
            ALog.m287d("getConnStrategyListByHost", null, "host", str, "result", queryByHost);
            return queryByHost;
        }
        boolean z = !AwcnConfig.isIpv6Enable() || (AwcnConfig.isIpv6BlackListEnable() && this.f403b.mo3681d().mo3693a(str, AwcnConfig.getIpv6BlackListTtl()));
        ListIterator<IConnStrategy> listIterator = queryByHost.listIterator();
        while (listIterator.hasNext()) {
            IConnStrategy next = listIterator.next();
            if (!iStrategyFilter.accept(next)) {
                listIterator.remove();
            }
            if (z && C0209c.m282b(next.getIp())) {
                listIterator.remove();
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m287d("getConnStrategyListByHost", null, "host", str, "result", queryByHost);
        }
        return queryByHost;
    }

    @Override // anet.channel.strategy.IStrategyInstance
    public String getSchemeByHost(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m260a()) {
            return str2;
        }
        String a = this.f403b.f346b.mo3672a(str);
        if (a != null || TextUtils.isEmpty(str2)) {
            str2 = a;
        }
        if (str2 == null && (str2 = C0180c.C0181a.f371a.mo3703a(str)) == null) {
            str2 = "http";
        }
        ALog.m287d("awcn.StrategyCenter", "getSchemeByHost", null, "host", str, "scheme", str2);
        return str2;
    }
}
