package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.JavaJSExecutor;
import com.facebook.react.devsupport.JSDebuggerWebSocketClient;
import java.util.HashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public class WebsocketJavaScriptExecutor implements JavaJSExecutor {
    public static final int CONNECT_RETRY_COUNT = 3;
    public static final long CONNECT_TIMEOUT_MS = 5000;
    public final HashMap<String, String> mInjectedObjects = new HashMap<>();
    @Nullable
    public JSDebuggerWebSocketClient mWebSocketClient;

    public static class JSExecutorCallbackFuture implements JSDebuggerWebSocketClient.JSDebuggerCallback {
        @Nullable
        public Throwable mCause;
        @Nullable
        public String mResponse;
        public final Semaphore mSemaphore;

        public JSExecutorCallbackFuture() {
            this.mSemaphore = new Semaphore(0);
        }

        @Nullable
        public String get() throws Throwable {
            this.mSemaphore.acquire();
            Throwable th = this.mCause;
            if (th == null) {
                return this.mResponse;
            }
            throw th;
        }

        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
        public void onFailure(Throwable th) {
            this.mCause = th;
            this.mSemaphore.release();
        }

        @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
        public void onSuccess(@Nullable String str) {
            this.mResponse = str;
            this.mSemaphore.release();
        }
    }

    public interface JSExecutorConnectCallback {
        void onFailure(Throwable th);

        void onSuccess();
    }

    public static class WebsocketExecutorTimeoutException extends Exception {
        public WebsocketExecutorTimeoutException(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void connectInternal(String str, final JSExecutorConnectCallback jSExecutorConnectCallback) {
        final JSDebuggerWebSocketClient jSDebuggerWebSocketClient = new JSDebuggerWebSocketClient();
        final Handler handler = new Handler(Looper.getMainLooper());
        jSDebuggerWebSocketClient.connect(str, new JSDebuggerWebSocketClient.JSDebuggerCallback() {
            /* class com.facebook.react.devsupport.WebsocketJavaScriptExecutor.C07332 */
            public boolean didSendResult = false;

            @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
            public void onFailure(Throwable th) {
                handler.removeCallbacksAndMessages(null);
                if (!this.didSendResult) {
                    jSExecutorConnectCallback.onFailure(th);
                    this.didSendResult = true;
                }
            }

            @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
            public void onSuccess(@Nullable String str) {
                jSDebuggerWebSocketClient.prepareJSRuntime(new JSDebuggerWebSocketClient.JSDebuggerCallback() {
                    /* class com.facebook.react.devsupport.WebsocketJavaScriptExecutor.C07332.C07341 */

                    @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                    public void onFailure(Throwable th) {
                        handler.removeCallbacksAndMessages(null);
                        if (!C07332.this.didSendResult) {
                            jSExecutorConnectCallback.onFailure(th);
                            C07332.this.didSendResult = true;
                        }
                    }

                    @Override // com.facebook.react.devsupport.JSDebuggerWebSocketClient.JSDebuggerCallback
                    public void onSuccess(@Nullable String str) {
                        handler.removeCallbacksAndMessages(null);
                        C07332 r2 = C07332.this;
                        WebsocketJavaScriptExecutor.this.mWebSocketClient = jSDebuggerWebSocketClient;
                        if (!C07332.this.didSendResult) {
                            jSExecutorConnectCallback.onSuccess();
                            C07332.this.didSendResult = true;
                        }
                    }
                });
            }
        });
        handler.postDelayed(new Runnable() {
            /* class com.facebook.react.devsupport.WebsocketJavaScriptExecutor.RunnableC07353 */

            public void run() {
                jSDebuggerWebSocketClient.closeQuietly();
                jSExecutorConnectCallback.onFailure(new WebsocketExecutorTimeoutException("Timeout while connecting to remote debugger"));
            }
        }, CONNECT_TIMEOUT_MS);
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void close() {
        JSDebuggerWebSocketClient jSDebuggerWebSocketClient = this.mWebSocketClient;
        if (jSDebuggerWebSocketClient != null) {
            jSDebuggerWebSocketClient.closeQuietly();
        }
    }

    public void connect(final String str, final JSExecutorConnectCallback jSExecutorConnectCallback) {
        final AtomicInteger atomicInteger = new AtomicInteger(3);
        connectInternal(str, new JSExecutorConnectCallback() {
            /* class com.facebook.react.devsupport.WebsocketJavaScriptExecutor.C07321 */

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onFailure(Throwable th) {
                if (atomicInteger.decrementAndGet() <= 0) {
                    jSExecutorConnectCallback.onFailure(th);
                } else {
                    WebsocketJavaScriptExecutor.this.connectInternal(str, this);
                }
            }

            @Override // com.facebook.react.devsupport.WebsocketJavaScriptExecutor.JSExecutorConnectCallback
            public void onSuccess() {
                jSExecutorConnectCallback.onSuccess();
            }
        });
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    @Nullable
    public String executeJSCall(String str, String str2) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) Assertions.assertNotNull(this.mWebSocketClient)).executeJSCall(str, str2, jSExecutorCallbackFuture);
        try {
            return jSExecutorCallbackFuture.get();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void loadApplicationScript(String str) throws JavaJSExecutor.ProxyExecutorException {
        JSExecutorCallbackFuture jSExecutorCallbackFuture = new JSExecutorCallbackFuture();
        ((JSDebuggerWebSocketClient) Assertions.assertNotNull(this.mWebSocketClient)).loadApplicationScript(str, this.mInjectedObjects, jSExecutorCallbackFuture);
        try {
            jSExecutorCallbackFuture.get();
        } catch (Throwable th) {
            throw new JavaJSExecutor.ProxyExecutorException(th);
        }
    }

    @Override // com.facebook.react.bridge.JavaJSExecutor
    public void setGlobalVariable(String str, String str2) {
        this.mInjectedObjects.put(str, str2);
    }
}
