package com.qiyukf.basesdk.p120b.p121a.p123b.p124a;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8025oOO00oOO;
import com.qiyukf.basesdk.C1708a;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p123b.C1735a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p125b.C1741a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1744a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1746c;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1748e;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1749f;
import com.qiyukf.basesdk.p120b.p121a.p123b.p127d.C1750a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p127d.C1751b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p128e.C1753b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p128e.C1754c;
import com.qiyukf.basesdk.p120b.p121a.p130c.C1757a;
import com.qiyukf.basesdk.p138c.p142c.C1852c;
import com.umeng.analytics.pro.C3416b;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.qiyukf.basesdk.b.a.b.a.a */
public class C1739a {

    /* renamed from: o */
    public static final String f3174o = C1754c.m3225a(C1739a.class);

    /* renamed from: a */
    public volatile HttpURLConnection f3175a;

    /* renamed from: b */
    public volatile HttpURLConnection f3176b;

    /* renamed from: c */
    public volatile boolean f3177c = false;

    /* renamed from: d */
    public Context f3178d;

    /* renamed from: e */
    public String f3179e;

    /* renamed from: f */
    public String f3180f;

    /* renamed from: g */
    public String f3181g;

    /* renamed from: h */
    public File f3182h;

    /* renamed from: i */
    public Object f3183i;

    /* renamed from: j */
    public String f3184j;

    /* renamed from: k */
    public boolean f3185k;

    /* renamed from: l */
    public C1749f f3186l;

    /* renamed from: m */
    public long f3187m;

    /* renamed from: n */
    public C1748e f3188n;

    /* renamed from: p */
    public AbstractC1745b f3189p;

    public C1739a(Context context, String str, String str2, String str3, File file, Object obj, String str4, C1749f fVar) {
        this.f3178d = context;
        this.f3179e = str;
        this.f3180f = str2;
        this.f3181g = str3;
        this.f3182h = file;
        this.f3183i = obj;
        this.f3184j = str4;
        this.f3185k = true;
        this.f3188n = new C1748e();
        this.f3186l = fVar;
    }

    /* renamed from: a */
    private C1744a m3134a(C1744a aVar) {
        if (this.f3177c) {
            this.f3188n.mo33941a(2);
            this.f3188n.mo33945b(600);
            C1744a aVar2 = new C1744a(this.f3183i, this.f3184j, 600, "", "", "uploading is cancelled", null);
            this.f3189p.mo33919b();
            return aVar2;
        } else if (aVar.mo33929a() == 200 && aVar.mo33930b() == null) {
            this.f3188n.mo33941a(0);
            this.f3189p.mo33915a();
            return aVar;
        } else {
            this.f3188n.mo33941a(1);
            this.f3189p.mo33917a(aVar);
            String str = f3174o;
            C1709a.m3020e(str, "upload error with code: " + aVar.mo33929a());
            return aVar;
        }
    }

    /* renamed from: a */
    private C1744a m3135a(String str, boolean z) {
        C1709a.m3018d(f3174o, "get lbs address");
        long currentTimeMillis = System.currentTimeMillis();
        C1746c a = m3138a(C1751b.m3209a(str), (Map<String, String>) null);
        this.f3188n.mo33946b(System.currentTimeMillis() - currentTimeMillis);
        if (a.mo33931a() == 200) {
            JSONObject b = a.mo33932b();
            this.f3188n.mo33947b(b.getString("lbs"));
            String str2 = f3174o;
            C1709a.m3018d(str2, "LBS address result: " + b.toString());
            C1753b.m3216a(this.f3178d, b);
            return null;
        }
        this.f3188n.mo33940a();
        this.f3188n.mo33944b();
        C1744a aVar = new C1744a(this.f3183i, this.f3184j, a.mo33931a(), C1754c.m3224a(a, "requestID"), C1754c.m3224a(a, "callbackRetMsg"), a.mo33932b().toString(), null);
        if (!z) {
            m3134a(aVar);
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0205, code lost:
        r1 = r31;
        r2 = r18;
        r6 = r20;
        r7 = r21;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1746c m3136a(android.content.Context r32, java.io.File r33, long r34, int r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, boolean r41) {
        /*
        // Method dump skipped, instructions count: 539
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p123b.p124a.C1739a.m3136a(android.content.Context, java.io.File, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):com.qiyukf.basesdk.b.a.b.c.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1746c m3137a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p123b.p124a.C1739a.m3137a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):com.qiyukf.basesdk.b.a.b.c.c");
    }

    /* renamed from: a */
    private C1746c m3138a(String str, Map<String, String> map) {
        Throwable th;
        InputStream inputStream;
        Exception e;
        C1746c cVar;
        int i = 799;
        try {
            this.f3176b = C1757a.m3239b(str, "NOS-QUERY");
            C1757a.m3237a(this.f3176b, map);
            i = this.f3176b.getResponseCode();
            inputStream = this.f3176b.getInputStream();
            if (inputStream != null) {
                try {
                    String a = C1757a.m3230a(inputStream);
                    C1709a.m3018d(f3174o, "code: " + i + ", result: " + a);
                    cVar = new C1746c(i, new JSONObject(a), null);
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C1709a.m3015b(f3174o, "http get task exception, error code=" + i, e);
                        C1746c cVar2 = new C1746c(i, new JSONObject(), e);
                        C1757a.m3234a((Closeable) inputStream);
                        this.f3176b.disconnect();
                        this.f3176b = null;
                        return cVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        C1757a.m3234a((Closeable) inputStream);
                        this.f3176b.disconnect();
                        this.f3176b = null;
                        throw th;
                    }
                }
            } else {
                cVar = new C1746c(899, new JSONObject(), null);
            }
            C1757a.m3234a((Closeable) inputStream);
            this.f3176b.disconnect();
            this.f3176b = null;
            return cVar;
        } catch (Exception e3) {
            e = e3;
            inputStream = null;
            C1709a.m3015b(f3174o, "http get task exception, error code=" + i, e);
            C1746c cVar22 = new C1746c(i, new JSONObject(), e);
            C1757a.m3234a((Closeable) inputStream);
            this.f3176b.disconnect();
            this.f3176b = null;
            return cVar22;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            C1757a.m3234a((Closeable) inputStream);
            this.f3176b.disconnect();
            this.f3176b = null;
            throw th;
        }
    }

    /* renamed from: a */
    private C1746c m3139a(String str, byte[] bArr) {
        int d = C1735a.m3114c().mo33966d();
        String str2 = f3174o;
        C1709a.m3018d(str2, "user set the retry times is : " + d);
        int i = 0;
        int i2 = -1;
        C1746c cVar = null;
        while (true) {
            int i3 = i + 1;
            if (i >= d) {
                break;
            }
            try {
                if (this.f3177c) {
                    break;
                }
                String str3 = f3174o;
                C1709a.m3018d(str3, "put block to server side with url: " + str + ", length: " + bArr.length + ", retryTime: " + i3);
                cVar = m3141b(str, bArr);
                if (this.f3177c) {
                    return cVar;
                }
                int a = cVar.mo33931a();
                if (a == 200) {
                    String str4 = f3174o;
                    C1709a.m3018d(str4, "http post result is back, result:" + cVar.toString() + ", retryTime: " + i3);
                    JSONObject b = cVar.mo33932b();
                    if (b != null && b.has(C3416b.f8433Q) && b.has("offset")) {
                        int i4 = cVar.mo33932b().getInt("offset");
                        String str5 = f3174o;
                        C1709a.m3018d(str5, "http post result success with context: " + this.f3178d + ", offset: " + i4);
                        i2 = i4;
                    }
                } else if (a == 403 || a == 500 || a == 520) {
                    return cVar;
                } else {
                    if (a == 799) {
                        i2 = -4;
                    } else if (a == 899) {
                        i2 = -5;
                    }
                }
                if (i2 > 0) {
                    String str6 = f3174o;
                    C1709a.m3018d(str6, "retryPutFile with success result: " + i2);
                    return cVar;
                }
                this.f3188n.mo33949c(this.f3188n.mo33948c() + 1);
                i = i3;
            } catch (Exception e) {
                C1709a.m3015b(f3174o, "put file exception", e);
            }
        }
        return cVar;
    }

    /* renamed from: b */
    private C1746c m3140b(String str, Map<String, String> map) {
        int e = C1735a.m3114c().mo33967e();
        int i = 0;
        C1746c cVar = null;
        while (true) {
            int i2 = i + 1;
            if (i >= e || this.f3177c) {
                return cVar;
            }
            String str2 = f3174o;
            C1709a.m3018d(str2, "query offset with url: " + str + ", retry times: " + i2);
            cVar = m3138a(str, map);
            if (cVar.mo33931a() == 200) {
                JSONObject b = cVar.mo33932b();
                String str3 = f3174o;
                C1709a.m3018d(str3, "get break offset result:" + b.toString());
                return cVar;
            }
            C1748e eVar = this.f3188n;
            eVar.mo33953d(eVar.mo33952d() + 1);
            if (cVar.mo33931a() == 404) {
                C1709a.m3018d(f3174o, "upload file is expired in server side.");
                return cVar;
            }
            i = i2;
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fe, code lost:
        r2 = null;
        r10 = r9;
        r9 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0104, code lost:
        r10 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0103 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1746c m3141b(java.lang.String r9, byte[] r10) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p123b.p124a.C1739a.m3141b(java.lang.String, byte[]):com.qiyukf.basesdk.b.a.b.c.c");
    }

    /* renamed from: a */
    public final void mo33922a() {
        C1709a.m3018d(f3174o, "uploading is canceling");
        this.f3177c = true;
        if (this.f3176b != null) {
            this.f3176b.disconnect();
        }
        if (this.f3175a != null) {
            this.f3175a.disconnect();
        }
    }

    /* renamed from: a */
    public final void mo33923a(AbstractC1745b bVar) {
        this.f3189p = bVar;
    }

    /* renamed from: b */
    public final C1744a mo33924b() {
        if (this.f3177c) {
            return null;
        }
        try {
            this.f3188n.mo33954d(C1754c.m3223a(this.f3178d));
            this.f3188n.mo33943a(C1754c.m3222a());
            boolean a = C1753b.m3217a(this.f3178d);
            String str = f3174o;
            StringBuilder sb = new StringBuilder("lbs storage ");
            sb.append(a ? "valid" : "invalid");
            C1709a.m3018d(str, sb.toString());
            String b = C1753b.m3219b(this.f3178d);
            C1744a a2 = !TextUtils.isEmpty(b) ? m3135a(b, true) : null;
            if (TextUtils.isEmpty(b) || a2 != null) {
                a2 = m3135a(C1708a.m3006e(), false);
            }
            if (a2 != null) {
                return a2;
            }
            if (TextUtils.isEmpty(this.f3186l.mo33956a())) {
                this.f3186l.mo33957a(C1852c.m3513b(this.f3182h.getPath()));
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f3184j != null && !this.f3184j.equals("")) {
                C1746c a3 = m3137a(this.f3178d, this.f3180f, this.f3181g, this.f3184j, this.f3179e, this.f3185k);
                if (a3.mo33931a() == 404 || a3.mo33931a() == 400) {
                    this.f3184j = null;
                } else if (a3.mo33931a() != 200) {
                    return m3134a(new C1744a(this.f3183i, this.f3184j, a3.mo33931a(), C1754c.m3224a(a3, "requestID"), C1754c.m3224a(a3, "callbackRetMsg"), a3.mo33932b().toString(), null));
                } else {
                    this.f3187m = (long) a3.mo33932b().getInt("offset");
                }
            }
            if ((this.f3187m < this.f3182h.length() || this.f3182h.length() == 0) && this.f3187m >= 0) {
                Context context = this.f3178d;
                File file = this.f3182h;
                long j = this.f3187m;
                C1735a.m3114c();
                C1746c a4 = m3136a(context, file, j, C1750a.m3204c(), this.f3180f, this.f3181g, this.f3179e, this.f3184j, this.f3185k);
                if (a4 == null) {
                    a4 = new C1746c(500, new JSONObject(), null);
                }
                this.f3188n.mo33950c(System.currentTimeMillis() - currentTimeMillis);
                this.f3188n.mo33945b(a4.mo33931a());
                return m3134a(new C1744a(this.f3183i, this.f3184j, a4.mo33931a(), C1754c.m3224a(a4, "requestID"), C1754c.m3224a(a4, "callbackRetMsg"), a4.mo33932b().toString(), null));
            }
            Object obj = this.f3183i;
            String str2 = this.f3184j;
            C1744a aVar = new C1744a(obj, str2, C8025oOO00oOO.o0ooOO0, "", "", null, new C1741a("offset is invalid in server side, with offset: " + this.f3187m + ", file length: " + this.f3182h.length()));
            m3134a(aVar);
            return aVar;
        } catch (Exception e) {
            C1709a.m3015b(f3174o, "offset result exception", e);
            C1744a aVar2 = new C1744a(this.f3183i, this.f3184j, 799, "", "", null, e);
            m3134a(aVar2);
            return aVar2;
        }
    }
}
