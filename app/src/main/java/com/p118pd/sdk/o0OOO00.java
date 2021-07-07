package com.p118pd.sdk;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.C0147b;
import anet.channel.request.C0155b;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpUrl;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import com.p118pd.sdk.o0OO0O0O;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.o0OOO00 */
public class o0OOO00 {
    public C7360o0OO OooO00o;

    /* renamed from: com.pd.sdk.o0OOO00$OooO00o */
    public class OooO00o implements o0OO0O0O.OooO00o {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Request f20145OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7369o0OO0O0 f20146OooO00o = null;

        public OooO00o(int i, Request request, AbstractC7369o0OO0O0 o0oo0o0) {
            this.OooO00o = i;
            this.f20145OooO00o = request;
            this.f20146OooO00o = o0oo0o0;
        }

        @Override // com.p118pd.sdk.o0OO0O0O.OooO00o, com.p118pd.sdk.o0OO0O0O.OooO00o
        public Request OooO00o() {
            return this.f20145OooO00o;
        }

        @Override // com.p118pd.sdk.o0OO0O0O.OooO00o, com.p118pd.sdk.o0OO0O0O.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC7369o0OO0O0 m18911OooO00o() {
            return this.f20146OooO00o;
        }

        @Override // com.p118pd.sdk.o0OO0O0O.OooO00o
        public Future OooO00o(Request request, AbstractC7369o0OO0O0 o0oo0o0) {
            if (o0OOO00.this.OooO00o.f20102OooO00o.get()) {
                ALog.m290i("anet.UnifiedRequestTask", "request canneled or timeout in processing interceptor", request.getSeq(), new Object[0]);
                return null;
            } else if (this.OooO00o < o0OO0OoO.OooO00o()) {
                return o0OO0OoO.OooO00o(this.OooO00o).OooO00o(new OooO00o(this.OooO00o + 1, request, o0oo0o0));
            } else {
                o0OOO00.this.OooO00o.f20099OooO00o.OooO00o(request);
                o0OOO00.this.OooO00o.OooO00o = o0oo0o0;
                Cache OooO00o2 = C7348o0O0oo.OooO0Oo() ? C7344o0O0oOo.OooO00o(o0OOO00.this.OooO00o.f20099OooO00o.m19129OooO00o(), o0OOO00.this.OooO00o.f20099OooO00o.m19130OooO00o()) : null;
                C7360o0OO o0oo = o0OOO00.this.OooO00o;
                o0oo.f20098OooO00o = OooO00o2 != null ? new C7371o0OO0o(o0oo, OooO00o2) : new C7446o0OOoooO(o0oo, null, null);
                o0OOO00.this.OooO00o.f20098OooO00o.run();
                o0OOO00.this.OooO0O0();
                return null;
            }
        }
    }

    public o0OOO00(C7503o0OoOoO o0ooooo, o0OO00OO o0oo00oo) {
        o0oo00oo.OooO00o(o0ooooo.f20342OooO00o);
        this.OooO00o = new C7360o0OO(o0ooooo, o0oo00oo);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0() {
        this.OooO00o.f20101OooO00o = ThreadPoolExecutorFactory.submitScheduledTask(new o0OOO0O0(this), (long) this.OooO00o.f20099OooO00o.OooO00o(), TimeUnit.MILLISECONDS);
    }

    public Future OooO00o() {
        this.OooO00o.f20099OooO00o.f20340OooO00o.start = System.currentTimeMillis();
        if (ALog.isPrintLog(2)) {
            C7360o0OO o0oo = this.OooO00o;
            ALog.m290i("anet.UnifiedRequestTask", "request", o0oo.f20100OooO00o, "Url", o0oo.f20099OooO00o.m19129OooO00o());
        }
        if (C7348o0O0oo.OooO00o(this.OooO00o.f20099OooO00o.m19128OooO00o())) {
            o0OO0oO0 o0oo0oo0 = new o0OO0oO0(this.OooO00o);
            this.OooO00o.f20098OooO00o = o0oo0oo0;
            o0oo0oo0.OooO00o = new C0155b(ThreadPoolExecutorFactory.submitBackupTask(new o0OOO00o(this)), this.OooO00o.f20099OooO00o.m19127OooO00o().getSeq());
            OooO0O0();
            return new FutureC7377o0OO0oOO(this);
        }
        ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC7382o0OOO0(this), ThreadPoolExecutorFactory.Priority.HIGH);
        return new FutureC7377o0OO0oOO(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18910OooO00o() {
        if (this.OooO00o.f20102OooO00o.compareAndSet(false, true)) {
            HttpUrl OooO00o2 = this.OooO00o.f20099OooO00o.m19128OooO00o();
            ALog.m289e("anet.UnifiedRequestTask", "task cancelled", this.OooO00o.f20100OooO00o, "URL", OooO00o2.simpleUrlString());
            RequestStatistic requestStatistic = this.OooO00o.f20099OooO00o.f20340OooO00o;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.ret = 2;
                requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_CANCEL;
                requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_CANCEL);
                requestStatistic.rspEnd = System.currentTimeMillis();
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_CANCEL, null, requestStatistic, null));
                if (requestStatistic.recDataSize > 102400) {
                    C0147b.m101a().mo3510a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.recDataSize);
                }
            }
            this.OooO00o.OooO0O0();
            this.OooO00o.OooO00o();
            this.OooO00o.OooO00o.OooO00o(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_CANCEL, null, requestStatistic));
        }
    }
}
