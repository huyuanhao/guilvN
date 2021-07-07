package com.p118pd.sdk;

import android.content.Context;
import com.p118pd.sdk.C9349III;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Cache;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: com.pd.sdk.ooOOoo0O  reason: case insensitive filesystem */
public class C8990ooOOoo0O {
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8962ooOOo f22265OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8977ooOOoO0O f22266OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9015ooOo0Ooo f22267OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III.OooO0OO f22268OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22269OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<Protocol> f22270OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HostnameVerifier f22271OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SSLSocketFactory f22272OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Cache f22273OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Dns f22274OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Interceptor f22275OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OkHttpClient.Builder f22276OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OkHttpClient f22277OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CallAdapter.Factory f22278OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Converter.Factory f22279OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Retrofit.Builder f22280OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Retrofit f22281OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22282OooO00o;
    public Interceptor OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22283OooO0O0;
    public Interceptor OooO0OO;
    public Interceptor OooO0Oo;

    /* renamed from: com.pd.sdk.ooOOoo0O$OooO00o */
    public class OooO00o implements C9349III.OooO0OO {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC9847l1
        public Object call(Object obj) {
            return ((C9349III) obj).OooO0OO(C6261iii1I1.OooO0OO()).OooO0o(C6261iii1I1.OooO0OO()).m21402OooO00o(C6342il11.OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.ooOOoo0O$OooO0O0 */
    public static final class OooO0O0 {
        public static final int OooO00o = 60;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Context f22284OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8962ooOOo f22285OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC8977ooOOoO0O f22286OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC9015ooOo0Ooo f22287OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f22288OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Protocol> f22289OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public HostnameVerifier f22290OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public SSLSocketFactory f22291OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Cache f22292OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Dns f22293OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Interceptor f22294OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OkHttpClient.Builder f22295OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OkHttpClient f22296OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public CallAdapter.Factory f22297OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Converter.Factory f22298OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Retrofit.Builder f22299OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Retrofit f22300OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f22301OooO00o;
        public Interceptor OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f22302OooO0O0;
        public Interceptor OooO0OO;
        public Interceptor OooO0Oo;

        /* renamed from: com.pd.sdk.ooOOoo0O$OooO0O0$OooO00o */
        public class OooO00o extends ProxySelector {
            public OooO00o() {
            }

            public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
            }

            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                return Collections.singletonList(Proxy.NO_PROXY);
            }
        }

        public OooO0O0(Context context) {
            this.f22284OooO00o = context;
            this.f22295OooO00o = new OkHttpClient.Builder();
            this.f22299OooO00o = new Retrofit.Builder();
        }

        public OooO0O0 OooO0OO(int i) {
            return OooO0OO(i, TimeUnit.SECONDS);
        }

        public OooO0O0 OooO0Oo(Interceptor interceptor) {
            this.OooO0OO = interceptor;
            return this;
        }

        public OooO0O0 OooO0O0(int i) {
            return OooO0O0(i, TimeUnit.SECONDS);
        }

        public OooO0O0 OooO0OO(int i, TimeUnit timeUnit) {
            if (i != -1) {
                this.f22295OooO00o.writeTimeout((long) i, timeUnit);
            } else {
                this.f22295OooO00o.writeTimeout(60, TimeUnit.SECONDS);
            }
            return this;
        }

        public OooO0O0 OooO0O0(int i, TimeUnit timeUnit) {
            if (i != -1) {
                this.f22295OooO00o.readTimeout((long) i, timeUnit);
            } else {
                this.f22295OooO00o.readTimeout(60, TimeUnit.SECONDS);
            }
            return this;
        }

        public OooO0O0(C8990ooOOoo0O oooooo0o) {
            this.f22284OooO00o = oooooo0o.OooO00o;
            this.f22300OooO00o = oooooo0o.f22281OooO00o;
            this.f22288OooO00o = oooooo0o.f22269OooO00o;
            this.f22299OooO00o = oooooo0o.f22280OooO00o;
            this.f22295OooO00o = oooooo0o.f22276OooO00o;
            this.f22296OooO00o = oooooo0o.f22277OooO00o;
            this.f22291OooO00o = oooooo0o.f22272OooO00o;
            this.f22290OooO00o = oooooo0o.f22271OooO00o;
            this.f22289OooO00o = oooooo0o.f22270OooO00o;
            this.f22286OooO00o = oooooo0o.f22266OooO00o;
            this.OooO0Oo = oooooo0o.OooO0Oo;
            this.f22301OooO00o = oooooo0o.f22282OooO00o;
            this.f22298OooO00o = oooooo0o.f22279OooO00o;
            this.f22297OooO00o = oooooo0o.f22278OooO00o;
            this.f22294OooO00o = oooooo0o.OooO0OO;
            this.f22292OooO00o = oooooo0o.f22273OooO00o;
            this.OooO0O0 = oooooo0o.OooO0O0;
            this.OooO0OO = oooooo0o.f22275OooO00o;
            this.f22287OooO00o = oooooo0o.f22267OooO00o;
            this.f22285OooO00o = oooooo0o.f22265OooO00o;
            this.f22293OooO00o = oooooo0o.f22274OooO00o;
            this.f22302OooO0O0 = oooooo0o.f22283OooO0O0;
        }

        public OooO0O0 OooO0OO(Interceptor interceptor) {
            this.f22294OooO00o = interceptor;
            return this;
        }

        public OooO0O0 OooO0O0(Interceptor interceptor) {
            AbstractC8962ooOOo ooooo;
            AbstractC8977ooOOoO0O oooooo0o;
            if (interceptor == null) {
                interceptor = new C9002ooOo0000();
            }
            boolean z = interceptor instanceof C9002ooOo0000;
            if (z && (oooooo0o = this.f22286OooO00o) != null) {
                ((C9002ooOo0000) interceptor).OooO00o(oooooo0o);
            }
            if (z && (ooooo = this.f22285OooO00o) != null) {
                ((C9002ooOo0000) interceptor).OooO00o(ooooo);
            }
            this.OooO0Oo = interceptor;
            return this;
        }

        public OooO0O0 OooO0O0(boolean z) {
            this.f22302OooO0O0 = z;
            return this;
        }

        public OooO0O0 OooO00o(String str) {
            this.f22288OooO00o = str;
            return this;
        }

        public OooO0O0 OooO00o(int i) {
            return OooO00o(i, TimeUnit.SECONDS);
        }

        public OooO0O0 OooO00o(int i, TimeUnit timeUnit) {
            if (i != -1) {
                this.f22295OooO00o.connectTimeout((long) i, timeUnit);
            } else {
                this.f22295OooO00o.connectTimeout(60, TimeUnit.SECONDS);
            }
            return this;
        }

        public OooO0O0 OooO00o(String[] strArr, int[] iArr) {
            if (strArr == null) {
                throw new NullPointerException("hosts == null");
            } else if (iArr != null) {
                OooO00o(C9012ooOo0Oo.OooO00o(this.f22284OooO00o, iArr));
                OooO00o(C9012ooOo0Oo.OooO00o(strArr));
                return this;
            } else {
                throw new NullPointerException("certificates == null");
            }
        }

        public OooO0O0 OooO00o() {
            OooO00o(C9013ooOo0Oo0.m20673OooO00o());
            OooO00o(C9013ooOo0Oo0.OooO00o());
            OooO00o(Collections.singletonList(Protocol.HTTP_1_1));
            return this;
        }

        public OooO0O0 OooO00o(SSLSocketFactory sSLSocketFactory) {
            this.f22291OooO00o = sSLSocketFactory;
            return this;
        }

        public OooO0O0 OooO00o(HostnameVerifier hostnameVerifier) {
            this.f22290OooO00o = hostnameVerifier;
            return this;
        }

        public OooO0O0 OooO00o(List<Protocol> list) {
            this.f22289OooO00o = list;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8977ooOOoO0O oooooo0o) {
            this.f22286OooO00o = oooooo0o;
            return this;
        }

        public OooO0O0 OooO00o(AbstractC8962ooOOo ooooo) {
            this.f22285OooO00o = ooooo;
            return this;
        }

        public OooO0O0 OooO00o(boolean z) {
            this.f22301OooO00o = z;
            return this;
        }

        public OooO0O0 OooO00o(Converter.Factory factory) {
            this.f22298OooO00o = factory;
            return this;
        }

        public OooO0O0 OooO00o(CallAdapter.Factory factory) {
            this.f22297OooO00o = factory;
            return this;
        }

        public OooO0O0 OooO00o(Cache cache) {
            this.f22292OooO00o = cache;
            return this;
        }

        public OooO0O0 OooO00o(Interceptor interceptor) {
            this.OooO0O0 = interceptor;
            return this;
        }

        public OooO0O0 OooO00o(Dns dns) {
            this.f22293OooO00o = dns;
            return this;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C8990ooOOoo0O m20659OooO00o() {
            String str = this.f22288OooO00o;
            if (str == null) {
                throw new IllegalStateException("Base URL required.");
            } else if (this.f22295OooO00o != null) {
                Retrofit.Builder builder = this.f22299OooO00o;
                if (builder != null) {
                    builder.baseUrl(str);
                    SSLSocketFactory sSLSocketFactory = this.f22291OooO00o;
                    if (sSLSocketFactory != null) {
                        this.f22295OooO00o.sslSocketFactory(sSLSocketFactory);
                    }
                    HostnameVerifier hostnameVerifier = this.f22290OooO00o;
                    if (hostnameVerifier != null) {
                        this.f22295OooO00o.hostnameVerifier(hostnameVerifier);
                    }
                    if (this.f22301OooO00o) {
                        this.f22295OooO00o.addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
                    }
                    List<Protocol> list = this.f22289OooO00o;
                    if (list != null && list.size() > 0) {
                        this.f22295OooO00o.protocols(this.f22289OooO00o);
                    }
                    Interceptor interceptor = this.OooO0Oo;
                    if (interceptor != null) {
                        this.f22295OooO00o.addInterceptor(interceptor);
                    }
                    Interceptor interceptor2 = this.f22294OooO00o;
                    if (interceptor2 != null) {
                        this.f22295OooO00o.addInterceptor(interceptor2);
                    }
                    if (this.f22298OooO00o == null) {
                        this.f22298OooO00o = GsonConverterFactory.create();
                    }
                    this.f22299OooO00o.addConverterFactory(this.f22298OooO00o);
                    if (this.f22297OooO00o == null) {
                        this.f22297OooO00o = RxJavaCallAdapterFactory.create();
                    }
                    this.f22299OooO00o.addCallAdapterFactory(this.f22297OooO00o);
                    Cache cache = this.f22292OooO00o;
                    if (cache != null) {
                        this.f22295OooO00o.cache(cache);
                    }
                    Interceptor interceptor3 = this.OooO0O0;
                    if (interceptor3 != null) {
                        this.f22295OooO00o.addInterceptor(interceptor3);
                    }
                    Interceptor interceptor4 = this.OooO0OO;
                    if (interceptor4 != null) {
                        this.f22295OooO00o.addNetworkInterceptor(interceptor4);
                    }
                    Dns dns = this.f22293OooO00o;
                    if (dns != null) {
                        this.f22295OooO00o.dns(dns);
                    }
                    if (this.f22302OooO0O0) {
                        this.f22295OooO00o.proxySelector(new OooO00o());
                    }
                    OkHttpClient build = this.f22295OooO00o.build();
                    this.f22296OooO00o = build;
                    this.f22299OooO00o.client(build);
                    Retrofit build2 = this.f22299OooO00o.build();
                    this.f22300OooO00o = build2;
                    this.f22287OooO00o = (AbstractC9015ooOo0Ooo) build2.create(AbstractC9015ooOo0Ooo.class);
                    return new C8990ooOOoo0O(this, null);
                }
                throw new IllegalStateException("retrofitBuilder required.");
            } else {
                throw new IllegalStateException("okhttpBuilder required.");
            }
        }
    }

    public /* synthetic */ C8990ooOOoo0O(OooO0O0 oooO0O0, OooO00o oooO00o) {
        this(oooO0O0);
    }

    public C8990ooOOoo0O(OooO0O0 oooO0O0) {
        this.f22268OooO00o = new OooO00o();
        this.f22282OooO00o = oooO0O0.f22301OooO00o;
        this.OooO00o = oooO0O0.f22284OooO00o;
        this.f22280OooO00o = oooO0O0.f22299OooO00o;
        this.f22276OooO00o = oooO0O0.f22295OooO00o;
        this.f22269OooO00o = oooO0O0.f22288OooO00o;
        this.f22281OooO00o = oooO0O0.f22300OooO00o;
        this.f22277OooO00o = oooO0O0.f22296OooO00o;
        this.f22271OooO00o = oooO0O0.f22290OooO00o;
        this.f22272OooO00o = oooO0O0.f22291OooO00o;
        this.f22270OooO00o = oooO0O0.f22289OooO00o;
        this.f22266OooO00o = oooO0O0.f22286OooO00o;
        this.OooO0Oo = oooO0O0.OooO0Oo;
        this.f22279OooO00o = oooO0O0.f22298OooO00o;
        this.f22278OooO00o = oooO0O0.f22297OooO00o;
        this.f22273OooO00o = oooO0O0.f22292OooO00o;
        this.OooO0OO = oooO0O0.f22294OooO00o;
        this.OooO0O0 = oooO0O0.OooO0O0;
        this.f22275OooO00o = oooO0O0.OooO0OO;
        this.f22267OooO00o = oooO0O0.f22287OooO00o;
        this.f22265OooO00o = oooO0O0.f22285OooO00o;
        this.f22274OooO00o = oooO0O0.f22293OooO00o;
        this.f22283OooO0O0 = oooO0O0.f22302OooO0O0;
    }

    public <T> T OooO00o(Class<T> cls) {
        return (T) this.f22281OooO00o.create(cls);
    }

    public C9349III<ResponseBody> OooO00o(String str, Map<String, String> map, File file) {
        return OooO00o(str, "multipart/form-data", map, file);
    }

    public C9349III<ResponseBody> OooO00o(String str, String str2, Map<String, String> map, File file) {
        OooO00o();
        AbstractC8977ooOOoO0O oooooo0o = this.f22266OooO00o;
        if (oooooo0o != null) {
            map = oooooo0o.OooO00o(map);
        }
        return this.f22267OooO00o.OooO00o(str, OooO00o(map), MultipartBody.Part.createFormData("uploadFile", file.getName(), RequestBody.create(MediaType.parse(str2), file))).OooO00o(this.f22268OooO00o);
    }

    public C9349III<ResponseBody> OooO00o(String str, Map<String, String> map, List<File> list) {
        return OooO00o(str, "multipart/form-data", map, list);
    }

    public C9349III<ResponseBody> OooO00o(String str, String str2, Map<String, String> map, List<File> list) {
        OooO00o();
        AbstractC8977ooOOoO0O oooooo0o = this.f22266OooO00o;
        if (oooooo0o != null) {
            map = oooooo0o.OooO00o(map);
        }
        return this.f22267OooO00o.OooO00o(str, OooO00o(map), OooO00o(list, MediaType.parse(str2))).OooO00o(this.f22268OooO00o);
    }

    private void OooO00o() {
        if (this.f22267OooO00o == null) {
            this.f22267OooO00o = (AbstractC9015ooOo0Ooo) this.f22281OooO00o.create(AbstractC9015ooOo0Ooo.class);
        }
    }

    private List<MultipartBody.Part> OooO00o(List<File> list, MediaType mediaType) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            File file = list.get(i);
            arrayList.add(MultipartBody.Part.createFormData("uploadFile", file.getName(), RequestBody.create(mediaType, file)));
        }
        return arrayList;
    }

    private Map<String, RequestBody> OooO00o(Map<String, String> map) {
        HashMap hashMap = new HashMap(map.size());
        for (String str : map.keySet()) {
            hashMap.put(str, RequestBody.create(MultipartBody.FORM, map.get(str)));
        }
        return hashMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0O0 m20658OooO00o() {
        return new OooO0O0(this);
    }
}
