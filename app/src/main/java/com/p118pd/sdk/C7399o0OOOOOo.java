package com.p118pd.sdk;

import android.util.Base64;
import com.RNFetchBlob.C0242RNFetchBlob;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobReq;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p283fi.iki.elonen.NanoHTTPD;

/* renamed from: com.pd.sdk.o0OOOOOo  reason: case insensitive filesystem */
public class C7399o0OOOOOo extends RequestBody {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f20202OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RNFetchBlobReq.RequestType f20203OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReadableArray f20204OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f20205OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f20206OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Boolean f20207OooO00o = false;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20208OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public MediaType f20209OooO00o;
    public String OooO0O0;

    /* renamed from: com.pd.sdk.o0OOOOOo$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.RNFetchBlob.RNFetchBlobReq$RequestType[] r0 = com.RNFetchBlob.RNFetchBlobReq.RequestType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C7399o0OOOOOo.OooO00o.OooO00o = r0
                com.RNFetchBlob.RNFetchBlobReq$RequestType r1 = com.RNFetchBlob.RNFetchBlobReq.RequestType.SingleFile     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C7399o0OOOOOo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.RNFetchBlob.RNFetchBlobReq$RequestType r1 = com.RNFetchBlob.RNFetchBlobReq.RequestType.AsIs     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C7399o0OOOOOo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.RNFetchBlob.RNFetchBlobReq$RequestType r1 = com.RNFetchBlob.RNFetchBlobReq.RequestType.Others     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7399o0OOOOOo.OooO00o.<clinit>():void");
        }
    }

    /* renamed from: com.pd.sdk.o0OOOOOo$OooO0O0 */
    public class OooO0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f20210OooO00o;
        public String OooO0O0;
        public String OooO0OO;
        public String OooO0Oo;

        public OooO0O0(ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.f20210OooO00o = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.OooO0O0 = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.OooO0OO = readableMap.getString("type");
            } else {
                this.OooO0OO = this.OooO0O0 == null ? NanoHTTPD.MIME_PLAINTEXT : "application/octet-stream";
            }
            if (readableMap.hasKey("data")) {
                this.OooO0Oo = readableMap.getString("data");
            }
        }
    }

    public C7399o0OOOOOo(String str) {
        this.f20208OooO00o = str;
    }

    public C7399o0OOOOOo OooO00o(boolean z) {
        this.f20207OooO00o = Boolean.valueOf(z);
        return this;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.f20207OooO00o.booleanValue()) {
            return -1;
        }
        return this.f20202OooO00o;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f20209OooO00o;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(oOOO0000 oooo0000) {
        try {
            OooO00o(this.f20206OooO00o, oooo0000);
        } catch (Exception e) {
            C7406o0OOOo0O.m18948OooO00o(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public C7399o0OOOOOo OooO00o(MediaType mediaType) {
        this.f20209OooO00o = mediaType;
        return this;
    }

    public C7399o0OOOOOo OooO00o(RNFetchBlobReq.RequestType requestType) {
        this.f20203OooO00o = requestType;
        return this;
    }

    public C7399o0OOOOOo OooO00o(String str) {
        this.OooO0O0 = str;
        if (str == null) {
            this.OooO0O0 = "";
            this.f20203OooO00o = RNFetchBlobReq.RequestType.AsIs;
        }
        try {
            int i = OooO00o.OooO00o[this.f20203OooO00o.ordinal()];
            if (i == 1) {
                InputStream OooO00o2 = m18940OooO00o();
                this.f20206OooO00o = OooO00o2;
                this.f20202OooO00o = (long) OooO00o2.available();
            } else if (i == 2) {
                this.f20202OooO00o = (long) this.OooO0O0.getBytes().length;
                this.f20206OooO00o = new ByteArrayInputStream(this.OooO0O0.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
            C7406o0OOOo0O.m18948OooO00o("RNFetchBlob failed to create single content request body :" + e.getLocalizedMessage() + "\r\n");
        }
        return this;
    }

    public C7399o0OOOOOo OooO00o(ReadableArray readableArray) {
        this.f20204OooO00o = readableArray;
        try {
            this.f20205OooO00o = OooO00o();
            this.f20206OooO00o = new FileInputStream(this.f20205OooO00o);
            this.f20202OooO00o = this.f20205OooO00o.length();
        } catch (Exception e) {
            e.printStackTrace();
            C7406o0OOOo0O.m18948OooO00o("RNFetchBlob failed to create request multipart body :" + e.getLocalizedMessage());
        }
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18942OooO00o() {
        try {
            if (this.f20205OooO00o == null || !this.f20205OooO00o.exists()) {
                return true;
            }
            this.f20205OooO00o.delete();
            return true;
        } catch (Exception e) {
            C7406o0OOOo0O.m18948OooO00o(e.getLocalizedMessage());
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private InputStream m18940OooO00o() throws Exception {
        if (this.OooO0O0.startsWith(C7402o0OOOOoo.OooO0o0)) {
            String OooO00o2 = C7405o0OOOo00.m18946OooO00o(this.OooO0O0.substring(19));
            if (C7405o0OOOo00.m18947OooO00o(OooO00o2)) {
                try {
                    return C0242RNFetchBlob.RCTContext.getAssets().open(OooO00o2.replace(C7402o0OOOOoo.OooO0o, ""));
                } catch (Exception e) {
                    throw new Exception("error when getting request stream from asset : " + e.getLocalizedMessage());
                }
            } else {
                File file = new File(C7405o0OOOo00.m18946OooO00o(OooO00o2));
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    return new FileInputStream(file);
                } catch (Exception e2) {
                    throw new Exception("error when getting request stream: " + e2.getLocalizedMessage());
                }
            }
        } else {
            try {
                return new ByteArrayInputStream(Base64.decode(this.OooO0O0, 0));
            } catch (Exception e3) {
                throw new Exception("error when getting request stream: " + e3.getLocalizedMessage());
            }
        }
    }

    private File OooO00o() throws IOException {
        File file;
        ArrayList<OooO0O0> arrayList;
        String str = "RNFetchBlob-" + this.f20208OooO00o;
        File createTempFile = File.createTempFile("rnfb-form-tmp", "", C0242RNFetchBlob.RCTContext.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        ArrayList<OooO0O0> OooO00o2 = m18941OooO00o();
        ReactApplicationContext reactApplicationContext = C0242RNFetchBlob.RCTContext;
        int i = 0;
        while (i < OooO00o2.size()) {
            OooO0O0 oooO0O0 = OooO00o2.get(i);
            String str2 = oooO0O0.OooO0Oo;
            String str3 = oooO0O0.f20210OooO00o;
            if (str3 == null || str2 == null) {
                file = createTempFile;
                arrayList = OooO00o2;
            } else {
                String str4 = "--" + str + "\r\n";
                arrayList = OooO00o2;
                file = createTempFile;
                if (oooO0O0.OooO0O0 != null) {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"; filename=\"" + oooO0O0.OooO0O0 + "\"\r\n") + "Content-Type: " + oooO0O0.OooO0OO + "\r\n\r\n").getBytes());
                    if (str2.startsWith(C7402o0OOOOoo.OooO0o0)) {
                        String OooO00o3 = C7405o0OOOo00.m18946OooO00o(str2.substring(19));
                        if (C7405o0OOOo00.m18947OooO00o(OooO00o3)) {
                            try {
                                OooO00o(reactApplicationContext.getAssets().open(OooO00o3.replace(C7402o0OOOOoo.OooO0o, "")), fileOutputStream);
                            } catch (IOException e) {
                                C7406o0OOOo0O.m18948OooO00o("Failed to create form data asset :" + OooO00o3 + ", " + e.getLocalizedMessage());
                            }
                        } else {
                            File file2 = new File(C7405o0OOOo00.m18946OooO00o(OooO00o3));
                            if (file2.exists()) {
                                OooO00o(new FileInputStream(file2), fileOutputStream);
                            } else {
                                C7406o0OOOo0O.m18948OooO00o("Failed to create form data from path :" + OooO00o3 + ", file not exists.");
                            }
                        }
                    } else {
                        fileOutputStream.write(Base64.decode(str2, 0));
                    }
                } else {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"\r\n") + "Content-Type: " + oooO0O0.OooO0OO + "\r\n\r\n").getBytes());
                    fileOutputStream.write(oooO0O0.OooO0Oo.getBytes());
                }
                fileOutputStream.write("\r\n".getBytes());
            }
            i++;
            OooO00o2 = arrayList;
            createTempFile = file;
        }
        fileOutputStream.write(("--" + str + "--\r\n").getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
        return createTempFile;
    }

    private void OooO00o(InputStream inputStream, oOOO0000 oooo0000) throws Exception {
        byte[] bArr = new byte[10240];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read <= 0) {
                inputStream.close();
                return;
            } else if (read > 0) {
                oooo0000.OooO00o(bArr, 0, read);
                i += read;
                OooO00o(i);
            }
        }
    }

    private void OooO00o(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private ArrayList<OooO0O0> m18941OooO00o() {
        long j;
        int length;
        ArrayList<OooO0O0> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = C0242RNFetchBlob.RCTContext;
        long j2 = 0;
        for (int i = 0; i < this.f20204OooO00o.size(); i++) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f20204OooO00o.getMap(i));
            arrayList.add(oooO0O0);
            String str = oooO0O0.OooO0Oo;
            if (str == null) {
                C7406o0OOOo0O.m18948OooO00o("RNFetchBlob multipart request builder has found a field without `data` property, the field `" + oooO0O0.f20210OooO00o + "` will be removed implicitly.");
            } else {
                if (oooO0O0.OooO0O0 != null) {
                    if (str.startsWith(C7402o0OOOOoo.OooO0o0)) {
                        String OooO00o2 = C7405o0OOOo00.m18946OooO00o(str.substring(19));
                        if (C7405o0OOOo00.m18947OooO00o(OooO00o2)) {
                            try {
                                length = reactApplicationContext.getAssets().open(OooO00o2.replace(C7402o0OOOOoo.OooO0o, "")).available();
                            } catch (IOException e) {
                                C7406o0OOOo0O.m18948OooO00o(e.getLocalizedMessage());
                            }
                        } else {
                            j = new File(C7405o0OOOo00.m18946OooO00o(OooO00o2)).length();
                            j2 += j;
                        }
                    } else {
                        length = Base64.decode(str, 0).length;
                    }
                } else if (str != null) {
                    length = str.getBytes().length;
                } else {
                    j = 0;
                    j2 += j;
                }
                j = (long) length;
                j2 += j;
            }
        }
        this.f20202OooO00o = j2;
        return arrayList;
    }

    private void OooO00o(int i) {
        RNFetchBlobProgressConfig OooO0O02 = RNFetchBlobReq.OooO0O0(this.f20208OooO00o);
        if (OooO0O02 != null) {
            long j = this.f20202OooO00o;
            if (j != 0 && OooO0O02.OooO00o(((float) i) / ((float) j))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", this.f20208OooO00o);
                createMap.putString("written", String.valueOf(i));
                createMap.putString("total", String.valueOf(this.f20202OooO00o));
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) C0242RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C7402o0OOOOoo.f20221OooO00o, createMap);
            }
        }
    }
}
