package com.huawei.hms.update.p055b;

import android.content.Context;
import com.huawei.hms.p037c.C1135e;
import com.huawei.hms.support.log.C1202a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.huawei.hms.update.b.b */
public class C1222b implements AbstractC1224d {

    /* renamed from: a */
    public HttpURLConnection f1356a;

    /* renamed from: b */
    public volatile int f1357b = -1;

    @Override // com.huawei.hms.update.p055b.AbstractC1224d
    /* renamed from: a */
    public void mo15743a() {
        this.f1357b = -1;
        HttpURLConnection httpURLConnection = this.f1356a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.huawei.hms.update.p055b.AbstractC1224d
    /* renamed from: b */
    public void mo15744b() {
        this.f1357b = 1;
    }

    @Override // com.huawei.hms.update.p055b.AbstractC1224d
    /* renamed from: a */
    public int mo15742a(String str, OutputStream outputStream, int i, int i2, Context context) throws IOException, C1221a {
        InputStream inputStream = null;
        try {
            m1376a(str, context);
            this.f1356a.setRequestMethod("GET");
            if (i > 0) {
                HttpURLConnection httpURLConnection = this.f1356a;
                httpURLConnection.addRequestProperty("Range", "bytes=" + i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i2);
            }
            int responseCode = this.f1356a.getResponseCode();
            if ((i > 0 && responseCode == 206) || (i <= 0 && responseCode == 200)) {
                inputStream = this.f1356a.getInputStream();
                m1375a(new BufferedInputStream(inputStream, 4096), outputStream);
                outputStream.flush();
            }
            return responseCode;
        } finally {
            C1135e.m1070a(inputStream);
        }
    }

    /* renamed from: a */
    private void m1376a(String str, Context context) throws IOException {
        if (this.f1357b == 0) {
            C1202a.m1320d("HttpRequestHelper", "Not allowed to repeat open http(s) connection.");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f1356a = httpURLConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            C1223c.m1380a((HttpsURLConnection) httpURLConnection, context);
        }
        this.f1356a.setConnectTimeout(30000);
        this.f1356a.setReadTimeout(30000);
        this.f1356a.setDoInput(true);
        this.f1356a.setDoOutput(true);
        this.f1356a.setUseCaches(false);
        this.f1357b = 0;
    }

    /* renamed from: a */
    private void m1375a(InputStream inputStream, OutputStream outputStream) throws IOException, C1221a {
        byte[] bArr = new byte[4096];
        do {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        } while (this.f1357b != 1);
        throw new C1221a("HTTP(s) request was canceled.");
    }
}
