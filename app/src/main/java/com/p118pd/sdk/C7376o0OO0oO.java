package com.p118pd.sdk;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OO0oO  reason: case insensitive filesystem */
public class C7376o0OO0oO implements RequestCb {
    public final /* synthetic */ o0OO0oO0 OooO00o;

    public C7376o0OO0oO(o0OO0oO0 o0oo0oo0) {
        this.OooO00o = o0oo0oo0;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z) {
        if (!o0OO0oO0.OooO00o(this.OooO00o).f20102OooO00o.get()) {
            o0OO0oO0.OooO00o(this.OooO00o);
            if (o0OO0oO0.OooO00o(this.OooO00o).OooO00o != null) {
                o0OO0oO0.OooO00o(this.OooO00o).OooO00o.OooO00o(this.OooO00o.o0ooOO0, this.OooO00o.o00oO0O, byteArray);
            }
        }
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        if (!o0OO0oO0.OooO00o(this.OooO00o).f20102OooO00o.getAndSet(true)) {
            if (ALog.isPrintLog(2)) {
                ALog.m290i("anet.DegradeTask", "[onFinish]", o0OO0oO0.OooO00o(this.OooO00o).f20100OooO00o, "code", Integer.valueOf(i), "msg", str);
            }
            o0OO0oO0.OooO00o(this.OooO00o).OooO00o();
            requestStatistic.isDone.set(true);
            if (o0OO0oO0.OooO00o(this.OooO00o).OooO00o != null) {
                o0OO0oO0.OooO00o(this.OooO00o).OooO00o.OooO00o(new DefaultFinishEvent(i, str, requestStatistic));
            }
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i, Map<String, List<String>> map) {
        if (!o0OO0oO0.OooO00o(this.OooO00o).f20102OooO00o.get()) {
            o0OO0oO0.OooO00o(this.OooO00o).OooO00o();
            C7354o0O0ooO0.OooO00o(o0OO0oO0.OooO00o(this.OooO00o).f20099OooO00o.m19129OooO00o(), map);
            this.OooO00o.o00oO0O = HttpHelper.parseContentLength(map);
            if (o0OO0oO0.OooO00o(this.OooO00o).OooO00o != null) {
                o0OO0oO0.OooO00o(this.OooO00o).OooO00o.onResponseCode(i, map);
            }
        }
    }
}
