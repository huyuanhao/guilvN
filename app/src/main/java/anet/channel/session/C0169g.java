package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C0132b;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import java.util.List;
import java.util.Map;

/* renamed from: anet.channel.session.g */
public class C0169g implements RequestCb {

    /* renamed from: a */
    public final /* synthetic */ RunnableC0168f f294a;

    public C0169g(RunnableC0168f fVar) {
        this.f294a = fVar;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z) {
        this.f294a.f291b.onDataReceive(byteArray, z);
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        if (i <= 0 && i != -204) {
            this.f294a.f293d.handleCallbacks(2, new C0132b(2, 0, "Http connect fail"));
        }
        this.f294a.f291b.onFinish(i, str, requestStatistic);
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i, Map<String, List<String>> map) {
        ALog.m290i("awcn.HttpSession", "", this.f294a.f290a.getSeq(), "httpStatusCode", Integer.valueOf(i));
        ALog.m290i("awcn.HttpSession", "", this.f294a.f290a.getSeq(), "response headers", map);
        this.f294a.f291b.onResponseCode(i, map);
        this.f294a.f292c.serverRT = HttpHelper.parseServerRT(map);
        RunnableC0168f fVar = this.f294a;
        fVar.f293d.handleResponseCode(fVar.f290a, i);
        RunnableC0168f fVar2 = this.f294a;
        fVar2.f293d.handleResponseHeaders(fVar2.f290a, map);
    }
}
