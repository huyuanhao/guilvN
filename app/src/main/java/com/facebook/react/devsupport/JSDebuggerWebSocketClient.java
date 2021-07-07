package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.common.JavascriptException;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

public class JSDebuggerWebSocketClient extends WebSocketListener {
    public static final String TAG = "JSDebuggerWebSocketClient";
    public final ConcurrentHashMap<Integer, JSDebuggerCallback> mCallbacks = new ConcurrentHashMap<>();
    @Nullable
    public JSDebuggerCallback mConnectCallback;
    @Nullable
    public OkHttpClient mHttpClient;
    public final AtomicInteger mRequestID = new AtomicInteger();
    @Nullable
    public WebSocket mWebSocket;

    public interface JSDebuggerCallback {
        void onFailure(Throwable th);

        void onSuccess(@Nullable String str);
    }

    private void abort(String str, Throwable th) {
        FLog.m874e(TAG, "Error occurred, shutting down websocket connection: " + str, th);
        closeQuietly();
        JSDebuggerCallback jSDebuggerCallback = this.mConnectCallback;
        if (jSDebuggerCallback != null) {
            jSDebuggerCallback.onFailure(th);
            this.mConnectCallback = null;
        }
        for (JSDebuggerCallback jSDebuggerCallback2 : this.mCallbacks.values()) {
            jSDebuggerCallback2.onFailure(th);
        }
        this.mCallbacks.clear();
    }

    private void sendMessage(int i, String str) {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket == null) {
            triggerRequestFailure(i, new IllegalStateException("WebSocket connection no longer valid"));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            triggerRequestFailure(i, e);
        }
    }

    private void triggerRequestFailure(int i, Throwable th) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i));
            jSDebuggerCallback.onFailure(th);
        }
    }

    private void triggerRequestSuccess(int i, @Nullable String str) {
        JSDebuggerCallback jSDebuggerCallback = this.mCallbacks.get(Integer.valueOf(i));
        if (jSDebuggerCallback != null) {
            this.mCallbacks.remove(Integer.valueOf(i));
            jSDebuggerCallback.onSuccess(str);
        }
    }

    public void closeQuietly() {
        WebSocket webSocket = this.mWebSocket;
        if (webSocket != null) {
            try {
                webSocket.close(1000, "End of session");
            } catch (Exception unused) {
            }
            this.mWebSocket = null;
        }
    }

    public void connect(String str, JSDebuggerCallback jSDebuggerCallback) {
        if (this.mHttpClient == null) {
            this.mConnectCallback = jSDebuggerCallback;
            this.mHttpClient = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(0, TimeUnit.MINUTES).build();
            this.mHttpClient.newWebSocket(new Request.Builder().url(str).build(), this);
            return;
        }
        throw new IllegalStateException("JSDebuggerWebSocketClient is already initialized.");
    }

    public void executeJSCall(String str, String str2, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject().name("id").value((long) andIncrement).name(AbstractC7726o0ooOOoo.OooOOo0).value(str);
            stringWriter.append((CharSequence) ",\"arguments\":").append((CharSequence) str2);
            jsonWriter.endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            triggerRequestFailure(andIncrement, e);
        }
    }

    public void loadApplicationScript(String str, HashMap<String, String> hashMap, JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter beginObject = new JsonWriter(stringWriter).beginObject().name("id").value((long) andIncrement).name(AbstractC7726o0ooOOoo.OooOOo0).value("executeApplicationScript").name("url").value(str).name("inject").beginObject();
            for (String str2 : hashMap.keySet()) {
                beginObject.name(str2).value(hashMap.get(str2));
            }
            beginObject.endObject().endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            triggerRequestFailure(andIncrement, e);
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        this.mWebSocket = null;
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        abort("Websocket exception", th);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        Integer num = null;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginObject();
            String str2 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (JsonToken.NULL == jsonReader.peek()) {
                    jsonReader.skipValue();
                } else if ("replyID".equals(nextName)) {
                    num = Integer.valueOf(jsonReader.nextInt());
                } else if ("result".equals(nextName)) {
                    str2 = jsonReader.nextString();
                } else if ("error".equals(nextName)) {
                    String nextString = jsonReader.nextString();
                    abort(nextString, new JavascriptException(nextString));
                }
            }
            if (num != null) {
                triggerRequestSuccess(num.intValue(), str2);
            }
        } catch (IOException e) {
            if (0 != 0) {
                triggerRequestFailure(num.intValue(), e);
            } else {
                abort("Parsing response message from websocket failed", e);
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        this.mWebSocket = webSocket;
        ((JSDebuggerCallback) Assertions.assertNotNull(this.mConnectCallback)).onSuccess(null);
        this.mConnectCallback = null;
    }

    public void prepareJSRuntime(JSDebuggerCallback jSDebuggerCallback) {
        int andIncrement = this.mRequestID.getAndIncrement();
        this.mCallbacks.put(Integer.valueOf(andIncrement), jSDebuggerCallback);
        try {
            StringWriter stringWriter = new StringWriter();
            new JsonWriter(stringWriter).beginObject().name("id").value((long) andIncrement).name(AbstractC7726o0ooOOoo.OooOOo0).value("prepareJSRuntime").endObject().close();
            sendMessage(andIncrement, stringWriter.toString());
        } catch (IOException e) {
            triggerRequestFailure(andIncrement, e);
        }
    }
}
