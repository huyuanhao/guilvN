package com.taobao.accs.net;

import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.p118pd.sdk.C7265o0O000oo;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.h */
public class C3143h implements HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    public final /* synthetic */ C3142g f7040a;

    public C3143h(C3142g gVar) {
        this.f7040a = gVar;
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        ThreadPoolExecutorFactory.schedule(new RunnableC3144i(this), C7265o0O000oo.OooO0o.OooO00o, TimeUnit.MILLISECONDS);
    }
}
