package com.huawei.updatesdk.sdk.service.p076c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.p062a.p065b.C1274a;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1293e;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1298a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1301c;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.updatesdk.sdk.service.c.b */
public class AsyncTaskC1304b extends AsyncTask<C1301c, Void, C1302d> {

    /* renamed from: a */
    public C1301c f1474a = null;

    /* renamed from: b */
    public C1302d f1475b = null;

    /* renamed from: c */
    public AbstractC1298a f1476c = null;

    /* renamed from: d */
    public C1274a f1477d = null;

    /* renamed from: e */
    public int f1478e = 0;

    public AsyncTaskC1304b(C1301c cVar, AbstractC1298a aVar) {
        this.f1474a = cVar;
        this.f1476c = aVar;
    }

    /* renamed from: a */
    private C1302d m1684a(String str, String str2, C1302d dVar) {
        try {
            dVar.fromJson(new JSONObject(str2));
            dVar.mo15925a(0);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | JSONException e) {
            C1278a.m1581a("StoreTask", "parse json error", e);
        }
        return dVar;
    }

    /* renamed from: a */
    private void m1685a(C1302d dVar, int i, C1302d.EnumC1303a aVar, Throwable th) {
        if (dVar != null) {
            dVar.mo15925a(i);
            dVar.mo15926a(aVar);
            dVar.mo15927a(th.toString());
        }
    }

    /* renamed from: a */
    private void m1686a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            sb = new StringBuilder();
            sb.append("Store response error, method:");
            sb.append(this.f1474a.mo15920g());
            sb.append(", url:");
            sb.append(str3);
            sb.append(", body:");
            sb.append(str2);
            str4 = ", resData == null";
        } else {
            sb = new StringBuilder();
            sb.append("Store response error, method:");
            sb.append(this.f1474a.mo15920g());
            sb.append(", url:");
            sb.append(str3);
            sb.append(", body:");
            sb.append(str2);
            str4 = ", resData is not json string";
        }
        sb.append(str4);
        C1278a.m1580a("StoreTask", sb.toString());
    }

    /* renamed from: a */
    private void m1687a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("invoke store error");
        sb.append(", exceptionType:");
        sb.append(th.toString());
        sb.append(", url:");
        sb.append(str);
        sb.append(", method:");
        sb.append(this.f1474a.mo15920g());
        sb.append(", retryTimes:" + this.f1478e);
        C1278a.m1581a("StoreTask", sb.toString(), th);
    }

    /* renamed from: a */
    private boolean m1688a(String str) {
        return TextUtils.isEmpty(str) || !AbstractC1293e.m1648c(str);
    }

    /* renamed from: c */
    private boolean m1689c(C1302d dVar) {
        if (isCancelled()) {
            return false;
        }
        if (dVar.mo15929c() != 1 && dVar.mo15929c() != 2) {
            return false;
        }
        int i = this.f1478e;
        this.f1478e = i + 1;
        if (i >= 3) {
            C1278a.m1580a("StoreTask", "retry completed total times = " + this.f1478e + ",response.responseCode = " + dVar.mo15929c());
            return false;
        }
        C1278a.m1580a("StoreTask", "retry times = " + this.f1478e + ",response.responseCode = " + dVar.mo15929c());
        return true;
    }

    /* renamed from: d */
    private void m1690d() {
        m1691d(this.f1475b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1691d(com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d r5) {
        /*
            r4 = this;
            java.lang.String r0 = "notifyResult, create response error, method:"
            boolean r1 = r4.isCancelled()
            if (r1 != 0) goto L_0x005a
            com.huawei.updatesdk.sdk.service.c.a.a r1 = r4.f1476c
            if (r1 == 0) goto L_0x005a
            if (r5 != 0) goto L_0x0053
            java.lang.String r1 = "StoreTask"
            java.lang.String r2 = "notifyResult, response is null"
            com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a.m1584d(r1, r2)
            com.huawei.updatesdk.sdk.service.c.a.c r2 = r4.f1474a     // Catch:{ InstantiationException -> 0x0027, IllegalAccessException -> 0x0020 }
            java.lang.String r2 = r2.mo15920g()     // Catch:{ InstantiationException -> 0x0027, IllegalAccessException -> 0x0020 }
            com.huawei.updatesdk.sdk.service.c.a.d r5 = com.huawei.updatesdk.sdk.service.p076c.C1297a.m1664a(r2)     // Catch:{ InstantiationException -> 0x0027, IllegalAccessException -> 0x0020 }
            goto L_0x0040
        L_0x0020:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x002d
        L_0x0027:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x002d:
            r3.append(r0)
            com.huawei.updatesdk.sdk.service.c.a.c r0 = r4.f1474a
            java.lang.String r0 = r0.mo15920g()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a.m1581a(r1, r0, r2)
        L_0x0040:
            if (r5 != 0) goto L_0x004a
            com.huawei.updatesdk.sdk.service.c.a.d r5 = new com.huawei.updatesdk.sdk.service.c.a.d
            r5.<init>()
            com.huawei.updatesdk.sdk.service.c.a.d$a r0 = com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d.EnumC1303a.PARAM_ERROR
            goto L_0x004c
        L_0x004a:
            com.huawei.updatesdk.sdk.service.c.a.d$a r0 = com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d.EnumC1303a.UNKNOWN_EXCEPTION
        L_0x004c:
            r5.mo15926a(r0)
            r0 = 1
            r5.mo15925a(r0)
        L_0x0053:
            com.huawei.updatesdk.sdk.service.c.a.a r0 = r4.f1476c
            com.huawei.updatesdk.sdk.service.c.a.c r1 = r4.f1474a
            r0.mo15913b(r1, r5)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.service.p076c.AsyncTaskC1304b.m1691d(com.huawei.updatesdk.sdk.service.c.a.d):void");
    }

    /* renamed from: a */
    public final C1302d mo15933a() {
        C1302d dVar = null;
        do {
            if (this.f1478e > 0 && dVar != null) {
                C1278a.m1580a("StoreTask", "call store error! responseCode:" + dVar.mo15929c() + ", retryTimes:" + this.f1478e);
            }
            dVar = mo15937b();
            mo15935a(dVar);
        } while (m1689c(dVar));
        this.f1475b = dVar;
        return dVar;
    }

    /* renamed from: a */
    public C1302d doInBackground(C1301c... cVarArr) {
        C1278a.m1580a("StoreTask", "doInBackground, method:" + this.f1474a.mo15920g());
        C1302d a = mo15933a();
        AbstractC1298a aVar = this.f1476c;
        if (aVar != null) {
            aVar.mo15912a(this.f1474a, a);
        }
        return a;
    }

    /* renamed from: a */
    public void mo15935a(C1302d dVar) {
    }

    /* renamed from: a */
    public final void mo15936a(Executor executor) {
        executeOnExecutor(executor, this.f1474a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d mo15937b() {
        /*
        // Method dump skipped, instructions count: 287
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.service.p076c.AsyncTaskC1304b.mo15937b():com.huawei.updatesdk.sdk.service.c.a.d");
    }

    /* renamed from: b */
    public void onPostExecute(C1302d dVar) {
        C1278a.m1580a("StoreTask", "onPostExecute, method:" + this.f1474a.mo15920g());
        m1690d();
    }

    /* renamed from: c */
    public String mo15939c() {
        return "Android/1.0";
    }
}
