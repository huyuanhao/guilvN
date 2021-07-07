package com.p118pd.sdk;

import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobReq;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* renamed from: com.pd.sdk.o0OOOo0o  reason: case insensitive filesystem */
public class C7407o0OOOo0o extends ResponseBody {
    public ReactApplicationContext OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ResponseBody f20231OooO00o;
    public boolean OooO0O0 = false;
    public String o0ooOOo;

    /* renamed from: com.pd.sdk.o0OOOo0o$OooO00o */
    public class OooO00o implements AbstractC8930ooOOO0OO {
        public long OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public oOOO000O f20233OooO00o;

        public OooO00o(oOOO000O oooo000o) {
            this.f20233OooO00o = oooo000o;
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            long read = this.f20233OooO00o.read(oooo000, j);
            this.OooO00o += read > 0 ? read : 0;
            RNFetchBlobProgressConfig OooO00o2 = RNFetchBlobReq.OooO00o(C7407o0OOOo0o.this.o0ooOOo);
            long contentLength = C7407o0OOOo0o.this.contentLength();
            if (!(OooO00o2 == null || contentLength == 0 || !OooO00o2.OooO00o((float) (this.OooO00o / C7407o0OOOo0o.this.contentLength())))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", C7407o0OOOo0o.this.o0ooOOo);
                createMap.putString("written", String.valueOf(this.OooO00o));
                createMap.putString("total", String.valueOf(C7407o0OOOo0o.this.contentLength()));
                if (C7407o0OOOo0o.this.OooO0O0) {
                    createMap.putString("chunk", oooo000.OooO00o(Charset.defaultCharset()));
                } else {
                    createMap.putString("chunk", "");
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) C7407o0OOOo0o.this.OooO00o.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C7402o0OOOOoo.OooO0O0, createMap);
            }
            return read;
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return null;
        }
    }

    public C7407o0OOOo0o(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, boolean z) {
        this.OooO00o = reactApplicationContext;
        this.o0ooOOo = str;
        this.f20231OooO00o = responseBody;
        this.OooO0O0 = z;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f20231OooO00o.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f20231OooO00o.contentType();
    }

    @Override // okhttp3.ResponseBody
    public oOOO000O source() {
        return C9143oooO0oOo.OooO00o(new OooO00o(this.f20231OooO00o.source()));
    }
}
