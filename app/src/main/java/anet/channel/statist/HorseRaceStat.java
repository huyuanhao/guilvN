package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.ConnProtocol;

@Monitor(module = "networkPrefer", monitorPoint = "horseRace")
public class HorseRaceStat extends StatObject {
    @Dimension
    public volatile String bssid = NetworkStatusHelper.getWifiBSSID();
    @Dimension
    public volatile int connErrorCode;
    @Dimension
    public volatile int connRet = 0;
    @Measure
    public volatile long connTime;
    @Dimension
    public volatile String host;
    @Dimension

    /* renamed from: ip */
    public volatile String f299ip;
    @Dimension
    public volatile String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public volatile String nettype = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public volatile String path;
    @Dimension
    public volatile int port;
    @Dimension
    public volatile String protocol;
    @Dimension
    public volatile int reqErrorCode;
    @Dimension
    public volatile int reqRet = 0;
    @Measure
    public volatile long reqTime;

    public HorseRaceStat(String str, C0198l.C0203e eVar) {
        this.host = str;
        this.f299ip = eVar.f443a;
        this.port = eVar.f444b.f414a;
        this.protocol = ConnProtocol.valueOf(eVar.f444b).name;
        this.path = eVar.f445c;
    }
}
