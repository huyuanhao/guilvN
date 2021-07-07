package anet.channel.p008d;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.HorseRaceStat;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.d.f */
public class C0127f implements RequestCb {

    /* renamed from: a */
    public final /* synthetic */ C0126e f141a;

    public C0127f(C0126e eVar) {
        this.f141a = eVar;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        int i2 = 0;
        ALog.m290i("awcn.NetworkDetector", "LongLinkTask request finish", this.f141a.f138c, "statusCode", Integer.valueOf(i), "msg", str);
        if (this.f141a.f136a.reqErrorCode == 0) {
            this.f141a.f136a.reqErrorCode = i;
        } else {
            HorseRaceStat horseRaceStat = this.f141a.f136a;
            if (horseRaceStat.reqErrorCode == 200) {
                i2 = 1;
            }
            horseRaceStat.reqRet = i2;
        }
        HorseRaceStat horseRaceStat2 = this.f141a.f136a;
        long currentTimeMillis = System.currentTimeMillis();
        C0126e eVar = this.f141a;
        horseRaceStat2.reqTime = (currentTimeMillis - eVar.f137b) + eVar.f136a.connTime;
        synchronized (this.f141a.f136a) {
            this.f141a.f136a.notify();
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i, Map<String, List<String>> map) {
        this.f141a.f136a.reqErrorCode = i;
    }
}
