package com.taobao.accs.net;

import com.alibaba.fastjson.JSONObject;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import java.util.UUID;

/* renamed from: com.taobao.accs.net.k */
public class RunnableC3147k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3145j f7055a;

    public RunnableC3147k(C3145j jVar) {
        this.f7055a = jVar;
    }

    public void run() {
        ALog.m7597d(this.f7055a.mo37662d(), "sendAccsHeartbeatMessage", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dataType", "pingreq");
        jSONObject.put("timeInterval", Long.valueOf(this.f7055a.f7043p));
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, jSONObject.toJSONString().getBytes(), UUID.randomUUID().toString());
        accsRequest.setTarget("accs-iot");
        accsRequest.setTargetServiceName("sal");
        C3145j jVar = this.f7055a;
        this.f7055a.mo37648a(Message.buildRequest(jVar.f7012d, jVar.mo37654b((String) null), this.f7055a.mo37662d(), this.f7055a.f7017i.getStoreId(), this.f7055a.f7012d.getPackageName(), Constants.TARGET_SERVICE, accsRequest, true), true);
    }
}
