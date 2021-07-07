package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class AccsSessionManager {

    /* renamed from: a */
    public SessionCenter f4a = null;

    /* renamed from: b */
    public Set<String> f5b = Collections.EMPTY_SET;

    public AccsSessionManager(SessionCenter sessionCenter) {
        this.f4a = sessionCenter;
    }

    /* renamed from: a */
    private boolean m3a() {
        if (!GlobalAppRuntimeInfo.isAppBackground() && NetworkStatusHelper.isConnected()) {
            return true;
        }
        return false;
    }

    public synchronized void checkAndStartSession() {
        Collection<SessionInfo> a = this.f4a.f71g.mo3412a();
        Set<String> set = Collections.EMPTY_SET;
        if (!a.isEmpty()) {
            set = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : a) {
            if (sessionInfo.isKeepAlive) {
                set.add(StringUtils.concatString(StrategyCenter.getInstance().getSchemeByHost(sessionInfo.host, sessionInfo.isAccs ? "https" : "http"), HttpConstant.SCHEME_SPLIT, sessionInfo.host));
            }
        }
        for (String str : this.f5b) {
            if (!set.contains(str)) {
                m2a(str);
            }
        }
        if (m3a()) {
            for (String str2 : set) {
                try {
                    this.f4a.get(str2, ConnType.TypeLevel.SPDY, 0);
                } catch (Exception unused) {
                    ALog.m289e("start session failed", null, "host", str2);
                }
            }
            this.f5b = set;
        }
    }

    public synchronized void forceCloseSession(boolean z) {
        if (ALog.isPrintLog(1)) {
            ALog.m287d("awcn.AccsSessionManager", "forceCloseSession", this.f4a.f67c, "reCreate", Boolean.valueOf(z));
        }
        for (String str : this.f5b) {
            m2a(str);
        }
        if (z) {
            checkAndStartSession();
        }
    }

    /* renamed from: a */
    private void m2a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ALog.m287d("awcn.AccsSessionManager", "closeSessions", this.f4a.f67c, "host", str);
            this.f4a.mo3362a(str).mo3396b(false);
        }
    }
}
