package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HttpUrlConnectionNetworkFetcher extends BaseNetworkFetcher<FetchState> {
    public static final int HTTP_DEFAULT_TIMEOUT = 30000;
    public static final int HTTP_PERMANENT_REDIRECT = 308;
    public static final int HTTP_TEMPORARY_REDIRECT = 307;
    public static final int MAX_REDIRECTS = 5;
    public static final int NUM_NETWORK_THREADS = 3;
    public final ExecutorService mExecutorService;
    public int mHttpConnectionTimeout;

    public HttpUrlConnectionNetworkFetcher() {
        this(Executors.newFixedThreadPool(3));
    }

    private HttpURLConnection downloadFrom(Uri uri, int i) throws IOException {
        Uri uri2;
        String str;
        HttpURLConnection openConnectionTo = openConnectionTo(uri);
        openConnectionTo.setConnectTimeout(this.mHttpConnectionTimeout);
        int responseCode = openConnectionTo.getResponseCode();
        if (isHttpSuccess(responseCode)) {
            return openConnectionTo;
        }
        if (isHttpRedirect(responseCode)) {
            String headerField = openConnectionTo.getHeaderField("Location");
            openConnectionTo.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i > 0 && uri2 != null && !uri2.getScheme().equals(scheme)) {
                return downloadFrom(uri2, i - 1);
            }
            if (i == 0) {
                str = error("URL %s follows too many redirects", uri.toString());
            } else {
                str = error("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(str);
        }
        openConnectionTo.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }

    public static String error(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    public static boolean isHttpRedirect(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public static boolean isHttpSuccess(int i) {
        return i >= 200 && i < 300;
    }

    @VisibleForTesting
    public static HttpURLConnection openConnectionTo(Uri uri) throws IOException {
        return (HttpURLConnection) UriUtil.uriToUrl(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public FetchState createFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        return new FetchState(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(final FetchState fetchState, final NetworkFetcher.Callback callback) {
        final Future<?> submit = this.mExecutorService.submit(new Runnable() {
            /* class com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.RunnableC05441 */

            public void run() {
                HttpUrlConnectionNetworkFetcher.this.fetchSync(fetchState, callback);
            }
        });
        fetchState.getContext().addCallbacks(new BaseProducerContextCallbacks() {
            /* class com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.C05452 */

            @Override // com.facebook.imagepipeline.producers.BaseProducerContextCallbacks, com.facebook.imagepipeline.producers.ProducerContextCallbacks
            public void onCancellationRequested() {
                if (submit.cancel(false)) {
                    callback.onCancellation();
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0039 A[SYNTHETIC, Splitter:B:26:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
    @com.facebook.common.internal.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fetchSync(com.facebook.imagepipeline.producers.FetchState r3, com.facebook.imagepipeline.producers.NetworkFetcher.Callback r4) {
        /*
            r2 = this;
            r0 = 0
            android.net.Uri r3 = r3.getUri()     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r1 = 5
            java.net.HttpURLConnection r3 = r2.downloadFrom(r3, r1)     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            if (r3 == 0) goto L_0x0017
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ IOException -> 0x0015 }
            r1 = -1
            r4.onResponse(r0, r1)     // Catch:{ IOException -> 0x0015 }
            goto L_0x0017
        L_0x0015:
            r1 = move-exception
            goto L_0x0026
        L_0x0017:
            if (r0 == 0) goto L_0x001e
            r0.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x001e
        L_0x001d:
        L_0x001e:
            if (r3 == 0) goto L_0x0035
            goto L_0x0032
        L_0x0021:
            r4 = move-exception
            r3 = r0
            goto L_0x0037
        L_0x0024:
            r1 = move-exception
            r3 = r0
        L_0x0026:
            r4.onFailure(r1)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r3 == 0) goto L_0x0035
        L_0x0032:
            r3.disconnect()
        L_0x0035:
            return
        L_0x0036:
            r4 = move-exception
        L_0x0037:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            if (r3 == 0) goto L_0x0043
            r3.disconnect()
        L_0x0043:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher.fetchSync(com.facebook.imagepipeline.producers.FetchState, com.facebook.imagepipeline.producers.NetworkFetcher$Callback):void");
    }

    public HttpUrlConnectionNetworkFetcher(int i) {
        this(Executors.newFixedThreadPool(3));
        this.mHttpConnectionTimeout = i;
    }

    @VisibleForTesting
    public HttpUrlConnectionNetworkFetcher(ExecutorService executorService) {
        this.mExecutorService = executorService;
    }
}
