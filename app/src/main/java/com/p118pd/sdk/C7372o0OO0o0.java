package com.p118pd.sdk;

import anet.channel.util.StringUtils;
import anetwork.channel.stat.NetworkStatCache$1;
import anetwork.channel.statist.StatisticData;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OO0o0  reason: case insensitive filesystem */
public class C7372o0OO0o0 implements AbstractC7370o0OO0Ooo {
    public static final int OooO00o = 100;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20129OooO00o = "{\"oneWayTime\" : 0, \"totalSize\" : 0}";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f20130OooO00o;

    /* renamed from: com.pd.sdk.o0OO0o0$OooO00o */
    public static class OooO00o {
        public static C7372o0OO0o0 OooO00o = new C7372o0OO0o0(null);
    }

    public /* synthetic */ C7372o0OO0o0(NetworkStatCache$1 networkStatCache$1) {
        this();
    }

    public static C7372o0OO0o0 OooO00o() {
        return OooO00o.OooO00o;
    }

    public C7372o0OO0o0() {
        this.f20130OooO00o = Collections.synchronizedMap(new NetworkStatCache$1(this));
    }

    @Override // com.p118pd.sdk.AbstractC7370o0OO0Ooo
    public void OooO00o(String str, StatisticData statisticData) {
        if (!StringUtils.isBlank(str)) {
            StringBuilder sb = new StringBuilder(48);
            sb.append("{\"oneWayTime\" : ");
            sb.append(statisticData.oneWayTime_ANet);
            sb.append(", \"totalSize\" : ");
            sb.append(statisticData.totalSize);
            sb.append(C7522o0Ooo0o.OooO0Oo);
            this.f20130OooO00o.put(str, sb.toString());
        }
    }

    @Override // com.p118pd.sdk.AbstractC7370o0OO0Ooo, com.p118pd.sdk.AbstractC7370o0OO0Ooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18908OooO00o(String str) {
        if (this.f20130OooO00o.containsKey(str)) {
            this.f20130OooO00o.put(str, f20129OooO00o);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7370o0OO0Ooo, com.p118pd.sdk.AbstractC7370o0OO0Ooo
    public String OooO00o(String str) {
        return this.f20130OooO00o.get(str);
    }
}
