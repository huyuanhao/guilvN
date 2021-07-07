package com.p118pd.sdk;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anetwork.channel.aidl.DefaultFinishEvent;

/* renamed from: com.pd.sdk.o0OOO0O0 */
public class o0OOO0O0 implements Runnable {
    public final /* synthetic */ o0OOO00 OooO00o;

    public o0OOO0O0(o0OOO00 o0ooo00) {
        this.OooO00o = o0ooo00;
    }

    public void run() {
        if (this.OooO00o.OooO00o.f20102OooO00o.compareAndSet(false, true)) {
            RequestStatistic requestStatistic = this.OooO00o.OooO00o.f20099OooO00o.f20340OooO00o;
            if (requestStatistic.isDone.compareAndSet(false, true)) {
                requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_TIME_OUT;
                requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_TIME_OUT);
                requestStatistic.rspEnd = System.currentTimeMillis();
                ALog.m289e("anet.UnifiedRequestTask", "task time out", this.OooO00o.OooO00o.f20100OooO00o, "rs", requestStatistic);
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_TIME_OUT, null, requestStatistic, null));
            }
            this.OooO00o.OooO00o.OooO0O0();
            this.OooO00o.OooO00o.OooO00o.OooO00o(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_TIME_OUT, null, requestStatistic));
        }
    }
}
