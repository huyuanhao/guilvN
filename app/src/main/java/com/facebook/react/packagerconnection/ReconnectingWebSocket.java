package com.facebook.react.packagerconnection;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.logging.FLog;
import com.p118pd.sdk.C7265o0O000oo;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

public final class ReconnectingWebSocket extends WebSocketListener {
    public static final int RECONNECT_DELAY_MS = 2000;
    public static final String TAG = "ReconnectingWebSocket";
    public boolean mClosed = false;
    @Nullable
    public ConnectionCallback mConnectionCallback;
    public final Handler mHandler;
    @Nullable
    public MessageCallback mMessageCallback;
    public boolean mSuppressConnectionErrors;
    public final String mUrl;
    @Nullable
    public WebSocket mWebSocket;

    public interface ConnectionCallback {
        void onConnected();

        void onDisconnected();
    }

    public interface MessageCallback {
        void onMessage(String str);

        void onMessage(ByteString byteString);
    }

    public ReconnectingWebSocket(String str, MessageCallback messageCallback, ConnectionCallback connectionCallback) {
        this.mUrl = str;
        this.mMessageCallback = messageCallback;
        this.mConnectionCallback = connectionCallback;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    private void abort(String str, Throwable th) {
        String str2 = TAG;
        FLog.m874e(str2, "Error occurred, shutting down websocket connection: " + str, th);
        closeWebSocketQuietly();
    }

    private void closeWebSocketQuietly() {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.mWebSocket = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void delayedReconnect() {
        if (!this.mClosed) {
            connect();
        }
    }

    private void reconnect() {
        if (!this.mClosed) {
            if (!this.mSuppressConnectionErrors) {
                String str = TAG;
                FLog.m913w(str, "Couldn't connect to \"" + this.mUrl + "\", will silently retry");
                this.mSuppressConnectionErrors = true;
            }
            this.mHandler.postDelayed(new Runnable() {
                /* class com.facebook.react.packagerconnection.ReconnectingWebSocket.RunnableC08051 */

                public void run() {
                    ReconnectingWebSocket.this.delayedReconnect();
                }
            }, C7265o0O000oo.OooO0o.OooO00o);
            return;
        }
        throw new IllegalStateException("Can't reconnect closed client");
    }

    public void closeQuietly() {
        this.mClosed = true;
        closeWebSocketQuietly();
        this.mMessageCallback = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onDisconnected();
        }
    }

    public void connect() {
        if (!this.mClosed) {
            new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build().newWebSocket(new Request.Builder().url(this.mUrl).build(), this);
            return;
        }
        throw new IllegalStateException("Can't connect closed client");
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onClosed(WebSocket webSocket, int i, String str) {
        this.mWebSocket = null;
        if (!this.mClosed) {
            if (this.mConnectionCallback != null) {
                this.mConnectionCallback.onDisconnected();
            }
            reconnect();
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onFailure(WebSocket webSocket, Throwable th, Response response) {
        if (this.mWebSocket != null) {
            abort("Websocket exception", th);
        }
        if (!this.mClosed) {
            if (this.mConnectionCallback != null) {
                this.mConnectionCallback.onDisconnected();
            }
            reconnect();
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, String str) {
        if (this.mMessageCallback != null) {
            this.mMessageCallback.onMessage(str);
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        this.mSuppressConnectionErrors = false;
        if (this.mConnectionCallback != null) {
            this.mConnectionCallback.onConnected();
        }
    }

    public synchronized void sendMessage(String str) throws IOException {
        if (this.mWebSocket != null) {
            this.mWebSocket.send(str);
        } else {
            throw new ClosedChannelException();
        }
    }

    @Override // okhttp3.WebSocketListener
    public synchronized void onMessage(WebSocket webSocket, ByteString byteString) {
        if (this.mMessageCallback != null) {
            this.mMessageCallback.onMessage(byteString);
        }
    }

    public synchronized void sendMessage(ByteString byteString) throws IOException {
        if (this.mWebSocket != null) {
            this.mWebSocket.send(byteString);
        } else {
            throw new ClosedChannelException();
        }
    }
}
