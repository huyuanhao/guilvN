package com.p118pd.sdk;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* renamed from: com.pd.sdk.o0o0O00  reason: case insensitive filesystem */
public class RunnableC7578o0o0O00 implements Runnable {
    public final /* synthetic */ DataReportRequest OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final /* synthetic */ C7579o0o0O000 f20415OooO00o;

    public RunnableC7578o0o0O00(C7579o0o0O000 o0o0o000, DataReportRequest dataReportRequest) {
        this.f20415OooO00o = o0o0o000;
        this.OooO00o = dataReportRequest;
    }

    public void run() {
        try {
            DataReportResult unused = C7579o0o0O000.OooO00o = this.f20415OooO00o.f20419OooO00o.reportData(this.OooO00o);
        } catch (Throwable th) {
            DataReportResult unused2 = C7579o0o0O000.OooO00o = new DataReportResult();
            C7579o0o0O000.OooO00o.success = false;
            DataReportResult dataReportResult = C7579o0o0O000.OooO00o;
            dataReportResult.resultCode = "static data rpc upload error, " + C7559o0o00OOo.OooO00o(th);
            new StringBuilder("rpc failed:").append(C7559o0o00OOo.OooO00o(th));
        }
    }
}
