package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.Pair;
import com.facebook.react.bridge.NativeDeltaClient;
import com.p118pd.sdk.C7383o0OOO0O;
import com.p118pd.sdk.oOOO000O;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import javax.annotation.Nullable;
import okhttp3.Headers;

public abstract class BundleDeltaClient {
    public static final String METRO_DELTA_ID_HEADER = "X-Metro-Delta-ID";
    @Nullable
    public String mRevisionId;

    /* renamed from: com.facebook.react.devsupport.BundleDeltaClient$1 */
    public static /* synthetic */ class C06711 {

        /* renamed from: $SwitchMap$com$facebook$react$devsupport$BundleDeltaClient$ClientType */
        public static final /* synthetic */ int[] f972xca7c22d2;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.react.devsupport.BundleDeltaClient$ClientType[] r0 = com.facebook.react.devsupport.BundleDeltaClient.ClientType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.devsupport.BundleDeltaClient.C06711.f972xca7c22d2 = r0
                com.facebook.react.devsupport.BundleDeltaClient$ClientType r1 = com.facebook.react.devsupport.BundleDeltaClient.ClientType.DEV_SUPPORT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.react.devsupport.BundleDeltaClient.C06711.f972xca7c22d2     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.devsupport.BundleDeltaClient$ClientType r1 = com.facebook.react.devsupport.BundleDeltaClient.ClientType.NATIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.devsupport.BundleDeltaClient.C06711.<clinit>():void");
        }
    }

    public enum ClientType {
        NONE,
        DEV_SUPPORT,
        NATIVE
    }

    @Nullable
    public static BundleDeltaClient create(ClientType clientType) {
        int i = C06711.f972xca7c22d2[clientType.ordinal()];
        if (i == 1) {
            return new BundleDeltaJavaClient(null);
        }
        if (i != 2) {
            return null;
        }
        return new BundleDeltaNativeClient(null);
    }

    public static boolean isDeltaUrl(String str) {
        return str.indexOf(".delta?") != -1;
    }

    public abstract boolean canHandle(ClientType clientType);

    public final synchronized String extendUrlForDelta(String str) {
        if (this.mRevisionId != null) {
            str = str + "&revisionId=" + this.mRevisionId;
        }
        return str;
    }

    public abstract Pair<Boolean, NativeDeltaClient> processDelta(oOOO000O oooo000o, File file) throws IOException;

    public synchronized Pair<Boolean, NativeDeltaClient> processDelta(Headers headers, oOOO000O oooo000o, File file) throws IOException {
        this.mRevisionId = headers.get(METRO_DELTA_ID_HEADER);
        return processDelta(oooo000o, file);
    }

    public synchronized void reset() {
        this.mRevisionId = null;
    }

    public static class BundleDeltaJavaClient extends BundleDeltaClient {
        public final LinkedHashMap<Number, byte[]> mModules;
        public byte[] mPostCode;
        public byte[] mPreCode;

        public BundleDeltaJavaClient() {
            this.mModules = new LinkedHashMap<>();
        }

        public static int removeModules(JsonReader jsonReader, LinkedHashMap<Number, byte[]> linkedHashMap) throws IOException {
            jsonReader.beginArray();
            int i = 0;
            while (jsonReader.hasNext()) {
                linkedHashMap.remove(Integer.valueOf(jsonReader.nextInt()));
                i++;
            }
            jsonReader.endArray();
            return i;
        }

        public static int setModules(JsonReader jsonReader, LinkedHashMap<Number, byte[]> linkedHashMap) throws IOException {
            jsonReader.beginArray();
            int i = 0;
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                linkedHashMap.put(Integer.valueOf(jsonReader.nextInt()), jsonReader.nextString().getBytes());
                jsonReader.endArray();
                i++;
            }
            jsonReader.endArray();
            return i;
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public boolean canHandle(ClientType clientType) {
            return clientType == ClientType.DEV_SUPPORT;
        }

        /* JADX INFO: finally extract failed */
        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public synchronized Pair<Boolean, NativeDeltaClient> processDelta(oOOO000O oooo000o, File file) throws IOException {
            int removeModules;
            JsonReader jsonReader = new JsonReader(new InputStreamReader(oooo000o.m19755OooO00o()));
            jsonReader.beginObject();
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName.equals(C7383o0OOO0O.OooOO0o)) {
                    this.mPreCode = jsonReader.nextString().getBytes();
                } else if (nextName.equals("post")) {
                    this.mPostCode = jsonReader.nextString().getBytes();
                } else {
                    if (nextName.equals("modules")) {
                        removeModules = setModules(jsonReader, this.mModules);
                    } else if (nextName.equals("added")) {
                        removeModules = setModules(jsonReader, this.mModules);
                    } else if (nextName.equals("modified")) {
                        removeModules = setModules(jsonReader, this.mModules);
                    } else if (nextName.equals("deleted")) {
                        removeModules = removeModules(jsonReader, this.mModules);
                    } else {
                        jsonReader.skipValue();
                    }
                    i += removeModules;
                }
            }
            jsonReader.endObject();
            jsonReader.close();
            if (i == 0) {
                return Pair.create(Boolean.FALSE, null);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(this.mPreCode);
                fileOutputStream.write(10);
                for (byte[] bArr : this.mModules.values()) {
                    fileOutputStream.write(bArr);
                    fileOutputStream.write(10);
                }
                fileOutputStream.write(this.mPostCode);
                fileOutputStream.write(10);
                fileOutputStream.flush();
                fileOutputStream.close();
                return Pair.create(Boolean.TRUE, null);
            } catch (Throwable th) {
                fileOutputStream.flush();
                fileOutputStream.close();
                throw th;
            }
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public synchronized void reset() {
            BundleDeltaClient.super.reset();
            this.mPreCode = null;
            this.mPostCode = null;
            this.mModules.clear();
        }

        public /* synthetic */ BundleDeltaJavaClient(C06711 r1) {
            this();
        }
    }

    public static class BundleDeltaNativeClient extends BundleDeltaClient {
        public final NativeDeltaClient nativeClient;

        public BundleDeltaNativeClient() {
            this.nativeClient = new NativeDeltaClient();
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public boolean canHandle(ClientType clientType) {
            return clientType == ClientType.NATIVE;
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public Pair<Boolean, NativeDeltaClient> processDelta(oOOO000O oooo000o, File file) throws IOException {
            this.nativeClient.processDelta(oooo000o);
            return Pair.create(Boolean.FALSE, this.nativeClient);
        }

        @Override // com.facebook.react.devsupport.BundleDeltaClient
        public void reset() {
            BundleDeltaClient.super.reset();
            this.nativeClient.reset();
        }

        public /* synthetic */ BundleDeltaNativeClient(C06711 r1) {
            this();
        }
    }
}
