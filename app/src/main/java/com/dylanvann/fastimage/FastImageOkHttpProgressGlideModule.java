package com.dylanvann.fastimage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.AbstractC8963ooOOo0;
import com.p118pd.sdk.C7649o0oOoOo0;
import com.p118pd.sdk.C7764o0ooooo0;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.ComponentCallbacks2C7604o0o0Oo0o;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import com.p118pd.sdk.oOOO00OO;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class FastImageOkHttpProgressGlideModule extends AbstractC8963ooOOo0 {
    public static OooO0O0 progressListener = new OooO0O0();

    public static class OooO00o implements Interceptor {
        public final /* synthetic */ AbstractC5101OooO0Oo OooO00o;

        public OooO00o(AbstractC5101OooO0Oo oooO0Oo) {
            this.OooO00o = oooO0Oo;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            Response proceed = chain.proceed(request);
            return proceed.newBuilder().body(new OooO0OO(request.url().toString(), proceed.body(), this.OooO00o)).build();
        }
    }

    /* renamed from: com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC5101OooO0Oo {
        void OooO00o(String str, long j, long j2);
    }

    public static Interceptor createInterceptor(AbstractC5101OooO0Oo oooO0Oo) {
        return new OooO00o(oooO0Oo);
    }

    public static void expect(String str, FastImageProgressListener fastImageProgressListener) {
        progressListener.OooO00o(str, fastImageProgressListener);
    }

    public static void forget(String str) {
        progressListener.OooO00o(str);
    }

    @Override // com.p118pd.sdk.AbstractC7870oO0OOOoo, com.p118pd.sdk.AbstractC8963ooOOo0
    public void registerComponents(@NonNull Context context, @NonNull ComponentCallbacks2C7604o0o0Oo0o o0o0oo0o, @NonNull Registry registry) {
        registry.OooO0OO(C7764o0ooooo0.class, InputStream.class, new C7649o0oOoOo0.OooO00o(OkHttpClientProvider.getOkHttpClient().newBuilder().addInterceptor(createInterceptor(progressListener)).build()));
    }

    public static class OooO0O0 implements AbstractC5101OooO0Oo {
        public final Handler OooO00o = new Handler(Looper.getMainLooper());

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<String, FastImageProgressListener> f14876OooO00o = new WeakHashMap();
        public final Map<String, Long> OooO0O0 = new HashMap();

        public class OooO00o implements Runnable {
            public final /* synthetic */ long OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ FastImageProgressListener f14878OooO00o;
            public final /* synthetic */ long OooO0O0;
            public final /* synthetic */ String o0ooOOo;

            public OooO00o(FastImageProgressListener fastImageProgressListener, String str, long j, long j2) {
                this.f14878OooO00o = fastImageProgressListener;
                this.o0ooOOo = str;
                this.OooO00o = j;
                this.OooO0O0 = j2;
            }

            public void run() {
                this.f14878OooO00o.onProgress(this.o0ooOOo, this.OooO00o, this.OooO0O0);
            }
        }

        public void OooO00o(String str) {
            this.f14876OooO00o.remove(str);
            this.OooO0O0.remove(str);
        }

        public void OooO00o(String str, FastImageProgressListener fastImageProgressListener) {
            this.f14876OooO00o.put(str, fastImageProgressListener);
        }

        @Override // com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule.AbstractC5101OooO0Oo
        public void OooO00o(String str, long j, long j2) {
            FastImageProgressListener fastImageProgressListener = this.f14876OooO00o.get(str);
            if (fastImageProgressListener != null) {
                if (j2 <= j) {
                    OooO00o(str);
                }
                if (OooO00o(str, j, j2, fastImageProgressListener.getGranularityPercentage())) {
                    this.OooO00o.post(new OooO00o(fastImageProgressListener, str, j, j2));
                }
            }
        }

        private boolean OooO00o(String str, long j, long j2, float f) {
            if (!(f == 0.0f || j == 0 || j2 == j)) {
                long j3 = (long) (((((float) j) * 100.0f) / ((float) j2)) / f);
                Long l = this.OooO0O0.get(str);
                if (l != null && j3 == l.longValue()) {
                    return false;
                }
                this.OooO0O0.put(str, Long.valueOf(j3));
            }
            return true;
        }
    }

    public static class OooO0OO extends ResponseBody {
        public final AbstractC5101OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public oOOO000O f14879OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ResponseBody f14880OooO00o;
        public final String o0ooOOo;

        public class OooO00o extends oOOO00OO {
            public long OooO00o = 0;

            public OooO00o(AbstractC8930ooOOO0OO ooooo0oo) {
                super(ooooo0oo);
            }

            @Override // com.p118pd.sdk.oOOO00OO, com.p118pd.sdk.AbstractC8930ooOOO0OO
            public long read(OOOO000 oooo000, long j) throws IOException {
                long read = super.read(oooo000, j);
                long contentLength = OooO0OO.this.f14880OooO00o.contentLength();
                if (read == -1) {
                    this.OooO00o = contentLength;
                } else {
                    this.OooO00o += read;
                }
                OooO0OO.this.OooO00o.OooO00o(OooO0OO.this.o0ooOOo, this.OooO00o, contentLength);
                return read;
            }
        }

        public OooO0OO(String str, ResponseBody responseBody, AbstractC5101OooO0Oo oooO0Oo) {
            this.o0ooOOo = str;
            this.f14880OooO00o = responseBody;
            this.OooO00o = oooO0Oo;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f14880OooO00o.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f14880OooO00o.contentType();
        }

        @Override // okhttp3.ResponseBody
        public oOOO000O source() {
            if (this.f14879OooO00o == null) {
                this.f14879OooO00o = C9143oooO0oOo.OooO00o(source(this.f14880OooO00o.source()));
            }
            return this.f14879OooO00o;
        }

        private AbstractC8930ooOOO0OO source(AbstractC8930ooOOO0OO ooooo0oo) {
            return new OooO00o(ooooo0oo);
        }
    }
}
