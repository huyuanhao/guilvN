package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.updatesdk.support.p083c.C1371a;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.updatesdk.service.otaupdate.e */
public class C1362e {

    /* renamed from: c */
    public static C1362e f1647c = new C1362e();

    /* renamed from: a */
    public String f1648a;

    /* renamed from: b */
    public String f1649b;

    /* renamed from: com.huawei.updatesdk.service.otaupdate.e$a */
    public static class AsyncTaskC1364a extends AsyncTask<Void, Void, String> {
        public AsyncTaskC1364a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[SYNTHETIC, Splitter:B:23:0x0067] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC, Splitter:B:29:0x0072] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r10) {
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.service.otaupdate.C1362e.AsyncTaskC1364a.doInBackground(java.lang.Void[]):java.lang.String");
        }
    }

    /* renamed from: a */
    public static C1362e m2017a() {
        return f1647c;
    }

    /* renamed from: a */
    public void mo16186a(Context context) {
        this.f1649b = null;
        if (C1371a.m2050a(context)) {
            AsyncTaskC1364a aVar = new AsyncTaskC1364a();
            aVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
            try {
                aVar.get(1000, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                aVar.cancel(true);
                String str = "init AccountZone error: " + e.toString();
            }
        }
    }

    /* renamed from: a */
    public void mo16187a(String str) {
        this.f1648a = str;
    }

    /* renamed from: b */
    public String mo16188b() {
        return this.f1648a;
    }

    /* renamed from: b */
    public void mo16189b(String str) {
        this.f1649b = str;
    }

    /* renamed from: c */
    public String mo16190c() {
        return !TextUtils.isEmpty(this.f1648a) ? this.f1648a : this.f1649b;
    }
}
