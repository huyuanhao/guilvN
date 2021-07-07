package com.facebook.react.devsupport;

import android.util.Pair;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.BundleDeltaClient;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import com.umeng.message.util.HttpRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleDownloader {
    public static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;
    public static final String TAG = "BundleDownloader";
    public BundleDeltaClient mBundleDeltaClient;
    public final OkHttpClient mClient;
    @Nullable
    public Call mDownloadBundleFromURLCall;

    public static class BundleInfo {
        @Nullable
        public String mDeltaClientName;
        public int mFilesChangedCount;
        @Nullable
        public String mUrl;

        @Nullable
        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mDeltaClientName = jSONObject.getString("deltaClient");
                bundleInfo.mUrl = jSONObject.getString("url");
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException unused) {
                return null;
            }
        }

        @Nullable
        public String getDeltaClient() {
            return this.mDeltaClientName;
        }

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }

        public String getUrl() {
            String str = this.mUrl;
            return str != null ? str : "unknown";
        }

        @Nullable
        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("deltaClient", this.mDeltaClientName);
                jSONObject.put("url", this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    private String formatBundleUrl(String str, BundleDeltaClient.ClientType clientType) {
        BundleDeltaClient bundleDeltaClient;
        return (!BundleDeltaClient.isDeltaUrl(str) || (bundleDeltaClient = this.mBundleDeltaClient) == null || !bundleDeltaClient.canHandle(clientType)) ? str : this.mBundleDeltaClient.extendUrlForDelta(str);
    }

    private BundleDeltaClient getBundleDeltaClient(BundleDeltaClient.ClientType clientType) {
        BundleDeltaClient bundleDeltaClient = this.mBundleDeltaClient;
        if (bundleDeltaClient == null || !bundleDeltaClient.canHandle(clientType)) {
            this.mBundleDeltaClient = BundleDeltaClient.create(clientType);
        }
        return this.mBundleDeltaClient;
    }

    public static void populateBundleInfo(String str, Headers headers, BundleDeltaClient.ClientType clientType, BundleInfo bundleInfo) {
        bundleInfo.mDeltaClientName = clientType == BundleDeltaClient.ClientType.NONE ? null : clientType.name();
        bundleInfo.mUrl = str;
        String str2 = headers.get("X-Metro-Files-Changed-Count");
        if (str2 != null) {
            try {
                bundleInfo.mFilesChangedCount = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                bundleInfo.mFilesChangedCount = -2;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void processBundleResult(String str, int i, Headers headers, oOOO000O oooo000o, File file, BundleInfo bundleInfo, BundleDeltaClient.ClientType clientType, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        boolean z;
        if (i != 200) {
            String OooO0O0 = oooo000o.m19763OooO0O0();
            DebugServerException parse = DebugServerException.parse(OooO0O0);
            if (parse != null) {
                devBundleDownloadListener.onFailure(parse);
                return;
            }
            devBundleDownloadListener.onFailure(new DebugServerException("The development server returned response error code: " + i + "\n\n" + "URL: " + str + "\n\n" + "Body:\n" + OooO0O0));
            return;
        }
        if (bundleInfo != null) {
            populateBundleInfo(str, headers, clientType, bundleInfo);
        }
        File file2 = new File(file.getPath() + ".tmp");
        NativeDeltaClient nativeDeltaClient = null;
        if (BundleDeltaClient.isDeltaUrl(str)) {
            BundleDeltaClient bundleDeltaClient = getBundleDeltaClient(clientType);
            Assertions.assertNotNull(bundleDeltaClient);
            Pair<Boolean, NativeDeltaClient> processDelta = bundleDeltaClient.processDelta(headers, oooo000o, file2);
            z = ((Boolean) processDelta.first).booleanValue();
            nativeDeltaClient = (NativeDeltaClient) processDelta.second;
        } else {
            this.mBundleDeltaClient = null;
            z = storePlainJSInFile(oooo000o, file2);
        }
        if (!z || file2.renameTo(file)) {
            devBundleDownloadListener.onSuccess(nativeDeltaClient);
            return;
        }
        throw new IOException("Couldn't rename " + file2 + " to " + file);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void processMultipartResponse(final String str, final Response response, String str2, final File file, @Nullable final BundleInfo bundleInfo, final BundleDeltaClient.ClientType clientType, final DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        if (!new MultipartStreamReader(response.body().source(), str2).readAllParts(new MultipartStreamReader.ChunkListener() {
            /* class com.facebook.react.devsupport.BundleDownloader.C06732 */

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> map, OOOO000 oooo000, boolean z) throws IOException {
                if (z) {
                    int code = response.code();
                    if (map.containsKey("X-Http-Status")) {
                        code = Integer.parseInt(map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str, code, Headers.m14260of(map), oooo000, file, bundleInfo, clientType, devBundleDownloadListener);
                } else if (map.containsKey("Content-Type") && map.get("Content-Type").equals(HttpRequest.CONTENT_TYPE_JSON)) {
                    try {
                        JSONObject jSONObject = new JSONObject(oooo000.m16606OooO0O0());
                        Integer num = null;
                        String string = jSONObject.has("status") ? jSONObject.getString("status") : null;
                        Integer valueOf = jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null;
                        if (jSONObject.has("total")) {
                            num = Integer.valueOf(jSONObject.getInt("total"));
                        }
                        devBundleDownloadListener.onProgress(string, valueOf, num);
                    } catch (JSONException e) {
                        FLog.m873e(ReactConstants.TAG, "Error parsing progress JSON. " + e.toString());
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> map, long j, long j2) throws IOException {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener.onProgress("Downloading JavaScript bundle", Integer.valueOf((int) (j / 1024)), Integer.valueOf((int) (j2 / 1024)));
                }
            }
        })) {
            devBundleDownloadListener.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response.code() + "\n\nURL: " + str.toString() + "\n\n"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean storePlainJSInFile(com.p118pd.sdk.oOOO000O r0, java.io.File r1) throws java.io.IOException {
        /*
            com.pd.sdk.oOOoO0o0 r1 = com.p118pd.sdk.C9143oooO0oOo.OooO0O0(r1)     // Catch:{ all -> 0x0010 }
            r0.OooO00o(r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000c
            r1.close()
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.storePlainJSInFile(com.pd.sdk.oOOO000O, java.io.File):boolean");
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, @Nullable BundleInfo bundleInfo, BundleDeltaClient.ClientType clientType) {
        downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, clientType, new Request.Builder());
    }

    public void downloadBundleFromURL(final DevBundleDownloadListener devBundleDownloadListener, final File file, String str, @Nullable final BundleInfo bundleInfo, final BundleDeltaClient.ClientType clientType, Request.Builder builder) {
        Call call = (Call) Assertions.assertNotNull(this.mClient.newCall(builder.url(formatBundleUrl(str, clientType)).build()));
        this.mDownloadBundleFromURLCall = call;
        call.enqueue(new Callback() {
            /* class com.facebook.react.devsupport.BundleDownloader.C06721 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                DevBundleDownloadListener devBundleDownloadListener = devBundleDownloadListener;
                devBundleDownloadListener.onFailure(DebugServerException.makeGeneric("Could not connect to development server.", "URL: " + call.request().url().toString(), iOException));
            }

            /* JADX WARNING: Code restructure failed: missing block: B:15:0x007a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x007b, code lost:
                if (r11 != null) goto L_0x007d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                r11.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
                r11 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
                r10.addSuppressed(r11);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
                throw r0;
             */
            @Override // okhttp3.Callback
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResponse(okhttp3.Call r10, okhttp3.Response r11) throws java.io.IOException {
                /*
                // Method dump skipped, instructions count: 140
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDownloader.C06721.onResponse(okhttp3.Call, okhttp3.Response):void");
            }
        });
    }
}
