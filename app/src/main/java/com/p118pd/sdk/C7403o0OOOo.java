package com.p118pd.sdk;

import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobReq;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* renamed from: com.pd.sdk.o0OOOo  reason: case insensitive filesystem */
public class C7403o0OOOo extends ResponseBody {
    public static final /* synthetic */ boolean OooO0O0 = false;
    public long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReactApplicationContext f20222OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public FileOutputStream f20223OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ResponseBody f20224OooO00o;
    public String o0ooOOo;
    public String o0ooOoO;

    /* renamed from: com.pd.sdk.o0OOOo$OooO0O0 */
    public class OooO0O0 implements AbstractC8930ooOOO0OO {
        public OooO0O0() {
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            C7403o0OOOo.this.f20223OooO00o.close();
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            int i = (int) j;
            try {
                byte[] bArr = new byte[i];
                long read = (long) C7403o0OOOo.this.f20224OooO00o.byteStream().read(bArr, 0, i);
                C7403o0OOOo.this.OooO00o += read > 0 ? read : 0;
                if (read > 0) {
                    C7403o0OOOo.this.f20223OooO00o.write(bArr, 0, (int) read);
                }
                RNFetchBlobProgressConfig OooO00o2 = RNFetchBlobReq.OooO00o(C7403o0OOOo.this.o0ooOOo);
                if (!(OooO00o2 == null || C7403o0OOOo.this.contentLength() == 0 || !OooO00o2.OooO00o((float) (C7403o0OOOo.this.OooO00o / C7403o0OOOo.this.contentLength())))) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("taskId", C7403o0OOOo.this.o0ooOOo);
                    createMap.putString("written", String.valueOf(C7403o0OOOo.this.OooO00o));
                    createMap.putString("total", String.valueOf(C7403o0OOOo.this.contentLength()));
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) C7403o0OOOo.this.f20222OooO00o.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C7402o0OOOOoo.OooO0O0, createMap);
                }
                return read;
            } catch (Exception unused) {
                return -1;
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return null;
        }
    }

    public C7403o0OOOo(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, String str2, boolean z) throws IOException {
        this.f20222OooO00o = reactApplicationContext;
        this.o0ooOOo = str;
        this.f20224OooO00o = responseBody;
        this.o0ooOoO = str2;
        if (str2 != null) {
            boolean z2 = !z;
            String replace = str2.replace("?append=true", "");
            this.o0ooOoO = replace;
            File file = new File(replace);
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.f20223OooO00o = new FileOutputStream(new File(replace), z2);
                return;
            }
            throw new IllegalStateException("Couldn't create dir: " + parentFile);
        }
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f20224OooO00o.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f20224OooO00o.contentType();
    }

    @Override // okhttp3.ResponseBody
    public oOOO000O source() {
        return C9143oooO0oOo.OooO00o(new OooO0O0());
    }
}
