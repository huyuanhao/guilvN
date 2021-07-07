package com.vivo.push.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.vivo.push.model.InsideNotificationItem;
import java.util.List;

/* renamed from: com.vivo.push.util.l */
public final class AsyncTaskC4142l extends AsyncTask<String, Void, List<Bitmap>> {

    /* renamed from: a */
    public Context f11117a;

    /* renamed from: b */
    public InsideNotificationItem f11118b;

    /* renamed from: c */
    public long f11119c;

    /* renamed from: d */
    public boolean f11120d;

    /* renamed from: e */
    public int f11121e = 0;

    public AsyncTaskC4142l(Context context, InsideNotificationItem insideNotificationItem, long j, boolean z) {
        this.f11117a = context;
        this.f11118b = insideNotificationItem;
        this.f11119c = j;
        this.f11120d = z;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r5 == null) goto L_0x009f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8 A[SYNTHETIC, Splitter:B:41:0x00a8] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.graphics.Bitmap> doInBackground(java.lang.String... r10) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.AsyncTaskC4142l.doInBackground(java.lang.String[]):java.util.List");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(List<Bitmap> list) {
        List<Bitmap> list2 = list;
        super.onPostExecute(list2);
        C4146p.m11214c("ImageDownTask", "onPostExecute");
        if (this.f11118b != null) {
            C4153w.m11245b().mo41182a("com.vivo.push.notify_key", this.f11119c);
            NotifyAdapterUtil.pushNotification(this.f11117a, list2, this.f11118b, this.f11119c, this.f11121e);
        }
    }
}
