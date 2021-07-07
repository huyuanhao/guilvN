package anet.channel.p005a;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.util.ALog;
import com.taobao.analysis.FlowCenter;

/* renamed from: anet.channel.a.a */
public class C0108a implements INetworkAnalysis {

    /* renamed from: a */
    public boolean f101a;

    public C0108a() {
        try {
            Class.forName("com.taobao.analysis.FlowCenter");
            this.f101a = true;
        } catch (Exception unused) {
            this.f101a = false;
            ALog.m289e("DefaultNetworkAnalysis", "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(FlowStat flowStat) {
        if (this.f101a) {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }
}
