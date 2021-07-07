package com.xiaomi.push;

import android.os.AsyncTask;

/* renamed from: com.xiaomi.push.cr */
public class AsyncTaskC4331cr extends AsyncTask<String, Integer, Integer> {

    /* renamed from: a */
    public C4328co f11534a;

    /* renamed from: a */
    public AbstractC4335cv f11535a;

    /* renamed from: a */
    public String f11536a;

    /* renamed from: b */
    public String f11537b;

    public AsyncTaskC4331cr(AbstractC4335cv cvVar, String str, String str2, C4328co coVar) {
        this.f11536a = str;
        this.f11537b = str2;
        this.f11535a = cvVar;
        this.f11534a = coVar;
    }

    /* renamed from: a */
    public Integer doInBackground(String... strArr) {
        return Integer.valueOf(C4332cs.m11974a(this.f11536a, this.f11537b, this.f11534a));
    }

    /* renamed from: a */
    public void onPostExecute(Integer num) {
        super.onPostExecute(num);
        AbstractC4335cv cvVar = this.f11535a;
        if (cvVar != null) {
            cvVar.mo41600a(num, this.f11534a);
        }
    }

    public void onCancelled() {
        super.onCancelled();
        AbstractC4335cv cvVar = this.f11535a;
        if (cvVar != null) {
            cvVar.mo41600a(1, this.f11534a);
        }
    }
}
