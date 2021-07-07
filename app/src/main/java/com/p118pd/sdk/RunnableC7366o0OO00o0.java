package com.p118pd.sdk;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.RequestMonitor;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.pd.sdk.o0OO00o0  reason: case insensitive filesystem */
public class RunnableC7366o0OO00o0 implements Runnable {
    public final /* synthetic */ DefaultFinishEvent OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ AbstractC7332o0O0o0Oo f20124OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ o0OO00OO f20125OooO00o;

    public RunnableC7366o0OO00o0(o0OO00OO o0oo00oo, DefaultFinishEvent defaultFinishEvent, AbstractC7332o0O0o0Oo o0o0o0oo) {
        this.f20125OooO00o = o0oo00oo;
        this.OooO00o = defaultFinishEvent;
        this.f20124OooO00o = o0o0o0oo;
    }

    public void run() {
        DefaultFinishEvent defaultFinishEvent = this.OooO00o;
        String str = null;
        if (defaultFinishEvent != null) {
            defaultFinishEvent.OooO00o((Object) null);
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            RequestStatistic requestStatistic = this.OooO00o.OooO00o;
            if (requestStatistic != null) {
                requestStatistic.lastProcessTime = currentTimeMillis - requestStatistic.rspEnd;
                requestStatistic.oneWayTime = requestStatistic.retryCostTime + (currentTimeMillis - requestStatistic.start);
                this.OooO00o.m14960OooO00o().filledBy(requestStatistic);
            }
            this.f20124OooO00o.OooO00o(this.OooO00o);
            if (o0OO00OO.OooO00o(this.f20125OooO00o) != null) {
                o0OO00OO.OooO00o(this.f20125OooO00o).OooO00o();
            }
            if (requestStatistic != null) {
                requestStatistic.callbackTime = System.currentTimeMillis() - currentTimeMillis;
                if (requestStatistic.ret != 1 || requestStatistic.statusCode <= 0) {
                    ALog.m289e("anet.Repeater", requestStatistic.toString(), o0OO00OO.OooO00o(this.f20125OooO00o), new Object[0]);
                } else if (ALog.isPrintLog(2)) {
                    ALog.m290i("anet.Repeater", requestStatistic.toString(), o0OO00OO.OooO00o(this.f20125OooO00o), new Object[0]);
                }
                CopyOnWriteArrayList<String> bucketInfo = GlobalAppRuntimeInfo.getBucketInfo();
                if (bucketInfo != null) {
                    int size = bucketInfo.size();
                    for (int i = 0; i < size - 1; i += 2) {
                        requestStatistic.putExtra(bucketInfo.get(i), bucketInfo.get(i + 1));
                    }
                }
                AppMonitor.getInstance().commitStat(requestStatistic);
                if (C7348o0O0oo.OooO00o(requestStatistic)) {
                    AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                }
                try {
                    String str2 = requestStatistic.f300ip;
                    if (requestStatistic.extra != null) {
                        str = requestStatistic.extra.optString("firstIp");
                    }
                    if (C0209c.m282b(str2) || C0209c.m282b(str)) {
                        AppMonitor.getInstance().commitStat(new RequestMonitor(requestStatistic));
                    }
                } catch (Exception unused) {
                }
                C7373o0OO0o00.OooO00o().OooO00o(o0OO00OO.OooO00o(this.f20125OooO00o).m19129OooO00o(), this.OooO00o.m14960OooO00o());
            }
        } catch (Throwable unused2) {
        }
    }
}
