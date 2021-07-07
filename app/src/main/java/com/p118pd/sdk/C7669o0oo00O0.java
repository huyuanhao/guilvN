package com.p118pd.sdk;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.pd.sdk.o0oo00O0  reason: case insensitive filesystem */
public class C7669o0oo00O0 implements AbstractC7662o0oOooo0<InputStream> {
    @VisibleForTesting
    public static final OooO0O0 OooO0O0 = new OooO00o();
    public static final int o0ooOO0 = 5;
    public static final int o0ooOOo = -1;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public static final String f20544o0ooOOo = "HttpUrlFetcher";
    public final OooO0O0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7764o0ooooo0 f20545OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f20546OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HttpURLConnection f20547OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public volatile boolean f20548OooO0O0;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.o0oo00O0$OooO00o */
    public static class OooO00o implements OooO0O0 {
        @Override // com.p118pd.sdk.C7669o0oo00O0.OooO0O0
        public HttpURLConnection OooO00o(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.pd.sdk.o0oo00O0$OooO0O0 */
    public interface OooO0O0 {
        HttpURLConnection OooO00o(URL url) throws IOException;
    }

    public C7669o0oo00O0(C7764o0ooooo0 o0ooooo0, int i) {
        this(o0ooooo0, i, OooO0O0);
    }

    public static boolean OooO0O0(int i) {
        return i / 100 == 3;
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super InputStream> oooO00o) {
        StringBuilder sb;
        long OooO00o2 = C7843oO0O00o.OooO00o();
        try {
            oooO00o.OooO00o(OooO00o(this.f20545OooO00o.m19409OooO00o(), 0, null, this.f20545OooO00o.m19410OooO00o()));
            if (Log.isLoggable(f20544o0ooOOo, 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C7843oO0O00o.OooO00o(OooO00o2));
                sb.toString();
            }
        } catch (IOException e) {
            Log.isLoggable(f20544o0ooOOo, 3);
            oooO00o.OooO00o((Exception) e);
            if (Log.isLoggable(f20544o0ooOOo, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(f20544o0ooOOo, 2)) {
                String str = "Finished http url fetcher fetch in " + C7843oO0O00o.OooO00o(OooO00o2);
            }
            throw th;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
    public void cancel() {
        this.f20548OooO0O0 = true;
    }

    @VisibleForTesting
    public C7669o0oo00O0(C7764o0ooooo0 o0ooooo0, int i, OooO0O0 oooO0O0) {
        this.f20545OooO00o = o0ooooo0;
        this.o00oO0O = i;
        this.OooO00o = oooO0O0;
    }

    private InputStream OooO00o(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f20547OooO00o = this.OooO00o.OooO00o(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f20547OooO00o.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f20547OooO00o.setConnectTimeout(this.o00oO0O);
            this.f20547OooO00o.setReadTimeout(this.o00oO0O);
            this.f20547OooO00o.setUseCaches(false);
            this.f20547OooO00o.setDoInput(true);
            this.f20547OooO00o.setInstanceFollowRedirects(false);
            this.f20547OooO00o.connect();
            this.f20546OooO00o = this.f20547OooO00o.getInputStream();
            if (this.f20548OooO0O0) {
                return null;
            }
            int responseCode = this.f20547OooO00o.getResponseCode();
            if (OooO00o(responseCode)) {
                return OooO00o(this.f20547OooO00o);
            }
            if (OooO0O0(responseCode)) {
                String headerField = this.f20547OooO00o.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    m19302OooO00o();
                    return OooO00o(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f20547OooO00o.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    public static boolean OooO00o(int i) {
        return i / 100 == 2;
    }

    private InputStream OooO00o(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f20546OooO00o = oO0O00.OooO00o(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable(f20544o0ooOOo, 3)) {
                String str = "Got non empty content encoding: " + httpURLConnection.getContentEncoding();
            }
            this.f20546OooO00o = httpURLConnection.getInputStream();
        }
        return this.f20546OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19302OooO00o() {
        InputStream inputStream = this.f20546OooO00o;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f20547OooO00o;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f20547OooO00o = null;
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Class<InputStream> m19301OooO00o() {
        return InputStream.class;
    }

    /* Return type fixed from 'com.bumptech.glide.load.DataSource' to match base method */
    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
    @NonNull
    public Class<InputStream> OooO00o() {
        return DataSource.REMOTE;
    }
}
