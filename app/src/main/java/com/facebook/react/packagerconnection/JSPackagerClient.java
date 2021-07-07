package com.facebook.react.packagerconnection;

import android.net.Uri;
import com.facebook.common.logging.FLog;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import java.util.Map;
import javax.annotation.Nullable;
import okio.ByteString;
import org.json.JSONObject;

public final class JSPackagerClient implements ReconnectingWebSocket.MessageCallback {
    public static final String PACKAGER_CONNECTION_URL_FORMAT = "ws://%s/message?device=%s&app=%s&context=%s";
    public static final int PROTOCOL_VERSION = 2;
    public static final String TAG = "JSPackagerClient";
    public Map<String, RequestHandler> mRequestHandlers;
    public ReconnectingWebSocket mWebSocket;

    public class ResponderImpl implements Responder {
        public Object mId;

        public ResponderImpl(Object obj) {
            this.mId = obj;
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void error(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.mId);
                jSONObject.put("error", obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e) {
                FLog.m874e(JSPackagerClient.TAG, "Responding with error failed", e);
            }
        }

        @Override // com.facebook.react.packagerconnection.Responder
        public void respond(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.mId);
                jSONObject.put("result", obj);
                JSPackagerClient.this.mWebSocket.sendMessage(jSONObject.toString());
            } catch (Exception e) {
                FLog.m874e(JSPackagerClient.TAG, "Responding failed", e);
            }
        }
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map) {
        this(str, packagerConnectionSettings, map, null);
    }

    private void abortOnMessage(Object obj, String str) {
        if (obj != null) {
            new ResponderImpl(obj).error(str);
        }
        String str2 = TAG;
        FLog.m873e(str2, "Handling the message failed with reason: " + str);
    }

    public void close() {
        this.mWebSocket.closeQuietly();
    }

    public void init() {
        this.mWebSocket.connect();
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("version");
            String optString = jSONObject.optString(AbstractC7726o0ooOOoo.OooOOo0);
            Object opt = jSONObject.opt("id");
            Object opt2 = jSONObject.opt("params");
            if (optInt != 2) {
                String str2 = TAG;
                FLog.m873e(str2, "Message with incompatible or missing version of protocol received: " + optInt);
            } else if (optString == null) {
                abortOnMessage(opt, "No method provided");
            } else {
                RequestHandler requestHandler = this.mRequestHandlers.get(optString);
                if (requestHandler == null) {
                    abortOnMessage(opt, "No request handler for method: " + optString);
                } else if (opt == null) {
                    requestHandler.onNotification(opt2);
                } else {
                    requestHandler.onRequest(opt2, new ResponderImpl(opt));
                }
            }
        } catch (Exception e) {
            FLog.m874e(TAG, "Handling the message failed", e);
        }
    }

    public JSPackagerClient(String str, PackagerConnectionSettings packagerConnectionSettings, Map<String, RequestHandler> map, @Nullable ReconnectingWebSocket.ConnectionCallback connectionCallback) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(packagerConnectionSettings.getDebugServerHost()).appendPath("message").appendQueryParameter("device", AndroidInfoHelpers.getFriendlyDeviceName()).appendQueryParameter("app", packagerConnectionSettings.getPackageName()).appendQueryParameter("clientid", str);
        this.mWebSocket = new ReconnectingWebSocket(builder.build().toString(), this, connectionCallback);
        this.mRequestHandlers = map;
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.MessageCallback
    public void onMessage(ByteString byteString) {
        FLog.m913w(TAG, "Websocket received message with payload of unexpected type binary");
    }
}
