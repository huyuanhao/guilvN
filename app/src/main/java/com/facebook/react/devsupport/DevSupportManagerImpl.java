package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.facebook.common.logging.FLog;
import com.facebook.debug.holder.PrinterHolder;
import com.facebook.debug.tags.ReactDebugOverlayTags;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.C0587R;
import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.bridge.NativeDeltaClient;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.common.futures.SimpleSettableFuture;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.DevInternalSettings;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.InspectorPackagerConnection;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.JSCSamplingProfiler;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.Responder;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class DevSupportManagerImpl implements DevSupportManager, DevServerHelper.PackagerCommandListener, DevInternalSettings.Listener {
    public static final String EMOJI_FACE_WITH_NO_GOOD_GESTURE = " 🙅";
    public static final String EMOJI_HUNDRED_POINTS_SYMBOL = " 💯";
    public static final String EXOPACKAGE_LOCATION_FORMAT = "/data/local/tmp/exopackage/%s//secondary-dex";
    public static final int JAVA_ERROR_COOKIE = -1;
    public static final int JSEXCEPTION_ERROR_COOKIE = -1;
    public static final String JS_BUNDLE_FILE_NAME = "ReactNativeDevBundle.js";
    public static final String RELOAD_APP_ACTION_SUFFIX = ".RELOAD_APP_ACTION";
    public final Context mApplicationContext;
    @Nullable
    public DevBundleDownloadListener mBundleDownloadListener;
    public InspectorPackagerConnection.BundleStatus mBundleStatus;
    @Nullable
    public ReactContext mCurrentContext;
    public final LinkedHashMap<String, DevOptionHandler> mCustomDevOptions;
    @Nullable
    public Map<String, RequestHandler> mCustomPackagerCommandHandlers;
    @Nullable
    public DebugOverlayController mDebugOverlayController;
    public final DefaultNativeModuleCallExceptionHandler mDefaultNativeModuleCallExceptionHandler;
    public final DevLoadingViewController mDevLoadingViewController;
    public boolean mDevLoadingViewVisible;
    @Nullable
    public AlertDialog mDevOptionsDialog;
    public final DevServerHelper mDevServerHelper;
    public DevInternalSettings mDevSettings;
    @Nullable
    public List<ErrorCustomizer> mErrorCustomizers;
    public final List<ExceptionLogger> mExceptionLoggers;
    public boolean mIsDevSupportEnabled;
    public boolean mIsReceiverRegistered;
    public boolean mIsShakeDetectorStarted;
    @Nullable
    public final String mJSAppBundleName;
    public final File mJSBundleTempFile;
    public int mLastErrorCookie;
    @Nullable
    public StackFrame[] mLastErrorStack;
    @Nullable
    public String mLastErrorTitle;
    @Nullable
    public ErrorType mLastErrorType;
    public final ReactInstanceManagerDevHelper mReactInstanceManagerHelper;
    @Nullable
    public RedBoxDialog mRedBoxDialog;
    @Nullable
    public RedBoxHandler mRedBoxHandler;
    public final BroadcastReceiver mReloadAppBroadcastReceiver;
    public final ShakeDetector mShakeDetector;

    public enum ErrorType {
        JS,
        NATIVE
    }

    public interface ExceptionLogger {
        void log(Exception exc);
    }

    public class JSExceptionLogger implements ExceptionLogger {
        public JSExceptionLogger() {
        }

        @Override // com.facebook.react.devsupport.DevSupportManagerImpl.ExceptionLogger
        public void log(Exception exc) {
            StringBuilder sb = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
            for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
                sb.append("\n\n");
                sb.append(cause.getMessage());
            }
            if (exc instanceof JSException) {
                FLog.m874e(ReactConstants.TAG, "Exception in native call from JS", exc);
                String stack = ((JSException) exc).getStack();
                sb.append("\n\n");
                sb.append(stack);
                DevSupportManagerImpl.this.showNewError(sb.toString(), new StackFrame[0], -1, ErrorType.JS);
                return;
            }
            DevSupportManagerImpl.this.showNewJavaError(sb.toString(), exc);
        }
    }

    public static class JscProfileTask extends AsyncTask<String, Void, Void> {
        public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        public final String mSourceUrl;

        public JscProfileTask(String str) {
            this.mSourceUrl = str;
        }

        public Void doInBackground(String... strArr) {
            try {
                String uri = Uri.parse(this.mSourceUrl).buildUpon().path("/jsc-profile").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (String str : strArr) {
                    okHttpClient.newCall(new Request.Builder().url(uri).post(RequestBody.create(JSON, str)).build()).execute();
                }
            } catch (IOException e) {
                FLog.m874e(ReactConstants.TAG, "Failed not talk to server", e);
            }
            return null;
        }
    }

    public DevSupportManagerImpl(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, @Nullable String str, boolean z, int i) {
        this(context, reactInstanceManagerDevHelper, str, z, null, null, i, null);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WebsocketJavaScriptExecutor.JSExecutorConnectCallback getExecutorConnectCallback(final SimpleSettableFuture<Boolean> simpleSettableFuture) {
        return new WebsocketJavaScriptExecutor.JSExecutorConnectCallback() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.C070923 */

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th) {
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
                FLog.m874e(ReactConstants.TAG, "Unable to connect to remote debugger", th);
                simpleSettableFuture.setException(new IOException(DevSupportManagerImpl.this.mApplicationContext.getString(C0587R.string.catalyst_remotedbg_error), th));
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                simpleSettableFuture.set(true);
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
            }
        };
    }

    public static String getReloadAppAction(Context context) {
        return context.getPackageName() + RELOAD_APP_ACTION_SUFFIX;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void handleCaptureHeap(final Responder responder) {
        ReactContext reactContext = this.mCurrentContext;
        if (reactContext != null) {
            ((JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)).captureHeap(this.mApplicationContext.getCacheDir().getPath(), new JSCHeapCapture.CaptureCallback() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C070721 */

                @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
                public void onFailure(JSCHeapCapture.CaptureException captureException) {
                    responder.error(captureException.toString());
                }

                @Override // com.facebook.react.devsupport.JSCHeapCapture.CaptureCallback
                public void onSuccess(File file) {
                    responder.respond(file.toString());
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void handlePokeSamplingProfiler() {
        try {
            Iterator<String> it = JSCSamplingProfiler.poke(60000).iterator();
            while (it.hasNext()) {
                String next = it.next();
                Toast.makeText(this.mCurrentContext, next == null ? "Started JSC Sampling Profiler" : "Stopped JSC Sampling Profiler", 1).show();
                new JscProfileTask(getSourceUrl()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, next);
            }
        } catch (JSCSamplingProfiler.ProfilerException e) {
            showNewJavaError(e.getMessage(), e);
        }
    }

    private void hideDevOptionsDialog() {
        AlertDialog alertDialog = this.mDevOptionsDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.mDevOptionsDialog = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> pair) {
        List<ErrorCustomizer> list = this.mErrorCustomizers;
        if (list == null) {
            return pair;
        }
        for (ErrorCustomizer errorCustomizer : list) {
            Pair<String, StackFrame[]> customizeErrorInfo = errorCustomizer.customizeErrorInfo(pair);
            if (customizeErrorInfo != null) {
                pair = customizeErrorInfo;
            }
        }
        return pair;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void reload() {
        UiThreadUtil.assertOnUiThread();
        if (this.mIsDevSupportEnabled) {
            DebugOverlayController debugOverlayController = this.mDebugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(this.mDevSettings.isFpsDebugEnabled());
            }
            if (!this.mIsShakeDetectorStarted) {
                this.mShakeDetector.start((SensorManager) this.mApplicationContext.getSystemService(C3617o.f9339Z));
                this.mIsShakeDetectorStarted = true;
            }
            if (!this.mIsReceiverRegistered) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(getReloadAppAction(this.mApplicationContext));
                this.mApplicationContext.registerReceiver(this.mReloadAppBroadcastReceiver, intentFilter);
                this.mIsReceiverRegistered = true;
            }
            if (this.mDevLoadingViewVisible) {
                this.mDevLoadingViewController.showMessage("Reloading...");
            }
            this.mDevServerHelper.openPackagerConnection(DevSupportManagerImpl.class.getSimpleName(), this);
            if (this.mDevSettings.isReloadOnJSChangeEnabled()) {
                this.mDevServerHelper.startPollingOnChangeEndpoint(new DevServerHelper.OnServerContentChangeListener() {
                    /* class com.facebook.react.devsupport.DevSupportManagerImpl.C071325 */

                    @Override // com.facebook.react.devsupport.DevServerHelper.OnServerContentChangeListener
                    public void onServerContentChanged() {
                        DevSupportManagerImpl.this.handleReloadJS();
                    }
                });
            } else {
                this.mDevServerHelper.stopPollingOnChangeEndpoint();
            }
        } else {
            DebugOverlayController debugOverlayController2 = this.mDebugOverlayController;
            if (debugOverlayController2 != null) {
                debugOverlayController2.setFpsDebugViewVisible(false);
            }
            if (this.mIsShakeDetectorStarted) {
                this.mShakeDetector.stop();
                this.mIsShakeDetectorStarted = false;
            }
            if (this.mIsReceiverRegistered) {
                this.mApplicationContext.unregisterReceiver(this.mReloadAppBroadcastReceiver);
                this.mIsReceiverRegistered = false;
            }
            hideRedboxDialog();
            hideDevOptionsDialog();
            this.mDevLoadingViewController.hide();
            this.mDevServerHelper.closePackagerConnection();
            this.mDevServerHelper.stopPollingOnChangeEndpoint();
        }
    }

    private void reloadJSInProxyMode() {
        this.mDevServerHelper.launchJSDevtools();
        this.mReactInstanceManagerHelper.onReloadWithJSDebugger(new JavaJSExecutor.Factory() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.C070822 */

            @Override // com.facebook.react.bridge.JavaJSExecutor.Factory
            public JavaJSExecutor create() throws Exception {
                WebsocketJavaScriptExecutor websocketJavaScriptExecutor = new WebsocketJavaScriptExecutor();
                SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
                websocketJavaScriptExecutor.connect(DevSupportManagerImpl.this.mDevServerHelper.getWebsocketProxyURL(), DevSupportManagerImpl.this.getExecutorConnectCallback(simpleSettableFuture));
                try {
                    simpleSettableFuture.get(90, TimeUnit.SECONDS);
                    return websocketJavaScriptExecutor;
                } catch (ExecutionException e) {
                    throw ((Exception) e.getCause());
                } catch (InterruptedException | TimeoutException e2) {
                    throw new RuntimeException(e2);
                }
            }
        });
    }

    private void resetCurrentContext(@Nullable ReactContext reactContext) {
        if (this.mCurrentContext != reactContext) {
            this.mCurrentContext = reactContext;
            DebugOverlayController debugOverlayController = this.mDebugOverlayController;
            if (debugOverlayController != null) {
                debugOverlayController.setFpsDebugViewVisible(false);
            }
            if (reactContext != null) {
                this.mDebugOverlayController = new DebugOverlayController(reactContext);
            }
            if (this.mDevSettings.isHotModuleReplacementEnabled() && this.mCurrentContext != null) {
                try {
                    URL url = new URL(getSourceUrl());
                    ((HMRClient) this.mCurrentContext.getJSModule(HMRClient.class)).enable("android", url.getPath().substring(1), url.getHost(), url.getPort());
                } catch (MalformedURLException e) {
                    showNewJavaError(e.getMessage(), e);
                }
            }
            reloadSettings();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void showNewError(@Nullable final String str, final StackFrame[] stackFrameArr, final int i, final ErrorType errorType) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.RunnableC07165 */

            public void run() {
                if (DevSupportManagerImpl.this.mRedBoxDialog == null) {
                    Activity currentActivity = DevSupportManagerImpl.this.mReactInstanceManagerHelper.getCurrentActivity();
                    if (currentActivity == null || currentActivity.isFinishing()) {
                        FLog.m873e(ReactConstants.TAG, "Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: " + str);
                        return;
                    }
                    DevSupportManagerImpl devSupportManagerImpl = DevSupportManagerImpl.this;
                    DevSupportManagerImpl devSupportManagerImpl2 = DevSupportManagerImpl.this;
                    devSupportManagerImpl.mRedBoxDialog = new RedBoxDialog(currentActivity, devSupportManagerImpl2, devSupportManagerImpl2.mRedBoxHandler);
                }
                if (!DevSupportManagerImpl.this.mRedBoxDialog.isShowing()) {
                    Pair processErrorCustomizers = DevSupportManagerImpl.this.processErrorCustomizers(Pair.create(str, stackFrameArr));
                    DevSupportManagerImpl.this.mRedBoxDialog.setExceptionDetails((String) processErrorCustomizers.first, (StackFrame[]) processErrorCustomizers.second);
                    DevSupportManagerImpl.this.updateLastErrorInfo(str, stackFrameArr, i, errorType);
                    if (DevSupportManagerImpl.this.mRedBoxHandler != null && errorType == ErrorType.NATIVE) {
                        DevSupportManagerImpl.this.mRedBoxHandler.handleRedbox(str, stackFrameArr, RedBoxHandler.ErrorType.NATIVE);
                    }
                    DevSupportManagerImpl.this.mRedBoxDialog.resetReporting();
                    DevSupportManagerImpl.this.mRedBoxDialog.show();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void updateLastErrorInfo(@Nullable String str, StackFrame[] stackFrameArr, int i, ErrorType errorType) {
        this.mLastErrorTitle = str;
        this.mLastErrorStack = stackFrameArr;
        this.mLastErrorCookie = i;
        this.mLastErrorType = errorType;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(String str, DevOptionHandler devOptionHandler) {
        this.mCustomDevOptions.put(str, devOptionHandler);
    }

    @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
    @Nullable
    public Map<String, RequestHandler> customCommandHandlers() {
        return this.mCustomPackagerCommandHandlers;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public File downloadBundleResourceFromUrlSync(String str, File file) {
        return this.mDevServerHelper.downloadBundleResourceFromUrlSync(str, file);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public DeveloperSettings getDevSettings() {
        return this.mDevSettings;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getDevSupportEnabled() {
        return this.mIsDevSupportEnabled;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getDownloadedJSBundleFile() {
        return this.mJSBundleTempFile.getAbsolutePath();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getJSBundleURLForRemoteDebugging() {
        return this.mDevServerHelper.getJSBundleURLForRemoteDebugging((String) Assertions.assertNotNull(this.mJSAppBundleName));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public StackFrame[] getLastErrorStack() {
        return this.mLastErrorStack;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    @Nullable
    public String getLastErrorTitle() {
        return this.mLastErrorTitle;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceMapUrl() {
        String str = this.mJSAppBundleName;
        if (str == null) {
            return "";
        }
        return this.mDevServerHelper.getSourceMapUrl((String) Assertions.assertNotNull(str));
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceUrl() {
        String str = this.mJSAppBundleName;
        if (str == null) {
            return "";
        }
        return this.mDevServerHelper.getSourceUrl((String) Assertions.assertNotNull(str));
    }

    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        if (this.mIsDevSupportEnabled) {
            for (ExceptionLogger exceptionLogger : this.mExceptionLoggers) {
                exceptionLogger.log(exc);
            }
            return;
        }
        this.mDefaultNativeModuleCallExceptionHandler.handleException(exc);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, this.mDevSettings.getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        if (this.mDevSettings.isRemoteJSDebugEnabled()) {
            PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: load from Proxy");
            this.mDevLoadingViewController.showForRemoteJSEnabled();
            this.mDevLoadingViewVisible = true;
            reloadJSInProxyMode();
            return;
        }
        PrinterHolder.getPrinter().logMessage(ReactDebugOverlayTags.RN_CORE, "RNCore: load from Server");
        reloadJSFromServer(this.mDevServerHelper.getDevServerBundleURL((String) Assertions.assertNotNull(this.mJSAppBundleName)));
    }

    public boolean hasBundleInAssets(String str) {
        String[] list;
        try {
            for (String str2 : this.mApplicationContext.getAssets().list("")) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        } catch (IOException unused) {
            FLog.m873e(ReactConstants.TAG, "Error while loading assets list");
        }
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() {
        if (this.mIsDevSupportEnabled && this.mJSBundleTempFile.exists()) {
            try {
                String packageName = this.mApplicationContext.getPackageName();
                if (this.mJSBundleTempFile.lastModified() > this.mApplicationContext.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, EXOPACKAGE_LOCATION_FORMAT, packageName));
                    if (!file.exists() || this.mJSBundleTempFile.lastModified() > file.lastModified()) {
                        return true;
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                FLog.m873e(ReactConstants.TAG, "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
        RedBoxDialog redBoxDialog = this.mRedBoxDialog;
        if (redBoxDialog != null) {
            redBoxDialog.dismiss();
            this.mRedBoxDialog = null;
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(PackagerStatusCallback packagerStatusCallback) {
        this.mDevServerHelper.isPackagerRunning(packagerStatusCallback);
    }

    @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
    public void onCaptureHeapCommand(final Responder responder) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.RunnableC070620 */

            public void run() {
                DevSupportManagerImpl.this.handleCaptureHeap(responder);
            }
        });
    }

    @Override // com.facebook.react.devsupport.DevInternalSettings.Listener
    public void onInternalSettingsChanged() {
        reloadSettings();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(ReactContext reactContext) {
        resetCurrentContext(reactContext);
    }

    @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
    public void onPackagerConnected() {
    }

    @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
    public void onPackagerDevMenuCommand() {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.RunnableC070419 */

            public void run() {
                DevSupportManagerImpl.this.showDevOptionsDialog();
            }
        });
    }

    @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
    public void onPackagerDisconnected() {
    }

    @Override // com.facebook.react.devsupport.DevServerHelper.PackagerCommandListener
    public void onPackagerReloadCommand() {
        this.mDevServerHelper.disableDebugger();
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.RunnableC070318 */

            public void run() {
                DevSupportManagerImpl.this.handleReloadJS();
            }
        });
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(ReactContext reactContext) {
        if (reactContext == this.mCurrentContext) {
            resetCurrentContext(null);
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
        if (this.mErrorCustomizers == null) {
            this.mErrorCustomizers = new ArrayList();
        }
        this.mErrorCustomizers.add(errorCustomizer);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String str) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        this.mDevLoadingViewController.showForUrl(str);
        this.mDevLoadingViewVisible = true;
        final BundleDownloader.BundleInfo bundleInfo = new BundleDownloader.BundleInfo();
        this.mDevServerHelper.downloadBundleFromURL(new DevBundleDownloadListener() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.C071024 */

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onFailure(final Exception exc) {
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
                synchronized (DevSupportManagerImpl.this) {
                    DevSupportManagerImpl.this.mBundleStatus.isLastDownloadSucess = false;
                }
                if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                    DevSupportManagerImpl.this.mBundleDownloadListener.onFailure(exc);
                }
                FLog.m874e(ReactConstants.TAG, "Unable to download JS bundle", exc);
                UiThreadUtil.runOnUiThread(new Runnable() {
                    /* class com.facebook.react.devsupport.DevSupportManagerImpl.C071024.RunnableC07122 */

                    public void run() {
                        Exception exc = exc;
                        if (exc instanceof DebugServerException) {
                            DevSupportManagerImpl.this.showNewJavaError(((DebugServerException) exc).getMessage(), exc);
                            return;
                        }
                        DevSupportManagerImpl devSupportManagerImpl = DevSupportManagerImpl.this;
                        devSupportManagerImpl.showNewJavaError(devSupportManagerImpl.mApplicationContext.getString(C0587R.string.catalyst_jsload_error), exc);
                    }
                });
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onProgress(@Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
                DevSupportManagerImpl.this.mDevLoadingViewController.updateProgress(str, num, num2);
                if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                    DevSupportManagerImpl.this.mBundleDownloadListener.onProgress(str, num, num2);
                }
            }

            @Override // com.facebook.react.devsupport.interfaces.DevBundleDownloadListener
            public void onSuccess(@Nullable final NativeDeltaClient nativeDeltaClient) {
                DevSupportManagerImpl.this.mDevLoadingViewController.hide();
                DevSupportManagerImpl.this.mDevLoadingViewVisible = false;
                synchronized (DevSupportManagerImpl.this) {
                    DevSupportManagerImpl.this.mBundleStatus.isLastDownloadSucess = true;
                    DevSupportManagerImpl.this.mBundleStatus.updateTimestamp = System.currentTimeMillis();
                }
                if (DevSupportManagerImpl.this.mBundleDownloadListener != null) {
                    DevSupportManagerImpl.this.mBundleDownloadListener.onSuccess(nativeDeltaClient);
                }
                UiThreadUtil.runOnUiThread(new Runnable() {
                    /* class com.facebook.react.devsupport.DevSupportManagerImpl.C071024.RunnableC07111 */

                    public void run() {
                        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, bundleInfo.toJSONString());
                        DevSupportManagerImpl.this.mReactInstanceManagerHelper.onJSBundleLoadedFromServer(nativeDeltaClient);
                    }
                });
            }
        }, this.mJSBundleTempFile, str, bundleInfo);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() {
        if (UiThreadUtil.isOnUiThread()) {
            reload();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.RunnableC070217 */

                public void run() {
                    DevSupportManagerImpl.this.reload();
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevSupportEnabled(boolean z) {
        this.mIsDevSupportEnabled = z;
        reloadSettings();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.mDevOptionsDialog == null && this.mIsDevSupportEnabled && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(this.mApplicationContext.getString(C0587R.string.catalyst_reloadjs), new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C07176 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            });
            if (this.mDevSettings.isNuclideJSDebugEnabled()) {
                linkedHashMap.put(this.mApplicationContext.getString(C0587R.string.catalyst_debugjs_nuclide) + EMOJI_HUNDRED_POINTS_SYMBOL, new DevOptionHandler() {
                    /* class com.facebook.react.devsupport.DevSupportManagerImpl.C07187 */

                    @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                    public void onOptionSelected() {
                        DevSupportManagerImpl.this.mDevServerHelper.attachDebugger(DevSupportManagerImpl.this.mApplicationContext, ReactConstants.TAG);
                    }
                });
            }
            if (this.mDevSettings.isRemoteJSDebugEnabled()) {
                str = this.mApplicationContext.getString(C0587R.string.catalyst_debugjs_off);
            } else {
                str = this.mApplicationContext.getString(C0587R.string.catalyst_debugjs);
            }
            if (this.mDevSettings.isNuclideJSDebugEnabled()) {
                str = str + EMOJI_FACE_WITH_NO_GOOD_GESTURE;
            }
            linkedHashMap.put(str, new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C07198 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(!DevSupportManagerImpl.this.mDevSettings.isRemoteJSDebugEnabled());
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            });
            if (this.mDevSettings.isReloadOnJSChangeEnabled()) {
                str2 = this.mApplicationContext.getString(C0587R.string.catalyst_live_reload_off);
            } else {
                str2 = this.mApplicationContext.getString(C0587R.string.catalyst_live_reload);
            }
            linkedHashMap.put(str2, new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C07209 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setReloadOnJSChangeEnabled(!DevSupportManagerImpl.this.mDevSettings.isReloadOnJSChangeEnabled());
                }
            });
            if (this.mDevSettings.isHotModuleReplacementEnabled()) {
                str3 = this.mApplicationContext.getString(C0587R.string.catalyst_hot_module_replacement_off);
            } else {
                str3 = this.mApplicationContext.getString(C0587R.string.catalyst_hot_module_replacement);
            }
            linkedHashMap.put(str3, new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C069510 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setHotModuleReplacementEnabled(!DevSupportManagerImpl.this.mDevSettings.isHotModuleReplacementEnabled());
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(C0587R.string.catalyst_element_inspector), new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C069611 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.mDevSettings.setElementInspectorEnabled(!DevSupportManagerImpl.this.mDevSettings.isElementInspectorEnabled());
                    DevSupportManagerImpl.this.mReactInstanceManagerHelper.toggleElementInspector();
                }
            });
            if (this.mDevSettings.isFpsDebugEnabled()) {
                str4 = this.mApplicationContext.getString(C0587R.string.catalyst_perf_monitor_off);
            } else {
                str4 = this.mApplicationContext.getString(C0587R.string.catalyst_perf_monitor);
            }
            linkedHashMap.put(str4, new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C069712 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    if (!DevSupportManagerImpl.this.mDevSettings.isFpsDebugEnabled()) {
                        Activity currentActivity = DevSupportManagerImpl.this.mReactInstanceManagerHelper.getCurrentActivity();
                        if (currentActivity == null) {
                            FLog.m873e(ReactConstants.TAG, "Unable to get reference to react activity");
                        } else {
                            DebugOverlayController.requestPermission(currentActivity);
                        }
                    }
                    DevSupportManagerImpl.this.mDevSettings.setFpsDebugEnabled(!DevSupportManagerImpl.this.mDevSettings.isFpsDebugEnabled());
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(C0587R.string.catalyst_poke_sampling_profiler), new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C069813 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    DevSupportManagerImpl.this.handlePokeSamplingProfiler();
                }
            });
            linkedHashMap.put(this.mApplicationContext.getString(C0587R.string.catalyst_settings), new DevOptionHandler() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.C069914 */

                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public void onOptionSelected() {
                    Intent intent = new Intent(DevSupportManagerImpl.this.mApplicationContext, DevSettingsActivity.class);
                    intent.setFlags(CommonNetImpl.FLAG_AUTH);
                    DevSupportManagerImpl.this.mApplicationContext.startActivity(intent);
                }
            });
            if (this.mCustomDevOptions.size() > 0) {
                linkedHashMap.putAll(this.mCustomDevOptions);
            }
            final DevOptionHandler[] devOptionHandlerArr = (DevOptionHandler[]) linkedHashMap.values().toArray(new DevOptionHandler[0]);
            Activity currentActivity = this.mReactInstanceManagerHelper.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                FLog.m873e(ReactConstants.TAG, "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            AlertDialog create = new AlertDialog.Builder(currentActivity).setItems((CharSequence[]) linkedHashMap.keySet().toArray(new String[0]), new DialogInterface.OnClickListener() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.DialogInterface$OnClickListenerC070116 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    devOptionHandlerArr[i].onOptionSelected();
                    DevSupportManagerImpl.this.mDevOptionsDialog = null;
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.facebook.react.devsupport.DevSupportManagerImpl.DialogInterface$OnCancelListenerC070015 */

                public void onCancel(DialogInterface dialogInterface) {
                    DevSupportManagerImpl.this.mDevOptionsDialog = null;
                }
            }).create();
            this.mDevOptionsDialog = create;
            create.show();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String str, ReadableArray readableArray, int i) {
        showNewError(str, StackTraceHelper.convertJsStackTrace(readableArray), i, ErrorType.JS);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(@Nullable String str, Throwable th) {
        FLog.m874e(ReactConstants.TAG, "Exception in native call", th);
        showNewError(str, StackTraceHelper.convertJavaStackTrace(th), -1, ErrorType.NATIVE);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
        if (this.mIsDevSupportEnabled) {
            this.mDevServerHelper.openInspectorConnection();
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
        this.mDevServerHelper.closeInspectorConnection();
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void updateJSError(final String str, final ReadableArray readableArray, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.RunnableC07154 */

            public void run() {
                if (DevSupportManagerImpl.this.mRedBoxDialog != null && DevSupportManagerImpl.this.mRedBoxDialog.isShowing() && i == DevSupportManagerImpl.this.mLastErrorCookie) {
                    StackFrame[] convertJsStackTrace = StackTraceHelper.convertJsStackTrace(readableArray);
                    Pair processErrorCustomizers = DevSupportManagerImpl.this.processErrorCustomizers(Pair.create(str, convertJsStackTrace));
                    DevSupportManagerImpl.this.mRedBoxDialog.setExceptionDetails((String) processErrorCustomizers.first, (StackFrame[]) processErrorCustomizers.second);
                    DevSupportManagerImpl.this.updateLastErrorInfo(str, convertJsStackTrace, i, ErrorType.JS);
                    if (DevSupportManagerImpl.this.mRedBoxHandler != null) {
                        DevSupportManagerImpl.this.mRedBoxHandler.handleRedbox(str, convertJsStackTrace, RedBoxHandler.ErrorType.JS);
                        DevSupportManagerImpl.this.mRedBoxDialog.resetReporting();
                    }
                    DevSupportManagerImpl.this.mRedBoxDialog.show();
                }
            }
        });
    }

    public DevSupportManagerImpl(Context context, ReactInstanceManagerDevHelper reactInstanceManagerDevHelper, @Nullable String str, boolean z, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i, @Nullable Map<String, RequestHandler> map) {
        this.mExceptionLoggers = new ArrayList();
        this.mCustomDevOptions = new LinkedHashMap<>();
        this.mDevLoadingViewVisible = false;
        this.mIsReceiverRegistered = false;
        this.mIsShakeDetectorStarted = false;
        this.mIsDevSupportEnabled = false;
        this.mLastErrorCookie = 0;
        this.mReactInstanceManagerHelper = reactInstanceManagerDevHelper;
        this.mApplicationContext = context;
        this.mJSAppBundleName = str;
        this.mDevSettings = new DevInternalSettings(context, this);
        this.mBundleStatus = new InspectorPackagerConnection.BundleStatus();
        this.mDevServerHelper = new DevServerHelper(this.mDevSettings, this.mApplicationContext.getPackageName(), new InspectorPackagerConnection.BundleStatusProvider() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.C06941 */

            @Override // com.facebook.react.devsupport.InspectorPackagerConnection.BundleStatusProvider
            public InspectorPackagerConnection.BundleStatus getBundleStatus() {
                return DevSupportManagerImpl.this.mBundleStatus;
            }
        });
        this.mBundleDownloadListener = devBundleDownloadListener;
        this.mShakeDetector = new ShakeDetector(new ShakeDetector.ShakeListener() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.C07052 */

            @Override // com.facebook.react.common.ShakeDetector.ShakeListener
            public void onShake() {
                DevSupportManagerImpl.this.showDevOptionsDialog();
            }
        }, i);
        this.mCustomPackagerCommandHandlers = map;
        this.mReloadAppBroadcastReceiver = new BroadcastReceiver() {
            /* class com.facebook.react.devsupport.DevSupportManagerImpl.C07143 */

            public void onReceive(Context context, Intent intent) {
                if (DevSupportManagerImpl.getReloadAppAction(context).equals(intent.getAction())) {
                    if (intent.getBooleanExtra(DevServerHelper.RELOAD_APP_EXTRA_JS_PROXY, false)) {
                        DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(true);
                        DevSupportManagerImpl.this.mDevServerHelper.launchJSDevtools();
                    } else {
                        DevSupportManagerImpl.this.mDevSettings.setRemoteJSDebugEnabled(false);
                    }
                    DevSupportManagerImpl.this.handleReloadJS();
                }
            }
        };
        this.mJSBundleTempFile = new File(context.getFilesDir(), JS_BUNDLE_FILE_NAME);
        this.mDefaultNativeModuleCallExceptionHandler = new DefaultNativeModuleCallExceptionHandler();
        setDevSupportEnabled(z);
        this.mRedBoxHandler = redBoxHandler;
        this.mDevLoadingViewController = new DevLoadingViewController(context, reactInstanceManagerDevHelper);
        this.mExceptionLoggers.add(new JSExceptionLogger());
    }
}
