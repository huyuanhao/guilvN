package com.p118pd.sdk;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.p118pd.sdk.I1I;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.ByteString;

@ReactModule(name = "BlobModule")
/* renamed from: com.pd.sdk.BlobModule */
public class BlobModule extends ReactContextBaseJavaModule {
    public static final String NAME = "BlobModule";
    public final Map<String, byte[]> mBlobs = new HashMap();
    public final I1I.AbstractC5163OooO0o0 mNetworkingRequestBodyHandler = new OooO0OO();
    public final I1I.OooO0o mNetworkingResponseHandler = new C5159OooO0Oo();
    public final I1I.AbstractC5164OooO0oO mNetworkingUriHandler = new OooO0O0();
    public final WebSocketModule.ContentHandler mWebSocketContentHandler = new OooO00o();

    /* renamed from: com.pd.sdk.BlobModule$OooO00o */
    public class OooO00o implements WebSocketModule.ContentHandler {
        public OooO00o() {
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
        public void onMessage(String str, WritableMap writableMap) {
            writableMap.putString("data", str);
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.ContentHandler
        public void onMessage(ByteString byteString, WritableMap writableMap) {
            byte[] byteArray = byteString.toByteArray();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(byteArray));
            createMap.putInt("offset", 0);
            createMap.putInt(FileAttachment.KEY_SIZE, byteArray.length);
            writableMap.putMap("data", createMap);
            writableMap.putString("type", "blob");
        }
    }

    /* renamed from: com.pd.sdk.BlobModule$OooO0O0 */
    public class OooO0O0 implements I1I.AbstractC5164OooO0oO {
        public OooO0O0() {
        }

        @Override // com.p118pd.sdk.I1I.AbstractC5164OooO0oO
        public WritableMap fetch(Uri uri) throws IOException {
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytesFromUri));
            createMap.putInt("offset", 0);
            createMap.putInt(FileAttachment.KEY_SIZE, bytesFromUri.length);
            createMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
            createMap.putString("name", BlobModule.this.getNameFromUri(uri));
            createMap.putDouble("lastModified", (double) BlobModule.this.getLastModifiedFromUri(uri));
            return createMap;
        }

        @Override // com.p118pd.sdk.I1I.AbstractC5164OooO0oO
        public boolean supports(Uri uri, String str) {
            String scheme = uri.getScheme();
            if (("http".equals(scheme) || "https".equals(scheme)) || !"blob".equals(str)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.pd.sdk.BlobModule$OooO0OO */
    public class OooO0OO implements I1I.AbstractC5163OooO0o0 {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.I1I.AbstractC5163OooO0o0
        public boolean supports(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        @Override // com.p118pd.sdk.I1I.AbstractC5163OooO0o0
        public RequestBody toRequestBody(ReadableMap readableMap, String str) {
            if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                str = readableMap.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt(FileAttachment.KEY_SIZE)));
        }
    }

    /* renamed from: com.pd.sdk.BlobModule$OooO0Oo  reason: case insensitive filesystem */
    public class C5159OooO0Oo implements I1I.OooO0o {
        public C5159OooO0Oo() {
        }

        @Override // com.p118pd.sdk.I1I.OooO0o
        public boolean supports(String str) {
            return "blob".equals(str);
        }

        @Override // com.p118pd.sdk.I1I.OooO0o
        public WritableMap toResponseData(ResponseBody responseBody) throws IOException {
            byte[] bytes = responseBody.bytes();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytes));
            createMap.putInt("offset", 0);
            createMap.putInt(FileAttachment.KEY_SIZE, bytes.length);
            return createMap;
        }
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } else {
            throw new FileNotFoundException("File not found for " + uri);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? "" : type;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
                query.close();
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @ReactMethod
    public void addNetworkingHandler() {
        I1I i1i = (I1I) getReactApplicationContext().getNativeModule(I1I.class);
        i1i.addUriHandler(this.mNetworkingUriHandler);
        i1i.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
        i1i.addResponseHandler(this.mNetworkingResponseHandler);
    }

    @ReactMethod
    public void addWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, this.mWebSocketContentHandler);
    }

    @ReactMethod
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String string = map.getString("type");
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -891985903) {
                if (hashCode == 3026845 && string.equals("blob")) {
                    c = 0;
                }
            } else if (string.equals("string")) {
                c = 1;
            }
            if (c == 0) {
                ReadableMap map2 = map.getMap("data");
                i += map2.getInt(FileAttachment.KEY_SIZE);
                arrayList.add(i2, resolve(map2));
            } else if (c == 1) {
                byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                i += bytes.length;
                arrayList.add(i2, bytes);
            } else {
                throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return MapBuilder.m947of("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BlobModule";
    }

    @ReactMethod
    public void release(String str) {
        remove(str);
    }

    public void remove(String str) {
        this.mBlobs.remove(str);
    }

    @ReactMethod
    public void removeWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, null);
    }

    @Nullable
    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter(FileAttachment.KEY_SIZE);
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @ReactMethod
    public void sendOverSocket(ReadableMap readableMap, int i) {
        byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(FileAttachment.KEY_SIZE));
        if (resolve != null) {
            getWebSocketModule().sendBinary(ByteString.m14263of(resolve), i);
        } else {
            getWebSocketModule().sendBinary((ByteString) null, i);
        }
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        this.mBlobs.put(str, bArr);
    }

    @Nullable
    public byte[] resolve(String str, int i, int i2) {
        byte[] bArr = this.mBlobs.get(str);
        if (bArr == null) {
            return null;
        }
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        return (i > 0 || i2 != bArr.length) ? Arrays.copyOfRange(bArr, i, i2 + i) : bArr;
    }

    @Nullable
    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt(FileAttachment.KEY_SIZE));
    }
}
