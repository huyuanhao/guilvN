package com.p118pd.sdk;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.AbstractC0377w;
import com.alipay.android.phone.mrpc.core.C0349aa;
import com.alipay.android.phone.mrpc.core.C0361h;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.o0o0O000  reason: case insensitive filesystem */
public class C7579o0o0O000 implements AbstractC7575o0o00ooo {
    public static DataReportResult OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C7579o0o0O000 f20416OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC0377w f20417OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BugTrackMessageService f20418OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DataReportService f20419OooO00o = null;

    public C7579o0o0O000(Context context, String str) {
        C0349aa aaVar = new C0349aa();
        aaVar.mo4119a(str);
        C0361h hVar = new C0361h(context);
        this.f20417OooO00o = hVar;
        this.f20418OooO00o = (BugTrackMessageService) hVar.mo4147a(BugTrackMessageService.class, aaVar);
        this.f20419OooO00o = (DataReportService) this.f20417OooO00o.mo4147a(DataReportService.class, aaVar);
    }

    public static synchronized C7579o0o0O000 OooO00o(Context context, String str) {
        C7579o0o0O000 o0o0o000;
        synchronized (C7579o0o0O000.class) {
            if (f20416OooO00o == null) {
                f20416OooO00o = new C7579o0o0O000(context, str);
            }
            o0o0o000 = f20416OooO00o;
        }
        return o0o0o000;
    }

    @Override // com.p118pd.sdk.AbstractC7575o0o00ooo
    public DataReportResult OooO00o(DataReportRequest dataReportRequest) {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f20419OooO00o != null) {
            OooO00o = null;
            new Thread(new RunnableC7578o0o0O00(this, dataReportRequest)).start();
            int i = 300000;
            while (OooO00o == null && i >= 0) {
                Thread.sleep(50);
                i -= 50;
            }
        }
        return OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7575o0o00ooo
    /* renamed from: a */
    public boolean mo27521a(String str) {
        BugTrackMessageService bugTrackMessageService;
        if (C7559o0o00OOo.m19210OooO00o(str) || (bugTrackMessageService = this.f20418OooO00o) == null) {
            return false;
        }
        String str2 = null;
        try {
            str2 = bugTrackMessageService.logCollect(C7559o0o00OOo.OooO0OO(str));
        } catch (Throwable unused) {
        }
        if (!C7559o0o00OOo.m19210OooO00o(str2)) {
            return ((Boolean) new JSONObject(str2).get("success")).booleanValue();
        }
        return false;
    }
}
