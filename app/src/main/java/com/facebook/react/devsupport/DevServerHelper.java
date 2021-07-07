package com.facebook.react.devsupport;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.C0587R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.devsupport.BundleDeltaClient;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.InspectorPackagerConnection;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.RequestOnlyHandler;
import com.facebook.react.packagerconnection.Responder;
import com.p118pd.sdk.C1IlLiL1;
import com.umeng.message.common.C3777a;
import com.umeng.message.util.HttpRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DevServerHelper {
    public static final String DEBUGGER_MSG_DISABLE = "{ \"id\":1,\"method\":\"Debugger.disable\" }";
    public static final int HTTP_CONNECT_TIMEOUT_MS = 5000;
    public static final int LONG_POLL_FAILURE_DELAY_MS = 5000;
    public static final int LONG_POLL_KEEP_ALIVE_DURATION_MS = 120000;
    public static final String PACKAGER_OK_STATUS = "packager-status:running";
    public static final String RELOAD_APP_EXTRA_JS_PROXY = "jsproxy";
    public final BundleDownloader mBundleDownloader;
    public InspectorPackagerConnection.BundleStatusProvider mBundlerStatusProvider;
    public final OkHttpClient mClient;
    @Nullable
    public InspectorPackagerConnection mInspectorPackagerConnection;
    @Nullable
    public OkHttpClient mOnChangePollingClient;
    public boolean mOnChangePollingEnabled;
    @Nullable
    public OnServerContentChangeListener mOnServerContentChangeListener;
    public final String mPackageName;
    @Nullable
    public JSPackagerClient mPackagerClient;
    public final Handler mRestartOnChangePollingHandler = new Handler(Looper.getMainLooper());
    public final DevInternalSettings mSettings;

    public enum BundleType {
        BUNDLE("bundle"),
        DELTA(C3777a.f10015C),
        MAP("map");
        
        public final String mTypeID;

        /* access modifiers changed from: public */
        BundleType(String str) {
            this.mTypeID = str;
        }

        public String typeID() {
            return this.mTypeID;
        }
    }

    public interface OnServerContentChangeListener {
        void onServerContentChanged();
    }

    public interface PackagerCommandListener {
        @Nullable
        Map<String, RequestHandler> customCommandHandlers();

        void onCaptureHeapCommand(Responder responder);

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    public interface PackagerCustomCommandProvider {
    }

    public interface SymbolicationListener {
        void onSymbolicationComplete(@Nullable Iterable<StackFrame> iterable);
    }

    public DevServerHelper(DevInternalSettings devInternalSettings, String str, InspectorPackagerConnection.BundleStatusProvider bundleStatusProvider) {
        this.mSettings = devInternalSettings;
        this.mBundlerStatusProvider = bundleStatusProvider;
        OkHttpClient build = new OkHttpClient.Builder().connectTimeout(WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).build();
        this.mClient = build;
        this.mBundleDownloader = new BundleDownloader(build);
        this.mPackageName = str;
    }

    private String createBundleURL(String str, BundleType bundleType, String str2) {
        return String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&minify=%s", str2, str, bundleType.typeID(), Boolean.valueOf(getDevMode()), Boolean.valueOf(getJSMinifyMode()));
    }

    private String createLaunchJSDevtoolsCommandUrl() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    private String createOnChangeEndpointUrl() {
        return String.format(Locale.US, "http://%s/onchange", this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public static String createOpenStackFrameURL(String str) {
        return String.format(Locale.US, "http://%s/open-stack-frame", str);
    }

    public static String createPackagerStatusURL(String str) {
        return String.format(Locale.US, "http://%s/status", str);
    }

    public static String createResourceURL(String str, String str2) {
        return String.format(Locale.US, "http://%s/%s", str, str2);
    }

    public static String createSymbolicateURL(String str) {
        return String.format(Locale.US, "http://%s/symbolicate", str);
    }

    private void enqueueOnChangeEndpointLongPolling() {
        ((OkHttpClient) Assertions.assertNotNull(this.mOnChangePollingClient)).newCall(new Request.Builder().url(createOnChangeEndpointUrl()).tag(this).build()).enqueue(new Callback() {
            /* class com.facebook.react.devsupport.DevServerHelper.C068310 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                if (DevServerHelper.this.mOnChangePollingEnabled) {
                    FLog.m866d(ReactConstants.TAG, "Error while requesting /onchange endpoint", (Throwable) iOException);
                    DevServerHelper.this.mRestartOnChangePollingHandler.postDelayed(new Runnable() {
                        /* class com.facebook.react.devsupport.DevServerHelper.C068310.RunnableC06841 */

                        public void run() {
                            DevServerHelper.this.handleOnChangePollingResponse(false);
                        }
                    }, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                DevServerHelper.this.handleOnChangePollingResponse(response.code() == 205);
            }
        });
    }

    private BundleDeltaClient.ClientType getDeltaClientType() {
        if (this.mSettings.isBundleDeltasCppEnabled()) {
            return BundleDeltaClient.ClientType.NATIVE;
        }
        if (this.mSettings.isBundleDeltasEnabled()) {
            return BundleDeltaClient.ClientType.DEV_SUPPORT;
        }
        return BundleDeltaClient.ClientType.NONE;
    }

    private boolean getDevMode() {
        return this.mSettings.isJSDevModeEnabled();
    }

    private String getHostForJSProxy() {
        String str = (String) Assertions.assertNotNull(this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
        int lastIndexOf = str.lastIndexOf(58);
        if (lastIndexOf <= -1) {
            return AndroidInfoHelpers.DEVICE_LOCALHOST;
        }
        return AndroidInfoHelpers.DEVICE_LOCALHOST + str.substring(lastIndexOf);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getInspectorAttachUrl(String str) {
        return String.format(Locale.US, "http://%s/nuclide/attach-debugger-nuclide?title=%s&app=%s&device=%s", AndroidInfoHelpers.getServerHost(), str, this.mPackageName, AndroidInfoHelpers.getFriendlyDeviceName());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getInspectorDeviceUrl() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s", this.mSettings.getPackagerConnectionSettings().getInspectorServerHost(), AndroidInfoHelpers.getFriendlyDeviceName(), this.mPackageName);
    }

    private boolean getJSMinifyMode() {
        return this.mSettings.isJSMinifyEnabled();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void handleOnChangePollingResponse(boolean z) {
        if (this.mOnChangePollingEnabled) {
            if (z) {
                UiThreadUtil.runOnUiThread(new Runnable() {
                    /* class com.facebook.react.devsupport.DevServerHelper.RunnableC06939 */

                    public void run() {
                        if (DevServerHelper.this.mOnServerContentChangeListener != null) {
                            DevServerHelper.this.mOnServerContentChangeListener.onServerContentChanged();
                        }
                    }
                });
            }
            enqueueOnChangeEndpointLongPolling();
        }
    }

    public void attachDebugger(final Context context, final String str) {
        new AsyncTask<Void, String, Boolean>() {
            /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06895 */

            public boolean doSync() {
                try {
                    new OkHttpClient().newCall(new Request.Builder().url(DevServerHelper.this.getInspectorAttachUrl(str)).build()).execute();
                    return true;
                } catch (IOException e) {
                    FLog.m874e(ReactConstants.TAG, "Failed to send attach request to Inspector", e);
                    return false;
                }
            }

            public Boolean doInBackground(Void... voidArr) {
                return Boolean.valueOf(doSync());
            }

            public void onPostExecute(Boolean bool) {
                if (!bool.booleanValue()) {
                    Toast.makeText(context, context.getString(C0587R.string.catalyst_debugjs_nuclide_failure), 1).show();
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() {
            /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06884 */

            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mInspectorPackagerConnection != null) {
                    DevServerHelper.this.mInspectorPackagerConnection.closeQuietly();
                    DevServerHelper.this.mInspectorPackagerConnection = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() {
            /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06862 */

            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mPackagerClient != null) {
                    DevServerHelper.this.mPackagerClient.close();
                    DevServerHelper.this.mPackagerClient = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void disableDebugger() {
        InspectorPackagerConnection inspectorPackagerConnection = this.mInspectorPackagerConnection;
        if (inspectorPackagerConnection != null) {
            inspectorPackagerConnection.sendEventToAllConnections(DEBUGGER_MSG_DISABLE);
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo) {
        this.mBundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, getDeltaClientType());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r0 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        throw r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File downloadBundleResourceFromUrlSync(java.lang.String r5, java.io.File r6) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.DevServerHelper.downloadBundleResourceFromUrlSync(java.lang.String, java.io.File):java.io.File");
    }

    public String getDevServerBundleURL(String str) {
        return createBundleURL(str, this.mSettings.isBundleDeltasEnabled() ? BundleType.DELTA : BundleType.BUNDLE, this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public String getJSBundleURLForRemoteDebugging(String str) {
        return createBundleURL(str, BundleType.BUNDLE, getHostForJSProxy());
    }

    public String getSourceMapUrl(String str) {
        return createBundleURL(str, BundleType.MAP);
    }

    public String getSourceUrl(String str) {
        return createBundleURL(str, this.mSettings.isBundleDeltasEnabled() ? BundleType.DELTA : BundleType.BUNDLE);
    }

    public String getWebsocketProxyURL() {
        return String.format(Locale.US, "ws://%s/debugger-proxy?role=client", this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }

    public void isPackagerRunning(final PackagerStatusCallback packagerStatusCallback) {
        this.mClient.newCall(new Request.Builder().url(createPackagerStatusURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost())).build()).enqueue(new Callback() {
            /* class com.facebook.react.devsupport.DevServerHelper.C06928 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                FLog.m913w(ReactConstants.TAG, "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
                packagerStatusCallback.onPackagerStatusFetched(false);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    FLog.m873e(ReactConstants.TAG, "Got non-success http code from packager when requesting status: " + response.code());
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                ResponseBody body = response.body();
                if (body == null) {
                    FLog.m873e(ReactConstants.TAG, "Got null body response from packager when requesting status");
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                String string = body.string();
                if (!DevServerHelper.PACKAGER_OK_STATUS.equals(string)) {
                    FLog.m873e(ReactConstants.TAG, "Got unexpected response from packager when requesting status: " + string);
                    packagerStatusCallback.onPackagerStatusFetched(false);
                    return;
                }
                packagerStatusCallback.onPackagerStatusFetched(true);
            }
        });
    }

    public void launchJSDevtools() {
        this.mClient.newCall(new Request.Builder().url(createLaunchJSDevtoolsCommandUrl()).build()).enqueue(new Callback() {
            /* class com.facebook.react.devsupport.DevServerHelper.C068511 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
            }
        });
    }

    public void openInspectorConnection() {
        if (this.mInspectorPackagerConnection != null) {
            FLog.m913w(ReactConstants.TAG, "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() {
                /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06873 */

                public Void doInBackground(Void... voidArr) {
                    DevServerHelper devServerHelper = DevServerHelper.this;
                    devServerHelper.mInspectorPackagerConnection = new InspectorPackagerConnection(devServerHelper.getInspectorDeviceUrl(), DevServerHelper.this.mPackageName, DevServerHelper.this.mBundlerStatusProvider);
                    DevServerHelper.this.mInspectorPackagerConnection.connect();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void openPackagerConnection(final String str, final PackagerCommandListener packagerCommandListener) {
        if (this.mPackagerClient != null) {
            FLog.m913w(ReactConstants.TAG, "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() {
                /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06781 */

                public Void doInBackground(Void... voidArr) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("reload", new NotificationOnlyHandler() {
                        /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06781.C06791 */

                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(@Nullable Object obj) {
                            packagerCommandListener.onPackagerReloadCommand();
                        }
                    });
                    hashMap.put("devMenu", new NotificationOnlyHandler() {
                        /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06781.C06802 */

                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(@Nullable Object obj) {
                            packagerCommandListener.onPackagerDevMenuCommand();
                        }
                    });
                    hashMap.put("captureHeap", new RequestOnlyHandler() {
                        /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06781.C06813 */

                        @Override // com.facebook.react.packagerconnection.RequestHandler, com.facebook.react.packagerconnection.RequestOnlyHandler
                        public void onRequest(@Nullable Object obj, Responder responder) {
                            packagerCommandListener.onCaptureHeapCommand(responder);
                        }
                    });
                    Map<String, RequestHandler> customCommandHandlers = packagerCommandListener.customCommandHandlers();
                    if (customCommandHandlers != null) {
                        hashMap.putAll(customCommandHandlers);
                    }
                    hashMap.putAll(new FileIoHandler().handlers());
                    C06824 r0 = new ReconnectingWebSocket.ConnectionCallback() {
                        /* class com.facebook.react.devsupport.DevServerHelper.AsyncTaskC06781.C06824 */

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onConnected() {
                            packagerCommandListener.onPackagerConnected();
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onDisconnected() {
                            packagerCommandListener.onPackagerDisconnected();
                        }
                    };
                    DevServerHelper.this.mPackagerClient = new JSPackagerClient(str, DevServerHelper.this.mSettings.getPackagerConnectionSettings(), hashMap, r0);
                    DevServerHelper.this.mPackagerClient.init();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void openStackFrameCall(StackFrame stackFrame) {
        ((Call) Assertions.assertNotNull(this.mClient.newCall(new Request.Builder().url(createOpenStackFrameURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost())).post(RequestBody.create(MediaType.parse(HttpRequest.CONTENT_TYPE_JSON), stackFrame.toJSON().toString())).build()))).enqueue(new Callback() {
            /* class com.facebook.react.devsupport.DevServerHelper.C06917 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                FLog.m913w(ReactConstants.TAG, "Got IOException when attempting to open stack frame: " + iOException.getMessage());
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
            }
        });
    }

    public void startPollingOnChangeEndpoint(OnServerContentChangeListener onServerContentChangeListener) {
        if (!this.mOnChangePollingEnabled) {
            this.mOnChangePollingEnabled = true;
            this.mOnServerContentChangeListener = onServerContentChangeListener;
            this.mOnChangePollingClient = new OkHttpClient.Builder().connectionPool(new ConnectionPool(1, C1IlLiL1.f22762OooO0O0, TimeUnit.MILLISECONDS)).connectTimeout(WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS, TimeUnit.MILLISECONDS).build();
            enqueueOnChangeEndpointLongPolling();
        }
    }

    public void stopPollingOnChangeEndpoint() {
        this.mOnChangePollingEnabled = false;
        this.mRestartOnChangePollingHandler.removeCallbacksAndMessages(null);
        OkHttpClient okHttpClient = this.mOnChangePollingClient;
        if (okHttpClient != null) {
            OkHttpCallUtil.cancelTag(okHttpClient, this);
            this.mOnChangePollingClient = null;
        }
        this.mOnServerContentChangeListener = null;
    }

    public void symbolicateStackTrace(Iterable<StackFrame> iterable, final SymbolicationListener symbolicationListener) {
        try {
            String createSymbolicateURL = createSymbolicateURL(this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
            JSONArray jSONArray = new JSONArray();
            for (StackFrame stackFrame : iterable) {
                jSONArray.put(stackFrame.toJSON());
            }
            ((Call) Assertions.assertNotNull(this.mClient.newCall(new Request.Builder().url(createSymbolicateURL).post(RequestBody.create(MediaType.parse(HttpRequest.CONTENT_TYPE_JSON), new JSONObject().put("stack", jSONArray).toString())).build()))).enqueue(new Callback() {
                /* class com.facebook.react.devsupport.DevServerHelper.C06906 */

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    FLog.m913w(ReactConstants.TAG, "Got IOException when attempting symbolicate stack trace: " + iOException.getMessage());
                    symbolicationListener.onSymbolicationComplete(null);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    try {
                        symbolicationListener.onSymbolicationComplete(Arrays.asList(StackTraceHelper.convertJsStackTrace(new JSONObject(response.body().string()).getJSONArray("stack"))));
                    } catch (JSONException unused) {
                        symbolicationListener.onSymbolicationComplete(null);
                    }
                }
            });
        } catch (JSONException e) {
            FLog.m913w(ReactConstants.TAG, "Got JSONException when attempting symbolicate stack trace: " + e.getMessage());
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo, Request.Builder builder) {
        this.mBundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, getDeltaClientType(), builder);
    }

    private String createBundleURL(String str, BundleType bundleType) {
        return createBundleURL(str, bundleType, this.mSettings.getPackagerConnectionSettings().getDebugServerHost());
    }
}
