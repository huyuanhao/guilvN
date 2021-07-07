package com.huawei.hms.support.log;

import android.content.Context;
import android.util.Log;
import com.huawei.hms.support.log.p052b.C1205a;

/* renamed from: com.huawei.hms.support.log.b */
public class C1204b {

    /* renamed from: a */
    public static final AbstractC1206c f1308a = new C1205a();

    /* renamed from: b */
    public int f1309b = 4;

    /* renamed from: c */
    public String f1310c;

    /* renamed from: b */
    private C1207d m1325b(int i, String str, String str2, Throwable th) {
        C1207d dVar = new C1207d(8, this.f1310c, i, str);
        dVar.mo15717a(str2);
        dVar.mo15718a(th);
        return dVar;
    }

    /* renamed from: a */
    public void mo15712a(Context context, int i, String str) {
        this.f1309b = i;
        this.f1310c = str;
        f1308a.mo15715a(context, "HMSCore");
    }

    /* renamed from: a */
    public boolean mo15714a(int i) {
        return i >= this.f1309b;
    }

    /* renamed from: a */
    public void mo15711a(int i, String str, String str2, Throwable th) {
        if (mo15714a(i)) {
            C1207d b = m1325b(i, str, str2, th);
            AbstractC1206c cVar = f1308a;
            cVar.mo15716a(b.mo15719a() + b.mo15720b(), i, str, str2 + '\n' + Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    public void mo15710a(int i, String str, String str2) {
        if (mo15714a(i)) {
            C1207d b = m1325b(i, str, str2, null);
            f1308a.mo15716a(b.mo15719a() + b.mo15720b(), i, str, str2);
        }
    }

    /* renamed from: a */
    public void mo15713a(String str, String str2) {
        C1207d b = m1325b(4, str, str2, null);
        f1308a.mo15716a(b.mo15719a() + '\n' + b.mo15720b(), 4, str, str2);
    }
}
